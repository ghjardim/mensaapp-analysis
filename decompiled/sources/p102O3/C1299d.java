package p102O3;

import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import org.apache.tika.utils.StringUtils;

/* renamed from: O3.d */
/* loaded from: classes.dex */
public final class C1299d extends AbstractC4087y implements InterfaceC4035W {
    private static final C1299d DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = StringUtils.EMPTY;
    private C4078t0 version_;

    /* renamed from: O3.d$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4072a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f4072a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4072a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4072a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4072a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4072a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4072a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4072a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: O3.d$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m5007w(String str) {
            m17062q();
            ((C1299d) this.f13597b).m5003g0(str);
            return this;
        }

        /* renamed from: x */
        public b m5008x(C4078t0 c4078t0) {
            m17062q();
            ((C1299d) this.f13597b).m5006h0(c4078t0);
            return this;
        }

        public b() {
            super(C1299d.DEFAULT_INSTANCE);
        }
    }

    static {
        C1299d c1299d = new C1299d();
        DEFAULT_INSTANCE = c1299d;
        AbstractC4087y.m17033V(C1299d.class, c1299d);
    }

    /* renamed from: c0 */
    public static C1299d m5001c0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: f0 */
    public static b m5002f0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m5003g0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: d0 */
    public String m5004d0() {
        return this.name_;
    }

    /* renamed from: e0 */
    public C4078t0 m5005e0() {
        C4078t0 c4078t0 = this.version_;
        return c4078t0 == null ? C4078t0.m16929c0() : c4078t0;
    }

    /* renamed from: h0 */
    public final void m5006h0(C4078t0 c4078t0) {
        c4078t0.getClass();
        this.version_ = c4078t0;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f4072a[dVar.ordinal()]) {
            case 1:
                return new C1299d();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C1299d.class) {
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
