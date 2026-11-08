package p369w3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: w3.D */
/* loaded from: classes.dex */
public enum EnumC6889D implements Executor {
    INSTANCE;


    /* renamed from: b */
    public static final Handler f24733b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f24733b.post(runnable);
    }
}
