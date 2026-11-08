package p253i5;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import org.apache.tika.fork.ForkServer;
import p171Y2.AbstractC2932o;
import p237g5.InterfaceC4416Q;

/* renamed from: i5.A0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4546A0 {

    /* renamed from: a */
    public static final InterfaceC4645z0 f16262a = new c(new byte[0]);

    /* renamed from: i5.A0$c */
    public static class c extends AbstractC4596b {

        /* renamed from: a */
        public int f16264a;

        /* renamed from: b */
        public final int f16265b;

        /* renamed from: c */
        public final byte[] f16266c;

        /* renamed from: d */
        public int f16267d;

        public c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // p253i5.InterfaceC4645z0
        /* renamed from: Q */
        public void mo19333Q(byte[] bArr, int i7, int i8) {
            System.arraycopy(this.f16266c, this.f16264a, bArr, i7, i8);
            this.f16264a += i8;
        }

        @Override // p253i5.AbstractC4596b, p253i5.InterfaceC4645z0
        /* renamed from: V */
        public void mo19334V() {
            this.f16267d = this.f16264a;
        }

        @Override // p253i5.InterfaceC4645z0
        /* renamed from: b */
        public int mo19335b() {
            return this.f16265b - this.f16264a;
        }

        @Override // p253i5.InterfaceC4645z0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c mo19339u(int i7) {
            m19793a(i7);
            int i8 = this.f16264a;
            this.f16264a = i8 + i7;
            return new c(this.f16266c, i8, i7);
        }

        @Override // p253i5.InterfaceC4645z0
        /* renamed from: h0 */
        public void mo19337h0(OutputStream outputStream, int i7) {
            m19793a(i7);
            outputStream.write(this.f16266c, this.f16264a, i7);
            this.f16264a += i7;
        }

        @Override // p253i5.AbstractC4596b, p253i5.InterfaceC4645z0
        public boolean markSupported() {
            return true;
        }

        @Override // p253i5.InterfaceC4645z0
        public int readUnsignedByte() {
            m19793a(1);
            byte[] bArr = this.f16266c;
            int i7 = this.f16264a;
            this.f16264a = i7 + 1;
            return bArr[i7] & ForkServer.ERROR;
        }

        @Override // p253i5.AbstractC4596b, p253i5.InterfaceC4645z0
        public void reset() {
            int i7 = this.f16267d;
            if (i7 == -1) {
                throw new InvalidMarkException();
            }
            this.f16264a = i7;
        }

        @Override // p253i5.InterfaceC4645z0
        public void skipBytes(int i7) {
            m19793a(i7);
            this.f16264a += i7;
        }

        @Override // p253i5.InterfaceC4645z0
        /* renamed from: t0 */
        public void mo19338t0(ByteBuffer byteBuffer) {
            AbstractC2932o.m10573p(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            m19793a(remaining);
            byteBuffer.put(this.f16266c, this.f16264a, remaining);
            this.f16264a += remaining;
        }

        public c(byte[] bArr, int i7, int i8) {
            this.f16267d = -1;
            AbstractC2932o.m10562e(i7 >= 0, "offset must be >= 0");
            AbstractC2932o.m10562e(i8 >= 0, "length must be >= 0");
            int i9 = i8 + i7;
            AbstractC2932o.m10562e(i9 <= bArr.length, "offset + length exceeds array boundary");
            this.f16266c = (byte[]) AbstractC2932o.m10573p(bArr, "bytes");
            this.f16264a = i7;
            this.f16265b = i9;
        }
    }

    /* renamed from: a */
    public static InterfaceC4645z0 m19327a() {
        return f16262a;
    }

    /* renamed from: b */
    public static InterfaceC4645z0 m19328b(InterfaceC4645z0 interfaceC4645z0) {
        return new a(interfaceC4645z0);
    }

    /* renamed from: c */
    public static InputStream m19329c(InterfaceC4645z0 interfaceC4645z0, boolean z6) {
        if (!z6) {
            interfaceC4645z0 = m19328b(interfaceC4645z0);
        }
        return new b(interfaceC4645z0);
    }

    /* renamed from: d */
    public static byte[] m19330d(InterfaceC4645z0 interfaceC4645z0) {
        AbstractC2932o.m10573p(interfaceC4645z0, "buffer");
        int mo19335b = interfaceC4645z0.mo19335b();
        byte[] bArr = new byte[mo19335b];
        interfaceC4645z0.mo19333Q(bArr, 0, mo19335b);
        return bArr;
    }

    /* renamed from: e */
    public static String m19331e(InterfaceC4645z0 interfaceC4645z0, Charset charset) {
        AbstractC2932o.m10573p(charset, "charset");
        return new String(m19330d(interfaceC4645z0), charset);
    }

    /* renamed from: f */
    public static InterfaceC4645z0 m19332f(byte[] bArr, int i7, int i8) {
        return new c(bArr, i7, i8);
    }

    /* renamed from: i5.A0$b */
    public static final class b extends InputStream implements InterfaceC4416Q {

        /* renamed from: a */
        public InterfaceC4645z0 f16263a;

        public b(InterfaceC4645z0 interfaceC4645z0) {
            this.f16263a = (InterfaceC4645z0) AbstractC2932o.m10573p(interfaceC4645z0, "buffer");
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f16263a.mo19335b();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f16263a.close();
        }

        @Override // java.io.InputStream
        public void mark(int i7) {
            this.f16263a.mo19334V();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f16263a.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f16263a.mo19335b() == 0) {
                return -1;
            }
            return this.f16263a.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f16263a.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j7) {
            int min = (int) Math.min(this.f16263a.mo19335b(), j7);
            this.f16263a.skipBytes(min);
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) {
            if (this.f16263a.mo19335b() == 0) {
                return -1;
            }
            int min = Math.min(this.f16263a.mo19335b(), i8);
            this.f16263a.mo19333Q(bArr, i7, min);
            return min;
        }
    }

    /* renamed from: i5.A0$a */
    public class a extends AbstractC4573O {
        public a(InterfaceC4645z0 interfaceC4645z0) {
            super(interfaceC4645z0);
        }

        @Override // p253i5.InterfaceC4645z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
