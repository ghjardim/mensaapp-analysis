package p316p5;

import p171Y2.AbstractC2932o;
import p237g5.AbstractC4417S;
import p237g5.C4448l0;
import p237g5.EnumC4455p;

/* renamed from: p5.e */
/* loaded from: classes2.dex */
public final class C6148e extends AbstractC6145b {

    /* renamed from: p */
    public static final AbstractC4417S.j f21938p = new c();

    /* renamed from: g */
    public final AbstractC4417S f21939g;

    /* renamed from: h */
    public final AbstractC4417S.e f21940h;

    /* renamed from: i */
    public AbstractC4417S.c f21941i;

    /* renamed from: j */
    public AbstractC4417S f21942j;

    /* renamed from: k */
    public AbstractC4417S.c f21943k;

    /* renamed from: l */
    public AbstractC4417S f21944l;

    /* renamed from: m */
    public EnumC4455p f21945m;

    /* renamed from: n */
    public AbstractC4417S.j f21946n;

    /* renamed from: o */
    public boolean f21947o;

    /* renamed from: p5.e$b */
    public class b extends AbstractC6146c {

        /* renamed from: a */
        public AbstractC4417S f21949a;

        public b() {
        }

        @Override // p316p5.AbstractC6146c, p237g5.AbstractC4417S.e
        /* renamed from: f */
        public void mo18703f(EnumC4455p enumC4455p, AbstractC4417S.j jVar) {
            if (this.f21949a == C6148e.this.f21944l) {
                AbstractC2932o.m10579v(C6148e.this.f21947o, "there's pending lb while current lb has been out of READY");
                C6148e.this.f21945m = enumC4455p;
                C6148e.this.f21946n = jVar;
                if (enumC4455p == EnumC4455p.READY) {
                    C6148e.this.m25618q();
                    return;
                }
                return;
            }
            if (this.f21949a == C6148e.this.f21942j) {
                C6148e.this.f21947o = enumC4455p == EnumC4455p.READY;
                if (C6148e.this.f21947o || C6148e.this.f21944l == C6148e.this.f21939g) {
                    C6148e.this.f21940h.mo18703f(enumC4455p, jVar);
                } else {
                    C6148e.this.m25618q();
                }
            }
        }

        @Override // p316p5.AbstractC6146c
        /* renamed from: g */
        public AbstractC4417S.e mo25607g() {
            return C6148e.this.f21940h;
        }
    }

    /* renamed from: p5.e$c */
    public class c extends AbstractC4417S.j {
        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public AbstractC4417S.f mo18683a(AbstractC4417S.g gVar) {
            return AbstractC4417S.f.m18706g();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    public C6148e(AbstractC4417S.e eVar) {
        a aVar = new a();
        this.f21939g = aVar;
        this.f21942j = aVar;
        this.f21944l = aVar;
        this.f21940h = (AbstractC4417S.e) AbstractC2932o.m10573p(eVar, "helper");
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: f */
    public void mo18682f() {
        this.f21944l.mo18682f();
        this.f21942j.mo18682f();
    }

    @Override // p316p5.AbstractC6145b
    /* renamed from: g */
    public AbstractC4417S mo25606g() {
        AbstractC4417S abstractC4417S = this.f21944l;
        return abstractC4417S == this.f21939g ? this.f21942j : abstractC4417S;
    }

    /* renamed from: q */
    public final void m25618q() {
        this.f21940h.mo18703f(this.f21945m, this.f21946n);
        this.f21942j.mo18682f();
        this.f21942j = this.f21944l;
        this.f21941i = this.f21943k;
        this.f21944l = this.f21939g;
        this.f21943k = null;
    }

    /* renamed from: r */
    public void m25619r(AbstractC4417S.c cVar) {
        AbstractC2932o.m10573p(cVar, "newBalancerFactory");
        if (cVar.equals(this.f21943k)) {
            return;
        }
        this.f21944l.mo18682f();
        this.f21944l = this.f21939g;
        this.f21943k = null;
        this.f21945m = EnumC4455p.CONNECTING;
        this.f21946n = f21938p;
        if (cVar.equals(this.f21941i)) {
            return;
        }
        b bVar = new b();
        AbstractC4417S mo18697a = cVar.mo18697a(bVar);
        bVar.f21949a = mo18697a;
        this.f21944l = mo18697a;
        this.f21943k = cVar;
        if (this.f21947o) {
            return;
        }
        m25618q();
    }

    /* renamed from: p5.e$a */
    public class a extends AbstractC4417S {
        public a() {
        }

        @Override // p237g5.AbstractC4417S
        /* renamed from: c */
        public void mo18679c(C4448l0 c4448l0) {
            C6148e.this.f21940h.mo18703f(EnumC4455p.TRANSIENT_FAILURE, new AbstractC4417S.d(AbstractC4417S.f.m18705f(c4448l0)));
        }

        @Override // p237g5.AbstractC4417S
        /* renamed from: d */
        public void mo18680d(AbstractC4417S.h hVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // p237g5.AbstractC4417S
        /* renamed from: f */
        public void mo18682f() {
        }
    }
}
