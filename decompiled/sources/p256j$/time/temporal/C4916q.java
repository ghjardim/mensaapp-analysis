package p256j$.time.temporal;

import p256j$.time.C4888i;
import p256j$.time.C4891l;
import p256j$.time.ZoneId;
import p256j$.time.ZoneOffset;
import p256j$.time.chrono.InterfaceC4848n;

/* renamed from: j$.time.temporal.q */
/* loaded from: classes3.dex */
final class C4916q implements InterfaceC4917r {

    /* renamed from: a */
    public final /* synthetic */ int f18082a;

    public /* synthetic */ C4916q(int i7) {
        this.f18082a = i7;
    }

    @Override // p256j$.time.temporal.InterfaceC4917r
    /* renamed from: a */
    public final Object mo21070a(InterfaceC4912m interfaceC4912m) {
        switch (this.f18082a) {
            case 0:
                return (ZoneId) interfaceC4912m.mo20915w(AbstractC4911l.f18073a);
            case 1:
                return (InterfaceC4848n) interfaceC4912m.mo20915w(AbstractC4911l.f18074b);
            case 2:
                return (TemporalUnit) interfaceC4912m.mo20915w(AbstractC4911l.f18075c);
            case 3:
                EnumC4900a enumC4900a = EnumC4900a.OFFSET_SECONDS;
                if (interfaceC4912m.mo20905g(enumC4900a)) {
                    return ZoneOffset.m20967T(interfaceC4912m.mo20910m(enumC4900a));
                }
                return null;
            case 4:
                ZoneId zoneId = (ZoneId) interfaceC4912m.mo20915w(AbstractC4911l.f18073a);
                return zoneId != null ? zoneId : (ZoneId) interfaceC4912m.mo20915w(AbstractC4911l.f18076d);
            case 5:
                EnumC4900a enumC4900a2 = EnumC4900a.EPOCH_DAY;
                if (interfaceC4912m.mo20905g(enumC4900a2)) {
                    return C4888i.m21115X(interfaceC4912m.mo20914s(enumC4900a2));
                }
                return null;
            default:
                EnumC4900a enumC4900a3 = EnumC4900a.NANO_OF_DAY;
                if (interfaceC4912m.mo20905g(enumC4900a3)) {
                    return C4891l.m21138Q(interfaceC4912m.mo20914s(enumC4900a3));
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f18082a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case 4:
                return "Zone";
            case 5:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
