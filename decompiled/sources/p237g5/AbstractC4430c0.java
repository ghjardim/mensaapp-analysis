package p237g5;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p256j$.util.DesugarCollections;

/* renamed from: g5.c0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4430c0 {

    /* renamed from: g5.c0$a */
    public static final class a {

        /* renamed from: a */
        public final int f15743a;

        /* renamed from: b */
        public final InterfaceC4440h0 f15744b;

        /* renamed from: c */
        public final ExecutorC4456p0 f15745c;

        /* renamed from: d */
        public final f f15746d;

        /* renamed from: e */
        public final ScheduledExecutorService f15747e;

        /* renamed from: f */
        public final AbstractC4435f f15748f;

        /* renamed from: g */
        public final Executor f15749g;

        /* renamed from: h */
        public final String f15750h;

        /* renamed from: g5.c0$a$a, reason: collision with other inner class name */
        public static final class C7220a {

            /* renamed from: a */
            public Integer f15751a;

            /* renamed from: b */
            public InterfaceC4440h0 f15752b;

            /* renamed from: c */
            public ExecutorC4456p0 f15753c;

            /* renamed from: d */
            public f f15754d;

            /* renamed from: e */
            public ScheduledExecutorService f15755e;

            /* renamed from: f */
            public AbstractC4435f f15756f;

            /* renamed from: g */
            public Executor f15757g;

            /* renamed from: h */
            public String f15758h;

            /* renamed from: a */
            public a m18882a() {
                return new a(this.f15751a, this.f15752b, this.f15753c, this.f15754d, this.f15755e, this.f15756f, this.f15757g, this.f15758h, null);
            }

            /* renamed from: b */
            public C7220a m18883b(AbstractC4435f abstractC4435f) {
                this.f15756f = (AbstractC4435f) AbstractC2932o.m10572o(abstractC4435f);
                return this;
            }

            /* renamed from: c */
            public C7220a m18884c(int i7) {
                this.f15751a = Integer.valueOf(i7);
                return this;
            }

            /* renamed from: d */
            public C7220a m18885d(Executor executor) {
                this.f15757g = executor;
                return this;
            }

            /* renamed from: e */
            public C7220a m18886e(String str) {
                this.f15758h = str;
                return this;
            }

            /* renamed from: f */
            public C7220a m18887f(InterfaceC4440h0 interfaceC4440h0) {
                this.f15752b = (InterfaceC4440h0) AbstractC2932o.m10572o(interfaceC4440h0);
                return this;
            }

            /* renamed from: g */
            public C7220a m18888g(ScheduledExecutorService scheduledExecutorService) {
                this.f15755e = (ScheduledExecutorService) AbstractC2932o.m10572o(scheduledExecutorService);
                return this;
            }

            /* renamed from: h */
            public C7220a m18889h(f fVar) {
                this.f15754d = (f) AbstractC2932o.m10572o(fVar);
                return this;
            }

            /* renamed from: i */
            public C7220a m18890i(ExecutorC4456p0 executorC4456p0) {
                this.f15753c = (ExecutorC4456p0) AbstractC2932o.m10572o(executorC4456p0);
                return this;
            }
        }

        public /* synthetic */ a(Integer num, InterfaceC4440h0 interfaceC4440h0, ExecutorC4456p0 executorC4456p0, f fVar, ScheduledExecutorService scheduledExecutorService, AbstractC4435f abstractC4435f, Executor executor, String str, AbstractC4428b0 abstractC4428b0) {
            this(num, interfaceC4440h0, executorC4456p0, fVar, scheduledExecutorService, abstractC4435f, executor, str);
        }

        /* renamed from: g */
        public static C7220a m18875g() {
            return new C7220a();
        }

        /* renamed from: a */
        public int m18876a() {
            return this.f15743a;
        }

        /* renamed from: b */
        public Executor m18877b() {
            return this.f15749g;
        }

        /* renamed from: c */
        public InterfaceC4440h0 m18878c() {
            return this.f15744b;
        }

        /* renamed from: d */
        public ScheduledExecutorService m18879d() {
            ScheduledExecutorService scheduledExecutorService = this.f15747e;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService;
            }
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }

        /* renamed from: e */
        public f m18880e() {
            return this.f15746d;
        }

        /* renamed from: f */
        public ExecutorC4456p0 m18881f() {
            return this.f15745c;
        }

        public String toString() {
            return AbstractC2926i.m10535c(this).m10538b("defaultPort", this.f15743a).m10540d("proxyDetector", this.f15744b).m10540d("syncContext", this.f15745c).m10540d("serviceConfigParser", this.f15746d).m10540d("scheduledExecutorService", this.f15747e).m10540d("channelLogger", this.f15748f).m10540d("executor", this.f15749g).m10540d("overrideAuthority", this.f15750h).toString();
        }

        public a(Integer num, InterfaceC4440h0 interfaceC4440h0, ExecutorC4456p0 executorC4456p0, f fVar, ScheduledExecutorService scheduledExecutorService, AbstractC4435f abstractC4435f, Executor executor, String str) {
            this.f15743a = ((Integer) AbstractC2932o.m10573p(num, "defaultPort not set")).intValue();
            this.f15744b = (InterfaceC4440h0) AbstractC2932o.m10573p(interfaceC4440h0, "proxyDetector not set");
            this.f15745c = (ExecutorC4456p0) AbstractC2932o.m10573p(executorC4456p0, "syncContext not set");
            this.f15746d = (f) AbstractC2932o.m10573p(fVar, "serviceConfigParser not set");
            this.f15747e = scheduledExecutorService;
            this.f15748f = abstractC4435f;
            this.f15749g = executor;
            this.f15750h = str;
        }
    }

    /* renamed from: g5.c0$c */
    public static abstract class c {
        /* renamed from: a */
        public abstract String mo18895a();

        /* renamed from: b */
        public abstract AbstractC4430c0 mo18896b(URI uri, a aVar);
    }

    /* renamed from: g5.c0$d */
    public static abstract class d {
        /* renamed from: a */
        public abstract void mo18897a(C4448l0 c4448l0);

        /* renamed from: b */
        public abstract void mo18898b(e eVar);
    }

    /* renamed from: g5.c0$e */
    public static final class e {

        /* renamed from: a */
        public final List f15761a;

        /* renamed from: b */
        public final C4425a f15762b;

        /* renamed from: c */
        public final b f15763c;

        /* renamed from: g5.c0$e$a */
        public static final class a {

            /* renamed from: a */
            public List f15764a = Collections.emptyList();

            /* renamed from: b */
            public C4425a f15765b = C4425a.f15691c;

            /* renamed from: c */
            public b f15766c;

            /* renamed from: a */
            public e m18904a() {
                return new e(this.f15764a, this.f15765b, this.f15766c);
            }

            /* renamed from: b */
            public a m18905b(List list) {
                this.f15764a = list;
                return this;
            }

            /* renamed from: c */
            public a m18906c(C4425a c4425a) {
                this.f15765b = c4425a;
                return this;
            }

            /* renamed from: d */
            public a m18907d(b bVar) {
                this.f15766c = bVar;
                return this;
            }
        }

        public e(List list, C4425a c4425a, b bVar) {
            this.f15761a = DesugarCollections.unmodifiableList(new ArrayList(list));
            this.f15762b = (C4425a) AbstractC2932o.m10573p(c4425a, "attributes");
            this.f15763c = bVar;
        }

        /* renamed from: d */
        public static a m18899d() {
            return new a();
        }

        /* renamed from: a */
        public List m18900a() {
            return this.f15761a;
        }

        /* renamed from: b */
        public C4425a m18901b() {
            return this.f15762b;
        }

        /* renamed from: c */
        public b m18902c() {
            return this.f15763c;
        }

        /* renamed from: e */
        public a m18903e() {
            return m18899d().m18905b(this.f15761a).m18906c(this.f15762b).m18907d(this.f15763c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC2928k.m10550a(this.f15761a, eVar.f15761a) && AbstractC2928k.m10550a(this.f15762b, eVar.f15762b) && AbstractC2928k.m10550a(this.f15763c, eVar.f15763c);
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(this.f15761a, this.f15762b, this.f15763c);
        }

        public String toString() {
            return AbstractC2926i.m10535c(this).m10540d("addresses", this.f15761a).m10540d("attributes", this.f15762b).m10540d("serviceConfig", this.f15763c).toString();
        }
    }

    /* renamed from: g5.c0$f */
    public static abstract class f {
        /* renamed from: a */
        public abstract b mo18908a(Map map);
    }

    /* renamed from: a */
    public abstract String mo18871a();

    /* renamed from: b */
    public abstract void mo18872b();

    /* renamed from: c */
    public abstract void mo18873c();

    /* renamed from: d */
    public abstract void mo18874d(d dVar);

    /* renamed from: g5.c0$b */
    public static final class b {

        /* renamed from: a */
        public final C4448l0 f15759a;

        /* renamed from: b */
        public final Object f15760b;

        public b(Object obj) {
            this.f15760b = AbstractC2932o.m10573p(obj, "config");
            this.f15759a = null;
        }

        /* renamed from: a */
        public static b m18891a(Object obj) {
            return new b(obj);
        }

        /* renamed from: b */
        public static b m18892b(C4448l0 c4448l0) {
            return new b(c4448l0);
        }

        /* renamed from: c */
        public Object m18893c() {
            return this.f15760b;
        }

        /* renamed from: d */
        public C4448l0 m18894d() {
            return this.f15759a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC2928k.m10550a(this.f15759a, bVar.f15759a) && AbstractC2928k.m10550a(this.f15760b, bVar.f15760b);
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(this.f15759a, this.f15760b);
        }

        public String toString() {
            return this.f15760b != null ? AbstractC2926i.m10535c(this).m10540d("config", this.f15760b).toString() : AbstractC2926i.m10535c(this).m10540d("error", this.f15759a).toString();
        }

        public b(C4448l0 c4448l0) {
            this.f15760b = null;
            this.f15759a = (C4448l0) AbstractC2932o.m10573p(c4448l0, "status");
            AbstractC2932o.m10568k(!c4448l0.m18961o(), "cannot use OK status: %s", c4448l0);
        }
    }
}
