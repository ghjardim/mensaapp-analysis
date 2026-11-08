package p108P2;

/* renamed from: P2.z */
/* loaded from: classes.dex */
public final class RunnableC1883z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1726h4 f5627a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1438A f5628b;

    public RunnableC1883z(AbstractC1438A abstractC1438A, InterfaceC1726h4 interfaceC1726h4) {
        this.f5627a = interfaceC1726h4;
        this.f5628b = abstractC1438A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1726h4 interfaceC1726h4 = this.f5627a;
        interfaceC1726h4.mo5623a();
        if (C1712g.m6076a()) {
            interfaceC1726h4.mo5628f().m6446A(this);
            return;
        }
        AbstractC1438A abstractC1438A = this.f5628b;
        boolean m5560e = abstractC1438A.m5560e();
        abstractC1438A.f4484c = 0L;
        if (m5560e) {
            abstractC1438A.mo5558c();
        }
    }
}
