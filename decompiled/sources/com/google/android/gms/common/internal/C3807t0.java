package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p024D2.C0185b;
import p368w2.C6861b;

/* renamed from: com.google.android.gms.common.internal.t0 */
/* loaded from: classes.dex */
public final class C3807t0 extends AbstractC3782h {

    /* renamed from: g */
    public final HashMap f12564g = new HashMap();

    /* renamed from: h */
    public final Context f12565h;

    /* renamed from: i */
    public volatile Handler f12566i;

    /* renamed from: j */
    public final C3803r0 f12567j;

    /* renamed from: k */
    public final C0185b f12568k;

    /* renamed from: l */
    public final long f12569l;

    /* renamed from: m */
    public final long f12570m;

    /* renamed from: n */
    public volatile Executor f12571n;

    public C3807t0(Context context, Looper looper, Executor executor) {
        C3803r0 c3803r0 = new C3803r0(this, null);
        this.f12567j = c3803r0;
        this.f12565h = context.getApplicationContext();
        this.f12566i = new zzh(looper, c3803r0);
        this.f12568k = C0185b.m743b();
        this.f12569l = 5000L;
        this.f12570m = 300000L;
        this.f12571n = executor;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3782h
    /* renamed from: e */
    public final C6861b mo15082e(C3799p0 c3799p0, ServiceConnection serviceConnection, String str, Executor executor) {
        C6861b c6861b;
        AbstractC3802r.m15130l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f12564g) {
            try {
                ServiceConnectionC3801q0 serviceConnectionC3801q0 = (ServiceConnectionC3801q0) this.f12564g.get(c3799p0);
                if (executor == null) {
                    executor = this.f12571n;
                }
                if (serviceConnectionC3801q0 == null) {
                    serviceConnectionC3801q0 = new ServiceConnectionC3801q0(this, c3799p0);
                    serviceConnectionC3801q0.m15113e(serviceConnection, serviceConnection, str);
                    c6861b = ServiceConnectionC3801q0.m15109d(serviceConnectionC3801q0, str, executor);
                    this.f12564g.put(c3799p0, serviceConnectionC3801q0);
                } else {
                    this.f12566i.removeMessages(0, c3799p0);
                    if (serviceConnectionC3801q0.m15116h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + c3799p0.toString());
                    }
                    serviceConnectionC3801q0.m15113e(serviceConnection, serviceConnection, str);
                    int m15110a = serviceConnectionC3801q0.m15110a();
                    if (m15110a == 1) {
                        serviceConnection.onServiceConnected(serviceConnectionC3801q0.m15111b(), serviceConnectionC3801q0.m15112c());
                    } else if (m15110a == 2) {
                        c6861b = ServiceConnectionC3801q0.m15109d(serviceConnectionC3801q0, str, executor);
                    }
                    c6861b = null;
                }
                if (serviceConnectionC3801q0.m15118j()) {
                    return C6861b.f24674e;
                }
                if (c6861b == null) {
                    c6861b = new C6861b(-1);
                }
                return c6861b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3782h
    /* renamed from: f */
    public final void mo15083f(C3799p0 c3799p0, ServiceConnection serviceConnection, String str) {
        AbstractC3802r.m15130l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f12564g) {
            try {
                ServiceConnectionC3801q0 serviceConnectionC3801q0 = (ServiceConnectionC3801q0) this.f12564g.get(c3799p0);
                if (serviceConnectionC3801q0 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + c3799p0.toString());
                }
                if (!serviceConnectionC3801q0.m15116h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + c3799p0.toString());
                }
                serviceConnectionC3801q0.m15114f(serviceConnection, str);
                if (serviceConnectionC3801q0.m15117i()) {
                    this.f12566i.sendMessageDelayed(this.f12566i.obtainMessage(0, c3799p0), this.f12569l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
