package com.google.protobuf;

/* renamed from: com.google.protobuf.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC4044c0 {

    /* renamed from: a */
    public static final InterfaceC4040a0 f13357a = m16427c();

    /* renamed from: b */
    public static final InterfaceC4040a0 f13358b = new C4042b0();

    /* renamed from: a */
    public static InterfaceC4040a0 m16425a() {
        return f13357a;
    }

    /* renamed from: b */
    public static InterfaceC4040a0 m16426b() {
        return f13358b;
    }

    /* renamed from: c */
    public static InterfaceC4040a0 m16427c() {
        try {
            return (InterfaceC4040a0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
