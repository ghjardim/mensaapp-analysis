package p256j$.time.format;

import java.util.Locale;
import p256j$.time.C4822c;
import p256j$.time.ZoneId;
import p256j$.time.chrono.C4855u;
import p256j$.time.chrono.InterfaceC4836b;
import p256j$.time.chrono.InterfaceC4848n;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4912m;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.Temporal;
import p256j$.util.Objects;

/* renamed from: j$.time.format.p */
/* loaded from: classes3.dex */
final class C4879p {

    /* renamed from: a */
    private InterfaceC4912m f18011a;

    /* renamed from: b */
    private DateTimeFormatter f18012b;

    /* renamed from: c */
    private int f18013c;

    C4879p(InterfaceC4912m interfaceC4912m, DateTimeFormatter dateTimeFormatter) {
        InterfaceC4848n m21066b = dateTimeFormatter.m21066b();
        if (m21066b != null) {
            InterfaceC4848n interfaceC4848n = (InterfaceC4848n) interfaceC4912m.mo20915w(AbstractC4911l.m21190e());
            ZoneId zoneId = (ZoneId) interfaceC4912m.mo20915w(AbstractC4911l.m21196k());
            InterfaceC4836b interfaceC4836b = null;
            m21066b = Objects.equals(m21066b, interfaceC4848n) ? null : m21066b;
            Objects.equals(null, zoneId);
            if (m21066b != null) {
                InterfaceC4848n interfaceC4848n2 = m21066b != null ? m21066b : interfaceC4848n;
                if (m21066b != null) {
                    if (interfaceC4912m.mo20905g(EnumC4900a.EPOCH_DAY)) {
                        interfaceC4836b = interfaceC4848n2.mo20986y((Temporal) interfaceC4912m);
                    } else if (m21066b != C4855u.f17955d || interfaceC4848n != null) {
                        for (EnumC4900a enumC4900a : EnumC4900a.values()) {
                            if (enumC4900a.mo21177w() && interfaceC4912m.mo20905g(enumC4900a)) {
                                throw new C4822c("Unable to apply override chronology '" + m21066b + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + interfaceC4912m);
                            }
                        }
                    }
                }
                interfaceC4912m = new C4878o(interfaceC4836b, interfaceC4912m, interfaceC4848n2, zoneId);
            }
        }
        this.f18011a = interfaceC4912m;
        this.f18012b = dateTimeFormatter;
    }

    /* renamed from: d */
    final InterfaceC4912m m21103d() {
        return this.f18011a;
    }

    /* renamed from: c */
    final Locale m21102c() {
        return this.f18012b.m21068d();
    }

    /* renamed from: b */
    final C4882s m21101b() {
        return this.f18012b.m21067c();
    }

    /* renamed from: g */
    final void m21106g() {
        this.f18013c++;
    }

    /* renamed from: a */
    final void m21100a() {
        this.f18013c--;
    }

    /* renamed from: f */
    final Object m21105f(C4864a c4864a) {
        InterfaceC4912m interfaceC4912m = this.f18011a;
        Object mo20915w = interfaceC4912m.mo20915w(c4864a);
        if (mo20915w != null || this.f18013c != 0) {
            return mo20915w;
        }
        throw new C4822c("Unable to extract " + c4864a + " from temporal " + interfaceC4912m);
    }

    /* renamed from: e */
    final Long m21104e(InterfaceC4915p interfaceC4915p) {
        int i7 = this.f18013c;
        InterfaceC4912m interfaceC4912m = this.f18011a;
        if (i7 <= 0 || interfaceC4912m.mo20905g(interfaceC4915p)) {
            return Long.valueOf(interfaceC4912m.mo20914s(interfaceC4915p));
        }
        return null;
    }

    public final String toString() {
        return this.f18011a.toString();
    }
}
