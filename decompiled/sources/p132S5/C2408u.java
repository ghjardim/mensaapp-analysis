package p132S5;

/* renamed from: S5.u */
/* loaded from: classes2.dex */
public final class C2408u extends AbstractC2413w0 implements InterfaceC2406t {

    /* renamed from: e */
    public final InterfaceC2410v f7156e;

    public C2408u(InterfaceC2410v interfaceC2410v) {
        this.f7156e = interfaceC2410v;
    }

    @Override // p132S5.InterfaceC2403r0
    /* renamed from: a */
    public void mo7940a(Throwable th) {
        this.f7156e.mo7879C(m7866v());
    }

    @Override // p132S5.InterfaceC2406t
    /* renamed from: f */
    public boolean mo7994f(Throwable th) {
        return m7866v().mo7900N(th);
    }

    @Override // p132S5.InterfaceC2406t
    public InterfaceC2409u0 getParent() {
        return m7866v();
    }
}
