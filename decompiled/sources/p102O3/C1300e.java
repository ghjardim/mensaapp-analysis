package p102O3;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import p272k4.C5414E;

/* renamed from: O3.e */
/* loaded from: classes.dex */
public final class C1300e extends AbstractC4087y implements InterfaceC4035W {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final C1300e DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private int bitField0_;
    private C4078t0 localWriteTime_;
    private AbstractC4015C.e writes_ = AbstractC4087y.m17021A();
    private AbstractC4015C.e baseWrites_ = AbstractC4087y.m17021A();

    /* renamed from: O3.e$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4073a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f4073a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4073a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4073a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4073a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4073a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4073a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4073a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: O3.e$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m5029w(C5414E c5414e) {
            m17062q();
            ((C1300e) this.f13597b).m5017e0(c5414e);
            return this;
        }

        /* renamed from: x */
        public b m5030x(C5414E c5414e) {
            m17062q();
            ((C1300e) this.f13597b).m5018f0(c5414e);
            return this;
        }

        /* renamed from: y */
        public b m5031y(int i7) {
            m17062q();
            ((C1300e) this.f13597b).m5027r0(i7);
            return this;
        }

        /* renamed from: z */
        public b m5032z(C4078t0 c4078t0) {
            m17062q();
            ((C1300e) this.f13597b).m5028s0(c4078t0);
            return this;
        }

        public b() {
            super(C1300e.DEFAULT_INSTANCE);
        }
    }

    static {
        C1300e c1300e = new C1300e();
        DEFAULT_INSTANCE = c1300e;
        AbstractC4087y.m17033V(C1300e.class, c1300e);
    }

    /* renamed from: o0 */
    public static b m5014o0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: p0 */
    public static C1300e m5015p0(AbstractC4055i abstractC4055i) {
        return (C1300e) AbstractC4087y.m17027P(DEFAULT_INSTANCE, abstractC4055i);
    }

    /* renamed from: q0 */
    public static C1300e m5016q0(byte[] bArr) {
        return (C1300e) AbstractC4087y.m17029R(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: e0 */
    public final void m5017e0(C5414E c5414e) {
        c5414e.getClass();
        m5019g0();
        this.baseWrites_.add(c5414e);
    }

    /* renamed from: f0 */
    public final void m5018f0(C5414E c5414e) {
        c5414e.getClass();
        m5020h0();
        this.writes_.add(c5414e);
    }

    /* renamed from: g0 */
    public final void m5019g0() {
        AbstractC4015C.e eVar = this.baseWrites_;
        if (eVar.mo16195j()) {
            return;
        }
        this.baseWrites_ = AbstractC4087y.m17025L(eVar);
    }

    /* renamed from: h0 */
    public final void m5020h0() {
        AbstractC4015C.e eVar = this.writes_;
        if (eVar.mo16195j()) {
            return;
        }
        this.writes_ = AbstractC4087y.m17025L(eVar);
    }

    /* renamed from: i0 */
    public C5414E m5021i0(int i7) {
        return (C5414E) this.baseWrites_.get(i7);
    }

    /* renamed from: j0 */
    public int m5022j0() {
        return this.baseWrites_.size();
    }

    /* renamed from: k0 */
    public int m5023k0() {
        return this.batchId_;
    }

    /* renamed from: l0 */
    public C4078t0 m5024l0() {
        C4078t0 c4078t0 = this.localWriteTime_;
        return c4078t0 == null ? C4078t0.m16929c0() : c4078t0;
    }

    /* renamed from: m0 */
    public C5414E m5025m0(int i7) {
        return (C5414E) this.writes_.get(i7);
    }

    /* renamed from: n0 */
    public int m5026n0() {
        return this.writes_.size();
    }

    /* renamed from: r0 */
    public final void m5027r0(int i7) {
        this.batchId_ = i7;
    }

    /* renamed from: s0 */
    public final void m5028s0(C4078t0 c4078t0) {
        c4078t0.getClass();
        this.localWriteTime_ = c4078t0;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f4073a[dVar.ordinal()]) {
            case 1:
                return new C1300e();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", C5414E.class, "localWriteTime_", "baseWrites_", C5414E.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C1300e.class) {
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
