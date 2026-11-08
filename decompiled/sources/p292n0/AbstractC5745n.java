package p292n0;

import p022D0.InterfaceC0120F;
import p022D0.InterfaceC0145c0;
import p232g0.AbstractC4303I;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.InterfaceC5334c;
import p284m0.C5561i;
import p292n0.InterfaceC5707X0;
import p300o0.C5912w1;

/* renamed from: n0.n */
/* loaded from: classes.dex */
public abstract class AbstractC5745n implements InterfaceC5703V0, InterfaceC5707X0 {

    /* renamed from: b */
    public final int f20793b;

    /* renamed from: d */
    public C5709Y0 f20795d;

    /* renamed from: e */
    public int f20796e;

    /* renamed from: f */
    public C5912w1 f20797f;

    /* renamed from: n */
    public InterfaceC5334c f20798n;

    /* renamed from: o */
    public int f20799o;

    /* renamed from: p */
    public InterfaceC0145c0 f20800p;

    /* renamed from: q */
    public C4327q[] f20801q;

    /* renamed from: r */
    public long f20802r;

    /* renamed from: s */
    public long f20803s;

    /* renamed from: u */
    public boolean f20805u;

    /* renamed from: v */
    public boolean f20806v;

    /* renamed from: x */
    public InterfaceC5707X0.a f20808x;

    /* renamed from: a */
    public final Object f20792a = new Object();

    /* renamed from: c */
    public final C5756s0 f20794c = new C5756s0();

    /* renamed from: t */
    public long f20804t = Long.MIN_VALUE;

    /* renamed from: w */
    public AbstractC4303I f20807w = AbstractC4303I.f14800a;

    public AbstractC5745n(int i7) {
        this.f20793b = i7;
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: B */
    public final InterfaceC0145c0 mo23899B() {
        return this.f20800p;
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: C */
    public final void mo23900C() {
        ((InterfaceC0145c0) AbstractC5332a.m21800e(this.f20800p)).mo488c();
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: D */
    public final long mo23901D() {
        return this.f20804t;
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: F */
    public final void mo23902F(long j7) {
        m24173e0(j7, false);
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: G */
    public final boolean mo23903G() {
        return this.f20805u;
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: H */
    public InterfaceC5766x0 mo23904H() {
        return null;
    }

    /* renamed from: I */
    public final C5759u m24160I(Throwable th, C4327q c4327q, int i7) {
        return m24161J(th, c4327q, false, i7);
    }

    /* renamed from: J */
    public final C5759u m24161J(Throwable th, C4327q c4327q, boolean z6, int i7) {
        int i8;
        if (c4327q != null && !this.f20806v) {
            this.f20806v = true;
            try {
                i8 = AbstractC5705W0.m23925h(mo1250a(c4327q));
            } catch (C5759u unused) {
            } finally {
                this.f20806v = false;
            }
            return C5759u.m24359b(th, getName(), m24165N(), c4327q, i8, z6, i7);
        }
        i8 = 4;
        return C5759u.m24359b(th, getName(), m24165N(), c4327q, i8, z6, i7);
    }

    /* renamed from: K */
    public final InterfaceC5334c m24162K() {
        return (InterfaceC5334c) AbstractC5332a.m21800e(this.f20798n);
    }

    /* renamed from: L */
    public final C5709Y0 m24163L() {
        return (C5709Y0) AbstractC5332a.m21800e(this.f20795d);
    }

    /* renamed from: M */
    public final C5756s0 m24164M() {
        this.f20794c.m24349a();
        return this.f20794c;
    }

    /* renamed from: N */
    public final int m24165N() {
        return this.f20796e;
    }

    /* renamed from: O */
    public final long m24166O() {
        return this.f20803s;
    }

    /* renamed from: P */
    public final C5912w1 m24167P() {
        return (C5912w1) AbstractC5332a.m21800e(this.f20797f);
    }

    /* renamed from: Q */
    public final C4327q[] m24168Q() {
        return (C4327q[]) AbstractC5332a.m21800e(this.f20801q);
    }

    /* renamed from: R */
    public final boolean m24169R() {
        return mo23909o() ? this.f20805u : ((InterfaceC0145c0) AbstractC5332a.m21800e(this.f20800p)).mo487b();
    }

    /* renamed from: S */
    public abstract void mo1248S();

    /* renamed from: V */
    public abstract void mo1249V(long j7, boolean z6);

    /* renamed from: X */
    public final void m24170X() {
        InterfaceC5707X0.a aVar;
        synchronized (this.f20792a) {
            aVar = this.f20808x;
        }
        if (aVar != null) {
            aVar.mo1443a(this);
        }
    }

    /* renamed from: d0 */
    public final int m24172d0(C5756s0 c5756s0, C5561i c5561i, int i7) {
        int mo490q = ((InterfaceC0145c0) AbstractC5332a.m21800e(this.f20800p)).mo490q(c5756s0, c5561i, i7);
        if (mo490q == -4) {
            if (c5561i.m23275m()) {
                this.f20804t = Long.MIN_VALUE;
                return this.f20805u ? -4 : -3;
            }
            long j7 = c5561i.f20079f + this.f20802r;
            c5561i.f20079f = j7;
            this.f20804t = Math.max(this.f20804t, j7);
        } else if (mo490q == -5) {
            C4327q c4327q = (C4327q) AbstractC5332a.m21800e(c5756s0.f20950b);
            if (c4327q.f15143s != Long.MAX_VALUE) {
                c5756s0.f20950b = c4327q.m18193a().m18268s0(c4327q.f15143s + this.f20802r).m18234K();
            }
        }
        return mo490q;
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: e */
    public final int mo23905e() {
        return this.f20799o;
    }

    /* renamed from: e0 */
    public final void m24173e0(long j7, boolean z6) {
        this.f20805u = false;
        this.f20803s = j7;
        this.f20804t = j7;
        mo1249V(j7, z6);
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: f */
    public /* synthetic */ void mo2870f() {
        AbstractC5701U0.m23896a(this);
    }

    /* renamed from: f0 */
    public int m24174f0(long j7) {
        return ((InterfaceC0145c0) AbstractC5332a.m21800e(this.f20800p)).mo489j(j7 - this.f20802r);
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: h */
    public final void mo23906h() {
        AbstractC5332a.m21802g(this.f20799o == 1);
        this.f20794c.m24349a();
        this.f20799o = 0;
        this.f20800p = null;
        this.f20801q = null;
        this.f20805u = false;
        mo1248S();
    }

    @Override // p292n0.InterfaceC5703V0, p292n0.InterfaceC5707X0
    /* renamed from: j */
    public final int mo23907j() {
        return this.f20793b;
    }

    @Override // p292n0.InterfaceC5707X0
    /* renamed from: k */
    public final void mo23929k(InterfaceC5707X0.a aVar) {
        synchronized (this.f20792a) {
            this.f20808x = aVar;
        }
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: l */
    public final void mo23908l(C4327q[] c4327qArr, InterfaceC0145c0 interfaceC0145c0, long j7, long j8, InterfaceC0120F.b bVar) {
        AbstractC5332a.m21802g(!this.f20805u);
        this.f20800p = interfaceC0145c0;
        if (this.f20804t == Long.MIN_VALUE) {
            this.f20804t = j7;
        }
        this.f20801q = c4327qArr;
        this.f20802r = j8;
        mo1252b0(c4327qArr, j7, j8, bVar);
    }

    @Override // p292n0.InterfaceC5707X0
    /* renamed from: n */
    public final void mo23930n() {
        synchronized (this.f20792a) {
            this.f20808x = null;
        }
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: o */
    public final boolean mo23909o() {
        return this.f20804t == Long.MIN_VALUE;
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: p */
    public /* synthetic */ long mo23910p(long j7, long j8) {
        return AbstractC5701U0.m23897b(this, j7, j8);
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: q */
    public final void mo23911q(int i7, C5912w1 c5912w1, InterfaceC5334c interfaceC5334c) {
        this.f20796e = i7;
        this.f20797f = c5912w1;
        this.f20798n = interfaceC5334c;
        mo2861U();
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: r */
    public final void mo23912r() {
        this.f20805u = true;
    }

    @Override // p292n0.InterfaceC5703V0
    public final void release() {
        AbstractC5332a.m21802g(this.f20799o == 0);
        mo2863W();
    }

    @Override // p292n0.InterfaceC5703V0
    public final void reset() {
        AbstractC5332a.m21802g(this.f20799o == 0);
        this.f20794c.m24349a();
        mo2864Y();
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: s */
    public final void mo23913s(AbstractC4303I abstractC4303I) {
        if (AbstractC5330M.m21729c(this.f20807w, abstractC4303I)) {
            return;
        }
        this.f20807w = abstractC4303I;
        m24171c0(abstractC4303I);
    }

    @Override // p292n0.InterfaceC5703V0
    public final void start() {
        AbstractC5332a.m21802g(this.f20799o == 1);
        this.f20799o = 2;
        mo2866Z();
    }

    @Override // p292n0.InterfaceC5703V0
    public final void stop() {
        AbstractC5332a.m21802g(this.f20799o == 2);
        this.f20799o = 1;
        mo2867a0();
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: v */
    public /* synthetic */ void mo2898v(float f7, float f8) {
        AbstractC5701U0.m23898c(this, f7, f8);
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: x */
    public final void mo23915x(C5709Y0 c5709y0, C4327q[] c4327qArr, InterfaceC0145c0 interfaceC0145c0, long j7, boolean z6, boolean z7, long j8, long j9, InterfaceC0120F.b bVar) {
        AbstractC5332a.m21802g(this.f20799o == 0);
        this.f20795d = c5709y0;
        this.f20799o = 1;
        mo2860T(z6, z7);
        mo23908l(c4327qArr, interfaceC0145c0, j8, j9, bVar);
        m24173e0(j8, z6);
    }

    @Override // p292n0.InterfaceC5707X0
    /* renamed from: z */
    public int mo23931z() {
        return 0;
    }

    /* renamed from: U */
    public void mo2861U() {
    }

    /* renamed from: W */
    public void mo2863W() {
    }

    /* renamed from: Y */
    public void mo2864Y() {
    }

    /* renamed from: Z */
    public void mo2866Z() {
    }

    /* renamed from: a0 */
    public void mo2867a0() {
    }

    @Override // p292n0.InterfaceC5703V0
    /* renamed from: t */
    public final InterfaceC5707X0 mo23914t() {
        return this;
    }

    /* renamed from: c0 */
    public void m24171c0(AbstractC4303I abstractC4303I) {
    }

    @Override // p292n0.C5697S0.b
    /* renamed from: A */
    public void mo2838A(int i7, Object obj) {
    }

    /* renamed from: T */
    public void mo2860T(boolean z6, boolean z7) {
    }

    /* renamed from: b0 */
    public void mo1252b0(C4327q[] c4327qArr, long j7, long j8, InterfaceC0120F.b bVar) {
    }
}
