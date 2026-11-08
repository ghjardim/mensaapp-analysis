package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* renamed from: k4.m */
/* loaded from: classes.dex */
public final class C5430m extends AbstractC4087y implements InterfaceC4035W {
    private static final C5430m DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    private int bitField0_;
    private C4078t0 readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = StringUtils.EMPTY;
    private AbstractC4015C.d removedTargetIds_ = AbstractC4087y.m17035z();

    /* renamed from: k4.m$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19425a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19425a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19425a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19425a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19425a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19425a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19425a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19425a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.m$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C5430m.DEFAULT_INSTANCE);
        }
    }

    static {
        C5430m c5430m = new C5430m();
        DEFAULT_INSTANCE = c5430m;
        AbstractC4087y.m17033V(C5430m.class, c5430m);
    }

    /* renamed from: a0 */
    public static C5430m m22641a0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: b0 */
    public String m22642b0() {
        return this.document_;
    }

    /* renamed from: c0 */
    public C4078t0 m22643c0() {
        C4078t0 c4078t0 = this.readTime_;
        return c4078t0 == null ? C4078t0.m16929c0() : c4078t0;
    }

    /* renamed from: d0 */
    public List m22644d0() {
        return this.removedTargetIds_;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19425a[dVar.ordinal()]) {
            case 1:
                return new C5430m();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001Ȉ\u0004ဉ\u0000\u0006'", new Object[]{"bitField0_", "document_", "readTime_", "removedTargetIds_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5430m.class) {
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
