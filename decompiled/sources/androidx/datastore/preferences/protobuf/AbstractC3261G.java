package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.G */
/* loaded from: classes.dex */
public abstract class AbstractC3261G {

    /* renamed from: a */
    public static final InterfaceC3259E f10378a = m12090c();

    /* renamed from: b */
    public static final InterfaceC3259E f10379b = new C3260F();

    /* renamed from: a */
    public static InterfaceC3259E m12088a() {
        return f10378a;
    }

    /* renamed from: b */
    public static InterfaceC3259E m12089b() {
        return f10379b;
    }

    /* renamed from: c */
    public static InterfaceC3259E m12090c() {
        if (C3274U.f10411d) {
            return null;
        }
        try {
            return (InterfaceC3259E) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
