package org.apache.tika.sax;

import java.util.Arrays;
import java.util.Iterator;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes2.dex */
public class StandardsExtractingContentHandler extends ContentHandlerDecorator {
    public static final String STANDARD_REFERENCES = "standard_references";
    private int maxBufferLength;
    private final Metadata metadata;
    private final StringBuilder stringBuilder;
    private double threshold;

    public StandardsExtractingContentHandler(ContentHandler contentHandler, Metadata metadata) {
        super(contentHandler);
        this.maxBufferLength = 100000;
        this.threshold = 0.0d;
        this.metadata = metadata;
        this.stringBuilder = new StringBuilder();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i7, int i8) {
        int length;
        try {
            int i9 = this.maxBufferLength;
            if (i9 > -1 && (length = i9 - this.stringBuilder.length()) <= i8) {
                i8 = length;
            }
            this.stringBuilder.append(new String(Arrays.copyOfRange(cArr, i7, i7 + i8)));
            super.characters(cArr, i7, i8);
        } catch (SAXException e7) {
            handleException(e7);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() {
        super.endDocument();
        Iterator<StandardReference> it = StandardsText.extractStandardReferences(this.stringBuilder.toString(), this.threshold).iterator();
        while (it.hasNext()) {
            this.metadata.add(STANDARD_REFERENCES, it.next().toString());
        }
    }

    public double getThreshold() {
        return this.threshold;
    }

    public void setMaxBufferLength(int i7) {
        this.maxBufferLength = i7;
    }

    public void setThreshold(double d7) {
        this.threshold = d7;
    }

    public StandardsExtractingContentHandler() {
        this(new DefaultHandler(), new Metadata());
    }
}
