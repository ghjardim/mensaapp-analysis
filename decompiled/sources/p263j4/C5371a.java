package p263j4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import org.apache.tika.utils.StringUtils;
import p272k4.C5443z;

/* renamed from: j4.a */
/* loaded from: classes.dex */
public final class C5371a extends AbstractC4087y implements InterfaceC4035W {
    private static final C5371a DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = StringUtils.EMPTY;

    /* renamed from: j4.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18994a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f18994a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18994a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18994a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18994a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18994a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18994a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18994a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: j4.a$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m22094w(c cVar) {
            m17062q();
            ((C5371a) this.f13597b).m22091i0(cVar);
            return this;
        }

        /* renamed from: x */
        public b m22095x(String str) {
            m17062q();
            ((C5371a) this.f13597b).m22092j0(str);
            return this;
        }

        /* renamed from: y */
        public b m22096y(C5443z c5443z) {
            m17062q();
            ((C5371a) this.f13597b).m22093k0(c5443z);
            return this;
        }

        public b() {
            super(C5371a.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: j4.a$c */
    public enum c implements AbstractC4015C.a {
        FIRST(0),
        LAST(1),
        UNRECOGNIZED(-1);


        /* renamed from: e */
        public static final AbstractC4015C.b f18998e = new a();

        /* renamed from: a */
        public final int f19000a;

        /* renamed from: j4.a$c$a */
        public class a implements AbstractC4015C.b {
        }

        c(int i7) {
            this.f19000a = i7;
        }

        /* renamed from: f */
        public static c m22098f(int i7) {
            if (i7 == 0) {
                return FIRST;
            }
            if (i7 != 1) {
                return null;
            }
            return LAST;
        }

        @Override // com.google.protobuf.AbstractC4015C.a
        /* renamed from: a */
        public final int mo16192a() {
            if (this != UNRECOGNIZED) {
                return this.f19000a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C5371a c5371a = new C5371a();
        DEFAULT_INSTANCE = c5371a;
        AbstractC4087y.m17033V(C5371a.class, c5371a);
    }

    /* renamed from: g0 */
    public static b m22086g0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: h0 */
    public static C5371a m22087h0(byte[] bArr) {
        return (C5371a) AbstractC4087y.m17029R(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: d0 */
    public c m22088d0() {
        c m22098f = c.m22098f(this.limitType_);
        return m22098f == null ? c.UNRECOGNIZED : m22098f;
    }

    /* renamed from: e0 */
    public String m22089e0() {
        return this.parent_;
    }

    /* renamed from: f0 */
    public C5443z m22090f0() {
        return this.queryTypeCase_ == 2 ? (C5443z) this.queryType_ : C5443z.m22812k0();
    }

    /* renamed from: i0 */
    public final void m22091i0(c cVar) {
        this.limitType_ = cVar.mo16192a();
    }

    /* renamed from: j0 */
    public final void m22092j0(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* renamed from: k0 */
    public final void m22093k0(C5443z c5443z) {
        c5443z.getClass();
        this.queryType_ = c5443z;
        this.queryTypeCase_ = 2;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f18994a[dVar.ordinal()]) {
            case 1:
                return new C5371a();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", C5443z.class, "limitType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5371a.class) {
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
