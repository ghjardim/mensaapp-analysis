package p209d1;

import java.util.ArrayDeque;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
import p078L0.InterfaceC0884s;
import p232g0.C4295A;
import p259j0.AbstractC5332a;

/* renamed from: d1.a */
/* loaded from: classes.dex */
public final class C4101a implements InterfaceC4103c {

    /* renamed from: a */
    public final byte[] f13681a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque f13682b = new ArrayDeque();

    /* renamed from: c */
    public final C4107g f13683c = new C4107g();

    /* renamed from: d */
    public InterfaceC4102b f13684d;

    /* renamed from: e */
    public int f13685e;

    /* renamed from: f */
    public int f13686f;

    /* renamed from: g */
    public long f13687g;

    /* renamed from: d1.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f13688a;

        /* renamed from: b */
        public final long f13689b;

        public b(int i7, long j7) {
            this.f13688a = i7;
            this.f13689b = j7;
        }
    }

    /* renamed from: f */
    public static String m17216f(InterfaceC0884s interfaceC0884s, int i7) {
        if (i7 == 0) {
            return StringUtils.EMPTY;
        }
        byte[] bArr = new byte[i7];
        interfaceC0884s.readFully(bArr, 0, i7);
        while (i7 > 0 && bArr[i7 - 1] == 0) {
            i7--;
        }
        return new String(bArr, 0, i7);
    }

    @Override // p209d1.InterfaceC4103c
    /* renamed from: a */
    public boolean mo17217a(InterfaceC0884s interfaceC0884s) {
        AbstractC5332a.m21804i(this.f13684d);
        while (true) {
            b bVar = (b) this.f13682b.peek();
            if (bVar != null && interfaceC0884s.mo3522u() >= bVar.f13689b) {
                this.f13684d.mo17224a(((b) this.f13682b.pop()).f13688a);
                return true;
            }
            if (this.f13685e == 0) {
                long m17286d = this.f13683c.m17286d(interfaceC0884s, true, false, 4);
                if (m17286d == -2) {
                    m17286d = m17219c(interfaceC0884s);
                }
                if (m17286d == -1) {
                    return false;
                }
                this.f13686f = (int) m17286d;
                this.f13685e = 1;
            }
            if (this.f13685e == 1) {
                this.f13687g = this.f13683c.m17286d(interfaceC0884s, false, true, 8);
                this.f13685e = 2;
            }
            int mo17225b = this.f13684d.mo17225b(this.f13686f);
            if (mo17225b != 0) {
                if (mo17225b == 1) {
                    long mo3522u = interfaceC0884s.mo3522u();
                    this.f13682b.push(new b(this.f13686f, this.f13687g + mo3522u));
                    this.f13684d.mo17230g(this.f13686f, mo3522u, this.f13687g);
                    this.f13685e = 0;
                    return true;
                }
                if (mo17225b == 2) {
                    long j7 = this.f13687g;
                    if (j7 <= 8) {
                        this.f13684d.mo17231h(this.f13686f, m17221e(interfaceC0884s, (int) j7));
                        this.f13685e = 0;
                        return true;
                    }
                    throw C4295A.m17943a("Invalid integer size: " + this.f13687g, null);
                }
                if (mo17225b == 3) {
                    long j8 = this.f13687g;
                    if (j8 <= 2147483647L) {
                        this.f13684d.mo17228e(this.f13686f, m17216f(interfaceC0884s, (int) j8));
                        this.f13685e = 0;
                        return true;
                    }
                    throw C4295A.m17943a("String element size: " + this.f13687g, null);
                }
                if (mo17225b == 4) {
                    this.f13684d.mo17226c(this.f13686f, (int) this.f13687g, interfaceC0884s);
                    this.f13685e = 0;
                    return true;
                }
                if (mo17225b != 5) {
                    throw C4295A.m17943a("Invalid element type " + mo17225b, null);
                }
                long j9 = this.f13687g;
                if (j9 == 4 || j9 == 8) {
                    this.f13684d.mo17229f(this.f13686f, m17220d(interfaceC0884s, (int) j9));
                    this.f13685e = 0;
                    return true;
                }
                throw C4295A.m17943a("Invalid float size: " + this.f13687g, null);
            }
            interfaceC0884s.mo3519q((int) this.f13687g);
            this.f13685e = 0;
        }
    }

    @Override // p209d1.InterfaceC4103c
    /* renamed from: b */
    public void mo17218b(InterfaceC4102b interfaceC4102b) {
        this.f13684d = interfaceC4102b;
    }

    /* renamed from: c */
    public final long m17219c(InterfaceC0884s interfaceC0884s) {
        interfaceC0884s.mo3518p();
        while (true) {
            interfaceC0884s.mo3521t(this.f13681a, 0, 4);
            int m17284c = C4107g.m17284c(this.f13681a[0]);
            if (m17284c != -1 && m17284c <= 4) {
                int m17283a = (int) C4107g.m17283a(this.f13681a, m17284c, false);
                if (this.f13684d.mo17227d(m17283a)) {
                    interfaceC0884s.mo3519q(m17284c);
                    return m17283a;
                }
            }
            interfaceC0884s.mo3519q(1);
        }
    }

    /* renamed from: d */
    public final double m17220d(InterfaceC0884s interfaceC0884s, int i7) {
        return i7 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(m17221e(interfaceC0884s, i7));
    }

    /* renamed from: e */
    public final long m17221e(InterfaceC0884s interfaceC0884s, int i7) {
        interfaceC0884s.readFully(this.f13681a, 0, i7);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 = (j7 << 8) | (this.f13681a[i8] & ForkServer.ERROR);
        }
        return j7;
    }

    @Override // p209d1.InterfaceC4103c
    public void reset() {
        this.f13685e = 0;
        this.f13682b.clear();
        this.f13683c.m17287e();
    }
}
