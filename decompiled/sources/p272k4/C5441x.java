package p272k4;

import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;

/* renamed from: k4.x */
/* loaded from: classes.dex */
public final class C5441x extends AbstractC4087y implements InterfaceC4035W {
    private static final C5441x DEFAULT_INSTANCE;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private C4078t0 readTime_;
    private C5418a result_;
    private AbstractC4055i transaction_ = AbstractC4055i.f13379b;

    /* renamed from: k4.x$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19470a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19470a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19470a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19470a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19470a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19470a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19470a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19470a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.x$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C5441x.DEFAULT_INSTANCE);
        }
    }

    static {
        C5441x c5441x = new C5441x();
        DEFAULT_INSTANCE = c5441x;
        AbstractC4087y.m17033V(C5441x.class, c5441x);
    }

    /* renamed from: a0 */
    public static C5441x m22768a0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: b0 */
    public C5418a m22769b0() {
        C5418a c5418a = this.result_;
        return c5418a == null ? C5418a.m22543b0() : c5418a;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19470a[dVar.ordinal()]) {
            case 1:
                return new C5441x();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001", new Object[]{"bitField0_", "result_", "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5441x.class) {
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
