package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p031E2.AbstractC0280p;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C3682c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e */
    public static final ComponentCallbacks2C3682c f12329e = new ComponentCallbacks2C3682c();

    /* renamed from: a */
    public final AtomicBoolean f12330a = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicBoolean f12331b = new AtomicBoolean();

    /* renamed from: c */
    public final ArrayList f12332c = new ArrayList();

    /* renamed from: d */
    public boolean f12333d = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface a {
        /* renamed from: a */
        void mo14842a(boolean z6);
    }

    /* renamed from: b */
    public static ComponentCallbacks2C3682c m14905b() {
        return f12329e;
    }

    /* renamed from: c */
    public static void m14906c(Application application) {
        ComponentCallbacks2C3682c componentCallbacks2C3682c = f12329e;
        synchronized (componentCallbacks2C3682c) {
            try {
                if (!componentCallbacks2C3682c.f12333d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C3682c);
                    application.registerComponentCallbacks(componentCallbacks2C3682c);
                    componentCallbacks2C3682c.f12333d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m14907a(a aVar) {
        synchronized (f12329e) {
            this.f12332c.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean m14908d() {
        return this.f12330a.get();
    }

    /* renamed from: e */
    public boolean m14909e(boolean z6) {
        if (!this.f12331b.get()) {
            if (AbstractC0280p.m1143b()) {
                return z6;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f12331b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f12330a.set(true);
            }
        }
        return m14908d();
    }

    /* renamed from: f */
    public final void m14910f(boolean z6) {
        synchronized (f12329e) {
            try {
                Iterator it = this.f12332c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo14842a(z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f12331b;
        boolean compareAndSet = this.f12330a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            m14910f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f12331b;
        boolean compareAndSet = this.f12330a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            m14910f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20 && this.f12330a.compareAndSet(false, true)) {
            this.f12331b.set(true);
            m14910f(true);
        }
    }
}
