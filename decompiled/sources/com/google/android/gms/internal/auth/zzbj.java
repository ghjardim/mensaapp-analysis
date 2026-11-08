package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.C3643a;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3684d;
import p294n2.AbstractC5773b;

/* loaded from: classes.dex */
abstract class zzbj extends AbstractC3684d {
    public zzbj(AbstractC3648f abstractC3648f) {
        super(AbstractC5773b.f21065a, abstractC3648f);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC3729l createFailedResult(Status status) {
        return new zzbv(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3684d
    public final /* bridge */ /* synthetic */ void doExecute(C3643a.b bVar) {
        zzbe zzbeVar = (zzbe) bVar;
        zza(zzbeVar.getContext(), (zzbh) zzbeVar.getService());
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzbj) obj);
    }

    public abstract void zza(Context context, zzbh zzbhVar);
}
