package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.h0 */
/* loaded from: classes.dex */
public final class BinderC3783h0 extends AbstractBinderC3764W {

    /* renamed from: a */
    public AbstractC3772c f12514a;

    /* renamed from: b */
    public final int f12515b;

    public BinderC3783h0(AbstractC3772c abstractC3772c, int i7) {
        this.f12514a = abstractC3772c;
        this.f12515b = i7;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3790l
    /* renamed from: B */
    public final void mo15085B(int i7, IBinder iBinder, Bundle bundle) {
        AbstractC3802r.m15130l(this.f12514a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f12514a.onPostInitHandler(i7, iBinder, bundle, this.f12515b);
        this.f12514a = null;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3790l
    /* renamed from: P */
    public final void mo15086P(int i7, IBinder iBinder, C3791l0 c3791l0) {
        AbstractC3772c abstractC3772c = this.f12514a;
        AbstractC3802r.m15130l(abstractC3772c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC3802r.m15129k(c3791l0);
        AbstractC3772c.zzj(abstractC3772c, c3791l0);
        mo15085B(i7, iBinder, c3791l0.f12523a);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3790l
    /* renamed from: r */
    public final void mo15087r(int i7, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
