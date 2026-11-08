package p133T;

import androidx.datastore.preferences.protobuf.AbstractC3301k0;
import androidx.datastore.preferences.protobuf.AbstractC3311t;
import androidx.datastore.preferences.protobuf.C3257C;
import androidx.datastore.preferences.protobuf.C3258D;
import androidx.datastore.preferences.protobuf.InterfaceC3265K;
import androidx.datastore.preferences.protobuf.InterfaceC3272S;
import java.io.InputStream;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p256j$.util.DesugarCollections;

/* renamed from: T.f */
/* loaded from: classes.dex */
public final class C2425f extends AbstractC3311t implements InterfaceC3265K {
    private static final C2425f DEFAULT_INSTANCE;
    private static volatile InterfaceC3272S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C3258D preferences_ = C3258D.m12070d();

    /* renamed from: T.f$a */
    public static final class a extends AbstractC3311t.a implements InterfaceC3265K {
        public /* synthetic */ a(AbstractC2424e abstractC2424e) {
            this();
        }

        /* renamed from: q */
        public a m8222q(String str, C2427h c2427h) {
            str.getClass();
            c2427h.getClass();
            m12831l();
            ((C2425f) this.f10652b).m8217Q().put(str, c2427h);
            return this;
        }

        public a() {
            super(C2425f.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: T.f$b */
    public static final class b {

        /* renamed from: a */
        public static final C3257C f7171a = C3257C.m12063d(AbstractC3301k0.b.f10544r, StringUtils.EMPTY, AbstractC3301k0.b.f10546t, C2427h.m8240Z());
    }

    static {
        C2425f c2425f = new C2425f();
        DEFAULT_INSTANCE = c2425f;
        AbstractC3311t.m12801L(C2425f.class, c2425f);
    }

    /* renamed from: U */
    public static a m8215U() {
        return (a) DEFAULT_INSTANCE.m12819p();
    }

    /* renamed from: V */
    public static C2425f m8216V(InputStream inputStream) {
        return (C2425f) AbstractC3311t.m12799J(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Q */
    public final Map m8217Q() {
        return m8219S();
    }

    /* renamed from: R */
    public Map m8218R() {
        return DesugarCollections.unmodifiableMap(m8220T());
    }

    /* renamed from: S */
    public final C3258D m8219S() {
        if (!this.preferences_.m12074i()) {
            this.preferences_ = this.preferences_.m12077l();
        }
        return this.preferences_;
    }

    /* renamed from: T */
    public final C3258D m8220T() {
        return this.preferences_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3311t
    /* renamed from: s */
    public final Object mo8221s(AbstractC3311t.d dVar, Object obj, Object obj2) {
        AbstractC2424e abstractC2424e = null;
        switch (AbstractC2424e.f7170a[dVar.ordinal()]) {
            case 1:
                return new C2425f();
            case 2:
                return new a(abstractC2424e);
            case 3:
                return AbstractC3311t.m12798H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f7171a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3272S interfaceC3272S = PARSER;
                if (interfaceC3272S == null) {
                    synchronized (C2425f.class) {
                        try {
                            interfaceC3272S = PARSER;
                            if (interfaceC3272S == null) {
                                interfaceC3272S = new AbstractC3311t.b(DEFAULT_INSTANCE);
                                PARSER = interfaceC3272S;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC3272S;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
