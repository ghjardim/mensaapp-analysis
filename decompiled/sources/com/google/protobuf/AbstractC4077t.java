package com.google.protobuf;

/* renamed from: com.google.protobuf.t */
/* loaded from: classes.dex */
public abstract class AbstractC4077t {

    /* renamed from: a */
    public static final AbstractC4073r f13511a = new C4075s();

    /* renamed from: b */
    public static final AbstractC4073r f13512b = m16925c();

    /* renamed from: a */
    public static AbstractC4073r m16923a() {
        AbstractC4073r abstractC4073r = f13512b;
        if (abstractC4073r != null) {
            return abstractC4073r;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC4073r m16924b() {
        return f13511a;
    }

    /* renamed from: c */
    public static AbstractC4073r m16925c() {
        try {
            return (AbstractC4073r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
