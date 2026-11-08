package com.google.firebase.auth;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.firebase.auth.AbstractC3933b;
import p219e3.C4183m;
import p346t3.C6483O;
import p354u3.C6648f;

/* renamed from: com.google.firebase.auth.g */
/* loaded from: classes.dex */
public final class C3938g extends AbstractC3933b.b {

    /* renamed from: a */
    public final /* synthetic */ AbstractC3933b.b f12852a;

    /* renamed from: b */
    public final /* synthetic */ FirebaseAuth f12853b;

    public C3938g(FirebaseAuth firebaseAuth, AbstractC3933b.b bVar) {
        this.f12852a = bVar;
        this.f12853b = firebaseAuth;
    }

    @Override // com.google.firebase.auth.AbstractC3933b.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    @Override // com.google.firebase.auth.AbstractC3933b.b
    public final void onCodeSent(String str, AbstractC3933b.a aVar) {
        C6648f c6648f;
        AbstractC3933b.b bVar = this.f12852a;
        c6648f = this.f12853b.f12796g;
        bVar.onVerificationCompleted(AbstractC3933b.m15410a(str, (String) AbstractC3802r.m15129k(c6648f.m27537e())));
    }

    @Override // com.google.firebase.auth.AbstractC3933b.b
    public final void onVerificationCompleted(C6483O c6483o) {
        this.f12852a.onVerificationCompleted(c6483o);
    }

    @Override // com.google.firebase.auth.AbstractC3933b.b
    public final void onVerificationFailed(C4183m c4183m) {
        this.f12852a.onVerificationFailed(c4183m);
    }
}
