package p253i5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p171Y2.AbstractC2938u;
import p237g5.AbstractC4406G;
import p237g5.AbstractC4417S;
import p237g5.C4426a0;
import p237g5.C4429c;
import p253i5.AbstractC4552D0;
import p256j$.util.DesugarCollections;

/* renamed from: i5.k0 */
/* loaded from: classes2.dex */
public final class C4615k0 {

    /* renamed from: a */
    public final b f17058a;

    /* renamed from: b */
    public final Map f17059b;

    /* renamed from: c */
    public final Map f17060c;

    /* renamed from: d */
    public final AbstractC4552D0.D f17061d;

    /* renamed from: e */
    public final Object f17062e;

    /* renamed from: f */
    public final Map f17063f;

    /* renamed from: i5.k0$b */
    public static final class b {

        /* renamed from: g */
        public static final C4429c.c f17064g = C4429c.c.m18870b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a */
        public final Long f17065a;

        /* renamed from: b */
        public final Boolean f17066b;

        /* renamed from: c */
        public final Integer f17067c;

        /* renamed from: d */
        public final Integer f17068d;

        /* renamed from: e */
        public final C4554E0 f17069e;

        /* renamed from: f */
        public final C4584U f17070f;

        public b(Map map, boolean z6, int i7, int i8) {
            this.f17065a = AbstractC4568L0.m19557w(map);
            this.f17066b = AbstractC4568L0.m19558x(map);
            Integer m19546l = AbstractC4568L0.m19546l(map);
            this.f17067c = m19546l;
            if (m19546l != null) {
                AbstractC2932o.m10568k(m19546l.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", m19546l);
            }
            Integer m19545k = AbstractC4568L0.m19545k(map);
            this.f17068d = m19545k;
            if (m19545k != null) {
                AbstractC2932o.m10568k(m19545k.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", m19545k);
            }
            Map m19552r = z6 ? AbstractC4568L0.m19552r(map) : null;
            this.f17069e = m19552r == null ? null : m20007b(m19552r, i7);
            Map m19538d = z6 ? AbstractC4568L0.m19538d(map) : null;
            this.f17070f = m19538d != null ? m20006a(m19538d, i8) : null;
        }

        /* renamed from: a */
        public static C4584U m20006a(Map map, int i7) {
            int intValue = ((Integer) AbstractC2932o.m10573p(AbstractC4568L0.m19542h(map), "maxAttempts cannot be empty")).intValue();
            AbstractC2932o.m10565h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i7);
            long longValue = ((Long) AbstractC2932o.m10573p(AbstractC4568L0.m19537c(map), "hedgingDelay cannot be empty")).longValue();
            AbstractC2932o.m10567j(longValue >= 0, "hedgingDelay must not be negative: %s", longValue);
            return new C4584U(min, longValue, AbstractC4568L0.m19550p(map));
        }

        /* renamed from: b */
        public static C4554E0 m20007b(Map map, int i7) {
            int intValue = ((Integer) AbstractC2932o.m10573p(AbstractC4568L0.m19543i(map), "maxAttempts cannot be empty")).intValue();
            AbstractC2932o.m10565h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i7);
            long longValue = ((Long) AbstractC2932o.m10573p(AbstractC4568L0.m19539e(map), "initialBackoff cannot be empty")).longValue();
            AbstractC2932o.m10567j(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) AbstractC2932o.m10573p(AbstractC4568L0.m19544j(map), "maxBackoff cannot be empty")).longValue();
            AbstractC2932o.m10567j(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            Double d7 = (Double) AbstractC2932o.m10573p(AbstractC4568L0.m19535a(map), "backoffMultiplier cannot be empty");
            double doubleValue = d7.doubleValue();
            AbstractC2932o.m10568k(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d7);
            Long m19551q = AbstractC4568L0.m19551q(map);
            AbstractC2932o.m10568k(m19551q == null || m19551q.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", m19551q);
            Set m19553s = AbstractC4568L0.m19553s(map);
            AbstractC2932o.m10562e((m19551q == null && m19553s.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new C4554E0(min, longValue, longValue2, doubleValue, m19551q, m19553s);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC2928k.m10550a(this.f17065a, bVar.f17065a) && AbstractC2928k.m10550a(this.f17066b, bVar.f17066b) && AbstractC2928k.m10550a(this.f17067c, bVar.f17067c) && AbstractC2928k.m10550a(this.f17068d, bVar.f17068d) && AbstractC2928k.m10550a(this.f17069e, bVar.f17069e) && AbstractC2928k.m10550a(this.f17070f, bVar.f17070f);
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(this.f17065a, this.f17066b, this.f17067c, this.f17068d, this.f17069e, this.f17070f);
        }

        public String toString() {
            return AbstractC2926i.m10535c(this).m10540d("timeoutNanos", this.f17065a).m10540d("waitForReady", this.f17066b).m10540d("maxInboundMessageSize", this.f17067c).m10540d("maxOutboundMessageSize", this.f17068d).m10540d("retryPolicy", this.f17069e).m10540d("hedgingPolicy", this.f17070f).toString();
        }
    }

    /* renamed from: i5.k0$c */
    public static final class c extends AbstractC4406G {

        /* renamed from: b */
        public final C4615k0 f17071b;

        @Override // p237g5.AbstractC4406G
        /* renamed from: a */
        public AbstractC4406G.b mo18655a(AbstractC4417S.g gVar) {
            return AbstractC4406G.b.m18656d().m18661b(this.f17071b).m18660a();
        }

        public c(C4615k0 c4615k0) {
            this.f17071b = c4615k0;
        }
    }

    public C4615k0(b bVar, Map map, Map map2, AbstractC4552D0.D d7, Object obj, Map map3) {
        this.f17058a = bVar;
        this.f17059b = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f17060c = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.f17061d = d7;
        this.f17062e = obj;
        this.f17063f = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* renamed from: a */
    public static C4615k0 m19999a() {
        return new C4615k0(null, new HashMap(), new HashMap(), null, null, null);
    }

    /* renamed from: b */
    public static C4615k0 m20000b(Map map, boolean z6, int i7, int i8, Object obj) {
        AbstractC4552D0.D m19556v = z6 ? AbstractC4568L0.m19556v(map) : null;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map m19536b = AbstractC4568L0.m19536b(map);
        List<Map> m19547m = AbstractC4568L0.m19547m(map);
        if (m19547m == null) {
            return new C4615k0(null, hashMap, hashMap2, m19556v, obj, m19536b);
        }
        b bVar = null;
        for (Map map2 : m19547m) {
            b bVar2 = new b(map2, z6, i7, i8);
            List<Map> m19549o = AbstractC4568L0.m19549o(map2);
            if (m19549o != null && !m19549o.isEmpty()) {
                for (Map map3 : m19549o) {
                    String m19554t = AbstractC4568L0.m19554t(map3);
                    String m19548n = AbstractC4568L0.m19548n(map3);
                    if (AbstractC2938u.m10607a(m19554t)) {
                        AbstractC2932o.m10568k(AbstractC2938u.m10607a(m19548n), "missing service name for method %s", m19548n);
                        AbstractC2932o.m10568k(bVar == null, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (AbstractC2938u.m10607a(m19548n)) {
                        AbstractC2932o.m10568k(!hashMap2.containsKey(m19554t), "Duplicate service %s", m19554t);
                        hashMap2.put(m19554t, bVar2);
                    } else {
                        String m18827b = C4426a0.m18827b(m19554t, m19548n);
                        AbstractC2932o.m10568k(!hashMap.containsKey(m18827b), "Duplicate method name %s", m18827b);
                        hashMap.put(m18827b, bVar2);
                    }
                }
            }
        }
        return new C4615k0(bVar, hashMap, hashMap2, m19556v, obj, m19536b);
    }

    /* renamed from: c */
    public AbstractC4406G m20001c() {
        if (this.f17060c.isEmpty() && this.f17059b.isEmpty() && this.f17058a == null) {
            return null;
        }
        return new c();
    }

    /* renamed from: d */
    public Map m20002d() {
        return this.f17063f;
    }

    /* renamed from: e */
    public Object m20003e() {
        return this.f17062e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4615k0.class != obj.getClass()) {
            return false;
        }
        C4615k0 c4615k0 = (C4615k0) obj;
        return AbstractC2928k.m10550a(this.f17058a, c4615k0.f17058a) && AbstractC2928k.m10550a(this.f17059b, c4615k0.f17059b) && AbstractC2928k.m10550a(this.f17060c, c4615k0.f17060c) && AbstractC2928k.m10550a(this.f17061d, c4615k0.f17061d) && AbstractC2928k.m10550a(this.f17062e, c4615k0.f17062e);
    }

    /* renamed from: f */
    public b m20004f(C4426a0 c4426a0) {
        b bVar = (b) this.f17059b.get(c4426a0.m18830c());
        if (bVar == null) {
            bVar = (b) this.f17060c.get(c4426a0.m18831d());
        }
        return bVar == null ? this.f17058a : bVar;
    }

    /* renamed from: g */
    public AbstractC4552D0.D m20005g() {
        return this.f17061d;
    }

    public int hashCode() {
        return AbstractC2928k.m10551b(this.f17058a, this.f17059b, this.f17060c, this.f17061d, this.f17062e);
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10540d("defaultMethodConfig", this.f17058a).m10540d("serviceMethodMap", this.f17059b).m10540d("serviceMap", this.f17060c).m10540d("retryThrottling", this.f17061d).m10540d("loadBalancingConfig", this.f17062e).toString();
    }
}
