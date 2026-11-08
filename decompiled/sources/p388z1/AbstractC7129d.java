package p388z1;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.apache.tika.fork.ForkServer;

/* renamed from: z1.d */
/* loaded from: classes.dex */
public abstract class AbstractC7129d {
    /* renamed from: a */
    public static int m29377a(int i7) {
        return ((i7 + 7) & (-8)) / 8;
    }

    /* renamed from: b */
    public static byte[] m29378b(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: c */
    public static RuntimeException m29379c(String str) {
        return new IllegalStateException(str);
    }

    /* renamed from: d */
    public static byte[] m29380d(InputStream inputStream, int i7) {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int read = inputStream.read(bArr, i8, i7 - i8);
            if (read < 0) {
                throw m29379c("Not enough bytes to read: " + i7);
            }
            i8 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        throw m29379c("Inflater did not finish");
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m29381e(java.io.InputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L55
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L55
            if (r4 >= r9) goto L55
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3a
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L86
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.RuntimeException r8 = m29379c(r8)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L3a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.RuntimeException r8 = m29379c(r8)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L55:
            if (r4 != r9) goto L68
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L61
            r0.end()
            return r1
        L61:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.RuntimeException r8 = m29379c(r8)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L68:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.RuntimeException r8 = m29379c(r8)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L86:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p388z1.AbstractC7129d.m29381e(java.io.InputStream, int, int):byte[]");
    }

    /* renamed from: f */
    public static String m29382f(InputStream inputStream, int i7) {
        return new String(m29380d(inputStream, i7), StandardCharsets.UTF_8);
    }

    /* renamed from: g */
    public static long m29383g(InputStream inputStream, int i7) {
        byte[] m29380d = m29380d(inputStream, i7);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 += (m29380d[i8] & ForkServer.ERROR) << (i8 * 8);
        }
        return j7;
    }

    /* renamed from: h */
    public static int m29384h(InputStream inputStream) {
        return (int) m29383g(inputStream, 2);
    }

    /* renamed from: i */
    public static long m29385i(InputStream inputStream) {
        return m29383g(inputStream, 4);
    }

    /* renamed from: j */
    public static int m29386j(InputStream inputStream) {
        return (int) m29383g(inputStream, 1);
    }

    /* renamed from: k */
    public static int m29387k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* renamed from: l */
    public static void m29388l(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* renamed from: m */
    public static void m29389m(OutputStream outputStream, byte[] bArr) {
        m29393q(outputStream, bArr.length);
        byte[] m29378b = m29378b(bArr);
        m29393q(outputStream, m29378b.length);
        outputStream.write(m29378b);
    }

    /* renamed from: n */
    public static void m29390n(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: o */
    public static void m29391o(OutputStream outputStream, long j7, int i7) {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j7 >> (i8 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* renamed from: p */
    public static void m29392p(OutputStream outputStream, int i7) {
        m29391o(outputStream, i7, 2);
    }

    /* renamed from: q */
    public static void m29393q(OutputStream outputStream, long j7) {
        m29391o(outputStream, j7, 4);
    }

    /* renamed from: r */
    public static void m29394r(OutputStream outputStream, int i7) {
        m29391o(outputStream, i7, 1);
    }
}
