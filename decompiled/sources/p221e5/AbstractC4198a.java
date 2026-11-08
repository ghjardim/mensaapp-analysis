package p221e5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: e5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4198a {
    /* renamed from: a */
    public static Handler m17609a(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT < 28) {
            return new Handler(looper);
        }
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
