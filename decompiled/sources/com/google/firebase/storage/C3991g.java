package com.google.firebase.storage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p137T3.InterfaceC2447b;
import p219e3.C4176f;

/* renamed from: com.google.firebase.storage.g */
/* loaded from: classes.dex */
public class C3991g {

    /* renamed from: a */
    public final Map f13169a = new HashMap();

    /* renamed from: b */
    public final C4176f f13170b;

    /* renamed from: c */
    public final InterfaceC2447b f13171c;

    /* renamed from: d */
    public final InterfaceC2447b f13172d;

    public C3991g(C4176f c4176f, InterfaceC2447b interfaceC2447b, InterfaceC2447b interfaceC2447b2, Executor executor, Executor executor2) {
        this.f13170b = c4176f;
        this.f13171c = interfaceC2447b;
        this.f13172d = interfaceC2447b2;
        C3977G.m15940d(executor, executor2);
    }

    /* renamed from: a */
    public synchronized C3990f m16015a(String str) {
        C3990f c3990f;
        c3990f = (C3990f) this.f13169a.get(str);
        if (c3990f == null) {
            c3990f = new C3990f(str, this.f13170b, this.f13171c, this.f13172d);
            this.f13169a.put(str, c3990f);
        }
        return c3990f;
    }
}
