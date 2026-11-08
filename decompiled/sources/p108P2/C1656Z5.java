package p108P2;

/* renamed from: P2.Z5 */
/* loaded from: classes.dex */
public final class C1656Z5 extends AbstractC1438A {

    /* renamed from: e */
    public final /* synthetic */ C1836t6 f5026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1656Z5(C1836t6 c1836t6, InterfaceC1726h4 interfaceC1726h4) {
        super(interfaceC1726h4);
        this.f5026e = c1836t6;
    }

    @Override // p108P2.AbstractC1438A
    /* renamed from: c */
    public final void mo5558c() {
        C1836t6 c1836t6 = this.f5026e;
        c1836t6.mo5762h();
        if (c1836t6.m6399N()) {
            c1836t6.f5129a.mo5624b().m5940v().m5902a("Inactivity, disconnecting from the service");
            c1836t6.m6412q();
        }
    }
}
