package org.apache.tika.parser;

import java.io.InputStream;
import java.util.Iterator;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.sax.TeeContentHandler;
import org.apache.tika.utils.RegexUtils;
import org.xml.sax.ContentHandler;

/* loaded from: classes2.dex */
public class ParserPostProcessor extends ParserDecorator {
    public ParserPostProcessor(Parser parser) {
        super(parser);
    }

    @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
        BodyContentHandler bodyContentHandler = new BodyContentHandler();
        super.parse(inputStream, new TeeContentHandler(contentHandler, bodyContentHandler), metadata, parseContext);
        String obj = bodyContentHandler.toString();
        metadata.set("fulltext", obj);
        metadata.set("summary", obj.substring(0, Math.min(obj.length(), 500)));
        Iterator<String> it = RegexUtils.extractLinks(obj).iterator();
        while (it.hasNext()) {
            metadata.add("outlinks", it.next());
        }
    }
}
