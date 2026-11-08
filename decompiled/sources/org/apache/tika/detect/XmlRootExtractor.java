package org.apache.tika.detect;

import java.io.CharConversionException;
import java.io.InputStream;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.utils.XMLReaderUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import p254i6.C4646a;
import p254i6.C4654i;

/* loaded from: classes2.dex */
public class XmlRootExtractor {
    private static final ParseContext EMPTY_CONTEXT = new ParseContext();

    public static class ExtractorHandler extends DefaultHandler {
        private QName rootElement;

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            this.rootElement = new QName(str, str2);
            throw new SAXException("Aborting: root element received");
        }

        private ExtractorHandler() {
            this.rootElement = null;
        }
    }

    public static class MalformedCharException extends RuntimeException {
        public MalformedCharException(Exception exc) {
            super(exc);
        }
    }

    public QName extractRootElement(byte[] bArr) {
        while (true) {
            try {
                return extractRootElement(new C4654i(bArr), true);
            } catch (MalformedCharException unused) {
                int length = bArr.length / 2;
                if (length % 2 == 1) {
                    length--;
                }
                if (length <= 0) {
                    return null;
                }
                bArr = Arrays.copyOf(bArr, length);
            }
        }
    }

    public QName extractRootElement(InputStream inputStream) {
        return extractRootElement(inputStream, false);
    }

    private QName extractRootElement(InputStream inputStream, boolean z6) {
        ExtractorHandler extractorHandler = new ExtractorHandler();
        try {
            XMLReaderUtils.parseSAX(C4646a.m20176a(inputStream), extractorHandler, EMPTY_CONTEXT);
        } catch (SecurityException e7) {
            throw e7;
        } catch (Exception e8) {
            if (z6 && ((e8 instanceof CharConversionException) || (e8.getCause() instanceof CharConversionException))) {
                throw new MalformedCharException(e8);
            }
        }
        return extractorHandler.rootElement;
    }
}
