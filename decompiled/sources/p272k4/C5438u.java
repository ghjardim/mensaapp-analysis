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

/* renamed from: k4.u */
/* loaded from: classes.dex */
public final class C5438u extends AbstractC4087y implements InterfaceC4035W {
    private static final C5438u DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile InterfaceC4050f0 PARSER;
    private C4028O fields_ = C4028O.m16291d();

    /* renamed from: k4.u$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19461a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19461a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19461a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19461a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19461a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19461a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19461a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19461a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.u$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public boolean m22740w(String str) {
            str.getClass();
            return ((C5438u) this.f13597b).m22737d0().containsKey(str);
        }

        /* renamed from: x */
        public b m22741x(Map map) {
            m17062q();
            ((C5438u) this.f13597b).m22732g0().putAll(map);
            return this;
        }

        /* renamed from: y */
        public b m22742y(String str, C5413D c5413d) {
            str.getClass();
            c5413d.getClass();
            m17062q();
            ((C5438u) this.f13597b).m22732g0().put(str, c5413d);
            return this;
        }

        /* renamed from: z */
        public b m22743z(String str) {
            str.getClass();
            m17062q();
            ((C5438u) this.f13597b).m22732g0().remove(str);
            return this;
        }

        public b() {
            super(C5438u.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.u$c */
    public static final class c {

        /* renamed from: a */
        public static final C4027N f19462a = C4027N.m16284d(AbstractC4014B0.b.f13252r, StringUtils.EMPTY, AbstractC4014B0.b.f13254t, C5413D.m22442o0());
    }

    static {
        C5438u c5438u = new C5438u();
        DEFAULT_INSTANCE = c5438u;
        AbstractC4087y.m17033V(C5438u.class, c5438u);
    }

    /* renamed from: b0 */
    public static C5438u m22731b0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public Map m22732g0() {
        return m22734i0();
    }

    /* renamed from: h0 */
    private C4028O m22733h0() {
        return this.fields_;
    }

    /* renamed from: i0 */
    private C4028O m22734i0() {
        if (!this.fields_.m16295i()) {
            this.fields_ = this.fields_.m16298l();
        }
        return this.fields_;
    }

    /* renamed from: j0 */
    public static b m22735j0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* renamed from: c0 */
    public int m22736c0() {
        return m22733h0().size();
    }

    /* renamed from: d0 */
    public Map m22737d0() {
        return DesugarCollections.unmodifiableMap(m22733h0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e0 */
    public C5413D m22738e0(String str, C5413D c5413d) {
        str.getClass();
        C4028O m22733h0 = m22733h0();
        return m22733h0.containsKey(str) ? (C5413D) m22733h0.get(str) : c5413d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f0 */
    public C5413D m22739f0(String str) {
        str.getClass();
        C4028O m22733h0 = m22733h0();
        if (m22733h0.containsKey(str)) {
            return (C5413D) m22733h0.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19461a[dVar.ordinal()]) {
            case 1:
                return new C5438u();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f19462a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5438u.class) {
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
