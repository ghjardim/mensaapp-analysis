package p001A0;

import p078L0.AbstractC0867b;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5356y;
import p259j0.C5357z;
import p387z0.C7107h;

/* renamed from: A0.c */
/* loaded from: classes.dex */
public final class C0004c implements InterfaceC0012k {

    /* renamed from: a */
    public final C7107h f9a;

    /* renamed from: c */
    public InterfaceC0861T f11c;

    /* renamed from: d */
    public int f12d;

    /* renamed from: f */
    public long f14f;

    /* renamed from: g */
    public long f15g;

    /* renamed from: b */
    public final C5356y f10b = new C5356y();

    /* renamed from: e */
    public long f13e = -9223372036854775807L;

    public C0004c(C7107h c7107h) {
        this.f9a = c7107h;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: a */
    public void mo29a(long j7, long j8) {
        this.f13e = j7;
        this.f15g = j8;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: b */
    public void mo30b(InterfaceC0885t interfaceC0885t, int i7) {
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(i7, 1);
        this.f11c = mo455b;
        mo455b.mo566e(this.f9a.f25275c);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: c */
    public void mo31c(C5357z c5357z, long j7, int i7, boolean z6) {
        int m21926G = c5357z.m21926G() & 3;
        int m21926G2 = c5357z.m21926G() & 255;
        long m54a = AbstractC0014m.m54a(this.f15g, j7, this.f13e, this.f9a.f25274b);
        if (m21926G == 0) {
            m33e();
            if (m21926G2 == 1) {
                m37i(c5357z, m54a);
                return;
            } else {
                m36h(c5357z, m21926G2, m54a);
                return;
            }
        }
        if (m21926G == 1 || m21926G == 2) {
            m33e();
        } else if (m21926G != 3) {
            throw new IllegalArgumentException(String.valueOf(m21926G));
        }
        m35g(c5357z, z6, m21926G, m54a);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: d */
    public void mo32d(long j7, int i7) {
        AbstractC5332a.m21802g(this.f13e == -9223372036854775807L);
        this.f13e = j7;
    }

    /* renamed from: e */
    public final void m33e() {
        if (this.f12d > 0) {
            m34f();
        }
    }

    /* renamed from: f */
    public final void m34f() {
        ((InterfaceC0861T) AbstractC5330M.m21747i(this.f11c)).mo562c(this.f14f, 1, this.f12d, 0, null);
        this.f12d = 0;
    }

    /* renamed from: g */
    public final void m35g(C5357z c5357z, boolean z6, int i7, long j7) {
        int m21942a = c5357z.m21942a();
        ((InterfaceC0861T) AbstractC5332a.m21800e(this.f11c)).mo564d(c5357z, m21942a);
        this.f12d += m21942a;
        this.f14f = j7;
        if (z6 && i7 == 3) {
            m34f();
        }
    }

    /* renamed from: h */
    public final void m36h(C5357z c5357z, int i7, long j7) {
        this.f10b.m21914n(c5357z.m21946e());
        this.f10b.m21919s(2);
        for (int i8 = 0; i8 < i7; i8++) {
            AbstractC0867b.b m3594f = AbstractC0867b.m3594f(this.f10b);
            ((InterfaceC0861T) AbstractC5332a.m21800e(this.f11c)).mo564d(c5357z, m3594f.f2999e);
            ((InterfaceC0861T) AbstractC5330M.m21747i(this.f11c)).mo562c(j7, 1, m3594f.f2999e, 0, null);
            j7 += (m3594f.f3000f / m3594f.f2997c) * 1000000;
            this.f10b.m21919s(m3594f.f2999e);
        }
    }

    /* renamed from: i */
    public final void m37i(C5357z c5357z, long j7) {
        int m21942a = c5357z.m21942a();
        ((InterfaceC0861T) AbstractC5332a.m21800e(this.f11c)).mo564d(c5357z, m21942a);
        ((InterfaceC0861T) AbstractC5330M.m21747i(this.f11c)).mo562c(j7, 1, m21942a, 0, null);
    }
}
