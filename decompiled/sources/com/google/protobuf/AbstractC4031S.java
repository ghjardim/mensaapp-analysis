package com.google.protobuf;

/* renamed from: com.google.protobuf.S */
/* loaded from: classes.dex */
public abstract class AbstractC4031S {

    /* renamed from: a */
    public static final InterfaceC4029P f13328a = m16311c();

    /* renamed from: b */
    public static final InterfaceC4029P f13329b = new C4030Q();

    /* renamed from: a */
    public static InterfaceC4029P m16309a() {
        return f13328a;
    }

    /* renamed from: b */
    public static InterfaceC4029P m16310b() {
        return f13329b;
    }

    /* renamed from: c */
    public static InterfaceC4029P m16311c() {
        try {
            return (InterfaceC4029P) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
