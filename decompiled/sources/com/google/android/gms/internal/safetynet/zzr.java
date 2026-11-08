package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.AbstractC3648f;
import com.google.android.gms.common.api.InterfaceC3729l;
import com.google.android.gms.common.api.Status;
import p122R2.InterfaceC2233e;

/* loaded from: classes.dex */
abstract class zzr extends zze<InterfaceC2233e.b> {
    protected final zzg zzc;

    public zzr(AbstractC3648f abstractC3648f) {
        super(abstractC3648f);
        this.zzc = new zzq(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC3729l createFailedResult(Status status) {
        return new zzp(status, null);
    }
}
