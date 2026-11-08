package p108P2;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* renamed from: P2.m4 */
/* loaded from: classes.dex */
public final class C1771m4 {

    /* renamed from: c */
    public static final C1771m4 f5231c = new C1771m4(null, null, 100);

    /* renamed from: a */
    public final EnumMap f5232a;

    /* renamed from: b */
    public final int f5233b;

    public C1771m4(Boolean bool, Boolean bool2, int i7) {
        EnumMap enumMap = new EnumMap(EnumC1762l4.class);
        this.f5232a = enumMap;
        enumMap.put((EnumMap) EnumC1762l4.AD_STORAGE, (EnumC1762l4) m6100h(null));
        enumMap.put((EnumMap) EnumC1762l4.ANALYTICS_STORAGE, (EnumC1762l4) m6100h(null));
        this.f5233b = i7;
    }

    /* renamed from: a */
    public static char m6097a(EnumC1744j4 enumC1744j4) {
        if (enumC1744j4 == null) {
            return '-';
        }
        int ordinal = enumC1744j4.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* renamed from: d */
    public static EnumC1744j4 m6098d(String str) {
        return str == null ? EnumC1744j4.UNINITIALIZED : str.equals("granted") ? EnumC1744j4.GRANTED : str.equals("denied") ? EnumC1744j4.DENIED : EnumC1744j4.UNINITIALIZED;
    }

    /* renamed from: g */
    public static EnumC1744j4 m6099g(char c7) {
        return c7 != '+' ? c7 != '0' ? c7 != '1' ? EnumC1744j4.UNINITIALIZED : EnumC1744j4.GRANTED : EnumC1744j4.DENIED : EnumC1744j4.POLICY;
    }

    /* renamed from: h */
    public static EnumC1744j4 m6100h(Boolean bool) {
        return bool == null ? EnumC1744j4.UNINITIALIZED : bool.booleanValue() ? EnumC1744j4.GRANTED : EnumC1744j4.DENIED;
    }

    /* renamed from: i */
    public static C1771m4 m6101i(Bundle bundle, int i7) {
        EnumC1762l4[] enumC1762l4Arr;
        if (bundle == null) {
            return new C1771m4(null, null, i7);
        }
        EnumMap enumMap = new EnumMap(EnumC1762l4.class);
        enumC1762l4Arr = EnumC1753k4.STORAGE.f5205a;
        for (EnumC1762l4 enumC1762l4 : enumC1762l4Arr) {
            enumMap.put((EnumMap) enumC1762l4, (EnumC1762l4) m6098d(bundle.getString(enumC1762l4.f5219a)));
        }
        return new C1771m4(enumMap, i7);
    }

    /* renamed from: j */
    public static C1771m4 m6102j(EnumC1744j4 enumC1744j4, EnumC1744j4 enumC1744j42, int i7) {
        EnumMap enumMap = new EnumMap(EnumC1762l4.class);
        enumMap.put((EnumMap) EnumC1762l4.AD_STORAGE, (EnumC1762l4) enumC1744j4);
        enumMap.put((EnumMap) EnumC1762l4.ANALYTICS_STORAGE, (EnumC1762l4) enumC1744j42);
        return new C1771m4(enumMap, -10);
    }

    /* renamed from: k */
    public static C1771m4 m6103k(String str, int i7) {
        EnumMap enumMap = new EnumMap(EnumC1762l4.class);
        EnumC1762l4[] m6090f = EnumC1753k4.STORAGE.m6090f();
        for (int i8 = 0; i8 < m6090f.length; i8++) {
            String str2 = str == null ? StringUtils.EMPTY : str;
            EnumC1762l4 enumC1762l4 = m6090f[i8];
            int i9 = i8 + 2;
            if (i9 < str2.length()) {
                enumMap.put((EnumMap) enumC1762l4, (EnumC1762l4) m6099g(str2.charAt(i9)));
            } else {
                enumMap.put((EnumMap) enumC1762l4, (EnumC1762l4) EnumC1744j4.UNINITIALIZED);
            }
        }
        return new C1771m4(enumMap, i7);
    }

    /* renamed from: n */
    public static String m6104n(int i7) {
        return i7 != -30 ? i7 != -20 ? i7 != -10 ? i7 != 0 ? i7 != 30 ? i7 != 90 ? i7 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    /* renamed from: o */
    public static String m6105o(EnumC1744j4 enumC1744j4) {
        int ordinal = enumC1744j4.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    /* renamed from: s */
    public static boolean m6106s(int i7, int i8) {
        int i9 = -30;
        if (i7 == -20) {
            if (i8 == -30) {
                return true;
            }
            i7 = -20;
        }
        if (i7 != -30) {
            i9 = i7;
        } else if (i8 == -20) {
            return true;
        }
        return i9 == i8 || i7 < i8;
    }

    /* renamed from: b */
    public final int m6107b() {
        return this.f5233b;
    }

    /* renamed from: c */
    public final Bundle m6108c() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f5232a.entrySet()) {
            String m6105o = m6105o((EnumC1744j4) entry.getValue());
            if (m6105o != null) {
                bundle.putString(((EnumC1762l4) entry.getKey()).f5219a, m6105o);
            }
        }
        return bundle;
    }

    /* renamed from: e */
    public final EnumC1744j4 m6109e() {
        EnumC1744j4 enumC1744j4 = (EnumC1744j4) this.f5232a.get(EnumC1762l4.AD_STORAGE);
        return enumC1744j4 == null ? EnumC1744j4.UNINITIALIZED : enumC1744j4;
    }

    public final boolean equals(Object obj) {
        EnumC1762l4[] enumC1762l4Arr;
        if (!(obj instanceof C1771m4)) {
            return false;
        }
        C1771m4 c1771m4 = (C1771m4) obj;
        enumC1762l4Arr = EnumC1753k4.STORAGE.f5205a;
        for (EnumC1762l4 enumC1762l4 : enumC1762l4Arr) {
            if (this.f5232a.get(enumC1762l4) != c1771m4.f5232a.get(enumC1762l4)) {
                return false;
            }
        }
        return this.f5233b == c1771m4.f5233b;
    }

    /* renamed from: f */
    public final EnumC1744j4 m6110f() {
        EnumC1744j4 enumC1744j4 = (EnumC1744j4) this.f5232a.get(EnumC1762l4.ANALYTICS_STORAGE);
        return enumC1744j4 == null ? EnumC1744j4.UNINITIALIZED : enumC1744j4;
    }

    public final int hashCode() {
        Iterator it = this.f5232a.values().iterator();
        int i7 = this.f5233b * 17;
        while (it.hasNext()) {
            i7 = (i7 * 31) + ((EnumC1744j4) it.next()).hashCode();
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p108P2.C1771m4 m6111l(p108P2.C1771m4 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<P2.l4> r1 = p108P2.EnumC1762l4.class
            r0.<init>(r1)
            P2.k4 r1 = p108P2.EnumC1753k4.STORAGE
            P2.l4[] r1 = p108P2.EnumC1753k4.m6089b(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f5232a
            java.lang.Object r5 = r5.get(r4)
            P2.j4 r5 = (p108P2.EnumC1744j4) r5
            java.util.EnumMap r6 = r9.f5232a
            java.lang.Object r6 = r6.get(r4)
            P2.j4 r6 = (p108P2.EnumC1744j4) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            P2.j4 r7 = p108P2.EnumC1744j4.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            P2.j4 r7 = p108P2.EnumC1744j4.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            P2.j4 r7 = p108P2.EnumC1744j4.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            P2.j4 r5 = p108P2.EnumC1744j4.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            P2.m4 r9 = new P2.m4
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p108P2.C1771m4.m6111l(P2.m4):P2.m4");
    }

    /* renamed from: m */
    public final C1771m4 m6112m(C1771m4 c1771m4) {
        EnumC1762l4[] enumC1762l4Arr;
        EnumMap enumMap = new EnumMap(EnumC1762l4.class);
        enumC1762l4Arr = EnumC1753k4.STORAGE.f5205a;
        for (EnumC1762l4 enumC1762l4 : enumC1762l4Arr) {
            EnumC1744j4 enumC1744j4 = (EnumC1744j4) this.f5232a.get(enumC1762l4);
            if (enumC1744j4 == EnumC1744j4.UNINITIALIZED) {
                enumC1744j4 = (EnumC1744j4) c1771m4.f5232a.get(enumC1762l4);
            }
            if (enumC1744j4 != null) {
                enumMap.put((EnumMap) enumC1762l4, (EnumC1762l4) enumC1744j4);
            }
        }
        return new C1771m4(enumMap, this.f5233b);
    }

    /* renamed from: p */
    public final String m6113p() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC1762l4 enumC1762l4 : EnumC1753k4.STORAGE.m6090f()) {
            EnumC1744j4 enumC1744j4 = (EnumC1744j4) this.f5232a.get(enumC1762l4);
            char c7 = '-';
            if (enumC1744j4 != null && (ordinal = enumC1744j4.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c7 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c7 = '1';
            }
            sb.append(c7);
        }
        return sb.toString();
    }

    /* renamed from: q */
    public final String m6114q() {
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC1762l4 enumC1762l4 : EnumC1753k4.STORAGE.m6090f()) {
            sb.append(m6097a((EnumC1744j4) this.f5232a.get(enumC1762l4)));
        }
        return sb.toString();
    }

    /* renamed from: r */
    public final boolean m6115r(EnumC1762l4 enumC1762l4) {
        return ((EnumC1744j4) this.f5232a.get(enumC1762l4)) != EnumC1744j4.DENIED;
    }

    /* renamed from: t */
    public final boolean m6116t() {
        Iterator it = this.f5232a.values().iterator();
        while (it.hasNext()) {
            if (((EnumC1744j4) it.next()) != EnumC1744j4.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        EnumC1762l4[] enumC1762l4Arr;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(m6104n(this.f5233b));
        enumC1762l4Arr = EnumC1753k4.STORAGE.f5205a;
        for (EnumC1762l4 enumC1762l4 : enumC1762l4Arr) {
            sb.append(",");
            sb.append(enumC1762l4.f5219a);
            sb.append("=");
            EnumC1744j4 enumC1744j4 = (EnumC1744j4) this.f5232a.get(enumC1762l4);
            if (enumC1744j4 == null) {
                enumC1744j4 = EnumC1744j4.UNINITIALIZED;
            }
            sb.append(enumC1744j4);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean m6117u(C1771m4 c1771m4) {
        EnumMap enumMap = this.f5232a;
        for (EnumC1762l4 enumC1762l4 : (EnumC1762l4[]) enumMap.keySet().toArray(new EnumC1762l4[0])) {
            EnumC1744j4 enumC1744j4 = (EnumC1744j4) enumMap.get(enumC1762l4);
            EnumC1744j4 enumC1744j42 = (EnumC1744j4) c1771m4.f5232a.get(enumC1762l4);
            EnumC1744j4 enumC1744j43 = EnumC1744j4.DENIED;
            if (enumC1744j4 == enumC1744j43 && enumC1744j42 != enumC1744j43) {
                return true;
            }
        }
        return false;
    }

    public C1771m4(EnumMap enumMap, int i7) {
        EnumMap enumMap2 = new EnumMap(EnumC1762l4.class);
        this.f5232a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f5233b = i7;
    }
}
