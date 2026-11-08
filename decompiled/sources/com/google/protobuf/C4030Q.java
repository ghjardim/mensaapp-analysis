package com.google.protobuf;

import com.google.protobuf.C4027N;
import java.util.Map;

/* renamed from: com.google.protobuf.Q */
/* loaded from: classes.dex */
public class C4030Q implements InterfaceC4029P {
    /* renamed from: i */
    public static int m16307i(int i7, Object obj, Object obj2) {
        C4028O c4028o = (C4028O) obj;
        C4027N c4027n = (C4027N) obj2;
        int i8 = 0;
        if (c4028o.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : c4028o.entrySet()) {
            i8 += c4027n.m16286a(i7, entry.getKey(), entry.getValue());
        }
        return i8;
    }

    /* renamed from: j */
    public static C4028O m16308j(Object obj, Object obj2) {
        C4028O c4028o = (C4028O) obj;
        C4028O c4028o2 = (C4028O) obj2;
        if (!c4028o2.isEmpty()) {
            if (!c4028o.m16295i()) {
                c4028o = c4028o.m16298l();
            }
            c4028o.m16297k(c4028o2);
        }
        return c4028o;
    }

    @Override // com.google.protobuf.InterfaceC4029P
    /* renamed from: a */
    public Object mo16299a(Object obj, Object obj2) {
        return m16308j(obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC4029P
    /* renamed from: b */
    public Object mo16300b(Object obj) {
        ((C4028O) obj).m16296j();
        return obj;
    }

    @Override // com.google.protobuf.InterfaceC4029P
    /* renamed from: c */
    public C4027N.a mo16301c(Object obj) {
        return ((C4027N) obj).m16287c();
    }

    @Override // com.google.protobuf.InterfaceC4029P
    /* renamed from: d */
    public Map mo16302d(Object obj) {
        return (C4028O) obj;
    }

    @Override // com.google.protobuf.InterfaceC4029P
    /* renamed from: e */
    public Object mo16303e(Object obj) {
        return C4028O.m16291d().m16298l();
    }

    @Override // com.google.protobuf.InterfaceC4029P
    /* renamed from: f */
    public int mo16304f(int i7, Object obj, Object obj2) {
        return m16307i(i7, obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC4029P
    /* renamed from: g */
    public boolean mo16305g(Object obj) {
        return !((C4028O) obj).m16295i();
    }

    @Override // com.google.protobuf.InterfaceC4029P
    /* renamed from: h */
    public Map mo16306h(Object obj) {
        return (C4028O) obj;
    }
}
