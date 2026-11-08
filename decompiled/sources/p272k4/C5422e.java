package p272k4;

import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import org.apache.tika.utils.StringUtils;

/* renamed from: k4.e */
/* loaded from: classes.dex */
public final class C5422e extends AbstractC4087y implements InterfaceC4035W {
    private static final C5422e DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private C4078t0 readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private AbstractC4055i transaction_ = AbstractC4055i.f13379b;

    /* renamed from: k4.e$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19411a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19411a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19411a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19411a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19411a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19411a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19411a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19411a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.e$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C5422e.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.e$c */
    public enum c {
        FOUND(1),
        MISSING(2),
        RESULT_NOT_SET(0);


        /* renamed from: a */
        public final int f19416a;

        c(int i7) {
            this.f19416a = i7;
        }

        /* renamed from: f */
        public static c m22581f(int i7) {
            if (i7 == 0) {
                return RESULT_NOT_SET;
            }
            if (i7 == 1) {
                return FOUND;
            }
            if (i7 != 2) {
                return null;
            }
            return MISSING;
        }
    }

    static {
        C5422e c5422e = new C5422e();
        DEFAULT_INSTANCE = c5422e;
        AbstractC4087y.m17033V(C5422e.class, c5422e);
    }

    /* renamed from: a0 */
    public static C5422e m22575a0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: b0 */
    public C5428k m22576b0() {
        return this.resultCase_ == 1 ? (C5428k) this.result_ : C5428k.m22622d0();
    }

    /* renamed from: c0 */
    public String m22577c0() {
        return this.resultCase_ == 2 ? (String) this.result_ : StringUtils.EMPTY;
    }

    /* renamed from: d0 */
    public C4078t0 m22578d0() {
        C4078t0 c4078t0 = this.readTime_;
        return c4078t0 == null ? C4078t0.m16929c0() : c4078t0;
    }

    /* renamed from: e0 */
    public c m22579e0() {
        return c.m22581f(this.resultCase_);
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19411a[dVar.ordinal()]) {
            case 1:
                return new C5422e();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", C5428k.class, "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5422e.class) {
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
