package p225f1;

import org.apache.tika.utils.StringUtils;
import p078L0.C0847E;
import p176Z0.AbstractC2967i;
import p176Z0.AbstractC2968j;
import p176Z0.C2959a;
import p176Z0.C2963e;
import p176Z0.C2969k;
import p176Z0.C2972n;
import p178Z2.AbstractC3033v;
import p232g0.C4327q;
import p232g0.C4334x;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p268k0.C5397a;

/* renamed from: f1.j */
/* loaded from: classes.dex */
public abstract class AbstractC4235j {
    /* renamed from: a */
    public static C2963e m17768a(int i7, C5357z c5357z) {
        int m21957p = c5357z.m21957p();
        if (c5357z.m21957p() == 1684108385) {
            c5357z.m21940U(8);
            String m21921B = c5357z.m21921B(m21957p - 16);
            return new C2963e("und", m21921B, m21921B);
        }
        AbstractC5346o.m21867h("MetadataUtil", "Failed to parse comment attribute: " + AbstractC4226a.m17664a(i7));
        return null;
    }

    /* renamed from: b */
    public static C2959a m17769b(C5357z c5357z) {
        int m21957p = c5357z.m21957p();
        if (c5357z.m21957p() != 1684108385) {
            AbstractC5346o.m21867h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int m17665b = AbstractC4226a.m17665b(c5357z.m21957p());
        String str = m17665b == 13 ? "image/jpeg" : m17665b == 14 ? "image/png" : null;
        if (str == null) {
            AbstractC5346o.m21867h("MetadataUtil", "Unrecognized cover art flags: " + m17665b);
            return null;
        }
        c5357z.m21940U(4);
        int i7 = m21957p - 16;
        byte[] bArr = new byte[i7];
        c5357z.m21953l(bArr, 0, i7);
        return new C2959a(str, null, 3, bArr);
    }

    /* renamed from: c */
    public static C4334x.b m17770c(C5357z c5357z) {
        int m21947f = c5357z.m21947f() + c5357z.m21957p();
        int m21957p = c5357z.m21957p();
        int i7 = (m21957p >> 24) & 255;
        try {
            if (i7 == 169 || i7 == 253) {
                int i8 = 16777215 & m21957p;
                if (i8 == 6516084) {
                    return m17768a(m21957p, c5357z);
                }
                if (i8 == 7233901 || i8 == 7631467) {
                    return m17777j(m21957p, "TIT2", c5357z);
                }
                if (i8 == 6516589 || i8 == 7828084) {
                    return m17777j(m21957p, "TCOM", c5357z);
                }
                if (i8 == 6578553) {
                    return m17777j(m21957p, "TDRC", c5357z);
                }
                if (i8 == 4280916) {
                    return m17777j(m21957p, "TPE1", c5357z);
                }
                if (i8 == 7630703) {
                    return m17777j(m21957p, "TSSE", c5357z);
                }
                if (i8 == 6384738) {
                    return m17777j(m21957p, "TALB", c5357z);
                }
                if (i8 == 7108978) {
                    return m17777j(m21957p, "USLT", c5357z);
                }
                if (i8 == 6776174) {
                    return m17777j(m21957p, "TCON", c5357z);
                }
                if (i8 == 6779504) {
                    return m17777j(m21957p, "TIT1", c5357z);
                }
            } else {
                if (m21957p == 1735291493) {
                    return m17776i(c5357z);
                }
                if (m21957p == 1684632427) {
                    return m17771d(m21957p, "TPOS", c5357z);
                }
                if (m21957p == 1953655662) {
                    return m17771d(m21957p, "TRCK", c5357z);
                }
                if (m21957p == 1953329263) {
                    return m17773f(m21957p, "TBPM", c5357z, true, false);
                }
                if (m21957p == 1668311404) {
                    return m17773f(m21957p, "TCMP", c5357z, true, true);
                }
                if (m21957p == 1668249202) {
                    return m17769b(c5357z);
                }
                if (m21957p == 1631670868) {
                    return m17777j(m21957p, "TPE2", c5357z);
                }
                if (m21957p == 1936682605) {
                    return m17777j(m21957p, "TSOT", c5357z);
                }
                if (m21957p == 1936679276) {
                    return m17777j(m21957p, "TSOA", c5357z);
                }
                if (m21957p == 1936679282) {
                    return m17777j(m21957p, "TSOP", c5357z);
                }
                if (m21957p == 1936679265) {
                    return m17777j(m21957p, "TSO2", c5357z);
                }
                if (m21957p == 1936679791) {
                    return m17777j(m21957p, "TSOC", c5357z);
                }
                if (m21957p == 1920233063) {
                    return m17773f(m21957p, "ITUNESADVISORY", c5357z, false, false);
                }
                if (m21957p == 1885823344) {
                    return m17773f(m21957p, "ITUNESGAPLESS", c5357z, false, true);
                }
                if (m21957p == 1936683886) {
                    return m17777j(m21957p, "TVSHOWSORT", c5357z);
                }
                if (m21957p == 1953919848) {
                    return m17777j(m21957p, "TVSHOW", c5357z);
                }
                if (m21957p == 757935405) {
                    return m17774g(c5357z, m21947f);
                }
            }
            AbstractC5346o.m21861b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC4226a.m17664a(m21957p));
            c5357z.m21939T(m21947f);
            return null;
        } finally {
            c5357z.m21939T(m21947f);
        }
    }

    /* renamed from: d */
    public static C2972n m17771d(int i7, String str, C5357z c5357z) {
        int m21957p = c5357z.m21957p();
        if (c5357z.m21957p() == 1684108385 && m21957p >= 22) {
            c5357z.m21940U(10);
            int m21932M = c5357z.m21932M();
            if (m21932M > 0) {
                String str2 = StringUtils.EMPTY + m21932M;
                int m21932M2 = c5357z.m21932M();
                if (m21932M2 > 0) {
                    str2 = str2 + "/" + m21932M2;
                }
                return new C2972n(str, null, AbstractC3033v.m11051u(str2));
            }
        }
        AbstractC5346o.m21867h("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC4226a.m17664a(i7));
        return null;
    }

    /* renamed from: e */
    public static int m17772e(C5357z c5357z) {
        int m21957p = c5357z.m21957p();
        if (c5357z.m21957p() == 1684108385) {
            c5357z.m21940U(8);
            int i7 = m21957p - 16;
            if (i7 == 1) {
                return c5357z.m21926G();
            }
            if (i7 == 2) {
                return c5357z.m21932M();
            }
            if (i7 == 3) {
                return c5357z.m21929J();
            }
            if (i7 == 4 && (c5357z.m21951j() & 128) == 0) {
                return c5357z.m21930K();
            }
        }
        AbstractC5346o.m21867h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* renamed from: f */
    public static AbstractC2967i m17773f(int i7, String str, C5357z c5357z, boolean z6, boolean z7) {
        int m17772e = m17772e(c5357z);
        if (z7) {
            m17772e = Math.min(1, m17772e);
        }
        if (m17772e >= 0) {
            return z6 ? new C2972n(str, null, AbstractC3033v.m11051u(Integer.toString(m17772e))) : new C2963e("und", str, Integer.toString(m17772e));
        }
        AbstractC5346o.m21867h("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC4226a.m17664a(i7));
        return null;
    }

    /* renamed from: g */
    public static AbstractC2967i m17774g(C5357z c5357z, int i7) {
        String str = null;
        String str2 = null;
        int i8 = -1;
        int i9 = -1;
        while (c5357z.m21947f() < i7) {
            int m21947f = c5357z.m21947f();
            int m21957p = c5357z.m21957p();
            int m21957p2 = c5357z.m21957p();
            c5357z.m21940U(4);
            if (m21957p2 == 1835360622) {
                str = c5357z.m21921B(m21957p - 12);
            } else if (m21957p2 == 1851878757) {
                str2 = c5357z.m21921B(m21957p - 12);
            } else {
                if (m21957p2 == 1684108385) {
                    i8 = m21947f;
                    i9 = m21957p;
                }
                c5357z.m21940U(m21957p - 12);
            }
        }
        if (str == null || str2 == null || i8 == -1) {
            return null;
        }
        c5357z.m21939T(i8);
        c5357z.m21940U(16);
        return new C2969k(str, str2, c5357z.m21921B(i9 - 16));
    }

    /* renamed from: h */
    public static C5397a m17775h(C5357z c5357z, int i7, String str) {
        while (true) {
            int m21947f = c5357z.m21947f();
            if (m21947f >= i7) {
                return null;
            }
            int m21957p = c5357z.m21957p();
            if (c5357z.m21957p() == 1684108385) {
                int m21957p2 = c5357z.m21957p();
                int m21957p3 = c5357z.m21957p();
                int i8 = m21957p - 16;
                byte[] bArr = new byte[i8];
                c5357z.m21953l(bArr, 0, i8);
                return new C5397a(str, bArr, m21957p3, m21957p2);
            }
            c5357z.m21939T(m21947f + m21957p);
        }
    }

    /* renamed from: i */
    public static C2972n m17776i(C5357z c5357z) {
        String m10707a = AbstractC2968j.m10707a(m17772e(c5357z) - 1);
        if (m10707a != null) {
            return new C2972n("TCON", null, AbstractC3033v.m11051u(m10707a));
        }
        AbstractC5346o.m21867h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    /* renamed from: j */
    public static C2972n m17777j(int i7, String str, C5357z c5357z) {
        int m21957p = c5357z.m21957p();
        if (c5357z.m21957p() == 1684108385) {
            c5357z.m21940U(8);
            return new C2972n(str, null, AbstractC3033v.m11051u(c5357z.m21921B(m21957p - 16)));
        }
        AbstractC5346o.m21867h("MetadataUtil", "Failed to parse text attribute: " + AbstractC4226a.m17664a(i7));
        return null;
    }

    /* renamed from: k */
    public static void m17778k(int i7, C0847E c0847e, C4327q.b bVar) {
        if (i7 == 1 && c0847e.m3523a()) {
            bVar.m18245V(c0847e.f2902a).m18246W(c0847e.f2903b);
        }
    }

    /* renamed from: l */
    public static void m17779l(int i7, C4334x c4334x, C4327q.b bVar, C4334x... c4334xArr) {
        C4334x c4334x2 = new C4334x(new C4334x.b[0]);
        if (c4334x != null) {
            for (int i8 = 0; i8 < c4334x.m18402e(); i8++) {
                C4334x.b m18401d = c4334x.m18401d(i8);
                if (m18401d instanceof C5397a) {
                    C5397a c5397a = (C5397a) m18401d;
                    if (!c5397a.f19237a.equals("com.android.capture.fps")) {
                        c4334x2 = c4334x2.m18398a(c5397a);
                    } else if (i7 == 2) {
                        c4334x2 = c4334x2.m18398a(c5397a);
                    }
                }
            }
        }
        for (C4334x c4334x3 : c4334xArr) {
            c4334x2 = c4334x2.m18399b(c4334x3);
        }
        if (c4334x2.m18402e() > 0) {
            bVar.m18257h0(c4334x2);
        }
    }
}
