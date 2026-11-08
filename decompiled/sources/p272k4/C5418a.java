package p272k4;

import com.google.protobuf.AbstractC4014B0;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4027N;
import com.google.protobuf.C4028O;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p256j$.util.DesugarCollections;

/* renamed from: k4.a */
/* loaded from: classes.dex */
public final class C5418a extends AbstractC4087y implements InterfaceC4035W {
    public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
    private static final C5418a DEFAULT_INSTANCE;
    private static volatile InterfaceC4050f0 PARSER;
    private C4028O aggregateFields_ = C4028O.m16291d();

    /* renamed from: k4.a$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19407a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19407a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19407a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19407a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19407a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19407a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19407a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19407a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.a$b */
    public static final class b {

        /* renamed from: a */
        public static final C4027N f19408a = C4027N.m16284d(AbstractC4014B0.b.f13252r, StringUtils.EMPTY, AbstractC4014B0.b.f13254t, C5413D.m22442o0());
    }

    /* renamed from: k4.a$c */
    public static final class c extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ c(a aVar) {
            this();
        }

        public c() {
            super(C5418a.DEFAULT_INSTANCE);
        }
    }

    static {
        C5418a c5418a = new C5418a();
        DEFAULT_INSTANCE = c5418a;
        AbstractC4087y.m17033V(C5418a.class, c5418a);
    }

    /* renamed from: b0 */
    public static C5418a m22543b0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: a0 */
    public Map m22544a0() {
        return DesugarCollections.unmodifiableMap(m22545c0());
    }

    /* renamed from: c0 */
    public final C4028O m22545c0() {
        return this.aggregateFields_;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19407a[dVar.ordinal()]) {
            case 1:
                return new C5418a();
            case 2:
                return new c(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"aggregateFields_", b.f19408a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5418a.class) {
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
