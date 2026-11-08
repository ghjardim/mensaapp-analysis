package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import org.apache.tika.utils.StringUtils;

/* renamed from: k4.d */
/* loaded from: classes.dex */
public final class C5421d extends AbstractC4087y implements InterfaceC4035W {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C5421d DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object consistencySelector_;
    private C5431n mask_;
    private int consistencySelectorCase_ = 0;
    private String database_ = StringUtils.EMPTY;
    private AbstractC4015C.e documents_ = AbstractC4087y.m17021A();

    /* renamed from: k4.d$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19410a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19410a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19410a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19410a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19410a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19410a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19410a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19410a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.d$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m22572w(String str) {
            m17062q();
            ((C5421d) this.f13597b).m22569c0(str);
            return this;
        }

        /* renamed from: x */
        public b m22573x(String str) {
            m17062q();
            ((C5421d) this.f13597b).m22571g0(str);
            return this;
        }

        public b() {
            super(C5421d.DEFAULT_INSTANCE);
        }
    }

    static {
        C5421d c5421d = new C5421d();
        DEFAULT_INSTANCE = c5421d;
        AbstractC4087y.m17033V(C5421d.class, c5421d);
    }

    /* renamed from: e0 */
    public static C5421d m22567e0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: f0 */
    public static b m22568f0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: c0 */
    public final void m22569c0(String str) {
        str.getClass();
        m22570d0();
        this.documents_.add(str);
    }

    /* renamed from: d0 */
    public final void m22570d0() {
        AbstractC4015C.e eVar = this.documents_;
        if (eVar.mo16195j()) {
            return;
        }
        this.documents_ = AbstractC4087y.m17025L(eVar);
    }

    /* renamed from: g0 */
    public final void m22571g0(String str) {
        str.getClass();
        this.database_ = str;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19410a[dVar.ordinal()]) {
            case 1:
                return new C5421d();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "database_", "documents_", "mask_", C5412C.class, C4078t0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5421d.class) {
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
