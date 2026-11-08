package p038F2;

import android.os.Process;

/* renamed from: F2.c */
/* loaded from: classes.dex */
public final class RunnableC0332c implements Runnable {

    /* renamed from: a */
    public final Runnable f1282a;

    public RunnableC0332c(Runnable runnable, int i7) {
        this.f1282a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f1282a.run();
    }
}
