package com.google.android.gms.internal.p393authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.tasks.TaskCompletionSource;
import p313p2.C6115j;

/* loaded from: classes.dex */
final class zbaf extends zbu {
    final /* synthetic */ TaskCompletionSource zba;

    public zbaf(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p393authapi.zbv
    public final void zbb(Status status, C6115j c6115j) {
        AbstractC3722w.m15008b(status, c6115j, this.zba);
    }
}
