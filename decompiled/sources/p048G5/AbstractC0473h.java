package p048G5;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: G5.h */
/* loaded from: classes2.dex */
public abstract class AbstractC0473h {
    /* renamed from: a */
    public static final long m1720a(Reader reader, Writer out, int i7) {
        AbstractC5469l.m23028e(reader, "<this>");
        AbstractC5469l.m23028e(out, "out");
        char[] cArr = new char[i7];
        int read = reader.read(cArr);
        long j7 = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j7 += read;
            read = reader.read(cArr);
        }
        return j7;
    }

    /* renamed from: b */
    public static /* synthetic */ long m1721b(Reader reader, Writer writer, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 8192;
        }
        return m1720a(reader, writer, i7);
    }

    /* renamed from: c */
    public static final String m1722c(Reader reader) {
        AbstractC5469l.m23028e(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m1721b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        AbstractC5469l.m23027d(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
