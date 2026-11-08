package p001A0;

import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p171Y2.AbstractC2920c;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5356y;
import p259j0.C5357z;
import p387z0.C7107h;

/* renamed from: A0.b */
/* loaded from: classes.dex */
public final class C0003b implements InterfaceC0012k {

    /* renamed from: a */
    public final C7107h f0a;

    /* renamed from: b */
    public final C5356y f1b = new C5356y();

    /* renamed from: c */
    public final int f2c;

    /* renamed from: d */
    public final int f3d;

    /* renamed from: e */
    public final int f4e;

    /* renamed from: f */
    public final int f5f;

    /* renamed from: g */
    public long f6g;

    /* renamed from: h */
    public InterfaceC0861T f7h;

    /* renamed from: i */
    public long f8i;

    public C0003b(C7107h c7107h) {
        this.f0a = c7107h;
        this.f2c = c7107h.f25274b;
        String str = (String) AbstractC5332a.m21800e((String) c7107h.f25276d.get("mode"));
        if (AbstractC2920c.m10511a(str, "AAC-hbr")) {
            this.f3d = 13;
            this.f4e = 3;
        } else {
            if (!AbstractC2920c.m10511a(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f3d = 6;
            this.f4e = 2;
        }
        this.f5f = this.f4e + this.f3d;
    }

    /* renamed from: e */
    public static void m28e(InterfaceC0861T interfaceC0861T, long j7, int i7) {
        interfaceC0861T.mo562c(j7, 1, i7, 0, null);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: a */
    public void mo29a(long j7, long j8) {
        this.f6g = j7;
        this.f8i = j8;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: b */
    public void mo30b(InterfaceC0885t interfaceC0885t, int i7) {
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(i7, 1);
        this.f7h = mo455b;
        mo455b.mo566e(this.f0a.f25275c);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: c */
    public void mo31c(C5357z c5357z, long j7, int i7, boolean z6) {
        AbstractC5332a.m21800e(this.f7h);
        short m21922C = c5357z.m21922C();
        int i8 = m21922C / this.f5f;
        long m54a = AbstractC0014m.m54a(this.f8i, j7, this.f6g, this.f2c);
        this.f1b.m21913m(c5357z);
        if (i8 == 1) {
            int m21908h = this.f1b.m21908h(this.f3d);
            this.f1b.m21918r(this.f4e);
            this.f7h.mo564d(c5357z, c5357z.m21942a());
            if (z6) {
                m28e(this.f7h, m54a, m21908h);
                return;
            }
            return;
        }
        c5357z.m21940U((m21922C + 7) / 8);
        for (int i9 = 0; i9 < i8; i9++) {
            int m21908h2 = this.f1b.m21908h(this.f3d);
            this.f1b.m21918r(this.f4e);
            this.f7h.mo564d(c5357z, m21908h2);
            m28e(this.f7h, m54a, m21908h2);
            m54a += AbstractC5330M.m21718X0(i8, 1000000L, this.f2c);
        }
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: d */
    public void mo32d(long j7, int i7) {
        this.f6g = j7;
    }
}
