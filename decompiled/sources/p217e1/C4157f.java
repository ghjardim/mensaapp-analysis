package p217e1;

import android.net.Uri;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import p078L0.AbstractC0851I;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.C0847E;
import p078L0.C0849G;
import p078L0.C0854L;
import p078L0.C0879n;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p176Z0.C2966h;
import p176Z0.C2970l;
import p176Z0.C2972n;
import p195b3.AbstractC3525e;
import p203c3.AbstractC3577g;
import p217e1.InterfaceC4158g;
import p232g0.C4327q;
import p232g0.C4334x;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;

/* renamed from: e1.f */
/* loaded from: classes.dex */
public final class C4157f implements InterfaceC0883r {

    /* renamed from: u */
    public static final InterfaceC0889x f13927u = new InterfaceC0889x() { // from class: e1.d
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m17469r;
            m17469r = C4157f.m17469r();
            return m17469r;
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: c */
        public /* synthetic */ InterfaceC0889x mo649c(boolean z6) {
            return AbstractC0888w.m3695b(this, z6);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: d */
        public /* synthetic */ InterfaceC0883r[] mo650d(Uri uri, Map map) {
            return AbstractC0888w.m3694a(this, uri, map);
        }
    };

    /* renamed from: v */
    public static final C2966h.a f13928v = new C2966h.a() { // from class: e1.e
        @Override // p176Z0.C2966h.a
        /* renamed from: a */
        public final boolean mo10676a(int i7, int i8, int i9, int i10, int i11) {
            boolean m17470s;
            m17470s = C4157f.m17470s(i7, i8, i9, i10, i11);
            return m17470s;
        }
    };

    /* renamed from: a */
    public final int f13929a;

    /* renamed from: b */
    public final long f13930b;

    /* renamed from: c */
    public final C5357z f13931c;

    /* renamed from: d */
    public final AbstractC0851I.a f13932d;

    /* renamed from: e */
    public final C0847E f13933e;

    /* renamed from: f */
    public final C0849G f13934f;

    /* renamed from: g */
    public final InterfaceC0861T f13935g;

    /* renamed from: h */
    public InterfaceC0885t f13936h;

    /* renamed from: i */
    public InterfaceC0861T f13937i;

    /* renamed from: j */
    public InterfaceC0861T f13938j;

    /* renamed from: k */
    public int f13939k;

    /* renamed from: l */
    public C4334x f13940l;

    /* renamed from: m */
    public long f13941m;

    /* renamed from: n */
    public long f13942n;

    /* renamed from: o */
    public long f13943o;

    /* renamed from: p */
    public int f13944p;

    /* renamed from: q */
    public InterfaceC4158g f13945q;

    /* renamed from: r */
    public boolean f13946r;

    /* renamed from: s */
    public boolean f13947s;

    /* renamed from: t */
    public long f13948t;

    public C4157f() {
        this(0);
    }

    /* renamed from: f */
    private void m17465f() {
        AbstractC5332a.m21804i(this.f13937i);
        AbstractC5330M.m21747i(this.f13936h);
    }

    /* renamed from: o */
    public static long m17466o(C4334x c4334x) {
        if (c4334x == null) {
            return -9223372036854775807L;
        }
        int m18402e = c4334x.m18402e();
        for (int i7 = 0; i7 < m18402e; i7++) {
            C4334x.b m18401d = c4334x.m18401d(i7);
            if (m18401d instanceof C2972n) {
                C2972n c2972n = (C2972n) m18401d;
                if (c2972n.f9110a.equals("TLEN")) {
                    return AbstractC5330M.m21692K0(Long.parseLong((String) c2972n.f9124d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: p */
    public static int m17467p(C5357z c5357z, int i7) {
        if (c5357z.m21948g() >= i7 + 4) {
            c5357z.m21939T(i7);
            int m21957p = c5357z.m21957p();
            if (m21957p == 1483304551 || m21957p == 1231971951) {
                return m21957p;
            }
        }
        if (c5357z.m21948g() < 40) {
            return 0;
        }
        c5357z.m21939T(36);
        return c5357z.m21957p() == 1447187017 ? 1447187017 : 0;
    }

    /* renamed from: q */
    public static boolean m17468q(int i7, long j7) {
        return ((long) (i7 & (-128000))) == (j7 & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ InterfaceC0883r[] m17469r() {
        return new InterfaceC0883r[]{new C4157f()};
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m17470s(int i7, int i8, int i9, int i10, int i11) {
        return (i8 == 67 && i9 == 79 && i10 == 77 && (i11 == 77 || i7 == 2)) || (i8 == 77 && i9 == 76 && i10 == 76 && (i11 == 84 || i7 == 2));
    }

    /* renamed from: t */
    public static C4154c m17471t(C4334x c4334x, long j7) {
        if (c4334x == null) {
            return null;
        }
        int m18402e = c4334x.m18402e();
        for (int i7 = 0; i7 < m18402e; i7++) {
            C4334x.b m18401d = c4334x.m18401d(i7);
            if (m18401d instanceof C2970l) {
                return C4154c.m17461a(j7, (C2970l) m18401d, m17466o(c4334x));
            }
        }
        return null;
    }

    /* renamed from: x */
    private int m17472x(InterfaceC0884s interfaceC0884s) {
        if (this.f13944p == 0) {
            interfaceC0884s.mo3518p();
            if (m17479v(interfaceC0884s)) {
                return -1;
            }
            this.f13931c.m21939T(0);
            int m21957p = this.f13931c.m21957p();
            if (!m17468q(m21957p, this.f13939k) || AbstractC0851I.m3537j(m21957p) == -1) {
                interfaceC0884s.mo3519q(1);
                this.f13939k = 0;
                return 0;
            }
            this.f13932d.m3541a(m21957p);
            if (this.f13941m == -9223372036854775807L) {
                this.f13941m = this.f13945q.mo17455c(interfaceC0884s.mo3522u());
                if (this.f13930b != -9223372036854775807L) {
                    this.f13941m += this.f13930b - this.f13945q.mo17455c(0L);
                }
            }
            this.f13944p = this.f13932d.f2930c;
            InterfaceC4158g interfaceC4158g = this.f13945q;
            if (interfaceC4158g instanceof C4153b) {
                C4153b c4153b = (C4153b) interfaceC4158g;
                c4153b.m17459b(m17474k(this.f13942n + r0.f2934g), interfaceC0884s.mo3522u() + this.f13932d.f2930c);
                if (this.f13947s && c4153b.m17458a(this.f13948t)) {
                    this.f13947s = false;
                    this.f13938j = this.f13937i;
                }
            }
        }
        int mo558a = this.f13938j.mo558a(interfaceC0884s, this.f13944p, true);
        if (mo558a == -1) {
            return -1;
        }
        int i7 = this.f13944p - mo558a;
        this.f13944p = i7;
        if (i7 > 0) {
            return 0;
        }
        this.f13938j.mo562c(m17474k(this.f13942n), 1, this.f13932d.f2930c, 0, null);
        this.f13942n += this.f13932d.f2934g;
        this.f13944p = 0;
        return 0;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        this.f13939k = 0;
        this.f13941m = -9223372036854775807L;
        this.f13942n = 0L;
        this.f13944p = 0;
        this.f13948t = j8;
        InterfaceC4158g interfaceC4158g = this.f13945q;
        if (!(interfaceC4158g instanceof C4153b) || ((C4153b) interfaceC4158g).m17458a(j8)) {
            return;
        }
        this.f13947s = true;
        this.f13938j = this.f13935g;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f13936h = interfaceC0885t;
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(0, 1);
        this.f13937i = mo455b;
        this.f13938j = mo455b;
        this.f13936h.mo472q();
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        m17465f();
        int m17480w = m17480w(interfaceC0884s);
        if (m17480w == -1 && (this.f13945q instanceof C4153b)) {
            long m17474k = m17474k(this.f13942n);
            if (this.f13945q.mo474l() != m17474k) {
                ((C4153b) this.f13945q).m17460d(m17474k);
                this.f13936h.mo466j(this.f13945q);
            }
        }
        return m17480w;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        return m17481y(interfaceC0884s, true);
    }

    /* renamed from: j */
    public final InterfaceC4158g m17473j(InterfaceC0884s interfaceC0884s) {
        long m17466o;
        long j7;
        InterfaceC4158g m17478u = m17478u(interfaceC0884s);
        C4154c m17471t = m17471t(this.f13940l, interfaceC0884s.mo3522u());
        if (this.f13946r) {
            return new InterfaceC4158g.a();
        }
        if ((this.f13929a & 4) != 0) {
            if (m17471t != null) {
                m17466o = m17471t.mo474l();
                j7 = m17471t.mo17456e();
            } else if (m17478u != null) {
                m17466o = m17478u.mo474l();
                j7 = m17478u.mo17456e();
            } else {
                m17466o = m17466o(this.f13940l);
                j7 = -1;
            }
            m17478u = new C4153b(m17466o, interfaceC0884s.mo3522u(), j7);
        } else if (m17471t != null) {
            m17478u = m17471t;
        } else if (m17478u == null) {
            m17478u = null;
        }
        if (m17478u == null || !(m17478u.mo3499f() || (this.f13929a & 1) == 0)) {
            return m17477n(interfaceC0884s, (this.f13929a & 2) != 0);
        }
        return m17478u;
    }

    /* renamed from: k */
    public final long m17474k(long j7) {
        return this.f13941m + ((j7 * 1000000) / this.f13932d.f2931d);
    }

    /* renamed from: l */
    public void m17475l() {
        this.f13946r = true;
    }

    /* renamed from: m */
    public final InterfaceC4158g m17476m(long j7, C4160i c4160i, long j8) {
        long j9;
        long j10;
        long m17484a = c4160i.m17484a();
        if (m17484a == -9223372036854775807L) {
            return null;
        }
        long j11 = c4160i.f13956c;
        if (j11 != -1) {
            long j12 = j7 + j11;
            j9 = j11 - c4160i.f13954a.f2930c;
            j10 = j12;
        } else {
            if (j8 == -1) {
                return null;
            }
            j9 = (j8 - j7) - c4160i.f13954a.f2930c;
            j10 = j8;
        }
        long j13 = j9;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new C4152a(j10, j7 + c4160i.f13954a.f2930c, AbstractC3577g.m14421d(AbstractC5330M.m21725a1(j13, 8000000L, m17484a, roundingMode)), AbstractC3577g.m14421d(AbstractC3525e.m14166b(j13, c4160i.f13955b, roundingMode)), false);
    }

    /* renamed from: n */
    public final InterfaceC4158g m17477n(InterfaceC0884s interfaceC0884s, boolean z6) {
        interfaceC0884s.mo3521t(this.f13931c.m21946e(), 0, 4);
        this.f13931c.m21939T(0);
        this.f13932d.m3541a(this.f13931c.m21957p());
        return new C4152a(interfaceC0884s.mo3511a(), interfaceC0884s.mo3522u(), this.f13932d, z6);
    }

    /* renamed from: u */
    public final InterfaceC4158g m17478u(InterfaceC0884s interfaceC0884s) {
        int i7;
        int i8;
        C5357z c5357z = new C5357z(this.f13932d.f2930c);
        interfaceC0884s.mo3521t(c5357z.m21946e(), 0, this.f13932d.f2930c);
        AbstractC0851I.a aVar = this.f13932d;
        int i9 = 21;
        if ((aVar.f2928a & 1) != 0) {
            if (aVar.f2932e != 1) {
                i9 = 36;
            }
        } else if (aVar.f2932e == 1) {
            i9 = 13;
        }
        int m17467p = m17467p(c5357z, i9);
        if (m17467p != 1231971951) {
            if (m17467p == 1447187017) {
                C4159h m17482a = C4159h.m17482a(interfaceC0884s.mo3511a(), interfaceC0884s.mo3522u(), this.f13932d, c5357z);
                interfaceC0884s.mo3519q(this.f13932d.f2930c);
                return m17482a;
            }
            if (m17467p != 1483304551) {
                interfaceC0884s.mo3518p();
                return null;
            }
        }
        C4160i m17483b = C4160i.m17483b(this.f13932d, c5357z);
        if (!this.f13933e.m3523a() && (i7 = m17483b.f13957d) != -1 && (i8 = m17483b.f13958e) != -1) {
            C0847E c0847e = this.f13933e;
            c0847e.f2902a = i7;
            c0847e.f2903b = i8;
        }
        long mo3522u = interfaceC0884s.mo3522u();
        if (interfaceC0884s.mo3511a() != -1 && m17483b.f13956c != -1 && interfaceC0884s.mo3511a() != m17483b.f13956c + mo3522u) {
            AbstractC5346o.m21865f("Mp3Extractor", "Data size mismatch between stream (" + interfaceC0884s.mo3511a() + ") and Xing frame (" + (m17483b.f13956c + mo3522u) + "), using Xing value.");
        }
        interfaceC0884s.mo3519q(this.f13932d.f2930c);
        return m17467p == 1483304551 ? C4161j.m17485a(m17483b, mo3522u) : m17476m(mo3522u, m17483b, interfaceC0884s.mo3511a());
    }

    /* renamed from: v */
    public final boolean m17479v(InterfaceC0884s interfaceC0884s) {
        InterfaceC4158g interfaceC4158g = this.f13945q;
        if (interfaceC4158g != null) {
            long mo17456e = interfaceC4158g.mo17456e();
            if (mo17456e != -1 && interfaceC0884s.mo3514i() > mo17456e - 4) {
                return true;
            }
        }
        try {
            return !interfaceC0884s.mo3513h(this.f13931c.m21946e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: w */
    public final int m17480w(InterfaceC0884s interfaceC0884s) {
        if (this.f13939k == 0) {
            try {
                m17481y(interfaceC0884s, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f13945q == null) {
            InterfaceC4158g m17473j = m17473j(interfaceC0884s);
            this.f13945q = m17473j;
            this.f13936h.mo466j(m17473j);
            C4327q.b m18257h0 = new C4327q.b().m18264o0(this.f13932d.f2929b).m18255f0(4096).m18237N(this.f13932d.f2932e).m18265p0(this.f13932d.f2931d).m18245V(this.f13933e.f2902a).m18246W(this.f13933e.f2903b).m18257h0((this.f13929a & 8) != 0 ? null : this.f13940l);
            if (this.f13945q.mo17457k() != -2147483647) {
                m18257h0.m18236M(this.f13945q.mo17457k());
            }
            this.f13938j.mo566e(m18257h0.m18234K());
            this.f13943o = interfaceC0884s.mo3522u();
        } else if (this.f13943o != 0) {
            long mo3522u = interfaceC0884s.mo3522u();
            long j7 = this.f13943o;
            if (mo3522u < j7) {
                interfaceC0884s.mo3519q((int) (j7 - mo3522u));
            }
        }
        return m17472x(interfaceC0884s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r13 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:
    
        r12.mo3519q(r1 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        r11.f13939k = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
        r12.mo3518p();
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m17481y(p078L0.InterfaceC0884s r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.mo3518p()
            long r1 = r12.mo3522u()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L3e
            int r1 = r11.f13929a
            r1 = r1 & 8
            if (r1 != 0) goto L1f
            r1 = r2
            goto L21
        L1f:
            Z0.h$a r1 = p217e1.C4157f.f13928v
        L21:
            L0.G r4 = r11.f13934f
            g0.x r1 = r4.m3527a(r12, r1)
            r11.f13940l = r1
            if (r1 == 0) goto L30
            L0.E r4 = r11.f13933e
            r4.m3525c(r1)
        L30:
            long r4 = r12.mo3514i()
            int r1 = (int) r4
            if (r13 != 0) goto L3a
            r12.mo3519q(r1)
        L3a:
            r4 = r3
        L3b:
            r5 = r4
            r6 = r5
            goto L41
        L3e:
            r1 = r3
            r4 = r1
            goto L3b
        L41:
            boolean r7 = r11.m17479v(r12)
            r8 = 1
            if (r7 == 0) goto L51
            if (r5 <= 0) goto L4b
            goto L9a
        L4b:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L51:
            j0.z r7 = r11.f13931c
            r7.m21939T(r3)
            j0.z r7 = r11.f13931c
            int r7 = r7.m21957p()
            if (r4 == 0) goto L65
            long r9 = (long) r4
            boolean r9 = m17468q(r7, r9)
            if (r9 == 0) goto L6c
        L65:
            int r9 = p078L0.AbstractC0851I.m3537j(r7)
            r10 = -1
            if (r9 != r10) goto L8c
        L6c:
            int r4 = r6 + 1
            if (r6 != r0) goto L7a
            if (r13 == 0) goto L73
            return r3
        L73:
            java.lang.String r12 = "Searched too many bytes."
            g0.A r12 = p232g0.C4295A.m17943a(r12, r2)
            throw r12
        L7a:
            if (r13 == 0) goto L85
            r12.mo3518p()
            int r5 = r1 + r4
            r12.mo3515k(r5)
            goto L88
        L85:
            r12.mo3519q(r8)
        L88:
            r5 = r3
            r6 = r4
            r4 = r5
            goto L41
        L8c:
            int r5 = r5 + 1
            if (r5 != r8) goto L97
            L0.I$a r4 = r11.f13932d
            r4.m3541a(r7)
            r4 = r7
            goto La7
        L97:
            r7 = 4
            if (r5 != r7) goto La7
        L9a:
            if (r13 == 0) goto La1
            int r1 = r1 + r6
            r12.mo3519q(r1)
            goto La4
        La1:
            r12.mo3518p()
        La4:
            r11.f13939k = r4
            return r8
        La7:
            int r9 = r9 + (-4)
            r12.mo3515k(r9)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: p217e1.C4157f.m17481y(L0.s, boolean):boolean");
    }

    public C4157f(int i7) {
        this(i7, -9223372036854775807L);
    }

    public C4157f(int i7, long j7) {
        this.f13929a = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f13930b = j7;
        this.f13931c = new C5357z(10);
        this.f13932d = new AbstractC0851I.a();
        this.f13933e = new C0847E();
        this.f13941m = -9223372036854775807L;
        this.f13934f = new C0849G();
        C0879n c0879n = new C0879n();
        this.f13935g = c0879n;
        this.f13938j = c0879n;
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
