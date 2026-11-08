package com.google.android.gms.internal.p394authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzp extends zzd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzp(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p394authapiphone.zze
    public final void zzb(Status status, int i7) {
        AbstractC3722w.m15008b(status, Integer.valueOf(i7), this.zza);
    }
}
