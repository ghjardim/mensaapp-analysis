package p046G3;

import com.google.firebase.firestore.C3949c;
import com.google.protobuf.C4078t0;
import com.google.protobuf.EnumC4048e0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p046G3.AbstractC0453u;
import p067J3.C0767r0;
import p067J3.C0769s0;
import p067J3.C0771t0;
import p067J3.C0773u0;
import p067J3.EnumC0775v0;
import p088M3.AbstractC1184z;
import p088M3.C1164f;
import p088M3.C1176r;
import p088M3.C1178t;
import p095N3.AbstractC1261a;
import p095N3.C1264d;
import p095N3.C1270j;
import p095N3.C1274n;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2146o;
import p116Q3.AbstractC2157z;
import p219e3.C4188r;
import p272k4.C5413D;
import p272k4.C5419b;
import p272k4.C5438u;
import p304o4.C5940a;

/* renamed from: G3.y0 */
/* loaded from: classes.dex */
public final class C0462y0 {

    /* renamed from: a */
    public final C1164f f1628a;

    public C0462y0(C1164f c1164f) {
        this.f1628a = c1164f;
    }

    /* renamed from: a */
    public final C1178t m1693a(Object obj, C0769s0 c0769s0) {
        if (obj.getClass().isArray()) {
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
        }
        C5413D m1696d = m1696d(AbstractC2146o.m7273c(obj), c0769s0);
        if (m1696d.m22463w0() == C5413D.c.MAP_VALUE) {
            return new C1178t(m1696d);
        }
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: " + AbstractC2131I.m7184D(obj));
    }

    /* renamed from: b */
    public C5413D m1694b(Object obj, C0769s0 c0769s0) {
        return m1696d(AbstractC2146o.m7273c(obj), c0769s0);
    }

    /* renamed from: c */
    public final List m1695c(List list) {
        C0767r0 c0767r0 = new C0767r0(EnumC0775v0.Argument);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(m1694b(list.get(i7), c0767r0.m3291f().m3298c(i7)));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final C5413D m1696d(Object obj, C0769s0 c0769s0) {
        if (obj instanceof Map) {
            return m1698f((Map) obj, c0769s0);
        }
        if (obj instanceof AbstractC0453u) {
            m1703k((AbstractC0453u) obj, c0769s0);
            return null;
        }
        if (c0769s0.m3303h() != null) {
            c0769s0.m3296a(c0769s0.m3303h());
        }
        if (!(obj instanceof List)) {
            return m1702j(obj, c0769s0);
        }
        if (!c0769s0.m3304i() || c0769s0.m3302g() == EnumC0775v0.ArrayArgument) {
            return m1697e((List) obj, c0769s0);
        }
        throw c0769s0.m3301f("Nested arrays are not supported");
    }

    /* renamed from: e */
    public final C5413D m1697e(List list, C0769s0 c0769s0) {
        C5419b.b m22551j0 = C5419b.m22551j0();
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            C5413D m1696d = m1696d(it.next(), c0769s0.m3298c(i7));
            if (m1696d == null) {
                m1696d = (C5413D) C5413D.m22443x0().m22472G(EnumC4048e0.NULL_VALUE).m17059n();
            }
            m22551j0.m22561x(m1696d);
            i7++;
        }
        return (C5413D) C5413D.m22443x0().m22477x(m22551j0).m17059n();
    }

    /* renamed from: f */
    public final C5413D m1698f(Map map, C0769s0 c0769s0) {
        if (map.isEmpty()) {
            if (c0769s0.m3303h() != null && !c0769s0.m3303h().m4469n()) {
                c0769s0.m3296a(c0769s0.m3303h());
            }
            return (C5413D) C5413D.m22443x0().m22471F(C5438u.m22731b0()).m17059n();
        }
        C5438u.b m22735j0 = C5438u.m22735j0();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw c0769s0.m3301f(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
            }
            String str = (String) entry.getKey();
            C5413D m1696d = m1696d(entry.getValue(), c0769s0.m3300e(str));
            if (m1696d != null) {
                m22735j0.m22742y(str, m1696d);
            }
        }
        return (C5413D) C5413D.m22443x0().m22470E(m22735j0).m17059n();
    }

    /* renamed from: g */
    public C0771t0 m1699g(Object obj, C1264d c1264d) {
        C0767r0 c0767r0 = new C0767r0(EnumC0775v0.MergeSet);
        C1178t m1693a = m1693a(obj, c0767r0.m3291f());
        if (c1264d == null) {
            return c0767r0.m3292g(m1693a);
        }
        for (C1176r c1176r : c1264d.m4829c()) {
            if (!c0767r0.m3289d(c1176r)) {
                throw new IllegalArgumentException("Field '" + c1176r.toString() + "' is specified in your field mask but not in your input data.");
            }
        }
        return c0767r0.m3293h(m1693a, c1264d);
    }

    /* renamed from: h */
    public C5413D m1700h(Object obj) {
        return m1701i(obj, false);
    }

    /* renamed from: i */
    public C5413D m1701i(Object obj, boolean z6) {
        C0767r0 c0767r0 = new C0767r0(z6 ? EnumC0775v0.ArrayArgument : EnumC0775v0.Argument);
        C5413D m1694b = m1694b(obj, c0767r0.m3291f());
        AbstractC2133b.m7217d(m1694b != null, "Parsed data should not be null.", new Object[0]);
        AbstractC2133b.m7217d(c0767r0.m3290e().isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return m1694b;
    }

    /* renamed from: j */
    public final C5413D m1702j(Object obj, C0769s0 c0769s0) {
        if (obj == null) {
            return (C5413D) C5413D.m22443x0().m22472G(EnumC4048e0.NULL_VALUE).m17059n();
        }
        if (obj instanceof Integer) {
            return (C5413D) C5413D.m22443x0().m22469D(((Integer) obj).intValue()).m17059n();
        }
        if (obj instanceof Long) {
            return (C5413D) C5413D.m22443x0().m22469D(((Long) obj).longValue()).m17059n();
        }
        if (obj instanceof Float) {
            return (C5413D) C5413D.m22443x0().m22467B(((Float) obj).doubleValue()).m17059n();
        }
        if (obj instanceof Double) {
            return (C5413D) C5413D.m22443x0().m22467B(((Double) obj).doubleValue()).m17059n();
        }
        if (obj instanceof Boolean) {
            return (C5413D) C5413D.m22443x0().m22479z(((Boolean) obj).booleanValue()).m17059n();
        }
        if (obj instanceof String) {
            return (C5413D) C5413D.m22443x0().m22474I((String) obj).m17059n();
        }
        if (obj instanceof Date) {
            return m1705m(new C4188r((Date) obj));
        }
        if (obj instanceof C4188r) {
            return m1705m((C4188r) obj);
        }
        if (obj instanceof C0404Q) {
            C0404Q c0404q = (C0404Q) obj;
            return (C5413D) C5413D.m22443x0().m22468C(C5940a.m24961f0().m24966w(c0404q.m1600f()).m24967x(c0404q.m1601g())).m17059n();
        }
        if (obj instanceof C0421e) {
            return (C5413D) C5413D.m22443x0().m22466A(((C0421e) obj).m1637h()).m17059n();
        }
        if (obj instanceof C3949c) {
            C3949c c3949c = (C3949c) obj;
            if (c3949c.m15550p() != null) {
                C1164f m15477B = c3949c.m15550p().m15477B();
                if (!m15477B.equals(this.f1628a)) {
                    throw c0769s0.m3301f(String.format("Document reference is for database %s/%s but should be for database %s/%s", m15477B.m4478i(), m15477B.m4477h(), this.f1628a.m4478i(), this.f1628a.m4477h()));
                }
            }
            return (C5413D) C5413D.m22443x0().m22473H(String.format("projects/%s/databases/%s/documents/%s", this.f1628a.m4478i(), this.f1628a.m4477h(), c3949c.m15552r())).m17059n();
        }
        if (obj instanceof C0464z0) {
            return m1708p((C0464z0) obj, c0769s0);
        }
        if (obj.getClass().isArray()) {
            throw c0769s0.m3301f("Arrays are not supported; use a List instead");
        }
        throw c0769s0.m3301f("Unsupported type: " + AbstractC2131I.m7184D(obj));
    }

    /* renamed from: k */
    public final void m1703k(AbstractC0453u abstractC0453u, C0769s0 c0769s0) {
        if (!c0769s0.m3305j()) {
            throw c0769s0.m3301f(String.format("%s() can only be used with set() and update()", abstractC0453u.mo1685d()));
        }
        if (c0769s0.m3303h() == null) {
            throw c0769s0.m3301f(String.format("%s() is not currently supported inside arrays", abstractC0453u.mo1685d()));
        }
        if (abstractC0453u instanceof AbstractC0453u.c) {
            if (c0769s0.m3302g() == EnumC0775v0.MergeSet) {
                c0769s0.m3296a(c0769s0.m3303h());
                return;
            } else {
                if (c0769s0.m3302g() != EnumC0775v0.Update) {
                    throw c0769s0.m3301f("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
                }
                AbstractC2133b.m7217d(c0769s0.m3303h().m4471q() > 0, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
                throw c0769s0.m3301f("FieldValue.delete() can only appear at the top level of your update data");
            }
        }
        if (abstractC0453u instanceof AbstractC0453u.e) {
            c0769s0.m3297b(c0769s0.m3303h(), C1274n.m4874d());
            return;
        }
        if (abstractC0453u instanceof AbstractC0453u.b) {
            c0769s0.m3297b(c0769s0.m3303h(), new AbstractC1261a.b(m1695c(((AbstractC0453u.b) abstractC0453u).m1687i())));
        } else if (abstractC0453u instanceof AbstractC0453u.a) {
            c0769s0.m3297b(c0769s0.m3303h(), new AbstractC1261a.a(m1695c(((AbstractC0453u.a) abstractC0453u).m1686i())));
        } else {
            if (!(abstractC0453u instanceof AbstractC0453u.d)) {
                throw AbstractC2133b.m7214a("Unknown FieldValue type: %s", AbstractC2131I.m7184D(abstractC0453u));
            }
            c0769s0.m3297b(c0769s0.m3303h(), new C1270j(m1700h(((AbstractC0453u.d) abstractC0453u).m1688i())));
        }
    }

    /* renamed from: l */
    public C0771t0 m1704l(Object obj) {
        C0767r0 c0767r0 = new C0767r0(EnumC0775v0.Set);
        return c0767r0.m3294i(m1693a(obj, c0767r0.m3291f()));
    }

    /* renamed from: m */
    public final C5413D m1705m(C4188r c4188r) {
        return (C5413D) C5413D.m22443x0().m22475J(C4078t0.m16930f0().m16936x(c4188r.m17567h()).m16935w((c4188r.m17566f() / PipesIterator.DEFAULT_QUEUE_SIZE) * PipesIterator.DEFAULT_QUEUE_SIZE)).m17059n();
    }

    /* renamed from: n */
    public C0773u0 m1706n(List list) {
        AbstractC2133b.m7217d(list.size() % 2 == 0, "Expected fieldAndValues to contain an even number of elements", new Object[0]);
        C0767r0 c0767r0 = new C0767r0(EnumC0775v0.Update);
        C0769s0 m3291f = c0767r0.m3291f();
        C1178t c1178t = new C1178t();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z6 = next instanceof String;
            AbstractC2133b.m7217d(z6 || (next instanceof C0451t), "Expected argument to be String or FieldPath.", new Object[0]);
            C1176r m1675c = z6 ? C0451t.m1673b((String) next).m1675c() : ((C0451t) next).m1675c();
            if (next2 instanceof AbstractC0453u.c) {
                m3291f.m3296a(m1675c);
            } else {
                C5413D m1694b = m1694b(next2, m3291f.m3299d(m1675c));
                if (m1694b != null) {
                    m3291f.m3296a(m1675c);
                    c1178t.m4561l(m1675c, m1694b);
                }
            }
        }
        return c0767r0.m3295j(c1178t);
    }

    /* renamed from: o */
    public C0773u0 m1707o(Map map) {
        AbstractC2157z.m7330c(map, "Provided update data must not be null.");
        C0767r0 c0767r0 = new C0767r0(EnumC0775v0.Update);
        C0769s0 m3291f = c0767r0.m3291f();
        C1178t c1178t = new C1178t();
        for (Map.Entry entry : map.entrySet()) {
            C1176r m1675c = C0451t.m1673b((String) entry.getKey()).m1675c();
            Object value = entry.getValue();
            if (value instanceof AbstractC0453u.c) {
                m3291f.m3296a(m1675c);
            } else {
                C5413D m1694b = m1694b(value, m3291f.m3299d(m1675c));
                if (m1694b != null) {
                    m3291f.m3296a(m1675c);
                    c1178t.m4561l(m1675c, m1694b);
                }
            }
        }
        return c0767r0.m3295j(c1178t);
    }

    /* renamed from: p */
    public final C5413D m1708p(C0464z0 c0464z0, C0769s0 c0769s0) {
        C5438u.b m22735j0 = C5438u.m22735j0();
        m22735j0.m22742y("__type__", AbstractC1184z.f3804f);
        m22735j0.m22742y(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, m1696d(c0464z0.m1710b(), c0769s0));
        return (C5413D) C5413D.m22443x0().m22470E(m22735j0).m17059n();
    }
}
