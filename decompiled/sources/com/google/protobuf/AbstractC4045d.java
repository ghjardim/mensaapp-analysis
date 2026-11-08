package com.google.protobuf;

/* renamed from: com.google.protobuf.d */
/* loaded from: classes.dex */
public abstract class AbstractC4045d {

    /* renamed from: a */
    public static boolean f13359a;

    /* renamed from: b */
    public static final Class f13360b = m16428a("libcore.io.Memory");

    /* renamed from: c */
    public static final boolean f13361c;

    static {
        f13361c = (f13359a || m16428a("org.robolectric.Robolectric") == null) ? false : true;
    }

    /* renamed from: a */
    public static Class m16428a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class m16429b() {
        return f13360b;
    }

    /* renamed from: c */
    public static boolean m16430c() {
        return f13359a || !(f13360b == null || f13361c);
    }
}
