package com.google.android.gms.internal.p393authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3770b;
import com.google.android.gms.tasks.TaskCompletionSource;
import p313p2.C6113h;

/* loaded from: classes.dex */
final class zbae extends zbs {
    final /* synthetic */ TaskCompletionSource zba;

    public zbae(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p393authapi.zbt
    public final void zbb(Status status, C6113h c6113h) {
        if (status.m14799D0()) {
            this.zba.setResult(c6113h);
        } else {
            this.zba.setException(AbstractC3770b.m15045a(status));
        }
    }
}
