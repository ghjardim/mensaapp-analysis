package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.l */
/* loaded from: classes.dex */
public abstract class AbstractC3302l {

    /* renamed from: a */
    public static final Class f10566a = m12752c();

    /* renamed from: a */
    public static C3304m m12750a() {
        C3304m m12751b = m12751b("getEmptyRegistry");
        return m12751b != null ? m12751b : C3304m.f10571c;
    }

    /* renamed from: b */
    public static final C3304m m12751b(String str) {
        Class cls = f10566a;
        if (cls == null) {
            return null;
        }
        try {
            return (C3304m) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Class m12752c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
