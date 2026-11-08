package p253i5;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.metadata.TikaCoreProperties;
import p171Y2.AbstractC2916A;
import p171Y2.AbstractC2932o;
import p171Y2.AbstractC2942y;
import p171Y2.C2917B;
import p171Y2.C2937t;
import p207d.AbstractC4094d;
import p237g5.AbstractC4430c0;
import p237g5.AbstractC4438g0;
import p237g5.C4425a;
import p237g5.C4448l0;
import p237g5.C4466x;
import p237g5.ExecutorC4456p0;
import p237g5.InterfaceC4440h0;
import p253i5.C4570M0;
import p256j$.util.DesugarCollections;

/* renamed from: i5.D */
/* loaded from: classes2.dex */
public class C4551D extends AbstractC4430c0 {

    /* renamed from: A */
    public static String f16353A;

    /* renamed from: s */
    public static final Logger f16354s = Logger.getLogger(C4551D.class.getName());

    /* renamed from: t */
    public static final Set f16355t = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    /* renamed from: u */
    public static final String f16356u;

    /* renamed from: v */
    public static final String f16357v;

    /* renamed from: w */
    public static final String f16358w;

    /* renamed from: x */
    public static boolean f16359x;

    /* renamed from: y */
    public static boolean f16360y;

    /* renamed from: z */
    public static boolean f16361z;

    /* renamed from: a */
    public final InterfaceC4440h0 f16362a;

    /* renamed from: b */
    public final Random f16363b = new Random();

    /* renamed from: c */
    public volatile b f16364c = d.INSTANCE;

    /* renamed from: d */
    public final AtomicReference f16365d = new AtomicReference();

    /* renamed from: e */
    public final String f16366e;

    /* renamed from: f */
    public final String f16367f;

    /* renamed from: g */
    public final int f16368g;

    /* renamed from: h */
    public final C4570M0.d f16369h;

    /* renamed from: i */
    public final long f16370i;

    /* renamed from: j */
    public final ExecutorC4456p0 f16371j;

    /* renamed from: k */
    public final C2937t f16372k;

    /* renamed from: l */
    public boolean f16373l;

    /* renamed from: m */
    public boolean f16374m;

    /* renamed from: n */
    public Executor f16375n;

    /* renamed from: o */
    public final boolean f16376o;

    /* renamed from: p */
    public final AbstractC4430c0.f f16377p;

    /* renamed from: q */
    public boolean f16378q;

    /* renamed from: r */
    public AbstractC4430c0.d f16379r;

    /* renamed from: i5.D$b */
    public interface b {
        /* renamed from: b */
        List mo19427b(String str);
    }

    /* renamed from: i5.D$c */
    public static final class c {

        /* renamed from: a */
        public C4448l0 f16380a;

        /* renamed from: b */
        public List f16381b;

        /* renamed from: c */
        public AbstractC4430c0.b f16382c;

        /* renamed from: d */
        public C4425a f16383d;

        public c() {
        }
    }

    /* renamed from: i5.D$d */
    public enum d implements b {
        INSTANCE;

        @Override // p253i5.C4551D.b
        /* renamed from: b */
        public List mo19427b(String str) {
            return DesugarCollections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* renamed from: i5.D$e */
    public final class e implements Runnable {

        /* renamed from: a */
        public final AbstractC4430c0.d f16386a;

        /* renamed from: i5.D$e$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ boolean f16388a;

            public a(boolean z6) {
                this.f16388a = z6;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f16388a) {
                    C4551D c4551d = C4551D.this;
                    c4551d.f16373l = true;
                    if (c4551d.f16370i > 0) {
                        C4551D.this.f16372k.m10605f().m10606g();
                    }
                }
                C4551D.this.f16378q = false;
            }
        }

        public e(AbstractC4430c0.d dVar) {
            this.f16386a = (AbstractC4430c0.d) AbstractC2932o.m10573p(dVar, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            ExecutorC4456p0 executorC4456p0;
            a aVar;
            Logger logger = C4551D.f16354s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                C4551D.f16354s.finer("Attempting DNS resolution of " + C4551D.this.f16367f);
            }
            c cVar = null;
            try {
                try {
                    C4466x m19422m = C4551D.this.m19422m();
                    AbstractC4430c0.e.a m18899d = AbstractC4430c0.e.m18899d();
                    if (m19422m != null) {
                        if (C4551D.f16354s.isLoggable(level)) {
                            C4551D.f16354s.finer("Using proxy address " + m19422m);
                        }
                        m18899d.m18905b(Collections.singletonList(m19422m));
                    } else {
                        cVar = C4551D.this.m19423n(false);
                        if (cVar.f16380a != null) {
                            this.f16386a.mo18897a(cVar.f16380a);
                            C4551D.this.f16371j.execute(new a(cVar != null && cVar.f16380a == null));
                            return;
                        }
                        if (cVar.f16381b != null) {
                            m18899d.m18905b(cVar.f16381b);
                        }
                        if (cVar.f16382c != null) {
                            m18899d.m18907d(cVar.f16382c);
                        }
                        C4425a c4425a = cVar.f16383d;
                        if (c4425a != null) {
                            m18899d.m18906c(c4425a);
                        }
                    }
                    this.f16386a.mo18898b(m18899d.m18904a());
                    z6 = cVar != null && cVar.f16380a == null;
                    executorC4456p0 = C4551D.this.f16371j;
                    aVar = new a(z6);
                } catch (IOException e7) {
                    this.f16386a.mo18897a(C4448l0.f15810t.m18963q("Unable to resolve host " + C4551D.this.f16367f).m18962p(e7));
                    z6 = 0 != 0 && null.f16380a == null;
                    executorC4456p0 = C4551D.this.f16371j;
                    aVar = new a(z6);
                }
                executorC4456p0.execute(aVar);
            } catch (Throwable th) {
                C4551D.this.f16371j.execute(new a(0 != 0 && null.f16380a == null));
                throw th;
            }
        }
    }

    /* renamed from: i5.D$f */
    public interface f {
    }

    /* renamed from: i5.D$g */
    public interface g {
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f16356u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f16357v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f16358w = property3;
        f16359x = Boolean.parseBoolean(property);
        f16360y = Boolean.parseBoolean(property2);
        f16361z = Boolean.parseBoolean(property3);
        m19416u(C4551D.class.getClassLoader());
    }

    public C4551D(String str, String str2, AbstractC4430c0.a aVar, C4570M0.d dVar, C2937t c2937t, boolean z6) {
        AbstractC2932o.m10573p(aVar, "args");
        this.f16369h = dVar;
        URI create = URI.create("//" + ((String) AbstractC2932o.m10573p(str2, "name")));
        AbstractC2932o.m10568k(create.getHost() != null, "Invalid DNS name: %s", str2);
        this.f16366e = (String) AbstractC2932o.m10574q(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.f16367f = create.getHost();
        if (create.getPort() == -1) {
            this.f16368g = aVar.m18876a();
        } else {
            this.f16368g = create.getPort();
        }
        this.f16362a = (InterfaceC4440h0) AbstractC2932o.m10573p(aVar.m18878c(), "proxyDetector");
        this.f16370i = m19414r(z6);
        this.f16372k = (C2937t) AbstractC2932o.m10573p(c2937t, "stopwatch");
        this.f16371j = (ExecutorC4456p0) AbstractC2932o.m10573p(aVar.m18881f(), "syncContext");
        Executor m18877b = aVar.m18877b();
        this.f16375n = m18877b;
        this.f16376o = m18877b == null;
        this.f16377p = (AbstractC4430c0.f) AbstractC2932o.m10573p(aVar.m18880e(), "serviceConfigParser");
    }

    /* renamed from: B */
    public static boolean m19403B(boolean z6, boolean z7, String str) {
        if (!z6) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z7;
        }
        if (str.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
            return false;
        }
        boolean z8 = true;
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt != '.') {
                z8 &= charAt >= '0' && charAt <= '9';
            }
        }
        return true ^ z8;
    }

    /* renamed from: o */
    public static final List m19411o(Map map) {
        return AbstractC4599c0.m19827g(map, "clientLanguage");
    }

    /* renamed from: p */
    public static final List m19412p(Map map) {
        return AbstractC4599c0.m19827g(map, "clientHostname");
    }

    /* renamed from: q */
    public static String m19413q() {
        if (f16353A == null) {
            try {
                f16353A = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e7) {
                throw new RuntimeException(e7);
            }
        }
        return f16353A;
    }

    /* renamed from: r */
    public static long m19414r(boolean z6) {
        if (z6) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j7 = 30;
        if (property != null) {
            try {
                j7 = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f16354s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j7 > 0 ? TimeUnit.SECONDS.toNanos(j7) : j7;
    }

    /* renamed from: s */
    public static final Double m19415s(Map map) {
        return AbstractC4599c0.m19828h(map, "percentage");
    }

    /* renamed from: u */
    public static g m19416u(ClassLoader classLoader) {
        try {
            try {
                try {
                    AbstractC4094d.m17162a(Class.forName("i5.a0", true, classLoader).asSubclass(g.class).getConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e7) {
                    f16354s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e7);
                    return null;
                }
            } catch (Exception e8) {
                f16354s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e8);
                return null;
            }
        } catch (ClassCastException e9) {
            f16354s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e9);
            return null;
        } catch (ClassNotFoundException e10) {
            f16354s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e10);
            return null;
        }
    }

    /* renamed from: v */
    public static Map m19417v(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            AbstractC2916A.m10503a(f16355t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List m19411o = m19411o(map);
        if (m19411o != null && !m19411o.isEmpty()) {
            Iterator it = m19411o.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double m19415s = m19415s(map);
        if (m19415s != null) {
            int intValue = m19415s.intValue();
            AbstractC2916A.m10503a(intValue >= 0 && intValue <= 100, "Bad percentage: %s", m19415s);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List m19412p = m19412p(map);
        if (m19412p != null && !m19412p.isEmpty()) {
            Iterator it2 = m19412p.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map m19830j = AbstractC4599c0.m19830j(map, "serviceConfig");
        if (m19830j != null) {
            return m19830j;
        }
        throw new C2917B(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    /* renamed from: w */
    public static AbstractC4430c0.b m19418w(List list, Random random, String str) {
        try {
            Iterator it = m19419x(list).iterator();
            Map map = null;
            while (it.hasNext()) {
                try {
                    map = m19417v((Map) it.next(), random, str);
                    if (map != null) {
                        break;
                    }
                } catch (RuntimeException e7) {
                    return AbstractC4430c0.b.m18892b(C4448l0.f15797g.m18963q("failed to pick service config choice").m18962p(e7));
                }
            }
            if (map == null) {
                return null;
            }
            return AbstractC4430c0.b.m18891a(map);
        } catch (IOException | RuntimeException e8) {
            return AbstractC4430c0.b.m18892b(C4448l0.f15797g.m18963q("failed to parse TXT records").m18962p(e8));
        }
    }

    /* renamed from: x */
    public static List m19419x(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                Object m19795a = AbstractC4597b0.m19795a(str.substring(12));
                if (!(m19795a instanceof List)) {
                    throw new ClassCastException("wrong type " + m19795a);
                }
                arrayList.addAll(AbstractC4599c0.m19821a((List) m19795a));
            } else {
                f16354s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public final AbstractC4430c0.b m19420A() {
        List emptyList = Collections.emptyList();
        m19424t();
        if (emptyList.isEmpty()) {
            f16354s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f16367f});
            return null;
        }
        AbstractC4430c0.b m19418w = m19418w(emptyList, this.f16363b, m19413q());
        if (m19418w != null) {
            return m19418w.m18894d() != null ? AbstractC4430c0.b.m18892b(m19418w.m18894d()) : this.f16377p.mo18908a((Map) m19418w.m18893c());
        }
        return null;
    }

    @Override // p237g5.AbstractC4430c0
    /* renamed from: a */
    public String mo18871a() {
        return this.f16366e;
    }

    @Override // p237g5.AbstractC4430c0
    /* renamed from: b */
    public void mo18872b() {
        AbstractC2932o.m10579v(this.f16379r != null, "not started");
        m19425y();
    }

    @Override // p237g5.AbstractC4430c0
    /* renamed from: c */
    public void mo18873c() {
        if (this.f16374m) {
            return;
        }
        this.f16374m = true;
        Executor executor = this.f16375n;
        if (executor == null || !this.f16376o) {
            return;
        }
        this.f16375n = (Executor) C4570M0.m19569f(this.f16369h, executor);
    }

    @Override // p237g5.AbstractC4430c0
    /* renamed from: d */
    public void mo18874d(AbstractC4430c0.d dVar) {
        AbstractC2932o.m10579v(this.f16379r == null, "already started");
        if (this.f16376o) {
            this.f16375n = (Executor) C4570M0.m19568d(this.f16369h);
        }
        this.f16379r = (AbstractC4430c0.d) AbstractC2932o.m10573p(dVar, "listener");
        m19425y();
    }

    /* renamed from: l */
    public final boolean m19421l() {
        if (this.f16373l) {
            long j7 = this.f16370i;
            if (j7 != 0 && (j7 <= 0 || this.f16372k.m10603d(TimeUnit.NANOSECONDS) <= this.f16370i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final C4466x m19422m() {
        AbstractC4438g0 mo18926a = this.f16362a.mo18926a(InetSocketAddress.createUnresolved(this.f16367f, this.f16368g));
        if (mo18926a != null) {
            return new C4466x(mo18926a);
        }
        return null;
    }

    /* renamed from: n */
    public c m19423n(boolean z6) {
        c cVar = new c();
        try {
            cVar.f16381b = m19426z();
        } catch (Exception e7) {
            if (!z6) {
                cVar.f16380a = C4448l0.f15810t.m18963q("Unable to resolve host " + this.f16367f).m18962p(e7);
                return cVar;
            }
        }
        if (f16361z) {
            cVar.f16382c = m19420A();
        }
        return cVar;
    }

    /* renamed from: t */
    public f m19424t() {
        if (!m19403B(f16359x, f16360y, this.f16367f)) {
            return null;
        }
        AbstractC4094d.m17162a(this.f16365d.get());
        return null;
    }

    /* renamed from: y */
    public final void m19425y() {
        if (this.f16378q || this.f16374m || !m19421l()) {
            return;
        }
        this.f16378q = true;
        this.f16375n.execute(new e(this.f16379r));
    }

    /* renamed from: z */
    public final List m19426z() {
        Exception e7 = null;
        try {
            try {
                List mo19427b = this.f16364c.mo19427b(this.f16367f);
                ArrayList arrayList = new ArrayList(mo19427b.size());
                Iterator it = mo19427b.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C4466x(new InetSocketAddress((InetAddress) it.next(), this.f16368g)));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            } catch (Exception e8) {
                e7 = e8;
                AbstractC2942y.m10620f(e7);
                throw new RuntimeException(e7);
            }
        } catch (Throwable th) {
            if (e7 != null) {
                f16354s.log(Level.FINE, "Address resolution failure", (Throwable) e7);
            }
            throw th;
        }
    }
}
