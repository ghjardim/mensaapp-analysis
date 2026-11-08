package com.google.android.gms.internal.pay;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzr extends zzy {
    final /* synthetic */ TaskCompletionSource zza;

    public zzr(zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzp(Status status, PendingIntent pendingIntent) {
        AbstractC3722w.m15009c(status, pendingIntent, this.zza);
    }
}
