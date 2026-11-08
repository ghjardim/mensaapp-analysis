package p108P2;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.V5 */
/* loaded from: classes.dex */
public final class RunnableC1624V5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f4964a;

    /* renamed from: b */
    public final /* synthetic */ C1482E7 f4965b;

    /* renamed from: c */
    public final /* synthetic */ C1836t6 f4966c;

    public RunnableC1624V5(C1836t6 c1836t6, AtomicReference atomicReference, C1482E7 c1482e7) {
        this.f4964a = atomicReference;
        this.f4965b = c1482e7;
        this.f4966c = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C1836t6 c1836t6;
        C1460C3 c1460c3;
        InterfaceC1832t2 interfaceC1832t2;
        AtomicReference atomicReference2 = this.f4964a;
        synchronized (atomicReference2) {
            try {
                try {
                    c1836t6 = this.f4966c;
                    c1460c3 = c1836t6.f5129a;
                } catch (RemoteException e7) {
                    this.f4966c.f5129a.mo5624b().m5936r().m5903b("Failed to get app instance id", e7);
                    atomicReference = this.f4964a;
                }
                if (!c1460c3.m5611H().m6007t().m6115r(EnumC1762l4.ANALYTICS_STORAGE)) {
                    c1460c3.mo5624b().m5942x().m5902a("Analytics storage consent denied; will not get app instance id");
                    c1836t6.f5129a.m5613K().m6196Q(null);
                    c1460c3.m5611H().f5068i.m5987b(null);
                    atomicReference2.set(null);
                    atomicReference2.notify();
                    return;
                }
                interfaceC1832t2 = c1836t6.f5523d;
                if (interfaceC1832t2 == null) {
                    c1460c3.mo5624b().m5936r().m5902a("Failed to get app instance id");
                    atomicReference2.notify();
                    return;
                }
                C1482E7 c1482e7 = this.f4965b;
                AbstractC3802r.m15129k(c1482e7);
                atomicReference2.set(interfaceC1832t2.mo6047g(c1482e7));
                String str = (String) atomicReference2.get();
                if (str != null) {
                    c1836t6.f5129a.m5613K().m6196Q(str);
                    c1460c3.m5611H().f5068i.m5987b(str);
                }
                c1836t6.m6405T();
                atomicReference = this.f4964a;
                atomicReference.notify();
            } catch (Throwable th) {
                this.f4964a.notify();
                throw th;
            }
        }
    }
}
