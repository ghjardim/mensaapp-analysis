package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4039a;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4050f0;
import java.util.List;
import p256j$.util.DesugarCollections;

/* renamed from: k4.b */
/* loaded from: classes.dex */
public final class C5419b extends AbstractC4087y implements InterfaceC5420c {
    private static final C5419b DEFAULT_INSTANCE;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private AbstractC4015C.e values_ = AbstractC4087y.m17021A();

    /* renamed from: k4.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19409a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19409a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19409a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19409a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19409a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19409a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19409a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19409a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.b$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC5420c {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m22559A(int i7) {
            m17062q();
            ((C5419b) this.f13597b).m22558k0(i7);
            return this;
        }

        @Override // p272k4.InterfaceC5420c
        /* renamed from: g */
        public List mo22555g() {
            return DesugarCollections.unmodifiableList(((C5419b) this.f13597b).mo22555g());
        }

        /* renamed from: w */
        public b m22560w(Iterable iterable) {
            m17062q();
            ((C5419b) this.f13597b).m22552d0(iterable);
            return this;
        }

        /* renamed from: x */
        public b m22561x(C5413D c5413d) {
            m17062q();
            ((C5419b) this.f13597b).m22553e0(c5413d);
            return this;
        }

        /* renamed from: y */
        public C5413D m22562y(int i7) {
            return ((C5419b) this.f13597b).m22556h0(i7);
        }

        /* renamed from: z */
        public int m22563z() {
            return ((C5419b) this.f13597b).m22557i0();
        }

        public b() {
            super(C5419b.DEFAULT_INSTANCE);
        }
    }

    static {
        C5419b c5419b = new C5419b();
        DEFAULT_INSTANCE = c5419b;
        AbstractC4087y.m17033V(C5419b.class, c5419b);
    }

    /* renamed from: g0 */
    public static C5419b m22550g0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: j0 */
    public static b m22551j0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: d0 */
    public final void m22552d0(Iterable iterable) {
        m22554f0();
        AbstractC4039a.m16412k(iterable, this.values_);
    }

    /* renamed from: e0 */
    public final void m22553e0(C5413D c5413d) {
        c5413d.getClass();
        m22554f0();
        this.values_.add(c5413d);
    }

    /* renamed from: f0 */
    public final void m22554f0() {
        AbstractC4015C.e eVar = this.values_;
        if (eVar.mo16195j()) {
            return;
        }
        this.values_ = AbstractC4087y.m17025L(eVar);
    }

    @Override // p272k4.InterfaceC5420c
    /* renamed from: g */
    public List mo22555g() {
        return this.values_;
    }

    /* renamed from: h0 */
    public C5413D m22556h0(int i7) {
        return (C5413D) this.values_.get(i7);
    }

    /* renamed from: i0 */
    public int m22557i0() {
        return this.values_.size();
    }

    /* renamed from: k0 */
    public final void m22558k0(int i7) {
        m22554f0();
        this.values_.remove(i7);
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19409a[dVar.ordinal()]) {
            case 1:
                return new C5419b();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", C5413D.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5419b.class) {
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
