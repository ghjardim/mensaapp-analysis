package p272k4;

import com.google.protobuf.AbstractC4014B0;
import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.C4027N;
import com.google.protobuf.C4028O;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import org.apache.tika.utils.StringUtils;

/* renamed from: k4.F */
/* loaded from: classes.dex */
public final class C5415F extends AbstractC4087y implements InterfaceC4035W {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C5415F DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private C4028O labels_ = C4028O.m16291d();
    private String database_ = StringUtils.EMPTY;
    private String streamId_ = StringUtils.EMPTY;
    private AbstractC4015C.e writes_ = AbstractC4087y.m17021A();
    private AbstractC4055i streamToken_ = AbstractC4055i.f13379b;

    /* renamed from: k4.F$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19403a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19403a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19403a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19403a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19403a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19403a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19403a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19403a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.F$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m22529w(C5414E c5414e) {
            m17062q();
            ((C5415F) this.f13597b).m22523d0(c5414e);
            return this;
        }

        /* renamed from: x */
        public b m22530x(String str) {
            m17062q();
            ((C5415F) this.f13597b).m22527h0(str);
            return this;
        }

        /* renamed from: y */
        public b m22531y(AbstractC4055i abstractC4055i) {
            m17062q();
            ((C5415F) this.f13597b).m22528i0(abstractC4055i);
            return this;
        }

        public b() {
            super(C5415F.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: k4.F$c */
    public static final class c {

        /* renamed from: a */
        public static final C4027N f19404a;

        static {
            AbstractC4014B0.b bVar = AbstractC4014B0.b.f13252r;
            f19404a = C4027N.m16284d(bVar, StringUtils.EMPTY, bVar, StringUtils.EMPTY);
        }
    }

    static {
        C5415F c5415f = new C5415F();
        DEFAULT_INSTANCE = c5415f;
        AbstractC4087y.m17033V(C5415F.class, c5415f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public void m22523d0(C5414E c5414e) {
        c5414e.getClass();
        m22524e0();
        this.writes_.add(c5414e);
    }

    /* renamed from: e0 */
    private void m22524e0() {
        AbstractC4015C.e eVar = this.writes_;
        if (eVar.mo16195j()) {
            return;
        }
        this.writes_ = AbstractC4087y.m17025L(eVar);
    }

    /* renamed from: f0 */
    public static C5415F m22525f0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: g0 */
    public static b m22526g0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m22527h0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* renamed from: i0 */
    public final void m22528i0(AbstractC4055i abstractC4055i) {
        abstractC4055i.getClass();
        this.streamToken_ = abstractC4055i;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19403a[dVar.ordinal()]) {
            case 1:
                return new C5415F();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", C5414E.class, "streamToken_", "labels_", c.f19404a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5415F.class) {
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
