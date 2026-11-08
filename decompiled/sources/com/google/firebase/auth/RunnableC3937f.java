package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.firebase.auth.f */
/* loaded from: classes.dex */
public final class RunnableC3937f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth.InterfaceC3929b f12850a;

    /* renamed from: b */
    public final /* synthetic */ FirebaseAuth f12851b;

    public RunnableC3937f(FirebaseAuth firebaseAuth, FirebaseAuth.InterfaceC3929b interfaceC3929b) {
        this.f12850a = interfaceC3929b;
        this.f12851b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12850a.mo5446a(this.f12851b);
    }
}
