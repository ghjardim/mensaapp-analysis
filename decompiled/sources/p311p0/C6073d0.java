package p311p0;

import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p240h0.AbstractC4478d;
import p240h0.InterfaceC4476b;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: p0.d0 */
/* loaded from: classes.dex */
public final class C6073d0 extends AbstractC4478d {

    /* renamed from: i */
    public final float f21694i;

    /* renamed from: j */
    public final short f21695j;

    /* renamed from: k */
    public final int f21696k;

    /* renamed from: l */
    public final long f21697l;

    /* renamed from: m */
    public final long f21698m;

    /* renamed from: n */
    public int f21699n;

    /* renamed from: o */
    public boolean f21700o;

    /* renamed from: p */
    public int f21701p;

    /* renamed from: q */
    public long f21702q;

    /* renamed from: r */
    public int f21703r;

    /* renamed from: s */
    public byte[] f21704s;

    /* renamed from: t */
    public int f21705t;

    /* renamed from: u */
    public int f21706u;

    /* renamed from: v */
    public byte[] f21707v;

    public C6073d0() {
        this(PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH, 0.2f, 2000000L, 10, (short) 1024);
    }

    /* renamed from: B */
    public static void m25332B(byte[] bArr, int i7, int i8) {
        if (i8 >= 32767) {
            bArr[i7] = -1;
            bArr[i7 + 1] = Byte.MAX_VALUE;
        } else if (i8 <= -32768) {
            bArr[i7] = 0;
            bArr[i7 + 1] = Byte.MIN_VALUE;
        } else {
            bArr[i7] = (byte) (i8 & 255);
            bArr[i7 + 1] = (byte) (i8 >> 8);
        }
    }

    /* renamed from: E */
    public static int m25333E(byte b7, byte b8) {
        return (b7 << 8) | (b8 & ForkServer.ERROR);
    }

    /* renamed from: A */
    public final void m25334A(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f21704s.length));
        int m25343r = m25343r(byteBuffer);
        if (m25343r == byteBuffer.position()) {
            this.f21701p = 1;
        } else {
            byteBuffer.limit(Math.min(m25343r, byteBuffer.capacity()));
            m25348w(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: C */
    public void m25335C(boolean z6) {
        this.f21700o = z6;
    }

    /* renamed from: D */
    public final void m25336D(ByteBuffer byteBuffer) {
        int i7;
        int i8;
        AbstractC5332a.m21802g(this.f21705t < this.f21704s.length);
        int limit = byteBuffer.limit();
        int m25344s = m25344s(byteBuffer);
        int position = m25344s - byteBuffer.position();
        int i9 = this.f21705t;
        int i10 = this.f21706u;
        int i11 = i9 + i10;
        byte[] bArr = this.f21704s;
        if (i11 < bArr.length) {
            i7 = bArr.length - (i10 + i9);
            i8 = i9 + i10;
        } else {
            int length = i10 - (bArr.length - i9);
            i7 = i9 - length;
            i8 = length;
        }
        boolean z6 = m25344s < limit;
        int min = Math.min(position, i7);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f21704s, i8, min);
        int i12 = this.f21706u + min;
        this.f21706u = i12;
        AbstractC5332a.m21802g(i12 <= this.f21704s.length);
        boolean z7 = z6 && position < i7;
        m25350y(z7);
        if (z7) {
            this.f21701p = 0;
            this.f21703r = 0;
        }
        byteBuffer.limit(limit);
    }

    @Override // p240h0.InterfaceC4476b
    /* renamed from: b */
    public void mo19056b(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m19065f()) {
            int i7 = this.f21701p;
            if (i7 == 0) {
                m25334A(byteBuffer);
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException();
                }
                m25336D(byteBuffer);
            }
        }
    }

    @Override // p240h0.AbstractC4478d
    /* renamed from: g */
    public InterfaceC4476b.a mo19066g(InterfaceC4476b.a aVar) {
        if (aVar.f15930c == 2) {
            return aVar.f15928a == -1 ? InterfaceC4476b.a.f15927e : aVar;
        }
        throw new InterfaceC4476b.b(aVar);
    }

    @Override // p240h0.AbstractC4478d
    /* renamed from: h */
    public void mo19067h() {
        if (isActive()) {
            this.f21699n = this.f15933b.f15929b * 2;
            int m25338m = m25338m(m25342q(this.f21697l) / 2) * 2;
            if (this.f21704s.length != m25338m) {
                this.f21704s = new byte[m25338m];
                this.f21707v = new byte[m25338m];
            }
        }
        this.f21701p = 0;
        this.f21702q = 0L;
        this.f21703r = 0;
        this.f21705t = 0;
        this.f21706u = 0;
    }

    @Override // p240h0.AbstractC4478d
    /* renamed from: i */
    public void mo19068i() {
        if (this.f21706u > 0) {
            m25350y(true);
            this.f21703r = 0;
        }
    }

    @Override // p240h0.AbstractC4478d, p240h0.InterfaceC4476b
    public boolean isActive() {
        return super.isActive() && this.f21700o;
    }

    @Override // p240h0.AbstractC4478d
    /* renamed from: j */
    public void mo19069j() {
        this.f21700o = false;
        byte[] bArr = AbstractC5330M.f18805f;
        this.f21704s = bArr;
        this.f21707v = bArr;
    }

    /* renamed from: l */
    public final int m25337l(float f7) {
        return m25338m((int) f7);
    }

    /* renamed from: m */
    public final int m25338m(int i7) {
        int i8 = this.f21699n;
        return (i7 / i8) * i8;
    }

    /* renamed from: n */
    public final int m25339n(int i7, int i8) {
        int i9 = this.f21696k;
        return i9 + ((((100 - i9) * (i7 * PipesIterator.DEFAULT_QUEUE_SIZE)) / i8) / PipesIterator.DEFAULT_QUEUE_SIZE);
    }

    /* renamed from: o */
    public final int m25340o(int i7, int i8) {
        return (((this.f21696k - 100) * ((i7 * PipesIterator.DEFAULT_QUEUE_SIZE) / i8)) / PipesIterator.DEFAULT_QUEUE_SIZE) + 100;
    }

    /* renamed from: p */
    public final int m25341p(int i7) {
        int m25342q = ((m25342q(this.f21698m) - this.f21703r) * this.f21699n) - (this.f21704s.length / 2);
        AbstractC5332a.m21802g(m25342q >= 0);
        return m25337l(Math.min((i7 * this.f21694i) + 0.5f, m25342q));
    }

    /* renamed from: q */
    public final int m25342q(long j7) {
        return (int) ((j7 * this.f15933b.f15928a) / 1000000);
    }

    /* renamed from: r */
    public final int m25343r(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (m25346u(byteBuffer.get(limit), byteBuffer.get(limit - 1))) {
                int i7 = this.f21699n;
                return ((limit / i7) * i7) + i7;
            }
        }
        return byteBuffer.position();
    }

    /* renamed from: s */
    public final int m25344s(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (m25346u(byteBuffer.get(position), byteBuffer.get(position - 1))) {
                int i7 = this.f21699n;
                return i7 * (position / i7);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: t */
    public long m25345t() {
        return this.f21702q;
    }

    /* renamed from: u */
    public final boolean m25346u(byte b7, byte b8) {
        return Math.abs(m25333E(b7, b8)) > this.f21695j;
    }

    /* renamed from: v */
    public final void m25347v(byte[] bArr, int i7, int i8) {
        if (i8 == 3) {
            return;
        }
        for (int i9 = 0; i9 < i7; i9 += 2) {
            m25332B(bArr, i9, (m25333E(bArr[i9 + 1], bArr[i9]) * (i8 == 0 ? m25340o(i9, i7 - 1) : i8 == 2 ? m25339n(i9, i7 - 1) : this.f21696k)) / 100);
        }
    }

    /* renamed from: w */
    public final void m25348w(ByteBuffer byteBuffer) {
        m19070k(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    /* renamed from: x */
    public final void m25349x(byte[] bArr, int i7, int i8) {
        AbstractC5332a.m21797b(i7 % this.f21699n == 0, "byteOutput size is not aligned to frame size " + i7);
        m25347v(bArr, i7, i8);
        m19070k(i7).put(bArr, 0, i7).flip();
    }

    /* renamed from: y */
    public final void m25350y(boolean z6) {
        int length;
        int m25341p;
        int i7 = this.f21706u;
        byte[] bArr = this.f21704s;
        if (i7 == bArr.length || z6) {
            if (this.f21703r == 0) {
                if (z6) {
                    m25351z(i7, 3);
                    length = i7;
                } else {
                    AbstractC5332a.m21802g(i7 >= bArr.length / 2);
                    length = this.f21704s.length / 2;
                    m25351z(length, 0);
                }
                m25341p = length;
            } else if (z6) {
                int length2 = i7 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int m25341p2 = m25341p(length2) + (this.f21704s.length / 2);
                m25351z(m25341p2, 2);
                m25341p = m25341p2;
                length = length3;
            } else {
                length = i7 - (bArr.length / 2);
                m25341p = m25341p(length);
                m25351z(m25341p, 1);
            }
            AbstractC5332a.m21803h(length % this.f21699n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            AbstractC5332a.m21802g(i7 >= m25341p);
            this.f21706u -= length;
            int i8 = this.f21705t + length;
            this.f21705t = i8;
            this.f21705t = i8 % this.f21704s.length;
            this.f21703r = this.f21703r + (m25341p / this.f21699n);
            this.f21702q += (length - m25341p) / r2;
        }
    }

    /* renamed from: z */
    public final void m25351z(int i7, int i8) {
        if (i7 == 0) {
            return;
        }
        AbstractC5332a.m21796a(this.f21706u >= i7);
        if (i8 == 2) {
            int i9 = this.f21705t;
            int i10 = this.f21706u;
            int i11 = i9 + i10;
            byte[] bArr = this.f21704s;
            if (i11 <= bArr.length) {
                System.arraycopy(bArr, (i9 + i10) - i7, this.f21707v, 0, i7);
            } else {
                int length = i10 - (bArr.length - i9);
                if (length >= i7) {
                    System.arraycopy(bArr, length - i7, this.f21707v, 0, i7);
                } else {
                    int i12 = i7 - length;
                    System.arraycopy(bArr, bArr.length - i12, this.f21707v, 0, i12);
                    System.arraycopy(this.f21704s, 0, this.f21707v, i12, length);
                }
            }
        } else {
            int i13 = this.f21705t;
            int i14 = i13 + i7;
            byte[] bArr2 = this.f21704s;
            if (i14 <= bArr2.length) {
                System.arraycopy(bArr2, i13, this.f21707v, 0, i7);
            } else {
                int length2 = bArr2.length - i13;
                System.arraycopy(bArr2, i13, this.f21707v, 0, length2);
                System.arraycopy(this.f21704s, 0, this.f21707v, length2, i7 - length2);
            }
        }
        AbstractC5332a.m21797b(i7 % this.f21699n == 0, "sizeToOutput is not aligned to frame size: " + i7);
        AbstractC5332a.m21802g(this.f21705t < this.f21704s.length);
        m25349x(this.f21707v, i7, i8);
    }

    public C6073d0(long j7, float f7, long j8, int i7, short s7) {
        boolean z6 = false;
        this.f21703r = 0;
        this.f21705t = 0;
        this.f21706u = 0;
        if (f7 >= 0.0f && f7 <= 1.0f) {
            z6 = true;
        }
        AbstractC5332a.m21796a(z6);
        this.f21697l = j7;
        this.f21694i = f7;
        this.f21698m = j8;
        this.f21696k = i7;
        this.f21695j = s7;
        byte[] bArr = AbstractC5330M.f18805f;
        this.f21704s = bArr;
        this.f21707v = bArr;
    }
}
