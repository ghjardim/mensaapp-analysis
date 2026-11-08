package p102O3;

import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import p272k4.C5410A;

/* renamed from: O3.c */
/* loaded from: classes.dex */
public final class C1298c extends AbstractC4087y implements InterfaceC4035W {
    private static final C1298c DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private C4078t0 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private C4078t0 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private AbstractC4055i resumeToken_ = AbstractC4055i.f13379b;

    /* renamed from: O3.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4066a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f4066a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4066a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4066a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4066a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4066a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4066a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4066a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: O3.c$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m4988A(C5410A.d dVar) {
            m17062q();
            ((C1298c) this.f13597b).m4984w0(dVar);
            return this;
        }

        /* renamed from: B */
        public b m4989B(AbstractC4055i abstractC4055i) {
            m17062q();
            ((C1298c) this.f13597b).m4985x0(abstractC4055i);
            return this;
        }

        /* renamed from: C */
        public b m4990C(C4078t0 c4078t0) {
            m17062q();
            ((C1298c) this.f13597b).m4986y0(c4078t0);
            return this;
        }

        /* renamed from: D */
        public b m4991D(int i7) {
            m17062q();
            ((C1298c) this.f13597b).m4987z0(i7);
            return this;
        }

        /* renamed from: w */
        public b m4992w() {
            m17062q();
            ((C1298c) this.f13597b).m4972i0();
            return this;
        }

        /* renamed from: x */
        public b m4993x(C5410A.c cVar) {
            m17062q();
            ((C1298c) this.f13597b).m4981t0(cVar);
            return this;
        }

        /* renamed from: y */
        public b m4994y(C4078t0 c4078t0) {
            m17062q();
            ((C1298c) this.f13597b).m4982u0(c4078t0);
            return this;
        }

        /* renamed from: z */
        public b m4995z(long j7) {
            m17062q();
            ((C1298c) this.f13597b).m4983v0(j7);
            return this;
        }

        public b() {
            super(C1298c.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: O3.c$c */
    public enum c {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);


        /* renamed from: a */
        public final int f4071a;

        c(int i7) {
            this.f4071a = i7;
        }

        /* renamed from: f */
        public static c m4997f(int i7) {
            if (i7 == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i7 == 5) {
                return QUERY;
            }
            if (i7 != 6) {
                return null;
            }
            return DOCUMENTS;
        }
    }

    static {
        C1298c c1298c = new C1298c();
        DEFAULT_INSTANCE = c1298c;
        AbstractC4087y.m17033V(C1298c.class, c1298c);
    }

    /* renamed from: r0 */
    public static b m4970r0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: s0 */
    public static C1298c m4971s0(byte[] bArr) {
        return (C1298c) AbstractC4087y.m17029R(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: i0 */
    public final void m4972i0() {
        this.lastLimboFreeSnapshotVersion_ = null;
        this.bitField0_ &= -3;
    }

    /* renamed from: j0 */
    public C5410A.c m4973j0() {
        return this.targetTypeCase_ == 6 ? (C5410A.c) this.targetType_ : C5410A.c.m22401d0();
    }

    /* renamed from: k0 */
    public C4078t0 m4974k0() {
        C4078t0 c4078t0 = this.lastLimboFreeSnapshotVersion_;
        return c4078t0 == null ? C4078t0.m16929c0() : c4078t0;
    }

    /* renamed from: l0 */
    public long m4975l0() {
        return this.lastListenSequenceNumber_;
    }

    /* renamed from: m0 */
    public C5410A.d m4976m0() {
        return this.targetTypeCase_ == 5 ? (C5410A.d) this.targetType_ : C5410A.d.m22409c0();
    }

    /* renamed from: n0 */
    public AbstractC4055i m4977n0() {
        return this.resumeToken_;
    }

    /* renamed from: o0 */
    public C4078t0 m4978o0() {
        C4078t0 c4078t0 = this.snapshotVersion_;
        return c4078t0 == null ? C4078t0.m16929c0() : c4078t0;
    }

    /* renamed from: p0 */
    public int m4979p0() {
        return this.targetId_;
    }

    /* renamed from: q0 */
    public c m4980q0() {
        return c.m4997f(this.targetTypeCase_);
    }

    /* renamed from: t0 */
    public final void m4981t0(C5410A.c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 6;
    }

    /* renamed from: u0 */
    public final void m4982u0(C4078t0 c4078t0) {
        c4078t0.getClass();
        this.lastLimboFreeSnapshotVersion_ = c4078t0;
        this.bitField0_ |= 2;
    }

    /* renamed from: v0 */
    public final void m4983v0(long j7) {
        this.lastListenSequenceNumber_ = j7;
    }

    /* renamed from: w0 */
    public final void m4984w0(C5410A.d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 5;
    }

    /* renamed from: x0 */
    public final void m4985x0(AbstractC4055i abstractC4055i) {
        abstractC4055i.getClass();
        this.resumeToken_ = abstractC4055i;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f4066a[dVar.ordinal()]) {
            case 1:
                return new C1298c();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", C5410A.d.class, C5410A.c.class, "lastLimboFreeSnapshotVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C1298c.class) {
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
    public final void m4986y0(C4078t0 c4078t0) {
        c4078t0.getClass();
        this.snapshotVersion_ = c4078t0;
        this.bitField0_ |= 1;
    }

    /* renamed from: z0 */
    public final void m4987z0(int i7) {
        this.targetId_ = i7;
    }
}
