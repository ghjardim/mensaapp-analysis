package com.google.android.gms.internal.p393authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zbap extends zbo {
    final /* synthetic */ TaskCompletionSource zba;

    public zbap(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p393authapi.zbp
    public final void zbb(Status status, PendingIntent pendingIntent) {
        AbstractC3722w.m15008b(status, pendingIntent, this.zba);
    }
}
