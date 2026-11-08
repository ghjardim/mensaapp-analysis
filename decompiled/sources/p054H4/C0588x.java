package p054H4;

import java.util.HashMap;
import p061I4.C0649a;
import p061I4.C0654f;
import p370w4.AbstractC6917b;
import p391z4.C7146a;

/* renamed from: H4.x */
/* loaded from: classes.dex */
public class C0588x {

    /* renamed from: a */
    public final C0649a f2042a;

    public C0588x(C7146a c7146a) {
        this.f2042a = new C0649a(c7146a, "flutter/system", C0654f.f2252a);
    }

    /* renamed from: a */
    public void m2347a() {
        AbstractC6917b.m28358f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f2042a.m2612c(hashMap);
    }
}
