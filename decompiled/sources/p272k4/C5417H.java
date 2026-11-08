package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;

/* renamed from: k4.H */
/* loaded from: classes.dex */
public final class C5417H extends AbstractC4087y implements InterfaceC4035W {
    private static final C5417H DEFAULT_INSTANCE;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC4015C.e transformResults_ = AbstractC4087y.m17021A();
    private C4078t0 updateTime_;

    /* renamed from: k4.H$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19406a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19406a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19406a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19406a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19406a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19406a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19406a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19406a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.H$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C5417H.DEFAULT_INSTANCE);
        }
    }

    static {
        C5417H c5417h = new C5417H();
        DEFAULT_INSTANCE = c5417h;
        AbstractC4087y.m17033V(C5417H.class, c5417h);
    }

    /* renamed from: a0 */
    public C5413D m22539a0(int i7) {
        return (C5413D) this.transformResults_.get(i7);
    }

    /* renamed from: b0 */
    public int m22540b0() {
        return this.transformResults_.size();
    }

    /* renamed from: c0 */
    public C4078t0 m22541c0() {
        C4078t0 c4078t0 = this.updateTime_;
        return c4078t0 == null ? C4078t0.m16929c0() : c4078t0;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19406a[dVar.ordinal()]) {
            case 1:
                return new C5417H();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", C5413D.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5417H.class) {
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
