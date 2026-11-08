package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import java.util.List;
import p296n4.C5784a;

/* renamed from: k4.B */
/* loaded from: classes.dex */
public final class C5411B extends AbstractC4087y implements InterfaceC4035W {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final C5411B DEFAULT_INSTANCE;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private C5784a cause_;
    private C4078t0 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private AbstractC4015C.d targetIds_ = AbstractC4087y.m17035z();
    private AbstractC4055i resumeToken_ = AbstractC4055i.f13379b;

    /* renamed from: k4.B$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19369a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19369a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19369a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19369a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19369a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19369a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19369a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19369a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.B$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C5411B.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.B$c */
    public enum c implements AbstractC4015C.a {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);


        /* renamed from: o */
        public static final AbstractC4015C.b f19376o = new a();

        /* renamed from: a */
        public final int f19378a;

        /* renamed from: k4.B$c$a */
        public class a implements AbstractC4015C.b {
        }

        c(int i7) {
            this.f19378a = i7;
        }

        /* renamed from: f */
        public static c m22426f(int i7) {
            if (i7 == 0) {
                return NO_CHANGE;
            }
            if (i7 == 1) {
                return ADD;
            }
            if (i7 == 2) {
                return REMOVE;
            }
            if (i7 == 3) {
                return CURRENT;
            }
            if (i7 != 4) {
                return null;
            }
            return RESET;
        }

        @Override // com.google.protobuf.AbstractC4015C.a
        /* renamed from: a */
        public final int mo16192a() {
            if (this != UNRECOGNIZED) {
                return this.f19378a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C5411B c5411b = new C5411B();
        DEFAULT_INSTANCE = c5411b;
        AbstractC4087y.m17033V(C5411B.class, c5411b);
    }

    /* renamed from: b0 */
    public static C5411B m22418b0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: a0 */
    public C5784a m22419a0() {
        C5784a c5784a = this.cause_;
        return c5784a == null ? C5784a.m24440b0() : c5784a;
    }

    /* renamed from: c0 */
    public C4078t0 m22420c0() {
        C4078t0 c4078t0 = this.readTime_;
        return c4078t0 == null ? C4078t0.m16929c0() : c4078t0;
    }

    /* renamed from: d0 */
    public AbstractC4055i m22421d0() {
        return this.resumeToken_;
    }

    /* renamed from: e0 */
    public c m22422e0() {
        c m22426f = c.m22426f(this.targetChangeType_);
        return m22426f == null ? c.UNRECOGNIZED : m22426f;
    }

    /* renamed from: f0 */
    public int m22423f0() {
        return this.targetIds_.size();
    }

    /* renamed from: g0 */
    public List m22424g0() {
        return this.targetIds_;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19369a[dVar.ordinal()]) {
            case 1:
                return new C5411B();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5411B.class) {
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
