package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC3686e;
import com.google.android.gms.common.api.internal.InterfaceC3704n;
import com.google.android.gms.common.internal.AbstractC3780g;
import com.google.android.gms.common.internal.C3774d;
import p278l2.AbstractC5524k;
import p368w2.C6863d;

/* loaded from: classes.dex */
final class zzi extends AbstractC3780g {
    public zzi(Context context, Looper looper, C3774d c3774d, InterfaceC3686e interfaceC3686e, InterfaceC3704n interfaceC3704n) {
        super(context, looper, 224, c3774d, interfaceC3686e, interfaceC3704n);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new zzp(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c, com.google.android.gms.common.api.C3643a.f
    public final void disconnect(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.disconnect(str);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final C6863d[] getApiFeatures() {
        return new C6863d[]{AbstractC5524k.f19913l, AbstractC5524k.f19912k, AbstractC5524k.f19902a};
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
