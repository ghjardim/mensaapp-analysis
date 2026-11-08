package com.google.android.gms.internal.p394authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.common.api.internal.InterfaceC3690g;
import com.google.android.gms.common.internal.AbstractC3770b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzu extends InterfaceC3690g.a {
    final /* synthetic */ TaskCompletionSource zza;

    public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3690g
    public final void onResult(Status status) {
        if (status.m14803z0() == 6) {
            this.zza.trySetException(AbstractC3770b.m15045a(status));
        } else {
            AbstractC3722w.m15007a(status, this.zza);
        }
    }
}
