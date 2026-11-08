package p272k4;

import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import org.apache.tika.utils.StringUtils;

/* renamed from: k4.w */
/* loaded from: classes.dex */
public final class C5440w extends AbstractC4087y implements InterfaceC4035W {
    private static final C5440w DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int STRUCTURED_AGGREGATION_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private Object consistencySelector_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String parent_ = StringUtils.EMPTY;

    /* renamed from: k4.w$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19469a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19469a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19469a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19469a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19469a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19469a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19469a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19469a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.w$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m22765w(String str) {
            m17062q();
            ((C5440w) this.f13597b).m22763e0(str);
            return this;
        }

        /* renamed from: x */
        public b m22766x(C5442y c5442y) {
            m17062q();
            ((C5440w) this.f13597b).m22764f0(c5442y);
            return this;
        }

        public b() {
            super(C5440w.DEFAULT_INSTANCE);
        }
    }

    static {
        C5440w c5440w = new C5440w();
        DEFAULT_INSTANCE = c5440w;
        AbstractC4087y.m17033V(C5440w.class, c5440w);
    }

    /* renamed from: c0 */
    public static C5440w m22761c0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: d0 */
    public static b m22762d0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m22763e0(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* renamed from: f0 */
    public final void m22764f0(C5442y c5442y) {
        c5442y.getClass();
        this.queryType_ = c5442y;
        this.queryTypeCase_ = 2;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19469a[dVar.ordinal()]) {
            case 1:
                return new C5440w();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0004=\u0001\u0005<\u0001\u0006<\u0001", new Object[]{"queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", C5442y.class, C5412C.class, C4078t0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5440w.class) {
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
