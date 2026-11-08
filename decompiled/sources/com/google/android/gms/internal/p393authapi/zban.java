package com.google.android.gms.internal.p393authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3722w;
import com.google.android.gms.common.api.internal.InterfaceC3690g;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zban extends InterfaceC3690g.a {
    final /* synthetic */ TaskCompletionSource zba;

    public zban(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3690g
    public final void onResult(Status status) {
        AbstractC3722w.m15007a(status, this.zba);
    }
}
