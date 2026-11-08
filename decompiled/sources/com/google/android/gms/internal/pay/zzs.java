package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.tasks.TaskCompletionSource;
import p115Q2.C2046S;
import p115Q2.C2050U;

/* loaded from: classes.dex */
final class zzs extends zzy {
    final /* synthetic */ TaskCompletionSource zza;

    public zzs(zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzm(C2046S c2046s) {
        this.zza.setException(new C2050U(c2046s));
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzt(Status status) {
        AbstractC3722w.m15008b(status, null, this.zza);
    }
}
