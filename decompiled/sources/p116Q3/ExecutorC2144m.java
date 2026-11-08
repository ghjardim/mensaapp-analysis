package p116Q3;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* renamed from: Q3.m */
/* loaded from: classes.dex */
public class ExecutorC2144m implements Executor {

    /* renamed from: a */
    public Semaphore f6490a = new Semaphore(0);

    /* renamed from: b */
    public int f6491b = 0;

    /* renamed from: b */
    public void m7269b() {
        try {
            this.f6490a.acquire(this.f6491b);
            this.f6491b = 0;
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            AbstractC2133b.m7214a("Interrupted while waiting for background task", e7);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void m7270c(Runnable runnable) {
        runnable.run();
        this.f6490a.release();
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        this.f6491b++;
        AbstractC2147p.f6509c.execute(new Runnable() { // from class: Q3.l
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC2144m.this.m7270c(runnable);
            }
        });
    }
}
