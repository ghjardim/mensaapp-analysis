package p108P2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.d5 */
/* loaded from: classes.dex */
public final class RunnableC1691d5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f5105a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f5106b;

    public RunnableC1691d5(C1799p5 c1799p5, AtomicReference atomicReference) {
        this.f5105a = atomicReference;
        this.f5106b = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f5105a;
        synchronized (atomicReference) {
            try {
                try {
                    C1799p5 c1799p5 = this.f5106b;
                    atomicReference.set(Long.valueOf(c1799p5.f5129a.m5605B().m6125C(c1799p5.f5129a.m5607D().m5569t(), AbstractC1805q2.f5375c0)));
                } finally {
                    this.f5105a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
