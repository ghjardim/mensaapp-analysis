package p343t0;

import p022D0.InterfaceC0145c0;
import p259j0.AbstractC5332a;
import p284m0.C5561i;
import p292n0.C5756s0;

/* renamed from: t0.n */
/* loaded from: classes.dex */
public final class C6420n implements InterfaceC0145c0 {

    /* renamed from: a */
    public final int f23242a;

    /* renamed from: b */
    public final C6425s f23243b;

    /* renamed from: c */
    public int f23244c = -1;

    public C6420n(C6425s c6425s, int i7) {
        this.f23243b = c6425s;
        this.f23242a = i7;
    }

    /* renamed from: a */
    public void m26843a() {
        AbstractC5332a.m21796a(this.f23244c == -1);
        this.f23244c = this.f23243b.m26899z(this.f23242a);
    }

    @Override // p022D0.InterfaceC0145c0
    /* renamed from: b */
    public boolean mo487b() {
        return this.f23244c == -3 || (m26844d() && this.f23243b.m26866R(this.f23244c));
    }

    @Override // p022D0.InterfaceC0145c0
    /* renamed from: c */
    public void mo488c() {
        int i7 = this.f23244c;
        if (i7 == -2) {
            throw new C6427u(this.f23243b.m26896t().m653b(this.f23242a).m18064a(0).f15138n);
        }
        if (i7 == -1) {
            this.f23243b.m26871W();
        } else if (i7 != -3) {
            this.f23243b.m26872X(i7);
        }
    }

    /* renamed from: d */
    public final boolean m26844d() {
        int i7 = this.f23244c;
        return (i7 == -1 || i7 == -3 || i7 == -2) ? false : true;
    }

    /* renamed from: e */
    public void m26845e() {
        if (this.f23244c != -1) {
            this.f23243b.m26894r0(this.f23242a);
            this.f23244c = -1;
        }
    }

    @Override // p022D0.InterfaceC0145c0
    /* renamed from: j */
    public int mo489j(long j7) {
        if (m26844d()) {
            return this.f23243b.m26893q0(this.f23244c, j7);
        }
        return 0;
    }

    @Override // p022D0.InterfaceC0145c0
    /* renamed from: q */
    public int mo490q(C5756s0 c5756s0, C5561i c5561i, int i7) {
        if (this.f23244c == -3) {
            c5561i.m23272i(4);
            return -4;
        }
        if (m26844d()) {
            return this.f23243b.m26882g0(this.f23244c, c5756s0, c5561i, i7);
        }
        return -3;
    }
}
