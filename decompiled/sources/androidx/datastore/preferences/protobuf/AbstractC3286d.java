package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d */
/* loaded from: classes.dex */
public abstract class AbstractC3286d {

    /* renamed from: a */
    public static boolean f10444a;

    /* renamed from: b */
    public static final Class f10445b = m12325a("libcore.io.Memory");

    /* renamed from: c */
    public static final boolean f10446c;

    static {
        f10446c = (f10444a || m12325a("org.robolectric.Robolectric") == null) ? false : true;
    }

    /* renamed from: a */
    public static Class m12325a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class m12326b() {
        return f10445b;
    }

    /* renamed from: c */
    public static boolean m12327c() {
        return f10444a || !(f10445b == null || f10446c);
    }
}
