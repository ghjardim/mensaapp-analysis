package p272k4;

import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;

/* renamed from: k4.v */
/* loaded from: classes.dex */
public final class C5439v extends AbstractC4087y implements InterfaceC4035W {
    private static final C5439v DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    /* renamed from: k4.v$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19463a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19463a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19463a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19463a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19463a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19463a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19463a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19463a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.v$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m22754w(boolean z6) {
            m17062q();
            ((C5439v) this.f13597b).m22753h0(z6);
            return this;
        }

        /* renamed from: x */
        public b m22755x(C4078t0 c4078t0) {
            m17062q();
            ((C5439v) this.f13597b).m22749i0(c4078t0);
            return this;
        }

        public b() {
            super(C5439v.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.v$c */
    public enum c {
        EXISTS(1),
        UPDATE_TIME(2),
        CONDITIONTYPE_NOT_SET(0);


        /* renamed from: a */
        public final int f19468a;

        c(int i7) {
            this.f19468a = i7;
        }

        /* renamed from: f */
        public static c m22757f(int i7) {
            if (i7 == 0) {
                return CONDITIONTYPE_NOT_SET;
            }
            if (i7 == 1) {
                return EXISTS;
            }
            if (i7 != 2) {
                return null;
            }
            return UPDATE_TIME;
        }
    }

    static {
        C5439v c5439v = new C5439v();
        DEFAULT_INSTANCE = c5439v;
        AbstractC4087y.m17033V(C5439v.class, c5439v);
    }

    /* renamed from: d0 */
    public static C5439v m22747d0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: g0 */
    public static b m22748g0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m22749i0(C4078t0 c4078t0) {
        c4078t0.getClass();
        this.conditionType_ = c4078t0;
        this.conditionTypeCase_ = 2;
    }

    /* renamed from: c0 */
    public c m22750c0() {
        return c.m22757f(this.conditionTypeCase_);
    }

    /* renamed from: e0 */
    public boolean m22751e0() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    /* renamed from: f0 */
    public C4078t0 m22752f0() {
        return this.conditionTypeCase_ == 2 ? (C4078t0) this.conditionType_ : C4078t0.m16929c0();
    }

    /* renamed from: h0 */
    public final void m22753h0(boolean z6) {
        this.conditionTypeCase_ = 1;
        this.conditionType_ = Boolean.valueOf(z6);
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19463a[dVar.ordinal()]) {
            case 1:
                return new C5439v();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", C4078t0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5439v.class) {
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
