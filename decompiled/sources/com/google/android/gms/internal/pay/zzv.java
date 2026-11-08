package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzv extends zzy {
    final /* synthetic */ TaskCompletionSource zza;

    public zzv(zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzt(Status status) {
        AbstractC3722w.m15009c(status, null, this.zza);
    }
}
