package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.B */
/* loaded from: classes.dex */
public final class C3256B implements InterfaceC3279Z {

    /* renamed from: b */
    public static final InterfaceC3263I f10365b = new a();

    /* renamed from: a */
    public final InterfaceC3263I f10366a;

    /* renamed from: androidx.datastore.preferences.protobuf.B$a */
    public class a implements InterfaceC3263I {
        @Override // androidx.datastore.preferences.protobuf.InterfaceC3263I
        /* renamed from: a */
        public InterfaceC3262H mo12060a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC3263I
        /* renamed from: b */
        public boolean mo12061b(Class cls) {
            return false;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.B$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10367a;

        static {
            int[] iArr = new int[EnumC3273T.values().length];
            f10367a = iArr;
            try {
                iArr[EnumC3273T.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.B$c */
    public static class c implements InterfaceC3263I {

        /* renamed from: a */
        public InterfaceC3263I[] f10368a;

        public c(InterfaceC3263I... interfaceC3263IArr) {
            this.f10368a = interfaceC3263IArr;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC3263I
        /* renamed from: a */
        public InterfaceC3262H mo12060a(Class cls) {
            for (InterfaceC3263I interfaceC3263I : this.f10368a) {
                if (interfaceC3263I.mo12061b(cls)) {
                    return interfaceC3263I.mo12060a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC3263I
        /* renamed from: b */
        public boolean mo12061b(Class cls) {
            for (InterfaceC3263I interfaceC3263I : this.f10368a) {
                if (interfaceC3263I.mo12061b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C3256B() {
        this(m12055c());
    }

    /* renamed from: b */
    public static boolean m12054b(InterfaceC3262H interfaceC3262H) {
        return b.f10367a[interfaceC3262H.mo12093c().ordinal()] != 1;
    }

    /* renamed from: c */
    public static InterfaceC3263I m12055c() {
        return new c(C3310s.m12795c(), m12056d());
    }

    /* renamed from: d */
    public static InterfaceC3263I m12056d() {
        if (C3274U.f10411d) {
            return f10365b;
        }
        try {
            return (InterfaceC3263I) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f10365b;
        }
    }

    /* renamed from: e */
    public static InterfaceC3278Y m12057e(Class cls, InterfaceC3262H interfaceC3262H) {
        if (m12058f(cls)) {
            return C3267M.m12108M(cls, interfaceC3262H, AbstractC3271Q.m12179b(), AbstractC3255A.m12052b(), AbstractC3281a0.m12250K(), m12054b(interfaceC3262H) ? AbstractC3307p.m12766b() : null, AbstractC3261G.m12089b());
        }
        return C3267M.m12108M(cls, interfaceC3262H, AbstractC3271Q.m12178a(), AbstractC3255A.m12051a(), AbstractC3281a0.m12249J(), m12054b(interfaceC3262H) ? AbstractC3307p.m12765a() : null, AbstractC3261G.m12088a());
    }

    /* renamed from: f */
    public static boolean m12058f(Class cls) {
        return C3274U.f10411d || AbstractC3311t.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC3279Z
    /* renamed from: a */
    public InterfaceC3278Y mo12059a(Class cls) {
        AbstractC3281a0.m12246G(cls);
        InterfaceC3262H mo12060a = this.f10366a.mo12060a(cls);
        return mo12060a.mo12091a() ? m12058f(cls) ? C3268N.m12174k(AbstractC3281a0.m12250K(), AbstractC3307p.m12766b(), mo12060a.mo12092b()) : C3268N.m12174k(AbstractC3281a0.m12249J(), AbstractC3307p.m12765a(), mo12060a.mo12092b()) : m12057e(cls, mo12060a);
    }

    public C3256B(InterfaceC3263I interfaceC3263I) {
        this.f10366a = (InterfaceC3263I) AbstractC3312u.m12835b(interfaceC3263I, "messageInfoFactory");
    }
}
