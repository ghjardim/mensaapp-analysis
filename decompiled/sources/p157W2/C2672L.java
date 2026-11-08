package p157W2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: W2.L */
/* loaded from: classes.dex */
public final class C2672L extends AbstractRunnableC2668H {

    /* renamed from: n */
    public final /* synthetic */ C2680f f7911n;

    public C2672L(C2680f c2680f) {
        this.f7911n = c2680f;
    }

    @Override // p157W2.AbstractRunnableC2668H
    /* renamed from: b */
    public final void mo9147b() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        C2667G c2667g;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        C2667G c2667g2;
        obj = this.f7911n.f7924f;
        synchronized (obj) {
            try {
                atomicInteger = this.f7911n.f7930l;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = this.f7911n.f7930l;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        c2667g2 = this.f7911n.f7920b;
                        c2667g2.m9144d("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                C2680f c2680f = this.f7911n;
                iInterface = c2680f.f7932n;
                if (iInterface != null) {
                    c2667g = c2680f.f7920b;
                    c2667g.m9144d("Unbind from service.", new Object[0]);
                    C2680f c2680f2 = this.f7911n;
                    context = c2680f2.f7919a;
                    serviceConnection = c2680f2.f7931m;
                    context.unbindService(serviceConnection);
                    this.f7911n.f7925g = false;
                    this.f7911n.f7932n = null;
                    this.f7911n.f7931m = null;
                }
                this.f7911n.m9175x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
