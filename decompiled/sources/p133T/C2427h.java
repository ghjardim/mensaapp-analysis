package p133T;

import androidx.datastore.preferences.protobuf.AbstractC3290f;
import androidx.datastore.preferences.protobuf.AbstractC3311t;
import androidx.datastore.preferences.protobuf.InterfaceC3265K;
import androidx.datastore.preferences.protobuf.InterfaceC3272S;
import org.apache.tika.utils.StringUtils;
import p133T.C2426g;

/* renamed from: T.h */
/* loaded from: classes.dex */
public final class C2427h extends AbstractC3311t implements InterfaceC3265K {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C2427h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC3272S PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    /* renamed from: T.h$a */
    public static final class a extends AbstractC3311t.a implements InterfaceC3265K {
        public /* synthetic */ a(AbstractC2424e abstractC2424e) {
            this();
        }

        /* renamed from: q */
        public a m8259q(boolean z6) {
            m12831l();
            ((C2427h) this.f10652b).m8251i0(z6);
            return this;
        }

        /* renamed from: r */
        public a m8260r(AbstractC3290f abstractC3290f) {
            m12831l();
            ((C2427h) this.f10652b).m8252j0(abstractC3290f);
            return this;
        }

        /* renamed from: s */
        public a m8261s(double d7) {
            m12831l();
            ((C2427h) this.f10652b).m8253k0(d7);
            return this;
        }

        /* renamed from: t */
        public a m8262t(float f7) {
            m12831l();
            ((C2427h) this.f10652b).m8254l0(f7);
            return this;
        }

        /* renamed from: u */
        public a m8263u(int i7) {
            m12831l();
            ((C2427h) this.f10652b).m8255m0(i7);
            return this;
        }

        /* renamed from: v */
        public a m8264v(long j7) {
            m12831l();
            ((C2427h) this.f10652b).m8256n0(j7);
            return this;
        }

        /* renamed from: w */
        public a m8265w(String str) {
            m12831l();
            ((C2427h) this.f10652b).m8257o0(str);
            return this;
        }

        /* renamed from: x */
        public a m8266x(C2426g.a aVar) {
            m12831l();
            ((C2427h) this.f10652b).m8258p0((C2426g) aVar.m12828i());
            return this;
        }

        public a() {
            super(C2427h.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: T.h$b */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* renamed from: a */
        public final int f7182a;

        b(int i7) {
            this.f7182a = i7;
        }

        /* renamed from: f */
        public static b m8268f(int i7) {
            switch (i7) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        C2427h c2427h = new C2427h();
        DEFAULT_INSTANCE = c2427h;
        AbstractC3311t.m12801L(C2427h.class, c2427h);
    }

    /* renamed from: Z */
    public static C2427h m8240Z() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: h0 */
    public static a m8241h0() {
        return (a) DEFAULT_INSTANCE.m12819p();
    }

    /* renamed from: X */
    public boolean m8242X() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* renamed from: Y */
    public AbstractC3290f m8243Y() {
        return this.valueCase_ == 8 ? (AbstractC3290f) this.value_ : AbstractC3290f.f10449b;
    }

    /* renamed from: a0 */
    public double m8244a0() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: b0 */
    public float m8245b0() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* renamed from: c0 */
    public int m8246c0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* renamed from: d0 */
    public long m8247d0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* renamed from: e0 */
    public String m8248e0() {
        return this.valueCase_ == 5 ? (String) this.value_ : StringUtils.EMPTY;
    }

    /* renamed from: f0 */
    public C2426g m8249f0() {
        return this.valueCase_ == 6 ? (C2426g) this.value_ : C2426g.m8225S();
    }

    /* renamed from: g0 */
    public b m8250g0() {
        return b.m8268f(this.valueCase_);
    }

    /* renamed from: i0 */
    public final void m8251i0(boolean z6) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z6);
    }

    /* renamed from: j0 */
    public final void m8252j0(AbstractC3290f abstractC3290f) {
        abstractC3290f.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC3290f;
    }

    /* renamed from: k0 */
    public final void m8253k0(double d7) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d7);
    }

    /* renamed from: l0 */
    public final void m8254l0(float f7) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f7);
    }

    /* renamed from: m0 */
    public final void m8255m0(int i7) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i7);
    }

    /* renamed from: n0 */
    public final void m8256n0(long j7) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j7);
    }

    /* renamed from: o0 */
    public final void m8257o0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* renamed from: p0 */
    public final void m8258p0(C2426g c2426g) {
        c2426g.getClass();
        this.value_ = c2426g;
        this.valueCase_ = 6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3311t
    /* renamed from: s */
    public final Object mo8221s(AbstractC3311t.d dVar, Object obj, Object obj2) {
        AbstractC2424e abstractC2424e = null;
        switch (AbstractC2424e.f7170a[dVar.ordinal()]) {
            case 1:
                return new C2427h();
            case 2:
                return new a(abstractC2424e);
            case 3:
                return AbstractC3311t.m12798H(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C2426g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3272S interfaceC3272S = PARSER;
                if (interfaceC3272S == null) {
                    synchronized (C2427h.class) {
                        try {
                            interfaceC3272S = PARSER;
                            if (interfaceC3272S == null) {
                                interfaceC3272S = new AbstractC3311t.b(DEFAULT_INSTANCE);
                                PARSER = interfaceC3272S;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC3272S;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
