package p108P2;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: P2.n6 */
/* loaded from: classes.dex */
public final class RunnableC1782n6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1832t2 f5251a;

    /* renamed from: b */
    public final /* synthetic */ ServiceConnectionC1827s6 f5252b;

    public RunnableC1782n6(ServiceConnectionC1827s6 serviceConnectionC1827s6, InterfaceC1832t2 interfaceC1832t2) {
        this.f5251a = interfaceC1832t2;
        this.f5252b = serviceConnectionC1827s6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2;
        ServiceConnectionC1827s6 serviceConnectionC1827s6 = this.f5252b;
        synchronized (serviceConnectionC1827s6) {
            try {
                serviceConnectionC1827s6.f5468a = false;
                C1836t6 c1836t6 = serviceConnectionC1827s6.f5470c;
                if (!c1836t6.m6399N()) {
                    c1836t6.f5129a.mo5624b().m5935q().m5902a("Connected to remote service");
                    c1836t6.m6395J(this.f5251a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1836t6 c1836t62 = this.f5252b.f5470c;
        if (c1836t62.f5129a.m5605B().m6138P(null, AbstractC1805q2.f5415p1)) {
            scheduledExecutorService = c1836t62.f5526g;
            if (scheduledExecutorService != null) {
                scheduledExecutorService2 = c1836t62.f5526g;
                scheduledExecutorService2.shutdownNow();
                c1836t62.f5526g = null;
            }
        }
    }
}
