package p108P2;

/* renamed from: P2.l6 */
/* loaded from: classes.dex */
public final class RunnableC1764l6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1832t2 f5225a;

    /* renamed from: b */
    public final /* synthetic */ ServiceConnectionC1827s6 f5226b;

    public RunnableC1764l6(ServiceConnectionC1827s6 serviceConnectionC1827s6, InterfaceC1832t2 interfaceC1832t2) {
        this.f5225a = interfaceC1832t2;
        this.f5226b = serviceConnectionC1827s6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC1827s6 serviceConnectionC1827s6 = this.f5226b;
        synchronized (serviceConnectionC1827s6) {
            try {
                serviceConnectionC1827s6.f5468a = false;
                C1836t6 c1836t6 = serviceConnectionC1827s6.f5470c;
                if (!c1836t6.m6399N()) {
                    c1836t6.f5129a.mo5624b().m5940v().m5902a("Connected to service");
                    c1836t6.m6395J(this.f5225a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
