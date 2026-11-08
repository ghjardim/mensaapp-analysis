package p102O3;

import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import org.apache.tika.utils.StringUtils;

/* renamed from: O3.b */
/* loaded from: classes.dex */
public final class C1297b extends AbstractC4087y implements InterfaceC4035W {
    private static final C1297b DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = StringUtils.EMPTY;
    private C4078t0 readTime_;

    /* renamed from: O3.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4065a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f4065a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4065a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4065a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4065a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4065a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4065a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4065a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: O3.b$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m4959w(String str) {
            m17062q();
            ((C1297b) this.f13597b).m4957g0(str);
            return this;
        }

        /* renamed from: x */
        public b m4960x(C4078t0 c4078t0) {
            m17062q();
            ((C1297b) this.f13597b).m4958h0(c4078t0);
            return this;
        }

        public b() {
            super(C1297b.DEFAULT_INSTANCE);
        }
    }

    static {
        C1297b c1297b = new C1297b();
        DEFAULT_INSTANCE = c1297b;
        AbstractC4087y.m17033V(C1297b.class, c1297b);
    }

    /* renamed from: c0 */
    public static C1297b m4953c0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: f0 */
    public static b m4954f0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: d0 */
    public String m4955d0() {
        return this.name_;
    }

    /* renamed from: e0 */
    public C4078t0 m4956e0() {
        C4078t0 c4078t0 = this.readTime_;
        return c4078t0 == null ? C4078t0.m16929c0() : c4078t0;
    }

    /* renamed from: g0 */
    public final void m4957g0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: h0 */
    public final void m4958h0(C4078t0 c4078t0) {
        c4078t0.getClass();
        this.readTime_ = c4078t0;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f4065a[dVar.ordinal()]) {
            case 1:
                return new C1297b();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C1297b.class) {
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
