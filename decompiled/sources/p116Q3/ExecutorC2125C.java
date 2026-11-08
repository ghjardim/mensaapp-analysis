package p116Q3;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* renamed from: Q3.C */
/* loaded from: classes.dex */
public class ExecutorC2125C implements Executor {

    /* renamed from: a */
    public final Executor f6442a;

    /* renamed from: b */
    public final Semaphore f6443b;

    public ExecutorC2125C(int i7, Executor executor) {
        this.f6443b = new Semaphore(i7);
        this.f6442a = executor;
    }

    /* renamed from: b */
    public final /* synthetic */ void m7180b(Runnable runnable) {
        runnable.run();
        this.f6443b.release();
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        if (!this.f6443b.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.f6442a.execute(new Runnable() { // from class: Q3.B
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorC2125C.this.m7180b(runnable);
                }
            });
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
