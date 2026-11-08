package p132S5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p167X5.AbstractC2858c;
import p392z5.InterfaceC7161i;

/* renamed from: S5.l0 */
/* loaded from: classes2.dex */
public final class C2391l0 extends AbstractC2389k0 implements InterfaceC2353T {

    /* renamed from: d */
    public final Executor f7139d;

    public C2391l0(Executor executor) {
        this.f7139d = executor;
        AbstractC2858c.m10305a(m8132M());
    }

    @Override // p132S5.AbstractC2328G
    /* renamed from: D */
    public void mo7983D(InterfaceC7161i interfaceC7161i, Runnable runnable) {
        try {
            Executor m8132M = m8132M();
            AbstractC2372c.m8061a();
            m8132M.execute(runnable);
        } catch (RejectedExecutionException e7) {
            AbstractC2372c.m8061a();
            m8131K(interfaceC7161i, e7);
            C2363Y.m8054b().mo7983D(interfaceC7161i, runnable);
        }
    }

    /* renamed from: K */
    public final void m8131K(InterfaceC7161i interfaceC7161i, RejectedExecutionException rejectedExecutionException) {
        AbstractC2417y0.m8194c(interfaceC7161i, AbstractC2387j0.m8124a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: M */
    public Executor m8132M() {
        return this.f7139d;
    }

    /* renamed from: N */
    public final ScheduledFuture m8133N(ScheduledExecutorService scheduledExecutorService, Runnable runnable, InterfaceC7161i interfaceC7161i, long j7) {
        try {
            return scheduledExecutorService.schedule(runnable, j7, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e7) {
            m8131K(interfaceC7161i, e7);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor m8132M = m8132M();
        ExecutorService executorService = m8132M instanceof ExecutorService ? (ExecutorService) m8132M : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // p132S5.InterfaceC2353T
    /* renamed from: d */
    public void mo8028d(long j7, InterfaceC2394n interfaceC2394n) {
        Executor m8132M = m8132M();
        ScheduledExecutorService scheduledExecutorService = m8132M instanceof ScheduledExecutorService ? (ScheduledExecutorService) m8132M : null;
        ScheduledFuture m8133N = scheduledExecutorService != null ? m8133N(scheduledExecutorService, new RunnableC2343N0(this, interfaceC2394n), interfaceC2394n.getContext(), j7) : null;
        if (m8133N != null) {
            AbstractC2417y0.m8197f(interfaceC2394n, m8133N);
        } else {
            RunnableC2344O.f7079p.mo8028d(j7, interfaceC2394n);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2391l0) && ((C2391l0) obj).m8132M() == m8132M();
    }

    public int hashCode() {
        return System.identityHashCode(m8132M());
    }

    @Override // p132S5.AbstractC2328G
    public String toString() {
        return m8132M().toString();
    }

    @Override // p132S5.InterfaceC2353T
    /* renamed from: y */
    public InterfaceC2368a0 mo8015y(long j7, Runnable runnable, InterfaceC7161i interfaceC7161i) {
        Executor m8132M = m8132M();
        ScheduledExecutorService scheduledExecutorService = m8132M instanceof ScheduledExecutorService ? (ScheduledExecutorService) m8132M : null;
        ScheduledFuture m8133N = scheduledExecutorService != null ? m8133N(scheduledExecutorService, runnable, interfaceC7161i, j7) : null;
        return m8133N != null ? new C2365Z(m8133N) : RunnableC2344O.f7079p.mo8015y(j7, runnable, interfaceC7161i);
    }
}
