package p157W2;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: W2.H */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2668H implements Runnable {

    /* renamed from: a */
    private final TaskCompletionSource f7904a;

    public AbstractRunnableC2668H() {
        this.f7904a = null;
    }

    /* renamed from: a */
    public void mo9146a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f7904a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    /* renamed from: b */
    public abstract void mo9147b();

    /* renamed from: c */
    public final TaskCompletionSource m9148c() {
        return this.f7904a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo9147b();
        } catch (Exception e7) {
            mo9146a(e7);
        }
    }

    public AbstractRunnableC2668H(TaskCompletionSource taskCompletionSource) {
        this.f7904a = taskCompletionSource;
    }
}
