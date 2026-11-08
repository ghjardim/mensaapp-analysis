package p133T;

import androidx.datastore.preferences.protobuf.AbstractC3280a;
import androidx.datastore.preferences.protobuf.AbstractC3311t;
import androidx.datastore.preferences.protobuf.AbstractC3312u;
import androidx.datastore.preferences.protobuf.InterfaceC3265K;
import androidx.datastore.preferences.protobuf.InterfaceC3272S;
import java.util.List;

/* renamed from: T.g */
/* loaded from: classes.dex */
public final class C2426g extends AbstractC3311t implements InterfaceC3265K {
    private static final C2426g DEFAULT_INSTANCE;
    private static volatile InterfaceC3272S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC3312u.b strings_ = AbstractC3311t.m12803t();

    /* renamed from: T.g$a */
    public static final class a extends AbstractC3311t.a implements InterfaceC3265K {
        public /* synthetic */ a(AbstractC2424e abstractC2424e) {
            this();
        }

        /* renamed from: q */
        public a m8230q(Iterable iterable) {
            m12831l();
            ((C2426g) this.f10652b).m8227Q(iterable);
            return this;
        }

        public a() {
            super(C2426g.DEFAULT_INSTANCE);
        }
    }

    static {
        C2426g c2426g = new C2426g();
        DEFAULT_INSTANCE = c2426g;
        AbstractC3311t.m12801L(C2426g.class, c2426g);
    }

    /* renamed from: S */
    public static C2426g m8225S() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: U */
    public static a m8226U() {
        return (a) DEFAULT_INSTANCE.m12819p();
    }

    /* renamed from: Q */
    public final void m8227Q(Iterable iterable) {
        m8228R();
        AbstractC3280a.m12233e(iterable, this.strings_);
    }

    /* renamed from: R */
    public final void m8228R() {
        AbstractC3312u.b bVar = this.strings_;
        if (bVar.mo12324j()) {
            return;
        }
        this.strings_ = AbstractC3311t.m12797F(bVar);
    }

    /* renamed from: T */
    public List m8229T() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3311t
    /* renamed from: s */
    public final Object mo8221s(AbstractC3311t.d dVar, Object obj, Object obj2) {
        AbstractC2424e abstractC2424e = null;
        switch (AbstractC2424e.f7170a[dVar.ordinal()]) {
            case 1:
                return new C2426g();
            case 2:
                return new a(abstractC2424e);
            case 3:
                return AbstractC3311t.m12798H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC3272S interfaceC3272S = PARSER;
                if (interfaceC3272S == null) {
                    synchronized (C2426g.class) {
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
