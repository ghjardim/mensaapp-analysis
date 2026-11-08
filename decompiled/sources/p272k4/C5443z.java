package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4039a;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4089z;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p272k4.C5427j;

/* renamed from: k4.z */
/* loaded from: classes.dex */
public final class C5443z extends AbstractC4087y implements InterfaceC4035W {
    private static final C5443z DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private C5427j endAt_;
    private C4089z limit_;
    private int offset_;
    private j select_;
    private C5427j startAt_;
    private h where_;
    private AbstractC4015C.e from_ = AbstractC4087y.m17021A();
    private AbstractC4015C.e orderBy_ = AbstractC4087y.m17021A();

    /* renamed from: k4.z$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19472a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19472a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19472a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19472a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19472a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19472a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19472a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19472a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.z$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m22834A(C5427j.b bVar) {
            m17062q();
            ((C5443z) this.f13597b).m22814A0((C5427j) bVar.m17059n());
            return this;
        }

        /* renamed from: B */
        public b m22835B(h hVar) {
            m17062q();
            ((C5443z) this.f13597b).m22815B0(hVar);
            return this;
        }

        /* renamed from: w */
        public b m22836w(c.a aVar) {
            m17062q();
            ((C5443z) this.f13597b).m22816g0((c) aVar.m17059n());
            return this;
        }

        /* renamed from: x */
        public b m22837x(i iVar) {
            m17062q();
            ((C5443z) this.f13597b).m22817h0(iVar);
            return this;
        }

        /* renamed from: y */
        public b m22838y(C5427j.b bVar) {
            m17062q();
            ((C5443z) this.f13597b).m22832y0((C5427j) bVar.m17059n());
            return this;
        }

        /* renamed from: z */
        public b m22839z(C4089z.b bVar) {
            m17062q();
            ((C5443z) this.f13597b).m22833z0((C4089z) bVar.m17059n());
            return this;
        }

        public b() {
            super(C5443z.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.z$c */
    public static final class c extends AbstractC4087y implements InterfaceC4035W {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final c DEFAULT_INSTANCE;
        private static volatile InterfaceC4050f0 PARSER;
        private boolean allDescendants_;
        private String collectionId_ = StringUtils.EMPTY;

        /* renamed from: k4.z$c$a */
        public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ a(a aVar) {
                this();
            }

            /* renamed from: w */
            public a m22848w(boolean z6) {
                m17062q();
                ((c) this.f13597b).m22846f0(z6);
                return this;
            }

            /* renamed from: x */
            public a m22849x(String str) {
                m17062q();
                ((c) this.f13597b).m22847g0(str);
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

        /* renamed from: e0 */
        public static a m22843e0() {
            return (a) DEFAULT_INSTANCE.m17053u();
        }

        /* renamed from: c0 */
        public boolean m22844c0() {
            return this.allDescendants_;
        }

        /* renamed from: d0 */
        public String m22845d0() {
            return this.collectionId_;
        }

        /* renamed from: f0 */
        public final void m22846f0(boolean z6) {
            this.allDescendants_ = z6;
        }

        /* renamed from: g0 */
        public final void m22847g0(String str) {
            str.getClass();
            this.collectionId_ = str;
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f19472a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
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

    /* renamed from: k4.z$d */
    public static final class d extends AbstractC4087y implements InterfaceC4035W {
        private static final d DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile InterfaceC4050f0 PARSER;
        private AbstractC4015C.e filters_ = AbstractC4087y.m17021A();
        private int op_;

        /* renamed from: k4.z$d$a */
        public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ a(a aVar) {
                this();
            }

            /* renamed from: w */
            public a m22860w(Iterable iterable) {
                m17062q();
                ((d) this.f13597b).m22855c0(iterable);
                return this;
            }

            /* renamed from: x */
            public a m22861x(b bVar) {
                m17062q();
                ((d) this.f13597b).m22859i0(bVar);
                return this;
            }

            public a() {
                super(d.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: k4.z$d$b */
        public enum b implements AbstractC4015C.a {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);


            /* renamed from: f */
            public static final AbstractC4015C.b f19477f = new a();

            /* renamed from: a */
            public final int f19479a;

            /* renamed from: k4.z$d$b$a */
            public class a implements AbstractC4015C.b {
            }

            b(int i7) {
                this.f19479a = i7;
            }

            /* renamed from: f */
            public static b m22863f(int i7) {
                if (i7 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i7 == 1) {
                    return AND;
                }
                if (i7 != 2) {
                    return null;
                }
                return OR;
            }

            @Override // com.google.protobuf.AbstractC4015C.a
            /* renamed from: a */
            public final int mo16192a() {
                if (this != UNRECOGNIZED) {
                    return this.f19479a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            AbstractC4087y.m17033V(d.class, dVar);
        }

        /* renamed from: e0 */
        public static d m22853e0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: h0 */
        public static a m22854h0() {
            return (a) DEFAULT_INSTANCE.m17053u();
        }

        /* renamed from: c0 */
        public final void m22855c0(Iterable iterable) {
            m22856d0();
            AbstractC4039a.m16412k(iterable, this.filters_);
        }

        /* renamed from: d0 */
        public final void m22856d0() {
            AbstractC4015C.e eVar = this.filters_;
            if (eVar.mo16195j()) {
                return;
            }
            this.filters_ = AbstractC4087y.m17025L(eVar);
        }

        /* renamed from: f0 */
        public List m22857f0() {
            return this.filters_;
        }

        /* renamed from: g0 */
        public b m22858g0() {
            b m22863f = b.m22863f(this.op_);
            return m22863f == null ? b.UNRECOGNIZED : m22863f;
        }

        /* renamed from: i0 */
        public final void m22859i0(b bVar) {
            this.op_ = bVar.mo16192a();
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f19472a[dVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", h.class});
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

    /* renamed from: k4.z$e */
    public enum e implements AbstractC4015C.a {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);


        /* renamed from: f */
        public static final AbstractC4015C.b f19484f = new a();

        /* renamed from: a */
        public final int f19486a;

        /* renamed from: k4.z$e$a */
        public class a implements AbstractC4015C.b {
        }

        e(int i7) {
            this.f19486a = i7;
        }

        /* renamed from: f */
        public static e m22865f(int i7) {
            if (i7 == 0) {
                return DIRECTION_UNSPECIFIED;
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
                return this.f19486a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: k4.z$f */
    public static final class f extends AbstractC4087y implements InterfaceC4035W {
        private static final f DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile InterfaceC4050f0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private g field_;
        private int op_;
        private C5413D value_;

        /* renamed from: k4.z$f$a */
        public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ a(a aVar) {
                this();
            }

            /* renamed from: w */
            public a m22878w(g gVar) {
                m17062q();
                ((f) this.f13597b).m22872i0(gVar);
                return this;
            }

            /* renamed from: x */
            public a m22879x(b bVar) {
                m17062q();
                ((f) this.f13597b).m22876j0(bVar);
                return this;
            }

            /* renamed from: y */
            public a m22880y(C5413D c5413d) {
                m17062q();
                ((f) this.f13597b).m22877k0(c5413d);
                return this;
            }

            public a() {
                super(f.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: k4.z$f$b */
        public enum b implements AbstractC4015C.a {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);


            /* renamed from: u */
            public static final AbstractC4015C.b f19499u = new a();

            /* renamed from: a */
            public final int f19501a;

            /* renamed from: k4.z$f$b$a */
            public class a implements AbstractC4015C.b {
            }

            b(int i7) {
                this.f19501a = i7;
            }

            /* renamed from: f */
            public static b m22882f(int i7) {
                switch (i7) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.AbstractC4015C.a
            /* renamed from: a */
            public final int mo16192a() {
                if (this != UNRECOGNIZED) {
                    return this.f19501a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            AbstractC4087y.m17033V(f.class, fVar);
        }

        /* renamed from: d0 */
        public static f m22870d0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: h0 */
        public static a m22871h0() {
            return (a) DEFAULT_INSTANCE.m17053u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i0 */
        public void m22872i0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
            this.bitField0_ |= 1;
        }

        /* renamed from: e0 */
        public g m22873e0() {
            g gVar = this.field_;
            return gVar == null ? g.m22885b0() : gVar;
        }

        /* renamed from: f0 */
        public b m22874f0() {
            b m22882f = b.m22882f(this.op_);
            return m22882f == null ? b.UNRECOGNIZED : m22882f;
        }

        /* renamed from: g0 */
        public C5413D m22875g0() {
            C5413D c5413d = this.value_;
            return c5413d == null ? C5413D.m22442o0() : c5413d;
        }

        /* renamed from: j0 */
        public final void m22876j0(b bVar) {
            this.op_ = bVar.mo16192a();
        }

        /* renamed from: k0 */
        public final void m22877k0(C5413D c5413d) {
            c5413d.getClass();
            this.value_ = c5413d;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f19472a[dVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC4050f0 interfaceC4050f0 = PARSER;
                    if (interfaceC4050f0 == null) {
                        synchronized (f.class) {
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

    /* renamed from: k4.z$g */
    public static final class g extends AbstractC4087y implements InterfaceC4035W {
        private static final g DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile InterfaceC4050f0 PARSER;
        private String fieldPath_ = StringUtils.EMPTY;

        /* renamed from: k4.z$g$a */
        public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ a(a aVar) {
                this();
            }

            /* renamed from: w */
            public a m22889w(String str) {
                m17062q();
                ((g) this.f13597b).m22887e0(str);
                return this;
            }

            public a() {
                super(g.DEFAULT_INSTANCE);
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            AbstractC4087y.m17033V(g.class, gVar);
        }

        /* renamed from: b0 */
        public static g m22885b0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: d0 */
        public static a m22886d0() {
            return (a) DEFAULT_INSTANCE.m17053u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e0 */
        public void m22887e0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* renamed from: c0 */
        public String m22888c0() {
            return this.fieldPath_;
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f19472a[dVar.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC4050f0 interfaceC4050f0 = PARSER;
                    if (interfaceC4050f0 == null) {
                        synchronized (g.class) {
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

    /* renamed from: k4.z$h */
    public static final class h extends AbstractC4087y implements InterfaceC4035W {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final h DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile InterfaceC4050f0 PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        /* renamed from: k4.z$h$a */
        public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ a(a aVar) {
                this();
            }

            /* renamed from: w */
            public a m22903w(d.a aVar) {
                m17062q();
                ((h) this.f13597b).m22900j0((d) aVar.m17059n());
                return this;
            }

            /* renamed from: x */
            public a m22904x(f.a aVar) {
                m17062q();
                ((h) this.f13597b).m22901k0((f) aVar.m17059n());
                return this;
            }

            /* renamed from: y */
            public a m22905y(k.a aVar) {
                m17062q();
                ((h) this.f13597b).m22902l0((k) aVar.m17059n());
                return this;
            }

            public a() {
                super(h.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: k4.z$h$b */
        public enum b {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);


            /* renamed from: a */
            public final int f19507a;

            b(int i7) {
                this.f19507a = i7;
            }

            /* renamed from: f */
            public static b m22907f(int i7) {
                if (i7 == 0) {
                    return FILTERTYPE_NOT_SET;
                }
                if (i7 == 1) {
                    return COMPOSITE_FILTER;
                }
                if (i7 == 2) {
                    return FIELD_FILTER;
                }
                if (i7 != 3) {
                    return null;
                }
                return UNARY_FILTER;
            }
        }

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            AbstractC4087y.m17033V(h.class, hVar);
        }

        /* renamed from: e0 */
        public static h m22894e0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: i0 */
        public static a m22895i0() {
            return (a) DEFAULT_INSTANCE.m17053u();
        }

        /* renamed from: d0 */
        public d m22896d0() {
            return this.filterTypeCase_ == 1 ? (d) this.filterType_ : d.m22853e0();
        }

        /* renamed from: f0 */
        public f m22897f0() {
            return this.filterTypeCase_ == 2 ? (f) this.filterType_ : f.m22870d0();
        }

        /* renamed from: g0 */
        public b m22898g0() {
            return b.m22907f(this.filterTypeCase_);
        }

        /* renamed from: h0 */
        public k m22899h0() {
            return this.filterTypeCase_ == 3 ? (k) this.filterType_ : k.m22922c0();
        }

        /* renamed from: j0 */
        public final void m22900j0(d dVar) {
            dVar.getClass();
            this.filterType_ = dVar;
            this.filterTypeCase_ = 1;
        }

        /* renamed from: k0 */
        public final void m22901k0(f fVar) {
            fVar.getClass();
            this.filterType_ = fVar;
            this.filterTypeCase_ = 2;
        }

        /* renamed from: l0 */
        public final void m22902l0(k kVar) {
            kVar.getClass();
            this.filterType_ = kVar;
            this.filterTypeCase_ = 3;
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f19472a[dVar.ordinal()]) {
                case 1:
                    return new h();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", d.class, f.class, k.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC4050f0 interfaceC4050f0 = PARSER;
                    if (interfaceC4050f0 == null) {
                        synchronized (h.class) {
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

    /* renamed from: k4.z$i */
    public static final class i extends AbstractC4087y implements InterfaceC4035W {
        private static final i DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile InterfaceC4050f0 PARSER;
        private int bitField0_;
        private int direction_;
        private g field_;

        /* renamed from: k4.z$i$a */
        public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ a(a aVar) {
                this();
            }

            /* renamed from: w */
            public a m22916w(e eVar) {
                m17062q();
                ((i) this.f13597b).m22915f0(eVar);
                return this;
            }

            /* renamed from: x */
            public a m22917x(g gVar) {
                m17062q();
                ((i) this.f13597b).m22912g0(gVar);
                return this;
            }

            public a() {
                super(i.DEFAULT_INSTANCE);
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            AbstractC4087y.m17033V(i.class, iVar);
        }

        /* renamed from: e0 */
        public static a m22911e0() {
            return (a) DEFAULT_INSTANCE.m17053u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g0 */
        public void m22912g0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
            this.bitField0_ |= 1;
        }

        /* renamed from: c0 */
        public e m22913c0() {
            e m22865f = e.m22865f(this.direction_);
            return m22865f == null ? e.UNRECOGNIZED : m22865f;
        }

        /* renamed from: d0 */
        public g m22914d0() {
            g gVar = this.field_;
            return gVar == null ? g.m22885b0() : gVar;
        }

        /* renamed from: f0 */
        public final void m22915f0(e eVar) {
            this.direction_ = eVar.mo16192a();
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f19472a[dVar.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC4050f0 interfaceC4050f0 = PARSER;
                    if (interfaceC4050f0 == null) {
                        synchronized (i.class) {
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

    /* renamed from: k4.z$j */
    public static final class j extends AbstractC4087y implements InterfaceC4035W {
        private static final j DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile InterfaceC4050f0 PARSER;
        private AbstractC4015C.e fields_ = AbstractC4087y.m17021A();

        /* renamed from: k4.z$j$a */
        public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a() {
                super(j.DEFAULT_INSTANCE);
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            AbstractC4087y.m17033V(j.class, jVar);
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f19472a[dVar.ordinal()]) {
                case 1:
                    return new j();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC4050f0 interfaceC4050f0 = PARSER;
                    if (interfaceC4050f0 == null) {
                        synchronized (j.class) {
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

    /* renamed from: k4.z$k */
    public static final class k extends AbstractC4087y implements InterfaceC4035W {
        private static final k DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile InterfaceC4050f0 PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        /* renamed from: k4.z$k$a */
        public static final class a extends AbstractC4087y.a implements InterfaceC4035W {
            public /* synthetic */ a(a aVar) {
                this();
            }

            /* renamed from: w */
            public a m22928w(g gVar) {
                m17062q();
                ((k) this.f13597b).m22924g0(gVar);
                return this;
            }

            /* renamed from: x */
            public a m22929x(b bVar) {
                m17062q();
                ((k) this.f13597b).m22927h0(bVar);
                return this;
            }

            public a() {
                super(k.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: k4.z$k$b */
        public enum b implements AbstractC4015C.a {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);


            /* renamed from: o */
            public static final AbstractC4015C.b f19514o = new a();

            /* renamed from: a */
            public final int f19516a;

            /* renamed from: k4.z$k$b$a */
            public class a implements AbstractC4015C.b {
            }

            b(int i7) {
                this.f19516a = i7;
            }

            /* renamed from: f */
            public static b m22931f(int i7) {
                if (i7 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i7 == 2) {
                    return IS_NAN;
                }
                if (i7 == 3) {
                    return IS_NULL;
                }
                if (i7 == 4) {
                    return IS_NOT_NAN;
                }
                if (i7 != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }

            @Override // com.google.protobuf.AbstractC4015C.a
            /* renamed from: a */
            public final int mo16192a() {
                if (this != UNRECOGNIZED) {
                    return this.f19516a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            k kVar = new k();
            DEFAULT_INSTANCE = kVar;
            AbstractC4087y.m17033V(k.class, kVar);
        }

        /* renamed from: c0 */
        public static k m22922c0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: f0 */
        public static a m22923f0() {
            return (a) DEFAULT_INSTANCE.m17053u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g0 */
        public void m22924g0(g gVar) {
            gVar.getClass();
            this.operandType_ = gVar;
            this.operandTypeCase_ = 2;
        }

        /* renamed from: d0 */
        public g m22925d0() {
            return this.operandTypeCase_ == 2 ? (g) this.operandType_ : g.m22885b0();
        }

        /* renamed from: e0 */
        public b m22926e0() {
            b m22931f = b.m22931f(this.op_);
            return m22931f == null ? b.UNRECOGNIZED : m22931f;
        }

        /* renamed from: h0 */
        public final void m22927h0(b bVar) {
            this.op_ = bVar.mo16192a();
        }

        @Override // com.google.protobuf.AbstractC4087y
        /* renamed from: y */
        public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f19472a[dVar.ordinal()]) {
                case 1:
                    return new k();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC4050f0 interfaceC4050f0 = PARSER;
                    if (interfaceC4050f0 == null) {
                        synchronized (k.class) {
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
        C5443z c5443z = new C5443z();
        DEFAULT_INSTANCE = c5443z;
        AbstractC4087y.m17033V(C5443z.class, c5443z);
    }

    /* renamed from: k0 */
    public static C5443z m22812k0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: x0 */
    public static b m22813x0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: A0 */
    public final void m22814A0(C5427j c5427j) {
        c5427j.getClass();
        this.startAt_ = c5427j;
        this.bitField0_ |= 4;
    }

    /* renamed from: B0 */
    public final void m22815B0(h hVar) {
        hVar.getClass();
        this.where_ = hVar;
        this.bitField0_ |= 2;
    }

    /* renamed from: g0 */
    public final void m22816g0(c cVar) {
        cVar.getClass();
        m22818i0();
        this.from_.add(cVar);
    }

    /* renamed from: h0 */
    public final void m22817h0(i iVar) {
        iVar.getClass();
        m22819j0();
        this.orderBy_.add(iVar);
    }

    /* renamed from: i0 */
    public final void m22818i0() {
        AbstractC4015C.e eVar = this.from_;
        if (eVar.mo16195j()) {
            return;
        }
        this.from_ = AbstractC4087y.m17025L(eVar);
    }

    /* renamed from: j0 */
    public final void m22819j0() {
        AbstractC4015C.e eVar = this.orderBy_;
        if (eVar.mo16195j()) {
            return;
        }
        this.orderBy_ = AbstractC4087y.m17025L(eVar);
    }

    /* renamed from: l0 */
    public C5427j m22820l0() {
        C5427j c5427j = this.endAt_;
        return c5427j == null ? C5427j.m22611f0() : c5427j;
    }

    /* renamed from: m0 */
    public c m22821m0(int i7) {
        return (c) this.from_.get(i7);
    }

    /* renamed from: n0 */
    public int m22822n0() {
        return this.from_.size();
    }

    /* renamed from: o0 */
    public C4089z m22823o0() {
        C4089z c4089z = this.limit_;
        return c4089z == null ? C4089z.m17076b0() : c4089z;
    }

    /* renamed from: p0 */
    public i m22824p0(int i7) {
        return (i) this.orderBy_.get(i7);
    }

    /* renamed from: q0 */
    public int m22825q0() {
        return this.orderBy_.size();
    }

    /* renamed from: r0 */
    public C5427j m22826r0() {
        C5427j c5427j = this.startAt_;
        return c5427j == null ? C5427j.m22611f0() : c5427j;
    }

    /* renamed from: s0 */
    public h m22827s0() {
        h hVar = this.where_;
        return hVar == null ? h.m22894e0() : hVar;
    }

    /* renamed from: t0 */
    public boolean m22828t0() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: u0 */
    public boolean m22829u0() {
        return (this.bitField0_ & 16) != 0;
    }

    /* renamed from: v0 */
    public boolean m22830v0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: w0 */
    public boolean m22831w0() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19472a[dVar.ordinal()]) {
            case 1:
                return new C5443z();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", c.class, "where_", "orderBy_", i.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5443z.class) {
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

    /* renamed from: y0 */
    public final void m22832y0(C5427j c5427j) {
        c5427j.getClass();
        this.endAt_ = c5427j;
        this.bitField0_ |= 8;
    }

    /* renamed from: z0 */
    public final void m22833z0(C4089z c4089z) {
        c4089z.getClass();
        this.limit_ = c4089z;
        this.bitField0_ |= 16;
    }
}
