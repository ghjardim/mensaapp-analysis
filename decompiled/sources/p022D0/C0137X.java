package p022D0;

import android.os.Looper;
import p022D0.C0136W;
import p022D0.C0137X;
import p022D0.InterfaceC0120F;
import p022D0.InterfaceC0131Q;
import p050H0.C0542k;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p078L0.InterfaceC0889x;
import p232g0.AbstractC4303I;
import p232g0.C4331u;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.InterfaceC5493g;
import p276l0.InterfaceC5511y;
import p300o0.C5912w1;
import p335s0.C6352l;
import p335s0.InterfaceC6321A;
import p335s0.InterfaceC6364x;

/* renamed from: D0.X */
/* loaded from: classes.dex */
public final class C0137X extends AbstractC0140a implements C0136W.c {

    /* renamed from: o */
    public final InterfaceC5493g.a f498o;

    /* renamed from: p */
    public final InterfaceC0131Q.a f499p;

    /* renamed from: q */
    public final InterfaceC6364x f500q;

    /* renamed from: r */
    public final InterfaceC0544m f501r;

    /* renamed from: s */
    public final int f502s;

    /* renamed from: t */
    public boolean f503t;

    /* renamed from: u */
    public long f504u;

    /* renamed from: v */
    public boolean f505v;

    /* renamed from: w */
    public boolean f506w;

    /* renamed from: x */
    public InterfaceC5511y f507x;

    /* renamed from: y */
    public C4331u f508y;

    /* renamed from: D0.X$a */
    public class a extends AbstractC0177w {
        public a(AbstractC4303I abstractC4303I) {
            super(abstractC4303I);
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: g */
        public AbstractC4303I.b mo303g(int i7, AbstractC4303I.b bVar, boolean z6) {
            super.mo303g(i7, bVar, z6);
            bVar.f14814f = true;
            return bVar;
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: o */
        public AbstractC4303I.c mo305o(int i7, AbstractC4303I.c cVar, long j7) {
            super.mo305o(i7, cVar, j7);
            cVar.f14842k = true;
            return cVar;
        }
    }

    /* renamed from: D0.X$b */
    public static final class b implements InterfaceC0120F.a {

        /* renamed from: a */
        public final InterfaceC5493g.a f510a;

        /* renamed from: b */
        public InterfaceC0131Q.a f511b;

        /* renamed from: c */
        public InterfaceC6321A f512c;

        /* renamed from: d */
        public InterfaceC0544m f513d;

        /* renamed from: e */
        public int f514e;

        public b(InterfaceC5493g.a aVar, final InterfaceC0889x interfaceC0889x) {
            this(aVar, new InterfaceC0131Q.a() { // from class: D0.Y
                @Override // p022D0.InterfaceC0131Q.a
                /* renamed from: a */
                public final InterfaceC0131Q mo422a(C5912w1 c5912w1) {
                    InterfaceC0131Q m494h;
                    m494h = C0137X.b.m494h(InterfaceC0889x.this, c5912w1);
                    return m494h;
                }
            });
        }

        /* renamed from: h */
        public static /* synthetic */ InterfaceC0131Q m494h(InterfaceC0889x interfaceC0889x, C5912w1 c5912w1) {
            return new C0146d(interfaceC0889x);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: a */
        public /* synthetic */ InterfaceC0120F.a mo339a(InterfaceC4529t.a aVar) {
            return AbstractC0119E.m327b(this, aVar);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: b */
        public /* synthetic */ InterfaceC0120F.a mo340b(boolean z6) {
            return AbstractC0119E.m326a(this, z6);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0137X mo343e(C4331u c4331u) {
            AbstractC5332a.m21800e(c4331u.f15212b);
            return new C0137X(c4331u, this.f510a, this.f511b, this.f512c.mo26474a(c4331u), this.f513d, this.f514e, null);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public b mo342d(InterfaceC6321A interfaceC6321A) {
            this.f512c = (InterfaceC6321A) AbstractC5332a.m21801f(interfaceC6321A, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public b mo341c(InterfaceC0544m interfaceC0544m) {
            this.f513d = (InterfaceC0544m) AbstractC5332a.m21801f(interfaceC0544m, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(InterfaceC5493g.a aVar, InterfaceC0131Q.a aVar2) {
            this(aVar, aVar2, new C6352l(), new C0542k(), 1048576);
        }

        public b(InterfaceC5493g.a aVar, InterfaceC0131Q.a aVar2, InterfaceC6321A interfaceC6321A, InterfaceC0544m interfaceC0544m, int i7) {
            this.f510a = aVar;
            this.f511b = aVar2;
            this.f512c = interfaceC6321A;
            this.f513d = interfaceC0544m;
            this.f514e = i7;
        }
    }

    public /* synthetic */ C0137X(C4331u c4331u, InterfaceC5493g.a aVar, InterfaceC0131Q.a aVar2, InterfaceC6364x interfaceC6364x, InterfaceC0544m interfaceC0544m, int i7, a aVar3) {
        this(c4331u, aVar, aVar2, interfaceC6364x, interfaceC0544m, i7);
    }

    /* renamed from: G */
    private void m491G() {
        AbstractC4303I c0151f0 = new C0151f0(this.f504u, this.f505v, false, this.f506w, null, mo331i());
        if (this.f503t) {
            c0151f0 = new a(c0151f0);
        }
        m522D(c0151f0);
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: C */
    public void mo410C(InterfaceC5511y interfaceC5511y) {
        this.f507x = interfaceC5511y;
        this.f500q.mo26607c((Looper) AbstractC5332a.m21800e(Looper.myLooper()), m520A());
        this.f500q.mo26609f();
        m491G();
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: E */
    public void mo286E() {
        this.f500q.release();
    }

    /* renamed from: F */
    public final C4331u.h m492F() {
        return (C4331u.h) AbstractC5332a.m21800e(mo331i().f15212b);
    }

    @Override // p022D0.AbstractC0140a, p022D0.InterfaceC0120F
    /* renamed from: a */
    public synchronized void mo294a(C4331u c4331u) {
        this.f508y = c4331u;
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: e */
    public InterfaceC0117C mo296e(InterfaceC0120F.b bVar, InterfaceC0533b interfaceC0533b, long j7) {
        InterfaceC5493g mo23075a = this.f498o.mo23075a();
        InterfaceC5511y interfaceC5511y = this.f507x;
        if (interfaceC5511y != null) {
            mo23075a.mo711c(interfaceC5511y);
        }
        C4331u.h m492F = m492F();
        return new C0136W(m492F.f15304a, mo23075a, this.f499p.mo422a(m520A()), this.f500q, m524v(bVar), this.f501r, m526x(bVar), this, interfaceC0533b, m492F.f15308e, this.f502s, AbstractC5330M.m21692K0(m492F.f15312i));
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: f */
    public void mo297f(InterfaceC0117C interfaceC0117C) {
        ((C0136W) interfaceC0117C).m462g0();
    }

    @Override // p022D0.C0136W.c
    /* renamed from: h */
    public void mo485h(long j7, boolean z6, boolean z7) {
        if (j7 == -9223372036854775807L) {
            j7 = this.f504u;
        }
        if (!this.f503t && this.f504u == j7 && this.f505v == z6 && this.f506w == z7) {
            return;
        }
        this.f504u = j7;
        this.f505v = z6;
        this.f506w = z7;
        this.f503t = false;
        m491G();
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: i */
    public synchronized C4331u mo331i() {
        return this.f508y;
    }

    public C0137X(C4331u c4331u, InterfaceC5493g.a aVar, InterfaceC0131Q.a aVar2, InterfaceC6364x interfaceC6364x, InterfaceC0544m interfaceC0544m, int i7) {
        this.f508y = c4331u;
        this.f498o = aVar;
        this.f499p = aVar2;
        this.f500q = interfaceC6364x;
        this.f501r = interfaceC0544m;
        this.f502s = i7;
        this.f503t = true;
        this.f504u = -9223372036854775807L;
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: n */
    public void mo298n() {
    }
}
