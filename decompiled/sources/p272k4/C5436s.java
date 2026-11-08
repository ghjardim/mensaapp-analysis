package p272k4;

import com.google.protobuf.AbstractC4014B0;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4027N;
import com.google.protobuf.C4028O;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* renamed from: k4.s */
/* loaded from: classes.dex */
public final class C5436s extends AbstractC4087y implements InterfaceC4035W {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C5436s DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private C4028O labels_ = C4028O.m16291d();
    private String database_ = StringUtils.EMPTY;

    /* renamed from: k4.s$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19450a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19450a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19450a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19450a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19450a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19450a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19450a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19450a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.s$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m22715w(Map map) {
            m17062q();
            ((C5436s) this.f13597b).m22711f0().putAll(map);
            return this;
        }

        /* renamed from: x */
        public b m22716x(C5410A c5410a) {
            m17062q();
            ((C5436s) this.f13597b).m22713i0(c5410a);
            return this;
        }

        /* renamed from: y */
        public b m22717y(String str) {
            m17062q();
            ((C5436s) this.f13597b).m22710j0(str);
            return this;
        }

        /* renamed from: z */
        public b m22718z(int i7) {
            m17062q();
            ((C5436s) this.f13597b).m22714k0(i7);
            return this;
        }

        public b() {
            super(C5436s.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.s$c */
    public static final class c {

        /* renamed from: a */
        public static final C4027N f19451a;

        static {
            AbstractC4014B0.b bVar = AbstractC4014B0.b.f13252r;
            f19451a = C4027N.m16284d(bVar, StringUtils.EMPTY, bVar, StringUtils.EMPTY);
        }
    }

    static {
        C5436s c5436s = new C5436s();
        DEFAULT_INSTANCE = c5436s;
        AbstractC4087y.m17033V(C5436s.class, c5436s);
    }

    /* renamed from: e0 */
    public static C5436s m22708e0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: h0 */
    public static b m22709h0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public void m22710j0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* renamed from: f0 */
    public final Map m22711f0() {
        return m22712g0();
    }

    /* renamed from: g0 */
    public final C4028O m22712g0() {
        if (!this.labels_.m16295i()) {
            this.labels_ = this.labels_.m16298l();
        }
        return this.labels_;
    }

    /* renamed from: i0 */
    public final void m22713i0(C5410A c5410a) {
        c5410a.getClass();
        this.targetChange_ = c5410a;
        this.targetChangeCase_ = 2;
    }

    /* renamed from: k0 */
    public final void m22714k0(int i7) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = Integer.valueOf(i7);
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19450a[dVar.ordinal()]) {
            case 1:
                return new C5436s();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", C5410A.class, "labels_", c.f19451a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5436s.class) {
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
