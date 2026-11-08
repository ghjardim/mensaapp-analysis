package p001A0;

import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p178Z2.AbstractC3035x;
import p232g0.C4295A;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5356y;
import p259j0.C5357z;
import p387z0.C7104e;
import p387z0.C7107h;

/* renamed from: A0.h */
/* loaded from: classes.dex */
public final class C0009h implements InterfaceC0012k {

    /* renamed from: a */
    public final C7107h f55a;

    /* renamed from: b */
    public final int f56b;

    /* renamed from: c */
    public InterfaceC0861T f57c;

    /* renamed from: d */
    public long f58d;

    /* renamed from: e */
    public int f59e;

    /* renamed from: f */
    public int f60f;

    /* renamed from: g */
    public long f61g;

    /* renamed from: h */
    public long f62h;

    public C0009h(C7107h c7107h) {
        this.f55a = c7107h;
        try {
            this.f56b = m50e(c7107h.f25276d);
            this.f58d = -9223372036854775807L;
            this.f59e = -1;
            this.f60f = 0;
            this.f61g = 0L;
            this.f62h = -9223372036854775807L;
        } catch (C4295A e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* renamed from: e */
    public static int m50e(AbstractC3035x abstractC3035x) {
        String str = (String) abstractC3035x.get("config");
        int i7 = 0;
        i7 = 0;
        if (str != null && str.length() % 2 == 0) {
            C5356y c5356y = new C5356y(AbstractC5330M.m21703Q(str));
            int m21908h = c5356y.m21908h(1);
            if (m21908h != 0) {
                throw C4295A.m17944b("unsupported audio mux version: " + m21908h, null);
            }
            AbstractC5332a.m21797b(c5356y.m21908h(1) == 1, "Only supports allStreamsSameTimeFraming.");
            int m21908h2 = c5356y.m21908h(6);
            AbstractC5332a.m21797b(c5356y.m21908h(4) == 0, "Only suppors one program.");
            AbstractC5332a.m21797b(c5356y.m21908h(3) == 0, "Only suppors one layer.");
            i7 = m21908h2;
        }
        return i7 + 1;
    }

    /* renamed from: f */
    private void m51f() {
        ((InterfaceC0861T) AbstractC5332a.m21800e(this.f57c)).mo562c(this.f62h, 1, this.f60f, 0, null);
        this.f60f = 0;
        this.f62h = -9223372036854775807L;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: a */
    public void mo29a(long j7, long j8) {
        this.f58d = j7;
        this.f60f = 0;
        this.f61g = j8;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: b */
    public void mo30b(InterfaceC0885t interfaceC0885t, int i7) {
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(i7, 2);
        this.f57c = mo455b;
        ((InterfaceC0861T) AbstractC5330M.m21747i(mo455b)).mo566e(this.f55a.f25275c);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: c */
    public void mo31c(C5357z c5357z, long j7, int i7, boolean z6) {
        AbstractC5332a.m21804i(this.f57c);
        int m29300b = C7104e.m29300b(this.f59e);
        if (this.f60f > 0 && m29300b < i7) {
            m51f();
        }
        for (int i8 = 0; i8 < this.f56b; i8++) {
            int i9 = 0;
            while (c5357z.m21947f() < c5357z.m21948g()) {
                int m21926G = c5357z.m21926G();
                i9 += m21926G;
                if (m21926G != 255) {
                    break;
                }
            }
            this.f57c.mo564d(c5357z, i9);
            this.f60f += i9;
        }
        this.f62h = AbstractC0014m.m54a(this.f61g, j7, this.f58d, this.f55a.f25274b);
        if (z6) {
            m51f();
        }
        this.f59e = i7;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: d */
    public void mo32d(long j7, int i7) {
        AbstractC5332a.m21802g(this.f58d == -9223372036854775807L);
        this.f58d = j7;
    }
}
