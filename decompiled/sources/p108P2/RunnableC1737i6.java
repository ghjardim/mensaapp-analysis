package p108P2;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.i6 */
/* loaded from: classes.dex */
public final class RunnableC1737i6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f5161a;

    /* renamed from: b */
    public final /* synthetic */ String f5162b;

    /* renamed from: c */
    public final /* synthetic */ String f5163c;

    /* renamed from: d */
    public final /* synthetic */ C1482E7 f5164d;

    /* renamed from: e */
    public final /* synthetic */ C1836t6 f5165e;

    public RunnableC1737i6(C1836t6 c1836t6, AtomicReference atomicReference, String str, String str2, String str3, C1482E7 c1482e7) {
        this.f5161a = atomicReference;
        this.f5162b = str2;
        this.f5163c = str3;
        this.f5164d = c1482e7;
        this.f5165e = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C1836t6 c1836t6;
        InterfaceC1832t2 interfaceC1832t2;
        AtomicReference atomicReference2 = this.f5161a;
        synchronized (atomicReference2) {
            try {
                try {
                    c1836t6 = this.f5165e;
                    interfaceC1832t2 = c1836t6.f5523d;
                } catch (RemoteException e7) {
                    this.f5165e.f5129a.mo5624b().m5936r().m5905d("(legacy) Failed to get conditional properties; remote exception", null, this.f5162b, e7);
                    this.f5161a.set(Collections.emptyList());
                    atomicReference = this.f5161a;
                }
                if (interfaceC1832t2 == null) {
                    c1836t6.f5129a.mo5624b().m5936r().m5905d("(legacy) Failed to get conditional properties; not connected to service", null, this.f5162b, this.f5163c);
                    atomicReference2.set(Collections.emptyList());
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    C1482E7 c1482e7 = this.f5164d;
                    AbstractC3802r.m15129k(c1482e7);
                    atomicReference2.set(interfaceC1832t2.mo6037V(this.f5162b, this.f5163c, c1482e7));
                } else {
                    atomicReference2.set(interfaceC1832t2.mo6054s(null, this.f5162b, this.f5163c));
                }
                c1836t6.m6405T();
                atomicReference = this.f5161a;
                atomicReference.notify();
            } catch (Throwable th) {
                this.f5161a.notify();
                throw th;
            }
        }
    }
}
