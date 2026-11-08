package p187a4;

import com.google.android.gms.common.api.C3643a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: a4.b */
/* loaded from: classes.dex */
public abstract class AbstractC3135b {
    /* renamed from: a */
    public static byte[] m11444a(Queue queue, int i7) {
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
    public static InputStream m11445b(InputStream inputStream, long j7) {
        return new a(inputStream, j7);
    }

    /* renamed from: c */
    public static int m11446c(long j7) {
        if (j7 > 2147483647L) {
            return C3643a.e.API_PRIORITY_OTHER;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    /* renamed from: d */
    public static byte[] m11447d(InputStream inputStream) {
        return m11448e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    public static byte[] m11448e(InputStream inputStream, Queue queue, int i7) {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i7) * 2));
        while (i7 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i7);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i8 = 0;
            while (i8 < min2) {
                int read = inputStream.read(bArr, i8, min2 - i8);
                if (read == -1) {
                    return m11444a(queue, i7);
                }
                i8 += read;
                i7 += read;
            }
            min = m11446c(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return m11444a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: a4.b$a */
    public static final class a extends FilterInputStream {

        /* renamed from: a */
        public long f9688a;

        /* renamed from: b */
        public long f9689b;

        public a(InputStream inputStream, long j7) {
            super(inputStream);
            this.f9689b = -1L;
            this.f9688a = j7;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f9688a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i7) {
            ((FilterInputStream) this).in.mark(i7);
            this.f9689b = this.f9688a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f9688a == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f9688a--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f9689b == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f9688a = this.f9689b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j7) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j7, this.f9688a));
            this.f9688a -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) {
            long j7 = this.f9688a;
            if (j7 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i7, (int) Math.min(i8, j7));
            if (read != -1) {
                this.f9688a -= read;
            }
            return read;
        }
    }
}
