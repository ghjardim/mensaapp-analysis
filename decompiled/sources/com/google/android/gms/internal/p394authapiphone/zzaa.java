package com.google.android.gms.internal.p394authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzaa extends zzi {
    final /* synthetic */ TaskCompletionSource zza;

    public zzaa(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p394authapiphone.zzj
    public final void zzb(Status status) {
        AbstractC3722w.m15007a(status, this.zza);
    }
}
