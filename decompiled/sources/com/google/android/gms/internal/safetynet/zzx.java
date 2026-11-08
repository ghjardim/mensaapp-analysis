package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
abstract class zzx extends zze<Object> {
    protected final zzg zzb;

    public zzx(AbstractC3648f abstractC3648f) {
        super(abstractC3648f);
        this.zzb = new zzw(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC3729l createFailedResult(Status status) {
        return new zzab(status, null);
    }
}
