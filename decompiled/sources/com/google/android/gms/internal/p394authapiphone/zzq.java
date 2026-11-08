package com.google.android.gms.internal.p394authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzq extends zzf {
    final /* synthetic */ TaskCompletionSource zza;

    public zzq(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p394authapiphone.zzg
    public final void zzb(Status status, boolean z6) {
        AbstractC3722w.m15008b(status, Boolean.valueOf(z6), this.zza);
    }
}
