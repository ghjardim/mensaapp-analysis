package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzw extends zzy {
    final /* synthetic */ TaskCompletionSource zza;

    public zzw(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzi(Status status, int i7) {
        if (status.m14799D0() && i7 == 3) {
            AbstractC3722w.m15009c(Status.f12250o, null, this.zza);
        } else if (i7 == 1) {
            AbstractC3722w.m15009c(status, 2, this.zza);
        } else {
            AbstractC3722w.m15009c(status, Integer.valueOf(i7), this.zza);
        }
    }
}
