package p048G5;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: G5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC0466a {
    /* renamed from: a */
    public static final long m1712a(InputStream inputStream, OutputStream out, int i7) {
        AbstractC5469l.m23028e(inputStream, "<this>");
        AbstractC5469l.m23028e(out, "out");
        byte[] bArr = new byte[i7];
        int read = inputStream.read(bArr);
        long j7 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j7 += read;
            read = inputStream.read(bArr);
        }
        return j7;
    }

    /* renamed from: b */
    public static /* synthetic */ long m1713b(InputStream inputStream, OutputStream outputStream, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 8192;
        }
        return m1712a(inputStream, outputStream, i7);
    }

    /* renamed from: c */
    public static final byte[] m1714c(InputStream inputStream) {
        AbstractC5469l.m23028e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m1713b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC5469l.m23027d(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
