package com.google.protobuf;

/* renamed from: com.google.protobuf.M */
/* loaded from: classes.dex */
public final class C4026M implements InterfaceC4068o0 {

    /* renamed from: b */
    public static final InterfaceC4033U f13315b = new a();

    /* renamed from: a */
    public final InterfaceC4033U f13316a;

    /* renamed from: com.google.protobuf.M$a */
    public class a implements InterfaceC4033U {
        @Override // com.google.protobuf.InterfaceC4033U
        /* renamed from: a */
        public InterfaceC4032T mo16281a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.InterfaceC4033U
        /* renamed from: b */
        public boolean mo16282b(Class cls) {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.M$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13317a;

        static {
            int[] iArr = new int[EnumC4054h0.values().length];
            f13317a = iArr;
            try {
                iArr[EnumC4054h0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.google.protobuf.M$c */
    public static class c implements InterfaceC4033U {

        /* renamed from: a */
        public InterfaceC4033U[] f13318a;

        public c(InterfaceC4033U... interfaceC4033UArr) {
            this.f13318a = interfaceC4033UArr;
        }

        @Override // com.google.protobuf.InterfaceC4033U
        /* renamed from: a */
        public InterfaceC4032T mo16281a(Class cls) {
            for (InterfaceC4033U interfaceC4033U : this.f13318a) {
                if (interfaceC4033U.mo16282b(cls)) {
                    return interfaceC4033U.mo16281a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.InterfaceC4033U
        /* renamed from: b */
        public boolean mo16282b(Class cls) {
            for (InterfaceC4033U interfaceC4033U : this.f13318a) {
                if (interfaceC4033U.mo16282b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C4026M() {
        this(m16277c());
    }

    /* renamed from: b */
    public static boolean m16276b(InterfaceC4032T interfaceC4032T) {
        return b.f13317a[interfaceC4032T.mo16314c().ordinal()] != 1;
    }

    /* renamed from: c */
    public static InterfaceC4033U m16277c() {
        return new c(C4085x.m17004c(), m16278d());
    }

    /* renamed from: d */
    public static InterfaceC4033U m16278d() {
        try {
            return (InterfaceC4033U) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f13315b;
        }
    }

    /* renamed from: e */
    public static InterfaceC4066n0 m16279e(Class cls, InterfaceC4032T interfaceC4032T) {
        return AbstractC4087y.class.isAssignableFrom(cls) ? m16276b(interfaceC4032T) ? C4037Y.m16335R(cls, interfaceC4032T, AbstractC4044c0.m16426b(), AbstractC4024K.m16267b(), AbstractC4070p0.m16833K(), AbstractC4077t.m16924b(), AbstractC4031S.m16310b()) : C4037Y.m16335R(cls, interfaceC4032T, AbstractC4044c0.m16426b(), AbstractC4024K.m16267b(), AbstractC4070p0.m16833K(), null, AbstractC4031S.m16310b()) : m16276b(interfaceC4032T) ? C4037Y.m16335R(cls, interfaceC4032T, AbstractC4044c0.m16425a(), AbstractC4024K.m16266a(), AbstractC4070p0.m16832J(), AbstractC4077t.m16923a(), AbstractC4031S.m16309a()) : C4037Y.m16335R(cls, interfaceC4032T, AbstractC4044c0.m16425a(), AbstractC4024K.m16266a(), AbstractC4070p0.m16832J(), null, AbstractC4031S.m16309a());
    }

    @Override // com.google.protobuf.InterfaceC4068o0
    /* renamed from: a */
    public InterfaceC4066n0 mo16280a(Class cls) {
        AbstractC4070p0.m16829G(cls);
        InterfaceC4032T mo16281a = this.f13316a.mo16281a(cls);
        return mo16281a.mo16312a() ? AbstractC4087y.class.isAssignableFrom(cls) ? C4038Z.m16409l(AbstractC4070p0.m16833K(), AbstractC4077t.m16924b(), mo16281a.mo16313b()) : C4038Z.m16409l(AbstractC4070p0.m16832J(), AbstractC4077t.m16923a(), mo16281a.mo16313b()) : m16279e(cls, mo16281a);
    }

    public C4026M(InterfaceC4033U interfaceC4033U) {
        this.f13316a = (InterfaceC4033U) AbstractC4015C.m16184b(interfaceC4033U, "messageInfoFactory");
    }
}
