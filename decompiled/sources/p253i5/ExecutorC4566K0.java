package p253i5;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2932o;

/* renamed from: i5.K0 */
/* loaded from: classes2.dex */
public final class ExecutorC4566K0 implements Executor, Runnable {

    /* renamed from: d */
    public static final Logger f16537d = Logger.getLogger(ExecutorC4566K0.class.getName());

    /* renamed from: e */
    public static final b f16538e = m19525c();

    /* renamed from: a */
    public Executor f16539a;

    /* renamed from: b */
    public final Queue f16540b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public volatile int f16541c = 0;

    /* renamed from: i5.K0$b */
    public static abstract class b {
        public b() {
        }

        /* renamed from: a */
        public abstract boolean mo19527a(ExecutorC4566K0 executorC4566K0, int i7, int i8);

        /* renamed from: b */
        public abstract void mo19528b(ExecutorC4566K0 executorC4566K0, int i7);
    }

    /* renamed from: i5.K0$c */
    public static final class c extends b {

        /* renamed from: a */
        public final AtomicIntegerFieldUpdater f16542a;

        @Override // p253i5.ExecutorC4566K0.b
        /* renamed from: a */
        public boolean mo19527a(ExecutorC4566K0 executorC4566K0, int i7, int i8) {
            return this.f16542a.compareAndSet(executorC4566K0, i7, i8);
        }

        @Override // p253i5.ExecutorC4566K0.b
        /* renamed from: b */
        public void mo19528b(ExecutorC4566K0 executorC4566K0, int i7) {
            this.f16542a.set(executorC4566K0, i7);
        }

        public c(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f16542a = atomicIntegerFieldUpdater;
        }
    }

    /* renamed from: i5.K0$d */
    public static final class d extends b {
        public d() {
            super();
        }

        @Override // p253i5.ExecutorC4566K0.b
        /* renamed from: a */
        public boolean mo19527a(ExecutorC4566K0 executorC4566K0, int i7, int i8) {
            synchronized (executorC4566K0) {
                try {
                    if (executorC4566K0.f16541c != i7) {
                        return false;
                    }
                    executorC4566K0.f16541c = i8;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p253i5.ExecutorC4566K0.b
        /* renamed from: b */
        public void mo19528b(ExecutorC4566K0 executorC4566K0, int i7) {
            synchronized (executorC4566K0) {
                executorC4566K0.f16541c = i7;
            }
        }
    }

    public ExecutorC4566K0(Executor executor) {
        AbstractC2932o.m10573p(executor, "'executor' must not be null.");
        this.f16539a = executor;
    }

    /* renamed from: c */
    public static b m19525c() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(ExecutorC4566K0.class, "c"));
        } catch (Throwable th) {
            f16537d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new d();
        }
    }

    /* renamed from: d */
    public final void m19526d(Runnable runnable) {
        if (f16538e.mo19527a(this, 0, -1)) {
            try {
                this.f16539a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f16540b.remove(runnable);
                }
                f16538e.mo19528b(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f16540b.add((Runnable) AbstractC2932o.m10573p(runnable, "'r' must not be null."));
        m19526d(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable;
        try {
            Executor executor = this.f16539a;
            while (executor == this.f16539a && (runnable = (Runnable) this.f16540b.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e7) {
                    f16537d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e7);
                }
            }
            f16538e.mo19528b(this, 0);
            if (this.f16540b.isEmpty()) {
                return;
            }
            m19526d(null);
        } catch (Throwable th) {
            f16538e.mo19528b(this, 0);
            throw th;
        }
    }
}
