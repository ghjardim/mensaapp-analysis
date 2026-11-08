package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC3650h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3800q;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.L */
/* loaded from: classes.dex */
public final class C3754L implements AbstractC3650h.a {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3650h f12443a;

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f12444b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC3800q.a f12445c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC3757O f12446d;

    public C3754L(AbstractC3650h abstractC3650h, TaskCompletionSource taskCompletionSource, AbstractC3800q.a aVar, InterfaceC3757O interfaceC3757O) {
        this.f12443a = abstractC3650h;
        this.f12444b = taskCompletionSource;
        this.f12445c = aVar;
        this.f12446d = interfaceC3757O;
    }

    @Override // com.google.android.gms.common.api.AbstractC3650h.a
    /* renamed from: a */
    public final void mo14820a(Status status) {
        if (!status.m14799D0()) {
            this.f12444b.setException(AbstractC3770b.m15045a(status));
        } else {
            this.f12444b.setResult(this.f12445c.mo15032a(this.f12443a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
