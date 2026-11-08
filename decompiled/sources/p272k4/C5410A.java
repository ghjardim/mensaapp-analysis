package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.C4089z;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import org.apache.tika.utils.StringUtils;
import p272k4.C5443z;

/* renamed from: k4.A */
/* loaded from: classes.dex */
public final class C5410A extends AbstractC4087y implements InterfaceC4035W {
    private static final C5410A DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private C4089z expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    /* renamed from: k4.A$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19368a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19368a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19368a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19368a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19368a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19368a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19368a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19368a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.A$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m22391A(AbstractC4055i abstractC4055i) {
            m17062q();
            ((C5410A) this.f13597b).m22388l0(abstractC4055i);
            return this;
        }

        /* renamed from: B */
        public b m22392B(int i7) {
            m17062q();
            ((C5410A) this.f13597b).m22389m0(i7);
            return this;
        }

        /* renamed from: w */
        public b m22393w(c cVar) {
            m17062q();
            ((C5410A) this.f13597b).m22385h0(cVar);
            return this;
        }

        /* renamed from: x */
        public b m22394x(C4089z.b bVar) {
            m17062q();
            ((C5410A) this.f13597b).m22390i0((C4089z) bVar.m17059n());
            return this;
        }

        /* renamed from: y */
        public b m22395y(d dVar) {
            m17062q();
            ((C5410A) this.f13597b).m22386j0(dVar);
            return this;
        }

        /* renamed from: z */
        public b m22396z(C4078t0 c4078t0) {
            m17062q();
            ((C5410A) this.f13597b).m22387k0(c4078t0);
            return this;
        }

        public b() {
            super(C5410A.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.A$c */
    public static final class c extends AbstractC4087y implements InterfaceC4035W {
        private static final c DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile InterfaceC4050f0 PARSER;
        private AbstractC4015C.e documents_ = AbstractC4087y.m17021A();

        /* renamed from: k4.A$c$a */
        public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ a(a aVar) {
                this();
            }

            /* renamed from: w */
            public a m22405w(String str) {
                m17062q();
                ((c) this.f13597b).m22399b0(str);
                return this;
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

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0 */
        public void m22399b0(String str) {
            str.getClass();
            m22400c0();
            this.documents_.add(str);
        }

        /* renamed from: c0 */
        private void m22400c0() {
            AbstractC4015C.e eVar = this.documents_;
            if (eVar.mo16195j()) {
                return;
            }
            this.documents_ = AbstractC4087y.m17025L(eVar);
        }

        /* renamed from: d0 */
        public static c m22401d0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: g0 */
        public static a m22402g0() {
            return (a) DEFAULT_INSTANCE.m17053u();
        }

        /* renamed from: e0 */
        public String m22403e0(int i7) {
            return (String) this.documents_.get(i7);
        }

        /* renamed from: f0 */
        public int m22404f0() {
            return this.documents_.size();
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f19368a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
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

    /* renamed from: k4.A$d */
    public static final class d extends AbstractC4087y implements InterfaceC4035W {
        private static final d DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile InterfaceC4050f0 PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = StringUtils.EMPTY;

        /* renamed from: k4.A$d$a */
        public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ a(a aVar) {
                this();
            }

            /* renamed from: w */
            public a m22415w(String str) {
                m17062q();
                ((d) this.f13597b).m22411g0(str);
                return this;
            }

            /* renamed from: x */
            public a m22416x(C5443z.b bVar) {
                m17062q();
                ((d) this.f13597b).m22412h0((C5443z) bVar.m17059n());
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

        /* renamed from: c0 */
        public static d m22409c0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: f0 */
        public static a m22410f0() {
            return (a) DEFAULT_INSTANCE.m17053u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g0 */
        public void m22411g0(String str) {
            str.getClass();
            this.parent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h0 */
        public void m22412h0(C5443z c5443z) {
            c5443z.getClass();
            this.queryType_ = c5443z;
            this.queryTypeCase_ = 2;
        }

        /* renamed from: d0 */
        public String m22413d0() {
            return this.parent_;
        }

        /* renamed from: e0 */
        public C5443z m22414e0() {
            return this.queryTypeCase_ == 2 ? (C5443z) this.queryType_ : C5443z.m22812k0();
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f19368a[dVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", C5443z.class});
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
        C5410A c5410a = new C5410A();
        DEFAULT_INSTANCE = c5410a;
        AbstractC4087y.m17033V(C5410A.class, c5410a);
    }

    /* renamed from: g0 */
    public static b m22384g0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m22385h0(c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public void m22386j0(d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public void m22387k0(C4078t0 c4078t0) {
        c4078t0.getClass();
        this.resumeType_ = c4078t0;
        this.resumeTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public void m22388l0(AbstractC4055i abstractC4055i) {
        abstractC4055i.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = abstractC4055i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public void m22389m0(int i7) {
        this.targetId_ = i7;
    }

    /* renamed from: i0 */
    public final void m22390i0(C4089z c4089z) {
        c4089z.getClass();
        this.expectedCount_ = c4089z;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19368a[dVar.ordinal()]) {
            case 1:
                return new C5410A();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", d.class, c.class, "targetId_", "once_", C4078t0.class, "expectedCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5410A.class) {
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
