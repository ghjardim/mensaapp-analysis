package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import org.apache.tika.utils.StringUtils;

/* renamed from: k4.G */
/* loaded from: classes.dex */
public final class C5416G extends AbstractC4087y implements InterfaceC4035W {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final C5416G DEFAULT_INSTANCE;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private C4078t0 commitTime_;
    private String streamId_ = StringUtils.EMPTY;
    private AbstractC4055i streamToken_ = AbstractC4055i.f13379b;
    private AbstractC4015C.e writeResults_ = AbstractC4087y.m17021A();

    /* renamed from: k4.G$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19405a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19405a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19405a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19405a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19405a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19405a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19405a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19405a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.G$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C5416G.DEFAULT_INSTANCE);
        }
    }

    static {
        C5416G c5416g = new C5416G();
        DEFAULT_INSTANCE = c5416g;
        AbstractC4087y.m17033V(C5416G.class, c5416g);
    }

    /* renamed from: b0 */
    public static C5416G m22533b0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: a0 */
    public C4078t0 m22534a0() {
        C4078t0 c4078t0 = this.commitTime_;
        return c4078t0 == null ? C4078t0.m16929c0() : c4078t0;
    }

    /* renamed from: c0 */
    public AbstractC4055i m22535c0() {
        return this.streamToken_;
    }

    /* renamed from: d0 */
    public C5417H m22536d0(int i7) {
        return (C5417H) this.writeResults_.get(i7);
    }

    /* renamed from: e0 */
    public int m22537e0() {
        return this.writeResults_.size();
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19405a[dVar.ordinal()]) {
            case 1:
                return new C5416G();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "streamId_", "streamToken_", "writeResults_", C5417H.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5416G.class) {
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
