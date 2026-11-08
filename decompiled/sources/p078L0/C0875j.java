package p078L0;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p232g0.AbstractC4332v;
import p232g0.InterfaceC4319i;
import p259j0.AbstractC5330M;

/* renamed from: L0.j */
/* loaded from: classes.dex */
public final class C0875j implements InterfaceC0884s {

    /* renamed from: b */
    public final InterfaceC4319i f3057b;

    /* renamed from: c */
    public final long f3058c;

    /* renamed from: d */
    public long f3059d;

    /* renamed from: f */
    public int f3061f;

    /* renamed from: g */
    public int f3062g;

    /* renamed from: e */
    public byte[] f3060e = new byte[65536];

    /* renamed from: a */
    public final byte[] f3056a = new byte[4096];

    static {
        AbstractC4332v.m18323a("media3.extractor");
    }

    public C0875j(InterfaceC4319i interfaceC4319i, long j7, long j8) {
        this.f3057b = interfaceC4319i;
        this.f3059d = j7;
        this.f3058c = j8;
    }

    /* renamed from: A */
    public final void m3655A(int i7) {
        int i8 = this.f3062g - i7;
        this.f3062g = i8;
        this.f3061f = 0;
        byte[] bArr = this.f3060e;
        byte[] bArr2 = i8 < bArr.length - 524288 ? new byte[65536 + i8] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.f3060e = bArr2;
    }

    @Override // p078L0.InterfaceC0884s
    /* renamed from: a */
    public long mo3511a() {
        return this.f3058c;
    }

    @Override // p078L0.InterfaceC0884s
    /* renamed from: d */
    public boolean mo3512d(byte[] bArr, int i7, int i8, boolean z6) {
        int m3658w = m3658w(bArr, i7, i8);
        while (m3658w < i8 && m3658w != -1) {
            m3658w = m3659x(bArr, i7, i8, m3658w, z6);
        }
        m3656g(m3658w);
        return m3658w != -1;
    }

    /* renamed from: g */
    public final void m3656g(int i7) {
        if (i7 != -1) {
            this.f3059d += i7;
        }
    }

    @Override // p078L0.InterfaceC0884s
    /* renamed from: h */
    public boolean mo3513h(byte[] bArr, int i7, int i8, boolean z6) {
        if (!mo3520r(i8, z6)) {
            return false;
        }
        System.arraycopy(this.f3060e, this.f3061f - i8, bArr, i7, i8);
        return true;
    }

    @Override // p078L0.InterfaceC0884s
    /* renamed from: i */
    public long mo3514i() {
        return this.f3059d + this.f3061f;
    }

    @Override // p078L0.InterfaceC0884s
    /* renamed from: k */
    public void mo3515k(int i7) {
        mo3520r(i7, false);
    }

    @Override // p078L0.InterfaceC0884s
    /* renamed from: l */
    public int mo3516l(int i7) {
        int m3660y = m3660y(i7);
        if (m3660y == 0) {
            byte[] bArr = this.f3056a;
            m3660y = m3659x(bArr, 0, Math.min(i7, bArr.length), 0, true);
        }
        m3656g(m3660y);
        return m3660y;
    }

    @Override // p078L0.InterfaceC0884s
    /* renamed from: m */
    public int mo3517m(byte[] bArr, int i7, int i8) {
        int min;
        m3657v(i8);
        int i9 = this.f3062g;
        int i10 = this.f3061f;
        int i11 = i9 - i10;
        if (i11 == 0) {
            min = m3659x(this.f3060e, i10, i8, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f3062g += min;
        } else {
            min = Math.min(i8, i11);
        }
        System.arraycopy(this.f3060e, this.f3061f, bArr, i7, min);
        this.f3061f += min;
        return min;
    }

    @Override // p078L0.InterfaceC0884s
    /* renamed from: p */
    public void mo3518p() {
        this.f3061f = 0;
    }

    @Override // p078L0.InterfaceC0884s
    /* renamed from: q */
    public void mo3519q(int i7) {
        m3661z(i7, false);
    }

    @Override // p078L0.InterfaceC0884s
    /* renamed from: r */
    public boolean mo3520r(int i7, boolean z6) {
        m3657v(i7);
        int i8 = this.f3062g - this.f3061f;
        while (i8 < i7) {
            i8 = m3659x(this.f3060e, this.f3061f, i7, i8, z6);
            if (i8 == -1) {
                return false;
            }
            this.f3062g = this.f3061f + i8;
        }
        this.f3061f += i7;
        return true;
    }

    @Override // p078L0.InterfaceC0884s, p232g0.InterfaceC4319i
    public int read(byte[] bArr, int i7, int i8) {
        int m3658w = m3658w(bArr, i7, i8);
        if (m3658w == 0) {
            m3658w = m3659x(bArr, i7, i8, 0, true);
        }
        m3656g(m3658w);
        return m3658w;
    }

    @Override // p078L0.InterfaceC0884s
    public void readFully(byte[] bArr, int i7, int i8) {
        mo3512d(bArr, i7, i8, false);
    }

    @Override // p078L0.InterfaceC0884s
    /* renamed from: t */
    public void mo3521t(byte[] bArr, int i7, int i8) {
        mo3513h(bArr, i7, i8, false);
    }

    @Override // p078L0.InterfaceC0884s
    /* renamed from: u */
    public long mo3522u() {
        return this.f3059d;
    }

    /* renamed from: v */
    public final void m3657v(int i7) {
        int i8 = this.f3061f + i7;
        byte[] bArr = this.f3060e;
        if (i8 > bArr.length) {
            this.f3060e = Arrays.copyOf(this.f3060e, AbstractC5330M.m21766p(bArr.length * 2, 65536 + i8, i8 + 524288));
        }
    }

    /* renamed from: w */
    public final int m3658w(byte[] bArr, int i7, int i8) {
        int i9 = this.f3062g;
        if (i9 == 0) {
            return 0;
        }
        int min = Math.min(i9, i8);
        System.arraycopy(this.f3060e, 0, bArr, i7, min);
        m3655A(min);
        return min;
    }

    /* renamed from: x */
    public final int m3659x(byte[] bArr, int i7, int i8, int i9, boolean z6) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f3057b.read(bArr, i7 + i9, i8 - i9);
        if (read != -1) {
            return i9 + read;
        }
        if (i9 == 0 && z6) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: y */
    public final int m3660y(int i7) {
        int min = Math.min(this.f3062g, i7);
        m3655A(min);
        return min;
    }

    /* renamed from: z */
    public boolean m3661z(int i7, boolean z6) {
        int m3660y = m3660y(i7);
        while (m3660y < i7 && m3660y != -1) {
            m3660y = m3659x(this.f3056a, -m3660y, Math.min(i7, this.f3056a.length + m3660y), m3660y, z6);
        }
        m3656g(m3660y);
        return m3660y != -1;
    }
}
