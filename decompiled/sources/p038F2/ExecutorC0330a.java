package p038F2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.util.concurrent.Executor;

/* renamed from: F2.a */
/* loaded from: classes.dex */
public class ExecutorC0330a implements Executor {

    /* renamed from: a */
    public final Handler f1279a;

    public ExecutorC0330a(Looper looper) {
        this.f1279a = new zzh(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1279a.post(runnable);
    }
}
