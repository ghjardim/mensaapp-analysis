package p108P2;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzcy;
import java.util.ArrayList;

/* renamed from: P2.j6 */
/* loaded from: classes.dex */
public final class RunnableC1746j6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f5192a;

    /* renamed from: b */
    public final /* synthetic */ String f5193b;

    /* renamed from: c */
    public final /* synthetic */ C1482E7 f5194c;

    /* renamed from: d */
    public final /* synthetic */ zzcy f5195d;

    /* renamed from: e */
    public final /* synthetic */ C1836t6 f5196e;

    public RunnableC1746j6(C1836t6 c1836t6, String str, String str2, C1482E7 c1482e7, zzcy zzcyVar) {
        this.f5192a = str;
        this.f5193b = str2;
        this.f5194c = c1482e7;
        this.f5195d = zzcyVar;
        this.f5196e = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcy zzcyVar;
        C1473D7 m5619Q;
        C1836t6 c1836t6;
        InterfaceC1832t2 interfaceC1832t2;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                c1836t6 = this.f5196e;
                interfaceC1832t2 = c1836t6.f5523d;
            } catch (RemoteException e7) {
                this.f5196e.f5129a.mo5624b().m5936r().m5905d("Failed to get conditional properties; remote exception", this.f5192a, this.f5193b, e7);
            }
            if (interfaceC1832t2 == null) {
                C1460C3 c1460c3 = c1836t6.f5129a;
                c1460c3.mo5624b().m5936r().m5904c("Failed to get conditional properties; not connected to service", this.f5192a, this.f5193b);
                m5619Q = c1460c3.m5619Q();
                zzcyVar = this.f5195d;
                m5619Q.m5693I(zzcyVar, arrayList);
            }
            C1482E7 c1482e7 = this.f5194c;
            AbstractC3802r.m15129k(c1482e7);
            arrayList = C1473D7.m5680y(interfaceC1832t2.mo6037V(this.f5192a, this.f5193b, c1482e7));
            c1836t6.m6405T();
            C1836t6 c1836t62 = this.f5196e;
            zzcyVar = this.f5195d;
            m5619Q = c1836t62.f5129a.m5619Q();
            m5619Q.m5693I(zzcyVar, arrayList);
        } catch (Throwable th) {
            C1836t6 c1836t63 = this.f5196e;
            c1836t63.f5129a.m5619Q().m5693I(this.f5195d, arrayList);
            throw th;
        }
    }
}
