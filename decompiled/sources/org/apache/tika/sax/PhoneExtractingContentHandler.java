package org.apache.tika.sax;

import java.util.Arrays;
import java.util.Iterator;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes2.dex */
public class PhoneExtractingContentHandler extends ContentHandlerDecorator {
    private static final String PHONE_NUMBERS = "phonenumbers";
    private final Metadata metadata;
    private final StringBuilder stringBuilder;

    public PhoneExtractingContentHandler(ContentHandler contentHandler, Metadata metadata) {
        super(contentHandler);
        this.metadata = metadata;
        this.stringBuilder = new StringBuilder();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i7, int i8) {
        try {
            this.stringBuilder.append(new String(Arrays.copyOfRange(cArr, i7, i7 + i8)));
            super.characters(cArr, i7, i8);
        } catch (SAXException e7) {
            handleException(e7);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() {
        super.endDocument();
        Iterator<String> it = CleanPhoneText.extractPhoneNumbers(this.stringBuilder.toString()).iterator();
        while (it.hasNext()) {
            this.metadata.add(PHONE_NUMBERS, it.next());
        }
    }

    public PhoneExtractingContentHandler() {
        this(new DefaultHandler(), new Metadata());
    }
}
