package com.google.android.gms.internal.p393authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.internal.AbstractC3780g;
import com.google.android.gms.common.internal.C3774d;
import p294n2.C5777f;
import p294n2.C5778g;

/* loaded from: classes.dex */
public final class zbe extends AbstractC3780g {
    private final C5778g zba;

    public zbe(Context context, Looper looper, C3774d c3774d, C5778g c5778g, AbstractC3648f.a aVar, AbstractC3648f.b bVar) {
        super(context, looper, 68, c3774d, aVar, bVar);
        C5777f c5777f = new C5777f(c5778g == null ? C5778g.f21073d : c5778g);
        c5777f.m24423a(zbat.zba());
        this.zba = new C5778g(c5777f);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbf ? (zbf) queryLocalInterface : new zbf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba.m24427a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
