package p272k4;

import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;

/* renamed from: k4.g */
/* loaded from: classes.dex */
public final class C5424g extends AbstractC4087y implements InterfaceC4035W {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final C5424g DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile InterfaceC4050f0 PARSER;
    private int bitField0_;
    private C5423f bits_;
    private int hashCount_;

    /* renamed from: k4.g$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19418a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19418a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19418a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19418a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19418a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19418a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19418a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19418a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.g$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C5424g.DEFAULT_INSTANCE);
        }
    }

    static {
        C5424g c5424g = new C5424g();
        DEFAULT_INSTANCE = c5424g;
        AbstractC4087y.m17033V(C5424g.class, c5424g);
    }

    /* renamed from: b0 */
    public static C5424g m22587b0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: a0 */
    public C5423f m22588a0() {
        C5423f c5423f = this.bits_;
        return c5423f == null ? C5423f.m22583b0() : c5423f;
    }

    /* renamed from: c0 */
    public int m22589c0() {
        return this.hashCount_;
    }

    /* renamed from: d0 */
    public boolean m22590d0() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19418a[dVar.ordinal()]) {
            case 1:
                return new C5424g();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5424g.class) {
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
