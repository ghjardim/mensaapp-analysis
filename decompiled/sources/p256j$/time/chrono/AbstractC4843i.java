package p256j$.time.chrono;

import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p256j$.time.AbstractC4861d;
import p256j$.time.ZoneOffset;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4918s;
import p256j$.time.temporal.ChronoUnit;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4912m;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.InterfaceC4917r;
import p256j$.time.temporal.Temporal;
import p256j$.util.Objects;

/* renamed from: j$.time.chrono.i */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4843i {
    /* renamed from: i */
    public static boolean m21025i(InterfaceC4849o interfaceC4849o, InterfaceC4915p interfaceC4915p) {
        return interfaceC4915p instanceof EnumC4900a ? interfaceC4915p == EnumC4900a.ERA : interfaceC4915p != null && interfaceC4915p.mo21174n(interfaceC4849o);
    }

    /* renamed from: p */
    public static InterfaceC4848n m21032p(InterfaceC4912m interfaceC4912m) {
        Objects.requireNonNull(interfaceC4912m, "temporal");
        Object obj = (InterfaceC4848n) interfaceC4912m.mo20915w(AbstractC4911l.m21190e());
        C4855u c4855u = C4855u.f17955d;
        if (obj == null) {
            obj = Objects.requireNonNull(c4855u, "defaultObj");
        }
        return (InterfaceC4848n) obj;
    }

    /* renamed from: e */
    public static int m21021e(InterfaceC4845k interfaceC4845k, InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            int i7 = AbstractC4844j.f17930a[((EnumC4900a) interfaceC4915p).ordinal()];
            if (i7 == 1) {
                throw new C4918s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i7 == 2) {
                return interfaceC4845k.mo20906h().m20971Q();
            }
            return interfaceC4845k.mo20893B().mo20910m(interfaceC4915p);
        }
        return AbstractC4911l.m21186a(interfaceC4845k, interfaceC4915p);
    }

    /* renamed from: f */
    public static int m21022f(InterfaceC4849o interfaceC4849o, EnumC4900a enumC4900a) {
        if (enumC4900a == EnumC4900a.ERA) {
            return interfaceC4849o.getValue();
        }
        return AbstractC4911l.m21186a(interfaceC4849o, enumC4900a);
    }

    /* renamed from: g */
    public static long m21023g(InterfaceC4849o interfaceC4849o, InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.ERA) {
            return interfaceC4849o.getValue();
        }
        if (interfaceC4915p instanceof EnumC4900a) {
            throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
        return interfaceC4915p.mo21173m(interfaceC4849o);
    }

    /* renamed from: m */
    public static Object m21029m(InterfaceC4849o interfaceC4849o, InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21194i()) {
            return ChronoUnit.ERAS;
        }
        return AbstractC4911l.m21188c(interfaceC4849o, interfaceC4917r);
    }

    /* renamed from: k */
    public static Object m21027k(InterfaceC4839e interfaceC4839e, InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21196k() || interfaceC4917r == AbstractC4911l.m21195j() || interfaceC4917r == AbstractC4911l.m21193h()) {
            return null;
        }
        if (interfaceC4917r == AbstractC4911l.m21192g()) {
            return interfaceC4839e.mo20948b();
        }
        if (interfaceC4917r == AbstractC4911l.m21190e()) {
            return interfaceC4839e.mo20947a();
        }
        if (interfaceC4917r == AbstractC4911l.m21194i()) {
            return ChronoUnit.NANOS;
        }
        return interfaceC4917r.mo21070a(interfaceC4839e);
    }

    /* renamed from: h */
    public static boolean m21024h(InterfaceC4836b interfaceC4836b, InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            return ((EnumC4900a) interfaceC4915p).mo21177w();
        }
        return interfaceC4915p != null && interfaceC4915p.mo21174n(interfaceC4836b);
    }

    /* renamed from: n */
    public static long m21030n(InterfaceC4839e interfaceC4839e, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        return ((interfaceC4839e.mo20949c().mo20997t() * 86400) + interfaceC4839e.mo20948b().m21151Z()) - zoneOffset.m20971Q();
    }

    /* renamed from: l */
    public static Object m21028l(InterfaceC4845k interfaceC4845k, InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21195j() || interfaceC4917r == AbstractC4911l.m21196k()) {
            return interfaceC4845k.mo20913q();
        }
        if (interfaceC4917r == AbstractC4911l.m21193h()) {
            return interfaceC4845k.mo20906h();
        }
        if (interfaceC4917r == AbstractC4911l.m21192g()) {
            return interfaceC4845k.mo20900b();
        }
        if (interfaceC4917r == AbstractC4911l.m21190e()) {
            return interfaceC4845k.mo20899a();
        }
        if (interfaceC4917r == AbstractC4911l.m21194i()) {
            return ChronoUnit.NANOS;
        }
        return interfaceC4917r.mo21070a(interfaceC4845k);
    }

    /* renamed from: c */
    public static int m21019c(InterfaceC4839e interfaceC4839e, InterfaceC4839e interfaceC4839e2) {
        int compareTo = interfaceC4839e.mo20949c().compareTo(interfaceC4839e2.mo20949c());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = interfaceC4839e.mo20948b().compareTo(interfaceC4839e2.mo20948b());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return ((AbstractC4835a) interfaceC4839e.mo20947a()).mo20984k().compareTo(interfaceC4839e2.mo20947a().mo20984k());
    }

    /* renamed from: j */
    public static Object m21026j(InterfaceC4836b interfaceC4836b, InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21196k() || interfaceC4917r == AbstractC4911l.m21195j() || interfaceC4917r == AbstractC4911l.m21193h() || interfaceC4917r == AbstractC4911l.m21192g()) {
            return null;
        }
        if (interfaceC4917r == AbstractC4911l.m21190e()) {
            return interfaceC4836b.mo20996a();
        }
        if (interfaceC4917r == AbstractC4911l.m21194i()) {
            return ChronoUnit.DAYS;
        }
        return interfaceC4917r.mo21070a(interfaceC4836b);
    }

    /* renamed from: a */
    public static Temporal m21017a(InterfaceC4836b interfaceC4836b, Temporal temporal) {
        return temporal.mo20902d(interfaceC4836b.mo20997t(), EnumC4900a.EPOCH_DAY);
    }

    /* renamed from: o */
    public static long m21031o(InterfaceC4845k interfaceC4845k) {
        return ((interfaceC4845k.mo20901c().mo20997t() * 86400) + interfaceC4845k.mo20900b().m21151Z()) - interfaceC4845k.mo20906h().m20971Q();
    }

    /* renamed from: d */
    public static int m21020d(InterfaceC4845k interfaceC4845k, InterfaceC4845k interfaceC4845k2) {
        int compare = Long.compare(interfaceC4845k.mo20894H(), interfaceC4845k2.mo20894H());
        if (compare != 0) {
            return compare;
        }
        int m21143N = interfaceC4845k.mo20900b().m21143N() - interfaceC4845k2.mo20900b().m21143N();
        if (m21143N != 0) {
            return m21143N;
        }
        int compareTo = interfaceC4845k.mo20893B().compareTo(interfaceC4845k2.mo20893B());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = interfaceC4845k.mo20913q().mo20963k().compareTo(interfaceC4845k2.mo20913q().mo20963k());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return ((AbstractC4835a) interfaceC4845k.mo20899a()).mo20984k().compareTo(interfaceC4845k2.mo20899a().mo20984k());
    }

    /* renamed from: b */
    public static int m21018b(InterfaceC4836b interfaceC4836b, InterfaceC4836b interfaceC4836b2) {
        int compare = Long.compare(interfaceC4836b.mo20997t(), interfaceC4836b2.mo20997t());
        if (compare != 0) {
            return compare;
        }
        return ((AbstractC4835a) interfaceC4836b.mo20996a()).mo20984k().compareTo(interfaceC4836b2.mo20996a().mo20984k());
    }
}
