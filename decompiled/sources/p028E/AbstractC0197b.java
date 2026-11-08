package p028E;

import android.os.Handler;
import android.os.Looper;

/* renamed from: E.b */
/* loaded from: classes.dex */
public abstract class AbstractC0197b {
    /* renamed from: a */
    public static Handler m799a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
