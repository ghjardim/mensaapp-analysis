package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.tasks.TaskCompletionSource;
import p157W2.C2667G;

/* renamed from: com.google.android.play.core.integrity.bl */
/* loaded from: classes.dex */
final class BinderC3879bl extends BinderC3876bi {

    /* renamed from: c */
    final /* synthetic */ C3881bn f12720c;

    /* renamed from: d */
    private final C2667G f12721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3879bl(C3881bn c3881bn, TaskCompletionSource taskCompletionSource) {
        super(c3881bn, taskCompletionSource);
        this.f12720c = c3881bn;
        this.f12721d = new C2667G("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.BinderC3876bi, p157W2.InterfaceC2699y
    /* renamed from: e */
    public final void mo9200e(Bundle bundle) {
        InterfaceC3898k interfaceC3898k;
        super.mo9200e(bundle);
        this.f12721d.m9144d("onWarmUpExpressIntegrityToken", new Object[0]);
        interfaceC3898k = this.f12720c.f12728f;
        C3644b mo15245a = interfaceC3898k.mo15245a(bundle);
        if (mo15245a != null) {
            this.f12714a.trySetException(mo15245a);
        } else {
            this.f12714a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
