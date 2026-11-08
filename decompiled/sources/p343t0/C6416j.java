package p343t0;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p029E0.AbstractC0220m;
import p050H0.AbstractC0538g;
import p078L0.C0875j;
import p078L0.InterfaceC0884s;
import p171Y2.AbstractC2920c;
import p176Z0.C2966h;
import p176Z0.C2971m;
import p178Z2.AbstractC3033v;
import p232g0.C4323m;
import p232g0.C4327q;
import p232g0.C4334x;
import p259j0.AbstractC5324G;
import p259j0.AbstractC5332a;
import p259j0.C5322E;
import p259j0.C5357z;
import p276l0.AbstractC5496j;
import p276l0.C5497k;
import p276l0.InterfaceC5493g;
import p300o0.C5912w1;
import p343t0.C6412f;
import p351u0.C6589f;

/* renamed from: t0.j */
/* loaded from: classes.dex */
public final class C6416j extends AbstractC0220m {

    /* renamed from: N */
    public static final AtomicInteger f23185N = new AtomicInteger();

    /* renamed from: A */
    public final boolean f23186A;

    /* renamed from: B */
    public final boolean f23187B;

    /* renamed from: C */
    public final C5912w1 f23188C;

    /* renamed from: D */
    public final long f23189D;

    /* renamed from: E */
    public InterfaceC6417k f23190E;

    /* renamed from: F */
    public C6425s f23191F;

    /* renamed from: G */
    public int f23192G;

    /* renamed from: H */
    public boolean f23193H;

    /* renamed from: I */
    public volatile boolean f23194I;

    /* renamed from: J */
    public boolean f23195J;

    /* renamed from: K */
    public AbstractC3033v f23196K;

    /* renamed from: L */
    public boolean f23197L;

    /* renamed from: M */
    public boolean f23198M;

    /* renamed from: k */
    public final int f23199k;

    /* renamed from: l */
    public final int f23200l;

    /* renamed from: m */
    public final Uri f23201m;

    /* renamed from: n */
    public final boolean f23202n;

    /* renamed from: o */
    public final int f23203o;

    /* renamed from: p */
    public final InterfaceC5493g f23204p;

    /* renamed from: q */
    public final C5497k f23205q;

    /* renamed from: r */
    public final InterfaceC6417k f23206r;

    /* renamed from: s */
    public final boolean f23207s;

    /* renamed from: t */
    public final boolean f23208t;

    /* renamed from: u */
    public final C5322E f23209u;

    /* renamed from: v */
    public final InterfaceC6414h f23210v;

    /* renamed from: w */
    public final List f23211w;

    /* renamed from: x */
    public final C4323m f23212x;

    /* renamed from: y */
    public final C2966h f23213y;

    /* renamed from: z */
    public final C5357z f23214z;

    public C6416j(InterfaceC6414h interfaceC6414h, InterfaceC5493g interfaceC5493g, C5497k c5497k, C4327q c4327q, boolean z6, InterfaceC5493g interfaceC5493g2, C5497k c5497k2, boolean z7, Uri uri, List list, int i7, Object obj, long j7, long j8, long j9, int i8, boolean z8, int i9, boolean z9, boolean z10, C5322E c5322e, long j10, C4323m c4323m, InterfaceC6417k interfaceC6417k, C2966h c2966h, C5357z c5357z, boolean z11, C5912w1 c5912w1) {
        super(interfaceC5493g, c5497k, c4327q, i7, obj, j7, j8, j9);
        this.f23186A = z6;
        this.f23203o = i8;
        this.f23198M = z8;
        this.f23200l = i9;
        this.f23205q = c5497k2;
        this.f23204p = interfaceC5493g2;
        this.f23193H = c5497k2 != null;
        this.f23187B = z7;
        this.f23201m = uri;
        this.f23207s = z10;
        this.f23209u = c5322e;
        this.f23189D = j10;
        this.f23208t = z9;
        this.f23210v = interfaceC6414h;
        this.f23211w = list;
        this.f23212x = c4323m;
        this.f23206r = interfaceC6417k;
        this.f23213y = c2966h;
        this.f23214z = c5357z;
        this.f23202n = z11;
        this.f23188C = c5912w1;
        this.f23196K = AbstractC3033v.m11050t();
        this.f23199k = f23185N.getAndIncrement();
    }

    /* renamed from: i */
    public static InterfaceC5493g m26808i(InterfaceC5493g interfaceC5493g, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return interfaceC5493g;
        }
        AbstractC5332a.m21800e(bArr2);
        return new C6407a(interfaceC5493g, bArr, bArr2);
    }

    /* renamed from: j */
    public static C6416j m26809j(InterfaceC6414h interfaceC6414h, InterfaceC5493g interfaceC5493g, C4327q c4327q, long j7, C6589f c6589f, C6412f.e eVar, Uri uri, List list, int i7, Object obj, boolean z6, C6428v c6428v, long j8, C6416j c6416j, byte[] bArr, byte[] bArr2, boolean z7, C5912w1 c5912w1, AbstractC0538g.a aVar) {
        C5497k c5497k;
        InterfaceC5493g interfaceC5493g2;
        boolean z8;
        C2966h c2966h;
        C5357z c5357z;
        InterfaceC6417k interfaceC6417k;
        C6589f.e eVar2 = eVar.f23178a;
        C5497k m23086a = new C5497k.b().m23094i(AbstractC5324G.m21666f(c6589f.f23717a, eVar2.f23680a)).m23093h(eVar2.f23688p).m23092g(eVar2.f23689q).m23087b(eVar.f23181d ? 8 : 0).m23086a();
        boolean z9 = bArr != null;
        InterfaceC5493g m26808i = m26808i(interfaceC5493g, bArr, z9 ? m26810l((String) AbstractC5332a.m21800e(eVar2.f23687o)) : null);
        C6589f.d dVar = eVar2.f23681b;
        if (dVar != null) {
            boolean z10 = bArr2 != null;
            byte[] m26810l = z10 ? m26810l((String) AbstractC5332a.m21800e(dVar.f23687o)) : null;
            c5497k = new C5497k.b().m23094i(AbstractC5324G.m21666f(c6589f.f23717a, dVar.f23680a)).m23093h(dVar.f23688p).m23092g(dVar.f23689q).m23086a();
            z8 = z10;
            interfaceC5493g2 = m26808i(interfaceC5493g, bArr2, m26810l);
        } else {
            c5497k = null;
            interfaceC5493g2 = null;
            z8 = false;
        }
        long j9 = j7 + eVar2.f23684e;
        long j10 = j9 + eVar2.f23682c;
        int i8 = c6589f.f23660j + eVar2.f23683d;
        if (c6416j != null) {
            C5497k c5497k2 = c6416j.f23205q;
            boolean z11 = c5497k == c5497k2 || (c5497k != null && c5497k2 != null && c5497k.f19781a.equals(c5497k2.f19781a) && c5497k.f19787g == c6416j.f23205q.f19787g);
            boolean z12 = uri.equals(c6416j.f23201m) && c6416j.f23195J;
            C2966h c2966h2 = c6416j.f23213y;
            C5357z c5357z2 = c6416j.f23214z;
            interfaceC6417k = (z11 && z12 && !c6416j.f23197L && c6416j.f23200l == i8) ? c6416j.f23190E : null;
            c2966h = c2966h2;
            c5357z = c5357z2;
        } else {
            c2966h = new C2966h();
            c5357z = new C5357z(10);
            interfaceC6417k = null;
        }
        return new C6416j(interfaceC6414h, m26808i, m23086a, c4327q, z9, interfaceC5493g2, c5497k, z8, uri, list, i7, obj, j9, j10, eVar.f23179b, eVar.f23180c, !eVar.f23181d, i8, eVar2.f23690r, z6, c6428v.m26910a(i8), j8, eVar2.f23685f, interfaceC6417k, c2966h, c5357z, z7, c5912w1);
    }

    /* renamed from: l */
    public static byte[] m26810l(String str) {
        if (AbstractC2920c.m10515e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* renamed from: p */
    public static boolean m26811p(C6412f.e eVar, C6589f c6589f) {
        C6589f.e eVar2 = eVar.f23178a;
        return eVar2 instanceof C6589f.b ? ((C6589f.b) eVar2).f23673s || (eVar.f23180c == 0 && c6589f.f23719c) : c6589f.f23719c;
    }

    /* renamed from: w */
    public static boolean m26812w(C6416j c6416j, Uri uri, C6589f c6589f, C6412f.e eVar, long j7) {
        if (c6416j == null) {
            return false;
        }
        if (uri.equals(c6416j.f23201m) && c6416j.f23195J) {
            return false;
        }
        return !m26811p(eVar, c6589f) || j7 + eVar.f23178a.f23684e < c6416j.f879h;
    }

    @Override // p050H0.C0545n.e
    /* renamed from: b */
    public void mo481b() {
        InterfaceC6417k interfaceC6417k;
        AbstractC5332a.m21800e(this.f23191F);
        if (this.f23190E == null && (interfaceC6417k = this.f23206r) != null && interfaceC6417k.mo26762e()) {
            this.f23190E = this.f23206r;
            this.f23193H = false;
        }
        m26819s();
        if (this.f23194I) {
            return;
        }
        if (!this.f23208t) {
            m26818r();
        }
        this.f23195J = !this.f23194I;
    }

    @Override // p050H0.C0545n.e
    /* renamed from: c */
    public void mo482c() {
        this.f23194I = true;
    }

    @Override // p029E0.AbstractC0220m
    /* renamed from: h */
    public boolean mo913h() {
        return this.f23195J;
    }

    /* renamed from: k */
    public final void m26813k(InterfaceC5493g interfaceC5493g, C5497k c5497k, boolean z6, boolean z7) {
        C5497k m23084e;
        long mo3522u;
        long j7;
        if (z6) {
            r0 = this.f23192G != 0;
            m23084e = c5497k;
        } else {
            m23084e = c5497k.m23084e(this.f23192G);
        }
        try {
            C0875j m26821u = m26821u(interfaceC5493g, m23084e, z7);
            if (r0) {
                m26821u.mo3519q(this.f23192G);
            }
            while (!this.f23194I && this.f23190E.mo26758a(m26821u)) {
                try {
                    try {
                    } catch (EOFException e7) {
                        if ((this.f875d.f15130f & 16384) == 0) {
                            throw e7;
                        }
                        this.f23190E.mo26760c();
                        mo3522u = m26821u.mo3522u();
                        j7 = c5497k.f19787g;
                    }
                } catch (Throwable th) {
                    this.f23192G = (int) (m26821u.mo3522u() - c5497k.f19787g);
                    throw th;
                }
            }
            mo3522u = m26821u.mo3522u();
            j7 = c5497k.f19787g;
            this.f23192G = (int) (mo3522u - j7);
        } finally {
            AbstractC5496j.m23079a(interfaceC5493g);
        }
    }

    /* renamed from: m */
    public int m26814m(int i7) {
        AbstractC5332a.m21802g(!this.f23202n);
        if (i7 >= this.f23196K.size()) {
            return 0;
        }
        return ((Integer) this.f23196K.get(i7)).intValue();
    }

    /* renamed from: n */
    public void m26815n(C6425s c6425s, AbstractC3033v abstractC3033v) {
        this.f23191F = c6425s;
        this.f23196K = abstractC3033v;
    }

    /* renamed from: o */
    public void m26816o() {
        this.f23197L = true;
    }

    /* renamed from: q */
    public boolean m26817q() {
        return this.f23198M;
    }

    /* renamed from: r */
    public final void m26818r() {
        m26813k(this.f880i, this.f873b, this.f23186A, true);
    }

    /* renamed from: s */
    public final void m26819s() {
        if (this.f23193H) {
            AbstractC5332a.m21800e(this.f23204p);
            AbstractC5332a.m21800e(this.f23205q);
            m26813k(this.f23204p, this.f23205q, this.f23187B, false);
            this.f23192G = 0;
            this.f23193H = false;
        }
    }

    /* renamed from: t */
    public final long m26820t(InterfaceC0884s interfaceC0884s) {
        interfaceC0884s.mo3518p();
        try {
            this.f23214z.m21935P(10);
            interfaceC0884s.mo3521t(this.f23214z.m21946e(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f23214z.m21929J() != 4801587) {
            return -9223372036854775807L;
        }
        this.f23214z.m21940U(3);
        int m21925F = this.f23214z.m21925F();
        int i7 = m21925F + 10;
        if (i7 > this.f23214z.m21943b()) {
            byte[] m21946e = this.f23214z.m21946e();
            this.f23214z.m21935P(i7);
            System.arraycopy(m21946e, 0, this.f23214z.m21946e(), 0, 10);
        }
        interfaceC0884s.mo3521t(this.f23214z.m21946e(), 10, m21925F);
        C4334x m10703e = this.f23213y.m10703e(this.f23214z.m21946e(), m21925F);
        if (m10703e == null) {
            return -9223372036854775807L;
        }
        int m18402e = m10703e.m18402e();
        for (int i8 = 0; i8 < m18402e; i8++) {
            C4334x.b m18401d = m10703e.m18401d(i8);
            if (m18401d instanceof C2971m) {
                C2971m c2971m = (C2971m) m18401d;
                if ("com.apple.streaming.transportStreamTimestamp".equals(c2971m.f9120b)) {
                    System.arraycopy(c2971m.f9121c, 0, this.f23214z.m21946e(), 0, 8);
                    this.f23214z.m21939T(0);
                    this.f23214z.m21938S(8);
                    return this.f23214z.m21967z() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: u */
    public final C0875j m26821u(InterfaceC5493g interfaceC5493g, C5497k c5497k, boolean z6) {
        long mo714o = interfaceC5493g.mo714o(c5497k);
        if (z6) {
            try {
                this.f23209u.m21658j(this.f23207s, this.f878g, this.f23189D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e7) {
                throw new IOException(e7);
            }
        }
        C0875j c0875j = new C0875j(interfaceC5493g, c5497k.f19787g, mo714o);
        if (this.f23190E == null) {
            long m26820t = m26820t(c0875j);
            c0875j.mo3518p();
            InterfaceC6417k interfaceC6417k = this.f23206r;
            InterfaceC6417k mo26763f = interfaceC6417k != null ? interfaceC6417k.mo26763f() : this.f23210v.mo26773d(c5497k.f19781a, this.f875d, this.f23211w, this.f23209u, interfaceC5493g.mo713n(), c0875j, this.f23188C);
            this.f23190E = mo26763f;
            if (mo26763f.mo26761d()) {
                this.f23191F.m26892p0(m26820t != -9223372036854775807L ? this.f23209u.m21651b(m26820t) : this.f878g);
            } else {
                this.f23191F.m26892p0(0L);
            }
            this.f23191F.m26876b0();
            this.f23190E.mo26759b(this.f23191F);
        }
        this.f23191F.m26889m0(this.f23212x);
        return c0875j;
    }

    /* renamed from: v */
    public void m26822v() {
        this.f23198M = true;
    }
}
