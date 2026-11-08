package p187a4;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.AbstractC3966b;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: a4.p */
/* loaded from: classes.dex */
public class C3159p implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final Queue f9759a = new ArrayDeque(10);

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void m11559b(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String m15772h = AbstractC3966b.m15772h(extras);
                if (!TextUtils.isEmpty(m15772h)) {
                    if (this.f9759a.contains(m15772h)) {
                        return;
                    } else {
                        this.f9759a.add(m15772h);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e7) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e7);
        }
        if (AbstractC3966b.m15764F(bundle)) {
            AbstractC3966b.m15788x(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: a4.o
                @Override // java.lang.Runnable
                public final void run() {
                    C3159p.this.m11559b(intent);
                }
            });
        } else {
            m11559b(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
