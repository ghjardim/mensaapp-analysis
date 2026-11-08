package p078L0;

import java.util.Arrays;
import java.util.List;
import p078L0.C0844B;
import p162X0.C2797a;
import p176Z0.C2966h;
import p178Z2.AbstractC3033v;
import p232g0.C4295A;
import p232g0.C4334x;
import p259j0.C5356y;
import p259j0.C5357z;

/* renamed from: L0.z */
/* loaded from: classes.dex */
public abstract class AbstractC0891z {

    /* renamed from: L0.z$a */
    public static final class a {

        /* renamed from: a */
        public C0844B f3107a;

        public a(C0844B c0844b) {
            this.f3107a = c0844b;
        }
    }

    /* renamed from: a */
    public static boolean m3708a(InterfaceC0884s interfaceC0884s) {
        C5357z c5357z = new C5357z(4);
        interfaceC0884s.mo3521t(c5357z.m21946e(), 0, 4);
        return c5357z.m21928I() == 1716281667;
    }

    /* renamed from: b */
    public static int m3709b(InterfaceC0884s interfaceC0884s) {
        interfaceC0884s.mo3518p();
        C5357z c5357z = new C5357z(2);
        interfaceC0884s.mo3521t(c5357z.m21946e(), 0, 2);
        int m21932M = c5357z.m21932M();
        if ((m21932M >> 2) == 16382) {
            interfaceC0884s.mo3518p();
            return m21932M;
        }
        interfaceC0884s.mo3518p();
        throw C4295A.m17943a("First frame does not start with sync code.", null);
    }

    /* renamed from: c */
    public static C4334x m3710c(InterfaceC0884s interfaceC0884s, boolean z6) {
        C4334x m3527a = new C0849G().m3527a(interfaceC0884s, z6 ? null : C2966h.f9105b);
        if (m3527a == null || m3527a.m18402e() == 0) {
            return null;
        }
        return m3527a;
    }

    /* renamed from: d */
    public static C4334x m3711d(InterfaceC0884s interfaceC0884s, boolean z6) {
        interfaceC0884s.mo3518p();
        long mo3514i = interfaceC0884s.mo3514i();
        C4334x m3710c = m3710c(interfaceC0884s, z6);
        interfaceC0884s.mo3519q((int) (interfaceC0884s.mo3514i() - mo3514i));
        return m3710c;
    }

    /* renamed from: e */
    public static boolean m3712e(InterfaceC0884s interfaceC0884s, a aVar) {
        interfaceC0884s.mo3518p();
        C5356y c5356y = new C5356y(new byte[4]);
        interfaceC0884s.mo3521t(c5356y.f18880a, 0, 4);
        boolean m21907g = c5356y.m21907g();
        int m21908h = c5356y.m21908h(7);
        int m21908h2 = c5356y.m21908h(24) + 4;
        if (m21908h == 0) {
            aVar.f3107a = m3715h(interfaceC0884s);
        } else {
            C0844B c0844b = aVar.f3107a;
            if (c0844b == null) {
                throw new IllegalArgumentException();
            }
            if (m21908h == 3) {
                aVar.f3107a = c0844b.m3504b(m3713f(interfaceC0884s, m21908h2));
            } else if (m21908h == 4) {
                aVar.f3107a = c0844b.m3505c(m3717j(interfaceC0884s, m21908h2));
            } else if (m21908h == 6) {
                C5357z c5357z = new C5357z(m21908h2);
                interfaceC0884s.readFully(c5357z.m21946e(), 0, m21908h2);
                c5357z.m21940U(4);
                aVar.f3107a = c0844b.m3503a(AbstractC3033v.m11051u(C2797a.m9974a(c5357z)));
            } else {
                interfaceC0884s.mo3519q(m21908h2);
            }
        }
        return m21907g;
    }

    /* renamed from: f */
    public static C0844B.a m3713f(InterfaceC0884s interfaceC0884s, int i7) {
        C5357z c5357z = new C5357z(i7);
        interfaceC0884s.readFully(c5357z.m21946e(), 0, i7);
        return m3714g(c5357z);
    }

    /* renamed from: g */
    public static C0844B.a m3714g(C5357z c5357z) {
        c5357z.m21940U(1);
        int m21929J = c5357z.m21929J();
        long m21947f = c5357z.m21947f() + m21929J;
        int i7 = m21929J / 18;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            long m21967z = c5357z.m21967z();
            if (m21967z == -1) {
                jArr = Arrays.copyOf(jArr, i8);
                jArr2 = Arrays.copyOf(jArr2, i8);
                break;
            }
            jArr[i8] = m21967z;
            jArr2[i8] = c5357z.m21967z();
            c5357z.m21940U(2);
            i8++;
        }
        c5357z.m21940U((int) (m21947f - c5357z.m21947f()));
        return new C0844B.a(jArr, jArr2);
    }

    /* renamed from: h */
    public static C0844B m3715h(InterfaceC0884s interfaceC0884s) {
        byte[] bArr = new byte[38];
        interfaceC0884s.readFully(bArr, 0, 38);
        return new C0844B(bArr, 4);
    }

    /* renamed from: i */
    public static void m3716i(InterfaceC0884s interfaceC0884s) {
        C5357z c5357z = new C5357z(4);
        interfaceC0884s.readFully(c5357z.m21946e(), 0, 4);
        if (c5357z.m21928I() != 1716281667) {
            throw C4295A.m17943a("Failed to read FLAC stream marker.", null);
        }
    }

    /* renamed from: j */
    public static List m3717j(InterfaceC0884s interfaceC0884s, int i7) {
        C5357z c5357z = new C5357z(i7);
        interfaceC0884s.readFully(c5357z.m21946e(), 0, i7);
        c5357z.m21940U(4);
        return Arrays.asList(AbstractC0864W.m3576k(c5357z, false, false).f2968b);
    }
}
