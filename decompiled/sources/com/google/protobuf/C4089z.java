package com.google.protobuf;

import com.google.protobuf.AbstractC4087y;

/* renamed from: com.google.protobuf.z */
/* loaded from: classes.dex */
public final class C4089z extends AbstractC4087y implements InterfaceC4035W {
    private static final C4089z DEFAULT_INSTANCE;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* renamed from: com.google.protobuf.z$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13613a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f13613a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13613a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13613a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13613a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13613a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13613a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13613a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.google.protobuf.z$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m17080w(int i7) {
            m17062q();
            ((C4089z) this.f13597b).m17079e0(i7);
            return this;
        }

        public b() {
            super(C4089z.DEFAULT_INSTANCE);
        }
    }

    static {
        C4089z c4089z = new C4089z();
        DEFAULT_INSTANCE = c4089z;
        AbstractC4087y.m17033V(C4089z.class, c4089z);
    }

    /* renamed from: b0 */
    public static C4089z m17076b0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: d0 */
    public static b m17077d0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: c0 */
    public int m17078c0() {
        return this.value_;
    }

    /* renamed from: e0 */
    public final void m17079e0(int i7) {
        this.value_ = i7;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f13613a[dVar.ordinal()]) {
            case 1:
                return new C4089z();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C4089z.class) {
                        try {
                            interfaceC4050f0 = PARSER;
                            if (interfaceC4050f0 == null) {
                                interfaceC4050f0 = new AbstractC4087y.b(DEFAULT_INSTANCE);
                                PARSER = interfaceC4050f0;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC4050f0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
