package p108P2;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzcy;

/* renamed from: P2.W5 */
/* loaded from: classes.dex */
public final class RunnableC1632W5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f4977a;

    /* renamed from: b */
    public final /* synthetic */ zzcy f4978b;

    /* renamed from: c */
    public final /* synthetic */ C1836t6 f4979c;

    public RunnableC1632W5(C1836t6 c1836t6, C1482E7 c1482e7, zzcy zzcyVar) {
        this.f4977a = c1482e7;
        this.f4978b = zzcyVar;
        this.f4979c = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcy zzcyVar;
        C1473D7 m5619Q;
        C1836t6 c1836t6;
        C1460C3 c1460c3;
        InterfaceC1832t2 interfaceC1832t2;
        String str = null;
        try {
            try {
                c1836t6 = this.f4979c;
                c1460c3 = c1836t6.f5129a;
            } catch (RemoteException e7) {
                this.f4979c.f5129a.mo5624b().m5936r().m5903b("Failed to get app instance id", e7);
            }
            if (c1460c3.m5611H().m6007t().m6115r(EnumC1762l4.ANALYTICS_STORAGE)) {
                interfaceC1832t2 = c1836t6.f5523d;
                if (interfaceC1832t2 != null) {
                    C1482E7 c1482e7 = this.f4977a;
                    AbstractC3802r.m15129k(c1482e7);
                    str = interfaceC1832t2.mo6047g(c1482e7);
                    if (str != null) {
                        c1836t6.f5129a.m5613K().m6196Q(str);
                        c1460c3.m5611H().f5068i.m5987b(str);
                    }
                    c1836t6.m6405T();
                    C1836t6 c1836t62 = this.f4979c;
                    zzcyVar = this.f4978b;
                    m5619Q = c1836t62.f5129a.m5619Q();
                    m5619Q.m5698N(zzcyVar, str);
                }
                c1460c3.mo5624b().m5936r().m5902a("Failed to get app instance id");
            } else {
                c1460c3.mo5624b().m5942x().m5902a("Analytics storage consent denied; will not get app instance id");
                c1836t6.f5129a.m5613K().m6196Q(null);
                c1460c3.m5611H().f5068i.m5987b(null);
            }
            m5619Q = c1460c3.m5619Q();
            zzcyVar = this.f4978b;
            m5619Q.m5698N(zzcyVar, str);
        } catch (Throwable th) {
            C1836t6 c1836t63 = this.f4979c;
            c1836t63.f5129a.m5619Q().m5698N(this.f4978b, null);
            throw th;
        }
    }
}
