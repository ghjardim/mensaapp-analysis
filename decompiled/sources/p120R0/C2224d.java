package p120R0;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p078L0.C0879n;
import p259j0.C5357z;

/* renamed from: R0.d */
/* loaded from: classes.dex */
public final class C2224d extends AbstractC2225e {

    /* renamed from: b */
    public long f6816b;

    /* renamed from: c */
    public long[] f6817c;

    /* renamed from: d */
    public long[] f6818d;

    public C2224d() {
        super(new C0879n());
        this.f6816b = -9223372036854775807L;
        this.f6817c = new long[0];
        this.f6818d = new long[0];
    }

    /* renamed from: g */
    public static Boolean m7635g(C5357z c5357z) {
        return Boolean.valueOf(c5357z.m21926G() == 1);
    }

    /* renamed from: h */
    public static Object m7636h(C5357z c5357z, int i7) {
        if (i7 == 0) {
            return m7638j(c5357z);
        }
        if (i7 == 1) {
            return m7635g(c5357z);
        }
        if (i7 == 2) {
            return m7642n(c5357z);
        }
        if (i7 == 3) {
            return m7640l(c5357z);
        }
        if (i7 == 8) {
            return m7639k(c5357z);
        }
        if (i7 == 10) {
            return m7641m(c5357z);
        }
        if (i7 != 11) {
            return null;
        }
        return m7637i(c5357z);
    }

    /* renamed from: i */
    public static Date m7637i(C5357z c5357z) {
        Date date = new Date((long) m7638j(c5357z).doubleValue());
        c5357z.m21940U(2);
        return date;
    }

    /* renamed from: j */
    public static Double m7638j(C5357z c5357z) {
        return Double.valueOf(Double.longBitsToDouble(c5357z.m21967z()));
    }

    /* renamed from: k */
    public static HashMap m7639k(C5357z c5357z) {
        int m21930K = c5357z.m21930K();
        HashMap hashMap = new HashMap(m21930K);
        for (int i7 = 0; i7 < m21930K; i7++) {
            String m7642n = m7642n(c5357z);
            Object m7636h = m7636h(c5357z, m7643o(c5357z));
            if (m7636h != null) {
                hashMap.put(m7642n, m7636h);
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    public static HashMap m7640l(C5357z c5357z) {
        HashMap hashMap = new HashMap();
        while (true) {
            String m7642n = m7642n(c5357z);
            int m7643o = m7643o(c5357z);
            if (m7643o == 9) {
                return hashMap;
            }
            Object m7636h = m7636h(c5357z, m7643o);
            if (m7636h != null) {
                hashMap.put(m7642n, m7636h);
            }
        }
    }

    /* renamed from: m */
    public static ArrayList m7641m(C5357z c5357z) {
        int m21930K = c5357z.m21930K();
        ArrayList arrayList = new ArrayList(m21930K);
        for (int i7 = 0; i7 < m21930K; i7++) {
            Object m7636h = m7636h(c5357z, m7643o(c5357z));
            if (m7636h != null) {
                arrayList.add(m7636h);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static String m7642n(C5357z c5357z) {
        int m21932M = c5357z.m21932M();
        int m21947f = c5357z.m21947f();
        c5357z.m21940U(m21932M);
        return new String(c5357z.m21946e(), m21947f, m21932M);
    }

    /* renamed from: o */
    public static int m7643o(C5357z c5357z) {
        return c5357z.m21926G();
    }

    @Override // p120R0.AbstractC2225e
    /* renamed from: b */
    public boolean mo7624b(C5357z c5357z) {
        return true;
    }

    @Override // p120R0.AbstractC2225e
    /* renamed from: c */
    public boolean mo7625c(C5357z c5357z, long j7) {
        if (m7643o(c5357z) != 2 || !"onMetaData".equals(m7642n(c5357z)) || c5357z.m21942a() == 0 || m7643o(c5357z) != 8) {
            return false;
        }
        HashMap m7639k = m7639k(c5357z);
        Object obj = m7639k.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f6816b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = m7639k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f6817c = new long[size];
                this.f6818d = new long[size];
                for (int i7 = 0; i7 < size; i7++) {
                    Object obj5 = list.get(i7);
                    Object obj6 = list2.get(i7);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f6817c = new long[0];
                        this.f6818d = new long[0];
                        break;
                    }
                    this.f6817c[i7] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f6818d[i7] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public long m7644d() {
        return this.f6816b;
    }

    /* renamed from: e */
    public long[] m7645e() {
        return this.f6818d;
    }

    /* renamed from: f */
    public long[] m7646f() {
        return this.f6817c;
    }
}
