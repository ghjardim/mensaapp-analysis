package org.apache.tika.sax;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.tika.parser.ParseContext;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes2.dex */
public class BasicContentHandlerFactory implements ContentHandlerFactory, WriteLimiter {
    private final ParseContext parseContext;
    private final boolean throwOnWriteLimitReached;
    private final HANDLER_TYPE type;
    private final int writeLimit;

    /* renamed from: org.apache.tika.sax.BasicContentHandlerFactory$1 */
    public static /* synthetic */ class C60221 {

        /* renamed from: $SwitchMap$org$apache$tika$sax$BasicContentHandlerFactory$HANDLER_TYPE */
        static final /* synthetic */ int[] f21464xc235400b;

        static {
            int[] iArr = new int[HANDLER_TYPE.values().length];
            f21464xc235400b = iArr;
            try {
                iArr[HANDLER_TYPE.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21464xc235400b[HANDLER_TYPE.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21464xc235400b[HANDLER_TYPE.XML.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21464xc235400b[HANDLER_TYPE.BODY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum HANDLER_TYPE {
        BODY,
        IGNORE,
        TEXT,
        HTML,
        XML
    }

    public BasicContentHandlerFactory(HANDLER_TYPE handler_type, int i7) {
        this(handler_type, i7, true, null);
    }

    private ContentHandler getFormatHandler() {
        int i7 = C60221.f21464xc235400b[this.type.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? new ToTextContentHandler() : new ToXMLContentHandler() : new ToHTMLContentHandler() : new ToTextContentHandler();
    }

    public static HANDLER_TYPE parseHandlerType(String str, HANDLER_TYPE handler_type) {
        if (str == null) {
            return handler_type;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return handler_type;
    }

    @Override // org.apache.tika.sax.ContentHandlerFactory
    public ContentHandler getNewContentHandler() {
        HANDLER_TYPE handler_type = this.type;
        if (handler_type == HANDLER_TYPE.BODY) {
            return new BodyContentHandler(new WriteOutContentHandler(new ToTextContentHandler(), this.writeLimit, this.throwOnWriteLimitReached, this.parseContext));
        }
        if (handler_type == HANDLER_TYPE.IGNORE) {
            return new DefaultHandler();
        }
        ContentHandler formatHandler = getFormatHandler();
        return this.writeLimit < 0 ? formatHandler : new WriteOutContentHandler(formatHandler, this.writeLimit, this.throwOnWriteLimitReached, this.parseContext);
    }

    public HANDLER_TYPE getType() {
        return this.type;
    }

    @Override // org.apache.tika.sax.WriteLimiter
    public int getWriteLimit() {
        return this.writeLimit;
    }

    @Override // org.apache.tika.sax.WriteLimiter
    public boolean isThrowOnWriteLimitReached() {
        return this.throwOnWriteLimitReached;
    }

    public BasicContentHandlerFactory(HANDLER_TYPE handler_type, int i7, boolean z6, ParseContext parseContext) {
        this.type = handler_type;
        this.writeLimit = i7;
        this.throwOnWriteLimitReached = z6;
        this.parseContext = parseContext;
        if (!z6 && parseContext == null) {
            throw new IllegalArgumentException("parse context must not be null if throwOnWriteLimitReached is false");
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerFactory
    public ContentHandler getNewContentHandler(OutputStream outputStream, Charset charset) {
        HANDLER_TYPE handler_type = this.type;
        if (handler_type == HANDLER_TYPE.IGNORE) {
            return new DefaultHandler();
        }
        try {
            if (this.writeLimit > -1) {
                int i7 = C60221.f21464xc235400b[handler_type.ordinal()];
                if (i7 == 1) {
                    return new WriteOutContentHandler(new ToTextContentHandler(outputStream, charset.name()), this.writeLimit);
                }
                if (i7 == 2) {
                    return new WriteOutContentHandler(new ToHTMLContentHandler(outputStream, charset.name()), this.writeLimit);
                }
                if (i7 == 3) {
                    return new WriteOutContentHandler(new ToXMLContentHandler(outputStream, charset.name()), this.writeLimit);
                }
                if (i7 != 4) {
                    return new WriteOutContentHandler(new ToTextContentHandler(outputStream, charset.name()), this.writeLimit);
                }
                return new WriteOutContentHandler(new BodyContentHandler(new OutputStreamWriter(outputStream, charset)), this.writeLimit);
            }
            int i8 = C60221.f21464xc235400b[handler_type.ordinal()];
            if (i8 == 1) {
                return new ToTextContentHandler(outputStream, charset.name());
            }
            if (i8 == 2) {
                return new ToHTMLContentHandler(outputStream, charset.name());
            }
            if (i8 == 3) {
                return new ToXMLContentHandler(outputStream, charset.name());
            }
            if (i8 != 4) {
                return new ToTextContentHandler(outputStream, charset.name());
            }
            return new BodyContentHandler(new OutputStreamWriter(outputStream, charset));
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("couldn't find charset for name: " + charset);
        }
    }
}
