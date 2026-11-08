package p186a3;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import p171Y2.AbstractC2932o;
import p195b3.AbstractC3524d;

/* renamed from: a3.b */
/* loaded from: classes.dex */
public abstract class AbstractC3107b {

    /* renamed from: a */
    public static final OutputStream f9607a = new a();

    /* renamed from: a3.b$a */
    public class a extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            AbstractC2932o.m10572o(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) {
            AbstractC2932o.m10572o(bArr);
            AbstractC2932o.m10577t(i7, i8 + i7, bArr.length);
        }
    }

    /* renamed from: a */
    public static byte[] m11349a(Queue queue, int i7) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i7) {
            return bArr;
        }
        int length = i7 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i7);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i7 - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static long m11350b(InputStream inputStream, OutputStream outputStream) {
        AbstractC2932o.m10572o(inputStream);
        AbstractC2932o.m10572o(outputStream);
        byte[] m11351c = m11351c();
        long j7 = 0;
        while (true) {
            int read = inputStream.read(m11351c);
            if (read == -1) {
                return j7;
            }
            outputStream.write(m11351c, 0, read);
            j7 += read;
        }
    }

    /* renamed from: c */
    public static byte[] m11351c() {
        return new byte[8192];
    }

    /* renamed from: d */
    public static byte[] m11352d(InputStream inputStream) {
        AbstractC2932o.m10572o(inputStream);
        return m11353e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    public static byte[] m11353e(InputStream inputStream, Queue queue, int i7) {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i7) * 2));
        while (i7 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i7);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i8 = 0;
            while (i8 < min2) {
                int read = inputStream.read(bArr, i8, min2 - i8);
                if (read == -1) {
                    return m11349a(queue, i7);
                }
                i8 += read;
                i7 += read;
            }
            min = AbstractC3524d.m14164g(min, min < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return m11349a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
