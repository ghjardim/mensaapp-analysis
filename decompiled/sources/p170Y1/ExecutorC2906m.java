package p170Y1;

import java.util.concurrent.Executor;
import p202c2.AbstractC3570a;

/* renamed from: Y1.m */
/* loaded from: classes.dex */
public class ExecutorC2906m implements Executor {

    /* renamed from: a */
    public final Executor f8974a;

    /* renamed from: Y1.m$a */
    public static class a implements Runnable {

        /* renamed from: a */
        public final Runnable f8975a;

        public a(Runnable runnable) {
            this.f8975a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f8975a.run();
            } catch (Exception e7) {
                AbstractC3570a.m14402d("Executor", "Background execution failure.", e7);
            }
        }
    }

    public ExecutorC2906m(Executor executor) {
        this.f8974a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f8974a.execute(new a(runnable));
    }
}
