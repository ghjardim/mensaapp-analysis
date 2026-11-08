package org.apache.tika.mime;

import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXResult;
import org.apache.tika.exception.TikaException;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import p254i6.C4654i;
import p333r6.AbstractC6306f;
import p333r6.InterfaceC6304d;

/* loaded from: classes2.dex */
public class MimeTypesReader extends DefaultHandler implements MimeTypesReaderMetKeys {
    protected int priority;
    protected final MimeTypes types;
    private static final ReentrantReadWriteLock READ_WRITE_LOCK = new ReentrantReadWriteLock();
    private static int POOL_SIZE = 10;
    private static ArrayBlockingQueue<SAXParser> SAX_PARSERS = new ArrayBlockingQueue<>(POOL_SIZE);
    static InterfaceC6304d LOG = AbstractC6306f.m26394k(MimeTypesReader.class);
    protected MimeType type = null;
    protected StringBuilder characters = null;
    private ClauseRecord current = new ClauseRecord(null);

    public class ClauseRecord {
        private Clause clause;
        private final ClauseRecord parent;
        private List<Clause> subclauses = null;

        public ClauseRecord(Clause clause) {
            this.parent = MimeTypesReader.this.current;
            this.clause = clause;
        }

        public List<Clause> getClauses() {
            return this.subclauses;
        }

        public void stop() {
            Clause clause = this.clause;
            if (clause instanceof MinShouldMatchVal) {
                this.clause = new MinShouldMatchClause(((MinShouldMatchVal) clause).getVal(), this.subclauses);
            } else {
                List<Clause> list = this.subclauses;
                if (list != null) {
                    this.clause = new AndClause(this.clause, list.size() == 1 ? this.subclauses.get(0) : new OrClause(this.subclauses));
                }
            }
            ClauseRecord clauseRecord = this.parent;
            List<Clause> list2 = clauseRecord.subclauses;
            if (list2 == null) {
                clauseRecord.subclauses = Collections.singletonList(this.clause);
            } else {
                if (list2.size() == 1) {
                    this.parent.subclauses = new ArrayList(this.parent.subclauses);
                }
                this.parent.subclauses.add(this.clause);
            }
            MimeTypesReader mimeTypesReader = MimeTypesReader.this;
            mimeTypesReader.current = mimeTypesReader.current.parent;
        }
    }

    public static class MinShouldMatchVal implements Clause {
        private final int val;

        public MinShouldMatchVal(int i7) {
            this.val = i7;
        }

        @Override // org.apache.tika.mime.Clause
        public boolean eval(byte[] bArr) {
            throw new IllegalStateException("This should never be used on this placeholder class");
        }

        public int getVal() {
            return this.val;
        }

        @Override // org.apache.tika.mime.Clause
        public int size() {
            return 0;
        }
    }

    static {
        try {
            setPoolSize(POOL_SIZE);
        } catch (TikaException e7) {
            throw new RuntimeException("problem initializing SAXParser pool", e7);
        }
    }

    public MimeTypesReader(MimeTypes mimeTypes) {
        this.types = mimeTypes;
    }

    private static SAXParser acquireSAXParser() {
        SAXParser poll;
        do {
            try {
                try {
                    ReentrantReadWriteLock reentrantReadWriteLock = READ_WRITE_LOCK;
                    reentrantReadWriteLock.readLock().lock();
                    poll = SAX_PARSERS.poll(10L, TimeUnit.MILLISECONDS);
                    reentrantReadWriteLock.readLock().unlock();
                } catch (InterruptedException e7) {
                    throw new TikaException("interrupted while waiting for SAXParser", e7);
                }
            } catch (Throwable th) {
                READ_WRITE_LOCK.readLock().unlock();
                throw th;
            }
        } while (poll == null);
        return poll;
    }

    private static SAXParser newSAXParser() {
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        newInstance.setNamespaceAware(false);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (ParserConfigurationException | SAXException unused) {
            LOG.mo26380x("can't set secure processing feature on: " + newInstance.getClass() + ". User assumes responsibility for consequences.");
        }
        try {
            return newInstance.newSAXParser();
        } catch (ParserConfigurationException | SAXException e7) {
            throw new TikaException("Can't create new sax parser", e7);
        }
    }

    private static void releaseParser(SAXParser sAXParser) {
        try {
            sAXParser.reset();
        } catch (UnsupportedOperationException unused) {
        }
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = READ_WRITE_LOCK;
            reentrantReadWriteLock.readLock().lock();
            SAX_PARSERS.offer(sAXParser);
            reentrantReadWriteLock.readLock().unlock();
        } catch (Throwable th) {
            READ_WRITE_LOCK.readLock().unlock();
            throw th;
        }
    }

    public static void setPoolSize(int i7) {
        try {
            READ_WRITE_LOCK.writeLock().lock();
            SAX_PARSERS = new ArrayBlockingQueue<>(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                SAX_PARSERS.offer(newSAXParser());
            }
            POOL_SIZE = i7;
            READ_WRITE_LOCK.writeLock().unlock();
        } catch (Throwable th) {
            READ_WRITE_LOCK.writeLock().unlock();
            throw th;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i7, int i8) {
        StringBuilder sb = this.characters;
        if (sb != null) {
            sb.append(cArr, i7, i8);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        if (this.type != null) {
            if ("mime-type".equals(str3)) {
                this.type = null;
                return;
            }
            if (MimeTypesReaderMetKeys.COMMENT_TAG.equals(str3)) {
                this.type.setDescription(this.characters.toString().trim());
                this.characters = null;
                return;
            }
            if (MimeTypesReaderMetKeys.ACRONYM_TAG.equals(str3)) {
                this.type.setAcronym(this.characters.toString().trim());
                this.characters = null;
                return;
            }
            if (MimeTypesReaderMetKeys.TIKA_UTI_TAG.equals(str3)) {
                this.type.setUniformTypeIdentifier(this.characters.toString().trim());
                this.characters = null;
                return;
            }
            if (MimeTypesReaderMetKeys.TIKA_LINK_TAG.equals(str3)) {
                try {
                    this.type.addLink(new URI(this.characters.toString().trim()));
                    this.characters = null;
                    return;
                } catch (URISyntaxException e7) {
                    throw new IllegalArgumentException("unable to parse link: " + ((Object) this.characters), e7);
                }
            }
            if ("match".equals(str3)) {
                this.current.stop();
                return;
            }
            if (MimeTypesReaderMetKeys.MAGIC_TAG.equals(str3)) {
                for (Clause clause : this.current.getClauses()) {
                    MimeType mimeType = this.type;
                    mimeType.addMagic(new Magic(mimeType, this.priority, clause));
                }
                this.current = null;
            }
        }
    }

    public void handleGlobError(MimeType mimeType, String str, MimeTypeException mimeTypeException, String str2, Attributes attributes) {
        throw new SAXException(mimeTypeException);
    }

    public void handleMimeError(String str, MimeTypeException mimeTypeException, String str2, Attributes attributes) {
        throw new SAXException(mimeTypeException);
    }

    public void read(InputStream inputStream) {
        SAXParser sAXParser = null;
        try {
            try {
                sAXParser = acquireSAXParser();
                sAXParser.parse(inputStream, this);
                releaseParser(sAXParser);
            } catch (TikaException e7) {
                throw new MimeTypeException("Unable to create an XML parser", e7);
            } catch (SAXException e8) {
                throw new MimeTypeException("Invalid type configuration", e8);
            }
        } catch (Throwable th) {
            if (sAXParser != null) {
                releaseParser(sAXParser);
            }
            throw th;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.EntityResolver
    public InputSource resolveEntity(String str, String str2) {
        return new InputSource(new C4654i(new byte[0]));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (this.type == null) {
            if ("mime-type".equals(str3)) {
                String value = attributes.getValue("type");
                boolean equals = "true".equals(attributes.getValue(MimeTypesReaderMetKeys.INTERPRETED_ATTR));
                try {
                    MimeType forName = this.types.forName(value);
                    this.type = forName;
                    forName.setInterpreted(equals);
                    return;
                } catch (MimeTypeException e7) {
                    handleMimeError(value, e7, str3, attributes);
                    return;
                }
            }
            return;
        }
        if (MimeTypesReaderMetKeys.ALIAS_TAG.equals(str3)) {
            this.types.addAlias(this.type, MediaType.parse(attributes.getValue("type")));
            return;
        }
        if (MimeTypesReaderMetKeys.SUB_CLASS_OF_TAG.equals(str3)) {
            this.types.setSuperType(this.type, MediaType.parse(attributes.getValue("type")));
            return;
        }
        if (MimeTypesReaderMetKeys.ACRONYM_TAG.equals(str3) || MimeTypesReaderMetKeys.COMMENT_TAG.equals(str3) || MimeTypesReaderMetKeys.TIKA_LINK_TAG.equals(str3) || MimeTypesReaderMetKeys.TIKA_UTI_TAG.equals(str3)) {
            this.characters = new StringBuilder();
            return;
        }
        if (MimeTypesReaderMetKeys.GLOB_TAG.equals(str3)) {
            String value2 = attributes.getValue(MimeTypesReaderMetKeys.PATTERN_ATTR);
            String value3 = attributes.getValue(MimeTypesReaderMetKeys.ISREGEX_ATTR);
            if (value2 != null) {
                try {
                    this.types.addPattern(this.type, value2, Boolean.parseBoolean(value3));
                    return;
                } catch (MimeTypeException e8) {
                    handleGlobError(this.type, value2, e8, str3, attributes);
                    return;
                }
            }
            return;
        }
        if (MimeTypesReaderMetKeys.ROOT_XML_TAG.equals(str3)) {
            this.type.addRootXML(attributes.getValue(MimeTypesReaderMetKeys.NS_URI_ATTR), attributes.getValue(MimeTypesReaderMetKeys.LOCAL_NAME_ATTR));
            return;
        }
        if (!"match".equals(str3)) {
            if (MimeTypesReaderMetKeys.MAGIC_TAG.equals(str3)) {
                String value4 = attributes.getValue(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR);
                if (value4 == null || value4.length() <= 0) {
                    this.priority = 50;
                } else {
                    this.priority = Integer.parseInt(value4);
                }
                this.current = new ClauseRecord(null);
                return;
            }
            return;
        }
        if (attributes.getValue(MimeTypesReaderMetKeys.MATCH_MINSHOULDMATCH_ATTR) != null) {
            this.current = new ClauseRecord(new MinShouldMatchVal(Integer.parseInt(attributes.getValue(MimeTypesReaderMetKeys.MATCH_MINSHOULDMATCH_ATTR))));
            return;
        }
        String value5 = attributes.getValue("type");
        String value6 = attributes.getValue(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        String value7 = attributes.getValue(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        String value8 = attributes.getValue(MimeTypesReaderMetKeys.MATCH_MASK_ATTR);
        if (value5 == null) {
            value5 = "string";
        }
        this.current = new ClauseRecord(new MagicMatch(this.type.getType(), value5, value6, value7, value8));
    }

    public void read(Document document) {
        try {
            XMLReaderUtils.getTransformer().transform(new DOMSource(document), new SAXResult(this));
        } catch (TransformerException | TikaException e7) {
            throw new MimeTypeException("Failed to parse type registry", e7);
        }
    }
}
