package p088M3;

import com.google.android.gms.common.api.C3643a;
import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.C4078t0;
import com.google.protobuf.EnumC4048e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p272k4.C5413D;
import p272k4.C5419b;
import p272k4.C5438u;
import p272k4.InterfaceC5420c;
import p304o4.C5940a;

/* renamed from: M3.z */
/* loaded from: classes.dex */
public abstract class AbstractC1184z {

    /* renamed from: a */
    public static final C5413D f3799a = (C5413D) C5413D.m22443x0().m22467B(Double.NaN).m17059n();

    /* renamed from: b */
    public static final C5413D f3800b;

    /* renamed from: c */
    public static final C5413D f3801c;

    /* renamed from: d */
    public static final C5413D f3802d;

    /* renamed from: e */
    public static final C5413D f3803e;

    /* renamed from: f */
    public static final C5413D f3804f;

    /* renamed from: g */
    public static final C5413D f3805g;

    /* renamed from: h */
    public static C5413D f3806h;

    /* renamed from: i */
    public static C5413D f3807i;

    /* renamed from: j */
    public static C5413D f3808j;

    /* renamed from: k */
    public static C5413D f3809k;

    /* renamed from: l */
    public static C5413D f3810l;

    /* renamed from: m */
    public static C5413D f3811m;

    /* renamed from: n */
    public static C5413D f3812n;

    /* renamed from: o */
    public static C5413D f3813o;

    /* renamed from: p */
    public static C5413D f3814p;

    /* renamed from: M3.z$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3815a;

        static {
            int[] iArr = new int[C5413D.c.values().length];
            f3815a = iArr;
            try {
                iArr[C5413D.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3815a[C5413D.c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3815a[C5413D.c.INTEGER_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3815a[C5413D.c.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3815a[C5413D.c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3815a[C5413D.c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3815a[C5413D.c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3815a[C5413D.c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3815a[C5413D.c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3815a[C5413D.c.ARRAY_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3815a[C5413D.c.MAP_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        C5413D c5413d = (C5413D) C5413D.m22443x0().m22472G(EnumC4048e0.NULL_VALUE).m17059n();
        f3800b = c5413d;
        f3801c = c5413d;
        C5413D c5413d2 = (C5413D) C5413D.m22443x0().m22474I("__max__").m17059n();
        f3802d = c5413d2;
        f3803e = (C5413D) C5413D.m22443x0().m22470E(C5438u.m22735j0().m22742y("__type__", c5413d2)).m17059n();
        C5413D c5413d3 = (C5413D) C5413D.m22443x0().m22474I("__vector__").m17059n();
        f3804f = c5413d3;
        f3805g = (C5413D) C5413D.m22443x0().m22470E(C5438u.m22735j0().m22742y("__type__", c5413d3).m22742y(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (C5413D) C5413D.m22443x0().m22477x(C5419b.m22551j0()).m17059n())).m17059n();
        f3806h = (C5413D) C5413D.m22443x0().m22479z(false).m17059n();
        f3807i = (C5413D) C5413D.m22443x0().m22467B(Double.NaN).m17059n();
        f3808j = (C5413D) C5413D.m22443x0().m22475J(C4078t0.m16930f0().m16936x(Long.MIN_VALUE)).m17059n();
        f3809k = (C5413D) C5413D.m22443x0().m22474I(StringUtils.EMPTY).m17059n();
        f3810l = (C5413D) C5413D.m22443x0().m22466A(AbstractC4055i.f13379b).m17059n();
        f3811m = m4588H(C1164f.f3754c, C1170l.m4495g());
        f3812n = (C5413D) C5413D.m22443x0().m22468C(C5940a.m24961f0().m24966w(-90.0d).m24967x(-180.0d)).m17059n();
        f3813o = (C5413D) C5413D.m22443x0().m22478y(C5419b.m22550g0()).m17059n();
        f3814p = (C5413D) C5413D.m22443x0().m22471F(C5438u.m22731b0()).m17059n();
    }

    /* renamed from: A */
    public static boolean m4581A(C5413D c5413d) {
        return c5413d != null && c5413d.m22463w0() == C5413D.c.NULL_VALUE;
    }

    /* renamed from: B */
    public static boolean m4582B(C5413D c5413d) {
        return m4613w(c5413d) || m4612v(c5413d);
    }

    /* renamed from: C */
    public static boolean m4583C(C5413D c5413d) {
        return c5413d != null && c5413d.m22463w0() == C5413D.c.REFERENCE_VALUE;
    }

    /* renamed from: D */
    public static boolean m4584D(C5413D c5413d) {
        return f3804f.equals(c5413d.m22459s0().m22737d0().get("__type__"));
    }

    /* renamed from: E */
    public static int m4585E(C5413D c5413d, boolean z6, C5413D c5413d2, boolean z7) {
        int m4599i = m4599i(c5413d, c5413d2);
        if (m4599i != 0) {
            return m4599i;
        }
        if (!z6 || z7) {
            return (z6 || !z7) ? 0 : 1;
        }
        return -1;
    }

    /* renamed from: F */
    public static boolean m4586F(C5413D c5413d, C5413D c5413d2) {
        C5413D.c m22463w0 = c5413d.m22463w0();
        C5413D.c cVar = C5413D.c.INTEGER_VALUE;
        if (m22463w0 == cVar && c5413d2.m22463w0() == cVar) {
            return c5413d.m22458r0() == c5413d2.m22458r0();
        }
        C5413D.c m22463w02 = c5413d.m22463w0();
        C5413D.c cVar2 = C5413D.c.DOUBLE_VALUE;
        return m22463w02 == cVar2 && c5413d2.m22463w0() == cVar2 && Double.doubleToLongBits(c5413d.m22456p0()) == Double.doubleToLongBits(c5413d2.m22456p0());
    }

    /* renamed from: G */
    public static boolean m4587G(C5413D c5413d, C5413D c5413d2) {
        C5438u m22459s0 = c5413d.m22459s0();
        C5438u m22459s02 = c5413d2.m22459s0();
        if (m22459s0.m22736c0() != m22459s02.m22736c0()) {
            return false;
        }
        for (Map.Entry entry : m22459s0.m22737d0().entrySet()) {
            if (!m4608r((C5413D) entry.getValue(), (C5413D) m22459s02.m22737d0().get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public static C5413D m4588H(C1164f c1164f, C1170l c1170l) {
        return (C5413D) C5413D.m22443x0().m22473H(String.format("projects/%s/databases/%s/documents/%s", c1164f.m4478i(), c1164f.m4477h(), c1170l.toString())).m17059n();
    }

    /* renamed from: I */
    public static int m4589I(C5413D c5413d) {
        switch (a.f3815a[c5413d.m22463w0().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                if (AbstractC1180v.m4569c(c5413d)) {
                    return 4;
                }
                return m4615y(c5413d) ? C3643a.e.API_PRIORITY_OTHER : m4584D(c5413d) ? 10 : 11;
            default:
                throw AbstractC2133b.m7214a("Invalid value type: " + c5413d.m22463w0(), new Object[0]);
        }
    }

    /* renamed from: J */
    public static int m4590J(C5413D c5413d, boolean z6, C5413D c5413d2, boolean z7) {
        int m4599i = m4599i(c5413d, c5413d2);
        if (m4599i != 0) {
            return m4599i;
        }
        if (!z6 || z7) {
            return (z6 || !z7) ? 0 : -1;
        }
        return 1;
    }

    /* renamed from: a */
    public static boolean m4591a(C5413D c5413d, C5413D c5413d2) {
        C5419b m22453l0 = c5413d.m22453l0();
        C5419b m22453l02 = c5413d2.m22453l0();
        if (m22453l0.m22557i0() != m22453l02.m22557i0()) {
            return false;
        }
        for (int i7 = 0; i7 < m22453l0.m22557i0(); i7++) {
            if (!m4608r(m22453l0.m22556h0(i7), m22453l02.m22556h0(i7))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m4592b(C5413D c5413d) {
        StringBuilder sb = new StringBuilder();
        m4598h(sb, c5413d);
        return sb.toString();
    }

    /* renamed from: c */
    public static void m4593c(StringBuilder sb, C5419b c5419b) {
        sb.append("[");
        for (int i7 = 0; i7 < c5419b.m22557i0(); i7++) {
            m4598h(sb, c5419b.m22556h0(i7));
            if (i7 != c5419b.m22557i0() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
    }

    /* renamed from: d */
    public static void m4594d(StringBuilder sb, C5940a c5940a) {
        sb.append(String.format("geo(%s,%s)", Double.valueOf(c5940a.m24962d0()), Double.valueOf(c5940a.m24963e0())));
    }

    /* renamed from: e */
    public static void m4595e(StringBuilder sb, C5438u c5438u) {
        ArrayList<String> arrayList = new ArrayList(c5438u.m22737d0().keySet());
        Collections.sort(arrayList);
        sb.append("{");
        boolean z6 = true;
        for (String str : arrayList) {
            if (z6) {
                z6 = false;
            } else {
                sb.append(",");
            }
            sb.append(str);
            sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            m4598h(sb, c5438u.m22739f0(str));
        }
        sb.append("}");
    }

    /* renamed from: f */
    public static void m4596f(StringBuilder sb, C5413D c5413d) {
        AbstractC2133b.m7217d(m4583C(c5413d), "Value should be a ReferenceValue", new Object[0]);
        sb.append(C1170l.m4497i(c5413d.m22460t0()));
    }

    /* renamed from: g */
    public static void m4597g(StringBuilder sb, C4078t0 c4078t0) {
        sb.append(String.format("time(%s,%s)", Long.valueOf(c4078t0.m16932e0()), Integer.valueOf(c4078t0.m16931d0())));
    }

    /* renamed from: h */
    public static void m4598h(StringBuilder sb, C5413D c5413d) {
        switch (a.f3815a[c5413d.m22463w0().ordinal()]) {
            case 1:
                sb.append("null");
                return;
            case 2:
                sb.append(c5413d.m22454m0());
                return;
            case 3:
                sb.append(c5413d.m22458r0());
                return;
            case 4:
                sb.append(c5413d.m22456p0());
                return;
            case 5:
                m4597g(sb, c5413d.m22462v0());
                return;
            case 6:
                sb.append(c5413d.m22461u0());
                return;
            case 7:
                sb.append(AbstractC2131I.m7183C(c5413d.m22455n0()));
                return;
            case 8:
                m4596f(sb, c5413d);
                return;
            case 9:
                m4594d(sb, c5413d.m22457q0());
                return;
            case 10:
                m4593c(sb, c5413d.m22453l0());
                return;
            case 11:
                m4595e(sb, c5413d.m22459s0());
                return;
            default:
                throw AbstractC2133b.m7214a("Invalid value type: " + c5413d.m22463w0(), new Object[0]);
        }
    }

    /* renamed from: i */
    public static int m4599i(C5413D c5413d, C5413D c5413d2) {
        int m4589I = m4589I(c5413d);
        int m4589I2 = m4589I(c5413d2);
        if (m4589I != m4589I2) {
            return AbstractC2131I.m7197l(m4589I, m4589I2);
        }
        if (m4589I != Integer.MAX_VALUE) {
            switch (m4589I) {
                case 0:
                    break;
                case 1:
                    return AbstractC2131I.m7193h(c5413d.m22454m0(), c5413d2.m22454m0());
                case 2:
                    return m4603m(c5413d, c5413d2);
                case 3:
                    return m4605o(c5413d.m22462v0(), c5413d2.m22462v0());
                case 4:
                    return m4605o(AbstractC1180v.m4567a(c5413d), AbstractC1180v.m4567a(c5413d2));
                case 5:
                    return AbstractC2131I.m7200o(c5413d.m22461u0(), c5413d2.m22461u0());
                case 6:
                    return AbstractC2131I.m7195j(c5413d.m22455n0(), c5413d2.m22455n0());
                case 7:
                    return m4604n(c5413d.m22460t0(), c5413d2.m22460t0());
                case 8:
                    return m4601k(c5413d.m22457q0(), c5413d2.m22457q0());
                case 9:
                    return m4600j(c5413d.m22453l0(), c5413d2.m22453l0());
                case 10:
                    return m4606p(c5413d.m22459s0(), c5413d2.m22459s0());
                case 11:
                    return m4602l(c5413d.m22459s0(), c5413d2.m22459s0());
                default:
                    throw AbstractC2133b.m7214a("Invalid value type: " + m4589I, new Object[0]);
            }
        }
        return 0;
    }

    /* renamed from: j */
    public static int m4600j(C5419b c5419b, C5419b c5419b2) {
        int min = Math.min(c5419b.m22557i0(), c5419b2.m22557i0());
        for (int i7 = 0; i7 < min; i7++) {
            int m4599i = m4599i(c5419b.m22556h0(i7), c5419b2.m22556h0(i7));
            if (m4599i != 0) {
                return m4599i;
            }
        }
        return AbstractC2131I.m7197l(c5419b.m22557i0(), c5419b2.m22557i0());
    }

    /* renamed from: k */
    public static int m4601k(C5940a c5940a, C5940a c5940a2) {
        int m7196k = AbstractC2131I.m7196k(c5940a.m24962d0(), c5940a2.m24962d0());
        return m7196k == 0 ? AbstractC2131I.m7196k(c5940a.m24963e0(), c5940a2.m24963e0()) : m7196k;
    }

    /* renamed from: l */
    public static int m4602l(C5438u c5438u, C5438u c5438u2) {
        Iterator it = new TreeMap(c5438u.m22737d0()).entrySet().iterator();
        Iterator it2 = new TreeMap(c5438u2.m22737d0()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int m7200o = AbstractC2131I.m7200o((String) entry.getKey(), (String) entry2.getKey());
            if (m7200o != 0) {
                return m7200o;
            }
            int m4599i = m4599i((C5413D) entry.getValue(), (C5413D) entry2.getValue());
            if (m4599i != 0) {
                return m4599i;
            }
        }
        return AbstractC2131I.m7193h(it.hasNext(), it2.hasNext());
    }

    /* renamed from: m */
    public static int m4603m(C5413D c5413d, C5413D c5413d2) {
        C5413D.c m22463w0 = c5413d.m22463w0();
        C5413D.c cVar = C5413D.c.DOUBLE_VALUE;
        if (m22463w0 == cVar) {
            double m22456p0 = c5413d.m22456p0();
            if (c5413d2.m22463w0() == cVar) {
                return AbstractC2131I.m7196k(m22456p0, c5413d2.m22456p0());
            }
            if (c5413d2.m22463w0() == C5413D.c.INTEGER_VALUE) {
                return AbstractC2131I.m7199n(m22456p0, c5413d2.m22458r0());
            }
        } else {
            C5413D.c m22463w02 = c5413d.m22463w0();
            C5413D.c cVar2 = C5413D.c.INTEGER_VALUE;
            if (m22463w02 == cVar2) {
                long m22458r0 = c5413d.m22458r0();
                if (c5413d2.m22463w0() == cVar2) {
                    return AbstractC2131I.m7198m(m22458r0, c5413d2.m22458r0());
                }
                if (c5413d2.m22463w0() == cVar) {
                    return AbstractC2131I.m7199n(c5413d2.m22456p0(), m22458r0) * (-1);
                }
            }
        }
        throw AbstractC2133b.m7214a("Unexpected values: %s vs %s", c5413d, c5413d2);
    }

    /* renamed from: n */
    public static int m4604n(String str, String str2) {
        String[] split = str.split("/", -1);
        String[] split2 = str2.split("/", -1);
        int min = Math.min(split.length, split2.length);
        for (int i7 = 0; i7 < min; i7++) {
            int compareTo = split[i7].compareTo(split2[i7]);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return AbstractC2131I.m7197l(split.length, split2.length);
    }

    /* renamed from: o */
    public static int m4605o(C4078t0 c4078t0, C4078t0 c4078t02) {
        int m7198m = AbstractC2131I.m7198m(c4078t0.m16932e0(), c4078t02.m16932e0());
        return m7198m != 0 ? m7198m : AbstractC2131I.m7197l(c4078t0.m16931d0(), c4078t02.m16931d0());
    }

    /* renamed from: p */
    public static int m4606p(C5438u c5438u, C5438u c5438u2) {
        Map m22737d0 = c5438u.m22737d0();
        Map m22737d02 = c5438u2.m22737d0();
        C5419b m22453l0 = ((C5413D) m22737d0.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)).m22453l0();
        C5419b m22453l02 = ((C5413D) m22737d02.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)).m22453l0();
        int m7197l = AbstractC2131I.m7197l(m22453l0.m22557i0(), m22453l02.m22557i0());
        return m7197l != 0 ? m7197l : m4600j(m22453l0, m22453l02);
    }

    /* renamed from: q */
    public static boolean m4607q(InterfaceC5420c interfaceC5420c, C5413D c5413d) {
        Iterator it = interfaceC5420c.mo22555g().iterator();
        while (it.hasNext()) {
            if (m4608r((C5413D) it.next(), c5413d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m4608r(C5413D c5413d, C5413D c5413d2) {
        int m4589I;
        if (c5413d == c5413d2) {
            return true;
        }
        if (c5413d == null || c5413d2 == null || (m4589I = m4589I(c5413d)) != m4589I(c5413d2)) {
            return false;
        }
        if (m4589I == 2) {
            return m4586F(c5413d, c5413d2);
        }
        if (m4589I == 4) {
            return AbstractC1180v.m4567a(c5413d).equals(AbstractC1180v.m4567a(c5413d2));
        }
        if (m4589I == Integer.MAX_VALUE) {
            return true;
        }
        switch (m4589I) {
            case 9:
                return m4591a(c5413d, c5413d2);
            case 10:
            case 11:
                return m4587G(c5413d, c5413d2);
            default:
                return c5413d.equals(c5413d2);
        }
    }

    /* renamed from: s */
    public static C5413D m4609s(C5413D c5413d) {
        switch (a.f3815a[c5413d.m22463w0().ordinal()]) {
            case 1:
                return f3800b;
            case 2:
                return f3806h;
            case 3:
            case 4:
                return f3807i;
            case 5:
                return f3808j;
            case 6:
                return f3809k;
            case 7:
                return f3810l;
            case 8:
                return f3811m;
            case 9:
                return f3812n;
            case 10:
                return f3813o;
            case 11:
                return m4584D(c5413d) ? f3805g : f3814p;
            default:
                throw new IllegalArgumentException("Unknown value type: " + c5413d.m22463w0());
        }
    }

    /* renamed from: t */
    public static C5413D m4610t(C5413D c5413d) {
        switch (a.f3815a[c5413d.m22463w0().ordinal()]) {
            case 1:
                return f3806h;
            case 2:
                return f3807i;
            case 3:
            case 4:
                return f3808j;
            case 5:
                return f3809k;
            case 6:
                return f3810l;
            case 7:
                return f3811m;
            case 8:
                return f3812n;
            case 9:
                return f3813o;
            case 10:
                return f3805g;
            case 11:
                return m4584D(c5413d) ? f3814p : f3803e;
            default:
                throw new IllegalArgumentException("Unknown value type: " + c5413d.m22463w0());
        }
    }

    /* renamed from: u */
    public static boolean m4611u(C5413D c5413d) {
        return c5413d != null && c5413d.m22463w0() == C5413D.c.ARRAY_VALUE;
    }

    /* renamed from: v */
    public static boolean m4612v(C5413D c5413d) {
        return c5413d != null && c5413d.m22463w0() == C5413D.c.DOUBLE_VALUE;
    }

    /* renamed from: w */
    public static boolean m4613w(C5413D c5413d) {
        return c5413d != null && c5413d.m22463w0() == C5413D.c.INTEGER_VALUE;
    }

    /* renamed from: x */
    public static boolean m4614x(C5413D c5413d) {
        return c5413d != null && c5413d.m22463w0() == C5413D.c.MAP_VALUE;
    }

    /* renamed from: y */
    public static boolean m4615y(C5413D c5413d) {
        return f3802d.equals(c5413d.m22459s0().m22737d0().get("__type__"));
    }

    /* renamed from: z */
    public static boolean m4616z(C5413D c5413d) {
        return c5413d != null && Double.isNaN(c5413d.m22456p0());
    }
}
