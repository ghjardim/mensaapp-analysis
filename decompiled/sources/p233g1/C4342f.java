package p233g1;

import p078L0.AbstractC0886u;
import p078L0.InterfaceC0884s;
import p232g0.C4295A;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: g1.f */
/* loaded from: classes.dex */
public final class C4342f {

    /* renamed from: a */
    public int f15466a;

    /* renamed from: b */
    public int f15467b;

    /* renamed from: c */
    public long f15468c;

    /* renamed from: d */
    public long f15469d;

    /* renamed from: e */
    public long f15470e;

    /* renamed from: f */
    public long f15471f;

    /* renamed from: g */
    public int f15472g;

    /* renamed from: h */
    public int f15473h;

    /* renamed from: i */
    public int f15474i;

    /* renamed from: j */
    public final int[] f15475j = new int[255];

    /* renamed from: k */
    public final C5357z f15476k = new C5357z(255);

    /* renamed from: a */
    public boolean m18457a(InterfaceC0884s interfaceC0884s, boolean z6) {
        m18458b();
        this.f15476k.m21935P(27);
        if (!AbstractC0886u.m3690b(interfaceC0884s, this.f15476k.m21946e(), 0, 27, z6) || this.f15476k.m21928I() != 1332176723) {
            return false;
        }
        int m21926G = this.f15476k.m21926G();
        this.f15466a = m21926G;
        if (m21926G != 0) {
            if (z6) {
                return false;
            }
            throw C4295A.m17947e("unsupported bit stream revision");
        }
        this.f15467b = this.f15476k.m21926G();
        this.f15468c = this.f15476k.m21962u();
        this.f15469d = this.f15476k.m21964w();
        this.f15470e = this.f15476k.m21964w();
        this.f15471f = this.f15476k.m21964w();
        int m21926G2 = this.f15476k.m21926G();
        this.f15472g = m21926G2;
        this.f15473h = m21926G2 + 27;
        this.f15476k.m21935P(m21926G2);
        if (!AbstractC0886u.m3690b(interfaceC0884s, this.f15476k.m21946e(), 0, this.f15472g, z6)) {
            return false;
        }
        for (int i7 = 0; i7 < this.f15472g; i7++) {
            this.f15475j[i7] = this.f15476k.m21926G();
            this.f15474i += this.f15475j[i7];
        }
        return true;
    }

    /* renamed from: b */
    public void m18458b() {
        this.f15466a = 0;
        this.f15467b = 0;
        this.f15468c = 0L;
        this.f15469d = 0L;
        this.f15470e = 0L;
        this.f15471f = 0L;
        this.f15472g = 0;
        this.f15473h = 0;
        this.f15474i = 0;
    }

    /* renamed from: c */
    public boolean m18459c(InterfaceC0884s interfaceC0884s) {
        return m18460d(interfaceC0884s, -1L);
    }

    /* renamed from: d */
    public boolean m18460d(InterfaceC0884s interfaceC0884s, long j7) {
        AbstractC5332a.m21796a(interfaceC0884s.mo3522u() == interfaceC0884s.mo3514i());
        this.f15476k.m21935P(4);
        while (true) {
            if ((j7 == -1 || interfaceC0884s.mo3522u() + 4 < j7) && AbstractC0886u.m3690b(interfaceC0884s, this.f15476k.m21946e(), 0, 4, true)) {
                this.f15476k.m21939T(0);
                if (this.f15476k.m21928I() == 1332176723) {
                    interfaceC0884s.mo3518p();
                    return true;
                }
                interfaceC0884s.mo3519q(1);
            }
        }
        do {
            if (j7 != -1 && interfaceC0884s.mo3522u() >= j7) {
                break;
            }
        } while (interfaceC0884s.mo3516l(1) != -1);
        return false;
    }
}
