package com.google.android.gms.internal.p393authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.tasks.TaskCompletionSource;
import p313p2.C6108c;

/* loaded from: classes.dex */
final class zbam extends zbl {
    final /* synthetic */ TaskCompletionSource zba;

    public zbam(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p393authapi.zbm
    public final void zbb(Status status, C6108c c6108c) {
        AbstractC3722w.m15008b(status, c6108c, this.zba);
    }
}
