package com.google.protobuf;

import com.google.protobuf.AbstractC4087y;

/* renamed from: com.google.protobuf.A */
/* loaded from: classes.dex */
public final class C4011A extends AbstractC4087y implements InterfaceC4035W {
    private static final C4011A DEFAULT_INSTANCE;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* renamed from: com.google.protobuf.A$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13233a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f13233a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13233a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13233a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13233a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13233a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13233a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13233a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.google.protobuf.A$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C4011A.DEFAULT_INSTANCE);
        }
    }

    static {
        C4011A c4011a = new C4011A();
        DEFAULT_INSTANCE = c4011a;
        AbstractC4087y.m17033V(C4011A.class, c4011a);
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f13233a[dVar.ordinal()]) {
            case 1:
                return new C4011A();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C4011A.class) {
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
