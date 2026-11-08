package p108P2;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.T5 */
/* loaded from: classes.dex */
public final class RunnableC1608T5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f4942a;

    /* renamed from: b */
    public final /* synthetic */ C1836t6 f4943b;

    public RunnableC1608T5(C1836t6 c1836t6, C1482E7 c1482e7) {
        this.f4942a = c1482e7;
        this.f4943b = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1832t2 interfaceC1832t2;
        C1836t6 c1836t6 = this.f4943b;
        interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5936r().m5902a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C1482E7 c1482e7 = this.f4942a;
            AbstractC3802r.m15129k(c1482e7);
            interfaceC1832t2.mo6027D(c1482e7);
        } catch (RemoteException e7) {
            this.f4943b.f5129a.mo5624b().m5936r().m5903b("Failed to reset data on the service: remote exception", e7);
        }
        this.f4943b.m6405T();
    }
}
