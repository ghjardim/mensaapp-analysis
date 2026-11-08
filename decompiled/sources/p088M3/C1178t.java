package p088M3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p095N3.C1264d;
import p116Q3.AbstractC2133b;
import p272k4.C5413D;
import p272k4.C5438u;

/* renamed from: M3.t */
/* loaded from: classes.dex */
public final class C1178t implements Cloneable {

    /* renamed from: a */
    public C5413D f3790a;

    /* renamed from: b */
    public final Map f3791b;

    public C1178t(C5413D c5413d) {
        this.f3791b = new HashMap();
        AbstractC2133b.m7217d(c5413d.m22463w0() == C5413D.c.MAP_VALUE, "ObjectValues should be backed by a MapValue", new Object[0]);
        AbstractC2133b.m7217d(!AbstractC1180v.m4569c(c5413d), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f3790a = c5413d;
    }

    /* renamed from: g */
    public static C1178t m4551g(Map map) {
        return new C1178t((C5413D) C5413D.m22443x0().m22470E(C5438u.m22735j0().m22741x(map)).m17059n());
    }

    /* renamed from: a */
    public final C5438u m4552a(C1176r c1176r, Map map) {
        C5413D m4557f = m4557f(this.f3790a, c1176r);
        C5438u.b m22735j0 = AbstractC1184z.m4614x(m4557f) ? (C5438u.b) m4557f.m22459s0().m17047Y() : C5438u.m22735j0();
        boolean z6 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                C5438u m4552a = m4552a((C1176r) c1176r.m4463f(str), (Map) value);
                if (m4552a != null) {
                    m22735j0.m22742y(str, (C5413D) C5413D.m22443x0().m22471F(m4552a).m17059n());
                    z6 = true;
                }
            } else {
                if (value instanceof C5413D) {
                    m22735j0.m22742y(str, (C5413D) value);
                } else if (m22735j0.m22740w(str)) {
                    AbstractC2133b.m7217d(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                    m22735j0.m22743z(str);
                }
                z6 = true;
            }
        }
        if (z6) {
            return (C5438u) m22735j0.m17059n();
        }
        return null;
    }

    /* renamed from: b */
    public final C5413D m4553b() {
        synchronized (this.f3791b) {
            try {
                C5438u m4552a = m4552a(C1176r.f3774c, this.f3791b);
                if (m4552a != null) {
                    this.f3790a = (C5413D) C5413D.m22443x0().m22471F(m4552a).m17059n();
                    this.f3791b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f3790a;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1178t clone() {
        return new C1178t(m4553b());
    }

    /* renamed from: d */
    public void m4555d(C1176r c1176r) {
        AbstractC2133b.m7217d(!c1176r.m4469n(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        m4563n(c1176r, null);
    }

    /* renamed from: e */
    public final C1264d m4556e(C5438u c5438u) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : c5438u.m22737d0().entrySet()) {
            C1176r m4534w = C1176r.m4534w((String) entry.getKey());
            if (AbstractC1184z.m4614x((C5413D) entry.getValue())) {
                Set m4829c = m4556e(((C5413D) entry.getValue()).m22459s0()).m4829c();
                if (m4829c.isEmpty()) {
                    hashSet.add(m4534w);
                } else {
                    Iterator it = m4829c.iterator();
                    while (it.hasNext()) {
                        hashSet.add((C1176r) m4534w.m4462b((C1176r) it.next()));
                    }
                }
            } else {
                hashSet.add(m4534w);
            }
        }
        return C1264d.m4827b(hashSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1178t) {
            return AbstractC1184z.m4608r(m4553b(), ((C1178t) obj).m4553b());
        }
        return false;
    }

    /* renamed from: f */
    public final C5413D m4557f(C5413D c5413d, C1176r c1176r) {
        if (c1176r.m4469n()) {
            return c5413d;
        }
        for (int i7 = 0; i7 < c1176r.m4471q() - 1; i7++) {
            c5413d = c5413d.m22459s0().m22738e0(c1176r.m4468m(i7), null);
            if (!AbstractC1184z.m4614x(c5413d)) {
                return null;
            }
        }
        return c5413d.m22459s0().m22738e0(c1176r.m4467l(), null);
    }

    public int hashCode() {
        return m4553b().hashCode();
    }

    /* renamed from: i */
    public C5413D m4558i(C1176r c1176r) {
        return m4557f(m4553b(), c1176r);
    }

    /* renamed from: j */
    public C1264d m4559j() {
        return m4556e(m4553b().m22459s0());
    }

    /* renamed from: k */
    public Map m4560k() {
        return m4553b().m22459s0().m22737d0();
    }

    /* renamed from: l */
    public void m4561l(C1176r c1176r, C5413D c5413d) {
        AbstractC2133b.m7217d(!c1176r.m4469n(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        m4563n(c1176r, c5413d);
    }

    /* renamed from: m */
    public void m4562m(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            C1176r c1176r = (C1176r) entry.getKey();
            if (entry.getValue() == null) {
                m4555d(c1176r);
            } else {
                m4561l(c1176r, (C5413D) entry.getValue());
            }
        }
    }

    /* renamed from: n */
    public final void m4563n(C1176r c1176r, C5413D c5413d) {
        Map hashMap;
        Map map = this.f3791b;
        for (int i7 = 0; i7 < c1176r.m4471q() - 1; i7++) {
            String m4468m = c1176r.m4468m(i7);
            Object obj = map.get(m4468m);
            if (obj instanceof Map) {
                hashMap = (Map) obj;
            } else {
                if (obj instanceof C5413D) {
                    C5413D c5413d2 = (C5413D) obj;
                    if (c5413d2.m22463w0() == C5413D.c.MAP_VALUE) {
                        HashMap hashMap2 = new HashMap(c5413d2.m22459s0().m22737d0());
                        map.put(m4468m, hashMap2);
                        map = hashMap2;
                    }
                }
                hashMap = new HashMap();
                map.put(m4468m, hashMap);
            }
            map = hashMap;
        }
        map.put(c1176r.m4467l(), c5413d);
    }

    public String toString() {
        return "ObjectValue{internalValue=" + AbstractC1184z.m4592b(m4553b()) + '}';
    }

    public C1178t() {
        this((C5413D) C5413D.m22443x0().m22471F(C5438u.m22731b0()).m17059n());
    }
}
