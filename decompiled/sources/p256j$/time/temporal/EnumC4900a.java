package p256j$.time.temporal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NANO_OF_SECOND' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.time.temporal.a */
/* loaded from: classes3.dex */
public final class EnumC4900a implements InterfaceC4915p {
    public static final EnumC4900a ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final EnumC4900a ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final EnumC4900a ALIGNED_WEEK_OF_MONTH;
    public static final EnumC4900a ALIGNED_WEEK_OF_YEAR;
    public static final EnumC4900a AMPM_OF_DAY;
    public static final EnumC4900a CLOCK_HOUR_OF_AMPM;
    public static final EnumC4900a CLOCK_HOUR_OF_DAY;
    public static final EnumC4900a DAY_OF_MONTH;
    public static final EnumC4900a DAY_OF_WEEK;
    public static final EnumC4900a DAY_OF_YEAR;
    public static final EnumC4900a EPOCH_DAY;
    public static final EnumC4900a ERA;
    public static final EnumC4900a HOUR_OF_AMPM;
    public static final EnumC4900a HOUR_OF_DAY;
    public static final EnumC4900a INSTANT_SECONDS;
    public static final EnumC4900a MICRO_OF_DAY;
    public static final EnumC4900a MICRO_OF_SECOND;
    public static final EnumC4900a MILLI_OF_DAY;
    public static final EnumC4900a MILLI_OF_SECOND;
    public static final EnumC4900a MINUTE_OF_DAY;
    public static final EnumC4900a MINUTE_OF_HOUR;
    public static final EnumC4900a MONTH_OF_YEAR;
    public static final EnumC4900a NANO_OF_DAY;
    public static final EnumC4900a NANO_OF_SECOND;
    public static final EnumC4900a OFFSET_SECONDS;
    public static final EnumC4900a PROLEPTIC_MONTH;
    public static final EnumC4900a SECOND_OF_DAY;
    public static final EnumC4900a SECOND_OF_MINUTE;
    public static final EnumC4900a YEAR;
    public static final EnumC4900a YEAR_OF_ERA;

    /* renamed from: c */
    private static final /* synthetic */ EnumC4900a[] f18056c;

    /* renamed from: a */
    private final String f18057a;

    /* renamed from: b */
    private final C4919t f18058b;

    public static EnumC4900a valueOf(String str) {
        return (EnumC4900a) Enum.valueOf(EnumC4900a.class, str);
    }

    public static EnumC4900a[] values() {
        return (EnumC4900a[]) f18056c.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
        EnumC4900a enumC4900a = new EnumC4900a("NANO_OF_SECOND", 0, "NanoOfSecond", chronoUnit, chronoUnit2, C4919t.m21198j(0L, 999999999L));
        NANO_OF_SECOND = enumC4900a;
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        EnumC4900a enumC4900a2 = new EnumC4900a("NANO_OF_DAY", 1, "NanoOfDay", chronoUnit, chronoUnit3, C4919t.m21198j(0L, 86399999999999L));
        NANO_OF_DAY = enumC4900a2;
        ChronoUnit chronoUnit4 = ChronoUnit.MICROS;
        EnumC4900a enumC4900a3 = new EnumC4900a("MICRO_OF_SECOND", 2, "MicroOfSecond", chronoUnit4, chronoUnit2, C4919t.m21198j(0L, 999999L));
        MICRO_OF_SECOND = enumC4900a3;
        EnumC4900a enumC4900a4 = new EnumC4900a("MICRO_OF_DAY", 3, "MicroOfDay", chronoUnit4, chronoUnit3, C4919t.m21198j(0L, 86399999999L));
        MICRO_OF_DAY = enumC4900a4;
        ChronoUnit chronoUnit5 = ChronoUnit.MILLIS;
        EnumC4900a enumC4900a5 = new EnumC4900a("MILLI_OF_SECOND", 4, "MilliOfSecond", chronoUnit5, chronoUnit2, C4919t.m21198j(0L, 999L));
        MILLI_OF_SECOND = enumC4900a5;
        EnumC4900a enumC4900a6 = new EnumC4900a("MILLI_OF_DAY", 5, "MilliOfDay", chronoUnit5, chronoUnit3, C4919t.m21198j(0L, 86399999L));
        MILLI_OF_DAY = enumC4900a6;
        ChronoUnit chronoUnit6 = ChronoUnit.MINUTES;
        EnumC4900a enumC4900a7 = new EnumC4900a("SECOND_OF_MINUTE", 6, "SecondOfMinute", chronoUnit2, chronoUnit6, C4919t.m21198j(0L, 59L), 0);
        SECOND_OF_MINUTE = enumC4900a7;
        EnumC4900a enumC4900a8 = new EnumC4900a("SECOND_OF_DAY", 7, "SecondOfDay", chronoUnit2, chronoUnit3, C4919t.m21198j(0L, 86399L));
        SECOND_OF_DAY = enumC4900a8;
        ChronoUnit chronoUnit7 = ChronoUnit.HOURS;
        EnumC4900a enumC4900a9 = new EnumC4900a("MINUTE_OF_HOUR", 8, "MinuteOfHour", chronoUnit6, chronoUnit7, C4919t.m21198j(0L, 59L), 0);
        MINUTE_OF_HOUR = enumC4900a9;
        EnumC4900a enumC4900a10 = new EnumC4900a("MINUTE_OF_DAY", 9, "MinuteOfDay", chronoUnit6, chronoUnit3, C4919t.m21198j(0L, 1439L));
        MINUTE_OF_DAY = enumC4900a10;
        ChronoUnit chronoUnit8 = ChronoUnit.HALF_DAYS;
        EnumC4900a enumC4900a11 = new EnumC4900a("HOUR_OF_AMPM", 10, "HourOfAmPm", chronoUnit7, chronoUnit8, C4919t.m21198j(0L, 11L));
        HOUR_OF_AMPM = enumC4900a11;
        EnumC4900a enumC4900a12 = new EnumC4900a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", chronoUnit7, chronoUnit8, C4919t.m21198j(1L, 12L));
        CLOCK_HOUR_OF_AMPM = enumC4900a12;
        EnumC4900a enumC4900a13 = new EnumC4900a("HOUR_OF_DAY", 12, "HourOfDay", chronoUnit7, chronoUnit3, C4919t.m21198j(0L, 23L), 0);
        HOUR_OF_DAY = enumC4900a13;
        EnumC4900a enumC4900a14 = new EnumC4900a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", chronoUnit7, chronoUnit3, C4919t.m21198j(1L, 24L));
        CLOCK_HOUR_OF_DAY = enumC4900a14;
        EnumC4900a enumC4900a15 = new EnumC4900a("AMPM_OF_DAY", 14, "AmPmOfDay", chronoUnit8, chronoUnit3, C4919t.m21198j(0L, 1L), 0);
        AMPM_OF_DAY = enumC4900a15;
        ChronoUnit chronoUnit9 = ChronoUnit.WEEKS;
        EnumC4900a enumC4900a16 = new EnumC4900a("DAY_OF_WEEK", 15, "DayOfWeek", chronoUnit3, chronoUnit9, C4919t.m21198j(1L, 7L), 0);
        DAY_OF_WEEK = enumC4900a16;
        EnumC4900a enumC4900a17 = new EnumC4900a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", chronoUnit3, chronoUnit9, C4919t.m21198j(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = enumC4900a17;
        EnumC4900a enumC4900a18 = new EnumC4900a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", chronoUnit3, chronoUnit9, C4919t.m21198j(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = enumC4900a18;
        ChronoUnit chronoUnit10 = ChronoUnit.MONTHS;
        EnumC4900a enumC4900a19 = new EnumC4900a("DAY_OF_MONTH", 18, "DayOfMonth", chronoUnit3, chronoUnit10, C4919t.m21199k(28L, 31L), 0);
        DAY_OF_MONTH = enumC4900a19;
        ChronoUnit chronoUnit11 = ChronoUnit.YEARS;
        EnumC4900a enumC4900a20 = new EnumC4900a("DAY_OF_YEAR", 19, "DayOfYear", chronoUnit3, chronoUnit11, C4919t.m21199k(365L, 366L));
        DAY_OF_YEAR = enumC4900a20;
        ChronoUnit chronoUnit12 = ChronoUnit.FOREVER;
        EnumC4900a enumC4900a21 = new EnumC4900a("EPOCH_DAY", 20, "EpochDay", chronoUnit3, chronoUnit12, C4919t.m21198j(-365243219162L, 365241780471L));
        EPOCH_DAY = enumC4900a21;
        EnumC4900a enumC4900a22 = new EnumC4900a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", chronoUnit9, chronoUnit10, C4919t.m21199k(4L, 5L));
        ALIGNED_WEEK_OF_MONTH = enumC4900a22;
        EnumC4900a enumC4900a23 = new EnumC4900a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", chronoUnit9, chronoUnit11, C4919t.m21198j(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = enumC4900a23;
        EnumC4900a enumC4900a24 = new EnumC4900a("MONTH_OF_YEAR", 23, "MonthOfYear", chronoUnit10, chronoUnit11, C4919t.m21198j(1L, 12L), 0);
        MONTH_OF_YEAR = enumC4900a24;
        EnumC4900a enumC4900a25 = new EnumC4900a("PROLEPTIC_MONTH", 24, "ProlepticMonth", chronoUnit10, chronoUnit12, C4919t.m21198j(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = enumC4900a25;
        EnumC4900a enumC4900a26 = new EnumC4900a("YEAR_OF_ERA", 25, "YearOfEra", chronoUnit11, chronoUnit12, C4919t.m21199k(999999999L, 1000000000L));
        YEAR_OF_ERA = enumC4900a26;
        EnumC4900a enumC4900a27 = new EnumC4900a("YEAR", 26, "Year", chronoUnit11, chronoUnit12, C4919t.m21198j(-999999999L, 999999999L), 0);
        YEAR = enumC4900a27;
        EnumC4900a enumC4900a28 = new EnumC4900a("ERA", 27, "Era", ChronoUnit.ERAS, chronoUnit12, C4919t.m21198j(0L, 1L), 0);
        ERA = enumC4900a28;
        EnumC4900a enumC4900a29 = new EnumC4900a("INSTANT_SECONDS", 28, "InstantSeconds", chronoUnit2, chronoUnit12, C4919t.m21198j(Long.MIN_VALUE, Long.MAX_VALUE));
        INSTANT_SECONDS = enumC4900a29;
        EnumC4900a enumC4900a30 = new EnumC4900a("OFFSET_SECONDS", 29, "OffsetSeconds", chronoUnit2, chronoUnit12, C4919t.m21198j(-64800L, 64800L));
        OFFSET_SECONDS = enumC4900a30;
        f18056c = new EnumC4900a[]{enumC4900a, enumC4900a2, enumC4900a3, enumC4900a4, enumC4900a5, enumC4900a6, enumC4900a7, enumC4900a8, enumC4900a9, enumC4900a10, enumC4900a11, enumC4900a12, enumC4900a13, enumC4900a14, enumC4900a15, enumC4900a16, enumC4900a17, enumC4900a18, enumC4900a19, enumC4900a20, enumC4900a21, enumC4900a22, enumC4900a23, enumC4900a24, enumC4900a25, enumC4900a26, enumC4900a27, enumC4900a28, enumC4900a29, enumC4900a30};
    }

    private EnumC4900a(String str, int i7, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, C4919t c4919t) {
        this.f18057a = str2;
        this.f18058b = c4919t;
    }

    private EnumC4900a(String str, int i7, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, C4919t c4919t, int i8) {
        this.f18057a = str2;
        this.f18058b = c4919t;
    }

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: l */
    public final C4919t mo21172l() {
        return this.f18058b;
    }

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: w */
    public final boolean mo21177w() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    /* renamed from: J */
    public final boolean m21171J() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    /* renamed from: I */
    public final void m21170I(long j7) {
        this.f18058b.m21201b(j7, this);
    }

    /* renamed from: z */
    public final int m21178z(long j7) {
        return this.f18058b.m21200a(j7, this);
    }

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: n */
    public final boolean mo21174n(InterfaceC4912m interfaceC4912m) {
        return interfaceC4912m.mo20905g(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: s */
    public final C4919t mo21176s(InterfaceC4912m interfaceC4912m) {
        return interfaceC4912m.mo20912o(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: m */
    public final long mo21173m(InterfaceC4912m interfaceC4912m) {
        return interfaceC4912m.mo20914s(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: o */
    public final Temporal mo21175o(Temporal temporal, long j7) {
        return temporal.mo20902d(j7, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f18057a;
    }
}
