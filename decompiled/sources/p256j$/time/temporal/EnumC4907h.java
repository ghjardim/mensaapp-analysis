package p256j$.time.temporal;

import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.C4863f;

/* renamed from: j$.time.temporal.h */
/* loaded from: classes3.dex */
enum EnumC4907h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", C4863f.m21061o(31556952)),
    QUARTER_YEARS("QuarterYears", C4863f.m21061o(7889238));


    /* renamed from: a */
    private final String f18063a;

    /* renamed from: b */
    private final C4863f f18064b;

    EnumC4907h(String str, C4863f c4863f) {
        this.f18063a = str;
        this.f18064b = c4863f;
    }

    @Override // p256j$.time.temporal.TemporalUnit
    /* renamed from: m */
    public final C4863f mo21169m() {
        return this.f18064b;
    }

    @Override // p256j$.time.temporal.TemporalUnit
    /* renamed from: l */
    public final Temporal mo21168l(Temporal temporal, long j7) {
        int i7 = AbstractC4901b.f18059a[ordinal()];
        if (i7 == 1) {
            return temporal.mo20902d(AbstractC4815a.m20868f(temporal.mo20910m(r0), j7), AbstractC4908i.f18067c);
        }
        if (i7 == 2) {
            return temporal.mo20903e(j7 / 4, ChronoUnit.YEARS).mo20903e((j7 % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // p256j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.mo20904f(temporal2, this);
        }
        int i7 = AbstractC4901b.f18059a[ordinal()];
        if (i7 == 1) {
            InterfaceC4915p interfaceC4915p = AbstractC4908i.f18067c;
            return AbstractC4815a.m20875m(temporal2.mo20914s(interfaceC4915p), temporal.mo20914s(interfaceC4915p));
        }
        if (i7 == 2) {
            return temporal.mo20904f(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18063a;
    }
}
