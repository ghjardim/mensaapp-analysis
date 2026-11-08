package com.google.protobuf;

/* renamed from: com.google.protobuf.p */
/* loaded from: classes.dex */
public abstract class AbstractC4069p {

    /* renamed from: a */
    public static final Class f13479a = m16822c();

    /* renamed from: a */
    public static C4071q m16820a() {
        C4071q m16821b = m16821b("getEmptyRegistry");
        return m16821b != null ? m16821b : C4071q.f13485d;
    }

    /* renamed from: b */
    public static final C4071q m16821b(String str) {
        Class cls = f13479a;
        if (cls == null) {
            return null;
        }
        try {
            return (C4071q) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Class m16822c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
