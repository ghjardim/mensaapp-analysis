package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import p024D2.C0185b;
import p031E2.AbstractC0287w;
import p368w2.C6861b;

/* renamed from: com.google.android.gms.common.internal.q0 */
/* loaded from: classes.dex */
public final class ServiceConnectionC3801q0 implements ServiceConnection, InterfaceC3809u0 {

    /* renamed from: a */
    public final Map f12548a = new HashMap();

    /* renamed from: b */
    public int f12549b = 2;

    /* renamed from: c */
    public boolean f12550c;

    /* renamed from: d */
    public IBinder f12551d;

    /* renamed from: e */
    public final C3799p0 f12552e;

    /* renamed from: f */
    public ComponentName f12553f;

    /* renamed from: g */
    public final /* synthetic */ C3807t0 f12554g;

    public ServiceConnectionC3801q0(C3807t0 c3807t0, C3799p0 c3799p0) {
        this.f12554g = c3807t0;
        this.f12552e = c3799p0;
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ C6861b m15109d(ServiceConnectionC3801q0 serviceConnectionC3801q0, String str, Executor executor) {
        Context context;
        C0185b c0185b;
        Context context2;
        C6861b c6861b;
        C0185b c0185b2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j7;
        try {
            C3799p0 c3799p0 = serviceConnectionC3801q0.f12552e;
            context = serviceConnectionC3801q0.f12554g.f12565h;
            Intent m15104b = c3799p0.m15104b(context);
            serviceConnectionC3801q0.f12549b = 3;
            StrictMode.VmPolicy m1154a = AbstractC0287w.m1154a();
            try {
                C3807t0 c3807t0 = serviceConnectionC3801q0.f12554g;
                c0185b = c3807t0.f12568k;
                context2 = c3807t0.f12565h;
                boolean m749d = c0185b.m749d(context2, str, m15104b, serviceConnectionC3801q0, 4225, executor);
                serviceConnectionC3801q0.f12550c = m749d;
                if (m749d) {
                    handler = serviceConnectionC3801q0.f12554g.f12566i;
                    Message obtainMessage = handler.obtainMessage(1, serviceConnectionC3801q0.f12552e);
                    handler2 = serviceConnectionC3801q0.f12554g.f12566i;
                    j7 = serviceConnectionC3801q0.f12554g.f12570m;
                    handler2.sendMessageDelayed(obtainMessage, j7);
                    c6861b = C6861b.f24674e;
                } else {
                    serviceConnectionC3801q0.f12549b = 2;
                    try {
                        C3807t0 c3807t02 = serviceConnectionC3801q0.f12554g;
                        c0185b2 = c3807t02.f12568k;
                        context3 = c3807t02.f12565h;
                        c0185b2.m748c(context3, serviceConnectionC3801q0);
                    } catch (IllegalArgumentException unused) {
                    }
                    c6861b = new C6861b(16);
                }
                return c6861b;
            } finally {
                StrictMode.setVmPolicy(m1154a);
            }
        } catch (C3775d0 e7) {
            return e7.f12481a;
        }
    }

    /* renamed from: a */
    public final int m15110a() {
        return this.f12549b;
    }

    /* renamed from: b */
    public final ComponentName m15111b() {
        return this.f12553f;
    }

    /* renamed from: c */
    public final IBinder m15112c() {
        return this.f12551d;
    }

    /* renamed from: e */
    public final void m15113e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f12548a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: f */
    public final void m15114f(ServiceConnection serviceConnection, String str) {
        this.f12548a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m15115g(String str) {
        Handler handler;
        C0185b c0185b;
        Context context;
        C3799p0 c3799p0 = this.f12552e;
        handler = this.f12554g.f12566i;
        handler.removeMessages(1, c3799p0);
        C3807t0 c3807t0 = this.f12554g;
        c0185b = c3807t0.f12568k;
        context = c3807t0.f12565h;
        c0185b.m748c(context, this);
        this.f12550c = false;
        this.f12549b = 2;
    }

    /* renamed from: h */
    public final boolean m15116h(ServiceConnection serviceConnection) {
        return this.f12548a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m15117i() {
        return this.f12548a.isEmpty();
    }

    /* renamed from: j */
    public final boolean m15118j() {
        return this.f12550c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f12554g.f12564g;
        synchronized (hashMap) {
            try {
                handler = this.f12554g.f12566i;
                handler.removeMessages(1, this.f12552e);
                this.f12551d = iBinder;
                this.f12553f = componentName;
                Iterator it = this.f12548a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f12549b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f12554g.f12564g;
        synchronized (hashMap) {
            try {
                handler = this.f12554g.f12566i;
                handler.removeMessages(1, this.f12552e);
                this.f12551d = null;
                this.f12553f = componentName;
                Iterator it = this.f12548a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f12549b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
