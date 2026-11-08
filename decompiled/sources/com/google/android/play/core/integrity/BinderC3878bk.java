package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.tasks.TaskCompletionSource;
import p157W2.C2667G;

/* renamed from: com.google.android.play.core.integrity.bk */
/* loaded from: classes.dex */
final class BinderC3878bk extends BinderC3876bi {

    /* renamed from: c */
    final /* synthetic */ C3881bn f12717c;

    /* renamed from: d */
    private final C2667G f12718d;

    /* renamed from: e */
    private final long f12719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3878bk(C3881bn c3881bn, TaskCompletionSource taskCompletionSource, long j7) {
        super(c3881bn, taskCompletionSource);
        this.f12717c = c3881bn;
        this.f12718d = new C2667G("OnRequestIntegrityTokenCallback");
        this.f12719e = j7;
    }

    @Override // com.google.android.play.core.integrity.BinderC3876bi, p157W2.InterfaceC2699y
    /* renamed from: c */
    public final void mo9198c(Bundle bundle) {
        InterfaceC3898k interfaceC3898k;
        String str;
        super.mo9198c(bundle);
        this.f12718d.m9144d("onRequestExpressIntegrityToken", new Object[0]);
        interfaceC3898k = this.f12717c.f12728f;
        C3644b mo15245a = interfaceC3898k.mo15245a(bundle);
        if (mo15245a != null) {
            this.f12714a.trySetException(mo15245a);
            return;
        }
        long j7 = bundle.getLong("request.token.sid");
        str = this.f12717c.f12725c;
        C3877bj c3877bj = new C3877bj(this, str, j7);
        TaskCompletionSource taskCompletionSource = this.f12714a;
        C3867b c3867b = new C3867b();
        c3867b.mo15228b(bundle.getString("token"));
        c3867b.mo15227a(c3877bj);
        taskCompletionSource.trySetResult(c3867b.mo15229c());
    }
}
