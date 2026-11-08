package p132S5;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC5469l;
import p104O5.AbstractC1421h;
import p132S5.AbstractC2379f0;
import p392z5.InterfaceC7161i;

/* renamed from: S5.O */
/* loaded from: classes2.dex */
public final class RunnableC2344O extends AbstractC2379f0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: p */
    public static final RunnableC2344O f7079p;

    /* renamed from: q */
    public static final long f7080q;

    static {
        Long l7;
        RunnableC2344O runnableC2344O = new RunnableC2344O();
        f7079p = runnableC2344O;
        AbstractC2377e0.m8073c0(runnableC2344O, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f7080q = timeUnit.toNanos(l7.longValue());
    }

    @Override // p132S5.AbstractC2379f0
    /* renamed from: D0 */
    public void mo8007D0(Runnable runnable) {
        if (m8010S0()) {
            m8013V0();
        }
        super.mo8007D0(runnable);
    }

    /* renamed from: Q0 */
    public final synchronized void m8008Q0() {
        if (m8011T0()) {
            debugStatus = 3;
            m8096K0();
            AbstractC5469l.m23026c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: R0 */
    public final synchronized Thread m8009R0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(RunnableC2344O.class.getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: S0 */
    public final boolean m8010S0() {
        return debugStatus == 4;
    }

    /* renamed from: T0 */
    public final boolean m8011T0() {
        int i7 = debugStatus;
        return i7 == 2 || i7 == 3;
    }

    /* renamed from: U0 */
    public final synchronized boolean m8012U0() {
        if (m8011T0()) {
            return false;
        }
        debugStatus = 1;
        AbstractC5469l.m23026c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* renamed from: V0 */
    public final void m8013V0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m8094I0;
        C2352S0.f7083a.m8027d(this);
        AbstractC2372c.m8061a();
        try {
            if (!m8012U0()) {
                if (m8094I0) {
                    return;
                } else {
                    return;
                }
            }
            long j7 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long mo8081k0 = mo8081k0();
                if (mo8081k0 == Long.MAX_VALUE) {
                    AbstractC2372c.m8061a();
                    long nanoTime = System.nanoTime();
                    if (j7 == Long.MAX_VALUE) {
                        j7 = f7080q + nanoTime;
                    }
                    long j8 = j7 - nanoTime;
                    if (j8 <= 0) {
                        _thread = null;
                        m8008Q0();
                        AbstractC2372c.m8061a();
                        if (m8094I0()) {
                            return;
                        }
                        mo8014x0();
                        return;
                    }
                    mo8081k0 = AbstractC1421h.m5531d(mo8081k0, j8);
                } else {
                    j7 = Long.MAX_VALUE;
                }
                if (mo8081k0 > 0) {
                    if (m8011T0()) {
                        _thread = null;
                        m8008Q0();
                        AbstractC2372c.m8061a();
                        if (m8094I0()) {
                            return;
                        }
                        mo8014x0();
                        return;
                    }
                    AbstractC2372c.m8061a();
                    LockSupport.parkNanos(this, mo8081k0);
                }
            }
        } finally {
            _thread = null;
            m8008Q0();
            AbstractC2372c.m8061a();
            if (!m8094I0()) {
                mo8014x0();
            }
        }
    }

    @Override // p132S5.AbstractC2379f0, p132S5.AbstractC2377e0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p132S5.AbstractC2381g0
    /* renamed from: x0 */
    public Thread mo8014x0() {
        Thread thread = _thread;
        return thread == null ? m8009R0() : thread;
    }

    @Override // p132S5.AbstractC2379f0, p132S5.InterfaceC2353T
    /* renamed from: y */
    public InterfaceC2368a0 mo8015y(long j7, Runnable runnable, InterfaceC7161i interfaceC7161i) {
        return m8099N0(j7, runnable);
    }

    @Override // p132S5.AbstractC2381g0
    /* renamed from: y0 */
    public void mo8016y0(long j7, AbstractC2379f0.c cVar) {
        m8013V0();
    }
}
