package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.p */
/* loaded from: classes.dex */
public abstract class AbstractC3307p {

    /* renamed from: a */
    public static final AbstractC3305n f10575a = new C3306o();

    /* renamed from: b */
    public static final AbstractC3305n f10576b = m12767c();

    /* renamed from: a */
    public static AbstractC3305n m12765a() {
        AbstractC3305n abstractC3305n = f10576b;
        if (abstractC3305n != null) {
            return abstractC3305n;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static AbstractC3305n m12766b() {
        return f10575a;
    }

    /* renamed from: c */
    public static AbstractC3305n m12767c() {
        if (C3274U.f10411d) {
            return null;
        }
        try {
            return (AbstractC3305n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
