package p272k4;

import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;

/* renamed from: k4.t */
/* loaded from: classes.dex */
public final class C5437t extends AbstractC4087y implements InterfaceC4035W {
    private static final C5437t DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    /* renamed from: k4.t$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19452a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19452a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19452a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19452a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19452a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19452a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19452a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19452a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.t$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C5437t.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.t$c */
    public enum c {
        TARGET_CHANGE(2),
        DOCUMENT_CHANGE(3),
        DOCUMENT_DELETE(4),
        DOCUMENT_REMOVE(6),
        FILTER(5),
        RESPONSETYPE_NOT_SET(0);


        /* renamed from: a */
        public final int f19460a;

        c(int i7) {
            this.f19460a = i7;
        }

        /* renamed from: f */
        public static c m22728f(int i7) {
            if (i7 == 0) {
                return RESPONSETYPE_NOT_SET;
            }
            if (i7 == 2) {
                return TARGET_CHANGE;
            }
            if (i7 == 3) {
                return DOCUMENT_CHANGE;
            }
            if (i7 == 4) {
                return DOCUMENT_DELETE;
            }
            if (i7 == 5) {
                return FILTER;
            }
            if (i7 != 6) {
                return null;
            }
            return DOCUMENT_REMOVE;
        }
    }

    static {
        C5437t c5437t = new C5437t();
        DEFAULT_INSTANCE = c5437t;
        AbstractC4087y.m17033V(C5437t.class, c5437t);
    }

    /* renamed from: a0 */
    public static C5437t m22720a0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: b0 */
    public C5429l m22721b0() {
        return this.responseTypeCase_ == 3 ? (C5429l) this.responseType_ : C5429l.m22636a0();
    }

    /* renamed from: c0 */
    public C5430m m22722c0() {
        return this.responseTypeCase_ == 4 ? (C5430m) this.responseType_ : C5430m.m22641a0();
    }

    /* renamed from: d0 */
    public C5432o m22723d0() {
        return this.responseTypeCase_ == 6 ? (C5432o) this.responseType_ : C5432o.m22655a0();
    }

    /* renamed from: e0 */
    public C5434q m22724e0() {
        return this.responseTypeCase_ == 5 ? (C5434q) this.responseType_ : C5434q.m22689b0();
    }

    /* renamed from: f0 */
    public c m22725f0() {
        return c.m22728f(this.responseTypeCase_);
    }

    /* renamed from: g0 */
    public C5411B m22726g0() {
        return this.responseTypeCase_ == 2 ? (C5411B) this.responseType_ : C5411B.m22418b0();
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19452a[dVar.ordinal()]) {
            case 1:
                return new C5437t();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", C5411B.class, C5429l.class, C5430m.class, C5434q.class, C5432o.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5437t.class) {
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
