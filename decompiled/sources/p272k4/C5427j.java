package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4039a;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import java.util.List;

/* renamed from: k4.j */
/* loaded from: classes.dex */
public final class C5427j extends AbstractC4087y implements InterfaceC4035W {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final C5427j DEFAULT_INSTANCE;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private AbstractC4015C.e values_ = AbstractC4087y.m17021A();

    /* renamed from: k4.j$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19421a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19421a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19421a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19421a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19421a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19421a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19421a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19421a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.j$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m22616w(Iterable iterable) {
            m17062q();
            ((C5427j) this.f13597b).m22609c0(iterable);
            return this;
        }

        /* renamed from: x */
        public b m22617x(boolean z6) {
            m17062q();
            ((C5427j) this.f13597b).m22615h0(z6);
            return this;
        }

        public b() {
            super(C5427j.DEFAULT_INSTANCE);
        }
    }

    static {
        C5427j c5427j = new C5427j();
        DEFAULT_INSTANCE = c5427j;
        AbstractC4087y.m17033V(C5427j.class, c5427j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m22609c0(Iterable iterable) {
        m22610d0();
        AbstractC4039a.m16412k(iterable, this.values_);
    }

    /* renamed from: d0 */
    private void m22610d0() {
        AbstractC4015C.e eVar = this.values_;
        if (eVar.mo16195j()) {
            return;
        }
        this.values_ = AbstractC4087y.m17025L(eVar);
    }

    /* renamed from: f0 */
    public static C5427j m22611f0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: g0 */
    public static b m22612g0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: e0 */
    public boolean m22613e0() {
        return this.before_;
    }

    /* renamed from: g */
    public List m22614g() {
        return this.values_;
    }

    /* renamed from: h0 */
    public final void m22615h0(boolean z6) {
        this.before_ = z6;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19421a[dVar.ordinal()]) {
            case 1:
                return new C5427j();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", C5413D.class, "before_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5427j.class) {
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
