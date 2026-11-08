package com.google.protobuf;

import com.google.protobuf.AbstractC4087y;

/* renamed from: com.google.protobuf.t0 */
/* loaded from: classes.dex */
public final class C4078t0 extends AbstractC4087y implements InterfaceC4035W {
    private static final C4078t0 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: com.google.protobuf.t0$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13513a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f13513a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13513a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13513a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13513a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13513a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13513a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13513a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.google.protobuf.t0$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m16935w(int i7) {
            m17062q();
            ((C4078t0) this.f13597b).m16933g0(i7);
            return this;
        }

        /* renamed from: x */
        public b m16936x(long j7) {
            m17062q();
            ((C4078t0) this.f13597b).m16934h0(j7);
            return this;
        }

        public b() {
            super(C4078t0.DEFAULT_INSTANCE);
        }
    }

    static {
        C4078t0 c4078t0 = new C4078t0();
        DEFAULT_INSTANCE = c4078t0;
        AbstractC4087y.m17033V(C4078t0.class, c4078t0);
    }

    /* renamed from: c0 */
    public static C4078t0 m16929c0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: f0 */
    public static b m16930f0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: d0 */
    public int m16931d0() {
        return this.nanos_;
    }

    /* renamed from: e0 */
    public long m16932e0() {
        return this.seconds_;
    }

    /* renamed from: g0 */
    public final void m16933g0(int i7) {
        this.nanos_ = i7;
    }

    /* renamed from: h0 */
    public final void m16934h0(long j7) {
        this.seconds_ = j7;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f13513a[dVar.ordinal()]) {
            case 1:
                return new C4078t0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C4078t0.class) {
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
