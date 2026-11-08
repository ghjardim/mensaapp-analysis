package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.tasks.TaskCompletionSource;
import p115Q2.C2062a;

/* loaded from: classes.dex */
final class zzt extends zzy {
    final /* synthetic */ TaskCompletionSource zza;

    public zzt(zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzf(Status status, C2062a c2062a) {
        AbstractC3722w.m15009c(status, c2062a, this.zza);
    }
}
