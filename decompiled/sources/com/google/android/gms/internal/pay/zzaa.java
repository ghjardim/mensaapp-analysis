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
public final class zzaa extends AbstractC3780g {
    public zzaa(Context context, Looper looper, C3774d c3774d, InterfaceC3686e interfaceC3686e, InterfaceC3704n interfaceC3704n) {
        super(context, looper, 198, c3774d, interfaceC3686e, interfaceC3704n);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pay.internal.IPayService");
        return queryLocalInterface instanceof zzd ? (zzd) queryLocalInterface : new zzd(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final C6863d[] getApiFeatures() {
        return new C6863d[]{AbstractC2055W0.f6314a, AbstractC2055W0.f6316b, AbstractC2055W0.f6306S, AbstractC2055W0.f6320d, AbstractC2055W0.f6322e, AbstractC2055W0.f6324f, AbstractC2055W0.f6326g, AbstractC2055W0.f6328h, AbstractC2055W0.f6330i, AbstractC2055W0.f6332j, AbstractC2055W0.f6334k, AbstractC2055W0.f6336l, AbstractC2055W0.f6338m, AbstractC2055W0.f6340n, AbstractC2055W0.f6344p, AbstractC2055W0.f6342o, AbstractC2055W0.f6346q, AbstractC2055W0.f6354u, AbstractC2055W0.f6352t, AbstractC2055W0.f6318c, AbstractC2055W0.f6356v, AbstractC2055W0.f6358w, AbstractC2055W0.f6360x, AbstractC2055W0.f6364z, AbstractC2055W0.f6285A, AbstractC2055W0.f6291D, AbstractC2055W0.f6287B, AbstractC2055W0.f6289C, AbstractC2055W0.f6293F, AbstractC2055W0.f6292E, AbstractC2055W0.f6296I, AbstractC2055W0.f6297J, AbstractC2055W0.f6298K, AbstractC2055W0.f6299L, AbstractC2055W0.f6301N, AbstractC2055W0.f6302O, AbstractC2055W0.f6303P, AbstractC2055W0.f6305R, AbstractC2055W0.f6307T, AbstractC2055W0.f6308U, AbstractC2055W0.f6309V, AbstractC2055W0.f6310W, AbstractC2055W0.f6311X, AbstractC2055W0.f6294G, AbstractC2055W0.f6312Y, AbstractC2055W0.f6313Z, AbstractC2055W0.f6315a0, AbstractC2055W0.f6317b0, AbstractC2055W0.f6319c0, AbstractC2055W0.f6323e0, AbstractC2055W0.f6325f0, AbstractC2055W0.f6327g0, AbstractC2055W0.f6362y, AbstractC2055W0.f6348r, AbstractC2055W0.f6329h0, AbstractC2055W0.f6295H, AbstractC2055W0.f6304Q, AbstractC2055W0.f6331i0, AbstractC2055W0.f6333j0, AbstractC2055W0.f6335k0, AbstractC2055W0.f6337l0, AbstractC2055W0.f6341n0, AbstractC2055W0.f6339m0, AbstractC2055W0.f6343o0, AbstractC2055W0.f6345p0, AbstractC2055W0.f6350s, AbstractC2055W0.f6347q0, AbstractC2055W0.f6349r0, AbstractC2055W0.f6351s0, AbstractC2055W0.f6353t0, AbstractC2055W0.f6355u0, AbstractC2055W0.f6357v0, AbstractC2055W0.f6361x0, AbstractC2055W0.f6359w0, AbstractC2055W0.f6321d0, AbstractC2055W0.f6363y0, AbstractC2055W0.f6365z0, AbstractC2055W0.f6286A0, AbstractC2055W0.f6288B0};
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.pay.internal.IPayService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getStartServiceAction() {
        return "com.google.android.gms.pay.service.BIND";
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
