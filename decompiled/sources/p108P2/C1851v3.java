package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.v3 */
/* loaded from: classes.dex */
public final class C1851v3 extends AbstractC1717g4 {

    /* renamed from: l */
    public static final AtomicLong f5570l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    public C1842u3 f5571c;

    /* renamed from: d */
    public C1842u3 f5572d;

    /* renamed from: e */
    public final PriorityBlockingQueue f5573e;

    /* renamed from: f */
    public final BlockingQueue f5574f;

    /* renamed from: g */
    public final Thread.UncaughtExceptionHandler f5575g;

    /* renamed from: h */
    public final Thread.UncaughtExceptionHandler f5576h;

    /* renamed from: i */
    public final Object f5577i;

    /* renamed from: j */
    public final Semaphore f5578j;

    /* renamed from: k */
    public volatile boolean f5579k;

    public C1851v3(C1460C3 c1460c3) {
        super(c1460c3);
        this.f5577i = new Object();
        this.f5578j = new Semaphore(2);
        this.f5573e = new PriorityBlockingQueue();
        this.f5574f = new LinkedBlockingQueue();
        this.f5575g = new C1824s3(this, "Thread death: Uncaught exception on worker thread");
        this.f5576h = new C1824s3(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m6438C(C1851v3 c1851v3) {
        boolean z6 = c1851v3.f5579k;
        return false;
    }

    /* renamed from: A */
    public final void m6446A(Runnable runnable) {
        m6078k();
        AbstractC3802r.m15129k(runnable);
        m6450F(new C1833t3(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: B */
    public final void m6447B(Runnable runnable) {
        m6078k();
        AbstractC3802r.m15129k(runnable);
        m6450F(new C1833t3(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: D */
    public final boolean m6448D() {
        return Thread.currentThread() == this.f5572d;
    }

    /* renamed from: E */
    public final boolean m6449E() {
        return Thread.currentThread() == this.f5571c;
    }

    /* renamed from: F */
    public final void m6450F(C1833t3 c1833t3) {
        synchronized (this.f5577i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f5573e;
                priorityBlockingQueue.add(c1833t3);
                C1842u3 c1842u3 = this.f5571c;
                if (c1842u3 == null) {
                    C1842u3 c1842u32 = new C1842u3(this, "Measurement Worker", priorityBlockingQueue);
                    this.f5571c = c1842u32;
                    c1842u32.setUncaughtExceptionHandler(this.f5575g);
                    this.f5571c.start();
                } else {
                    c1842u3.m6422a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p108P2.AbstractC1708f4
    /* renamed from: g */
    public final void mo6070g() {
        if (Thread.currentThread() != this.f5572d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // p108P2.AbstractC1708f4
    /* renamed from: h */
    public final void mo5762h() {
        if (Thread.currentThread() != this.f5571c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // p108P2.AbstractC1717g4
    /* renamed from: j */
    public final boolean mo5654j() {
        return false;
    }

    /* renamed from: r */
    public final Object m6451r(AtomicReference atomicReference, long j7, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f5129a.mo5628f().m6446A(runnable);
            try {
                atomicReference.wait(j7);
            } catch (InterruptedException unused) {
                this.f5129a.mo5624b().m5941w().m5902a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f5129a.mo5624b().m5941w().m5902a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* renamed from: s */
    public final Future m6452s(Callable callable) {
        m6078k();
        AbstractC3802r.m15129k(callable);
        C1833t3 c1833t3 = new C1833t3(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f5571c) {
            if (!this.f5573e.isEmpty()) {
                this.f5129a.mo5624b().m5941w().m5902a("Callable skipped the worker queue.");
            }
            c1833t3.run();
        } else {
            m6450F(c1833t3);
        }
        return c1833t3;
    }

    /* renamed from: t */
    public final Future m6453t(Callable callable) {
        m6078k();
        AbstractC3802r.m15129k(callable);
        C1833t3 c1833t3 = new C1833t3(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f5571c) {
            c1833t3.run();
        } else {
            m6450F(c1833t3);
        }
        return c1833t3;
    }

    /* renamed from: y */
    public final void m6454y() {
        if (Thread.currentThread() == this.f5571c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    /* renamed from: z */
    public final void m6455z(Runnable runnable) {
        m6078k();
        AbstractC3802r.m15129k(runnable);
        C1833t3 c1833t3 = new C1833t3(this, runnable, false, "Task exception on network thread");
        synchronized (this.f5577i) {
            try {
                BlockingQueue blockingQueue = this.f5574f;
                blockingQueue.add(c1833t3);
                C1842u3 c1842u3 = this.f5572d;
                if (c1842u3 == null) {
                    C1842u3 c1842u32 = new C1842u3(this, "Measurement Network", blockingQueue);
                    this.f5572d = c1842u32;
                    c1842u32.setUncaughtExceptionHandler(this.f5576h);
                    this.f5572d.start();
                } else {
                    c1842u3.m6422a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
