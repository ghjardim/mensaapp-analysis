package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.A */
/* loaded from: classes.dex */
public abstract class AbstractC3255A {

    /* renamed from: a */
    public static final InterfaceC3316y f10363a = m12053c();

    /* renamed from: b */
    public static final InterfaceC3316y f10364b = new C3317z();

    /* renamed from: a */
    public static InterfaceC3316y m12051a() {
        return f10363a;
    }

    /* renamed from: b */
    public static InterfaceC3316y m12052b() {
        return f10364b;
    }

    /* renamed from: c */
    public static InterfaceC3316y m12053c() {
        if (C3274U.f10411d) {
            return null;
        }
        try {
            return (InterfaceC3316y) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
