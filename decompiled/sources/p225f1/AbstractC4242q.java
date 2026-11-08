package p225f1;

import p184a1.C3101d;
import p232g0.C4334x;
import p259j0.C5357z;

/* renamed from: f1.q */
/* loaded from: classes.dex */
public abstract class AbstractC4242q {
    /* renamed from: a */
    public static int m17819a(int i7, C5357z c5357z, int i8) {
        if (i7 == 12) {
            return 240;
        }
        if (i7 == 13) {
            return 120;
        }
        if (i7 == 21 && c5357z.m21942a() >= 8 && c5357z.m21947f() + 8 <= i8) {
            int m21957p = c5357z.m21957p();
            int m21957p2 = c5357z.m21957p();
            if (m21957p >= 12 && m21957p2 == 1936877170) {
                return c5357z.m21927H();
            }
        }
        return -2147483647;
    }

    /* renamed from: b */
    public static C4334x m17820b(C5357z c5357z, int i7) {
        c5357z.m21940U(12);
        while (c5357z.m21947f() < i7) {
            int m21947f = c5357z.m21947f();
            int m21957p = c5357z.m21957p();
            if (c5357z.m21957p() == 1935766900) {
                if (m21957p < 16) {
                    return null;
                }
                c5357z.m21940U(4);
                int i8 = -1;
                int i9 = 0;
                for (int i10 = 0; i10 < 2; i10++) {
                    int m21926G = c5357z.m21926G();
                    int m21926G2 = c5357z.m21926G();
                    if (m21926G == 0) {
                        i8 = m21926G2;
                    } else if (m21926G == 1) {
                        i9 = m21926G2;
                    }
                }
                int m17819a = m17819a(i8, c5357z, i7);
                if (m17819a == -2147483647) {
                    return null;
                }
                return new C4334x(new C3101d(m17819a, i9));
            }
            c5357z.m21939T(m21947f + m21957p);
        }
        return null;
    }
}
