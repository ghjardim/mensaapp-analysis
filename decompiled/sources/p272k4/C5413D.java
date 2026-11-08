package p272k4;

import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.EnumC4048e0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import org.apache.tika.utils.StringUtils;
import p272k4.C5419b;
import p272k4.C5438u;
import p304o4.C5940a;

/* renamed from: k4.D */
/* loaded from: classes.dex */
public final class C5413D extends AbstractC4087y implements InterfaceC4035W {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final C5413D DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    /* renamed from: k4.D$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19380a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19380a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19380a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19380a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19380a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19380a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19380a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19380a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.D$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m22466A(AbstractC4055i abstractC4055i) {
            m17062q();
            ((C5413D) this.f13597b).m22444A0(abstractC4055i);
            return this;
        }

        /* renamed from: B */
        public b m22467B(double d7) {
            m17062q();
            ((C5413D) this.f13597b).m22445B0(d7);
            return this;
        }

        /* renamed from: C */
        public b m22468C(C5940a.b bVar) {
            m17062q();
            ((C5413D) this.f13597b).m22446C0((C5940a) bVar.m17059n());
            return this;
        }

        /* renamed from: D */
        public b m22469D(long j7) {
            m17062q();
            ((C5413D) this.f13597b).m22447D0(j7);
            return this;
        }

        /* renamed from: E */
        public b m22470E(C5438u.b bVar) {
            m17062q();
            ((C5413D) this.f13597b).m22448E0((C5438u) bVar.m17059n());
            return this;
        }

        /* renamed from: F */
        public b m22471F(C5438u c5438u) {
            m17062q();
            ((C5413D) this.f13597b).m22448E0(c5438u);
            return this;
        }

        /* renamed from: G */
        public b m22472G(EnumC4048e0 enumC4048e0) {
            m17062q();
            ((C5413D) this.f13597b).m22449F0(enumC4048e0);
            return this;
        }

        /* renamed from: H */
        public b m22473H(String str) {
            m17062q();
            ((C5413D) this.f13597b).m22450G0(str);
            return this;
        }

        /* renamed from: I */
        public b m22474I(String str) {
            m17062q();
            ((C5413D) this.f13597b).m22451H0(str);
            return this;
        }

        /* renamed from: J */
        public b m22475J(C4078t0.b bVar) {
            m17062q();
            ((C5413D) this.f13597b).m22452I0((C4078t0) bVar.m17059n());
            return this;
        }

        /* renamed from: w */
        public C5438u m22476w() {
            return ((C5413D) this.f13597b).m22459s0();
        }

        /* renamed from: x */
        public b m22477x(C5419b.b bVar) {
            m17062q();
            ((C5413D) this.f13597b).m22464y0((C5419b) bVar.m17059n());
            return this;
        }

        /* renamed from: y */
        public b m22478y(C5419b c5419b) {
            m17062q();
            ((C5413D) this.f13597b).m22464y0(c5419b);
            return this;
        }

        /* renamed from: z */
        public b m22479z(boolean z6) {
            m17062q();
            ((C5413D) this.f13597b).m22465z0(z6);
            return this;
        }

        public b() {
            super(C5413D.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.D$c */
    public enum c {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        VALUETYPE_NOT_SET(0);


        /* renamed from: a */
        public final int f19394a;

        c(int i7) {
            this.f19394a = i7;
        }

        /* renamed from: f */
        public static c m22481f(int i7) {
            if (i7 == 0) {
                return VALUETYPE_NOT_SET;
            }
            if (i7 == 1) {
                return BOOLEAN_VALUE;
            }
            if (i7 == 2) {
                return INTEGER_VALUE;
            }
            if (i7 == 3) {
                return DOUBLE_VALUE;
            }
            if (i7 == 5) {
                return REFERENCE_VALUE;
            }
            if (i7 == 6) {
                return MAP_VALUE;
            }
            if (i7 == 17) {
                return STRING_VALUE;
            }
            if (i7 == 18) {
                return BYTES_VALUE;
            }
            switch (i7) {
                case 8:
                    return GEO_POINT_VALUE;
                case 9:
                    return ARRAY_VALUE;
                case 10:
                    return TIMESTAMP_VALUE;
                case 11:
                    return NULL_VALUE;
                default:
                    return null;
            }
        }
    }

    static {
        C5413D c5413d = new C5413D();
        DEFAULT_INSTANCE = c5413d;
        AbstractC4087y.m17033V(C5413D.class, c5413d);
    }

    /* renamed from: o0 */
    public static C5413D m22442o0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: x0 */
    public static b m22443x0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: A0 */
    public final void m22444A0(AbstractC4055i abstractC4055i) {
        abstractC4055i.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = abstractC4055i;
    }

    /* renamed from: B0 */
    public final void m22445B0(double d7) {
        this.valueTypeCase_ = 3;
        this.valueType_ = Double.valueOf(d7);
    }

    /* renamed from: C0 */
    public final void m22446C0(C5940a c5940a) {
        c5940a.getClass();
        this.valueType_ = c5940a;
        this.valueTypeCase_ = 8;
    }

    /* renamed from: D0 */
    public final void m22447D0(long j7) {
        this.valueTypeCase_ = 2;
        this.valueType_ = Long.valueOf(j7);
    }

    /* renamed from: E0 */
    public final void m22448E0(C5438u c5438u) {
        c5438u.getClass();
        this.valueType_ = c5438u;
        this.valueTypeCase_ = 6;
    }

    /* renamed from: F0 */
    public final void m22449F0(EnumC4048e0 enumC4048e0) {
        this.valueType_ = Integer.valueOf(enumC4048e0.mo16192a());
        this.valueTypeCase_ = 11;
    }

    /* renamed from: G0 */
    public final void m22450G0(String str) {
        str.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = str;
    }

    /* renamed from: H0 */
    public final void m22451H0(String str) {
        str.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = str;
    }

    /* renamed from: I0 */
    public final void m22452I0(C4078t0 c4078t0) {
        c4078t0.getClass();
        this.valueType_ = c4078t0;
        this.valueTypeCase_ = 10;
    }

    /* renamed from: l0 */
    public C5419b m22453l0() {
        return this.valueTypeCase_ == 9 ? (C5419b) this.valueType_ : C5419b.m22550g0();
    }

    /* renamed from: m0 */
    public boolean m22454m0() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    /* renamed from: n0 */
    public AbstractC4055i m22455n0() {
        return this.valueTypeCase_ == 18 ? (AbstractC4055i) this.valueType_ : AbstractC4055i.f13379b;
    }

    /* renamed from: p0 */
    public double m22456p0() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: q0 */
    public C5940a m22457q0() {
        return this.valueTypeCase_ == 8 ? (C5940a) this.valueType_ : C5940a.m24960c0();
    }

    /* renamed from: r0 */
    public long m22458r0() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    /* renamed from: s0 */
    public C5438u m22459s0() {
        return this.valueTypeCase_ == 6 ? (C5438u) this.valueType_ : C5438u.m22731b0();
    }

    /* renamed from: t0 */
    public String m22460t0() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : StringUtils.EMPTY;
    }

    /* renamed from: u0 */
    public String m22461u0() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : StringUtils.EMPTY;
    }

    /* renamed from: v0 */
    public C4078t0 m22462v0() {
        return this.valueTypeCase_ == 10 ? (C4078t0) this.valueType_ : C4078t0.m16929c0();
    }

    /* renamed from: w0 */
    public c m22463w0() {
        return c.m22481f(this.valueTypeCase_);
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19380a[dVar.ordinal()]) {
            case 1:
                return new C5413D();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", C5438u.class, C5940a.class, C5419b.class, C4078t0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5413D.class) {
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
    public final void m22464y0(C5419b c5419b) {
        c5419b.getClass();
        this.valueType_ = c5419b;
        this.valueTypeCase_ = 9;
    }

    /* renamed from: z0 */
    public final void m22465z0(boolean z6) {
        this.valueTypeCase_ = 1;
        this.valueType_ = Boolean.valueOf(z6);
    }
}
