package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p272k4.C5433p;

/* renamed from: k4.E */
/* loaded from: classes.dex */
public final class C5414E extends AbstractC4087y implements InterfaceC4035W {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final C5414E DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private C5439v currentDocument_;
    private Object operation_;
    private C5431n updateMask_;
    private int operationCase_ = 0;
    private AbstractC4015C.e updateTransforms_ = AbstractC4087y.m17021A();

    /* renamed from: k4.E$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19395a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19395a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19395a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19395a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19395a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19395a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19395a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19395a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.E$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m22511A(C5431n c5431n) {
            m17062q();
            ((C5414E) this.f13597b).m22492A0(c5431n);
            return this;
        }

        /* renamed from: B */
        public b m22512B(String str) {
            m17062q();
            ((C5414E) this.f13597b).m22493B0(str);
            return this;
        }

        /* renamed from: w */
        public b m22513w(C5433p.c cVar) {
            m17062q();
            ((C5414E) this.f13597b).m22494g0(cVar);
            return this;
        }

        /* renamed from: x */
        public b m22514x(C5439v c5439v) {
            m17062q();
            ((C5414E) this.f13597b).m22508x0(c5439v);
            return this;
        }

        /* renamed from: y */
        public b m22515y(String str) {
            m17062q();
            ((C5414E) this.f13597b).m22509y0(str);
            return this;
        }

        /* renamed from: z */
        public b m22516z(C5428k c5428k) {
            m17062q();
            ((C5414E) this.f13597b).m22510z0(c5428k);
            return this;
        }

        public b() {
            super(C5414E.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.E$c */
    public enum c {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);


        /* renamed from: a */
        public final int f19402a;

        c(int i7) {
            this.f19402a = i7;
        }

        /* renamed from: f */
        public static c m22518f(int i7) {
            if (i7 == 0) {
                return OPERATION_NOT_SET;
            }
            if (i7 == 1) {
                return UPDATE;
            }
            if (i7 == 2) {
                return DELETE;
            }
            if (i7 == 5) {
                return VERIFY;
            }
            if (i7 != 6) {
                return null;
            }
            return TRANSFORM;
        }
    }

    static {
        C5414E c5414e = new C5414E();
        DEFAULT_INSTANCE = c5414e;
        AbstractC4087y.m17033V(C5414E.class, c5414e);
    }

    /* renamed from: u0 */
    public static b m22489u0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: v0 */
    public static b m22490v0(C5414E c5414e) {
        return (b) DEFAULT_INSTANCE.m17054v(c5414e);
    }

    /* renamed from: w0 */
    public static C5414E m22491w0(byte[] bArr) {
        return (C5414E) AbstractC4087y.m17029R(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: A0 */
    public final void m22492A0(C5431n c5431n) {
        c5431n.getClass();
        this.updateMask_ = c5431n;
        this.bitField0_ |= 1;
    }

    /* renamed from: B0 */
    public final void m22493B0(String str) {
        str.getClass();
        this.operationCase_ = 5;
        this.operation_ = str;
    }

    /* renamed from: g0 */
    public final void m22494g0(C5433p.c cVar) {
        cVar.getClass();
        m22495h0();
        this.updateTransforms_.add(cVar);
    }

    /* renamed from: h0 */
    public final void m22495h0() {
        AbstractC4015C.e eVar = this.updateTransforms_;
        if (eVar.mo16195j()) {
            return;
        }
        this.updateTransforms_ = AbstractC4087y.m17025L(eVar);
    }

    /* renamed from: i0 */
    public C5439v m22496i0() {
        C5439v c5439v = this.currentDocument_;
        return c5439v == null ? C5439v.m22747d0() : c5439v;
    }

    /* renamed from: j0 */
    public String m22497j0() {
        return this.operationCase_ == 2 ? (String) this.operation_ : StringUtils.EMPTY;
    }

    /* renamed from: k0 */
    public c m22498k0() {
        return c.m22518f(this.operationCase_);
    }

    /* renamed from: l0 */
    public C5433p m22499l0() {
        return this.operationCase_ == 6 ? (C5433p) this.operation_ : C5433p.m22659a0();
    }

    /* renamed from: m0 */
    public C5428k m22500m0() {
        return this.operationCase_ == 1 ? (C5428k) this.operation_ : C5428k.m22622d0();
    }

    /* renamed from: n0 */
    public C5431n m22501n0() {
        C5431n c5431n = this.updateMask_;
        return c5431n == null ? C5431n.m22647d0() : c5431n;
    }

    /* renamed from: o0 */
    public List m22502o0() {
        return this.updateTransforms_;
    }

    /* renamed from: p0 */
    public String m22503p0() {
        return this.operationCase_ == 5 ? (String) this.operation_ : StringUtils.EMPTY;
    }

    /* renamed from: q0 */
    public boolean m22504q0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: r0 */
    public boolean m22505r0() {
        return this.operationCase_ == 6;
    }

    /* renamed from: s0 */
    public boolean m22506s0() {
        return this.operationCase_ == 1;
    }

    /* renamed from: t0 */
    public boolean m22507t0() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: x0 */
    public final void m22508x0(C5439v c5439v) {
        c5439v.getClass();
        this.currentDocument_ = c5439v;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19395a[dVar.ordinal()]) {
            case 1:
                return new C5414E();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", C5428k.class, "updateMask_", "currentDocument_", C5433p.class, "updateTransforms_", C5433p.c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5414E.class) {
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
    public final void m22509y0(String str) {
        str.getClass();
        this.operationCase_ = 2;
        this.operation_ = str;
    }

    /* renamed from: z0 */
    public final void m22510z0(C5428k c5428k) {
        c5428k.getClass();
        this.operation_ = c5428k;
        this.operationCase_ = 1;
    }
}
