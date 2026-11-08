package p108P2;

import android.os.RemoteException;

/* renamed from: P2.a6 */
/* loaded from: classes.dex */
public final class RunnableC1665a6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1462C5 f5040a;

    /* renamed from: b */
    public final /* synthetic */ C1836t6 f5041b;

    public RunnableC1665a6(C1836t6 c1836t6, C1462C5 c1462c5) {
        this.f5040a = c1462c5;
        this.f5041b = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1832t2 interfaceC1832t2;
        C1836t6 c1836t6 = this.f5041b;
        interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5936r().m5902a("Failed to send current screen to service");
            return;
        }
        try {
            C1462C5 c1462c5 = this.f5040a;
            if (c1462c5 == null) {
                interfaceC1832t2.mo6036U(0L, null, null, c1836t6.f5129a.mo5625c().getPackageName());
            } else {
                interfaceC1832t2.mo6036U(c1462c5.f4571c, c1462c5.f4569a, c1462c5.f4570b, c1836t6.f5129a.mo5625c().getPackageName());
            }
            c1836t6.m6405T();
        } catch (RemoteException e7) {
            this.f5041b.f5129a.mo5624b().m5936r().m5903b("Failed to send current screen to the service", e7);
        }
    }
}
