package p108P2;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.measurement.zzcy;
import java.util.List;

/* renamed from: P2.P5 */
/* loaded from: classes.dex */
public final class RunnableC1577P5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f4874a;

    /* renamed from: b */
    public final /* synthetic */ String f4875b;

    /* renamed from: c */
    public final /* synthetic */ C1482E7 f4876c;

    /* renamed from: d */
    public final /* synthetic */ boolean f4877d;

    /* renamed from: e */
    public final /* synthetic */ zzcy f4878e;

    /* renamed from: f */
    public final /* synthetic */ C1836t6 f4879f;

    public RunnableC1577P5(C1836t6 c1836t6, String str, String str2, C1482E7 c1482e7, boolean z6, zzcy zzcyVar) {
        this.f4874a = str;
        this.f4875b = str2;
        this.f4876c = c1482e7;
        this.f4877d = z6;
        this.f4878e = zzcyVar;
        this.f4879f = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e7;
        InterfaceC1832t2 interfaceC1832t2;
        Bundle bundle2 = new Bundle();
        try {
            C1836t6 c1836t6 = this.f4879f;
            interfaceC1832t2 = c1836t6.f5523d;
            if (interfaceC1832t2 == null) {
                C1460C3 c1460c3 = c1836t6.f5129a;
                c1460c3.mo5624b().m5936r().m5904c("Failed to get user properties; not connected to service", this.f4874a, this.f4875b);
                c1460c3.m5619Q().m5694J(this.f4878e, bundle2);
                return;
            }
            C1482E7 c1482e7 = this.f4876c;
            AbstractC3802r.m15129k(c1482e7);
            List<C1891z7> mo6028E = interfaceC1832t2.mo6028E(this.f4874a, this.f4875b, this.f4877d, c1482e7);
            String[] strArr = C1473D7.f4594i;
            bundle = new Bundle();
            if (mo6028E != null) {
                for (C1891z7 c1891z7 : mo6028E) {
                    String str = c1891z7.f5642e;
                    if (str != null) {
                        bundle.putString(c1891z7.f5639b, str);
                    } else {
                        Long l7 = c1891z7.f5641d;
                        if (l7 != null) {
                            bundle.putLong(c1891z7.f5639b, l7.longValue());
                        } else {
                            Double d7 = c1891z7.f5644n;
                            if (d7 != null) {
                                bundle.putDouble(c1891z7.f5639b, d7.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    c1836t6.m6405T();
                    C1460C3 c1460c32 = c1836t6.f5129a;
                    c1460c32.m5619Q().m5694J(this.f4878e, bundle);
                } catch (RemoteException e8) {
                    e7 = e8;
                    this.f4879f.f5129a.mo5624b().m5936r().m5904c("Failed to get user properties; remote exception", this.f4874a, e7);
                    C1836t6 c1836t62 = this.f4879f;
                    c1836t62.f5129a.m5619Q().m5694J(this.f4878e, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                C1836t6 c1836t63 = this.f4879f;
                c1836t63.f5129a.m5619Q().m5694J(this.f4878e, bundle2);
                throw th;
            }
        } catch (RemoteException e9) {
            bundle = bundle2;
            e7 = e9;
        } catch (Throwable th2) {
            th = th2;
            C1836t6 c1836t632 = this.f4879f;
            c1836t632.f5129a.m5619Q().m5694J(this.f4878e, bundle2);
            throw th;
        }
    }
}
