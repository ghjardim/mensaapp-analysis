package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.C3644b;
import com.google.android.gms.tasks.TaskCompletionSource;
import p157W2.AbstractBinderC2663C;
import p157W2.C2667G;

/* renamed from: com.google.android.play.core.integrity.ai */
/* loaded from: classes.dex */
final class BinderC3849ai extends AbstractBinderC2663C {

    /* renamed from: a */
    final /* synthetic */ C3850aj f12657a;

    /* renamed from: b */
    private final C2667G f12658b = new C2667G("OnRequestIntegrityTokenCallback");

    /* renamed from: c */
    private final TaskCompletionSource f12659c;

    public BinderC3849ai(C3850aj c3850aj, TaskCompletionSource taskCompletionSource) {
        this.f12657a = c3850aj;
        this.f12659c = taskCompletionSource;
    }

    @Override // p157W2.InterfaceC2664D
    /* renamed from: b */
    public final void mo9138b(Bundle bundle) {
        InterfaceC3898k interfaceC3898k;
        String str;
        this.f12657a.f12660a.m9173v(this.f12659c);
        this.f12658b.m9144d("onRequestIntegrityToken", new Object[0]);
        interfaceC3898k = this.f12657a.f12664e;
        C3644b mo15245a = interfaceC3898k.mo15245a(bundle);
        if (mo15245a != null) {
            this.f12659c.trySetException(mo15245a);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f12659c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        long j7 = bundle.getLong("request.token.sid");
        str = this.f12657a.f12662c;
        C3848ah c3848ah = new C3848ah(this, str, j7);
        TaskCompletionSource taskCompletionSource = this.f12659c;
        C3840a c3840a = new C3840a();
        c3840a.mo15209b(string);
        c3840a.mo15208a(c3848ah);
        taskCompletionSource.trySetResult(c3840a.mo15210c());
    }
}
