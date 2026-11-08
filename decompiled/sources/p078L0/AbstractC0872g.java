package p078L0;

import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;

/* renamed from: L0.g */
/* loaded from: classes.dex */
public abstract class AbstractC0872g {
    /* renamed from: a */
    public static void m3648a(long j7, C5357z c5357z, InterfaceC0861T[] interfaceC0861TArr) {
        while (true) {
            if (c5357z.m21942a() <= 1) {
                return;
            }
            int m3650c = m3650c(c5357z);
            int m3650c2 = m3650c(c5357z);
            int m21947f = c5357z.m21947f() + m3650c2;
            if (m3650c2 == -1 || m3650c2 > c5357z.m21942a()) {
                AbstractC5346o.m21867h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                m21947f = c5357z.m21948g();
            } else if (m3650c == 4 && m3650c2 >= 8) {
                int m21926G = c5357z.m21926G();
                int m21932M = c5357z.m21932M();
                int m21957p = m21932M == 49 ? c5357z.m21957p() : 0;
                int m21926G2 = c5357z.m21926G();
                if (m21932M == 47) {
                    c5357z.m21940U(1);
                }
                boolean z6 = m21926G == 181 && (m21932M == 49 || m21932M == 47) && m21926G2 == 3;
                if (m21932M == 49) {
                    z6 &= m21957p == 1195456820;
                }
                if (z6) {
                    m3649b(j7, c5357z, interfaceC0861TArr);
                }
            }
            c5357z.m21939T(m21947f);
        }
    }

    /* renamed from: b */
    public static void m3649b(long j7, C5357z c5357z, InterfaceC0861T[] interfaceC0861TArr) {
        int m21926G = c5357z.m21926G();
        if ((m21926G & 64) != 0) {
            c5357z.m21940U(1);
            int i7 = (m21926G & 31) * 3;
            int m21947f = c5357z.m21947f();
            for (InterfaceC0861T interfaceC0861T : interfaceC0861TArr) {
                c5357z.m21939T(m21947f);
                interfaceC0861T.mo564d(c5357z, i7);
                AbstractC5332a.m21802g(j7 != -9223372036854775807L);
                interfaceC0861T.mo562c(j7, 1, i7, 0, null);
            }
        }
    }

    /* renamed from: c */
    public static int m3650c(C5357z c5357z) {
        int i7 = 0;
        while (c5357z.m21942a() != 0) {
            int m21926G = c5357z.m21926G();
            i7 += m21926G;
            if (m21926G != 255) {
                return i7;
            }
        }
        return -1;
    }
}
