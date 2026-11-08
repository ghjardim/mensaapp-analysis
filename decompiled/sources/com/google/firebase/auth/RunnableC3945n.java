package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;
import p172Y3.C2945b;
import p354u3.InterfaceC6638a;

/* renamed from: com.google.firebase.auth.n */
/* loaded from: classes.dex */
public final class RunnableC3945n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f12877a;

    /* renamed from: b */
    public final /* synthetic */ C2945b f12878b;

    public RunnableC3945n(FirebaseAuth firebaseAuth, C2945b c2945b) {
        this.f12877a = firebaseAuth;
        this.f12878b = c2945b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        list = this.f12877a.f12792c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC6638a) it.next()).mo2152a(this.f12878b);
        }
        list2 = this.f12877a.f12791b;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.InterfaceC3929b) it2.next()).mo5446a(this.f12877a);
        }
    }
}
