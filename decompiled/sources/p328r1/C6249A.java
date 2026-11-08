package p328r1;

import org.apache.tika.fork.ForkServer;
import p078L0.C0854L;
import p078L0.InterfaceC0884s;
import p259j0.AbstractC5330M;
import p259j0.C5322E;
import p259j0.C5357z;

/* renamed from: r1.A */
/* loaded from: classes.dex */
public final class C6249A {

    /* renamed from: c */
    public boolean f22381c;

    /* renamed from: d */
    public boolean f22382d;

    /* renamed from: e */
    public boolean f22383e;

    /* renamed from: a */
    public final C5322E f22379a = new C5322E(0);

    /* renamed from: f */
    public long f22384f = -9223372036854775807L;

    /* renamed from: g */
    public long f22385g = -9223372036854775807L;

    /* renamed from: h */
    public long f22386h = -9223372036854775807L;

    /* renamed from: b */
    public final C5357z f22380b = new C5357z();

    /* renamed from: a */
    public static boolean m26111a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    /* renamed from: l */
    public static long m26112l(C5357z c5357z) {
        int m21947f = c5357z.m21947f();
        if (c5357z.m21942a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c5357z.m21953l(bArr, 0, 9);
        c5357z.m21939T(m21947f);
        if (m26111a(bArr)) {
            return m26113m(bArr);
        }
        return -9223372036854775807L;
    }

    /* renamed from: m */
    public static long m26113m(byte[] bArr) {
        byte b7 = bArr[0];
        long j7 = (((b7 & 56) >> 3) << 30) | ((b7 & 3) << 28) | ((bArr[1] & 255) << 20);
        byte b8 = bArr[2];
        return j7 | (((b8 & 248) >> 3) << 15) | ((b8 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    /* renamed from: b */
    public final int m26114b(InterfaceC0884s interfaceC0884s) {
        this.f22380b.m21936Q(AbstractC5330M.f18805f);
        this.f22381c = true;
        interfaceC0884s.mo3518p();
        return 0;
    }

    /* renamed from: c */
    public long m26115c() {
        return this.f22386h;
    }

    /* renamed from: d */
    public C5322E m26116d() {
        return this.f22379a;
    }

    /* renamed from: e */
    public boolean m26117e() {
        return this.f22381c;
    }

    /* renamed from: f */
    public final int m26118f(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & ForkServer.ERROR) | ((bArr[i7] & ForkServer.ERROR) << 24) | ((bArr[i7 + 1] & ForkServer.ERROR) << 16) | ((bArr[i7 + 2] & ForkServer.ERROR) << 8);
    }

    /* renamed from: g */
    public int m26119g(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        if (!this.f22383e) {
            return m26122j(interfaceC0884s, c0854l);
        }
        if (this.f22385g == -9223372036854775807L) {
            return m26114b(interfaceC0884s);
        }
        if (!this.f22382d) {
            return m26120h(interfaceC0884s, c0854l);
        }
        long j7 = this.f22384f;
        if (j7 == -9223372036854775807L) {
            return m26114b(interfaceC0884s);
        }
        this.f22386h = this.f22379a.m21652c(this.f22385g) - this.f22379a.m21651b(j7);
        return m26114b(interfaceC0884s);
    }

    /* renamed from: h */
    public final int m26120h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        int min = (int) Math.min(20000L, interfaceC0884s.mo3511a());
        long j7 = 0;
        if (interfaceC0884s.mo3522u() != j7) {
            c0854l.f2935a = j7;
            return 1;
        }
        this.f22380b.m21935P(min);
        interfaceC0884s.mo3518p();
        interfaceC0884s.mo3521t(this.f22380b.m21946e(), 0, min);
        this.f22384f = m26121i(this.f22380b);
        this.f22382d = true;
        return 0;
    }

    /* renamed from: i */
    public final long m26121i(C5357z c5357z) {
        int m21948g = c5357z.m21948g();
        for (int m21947f = c5357z.m21947f(); m21947f < m21948g - 3; m21947f++) {
            if (m26118f(c5357z.m21946e(), m21947f) == 442) {
                c5357z.m21939T(m21947f + 4);
                long m26112l = m26112l(c5357z);
                if (m26112l != -9223372036854775807L) {
                    return m26112l;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: j */
    public final int m26122j(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        long mo3511a = interfaceC0884s.mo3511a();
        int min = (int) Math.min(20000L, mo3511a);
        long j7 = mo3511a - min;
        if (interfaceC0884s.mo3522u() != j7) {
            c0854l.f2935a = j7;
            return 1;
        }
        this.f22380b.m21935P(min);
        interfaceC0884s.mo3518p();
        interfaceC0884s.mo3521t(this.f22380b.m21946e(), 0, min);
        this.f22385g = m26123k(this.f22380b);
        this.f22383e = true;
        return 0;
    }

    /* renamed from: k */
    public final long m26123k(C5357z c5357z) {
        int m21947f = c5357z.m21947f();
        for (int m21948g = c5357z.m21948g() - 4; m21948g >= m21947f; m21948g--) {
            if (m26118f(c5357z.m21946e(), m21948g) == 442) {
                c5357z.m21939T(m21948g + 4);
                long m26112l = m26112l(c5357z);
                if (m26112l != -9223372036854775807L) {
                    return m26112l;
                }
            }
        }
        return -9223372036854775807L;
    }
}
