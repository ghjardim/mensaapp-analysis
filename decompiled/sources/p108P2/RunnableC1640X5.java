package p108P2;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.X5 */
/* loaded from: classes.dex */
public final class RunnableC1640X5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f4990a;

    /* renamed from: b */
    public final /* synthetic */ C1836t6 f4991b;

    public RunnableC1640X5(C1836t6 c1836t6, C1482E7 c1482e7, boolean z6) {
        this.f4990a = c1482e7;
        this.f4991b = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1832t2 interfaceC1832t2;
        C1836t6 c1836t6 = this.f4991b;
        interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5936r().m5902a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C1482E7 c1482e7 = this.f4990a;
            AbstractC3802r.m15129k(c1482e7);
            C1460C3 c1460c3 = c1836t6.f5129a;
            C1775n m5605B = c1460c3.m5605B();
            C1787o2 c1787o2 = AbstractC1805q2.f5406m1;
            if (m5605B.m6138P(null, c1787o2)) {
                c1836t6.m6388C(interfaceC1832t2, null, c1482e7);
            }
            interfaceC1832t2.mo6050k(c1482e7);
            c1836t6.f5129a.m5608E().m5663t();
            c1460c3.m5605B().m6138P(null, c1787o2);
            c1836t6.m6388C(interfaceC1832t2, null, c1482e7);
            c1836t6.m6405T();
        } catch (RemoteException e7) {
            this.f4991b.f5129a.mo5624b().m5936r().m5903b("Failed to send app launch to the service", e7);
        }
    }
}
