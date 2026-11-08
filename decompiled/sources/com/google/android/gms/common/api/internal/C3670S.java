package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.S */
/* loaded from: classes.dex */
public final class C3670S extends BroadcastReceiver {

    /* renamed from: a */
    public Context f12307a;

    /* renamed from: b */
    public final AbstractC3669Q f12308b;

    public C3670S(AbstractC3669Q abstractC3669Q) {
        this.f12308b = abstractC3669Q;
    }

    /* renamed from: a */
    public final void m14896a(Context context) {
        this.f12307a = context;
    }

    /* renamed from: b */
    public final synchronized void m14897b() {
        try {
            Context context = this.f12307a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f12307a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f12308b.mo14895a();
            m14897b();
        }
    }
}
