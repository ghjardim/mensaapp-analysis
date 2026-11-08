package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import p157W2.C2667G;
import p157W2.InterfaceC2697w;

/* renamed from: com.google.android.play.core.integrity.bf */
/* loaded from: classes.dex */
final class C3873bf extends AbstractC3880bm {

    /* renamed from: a */
    final /* synthetic */ long f12701a;

    /* renamed from: b */
    final /* synthetic */ TaskCompletionSource f12702b;

    /* renamed from: c */
    final /* synthetic */ C3881bn f12703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3873bf(C3881bn c3881bn, TaskCompletionSource taskCompletionSource, int i7, long j7, TaskCompletionSource taskCompletionSource2) {
        super(c3881bn, taskCompletionSource);
        this.f12703c = c3881bn;
        this.f12701a = j7;
        this.f12702b = taskCompletionSource2;
    }

    @Override // p157W2.AbstractRunnableC2668H
    /* renamed from: b */
    public final void mo9147b() {
        C2667G c2667g;
        if (C3881bn.m15239k(this.f12703c)) {
            super.mo9146a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C3881bn c3881bn = this.f12703c;
            ((InterfaceC2697w) c3881bn.f12723a.m9170e()).mo9194u(C3881bn.m15233b(c3881bn, this.f12701a, 0), new BinderC3879bl(this.f12703c, this.f12702b));
        } catch (RemoteException e7) {
            C3881bn c3881bn2 = this.f12703c;
            long j7 = this.f12701a;
            c2667g = c3881bn2.f12724b;
            c2667g.m9143c(e7, "warmUpIntegrityToken(%s)", Long.valueOf(j7));
            this.f12702b.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
