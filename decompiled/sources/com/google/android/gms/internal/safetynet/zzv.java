package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
abstract class zzv extends zze<Object> {
    protected final zzg zza;

    public zzv(AbstractC3648f abstractC3648f) {
        super(abstractC3648f);
        this.zza = new zzu(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC3729l createFailedResult(Status status) {
        return new zzaa(status, null);
    }
}
