package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: androidx.lifecycle.k */
/* loaded from: classes.dex */
public final class C3346k {

    /* renamed from: a */
    public static final C3346k f10748a = new C3346k();

    /* renamed from: b */
    public static final AtomicBoolean f10749b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.k$a */
    public static final class a extends AbstractC3341f {
        @Override // androidx.lifecycle.AbstractC3341f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC5469l.m23028e(activity, "activity");
            FragmentC3361z.f10800b.m13001c(activity);
        }
    }

    /* renamed from: a */
    public static final void m12936a(Context context) {
        AbstractC5469l.m23028e(context, "context");
        if (f10749b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        AbstractC5469l.m23026c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
