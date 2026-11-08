package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import p157W2.C2667G;
import p157W2.InterfaceC2697w;

/* renamed from: com.google.android.play.core.integrity.bg */
/* loaded from: classes.dex */
final class C3874bg extends AbstractC3880bm {

    /* renamed from: a */
    final /* synthetic */ String f12704a;

    /* renamed from: b */
    final /* synthetic */ long f12705b;

    /* renamed from: c */
    final /* synthetic */ long f12706c;

    /* renamed from: d */
    final /* synthetic */ TaskCompletionSource f12707d;

    /* renamed from: e */
    final /* synthetic */ C3881bn f12708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3874bg(C3881bn c3881bn, TaskCompletionSource taskCompletionSource, int i7, String str, long j7, long j8, TaskCompletionSource taskCompletionSource2) {
        super(c3881bn, taskCompletionSource);
        this.f12708e = c3881bn;
        this.f12704a = str;
        this.f12705b = j7;
        this.f12706c = j8;
        this.f12707d = taskCompletionSource2;
    }

    @Override // p157W2.AbstractRunnableC2668H
    /* renamed from: b */
    public final void mo9147b() {
        C2667G c2667g;
        if (C3881bn.m15239k(this.f12708e)) {
            super.mo9146a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C3881bn c3881bn = this.f12708e;
            ((InterfaceC2697w) c3881bn.f12723a.m9170e()).mo9195y(C3881bn.m15232a(c3881bn, this.f12704a, this.f12705b, this.f12706c, 0), new BinderC3878bk(this.f12708e, this.f12707d, this.f12705b));
        } catch (RemoteException e7) {
            C3881bn c3881bn2 = this.f12708e;
            String str = this.f12704a;
            c2667g = c3881bn2.f12724b;
            c2667g.m9143c(e7, "requestExpressIntegrityToken(%s, %s)", str, Long.valueOf(this.f12705b));
            this.f12707d.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
