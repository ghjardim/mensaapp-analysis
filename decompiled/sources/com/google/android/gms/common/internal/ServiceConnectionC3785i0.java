package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.common.internal.i0 */
/* loaded from: classes.dex */
public final class ServiceConnectionC3785i0 implements ServiceConnection {

    /* renamed from: a */
    public final int f12518a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC3772c f12519b;

    public ServiceConnectionC3785i0(AbstractC3772c abstractC3772c, int i7) {
        this.f12519b = abstractC3772c;
        this.f12518a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC3772c abstractC3772c = this.f12519b;
        if (iBinder == null) {
            AbstractC3772c.zzk(abstractC3772c, 16);
            return;
        }
        obj = abstractC3772c.zzq;
        synchronized (obj) {
            try {
                AbstractC3772c abstractC3772c2 = this.f12519b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC3772c2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC3792m)) ? new C3765X(iBinder) : (InterfaceC3792m) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12519b.zzl(0, null, this.f12518a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f12519b.zzq;
        synchronized (obj) {
            this.f12519b.zzr = null;
        }
        AbstractC3772c abstractC3772c = this.f12519b;
        int i7 = this.f12518a;
        Handler handler = abstractC3772c.zzb;
        handler.sendMessage(handler.obtainMessage(6, i7, 1));
    }
}
