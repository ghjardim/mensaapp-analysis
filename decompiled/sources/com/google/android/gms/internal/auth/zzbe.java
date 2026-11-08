package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.InterfaceC3686e;
import com.google.android.gms.common.api.internal.InterfaceC3704n;
import com.google.android.gms.common.internal.AbstractC3780g;
import com.google.android.gms.common.internal.C3774d;
import p294n2.AbstractC5773b;
import p294n2.C5774c;
import p368w2.AbstractC6874o;

/* loaded from: classes.dex */
public final class zzbe extends AbstractC3780g {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, C3774d c3774d, C5774c c5774c, InterfaceC3686e interfaceC3686e, InterfaceC3704n interfaceC3704n) {
        super(context, looper, 16, c3774d, interfaceC3686e, interfaceC3704n);
        this.zze = c5774c == null ? new Bundle() : c5774c.m24422a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final int getMinApkVersion() {
        return AbstractC6874o.f24694a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c, com.google.android.gms.common.api.C3643a.f
    public final boolean requiresSignIn() {
        C3774d clientSettings = getClientSettings();
        return (TextUtils.isEmpty(clientSettings.m15050b()) || clientSettings.m15053e(AbstractC5773b.f21065a).isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
