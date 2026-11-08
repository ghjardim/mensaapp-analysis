package p108P2;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.k6 */
/* loaded from: classes.dex */
public final class RunnableC1755k6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f5206a;

    /* renamed from: b */
    public final /* synthetic */ String f5207b;

    /* renamed from: c */
    public final /* synthetic */ String f5208c;

    /* renamed from: d */
    public final /* synthetic */ C1482E7 f5209d;

    /* renamed from: e */
    public final /* synthetic */ boolean f5210e;

    /* renamed from: f */
    public final /* synthetic */ C1836t6 f5211f;

    public RunnableC1755k6(C1836t6 c1836t6, AtomicReference atomicReference, String str, String str2, String str3, C1482E7 c1482e7, boolean z6) {
        this.f5206a = atomicReference;
        this.f5207b = str2;
        this.f5208c = str3;
        this.f5209d = c1482e7;
        this.f5210e = z6;
        this.f5211f = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C1836t6 c1836t6;
        InterfaceC1832t2 interfaceC1832t2;
        AtomicReference atomicReference2 = this.f5206a;
        synchronized (atomicReference2) {
            try {
                try {
                    c1836t6 = this.f5211f;
                    interfaceC1832t2 = c1836t6.f5523d;
                } catch (RemoteException e7) {
                    this.f5211f.f5129a.mo5624b().m5936r().m5905d("(legacy) Failed to get user properties; remote exception", null, this.f5207b, e7);
                    this.f5206a.set(Collections.emptyList());
                    atomicReference = this.f5206a;
                }
                if (interfaceC1832t2 == null) {
                    c1836t6.f5129a.mo5624b().m5936r().m5905d("(legacy) Failed to get user properties; not connected to service", null, this.f5207b, this.f5208c);
                    atomicReference2.set(Collections.emptyList());
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    C1482E7 c1482e7 = this.f5209d;
                    AbstractC3802r.m15129k(c1482e7);
                    atomicReference2.set(interfaceC1832t2.mo6028E(this.f5207b, this.f5208c, this.f5210e, c1482e7));
                } else {
                    atomicReference2.set(interfaceC1832t2.mo6026C(null, this.f5207b, this.f5208c, this.f5210e));
                }
                c1836t6.m6405T();
                atomicReference = this.f5206a;
                atomicReference.notify();
            } catch (Throwable th) {
                this.f5206a.notify();
                throw th;
            }
        }
    }
}
