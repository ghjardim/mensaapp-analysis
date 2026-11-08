package com.google.protobuf;

/* renamed from: com.google.protobuf.x */
/* loaded from: classes.dex */
public class C4085x implements InterfaceC4033U {

    /* renamed from: a */
    public static final C4085x f13595a = new C4085x();

    /* renamed from: c */
    public static C4085x m17004c() {
        return f13595a;
    }

    @Override // com.google.protobuf.InterfaceC4033U
    /* renamed from: a */
    public InterfaceC4032T mo16281a(Class cls) {
        if (!AbstractC4087y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC4032T) AbstractC4087y.m17022B(cls.asSubclass(AbstractC4087y.class)).m17048o();
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e7);
        }
    }

    @Override // com.google.protobuf.InterfaceC4033U
    /* renamed from: b */
    public boolean mo16282b(Class cls) {
        return AbstractC4087y.class.isAssignableFrom(cls);
    }
}
