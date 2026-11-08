package p256j$.time.temporal;

import p256j$.time.AbstractC4861d;
import p256j$.time.C4822c;
import p256j$.util.Objects;

/* renamed from: j$.time.temporal.l */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4911l {

    /* renamed from: a */
    static final InterfaceC4917r f18073a = new C4916q(0);

    /* renamed from: b */
    static final InterfaceC4917r f18074b = new C4916q(1);

    /* renamed from: c */
    static final InterfaceC4917r f18075c = new C4916q(2);

    /* renamed from: d */
    static final InterfaceC4917r f18076d = new C4916q(3);

    /* renamed from: e */
    static final InterfaceC4917r f18077e = new C4916q(4);

    /* renamed from: f */
    static final InterfaceC4917r f18078f = new C4916q(5);

    /* renamed from: g */
    static final InterfaceC4917r f18079g = new C4916q(6);

    /* renamed from: k */
    public static InterfaceC4917r m21196k() {
        return f18073a;
    }

    /* renamed from: d */
    public static C4919t m21189d(InterfaceC4912m interfaceC4912m, InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            Objects.requireNonNull(interfaceC4915p, "field");
            return interfaceC4915p.mo21176s(interfaceC4912m);
        }
        if (interfaceC4912m.mo20905g(interfaceC4915p)) {
            return ((EnumC4900a) interfaceC4915p).mo21172l();
        }
        throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
    }

    /* renamed from: e */
    public static InterfaceC4917r m21190e() {
        return f18074b;
    }

    /* renamed from: a */
    public static int m21186a(InterfaceC4912m interfaceC4912m, InterfaceC4915p interfaceC4915p) {
        C4919t mo20912o = interfaceC4912m.mo20912o(interfaceC4915p);
        if (!mo20912o.m21206h()) {
            throw new C4918s("Invalid field " + interfaceC4915p + " for get() method, use getLong() instead");
        }
        long mo20914s = interfaceC4912m.mo20914s(interfaceC4915p);
        if (mo20912o.m21207i(mo20914s)) {
            return (int) mo20914s;
        }
        throw new C4822c("Invalid value for " + interfaceC4915p + " (valid values " + mo20912o + "): " + mo20914s);
    }

    /* renamed from: i */
    public static InterfaceC4917r m21194i() {
        return f18075c;
    }

    /* renamed from: j */
    public static InterfaceC4917r m21195j() {
        return f18077e;
    }

    /* renamed from: h */
    public static InterfaceC4917r m21193h() {
        return f18076d;
    }

    /* renamed from: c */
    public static Object m21188c(InterfaceC4912m interfaceC4912m, InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == f18073a || interfaceC4917r == f18074b || interfaceC4917r == f18075c) {
            return null;
        }
        return interfaceC4917r.mo21070a(interfaceC4912m);
    }

    /* renamed from: f */
    public static InterfaceC4917r m21191f() {
        return f18078f;
    }

    /* renamed from: g */
    public static InterfaceC4917r m21192g() {
        return f18079g;
    }

    /* renamed from: b */
    public static Temporal m21187b(Temporal temporal, long j7, TemporalUnit temporalUnit) {
        long j8;
        if (j7 == Long.MIN_VALUE) {
            temporal = temporal.mo20903e(Long.MAX_VALUE, temporalUnit);
            j8 = 1;
        } else {
            j8 = -j7;
        }
        return temporal.mo20903e(j8, temporalUnit);
    }
}
