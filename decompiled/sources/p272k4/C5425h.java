package p272k4;

import com.google.protobuf.AbstractC4015C;
import com.google.protobuf.AbstractC4055i;
import com.google.protobuf.AbstractC4087y;
import com.google.protobuf.InterfaceC4035W;
import com.google.protobuf.InterfaceC4050f0;
import org.apache.tika.utils.StringUtils;

/* renamed from: k4.h */
/* loaded from: classes.dex */
public final class C5425h extends AbstractC4087y implements InterfaceC4035W {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C5425h DEFAULT_INSTANCE;
    private static volatile InterfaceC4050f0 PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = StringUtils.EMPTY;
    private AbstractC4015C.e writes_ = AbstractC4087y.m17021A();
    private AbstractC4055i transaction_ = AbstractC4055i.f13379b;

    /* renamed from: k4.h$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19419a;

        static {
            int[] iArr = new int[AbstractC4087y.d.values().length];
            f19419a = iArr;
            try {
                iArr[AbstractC4087y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19419a[AbstractC4087y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19419a[AbstractC4087y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19419a[AbstractC4087y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19419a[AbstractC4087y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19419a[AbstractC4087y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19419a[AbstractC4087y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: k4.h$b */
    public static final class b extends AbstractC4087y.a implements InterfaceC4035W {
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: w */
        public b m22599w(C5414E c5414e) {
            m17062q();
            ((C5425h) this.f13597b).m22594c0(c5414e);
            return this;
        }

        /* renamed from: x */
        public b m22600x(String str) {
            m17062q();
            ((C5425h) this.f13597b).m22598g0(str);
            return this;
        }

        public b() {
            super(C5425h.DEFAULT_INSTANCE);
        }
    }

    static {
        C5425h c5425h = new C5425h();
        DEFAULT_INSTANCE = c5425h;
        AbstractC4087y.m17033V(C5425h.class, c5425h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m22594c0(C5414E c5414e) {
        c5414e.getClass();
        m22595d0();
        this.writes_.add(c5414e);
    }

    /* renamed from: d0 */
    private void m22595d0() {
        AbstractC4015C.e eVar = this.writes_;
        if (eVar.mo16195j()) {
            return;
        }
        this.writes_ = AbstractC4087y.m17025L(eVar);
    }

    /* renamed from: e0 */
    public static C5425h m22596e0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: f0 */
    public static b m22597f0() {
        return (b) DEFAULT_INSTANCE.m17053u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m22598g0(String str) {
        str.getClass();
        this.database_ = str;
    }

    @Override // com.google.protobuf.AbstractC4087y
    /* renamed from: y */
    public final Object mo4943y(AbstractC4087y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f19419a[dVar.ordinal()]) {
            case 1:
                return new C5425h();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC4087y.m17026N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", C5414E.class, "transaction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC4050f0 interfaceC4050f0 = PARSER;
                if (interfaceC4050f0 == null) {
                    synchronized (C5425h.class) {
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
