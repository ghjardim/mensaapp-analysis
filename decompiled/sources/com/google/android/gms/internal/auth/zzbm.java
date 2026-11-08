package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.tasks.TaskCompletionSource;
import p329r2.C6290c;

/* loaded from: classes.dex */
final class zzbm extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzbm(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(C6290c c6290c) {
        AbstractC3722w.m15008b(new Status(c6290c.f22798a), c6290c, this.zza);
    }
}
