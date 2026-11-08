package p108P2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.e5 */
/* loaded from: classes.dex */
public final class RunnableC1700e5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f5114a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f5115b;

    public RunnableC1700e5(C1799p5 c1799p5, AtomicReference atomicReference) {
        this.f5114a = atomicReference;
        this.f5115b = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f5114a;
        synchronized (atomicReference) {
            try {
                try {
                    C1799p5 c1799p5 = this.f5115b;
                    atomicReference.set(Integer.valueOf(c1799p5.f5129a.m5605B().m6153z(c1799p5.f5129a.m5607D().m5569t(), AbstractC1805q2.f5378d0)));
                } finally {
                    this.f5114a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
