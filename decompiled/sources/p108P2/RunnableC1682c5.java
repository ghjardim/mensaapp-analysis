package p108P2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.c5 */
/* loaded from: classes.dex */
public final class RunnableC1682c5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f5089a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f5090b;

    public RunnableC1682c5(C1799p5 c1799p5, AtomicReference atomicReference) {
        this.f5089a = atomicReference;
        this.f5090b = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f5089a;
        synchronized (atomicReference) {
            try {
                try {
                    C1799p5 c1799p5 = this.f5090b;
                    atomicReference.set(c1799p5.f5129a.m5605B().m6132J(c1799p5.f5129a.m5607D().m5569t(), AbstractC1805q2.f5372b0));
                } finally {
                    this.f5089a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
