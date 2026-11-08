package p078L0;

import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p232g0.C4295A;
import p259j0.AbstractC5330M;
import p259j0.C5357z;
import p272k4.C5410A;

/* renamed from: L0.y */
/* loaded from: classes.dex */
public abstract class AbstractC0890y {

    /* renamed from: L0.y$a */
    public static final class a {

        /* renamed from: a */
        public long f3106a;
    }

    /* renamed from: a */
    public static boolean m3698a(C5357z c5357z, C0844B c0844b, int i7) {
        int m3707j = m3707j(c5357z, i7);
        return m3707j != -1 && m3707j <= c0844b.f2886b;
    }

    /* renamed from: b */
    public static boolean m3699b(C5357z c5357z, int i7) {
        return c5357z.m21926G() == AbstractC5330M.m21784y(c5357z.m21946e(), i7, c5357z.m21947f() - 1, 0);
    }

    /* renamed from: c */
    public static boolean m3700c(C5357z c5357z, C0844B c0844b, boolean z6, a aVar) {
        try {
            long m21933N = c5357z.m21933N();
            if (!z6) {
                m21933N *= c0844b.f2886b;
            }
            aVar.f3106a = m21933N;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m3701d(C5357z c5357z, C0844B c0844b, int i7, a aVar) {
        int m21947f = c5357z.m21947f();
        long m21928I = c5357z.m21928I();
        long j7 = m21928I >>> 16;
        if (j7 != i7) {
            return false;
        }
        return m3704g((int) ((m21928I >> 4) & 15), c0844b) && m3703f((int) ((m21928I >> 1) & 7), c0844b) && !(((m21928I & 1) > 1L ? 1 : ((m21928I & 1) == 1L ? 0 : -1)) == 0) && m3700c(c5357z, c0844b, ((j7 & 1) > 1L ? 1 : ((j7 & 1) == 1L ? 0 : -1)) == 0, aVar) && m3698a(c5357z, c0844b, (int) ((m21928I >> 12) & 15)) && m3702e(c5357z, c0844b, (int) ((m21928I >> 8) & 15)) && m3699b(c5357z, m21947f);
    }

    /* renamed from: e */
    public static boolean m3702e(C5357z c5357z, C0844B c0844b, int i7) {
        int i8 = c0844b.f2889e;
        if (i7 == 0) {
            return true;
        }
        if (i7 <= 11) {
            return i7 == c0844b.f2890f;
        }
        if (i7 == 12) {
            return c5357z.m21926G() * PipesIterator.DEFAULT_QUEUE_SIZE == i8;
        }
        if (i7 > 14) {
            return false;
        }
        int m21932M = c5357z.m21932M();
        if (i7 == 14) {
            m21932M *= 10;
        }
        return m21932M == i8;
    }

    /* renamed from: f */
    public static boolean m3703f(int i7, C0844B c0844b) {
        return i7 == 0 || i7 == c0844b.f2893i;
    }

    /* renamed from: g */
    public static boolean m3704g(int i7, C0844B c0844b) {
        return i7 <= 7 ? i7 == c0844b.f2891g - 1 : i7 <= 10 && c0844b.f2891g == 2;
    }

    /* renamed from: h */
    public static boolean m3705h(InterfaceC0884s interfaceC0884s, C0844B c0844b, int i7, a aVar) {
        long mo3514i = interfaceC0884s.mo3514i();
        byte[] bArr = new byte[2];
        interfaceC0884s.mo3521t(bArr, 0, 2);
        if ((((bArr[0] & ForkServer.ERROR) << 8) | (bArr[1] & ForkServer.ERROR)) != i7) {
            interfaceC0884s.mo3518p();
            interfaceC0884s.mo3515k((int) (mo3514i - interfaceC0884s.mo3522u()));
            return false;
        }
        C5357z c5357z = new C5357z(16);
        System.arraycopy(bArr, 0, c5357z.m21946e(), 0, 2);
        c5357z.m21938S(AbstractC0886u.m3691c(interfaceC0884s, c5357z.m21946e(), 2, 14));
        interfaceC0884s.mo3518p();
        interfaceC0884s.mo3515k((int) (mo3514i - interfaceC0884s.mo3522u()));
        return m3701d(c5357z, c0844b, i7, aVar);
    }

    /* renamed from: i */
    public static long m3706i(InterfaceC0884s interfaceC0884s, C0844B c0844b) {
        interfaceC0884s.mo3518p();
        interfaceC0884s.mo3515k(1);
        byte[] bArr = new byte[1];
        interfaceC0884s.mo3521t(bArr, 0, 1);
        boolean z6 = (bArr[0] & 1) == 1;
        interfaceC0884s.mo3515k(2);
        int i7 = z6 ? 7 : 6;
        C5357z c5357z = new C5357z(i7);
        c5357z.m21938S(AbstractC0886u.m3691c(interfaceC0884s, c5357z.m21946e(), 0, i7));
        interfaceC0884s.mo3518p();
        a aVar = new a();
        if (m3700c(c5357z, c0844b, z6, aVar)) {
            return aVar.f3106a;
        }
        throw C4295A.m17943a(null, null);
    }

    /* renamed from: j */
    public static int m3707j(C5357z c5357z, int i7) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return c5357z.m21926G() + 1;
            case 7:
                return c5357z.m21932M() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }
}
