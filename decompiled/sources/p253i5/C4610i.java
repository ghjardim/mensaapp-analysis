package p253i5;

import java.util.List;
import java.util.Map;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4417S;
import p237g5.AbstractC4418T;
import p237g5.AbstractC4430c0;
import p237g5.AbstractC4435f;
import p237g5.C4419U;
import p237g5.C4448l0;
import p237g5.EnumC4455p;
import p253i5.AbstractC4568L0;

/* renamed from: i5.i */
/* loaded from: classes2.dex */
public final class C4610i {

    /* renamed from: a */
    public final C4419U f16999a;

    /* renamed from: b */
    public final String f17000b;

    /* renamed from: i5.i$b */
    public final class b {

        /* renamed from: a */
        public final AbstractC4417S.e f17001a;

        /* renamed from: b */
        public AbstractC4417S f17002b;

        /* renamed from: c */
        public AbstractC4418T f17003c;

        public b(AbstractC4417S.e eVar) {
            this.f17001a = eVar;
            AbstractC4418T m18743d = C4610i.this.f16999a.m18743d(C4610i.this.f17000b);
            this.f17003c = m18743d;
            if (m18743d != null) {
                this.f17002b = m18743d.mo18697a(eVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + C4610i.this.f17000b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        /* renamed from: a */
        public AbstractC4417S m19984a() {
            return this.f17002b;
        }

        /* renamed from: b */
        public void m19985b(C4448l0 c4448l0) {
            m19984a().mo18679c(c4448l0);
        }

        /* renamed from: c */
        public void m19986c() {
            m19984a().mo18681e();
        }

        /* renamed from: d */
        public void m19987d() {
            this.f17002b.mo18682f();
            this.f17002b = null;
        }

        /* renamed from: e */
        public C4448l0 m19988e(AbstractC4417S.h hVar) {
            AbstractC4568L0.b bVar = (AbstractC4568L0.b) hVar.m18719c();
            if (bVar == null) {
                try {
                    C4610i c4610i = C4610i.this;
                    bVar = new AbstractC4568L0.b(c4610i.m19981d(c4610i.f17000b, "using default policy"), null);
                } catch (f e7) {
                    this.f17001a.mo18703f(EnumC4455p.TRANSIENT_FAILURE, new d(C4448l0.f15809s.m18963q(e7.getMessage())));
                    this.f17002b.mo18682f();
                    this.f17003c = null;
                    this.f17002b = new e();
                    return C4448l0.f15795e;
                }
            }
            if (this.f17003c == null || !bVar.f16545a.mo18736b().equals(this.f17003c.mo18736b())) {
                this.f17001a.mo18703f(EnumC4455p.CONNECTING, new c());
                this.f17002b.mo18682f();
                AbstractC4418T abstractC4418T = bVar.f16545a;
                this.f17003c = abstractC4418T;
                AbstractC4417S abstractC4417S = this.f17002b;
                this.f17002b = abstractC4418T.mo18697a(this.f17001a);
                this.f17001a.mo18699b().mo18925b(AbstractC4435f.a.INFO, "Load balancer changed from {0} to {1}", abstractC4417S.getClass().getSimpleName(), this.f17002b.getClass().getSimpleName());
            }
            Object obj = bVar.f16546b;
            if (obj != null) {
                this.f17001a.mo18699b().mo18925b(AbstractC4435f.a.DEBUG, "Load-balancing config: {0}", bVar.f16546b);
            }
            return m19984a().mo18677a(AbstractC4417S.h.m18716d().m18722b(hVar.m18717a()).m18723c(hVar.m18718b()).m18724d(obj).m18721a());
        }
    }

    /* renamed from: i5.i$c */
    public static final class c extends AbstractC4417S.j {
        public c() {
        }

        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public AbstractC4417S.f mo18683a(AbstractC4417S.g gVar) {
            return AbstractC4417S.f.m18706g();
        }

        public String toString() {
            return AbstractC2926i.m10534b(c.class).toString();
        }
    }

    /* renamed from: i5.i$d */
    public static final class d extends AbstractC4417S.j {

        /* renamed from: a */
        public final C4448l0 f17005a;

        public d(C4448l0 c4448l0) {
            this.f17005a = c4448l0;
        }

        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public AbstractC4417S.f mo18683a(AbstractC4417S.g gVar) {
            return AbstractC4417S.f.m18705f(this.f17005a);
        }
    }

    /* renamed from: i5.i$f */
    public static final class f extends Exception {
        public f(String str) {
            super(str);
        }
    }

    public C4610i(String str) {
        this(C4419U.m18740b(), str);
    }

    /* renamed from: d */
    public final AbstractC4418T m19981d(String str, String str2) {
        AbstractC4418T m18743d = this.f16999a.m18743d(str);
        if (m18743d != null) {
            return m18743d;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    /* renamed from: e */
    public b m19982e(AbstractC4417S.e eVar) {
        return new b(eVar);
    }

    /* renamed from: f */
    public AbstractC4430c0.b m19983f(Map map) {
        List m19534A;
        if (map != null) {
            try {
                m19534A = AbstractC4568L0.m19534A(AbstractC4568L0.m19541g(map));
            } catch (RuntimeException e7) {
                return AbstractC4430c0.b.m18892b(C4448l0.f15797g.m18963q("can't parse load balancer configuration").m18962p(e7));
            }
        } else {
            m19534A = null;
        }
        if (m19534A == null || m19534A.isEmpty()) {
            return null;
        }
        return AbstractC4568L0.m19559y(m19534A, this.f16999a);
    }

    public C4610i(C4419U c4419u, String str) {
        this.f16999a = (C4419U) AbstractC2932o.m10573p(c4419u, "registry");
        this.f17000b = (String) AbstractC2932o.m10573p(str, "defaultPolicy");
    }

    /* renamed from: i5.i$e */
    public static final class e extends AbstractC4417S {
        public e() {
        }

        @Override // p237g5.AbstractC4417S
        /* renamed from: a */
        public C4448l0 mo18677a(AbstractC4417S.h hVar) {
            return C4448l0.f15795e;
        }

        @Override // p237g5.AbstractC4417S
        /* renamed from: f */
        public void mo18682f() {
        }

        @Override // p237g5.AbstractC4417S
        /* renamed from: c */
        public void mo18679c(C4448l0 c4448l0) {
        }

        @Override // p237g5.AbstractC4417S
        /* renamed from: d */
        public void mo18680d(AbstractC4417S.h hVar) {
        }
    }
}
