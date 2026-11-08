package p336s1;

import android.util.Pair;
import p078L0.InterfaceC0884s;
import p232g0.C4295A;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;

/* renamed from: s1.d */
/* loaded from: classes.dex */
public abstract class AbstractC6370d {

    /* renamed from: s1.d$a */
    public static final class a {

        /* renamed from: a */
        public final int f23057a;

        /* renamed from: b */
        public final long f23058b;

        public a(int i7, long j7) {
            this.f23057a = i7;
            this.f23058b = j7;
        }

        /* renamed from: a */
        public static a m26679a(InterfaceC0884s interfaceC0884s, C5357z c5357z) {
            interfaceC0884s.mo3521t(c5357z.m21946e(), 0, 8);
            c5357z.m21939T(0);
            return new a(c5357z.m21957p(), c5357z.m21964w());
        }
    }

    /* renamed from: a */
    public static boolean m26674a(InterfaceC0884s interfaceC0884s) {
        C5357z c5357z = new C5357z(8);
        int i7 = a.m26679a(interfaceC0884s, c5357z).f23057a;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        interfaceC0884s.mo3521t(c5357z.m21946e(), 0, 4);
        c5357z.m21939T(0);
        int m21957p = c5357z.m21957p();
        if (m21957p == 1463899717) {
            return true;
        }
        AbstractC5346o.m21862c("WavHeaderReader", "Unsupported form type: " + m21957p);
        return false;
    }

    /* renamed from: b */
    public static C6369c m26675b(InterfaceC0884s interfaceC0884s) {
        byte[] bArr;
        C5357z c5357z = new C5357z(16);
        a m26677d = m26677d(1718449184, interfaceC0884s, c5357z);
        AbstractC5332a.m21802g(m26677d.f23058b >= 16);
        interfaceC0884s.mo3521t(c5357z.m21946e(), 0, 16);
        c5357z.m21939T(0);
        int m21966y = c5357z.m21966y();
        int m21966y2 = c5357z.m21966y();
        int m21965x = c5357z.m21965x();
        int m21965x2 = c5357z.m21965x();
        int m21966y3 = c5357z.m21966y();
        int m21966y4 = c5357z.m21966y();
        int i7 = ((int) m26677d.f23058b) - 16;
        if (i7 > 0) {
            byte[] bArr2 = new byte[i7];
            interfaceC0884s.mo3521t(bArr2, 0, i7);
            bArr = bArr2;
        } else {
            bArr = AbstractC5330M.f18805f;
        }
        interfaceC0884s.mo3519q((int) (interfaceC0884s.mo3514i() - interfaceC0884s.mo3522u()));
        return new C6369c(m21966y, m21966y2, m21965x, m21965x2, m21966y3, m21966y4, bArr);
    }

    /* renamed from: c */
    public static long m26676c(InterfaceC0884s interfaceC0884s) {
        C5357z c5357z = new C5357z(8);
        a m26679a = a.m26679a(interfaceC0884s, c5357z);
        if (m26679a.f23057a != 1685272116) {
            interfaceC0884s.mo3518p();
            return -1L;
        }
        interfaceC0884s.mo3515k(8);
        c5357z.m21939T(0);
        interfaceC0884s.mo3521t(c5357z.m21946e(), 0, 8);
        long m21962u = c5357z.m21962u();
        interfaceC0884s.mo3519q(((int) m26679a.f23058b) + 8);
        return m21962u;
    }

    /* renamed from: d */
    public static a m26677d(int i7, InterfaceC0884s interfaceC0884s, C5357z c5357z) {
        a m26679a = a.m26679a(interfaceC0884s, c5357z);
        while (m26679a.f23057a != i7) {
            AbstractC5346o.m21867h("WavHeaderReader", "Ignoring unknown WAV chunk: " + m26679a.f23057a);
            long j7 = m26679a.f23058b;
            long j8 = 8 + j7;
            if (j7 % 2 != 0) {
                j8 = 9 + j7;
            }
            if (j8 > 2147483647L) {
                throw C4295A.m17947e("Chunk is too large (~2GB+) to skip; id: " + m26679a.f23057a);
            }
            interfaceC0884s.mo3519q((int) j8);
            m26679a = a.m26679a(interfaceC0884s, c5357z);
        }
        return m26679a;
    }

    /* renamed from: e */
    public static Pair m26678e(InterfaceC0884s interfaceC0884s) {
        interfaceC0884s.mo3518p();
        a m26677d = m26677d(1684108385, interfaceC0884s, new C5357z(8));
        interfaceC0884s.mo3519q(8);
        return Pair.create(Long.valueOf(interfaceC0884s.mo3522u()), Long.valueOf(m26677d.f23058b));
    }
}
