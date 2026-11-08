package p108P2;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.b6 */
/* loaded from: classes.dex */
public final class RunnableC1674b6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f5048a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5049b;

    /* renamed from: c */
    public final /* synthetic */ C1501H f5050c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f5051d;

    /* renamed from: e */
    public final /* synthetic */ C1836t6 f5052e;

    public RunnableC1674b6(C1836t6 c1836t6, boolean z6, C1482E7 c1482e7, boolean z7, C1501H c1501h, Bundle bundle) {
        this.f5048a = c1482e7;
        this.f5049b = z7;
        this.f5050c = c1501h;
        this.f5051d = bundle;
        this.f5052e = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1832t2 interfaceC1832t2;
        C1836t6 c1836t6 = this.f5052e;
        interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5936r().m5902a("Failed to send default event parameters to service");
            return;
        }
        if (c1836t6.f5129a.m5605B().m6138P(null, AbstractC1805q2.f5406m1)) {
            C1482E7 c1482e7 = this.f5048a;
            AbstractC3802r.m15129k(c1482e7);
            this.f5052e.m6388C(interfaceC1832t2, this.f5049b ? null : this.f5050c, c1482e7);
            return;
        }
        try {
            C1482E7 c1482e72 = this.f5048a;
            AbstractC3802r.m15129k(c1482e72);
            interfaceC1832t2.mo6030I(this.f5051d, c1482e72);
            c1836t6.m6405T();
        } catch (RemoteException e7) {
            this.f5052e.f5129a.mo5624b().m5936r().m5903b("Failed to send default event parameters to service", e7);
        }
    }
}
