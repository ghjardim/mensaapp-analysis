package p311p0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: p0.Z */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC6065Z implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f21658a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f21658a.post(runnable);
    }
}
