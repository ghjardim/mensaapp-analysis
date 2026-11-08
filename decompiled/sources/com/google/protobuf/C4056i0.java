package com.google.protobuf;

import java.util.concurrent.ConcurrentMap;
import p256j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.i0 */
/* loaded from: classes.dex */
public final class C4056i0 {

    /* renamed from: c */
    public static final C4056i0 f13389c = new C4056i0();

    /* renamed from: b */
    public final ConcurrentMap f13391b = new ConcurrentHashMap();

    /* renamed from: a */
    public final InterfaceC4068o0 f13390a = new C4026M();

    /* renamed from: a */
    public static C4056i0 m16519a() {
        return f13389c;
    }

    /* renamed from: b */
    public InterfaceC4066n0 m16520b(Class cls, InterfaceC4066n0 interfaceC4066n0) {
        AbstractC4015C.m16184b(cls, "messageType");
        AbstractC4015C.m16184b(interfaceC4066n0, "schema");
        return (InterfaceC4066n0) this.f13391b.putIfAbsent(cls, interfaceC4066n0);
    }

    /* renamed from: c */
    public InterfaceC4066n0 m16521c(Class cls) {
        AbstractC4015C.m16184b(cls, "messageType");
        InterfaceC4066n0 interfaceC4066n0 = (InterfaceC4066n0) this.f13391b.get(cls);
        if (interfaceC4066n0 != null) {
            return interfaceC4066n0;
        }
        InterfaceC4066n0 mo16280a = this.f13390a.mo16280a(cls);
        InterfaceC4066n0 m16520b = m16520b(cls, mo16280a);
        return m16520b != null ? m16520b : mo16280a;
    }

    /* renamed from: d */
    public InterfaceC4066n0 m16522d(Object obj) {
        return m16521c(obj.getClass());
    }
}
