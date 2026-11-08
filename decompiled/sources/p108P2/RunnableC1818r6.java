package p108P2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p368w2.C6861b;

/* renamed from: P2.r6 */
/* loaded from: classes.dex */
public final class RunnableC1818r6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6861b f5456a;

    /* renamed from: b */
    public final /* synthetic */ ServiceConnectionC1827s6 f5457b;

    public RunnableC1818r6(ServiceConnectionC1827s6 serviceConnectionC1827s6, C6861b c6861b) {
        this.f5456a = c6861b;
        this.f5457b = serviceConnectionC1827s6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2;
        C1836t6 c1836t6 = this.f5457b.f5470c;
        c1836t6.f5523d = null;
        if (!c1836t6.f5129a.m5605B().m6138P(null, AbstractC1805q2.f5415p1) || this.f5456a.m28242x0() != 7777) {
            c1836t6.m6404S();
            return;
        }
        scheduledExecutorService = c1836t6.f5526g;
        if (scheduledExecutorService == null) {
            c1836t6.f5526g = Executors.newScheduledThreadPool(1);
        }
        scheduledExecutorService2 = c1836t6.f5526g;
        scheduledExecutorService2.schedule(new Runnable() { // from class: P2.q6
            @Override // java.lang.Runnable
            public final void run() {
                final C1836t6 c1836t62 = RunnableC1818r6.this.f5457b.f5470c;
                c1836t62.f5129a.mo5628f().m6446A(new Runnable() { // from class: P2.p6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1836t6.this.m6411p();
                    }
                });
            }
        }, ((Long) AbstractC1805q2.f5366Z.m6159a(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
