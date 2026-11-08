package p272k4;

import com.google.protobuf.AbstractC4014B0;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4027N;
import com.google.protobuf.C4028O;
import com.google.protobuf.C4078t0;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p256j$.util.DesugarCollections;

/* renamed from: k4.k */
/* loaded from: classes.dex */
public final class C5428k extends AbstractC4087y implements InterfaceC4035W {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final C5428k DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private C4078t0 createTime_;
    private C4028O fields_ = C4028O.m16291d();
    private String name_ = StringUtils.EMPTY;
    private C4078t0 updateTime_;

    /* renamed from: k4.k$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19422a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19422a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19422a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19422a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19422a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19422a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19422a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19422a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.k$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m22632w(Map map) {
            m17062q();
            ((C5428k) this.f13597b).m22626f0().putAll(map);
            return this;
        }

        /* renamed from: x */
        public b m22633x(String str) {
            m17062q();
            ((C5428k) this.f13597b).m22624l0(str);
            return this;
        }

        /* renamed from: y */
        public b m22634y(C4078t0 c4078t0) {
            m17062q();
            ((C5428k) this.f13597b).m22631m0(c4078t0);
            return this;
        }

        public b() {
            super(C5428k.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.k$c */
    public static final class c {

        /* renamed from: a */
        public static final C4027N f19423a = C4027N.m16284d(AbstractC4014B0.b.f13252r, StringUtils.EMPTY, AbstractC4014B0.b.f13254t, C5413D.m22442o0());
    }

    static {
        C5428k c5428k = new C5428k();
        DEFAULT_INSTANCE = c5428k;
        AbstractC4087y.m17033V(C5428k.class, c5428k);
    }

    /* renamed from: d0 */
    public static C5428k m22622d0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: k0 */
    public static b m22623k0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public void m22624l0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: e0 */
    public Map m22625e0() {
        return DesugarCollections.unmodifiableMap(m22629i0());
    }

    /* renamed from: f0 */
    public final Map m22626f0() {
        return m22630j0();
    }

    /* renamed from: g0 */
    public String m22627g0() {
        return this.name_;
    }

    /* renamed from: h0 */
    public C4078t0 m22628h0() {
        C4078t0 c4078t0 = this.updateTime_;
        return c4078t0 == null ? C4078t0.m16929c0() : c4078t0;
    }

    /* renamed from: i0 */
    public final C4028O m22629i0() {
        return this.fields_;
    }

    /* renamed from: j0 */
    public final C4028O m22630j0() {
        if (!this.fields_.m16295i()) {
            this.fields_ = this.fields_.m16298l();
        }
        return this.fields_;
    }

    /* renamed from: m0 */
    public final void m22631m0(C4078t0 c4078t0) {
        c4078t0.getClass();
        this.updateTime_ = c4078t0;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19422a[dVar.ordinal()]) {
            case 1:
                return new C5428k();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "name_", "fields_", c.f19423a, "createTime_", "updateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5428k.class) {
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
