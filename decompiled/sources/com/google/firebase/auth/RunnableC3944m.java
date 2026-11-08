package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.firebase.auth.m */
/* loaded from: classes.dex */
public final class RunnableC3944m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f12876a;

    public RunnableC3944m(FirebaseAuth firebaseAuth) {
        this.f12876a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        list = this.f12876a.f12793d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.InterfaceC3928a) it.next()).mo5198a(this.f12876a);
        }
    }
}
