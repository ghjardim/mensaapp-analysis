package p108P2;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.Y5 */
/* loaded from: classes.dex */
public final class RunnableC1648Y5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f5011a;

    /* renamed from: b */
    public final /* synthetic */ C1836t6 f5012b;

    public RunnableC1648Y5(C1836t6 c1836t6, C1482E7 c1482e7) {
        this.f5011a = c1482e7;
        this.f5012b = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1832t2 interfaceC1832t2;
        C1836t6 c1836t6 = this.f5012b;
        interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5941w().m5902a("Failed to send app backgrounded");
            return;
        }
        try {
            C1482E7 c1482e7 = this.f5011a;
            AbstractC3802r.m15129k(c1482e7);
            interfaceC1832t2.mo6038X(c1482e7);
            c1836t6.m6405T();
        } catch (RemoteException e7) {
            this.f5012b.f5129a.mo5624b().m5936r().m5903b("Failed to send app backgrounded to the service", e7);
        }
    }
}
