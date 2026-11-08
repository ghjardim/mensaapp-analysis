package com.google.android.gms.internal.p393authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3770b;
import com.google.android.gms.tasks.TaskCompletionSource;
import p313p2.C6106a;

/* loaded from: classes.dex */
final class zbz extends zbi {
    final /* synthetic */ TaskCompletionSource zba;

    public zbz(zbaa zbaaVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p393authapi.zbj
    public final void zbb(Status status, C6106a c6106a) {
        if (status.m14799D0()) {
            this.zba.setResult(c6106a);
        } else {
            this.zba.setException(AbstractC3770b.m15045a(status));
        }
    }
}
