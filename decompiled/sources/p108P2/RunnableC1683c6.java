package p108P2;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcy;

/* renamed from: P2.c6 */
/* loaded from: classes.dex */
public final class RunnableC1683c6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1519J f5091a;

    /* renamed from: b */
    public final /* synthetic */ String f5092b;

    /* renamed from: c */
    public final /* synthetic */ zzcy f5093c;

    /* renamed from: d */
    public final /* synthetic */ C1836t6 f5094d;

    public RunnableC1683c6(C1836t6 c1836t6, C1519J c1519j, String str, zzcy zzcyVar) {
        this.f5091a = c1519j;
        this.f5092b = str;
        this.f5093c = zzcyVar;
        this.f5094d = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcy zzcyVar;
        C1473D7 m5619Q;
        C1836t6 c1836t6;
        InterfaceC1832t2 interfaceC1832t2;
        byte[] bArr = null;
        try {
            try {
                c1836t6 = this.f5094d;
                interfaceC1832t2 = c1836t6.f5523d;
            } catch (RemoteException e7) {
                this.f5094d.f5129a.mo5624b().m5936r().m5903b("Failed to send event to the service to bundle", e7);
            }
            if (interfaceC1832t2 == null) {
                C1460C3 c1460c3 = c1836t6.f5129a;
                c1460c3.mo5624b().m5936r().m5902a("Discarding data. Failed to send event to service to bundle");
                m5619Q = c1460c3.m5619Q();
                zzcyVar = this.f5093c;
                m5619Q.m5695K(zzcyVar, bArr);
            }
            bArr = interfaceC1832t2.mo6031K(this.f5091a, this.f5092b);
            c1836t6.m6405T();
            C1836t6 c1836t62 = this.f5094d;
            zzcyVar = this.f5093c;
            m5619Q = c1836t62.f5129a.m5619Q();
            m5619Q.m5695K(zzcyVar, bArr);
        } catch (Throwable th) {
            C1836t6 c1836t63 = this.f5094d;
            c1836t63.f5129a.m5619Q().m5695K(this.f5093c, null);
            throw th;
        }
    }
}
