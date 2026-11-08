package p139T5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.AbstractC5469l;
import p371w5.AbstractC6928k;
import p371w5.C6927j;

/* renamed from: T5.f */
/* loaded from: classes2.dex */
public abstract class AbstractC2488f {

    /* renamed from: a */
    public static final AbstractC2487e f7320a;
    private static volatile Choreographer choreographer;

    static {
        Object m28373b;
        try {
            C6927j.a aVar = C6927j.f24803b;
            m28373b = C6927j.m28373b(new C2486d(m8418a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            C6927j.a aVar2 = C6927j.f24803b;
            m28373b = C6927j.m28373b(AbstractC6928k.m28381a(th));
        }
        f7320a = (AbstractC2487e) (C6927j.m28377f(m28373b) ? null : m28373b);
    }

    /* renamed from: a */
    public static final Handler m8418a(Looper looper, boolean z6) {
        if (!z6) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        AbstractC5469l.m23026c(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
