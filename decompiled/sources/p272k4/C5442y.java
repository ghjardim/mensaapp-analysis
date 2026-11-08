package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4039a;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4011A;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import org.apache.tika.utils.StringUtils;
import p272k4.C5443z;

/* renamed from: k4.y */
/* loaded from: classes.dex */
public final class C5442y extends AbstractC4087y implements InterfaceC4035W {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final C5442y DEFAULT_INSTANCE;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private AbstractC4015C.e aggregations_ = AbstractC4087y.m17021A();

    /* renamed from: k4.y$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19471a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19471a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19471a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19471a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19471a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19471a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19471a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19471a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.y$b */
    public static final class b extends AbstractC4087y implements InterfaceC4035W {
        public static final int ALIAS_FIELD_NUMBER = 7;
        public static final int AVG_FIELD_NUMBER = 3;
        public static final int COUNT_FIELD_NUMBER = 1;
        private static final b DEFAULT_INSTANCE;
        private static volatile InterfaceC4050f0 PARSER = null;
        public static final int SUM_FIELD_NUMBER = 2;
        private Object operator_;
        private int operatorCase_ = 0;
        private String alias_ = StringUtils.EMPTY;

        /* renamed from: k4.y$b$a */
        public static final class a extends AbstractC4087y implements InterfaceC4035W {
            private static final a DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile InterfaceC4050f0 PARSER;
            private int bitField0_;
            private C5443z.g field_;

            /* renamed from: k4.y$b$a$a, reason: collision with other inner class name */
            public static final class C7234a extends AbstractC4087y.a implements InterfaceC4035W {
                public /* synthetic */ C7234a(a aVar) {
                    this();
                }

                /* renamed from: w */
                public C7234a m22791w(C5443z.g gVar) {
                    m17062q();
                    ((a) this.f13597b).m22790c0(gVar);
                    return this;
                }

                public C7234a() {
                    super(a.DEFAULT_INSTANCE);
                }
            }

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                AbstractC4087y.m17033V(a.class, aVar);
            }

            /* renamed from: b0 */
            public static C7234a m22789b0() {
                return (C7234a) DEFAULT_INSTANCE.m17053u();
            }

            /* renamed from: c0 */
            public final void m22790c0(C5443z.g gVar) {
                gVar.getClass();
                this.field_ = gVar;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.AbstractC4087y
            /* renamed from: y */
            public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
                a aVar = null;
                switch (a.f19471a[dVar.ordinal()]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C7234a(aVar);
                    case 3:
                        return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        InterfaceC4050f0 interfaceC4050f0 = PARSER;
                        if (interfaceC4050f0 == null) {
                            synchronized (a.class) {
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

        /* renamed from: k4.y$b$b, reason: collision with other inner class name */
        public static final class C7235b extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ C7235b(a aVar) {
                this();
            }

            /* renamed from: w */
            public C7235b m22792w(String str) {
                m17062q();
                ((b) this.f13597b).m22783f0(str);
                return this;
            }

            /* renamed from: x */
            public C7235b m22793x(a aVar) {
                m17062q();
                ((b) this.f13597b).m22784g0(aVar);
                return this;
            }

            /* renamed from: y */
            public C7235b m22794y(c cVar) {
                m17062q();
                ((b) this.f13597b).m22785h0(cVar);
                return this;
            }

            /* renamed from: z */
            public C7235b m22795z(d dVar) {
                m17062q();
                ((b) this.f13597b).m22786i0(dVar);
                return this;
            }

            public C7235b() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: k4.y$b$c */
        public static final class c extends AbstractC4087y implements InterfaceC4035W {
            private static final c DEFAULT_INSTANCE;
            private static volatile InterfaceC4050f0 PARSER = null;
            public static final int UP_TO_FIELD_NUMBER = 1;
            private int bitField0_;
            private C4011A upTo_;

            /* renamed from: k4.y$b$c$a */
            public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
                public /* synthetic */ a(a aVar) {
                    this();
                }

                public a() {
                    super(c.DEFAULT_INSTANCE);
                }
            }

            static {
                c cVar = new c();
                DEFAULT_INSTANCE = cVar;
                AbstractC4087y.m17033V(c.class, cVar);
            }

            /* renamed from: a0 */
            public static c m22797a0() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC4087y
            /* renamed from: y */
            public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
                a aVar = null;
                switch (a.f19471a[dVar.ordinal()]) {
                    case 1:
                        return new c();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "upTo_"});
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

        /* renamed from: k4.y$b$d */
        public static final class d extends AbstractC4087y implements InterfaceC4035W {
            private static final d DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile InterfaceC4050f0 PARSER;
            private int bitField0_;
            private C5443z.g field_;

            /* renamed from: k4.y$b$d$a */
            public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
                public /* synthetic */ a(a aVar) {
                    this();
                }

                /* renamed from: w */
                public a m22802w(C5443z.g gVar) {
                    m17062q();
                    ((d) this.f13597b).m22801c0(gVar);
                    return this;
                }

                public a() {
                    super(d.DEFAULT_INSTANCE);
                }
            }

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                AbstractC4087y.m17033V(d.class, dVar);
            }

            /* renamed from: b0 */
            public static a m22800b0() {
                return (a) DEFAULT_INSTANCE.m17053u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c0 */
            public void m22801c0(C5443z.g gVar) {
                gVar.getClass();
                this.field_ = gVar;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.AbstractC4087y
            /* renamed from: y */
            public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
                a aVar = null;
                switch (a.f19471a[dVar.ordinal()]) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(aVar);
                    case 3:
                        return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        InterfaceC4050f0 interfaceC4050f0 = PARSER;
                        if (interfaceC4050f0 == null) {
                            synchronized (d.class) {
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
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            AbstractC4087y.m17033V(b.class, bVar);
        }

        /* renamed from: e0 */
        public static C7235b m22782e0() {
            return (C7235b) DEFAULT_INSTANCE.m17053u();
        }

        /* renamed from: f0 */
        public final void m22783f0(String str) {
            str.getClass();
            this.alias_ = str;
        }

        /* renamed from: g0 */
        public final void m22784g0(a aVar) {
            aVar.getClass();
            this.operator_ = aVar;
            this.operatorCase_ = 3;
        }

        /* renamed from: h0 */
        public final void m22785h0(c cVar) {
            cVar.getClass();
            this.operator_ = cVar;
            this.operatorCase_ = 1;
        }

        /* renamed from: i0 */
        public final void m22786i0(d dVar) {
            dVar.getClass();
            this.operator_ = dVar;
            this.operatorCase_ = 2;
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f19471a[dVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new C7235b(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", c.class, d.class, a.class, "alias_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC4050f0 interfaceC4050f0 = PARSER;
                    if (interfaceC4050f0 == null) {
                        synchronized (b.class) {
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

    /* renamed from: k4.y$c */
    public static final class c extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ c(a aVar) {
            this();
        }

        /* renamed from: w */
        public c m22803w(Iterable iterable) {
            m17062q();
            ((C5442y) this.f13597b).m22775c0(iterable);
            return this;
        }

        /* renamed from: x */
        public c m22804x(C5443z c5443z) {
            m17062q();
            ((C5442y) this.f13597b).m22774f0(c5443z);
            return this;
        }

        public c() {
            super(C5442y.DEFAULT_INSTANCE);
        }
    }

    static {
        C5442y c5442y = new C5442y();
        DEFAULT_INSTANCE = c5442y;
        AbstractC4087y.m17033V(C5442y.class, c5442y);
    }

    /* renamed from: e0 */
    public static c m22773e0() {
        return (c) DEFAULT_INSTANCE.m17053u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m22774f0(C5443z c5443z) {
        c5443z.getClass();
        this.queryType_ = c5443z;
        this.queryTypeCase_ = 1;
    }

    /* renamed from: c0 */
    public final void m22775c0(Iterable iterable) {
        m22776d0();
        AbstractC4039a.m16412k(iterable, this.aggregations_);
    }

    /* renamed from: d0 */
    public final void m22776d0() {
        AbstractC4015C.e eVar = this.aggregations_;
        if (eVar.mo16195j()) {
            return;
        }
        this.aggregations_ = AbstractC4087y.m17025L(eVar);
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19471a[dVar.ordinal()]) {
            case 1:
                return new C5442y();
            case 2:
                return new c(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", C5443z.class, "aggregations_", b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5442y.class) {
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
