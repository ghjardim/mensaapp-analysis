package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import p368w2.C6861b;

/* renamed from: com.google.android.gms.common.internal.h */
/* loaded from: classes.dex */
public abstract class AbstractC3782h {

    /* renamed from: a */
    public static final Object f12508a = new Object();

    /* renamed from: b */
    public static int f12509b = 9;

    /* renamed from: c */
    public static C3807t0 f12510c = null;

    /* renamed from: d */
    public static HandlerThread f12511d = null;

    /* renamed from: e */
    public static Executor f12512e = null;

    /* renamed from: f */
    public static boolean f12513f = false;

    /* renamed from: b */
    public static AbstractC3782h m15078b(Context context) {
        synchronized (f12508a) {
            try {
                if (f12510c == null) {
                    f12510c = new C3807t0(context.getApplicationContext(), f12513f ? m15079c().getLooper() : context.getMainLooper(), f12512e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f12510c;
    }

    /* renamed from: c */
    public static HandlerThread m15079c() {
        synchronized (f12508a) {
            try {
                HandlerThread handlerThread = f12511d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f12509b);
                f12511d = handlerThread2;
                handlerThread2.start();
                return f12511d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public boolean m15080a(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return mo15082e(new C3799p0(componentName, 4225), serviceConnection, str, executor).m28241B0();
    }

    /* renamed from: d */
    public void m15081d(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        mo15083f(new C3799p0(componentName, 4225), serviceConnection, str);
    }

    /* renamed from: e */
    public abstract C6861b mo15082e(C3799p0 c3799p0, ServiceConnection serviceConnection, String str, Executor executor);

    /* renamed from: f */
    public abstract void mo15083f(C3799p0 c3799p0, ServiceConnection serviceConnection, String str);

    /* renamed from: g */
    public final void m15084g(String str, String str2, int i7, ServiceConnection serviceConnection, String str3, boolean z6) {
        mo15083f(new C3799p0(str, str2, 4225, z6), serviceConnection, str3);
    }
}
