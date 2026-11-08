package p048G5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5469l;
import p371w5.C6934q;
import p378x5.AbstractC7019j;

/* renamed from: G5.e */
/* loaded from: classes2.dex */
public abstract class AbstractC0470e extends AbstractC0469d {
    /* renamed from: a */
    public static byte[] m1717a(File file) {
        AbstractC5469l.m23028e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i7 = (int) length;
            byte[] bArr = new byte[i7];
            int i8 = i7;
            int i9 = 0;
            while (i8 > 0) {
                int read = fileInputStream.read(bArr, i9, i8);
                if (read < 0) {
                    break;
                }
                i8 -= read;
                i9 += read;
            }
            if (i8 > 0) {
                bArr = Arrays.copyOf(bArr, i9);
                AbstractC5469l.m23027d(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    C0468c c0468c = new C0468c(8193);
                    c0468c.write(read2);
                    AbstractC0466a.m1713b(fileInputStream, c0468c, 0, 2, null);
                    int size = c0468c.size() + i7;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] m1716a = c0468c.m1716a();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    AbstractC5469l.m23027d(copyOf, "copyOf(...)");
                    bArr = AbstractC7019j.m28794d(m1716a, copyOf, i7, 0, c0468c.size());
                }
            }
            AbstractC0467b.m1715a(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0467b.m1715a(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static void m1718b(File file, byte[] array) {
        AbstractC5469l.m23028e(file, "<this>");
        AbstractC5469l.m23028e(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            C6934q c6934q = C6934q.f24811a;
            AbstractC0467b.m1715a(fileOutputStream, null);
        } finally {
        }
    }
}
