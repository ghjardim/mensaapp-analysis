package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.Q */
/* loaded from: classes.dex */
public abstract class AbstractC3271Q {

    /* renamed from: a */
    public static final InterfaceC3269O f10404a = m12180c();

    /* renamed from: b */
    public static final InterfaceC3269O f10405b = new C3270P();

    /* renamed from: a */
    public static InterfaceC3269O m12178a() {
        return f10404a;
    }

    /* renamed from: b */
    public static InterfaceC3269O m12179b() {
        return f10405b;
    }

    /* renamed from: c */
    public static InterfaceC3269O m12180c() {
        if (C3274U.f10411d) {
            return null;
        }
        try {
            return (InterfaceC3269O) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
