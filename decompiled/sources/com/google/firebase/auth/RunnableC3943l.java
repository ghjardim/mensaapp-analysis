package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.firebase.auth.l */
/* loaded from: classes.dex */
public final class RunnableC3943l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth.InterfaceC3928a f12874a;

    /* renamed from: b */
    public final /* synthetic */ FirebaseAuth f12875b;

    public RunnableC3943l(FirebaseAuth firebaseAuth, FirebaseAuth.InterfaceC3928a interfaceC3928a) {
        this.f12874a = interfaceC3928a;
        this.f12875b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12874a.mo5198a(this.f12875b);
    }
}
