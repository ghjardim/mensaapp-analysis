package p304o4;

import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;

/* renamed from: o4.a */
/* loaded from: classes.dex */
public final class C5940a extends AbstractC4087y implements InterfaceC4035W {
    private static final C5940a DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile InterfaceC4050f0 PARSER;
    private double latitude_;
    private double longitude_;

    /* renamed from: o4.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21427a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f21427a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21427a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21427a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21427a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21427a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21427a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21427a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o4.a$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m24966w(double d7) {
            m17062q();
            ((C5940a) this.f13597b).m24964g0(d7);
            return this;
        }

        /* renamed from: x */
        public b m24967x(double d7) {
            m17062q();
            ((C5940a) this.f13597b).m24965h0(d7);
            return this;
        }

        public b() {
            super(C5940a.DEFAULT_INSTANCE);
        }
    }

    static {
        C5940a c5940a = new C5940a();
        DEFAULT_INSTANCE = c5940a;
        AbstractC4087y.m17033V(C5940a.class, c5940a);
    }

    /* renamed from: c0 */
    public static C5940a m24960c0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: f0 */
    public static b m24961f0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: d0 */
    public double m24962d0() {
        return this.latitude_;
    }

    /* renamed from: e0 */
    public double m24963e0() {
        return this.longitude_;
    }

    /* renamed from: g0 */
    public final void m24964g0(double d7) {
        this.latitude_ = d7;
    }

    /* renamed from: h0 */
    public final void m24965h0(double d7) {
        this.longitude_ = d7;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f21427a[dVar.ordinal()]) {
            case 1:
                return new C5940a();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5940a.class) {
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
