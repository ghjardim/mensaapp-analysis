package p120R0;

import p078L0.C0869d;
import p078L0.InterfaceC0861T;
import p120R0.AbstractC2225e;
import p232g0.C4327q;
import p259j0.C5357z;
import p268k0.AbstractC5400d;

/* renamed from: R0.f */
/* loaded from: classes.dex */
public final class C2226f extends AbstractC2225e {

    /* renamed from: b */
    public final C5357z f6820b;

    /* renamed from: c */
    public final C5357z f6821c;

    /* renamed from: d */
    public int f6822d;

    /* renamed from: e */
    public boolean f6823e;

    /* renamed from: f */
    public boolean f6824f;

    /* renamed from: g */
    public int f6825g;

    public C2226f(InterfaceC0861T interfaceC0861T) {
        super(interfaceC0861T);
        this.f6820b = new C5357z(AbstractC5400d.f19246a);
        this.f6821c = new C5357z(4);
    }

    @Override // p120R0.AbstractC2225e
    /* renamed from: b */
    public boolean mo7624b(C5357z c5357z) {
        int m21926G = c5357z.m21926G();
        int i7 = (m21926G >> 4) & 15;
        int i8 = m21926G & 15;
        if (i8 == 7) {
            this.f6825g = i7;
            return i7 != 5;
        }
        throw new AbstractC2225e.a("Video format not supported: " + i8);
    }

    @Override // p120R0.AbstractC2225e
    /* renamed from: c */
    public boolean mo7625c(C5357z c5357z, long j7) {
        int m21926G = c5357z.m21926G();
        long m21958q = j7 + (c5357z.m21958q() * 1000);
        if (m21926G == 0 && !this.f6823e) {
            C5357z c5357z2 = new C5357z(new byte[c5357z.m21942a()]);
            c5357z.m21953l(c5357z2.m21946e(), 0, c5357z.m21942a());
            C0869d m3606b = C0869d.m3606b(c5357z2);
            this.f6822d = m3606b.f3009b;
            this.f6819a.mo566e(new C4327q.b().m18264o0("video/avc").m18238O(m3606b.f3019l).m18271v0(m3606b.f3010c).m18248Y(m3606b.f3011d).m18260k0(m3606b.f3018k).m18251b0(m3606b.f3008a).m18234K());
            this.f6823e = true;
            return false;
        }
        if (m21926G != 1 || !this.f6823e) {
            return false;
        }
        int i7 = this.f6825g == 1 ? 1 : 0;
        if (!this.f6824f && i7 == 0) {
            return false;
        }
        byte[] m21946e = this.f6821c.m21946e();
        m21946e[0] = 0;
        m21946e[1] = 0;
        m21946e[2] = 0;
        int i8 = 4 - this.f6822d;
        int i9 = 0;
        while (c5357z.m21942a() > 0) {
            c5357z.m21953l(this.f6821c.m21946e(), i8, this.f6822d);
            this.f6821c.m21939T(0);
            int m21930K = this.f6821c.m21930K();
            this.f6820b.m21939T(0);
            this.f6819a.mo564d(this.f6820b, 4);
            this.f6819a.mo564d(c5357z, m21930K);
            i9 = i9 + 4 + m21930K;
        }
        this.f6819a.mo562c(m21958q, i7, i9, 0, null);
        this.f6824f = true;
        return true;
    }
}
