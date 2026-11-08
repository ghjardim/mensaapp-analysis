package p369w3;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import p362v3.AbstractC6750E;

/* renamed from: w3.B */
/* loaded from: classes.dex */
public class ExecutorC6887B implements Executor {

    /* renamed from: a */
    public final Executor f24714a;

    /* renamed from: b */
    public final Semaphore f24715b;

    /* renamed from: c */
    public final LinkedBlockingQueue f24716c = new LinkedBlockingQueue();

    public ExecutorC6887B(Executor executor, int i7) {
        AbstractC6750E.m27701a(i7 > 0, "concurrency must be positive.");
        this.f24714a = executor;
        this.f24715b = new Semaphore(i7, true);
    }

    /* renamed from: b */
    public final Runnable m28301b(final Runnable runnable) {
        return new Runnable() { // from class: w3.A
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC6887B.this.m28302c(runnable);
            }
        };
    }

    /* renamed from: c */
    public final /* synthetic */ void m28302c(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f24715b.release();
            m28303d();
        }
    }

    /* renamed from: d */
    public final void m28303d() {
        while (this.f24715b.tryAcquire()) {
            Runnable runnable = (Runnable) this.f24716c.poll();
            if (runnable == null) {
                this.f24715b.release();
                return;
            }
            this.f24714a.execute(m28301b(runnable));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f24716c.offer(runnable);
        m28303d();
    }
}
