package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.internal.AbstractC3780g;
import com.google.android.gms.common.internal.C3774d;

/* loaded from: classes.dex */
public final class zzy extends AbstractC3780g {
    public zzy(Context context, Looper looper, C3774d c3774d, AbstractC3648f.a aVar, AbstractC3648f.b bVar) {
        super(context, looper, 117, c3774d, aVar, bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
        return queryLocalInterface instanceof zzw ? (zzw) queryLocalInterface : new zzw(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.thirdparty.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.u2f.thirdparty.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
