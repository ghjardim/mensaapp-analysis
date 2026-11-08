package p252i4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* renamed from: i4.a */
/* loaded from: classes.dex */
public final class C4544a extends AbstractC4087y implements InterfaceC4035W {
    private static final C4544a DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = StringUtils.EMPTY;
    private AbstractC4015C.e fields_ = AbstractC4087y.m17021A();

    /* renamed from: i4.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16196a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f16196a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16196a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16196a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16196a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16196a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16196a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16196a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: i4.a$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m19289w(c.b bVar) {
            m17062q();
            ((C4544a) this.f13597b).m19285c0((c) bVar.m17059n());
            return this;
        }

        /* renamed from: x */
        public b m19290x(d dVar) {
            m17062q();
            ((C4544a) this.f13597b).m19288h0(dVar);
            return this;
        }

        public b() {
            super(C4544a.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: i4.a$c */
    public static final class c extends AbstractC4087y implements InterfaceC4035W {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile InterfaceC4050f0 PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = StringUtils.EMPTY;

        /* renamed from: i4.a$c$a */
        public enum a implements AbstractC4015C.a {
            ARRAY_CONFIG_UNSPECIFIED(0),
            CONTAINS(1),
            UNRECOGNIZED(-1);


            /* renamed from: e */
            public static final AbstractC4015C.b f16200e = new C7223a();

            /* renamed from: a */
            public final int f16202a;

            /* renamed from: i4.a$c$a$a, reason: collision with other inner class name */
            public class C7223a implements AbstractC4015C.b {
            }

            a(int i7) {
                this.f16202a = i7;
            }

            @Override // com.google.protobuf.AbstractC4015C.a
            /* renamed from: a */
            public final int mo16192a() {
                if (this != UNRECOGNIZED) {
                    return this.f16202a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* renamed from: i4.a$c$b */
        public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ b(a aVar) {
                this();
            }

            /* renamed from: w */
            public b m19303w(a aVar) {
                m17062q();
                ((c) this.f13597b).m19299h0(aVar);
                return this;
            }

            /* renamed from: x */
            public b m19304x(String str) {
                m17062q();
                ((c) this.f13597b).m19300i0(str);
                return this;
            }

            /* renamed from: y */
            public b m19305y(EnumC7224c enumC7224c) {
                m17062q();
                ((c) this.f13597b).m19301j0(enumC7224c);
                return this;
            }

            public b() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: i4.a$c$c, reason: collision with other inner class name */
        public enum EnumC7224c implements AbstractC4015C.a {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);


            /* renamed from: f */
            public static final AbstractC4015C.b f16207f = new a();

            /* renamed from: a */
            public final int f16209a;

            /* renamed from: i4.a$c$c$a */
            public class a implements AbstractC4015C.b {
            }

            EnumC7224c(int i7) {
                this.f16209a = i7;
            }

            /* renamed from: f */
            public static EnumC7224c m19307f(int i7) {
                if (i7 == 0) {
                    return ORDER_UNSPECIFIED;
                }
                if (i7 == 1) {
                    return ASCENDING;
                }
                if (i7 != 2) {
                    return null;
                }
                return DESCENDING;
            }

            @Override // com.google.protobuf.AbstractC4015C.a
            /* renamed from: a */
            public final int mo16192a() {
                if (this != UNRECOGNIZED) {
                    return this.f16209a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* renamed from: i4.a$c$d */
        public enum d {
            ORDER(2),
            ARRAY_CONFIG(3),
            VALUEMODE_NOT_SET(0);


            /* renamed from: a */
            public final int f16214a;

            d(int i7) {
                this.f16214a = i7;
            }

            /* renamed from: f */
            public static d m19309f(int i7) {
                if (i7 == 0) {
                    return VALUEMODE_NOT_SET;
                }
                if (i7 == 2) {
                    return ORDER;
                }
                if (i7 != 3) {
                    return null;
                }
                return ARRAY_CONFIG;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC4087y.m17033V(c.class, cVar);
        }

        /* renamed from: g0 */
        public static b m19295g0() {
            return (b) DEFAULT_INSTANCE.m17053u();
        }

        /* renamed from: d0 */
        public String m19296d0() {
            return this.fieldPath_;
        }

        /* renamed from: e0 */
        public EnumC7224c m19297e0() {
            if (this.valueModeCase_ != 2) {
                return EnumC7224c.ORDER_UNSPECIFIED;
            }
            EnumC7224c m19307f = EnumC7224c.m19307f(((Integer) this.valueMode_).intValue());
            return m19307f == null ? EnumC7224c.UNRECOGNIZED : m19307f;
        }

        /* renamed from: f0 */
        public d m19298f0() {
            return d.m19309f(this.valueModeCase_);
        }

        /* renamed from: h0 */
        public final void m19299h0(a aVar) {
            this.valueMode_ = Integer.valueOf(aVar.mo16192a());
            this.valueModeCase_ = 3;
        }

        /* renamed from: i0 */
        public final void m19300i0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* renamed from: j0 */
        public final void m19301j0(EnumC7224c enumC7224c) {
            this.valueMode_ = Integer.valueOf(enumC7224c.mo16192a());
            this.valueModeCase_ = 2;
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f16196a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new b(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
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

    /* renamed from: i4.a$d */
    public enum d implements AbstractC4015C.a {
        QUERY_SCOPE_UNSPECIFIED(0),
        COLLECTION(1),
        COLLECTION_GROUP(2),
        UNRECOGNIZED(-1);


        /* renamed from: f */
        public static final AbstractC4015C.b f16219f = new a();

        /* renamed from: a */
        public final int f16221a;

        /* renamed from: i4.a$d$a */
        public class a implements AbstractC4015C.b {
        }

        d(int i7) {
            this.f16221a = i7;
        }

        @Override // com.google.protobuf.AbstractC4015C.a
        /* renamed from: a */
        public final int mo16192a() {
            if (this != UNRECOGNIZED) {
                return this.f16221a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C4544a c4544a = new C4544a();
        DEFAULT_INSTANCE = c4544a;
        AbstractC4087y.m17033V(C4544a.class, c4544a);
    }

    /* renamed from: f0 */
    public static b m19283f0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: g0 */
    public static C4544a m19284g0(byte[] bArr) {
        return (C4544a) AbstractC4087y.m17029R(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: c0 */
    public final void m19285c0(c cVar) {
        cVar.getClass();
        m19286d0();
        this.fields_.add(cVar);
    }

    /* renamed from: d0 */
    public final void m19286d0() {
        AbstractC4015C.e eVar = this.fields_;
        if (eVar.mo16195j()) {
            return;
        }
        this.fields_ = AbstractC4087y.m17025L(eVar);
    }

    /* renamed from: e0 */
    public List m19287e0() {
        return this.fields_;
    }

    /* renamed from: h0 */
    public final void m19288h0(d dVar) {
        this.queryScope_ = dVar.mo16192a();
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f16196a[dVar.ordinal()]) {
            case 1:
                return new C4544a();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", c.class, "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C4544a.class) {
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
