package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;

/* renamed from: k4.n */
/* loaded from: classes.dex */
public final class C5431n extends AbstractC4087y implements InterfaceC4035W {
    private static final C5431n DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile InterfaceC4050f0 PARSER;
    private AbstractC4015C.e fieldPaths_ = AbstractC4087y.m17021A();

    /* renamed from: k4.n$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19426a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19426a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19426a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19426a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19426a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19426a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19426a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19426a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.n$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m22653w(String str) {
            m17062q();
            ((C5431n) this.f13597b).m22649b0(str);
            return this;
        }

        public b() {
            super(C5431n.DEFAULT_INSTANCE);
        }
    }

    static {
        C5431n c5431n = new C5431n();
        DEFAULT_INSTANCE = c5431n;
        AbstractC4087y.m17033V(C5431n.class, c5431n);
    }

    /* renamed from: d0 */
    public static C5431n m22647d0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: g0 */
    public static b m22648g0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: b0 */
    public final void m22649b0(String str) {
        str.getClass();
        m22650c0();
        this.fieldPaths_.add(str);
    }

    /* renamed from: c0 */
    public final void m22650c0() {
        AbstractC4015C.e eVar = this.fieldPaths_;
        if (eVar.mo16195j()) {
            return;
        }
        this.fieldPaths_ = AbstractC4087y.m17025L(eVar);
    }

    /* renamed from: e0 */
    public String m22651e0(int i7) {
        return (String) this.fieldPaths_.get(i7);
    }

    /* renamed from: f0 */
    public int m22652f0() {
        return this.fieldPaths_.size();
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19426a[dVar.ordinal()]) {
            case 1:
                return new C5431n();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5431n.class) {
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
