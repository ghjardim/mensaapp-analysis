package p256j$.time.temporal;

import p256j$.time.C4863f;

/* loaded from: classes3.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", C4863f.m21060n(1)),
    MICROS("Micros", C4863f.m21060n(1000)),
    MILLIS("Millis", C4863f.m21060n(1000000)),
    SECONDS("Seconds", C4863f.m21061o(1)),
    MINUTES("Minutes", C4863f.m21061o(60)),
    HOURS("Hours", C4863f.m21061o(3600)),
    HALF_DAYS("HalfDays", C4863f.m21061o(43200)),
    DAYS("Days", C4863f.m21061o(86400)),
    WEEKS("Weeks", C4863f.m21061o(604800)),
    MONTHS("Months", C4863f.m21061o(2629746)),
    YEARS("Years", C4863f.m21061o(31556952)),
    DECADES("Decades", C4863f.m21061o(315569520)),
    CENTURIES("Centuries", C4863f.m21061o(3155695200L)),
    MILLENNIA("Millennia", C4863f.m21061o(31556952000L)),
    ERAS("Eras", C4863f.m21061o(31556952000000000L)),
    FOREVER("Forever", C4863f.m21062s(Long.MAX_VALUE, 999999999));


    /* renamed from: a */
    private final String f18054a;

    /* renamed from: b */
    private final C4863f f18055b;

    ChronoUnit(String str, C4863f c4863f) {
        this.f18054a = str;
        this.f18055b = c4863f;
    }

    @Override // p256j$.time.temporal.TemporalUnit
    /* renamed from: m */
    public final C4863f mo21169m() {
        return this.f18055b;
    }

    @Override // p256j$.time.temporal.TemporalUnit
    /* renamed from: l */
    public final Temporal mo21168l(Temporal temporal, long j7) {
        return temporal.mo20903e(j7, this);
    }

    @Override // p256j$.time.temporal.TemporalUnit
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.mo20904f(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18054a;
    }
}
