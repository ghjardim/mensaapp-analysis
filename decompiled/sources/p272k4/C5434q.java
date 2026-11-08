package p272k4;

import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;

/* renamed from: k4.q */
/* loaded from: classes.dex */
public final class C5434q extends AbstractC4087y implements InterfaceC4035W {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final C5434q DEFAULT_INSTANCE;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    public static final int UNCHANGED_NAMES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int count_;
    private int targetId_;
    private C5424g unchangedNames_;

    /* renamed from: k4.q$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19444a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19444a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19444a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19444a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19444a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19444a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19444a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19444a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.q$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(C5434q.DEFAULT_INSTANCE);
        }
    }

    static {
        C5434q c5434q = new C5434q();
        DEFAULT_INSTANCE = c5434q;
        AbstractC4087y.m17033V(C5434q.class, c5434q);
    }

    /* renamed from: b0 */
    public static C5434q m22689b0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: a0 */
    public int m22690a0() {
        return this.count_;
    }

    /* renamed from: c0 */
    public int m22691c0() {
        return this.targetId_;
    }

    /* renamed from: d0 */
    public C5424g m22692d0() {
        C5424g c5424g = this.unchangedNames_;
        return c5424g == null ? C5424g.m22587b0() : c5424g;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19444a[dVar.ordinal()]) {
            case 1:
                return new C5434q();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "targetId_", "count_", "unchangedNames_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5434q.class) {
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
