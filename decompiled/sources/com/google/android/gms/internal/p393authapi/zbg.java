package com.google.android.gms.internal.p393authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC3686e;
import com.google.android.gms.common.api.internal.InterfaceC3704n;
import com.google.android.gms.common.internal.AbstractC3780g;
import com.google.android.gms.common.internal.C3774d;
import p313p2.C6120o;
import p368w2.C6863d;

/* loaded from: classes.dex */
public final class zbg extends AbstractC3780g {
    private final Bundle zba;

    public zbg(Context context, Looper looper, C6120o c6120o, C3774d c3774d, InterfaceC3686e interfaceC3686e, InterfaceC3704n interfaceC3704n) {
        super(context, looper, 219, c3774d, interfaceC3686e, interfaceC3704n);
        this.zba = c6120o.m25527a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        return queryLocalInterface instanceof zbk ? (zbk) queryLocalInterface : new zbk(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final C6863d[] getApiFeatures() {
        return zbas.zbi;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
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
