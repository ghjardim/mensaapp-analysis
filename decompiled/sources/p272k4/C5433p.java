package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p272k4.C5419b;

/* renamed from: k4.p */
/* loaded from: classes.dex */
public final class C5433p extends AbstractC4087y implements InterfaceC4035W {
    private static final C5433p DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC4050f0 PARSER;
    private String document_ = StringUtils.EMPTY;
    private AbstractC4015C.e fieldTransforms_ = AbstractC4087y.m17021A();

    /* renamed from: k4.p$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19428a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19428a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19428a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19428a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19428a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19428a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19428a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19428a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.p$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C5433p.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.p$c */
    public static final class c extends AbstractC4087y implements InterfaceC4035W {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile InterfaceC4050f0 PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = StringUtils.EMPTY;

        /* renamed from: k4.p$c$a */
        public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ a(a aVar) {
                this();
            }

            /* renamed from: A */
            public a m22679A(b bVar) {
                m17062q();
                ((c) this.f13597b).m22678q0(bVar);
                return this;
            }

            /* renamed from: w */
            public a m22680w(C5419b.b bVar) {
                m17062q();
                ((c) this.f13597b).m22675m0((C5419b) bVar.m17059n());
                return this;
            }

            /* renamed from: x */
            public a m22681x(String str) {
                m17062q();
                ((c) this.f13597b).m22668n0(str);
                return this;
            }

            /* renamed from: y */
            public a m22682y(C5413D c5413d) {
                m17062q();
                ((c) this.f13597b).m22676o0(c5413d);
                return this;
            }

            /* renamed from: z */
            public a m22683z(C5419b.b bVar) {
                m17062q();
                ((c) this.f13597b).m22677p0((C5419b) bVar.m17059n());
                return this;
            }

            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: k4.p$c$b */
        public enum b implements AbstractC4015C.a {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);


            /* renamed from: e */
            public static final AbstractC4015C.b f19432e = new a();

            /* renamed from: a */
            public final int f19434a;

            /* renamed from: k4.p$c$b$a */
            public class a implements AbstractC4015C.b {
            }

            b(int i7) {
                this.f19434a = i7;
            }

            /* renamed from: f */
            public static b m22685f(int i7) {
                if (i7 == 0) {
                    return SERVER_VALUE_UNSPECIFIED;
                }
                if (i7 != 1) {
                    return null;
                }
                return REQUEST_TIME;
            }

            @Override // com.google.protobuf.AbstractC4015C.a
            /* renamed from: a */
            public final int mo16192a() {
                if (this != UNRECOGNIZED) {
                    return this.f19434a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* renamed from: k4.p$c$c, reason: collision with other inner class name */
        public enum EnumC7233c {
            SET_TO_SERVER_VALUE(2),
            INCREMENT(3),
            MAXIMUM(4),
            MINIMUM(5),
            APPEND_MISSING_ELEMENTS(6),
            REMOVE_ALL_FROM_ARRAY(7),
            TRANSFORMTYPE_NOT_SET(0);


            /* renamed from: a */
            public final int f19443a;

            EnumC7233c(int i7) {
                this.f19443a = i7;
            }

            /* renamed from: f */
            public static EnumC7233c m22687f(int i7) {
                if (i7 == 0) {
                    return TRANSFORMTYPE_NOT_SET;
                }
                switch (i7) {
                    case 2:
                        return SET_TO_SERVER_VALUE;
                    case 3:
                        return INCREMENT;
                    case 4:
                        return MAXIMUM;
                    case 5:
                        return MINIMUM;
                    case 6:
                        return APPEND_MISSING_ELEMENTS;
                    case 7:
                        return REMOVE_ALL_FROM_ARRAY;
                    default:
                        return null;
                }
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC4087y.m17033V(c.class, cVar);
        }

        /* renamed from: l0 */
        public static a m22667l0() {
            return (a) DEFAULT_INSTANCE.m17053u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n0 */
        public void m22668n0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* renamed from: f0 */
        public C5419b m22669f0() {
            return this.transformTypeCase_ == 6 ? (C5419b) this.transformType_ : C5419b.m22550g0();
        }

        /* renamed from: g0 */
        public String m22670g0() {
            return this.fieldPath_;
        }

        /* renamed from: h0 */
        public C5413D m22671h0() {
            return this.transformTypeCase_ == 3 ? (C5413D) this.transformType_ : C5413D.m22442o0();
        }

        /* renamed from: i0 */
        public C5419b m22672i0() {
            return this.transformTypeCase_ == 7 ? (C5419b) this.transformType_ : C5419b.m22550g0();
        }

        /* renamed from: j0 */
        public b m22673j0() {
            if (this.transformTypeCase_ != 2) {
                return b.SERVER_VALUE_UNSPECIFIED;
            }
            b m22685f = b.m22685f(((Integer) this.transformType_).intValue());
            return m22685f == null ? b.UNRECOGNIZED : m22685f;
        }

        /* renamed from: k0 */
        public EnumC7233c m22674k0() {
            return EnumC7233c.m22687f(this.transformTypeCase_);
        }

        /* renamed from: m0 */
        public final void m22675m0(C5419b c5419b) {
            c5419b.getClass();
            this.transformType_ = c5419b;
            this.transformTypeCase_ = 6;
        }

        /* renamed from: o0 */
        public final void m22676o0(C5413D c5413d) {
            c5413d.getClass();
            this.transformType_ = c5413d;
            this.transformTypeCase_ = 3;
        }

        /* renamed from: p0 */
        public final void m22677p0(C5419b c5419b) {
            c5419b.getClass();
            this.transformType_ = c5419b;
            this.transformTypeCase_ = 7;
        }

        /* renamed from: q0 */
        public final void m22678q0(b bVar) {
            this.transformType_ = Integer.valueOf(bVar.mo16192a());
            this.transformTypeCase_ = 2;
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f19428a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", C5413D.class, C5413D.class, C5413D.class, C5419b.class, C5419b.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC4050f0 interfaceC4050f0 = PARSER;
                    if (interfaceC4050f0 == null) {
                        synchronized (c.class) {
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

    static {
        C5433p c5433p = new C5433p();
        DEFAULT_INSTANCE = c5433p;
        AbstractC4087y.m17033V(C5433p.class, c5433p);
    }

    /* renamed from: a0 */
    public static C5433p m22659a0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: b0 */
    public List m22660b0() {
        return this.fieldTransforms_;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19428a[dVar.ordinal()]) {
            case 1:
                return new C5433p();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5433p.class) {
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
