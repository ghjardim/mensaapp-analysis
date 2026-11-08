package p187a4;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: a4.a0 */
/* loaded from: classes.dex */
public final class C3134a0 {

    /* renamed from: d */
    public static WeakReference f9684d;

    /* renamed from: a */
    public final SharedPreferences f9685a;

    /* renamed from: b */
    public C3130X f9686b;

    /* renamed from: c */
    public final Executor f9687c;

    public C3134a0(SharedPreferences sharedPreferences, Executor executor) {
        this.f9687c = executor;
        this.f9685a = sharedPreferences;
    }

    /* renamed from: b */
    public static synchronized C3134a0 m11439b(Context context, Executor executor) {
        C3134a0 c3134a0;
        synchronized (C3134a0.class) {
            try {
                WeakReference weakReference = f9684d;
                c3134a0 = weakReference != null ? (C3134a0) weakReference.get() : null;
                if (c3134a0 == null) {
                    c3134a0 = new C3134a0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    c3134a0.m11442d();
                    f9684d = new WeakReference(c3134a0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3134a0;
    }

    /* renamed from: a */
    public synchronized boolean m11440a(C3132Z c3132z) {
        return this.f9686b.m11415b(c3132z.m11435e());
    }

    /* renamed from: c */
    public synchronized C3132Z m11441c() {
        return C3132Z.m11429a(this.f9686b.m11418f());
    }

    /* renamed from: d */
    public final synchronized void m11442d() {
        this.f9686b = C3130X.m11414d(this.f9685a, "topic_operation_queue", ",", this.f9687c);
    }

    /* renamed from: e */
    public synchronized boolean m11443e(C3132Z c3132z) {
        return this.f9686b.m11419g(c3132z.m11435e());
    }
}
