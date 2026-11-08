package p102O3;

import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import p272k4.C5428k;

/* renamed from: O3.a */
/* loaded from: classes.dex */
public final class C1296a extends AbstractC4087y implements InterfaceC4035W {
    private static final C1296a DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* renamed from: O3.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4058a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f4058a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4058a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4058a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4058a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4058a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4058a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4058a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: O3.a$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m4944w(C5428k c5428k) {
            m17062q();
            ((C1296a) this.f13597b).m4939l0(c5428k);
            return this;
        }

        /* renamed from: x */
        public b m4945x(boolean z6) {
            m17062q();
            ((C1296a) this.f13597b).m4940m0(z6);
            return this;
        }

        /* renamed from: y */
        public b m4946y(C1297b c1297b) {
            m17062q();
            ((C1296a) this.f13597b).m4941n0(c1297b);
            return this;
        }

        /* renamed from: z */
        public b m4947z(C1299d c1299d) {
            m17062q();
            ((C1296a) this.f13597b).m4942o0(c1299d);
            return this;
        }

        public b() {
            super(C1296a.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: O3.a$c */
    public enum c {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);


        /* renamed from: a */
        public final int f4064a;

        c(int i7) {
            this.f4064a = i7;
        }

        /* renamed from: f */
        public static c m4949f(int i7) {
            if (i7 == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i7 == 1) {
                return NO_DOCUMENT;
            }
            if (i7 == 2) {
                return DOCUMENT;
            }
            if (i7 != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }
    }

    static {
        C1296a c1296a = new C1296a();
        DEFAULT_INSTANCE = c1296a;
        AbstractC4087y.m17033V(C1296a.class, c1296a);
    }

    /* renamed from: j0 */
    public static b m4932j0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: k0 */
    public static C1296a m4933k0(byte[] bArr) {
        return (C1296a) AbstractC4087y.m17029R(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: e0 */
    public C5428k m4934e0() {
        return this.documentTypeCase_ == 2 ? (C5428k) this.documentType_ : C5428k.m22622d0();
    }

    /* renamed from: f0 */
    public c m4935f0() {
        return c.m4949f(this.documentTypeCase_);
    }

    /* renamed from: g0 */
    public boolean m4936g0() {
        return this.hasCommittedMutations_;
    }

    /* renamed from: h0 */
    public C1297b m4937h0() {
        return this.documentTypeCase_ == 1 ? (C1297b) this.documentType_ : C1297b.m4953c0();
    }

    /* renamed from: i0 */
    public C1299d m4938i0() {
        return this.documentTypeCase_ == 3 ? (C1299d) this.documentType_ : C1299d.m5001c0();
    }

    /* renamed from: l0 */
    public final void m4939l0(C5428k c5428k) {
        c5428k.getClass();
        this.documentType_ = c5428k;
        this.documentTypeCase_ = 2;
    }

    /* renamed from: m0 */
    public final void m4940m0(boolean z6) {
        this.hasCommittedMutations_ = z6;
    }

    /* renamed from: n0 */
    public final void m4941n0(C1297b c1297b) {
        c1297b.getClass();
        this.documentType_ = c1297b;
        this.documentTypeCase_ = 1;
    }

    /* renamed from: o0 */
    public final void m4942o0(C1299d c1299d) {
        c1299d.getClass();
        this.documentType_ = c1299d;
        this.documentTypeCase_ = 3;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f4058a[dVar.ordinal()]) {
            case 1:
                return new C1296a();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", C1297b.class, C5428k.class, C1299d.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C1296a.class) {
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
