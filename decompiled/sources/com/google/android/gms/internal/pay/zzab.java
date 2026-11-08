package com.google.android.gms.internal.pay;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC3686e;
import com.google.android.gms.common.api.internal.InterfaceC3704n;
import com.google.android.gms.common.internal.AbstractC3780g;
import com.google.android.gms.common.internal.C3774d;
import p115Q2.AbstractC2055W0;
import p368w2.C6863d;

/* loaded from: classes.dex */
public final class zzab extends AbstractC3780g {
    public zzab(Context context, Looper looper, C3774d c3774d, InterfaceC3686e interfaceC3686e, InterfaceC3704n interfaceC3704n) {
        super(context, looper, 198, c3774d, interfaceC3686e, interfaceC3704n);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pay.internal.IThirdPartyPayService");
        return queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new zzg(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final C6863d[] getApiFeatures() {
        return new C6863d[]{AbstractC2055W0.f6326g, AbstractC2055W0.f6287B, AbstractC2055W0.f6289C, AbstractC2055W0.f6292E, AbstractC2055W0.f6333j0, AbstractC2055W0.f6353t0, AbstractC2055W0.f6359w0, AbstractC2055W0.f6363y0, AbstractC2055W0.f6365z0, AbstractC2055W0.f6286A0};
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.pay.internal.IThirdPartyPayService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getStartServiceAction() {
        return "com.google.android.gms.pay.service.THIRD_PARTY";
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
