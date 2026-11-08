package p108P2;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.e6 */
/* loaded from: classes.dex */
public final class RunnableC1701e6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f5116a;

    /* renamed from: b */
    public final /* synthetic */ C1836t6 f5117b;

    public RunnableC1701e6(C1836t6 c1836t6, C1482E7 c1482e7) {
        this.f5116a = c1482e7;
        this.f5117b = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1832t2 interfaceC1832t2;
        C1836t6 c1836t6 = this.f5117b;
        interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5936r().m5902a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C1482E7 c1482e7 = this.f5116a;
            AbstractC3802r.m15129k(c1482e7);
            interfaceC1832t2.mo6057w(c1482e7);
            c1836t6.m6405T();
        } catch (RemoteException e7) {
            this.f5117b.f5129a.mo5624b().m5936r().m5903b("Failed to send measurementEnabled to the service", e7);
        }
    }
}
