package p256j$.time.temporal;

import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.C4888i;
import p256j$.time.EnumC4862e;
import p256j$.time.chrono.AbstractC4843i;
import p256j$.time.chrono.C4855u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.temporal.g */
/* loaded from: classes3.dex */
abstract class EnumC4906g implements InterfaceC4915p {
    public static final EnumC4906g DAY_OF_QUARTER;
    public static final EnumC4906g QUARTER_OF_YEAR;
    public static final EnumC4906g WEEK_BASED_YEAR;
    public static final EnumC4906g WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a */
    private static final int[] f18060a;

    /* renamed from: b */
    private static final /* synthetic */ EnumC4906g[] f18061b;

    @Override // p256j$.time.temporal.InterfaceC4915p
    /* renamed from: w */
    public final boolean mo21177w() {
        return true;
    }

    public static EnumC4906g valueOf(String str) {
        return (EnumC4906g) Enum.valueOf(EnumC4906g.class, str);
    }

    public static EnumC4906g[] values() {
        return (EnumC4906g[]) f18061b.clone();
    }

    static {
        EnumC4906g enumC4906g = new EnumC4906g() { // from class: j$.time.temporal.c
            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: l */
            public final C4919t mo21172l() {
                return C4919t.m21199k(90L, 92L);
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: n */
            public final boolean mo21174n(InterfaceC4912m interfaceC4912m) {
                if (interfaceC4912m.mo20905g(EnumC4900a.DAY_OF_YEAR) && interfaceC4912m.mo20905g(EnumC4900a.MONTH_OF_YEAR) && interfaceC4912m.mo20905g(EnumC4900a.YEAR)) {
                    InterfaceC4915p interfaceC4915p = AbstractC4908i.f18065a;
                    if (AbstractC4843i.m21032p(interfaceC4912m).equals(C4855u.f17955d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: s */
            public final C4919t mo21176s(InterfaceC4912m interfaceC4912m) {
                if (!mo21174n(interfaceC4912m)) {
                    throw new C4918s("Unsupported field: DayOfQuarter");
                }
                long mo20914s = interfaceC4912m.mo20914s(EnumC4906g.QUARTER_OF_YEAR);
                if (mo20914s == 1) {
                    long mo20914s2 = interfaceC4912m.mo20914s(EnumC4900a.YEAR);
                    C4855u.f17955d.getClass();
                    return C4855u.m21053n(mo20914s2) ? C4919t.m21198j(1L, 91L) : C4919t.m21198j(1L, 90L);
                }
                if (mo20914s == 2) {
                    return C4919t.m21198j(1L, 91L);
                }
                if (mo20914s == 3 || mo20914s == 4) {
                    return C4919t.m21198j(1L, 92L);
                }
                return mo21172l();
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: m */
            public final long mo21173m(InterfaceC4912m interfaceC4912m) {
                int[] iArr;
                if (!mo21174n(interfaceC4912m)) {
                    throw new C4918s("Unsupported field: DayOfQuarter");
                }
                int mo20910m = interfaceC4912m.mo20910m(EnumC4900a.DAY_OF_YEAR);
                int mo20910m2 = interfaceC4912m.mo20910m(EnumC4900a.MONTH_OF_YEAR);
                long mo20914s = interfaceC4912m.mo20914s(EnumC4900a.YEAR);
                iArr = EnumC4906g.f18060a;
                int i7 = (mo20910m2 - 1) / 3;
                C4855u.f17955d.getClass();
                return mo20910m - iArr[i7 + (C4855u.m21053n(mo20914s) ? 4 : 0)];
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: o */
            public final Temporal mo21175o(Temporal temporal, long j7) {
                long mo21173m = mo21173m(temporal);
                mo21172l().m21201b(j7, this);
                EnumC4900a enumC4900a = EnumC4900a.DAY_OF_YEAR;
                return temporal.mo20902d((j7 - mo21173m) + temporal.mo20914s(enumC4900a), enumC4900a);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = enumC4906g;
        EnumC4906g enumC4906g2 = new EnumC4906g() { // from class: j$.time.temporal.d
            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: l */
            public final C4919t mo21172l() {
                return C4919t.m21198j(1L, 4L);
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: n */
            public final boolean mo21174n(InterfaceC4912m interfaceC4912m) {
                if (interfaceC4912m.mo20905g(EnumC4900a.MONTH_OF_YEAR)) {
                    InterfaceC4915p interfaceC4915p = AbstractC4908i.f18065a;
                    if (AbstractC4843i.m21032p(interfaceC4912m).equals(C4855u.f17955d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: m */
            public final long mo21173m(InterfaceC4912m interfaceC4912m) {
                if (!mo21174n(interfaceC4912m)) {
                    throw new C4918s("Unsupported field: QuarterOfYear");
                }
                return (interfaceC4912m.mo20914s(EnumC4900a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: s */
            public final C4919t mo21176s(InterfaceC4912m interfaceC4912m) {
                if (!mo21174n(interfaceC4912m)) {
                    throw new C4918s("Unsupported field: QuarterOfYear");
                }
                return mo21172l();
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: o */
            public final Temporal mo21175o(Temporal temporal, long j7) {
                long mo21173m = mo21173m(temporal);
                mo21172l().m21201b(j7, this);
                EnumC4900a enumC4900a = EnumC4900a.MONTH_OF_YEAR;
                return temporal.mo20902d(((j7 - mo21173m) * 3) + temporal.mo20914s(enumC4900a), enumC4900a);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = enumC4906g2;
        EnumC4906g enumC4906g3 = new EnumC4906g() { // from class: j$.time.temporal.e
            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: l */
            public final C4919t mo21172l() {
                return C4919t.m21199k(52L, 53L);
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: n */
            public final boolean mo21174n(InterfaceC4912m interfaceC4912m) {
                if (interfaceC4912m.mo20905g(EnumC4900a.EPOCH_DAY)) {
                    InterfaceC4915p interfaceC4915p = AbstractC4908i.f18065a;
                    if (AbstractC4843i.m21032p(interfaceC4912m).equals(C4855u.f17955d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: s */
            public final C4919t mo21176s(InterfaceC4912m interfaceC4912m) {
                if (!mo21174n(interfaceC4912m)) {
                    throw new C4918s("Unsupported field: WeekOfWeekBasedYear");
                }
                return EnumC4906g.m21182L(C4888i.m21109K(interfaceC4912m));
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: m */
            public final long mo21173m(InterfaceC4912m interfaceC4912m) {
                if (!mo21174n(interfaceC4912m)) {
                    throw new C4918s("Unsupported field: WeekOfWeekBasedYear");
                }
                return EnumC4906g.m21179I(C4888i.m21109K(interfaceC4912m));
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: o */
            public final Temporal mo21175o(Temporal temporal, long j7) {
                mo21172l().m21201b(j7, this);
                return temporal.mo20903e(AbstractC4815a.m20875m(j7, mo21173m(temporal)), ChronoUnit.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC4906g3;
        EnumC4906g enumC4906g4 = new EnumC4906g() { // from class: j$.time.temporal.f
            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: l */
            public final C4919t mo21172l() {
                return EnumC4900a.YEAR.mo21172l();
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: n */
            public final boolean mo21174n(InterfaceC4912m interfaceC4912m) {
                if (interfaceC4912m.mo20905g(EnumC4900a.EPOCH_DAY)) {
                    InterfaceC4915p interfaceC4915p = AbstractC4908i.f18065a;
                    if (AbstractC4843i.m21032p(interfaceC4912m).equals(C4855u.f17955d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: m */
            public final long mo21173m(InterfaceC4912m interfaceC4912m) {
                int m21183M;
                if (!mo21174n(interfaceC4912m)) {
                    throw new C4918s("Unsupported field: WeekBasedYear");
                }
                m21183M = EnumC4906g.m21183M(C4888i.m21109K(interfaceC4912m));
                return m21183M;
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: s */
            public final C4919t mo21176s(InterfaceC4912m interfaceC4912m) {
                if (!mo21174n(interfaceC4912m)) {
                    throw new C4918s("Unsupported field: WeekBasedYear");
                }
                return mo21172l();
            }

            @Override // p256j$.time.temporal.InterfaceC4915p
            /* renamed from: o */
            public final Temporal mo21175o(Temporal temporal, long j7) {
                int m21184N;
                if (!mo21174n(temporal)) {
                    throw new C4918s("Unsupported field: WeekBasedYear");
                }
                int m21200a = EnumC4900a.YEAR.mo21172l().m21200a(j7, EnumC4906g.WEEK_BASED_YEAR);
                C4888i m21109K = C4888i.m21109K(temporal);
                int mo20910m = m21109K.mo20910m(EnumC4900a.DAY_OF_WEEK);
                int m21179I = EnumC4906g.m21179I(m21109K);
                if (m21179I == 53) {
                    m21184N = EnumC4906g.m21184N(m21200a);
                    if (m21184N == 52) {
                        m21179I = 52;
                    }
                }
                return temporal.mo20911n(C4888i.m21113V(m21200a, 1, 4).m21126Z(((m21179I - 1) * 7) + (mo20910m - r6.mo20910m(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = enumC4906g4;
        f18061b = new EnumC4906g[]{enumC4906g, enumC4906g2, enumC4906g3, enumC4906g4};
        f18060a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* renamed from: L */
    static C4919t m21182L(C4888i c4888i) {
        return C4919t.m21198j(1L, m21184N(m21183M(c4888i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static int m21184N(int i7) {
        C4888i m21113V = C4888i.m21113V(i7, 1, 1);
        if (m21113V.m21118M() != EnumC4862e.THURSDAY) {
            return (m21113V.m21118M() == EnumC4862e.WEDNESDAY && m21113V.m21123S()) ? 53 : 52;
        }
        return 53;
    }

    /* renamed from: I */
    static int m21179I(C4888i c4888i) {
        int ordinal = c4888i.m21118M().ordinal();
        int i7 = 1;
        int m21119N = c4888i.m21119N() - 1;
        int i8 = (3 - ordinal) + m21119N;
        int i9 = i8 - ((i8 / 7) * 7);
        int i10 = i9 - 3;
        if (i10 < -3) {
            i10 = i9 + 4;
        }
        if (m21119N < i10) {
            return (int) C4919t.m21198j(1L, m21184N(m21183M(c4888i.m21131f0(180).m21128b0(-1L)))).m21202d();
        }
        int i11 = ((m21119N - i10) / 7) + 1;
        if (i11 != 53 || i10 == -3 || (i10 == -2 && c4888i.m21123S())) {
            i7 = i11;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static int m21183M(C4888i c4888i) {
        int m21121Q = c4888i.m21121Q();
        int m21119N = c4888i.m21119N();
        if (m21119N <= 3) {
            return m21119N - c4888i.m21118M().ordinal() < -2 ? m21121Q - 1 : m21121Q;
        }
        if (m21119N >= 363) {
            return ((m21119N - 363) - (c4888i.m21123S() ? 1 : 0)) - c4888i.m21118M().ordinal() >= 0 ? m21121Q + 1 : m21121Q;
        }
        return m21121Q;
    }
}
