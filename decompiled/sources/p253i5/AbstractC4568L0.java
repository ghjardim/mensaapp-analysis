package p253i5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2916A;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p171Y2.C2917B;
import p237g5.AbstractC4418T;
import p237g5.AbstractC4430c0;
import p237g5.C4419U;
import p237g5.C4448l0;
import p253i5.AbstractC4552D0;
import p256j$.util.DesugarCollections;

/* renamed from: i5.L0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4568L0 {

    /* renamed from: i5.L0$a */
    public static final class a {

        /* renamed from: a */
        public final String f16543a;

        /* renamed from: b */
        public final Map f16544b;

        public a(String str, Map map) {
            this.f16543a = (String) AbstractC2932o.m10573p(str, "policyName");
            this.f16544b = (Map) AbstractC2932o.m10573p(map, "rawConfigValue");
        }

        /* renamed from: a */
        public String m19561a() {
            return this.f16543a;
        }

        /* renamed from: b */
        public Map m19562b() {
            return this.f16544b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16543a.equals(aVar.f16543a) && this.f16544b.equals(aVar.f16544b);
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(this.f16543a, this.f16544b);
        }

        public String toString() {
            return AbstractC2926i.m10535c(this).m10540d("policyName", this.f16543a).m10540d("rawConfigValue", this.f16544b).toString();
        }
    }

    /* renamed from: i5.L0$b */
    public static final class b {

        /* renamed from: a */
        public final AbstractC4418T f16545a;

        /* renamed from: b */
        public final Object f16546b;

        public b(AbstractC4418T abstractC4418T, Object obj) {
            this.f16545a = (AbstractC4418T) AbstractC2932o.m10573p(abstractC4418T, "provider");
            this.f16546b = obj;
        }

        /* renamed from: a */
        public Object m19563a() {
            return this.f16546b;
        }

        /* renamed from: b */
        public AbstractC4418T m19564b() {
            return this.f16545a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC2928k.m10550a(this.f16545a, bVar.f16545a) && AbstractC2928k.m10550a(this.f16546b, bVar.f16546b);
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(this.f16545a, this.f16546b);
        }

        public String toString() {
            return AbstractC2926i.m10535c(this).m10540d("provider", this.f16545a).m10540d("config", this.f16546b).toString();
        }
    }

    /* renamed from: A */
    public static List m19534A(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m19560z((Map) it.next()));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static Double m19535a(Map map) {
        return AbstractC4599c0.m19828h(map, "backoffMultiplier");
    }

    /* renamed from: b */
    public static Map m19536b(Map map) {
        if (map == null) {
            return null;
        }
        return AbstractC4599c0.m19830j(map, "healthCheckConfig");
    }

    /* renamed from: c */
    public static Long m19537c(Map map) {
        return AbstractC4599c0.m19832l(map, "hedgingDelay");
    }

    /* renamed from: d */
    public static Map m19538d(Map map) {
        return AbstractC4599c0.m19830j(map, "hedgingPolicy");
    }

    /* renamed from: e */
    public static Long m19539e(Map map) {
        return AbstractC4599c0.m19832l(map, "initialBackoff");
    }

    /* renamed from: f */
    public static Set m19540f(Map map, String str) {
        List m19825e = AbstractC4599c0.m19825e(map, str);
        if (m19825e == null) {
            return null;
        }
        return m19555u(m19825e);
    }

    /* renamed from: g */
    public static List m19541g(Map map) {
        String m19831k;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(AbstractC4599c0.m19826f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (m19831k = AbstractC4599c0.m19831k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(m19831k.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* renamed from: h */
    public static Integer m19542h(Map map) {
        return AbstractC4599c0.m19829i(map, "maxAttempts");
    }

    /* renamed from: i */
    public static Integer m19543i(Map map) {
        return AbstractC4599c0.m19829i(map, "maxAttempts");
    }

    /* renamed from: j */
    public static Long m19544j(Map map) {
        return AbstractC4599c0.m19832l(map, "maxBackoff");
    }

    /* renamed from: k */
    public static Integer m19545k(Map map) {
        return AbstractC4599c0.m19829i(map, "maxRequestMessageBytes");
    }

    /* renamed from: l */
    public static Integer m19546l(Map map) {
        return AbstractC4599c0.m19829i(map, "maxResponseMessageBytes");
    }

    /* renamed from: m */
    public static List m19547m(Map map) {
        return AbstractC4599c0.m19826f(map, "methodConfig");
    }

    /* renamed from: n */
    public static String m19548n(Map map) {
        return AbstractC4599c0.m19831k(map, "method");
    }

    /* renamed from: o */
    public static List m19549o(Map map) {
        return AbstractC4599c0.m19826f(map, "name");
    }

    /* renamed from: p */
    public static Set m19550p(Map map) {
        Set m19540f = m19540f(map, "nonFatalStatusCodes");
        if (m19540f == null) {
            return DesugarCollections.unmodifiableSet(EnumSet.noneOf(C4448l0.b.class));
        }
        AbstractC2916A.m10503a(!m19540f.contains(C4448l0.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return m19540f;
    }

    /* renamed from: q */
    public static Long m19551q(Map map) {
        return AbstractC4599c0.m19832l(map, "perAttemptRecvTimeout");
    }

    /* renamed from: r */
    public static Map m19552r(Map map) {
        return AbstractC4599c0.m19830j(map, "retryPolicy");
    }

    /* renamed from: s */
    public static Set m19553s(Map map) {
        Set m19540f = m19540f(map, "retryableStatusCodes");
        AbstractC2916A.m10503a(m19540f != null, "%s is required in retry policy", "retryableStatusCodes");
        AbstractC2916A.m10503a(true ^ m19540f.contains(C4448l0.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return m19540f;
    }

    /* renamed from: t */
    public static String m19554t(Map map) {
        return AbstractC4599c0.m19831k(map, "service");
    }

    /* renamed from: u */
    public static Set m19555u(List list) {
        C4448l0.b valueOf;
        EnumSet noneOf = EnumSet.noneOf(C4448l0.b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d7 = (Double) obj;
                int intValue = d7.intValue();
                AbstractC2916A.m10503a(((double) intValue) == d7.doubleValue(), "Status code %s is not integral", obj);
                valueOf = C4448l0.m18951h(intValue).m18959m();
                AbstractC2916A.m10503a(valueOf.m18966g() == d7.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new C2917B("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    valueOf = C4448l0.b.valueOf((String) obj);
                } catch (IllegalArgumentException e7) {
                    throw new C2917B("Status code " + obj + " is not valid", e7);
                }
            }
            noneOf.add(valueOf);
        }
        return DesugarCollections.unmodifiableSet(noneOf);
    }

    /* renamed from: v */
    public static AbstractC4552D0.D m19556v(Map map) {
        Map m19830j;
        if (map == null || (m19830j = AbstractC4599c0.m19830j(map, "retryThrottling")) == null) {
            return null;
        }
        float floatValue = AbstractC4599c0.m19828h(m19830j, "maxTokens").floatValue();
        float floatValue2 = AbstractC4599c0.m19828h(m19830j, "tokenRatio").floatValue();
        AbstractC2932o.m10579v(floatValue > 0.0f, "maxToken should be greater than zero");
        AbstractC2932o.m10579v(floatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new AbstractC4552D0.D(floatValue, floatValue2);
    }

    /* renamed from: w */
    public static Long m19557w(Map map) {
        return AbstractC4599c0.m19832l(map, "timeout");
    }

    /* renamed from: x */
    public static Boolean m19558x(Map map) {
        return AbstractC4599c0.m19824d(map, "waitForReady");
    }

    /* renamed from: y */
    public static AbstractC4430c0.b m19559y(List list, C4419U c4419u) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            String m19561a = aVar.m19561a();
            AbstractC4418T m18743d = c4419u.m18743d(m19561a);
            if (m18743d != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(AbstractC4568L0.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                AbstractC4430c0.b mo18739e = m18743d.mo18739e(aVar.m19562b());
                return mo18739e.m18894d() != null ? mo18739e : AbstractC4430c0.b.m18891a(new b(m18743d, mo18739e.m18893c()));
            }
            arrayList.add(m19561a);
        }
        return AbstractC4430c0.b.m18892b(C4448l0.f15797g.m18963q("None of " + arrayList + " specified by Service Config are available."));
    }

    /* renamed from: z */
    public static a m19560z(Map map) {
        if (map.size() == 1) {
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            return new a(str, AbstractC4599c0.m19830j(map, str));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
