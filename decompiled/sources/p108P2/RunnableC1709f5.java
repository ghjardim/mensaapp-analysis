package p108P2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.f5 */
/* loaded from: classes.dex */
public final class RunnableC1709f5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f5130a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f5131b;

    public RunnableC1709f5(C1799p5 c1799p5, AtomicReference atomicReference) {
        this.f5130a = atomicReference;
        this.f5131b = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f5130a;
        synchronized (atomicReference) {
            try {
                try {
                    C1799p5 c1799p5 = this.f5131b;
                    atomicReference.set(Double.valueOf(c1799p5.f5129a.m5605B().m6147t(c1799p5.f5129a.m5607D().m5569t(), AbstractC1805q2.f5381e0)));
                } finally {
                    this.f5130a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
