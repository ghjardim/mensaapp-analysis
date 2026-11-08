package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s */
/* loaded from: classes.dex */
public class C3310s implements InterfaceC3263I {

    /* renamed from: a */
    public static final C3310s f10650a = new C3310s();

    /* renamed from: c */
    public static C3310s m12795c() {
        return f10650a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3263I
    /* renamed from: a */
    public InterfaceC3262H mo12060a(Class cls) {
        if (!AbstractC3311t.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC3262H) AbstractC3311t.m12804u(cls.asSubclass(AbstractC3311t.class)).m12814j();
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e7);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3263I
    /* renamed from: b */
    public boolean mo12061b(Class cls) {
        return AbstractC3311t.class.isAssignableFrom(cls);
    }
}
