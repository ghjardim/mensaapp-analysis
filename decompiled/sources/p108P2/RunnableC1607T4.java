package p108P2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.T4 */
/* loaded from: classes.dex */
public final class RunnableC1607T4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f4940a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f4941b;

    public RunnableC1607T4(C1799p5 c1799p5, AtomicReference atomicReference) {
        this.f4940a = atomicReference;
        this.f4941b = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f4940a;
        synchronized (atomicReference) {
            try {
                try {
                    C1799p5 c1799p5 = this.f4941b;
                    atomicReference.set(Boolean.valueOf(c1799p5.f5129a.m5605B().m6138P(c1799p5.f5129a.m5607D().m5569t(), AbstractC1805q2.f5369a0)));
                } finally {
                    this.f4940a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
