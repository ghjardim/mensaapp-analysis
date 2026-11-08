package p108P2;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.f6 */
/* loaded from: classes.dex */
public final class RunnableC1710f6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f5132a;

    /* renamed from: b */
    public final /* synthetic */ C1836t6 f5133b;

    public RunnableC1710f6(C1836t6 c1836t6, C1482E7 c1482e7) {
        this.f5132a = c1482e7;
        this.f5133b = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1832t2 interfaceC1832t2;
        C1836t6 c1836t6 = this.f5133b;
        interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5936r().m5902a("Failed to send consent settings to service");
            return;
        }
        try {
            C1482E7 c1482e7 = this.f5132a;
            AbstractC3802r.m15129k(c1482e7);
            interfaceC1832t2.mo6034R(c1482e7);
            c1836t6.m6405T();
        } catch (RemoteException e7) {
            this.f5133b.f5129a.mo5624b().m5936r().m5903b("Failed to send consent settings to the service", e7);
        }
    }
}
