package p256j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.StringUtils;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.chrono.AbstractC4843i;
import p256j$.time.chrono.C4855u;
import p256j$.time.chrono.InterfaceC4836b;
import p256j$.time.chrono.InterfaceC4839e;
import p256j$.time.chrono.InterfaceC4848n;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4918s;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.ChronoUnit;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4912m;
import p256j$.time.temporal.InterfaceC4913n;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.InterfaceC4917r;
import p256j$.time.temporal.Temporal;
import p256j$.time.temporal.TemporalUnit;
import p256j$.util.Objects;
import p272k4.C5410A;

/* renamed from: j$.time.i */
/* loaded from: classes3.dex */
public final class C4888i implements Temporal, InterfaceC4913n, InterfaceC4836b, Serializable {

    /* renamed from: d */
    public static final C4888i f18023d = m21113V(-999999999, 1, 1);

    /* renamed from: e */
    public static final C4888i f18024e = m21113V(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a */
    private final int f18025a;

    /* renamed from: b */
    private final short f18026b;

    /* renamed from: c */
    private final short f18027c;

    @Override // p256j$.time.chrono.InterfaceC4836b
    /* renamed from: E */
    public final InterfaceC4836b mo20989E(long j7, TemporalUnit temporalUnit) {
        return mo20903e(-1L, (ChronoUnit) temporalUnit);
    }

    static {
        m21113V(1970, 1, 1);
    }

    /* renamed from: W */
    public static C4888i m21114W(int i7, EnumC4893n enumC4893n, int i8) {
        EnumC4900a.YEAR.m21170I(i7);
        Objects.requireNonNull(enumC4893n, "month");
        EnumC4900a.DAY_OF_MONTH.m21170I(i8);
        return m21108J(i7, enumC4893n.getValue(), i8);
    }

    /* renamed from: V */
    public static C4888i m21113V(int i7, int i8, int i9) {
        EnumC4900a.YEAR.m21170I(i7);
        EnumC4900a.MONTH_OF_YEAR.m21170I(i8);
        EnumC4900a.DAY_OF_MONTH.m21170I(i9);
        return m21108J(i7, i8, i9);
    }

    /* renamed from: X */
    public static C4888i m21115X(long j7) {
        long j8;
        EnumC4900a.EPOCH_DAY.m21170I(j7);
        long j9 = 719468 + j7;
        if (j9 < 0) {
            long j10 = ((j7 + 719469) / 146097) - 1;
            j8 = j10 * 400;
            j9 += (-j10) * 146097;
        } else {
            j8 = 0;
        }
        long j11 = ((j9 * 400) + 591) / 146097;
        long j12 = j9 - ((j11 / 400) + (((j11 / 4) + (j11 * 365)) - (j11 / 100)));
        if (j12 < 0) {
            j11--;
            j12 = j9 - ((j11 / 400) + (((j11 / 4) + (365 * j11)) - (j11 / 100)));
        }
        int i7 = (int) j12;
        int i8 = ((i7 * 5) + 2) / 153;
        return new C4888i(EnumC4900a.YEAR.m21178z(j11 + j8 + (i8 / 10)), ((i8 + 2) % 12) + 1, (i7 - (((i8 * 306) + 5) / 10)) + 1);
    }

    /* renamed from: K */
    public static C4888i m21109K(InterfaceC4912m interfaceC4912m) {
        Objects.requireNonNull(interfaceC4912m, "temporal");
        C4888i c4888i = (C4888i) interfaceC4912m.mo20915w(AbstractC4911l.m21191f());
        if (c4888i != null) {
            return c4888i;
        }
        throw new C4822c("Unable to obtain LocalDate from TemporalAccessor: " + interfaceC4912m + " of type " + interfaceC4912m.getClass().getName());
    }

    /* renamed from: J */
    private static C4888i m21108J(int i7, int i8, int i9) {
        int i10 = 28;
        if (i9 > 28) {
            if (i8 != 2) {
                i10 = (i8 == 4 || i8 == 6 || i8 == 9 || i8 == 11) ? 30 : 31;
            } else {
                C4855u.f17955d.getClass();
                if (C4855u.m21053n(i7)) {
                    i10 = 29;
                }
            }
            if (i9 > i10) {
                if (i9 == 29) {
                    throw new C4822c("Invalid date 'February 29' as '" + i7 + "' is not a leap year");
                }
                throw new C4822c("Invalid date '" + EnumC4893n.m21155L(i8).name() + StringUtils.SPACE + i9 + "'");
            }
        }
        return new C4888i(i7, i8, i9);
    }

    /* renamed from: c0 */
    private static C4888i m21116c0(int i7, int i8, int i9) {
        if (i8 == 2) {
            C4855u.f17955d.getClass();
            i9 = Math.min(i9, C4855u.m21053n((long) i7) ? 29 : 28);
        } else if (i8 == 4 || i8 == 6 || i8 == 9 || i8 == 11) {
            i9 = Math.min(i9, 30);
        }
        return new C4888i(i7, i8, i9);
    }

    private C4888i(int i7, int i8, int i9) {
        this.f18025a = i7;
        this.f18026b = (short) i8;
        this.f18027c = (short) i9;
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return AbstractC4843i.m21024h(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return interfaceC4915p.mo21176s(this);
        }
        EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
        if (!enumC4900a.mo21177w()) {
            throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
        int i7 = AbstractC4887h.f18021a[enumC4900a.ordinal()];
        if (i7 == 1) {
            return C4919t.m21198j(1L, m21124T());
        }
        if (i7 == 2) {
            return C4919t.m21198j(1L, m21123S() ? 366 : 365);
        }
        if (i7 == 3) {
            return C4919t.m21198j(1L, (EnumC4893n.m21155L(this.f18026b) != EnumC4893n.FEBRUARY || m21123S()) ? 5L : 4L);
        }
        if (i7 != 4) {
            return ((EnumC4900a) interfaceC4915p).mo21172l();
        }
        return C4919t.m21198j(1L, this.f18025a <= 0 ? 1000000000L : 999999999L);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            return m21110L(interfaceC4915p);
        }
        return AbstractC4911l.m21186a(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            if (interfaceC4915p == EnumC4900a.EPOCH_DAY) {
                return mo20997t();
            }
            if (interfaceC4915p == EnumC4900a.PROLEPTIC_MONTH) {
                return m21111P();
            }
            return m21110L(interfaceC4915p);
        }
        return interfaceC4915p.mo21173m(this);
    }

    /* renamed from: L */
    private int m21110L(InterfaceC4915p interfaceC4915p) {
        int i7;
        int i8 = AbstractC4887h.f18021a[((EnumC4900a) interfaceC4915p).ordinal()];
        short s7 = this.f18027c;
        int i9 = this.f18025a;
        switch (i8) {
            case 1:
                return s7;
            case 2:
                return m21119N();
            case 3:
                i7 = (s7 - 1) / 7;
                break;
            case 4:
                return i9 >= 1 ? i9 : 1 - i9;
            case 5:
                return m21118M().getValue();
            case 6:
                i7 = (s7 - 1) % 7;
                break;
            case 7:
                return ((m21119N() - 1) % 7) + 1;
            case 8:
                throw new C4918s("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((m21119N() - 1) / 7) + 1;
            case 10:
                return this.f18026b;
            case 11:
                throw new C4918s("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return i9;
            case 13:
                return i9 >= 1 ? 1 : 0;
            default:
                throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
        return i7 + 1;
    }

    /* renamed from: P */
    private long m21111P() {
        return ((this.f18025a * 12) + this.f18026b) - 1;
    }

    @Override // p256j$.time.chrono.InterfaceC4836b
    /* renamed from: a */
    public final InterfaceC4848n mo20996a() {
        return C4855u.f17955d;
    }

    /* renamed from: Q */
    public final int m21121Q() {
        return this.f18025a;
    }

    /* renamed from: O */
    public final int m21120O() {
        return this.f18026b;
    }

    /* renamed from: N */
    public final int m21119N() {
        return (EnumC4893n.m21155L(this.f18026b).m21156I(m21123S()) + this.f18027c) - 1;
    }

    /* renamed from: M */
    public final EnumC4862e m21118M() {
        return EnumC4862e.m21058I(((int) AbstractC4815a.m20872j(mo20997t() + 3, 7)) + 1);
    }

    /* renamed from: S */
    public final boolean m21123S() {
        C4855u c4855u = C4855u.f17955d;
        long j7 = this.f18025a;
        c4855u.getClass();
        return C4855u.m21053n(j7);
    }

    /* renamed from: T */
    public final int m21124T() {
        short s7 = this.f18026b;
        return s7 != 2 ? (s7 == 4 || s7 == 6 || s7 == 9 || s7 == 11) ? 30 : 31 : m21123S() ? 29 : 28;
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final C4888i mo20911n(InterfaceC4913n interfaceC4913n) {
        if (interfaceC4913n instanceof C4888i) {
            return (C4888i) interfaceC4913n;
        }
        return (C4888i) interfaceC4913n.mo20927z(this);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final C4888i mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return (C4888i) interfaceC4915p.mo21175o(this, j7);
        }
        EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
        enumC4900a.m21170I(j7);
        int i7 = AbstractC4887h.f18021a[enumC4900a.ordinal()];
        short s7 = this.f18027c;
        short s8 = this.f18026b;
        int i8 = this.f18025a;
        switch (i7) {
            case 1:
                int i9 = (int) j7;
                return s7 == i9 ? this : m21113V(i8, s8, i9);
            case 2:
                return m21131f0((int) j7);
            case 3:
                return m21126Z(AbstractC4815a.m20874l(j7 - mo20914s(EnumC4900a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i8 < 1) {
                    j7 = 1 - j7;
                }
                return m21132g0((int) j7);
            case 5:
                return m21126Z(j7 - m21118M().getValue());
            case 6:
                return m21126Z(j7 - mo20914s(EnumC4900a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return m21126Z(j7 - mo20914s(EnumC4900a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return m21115X(j7);
            case 9:
                return m21126Z(AbstractC4815a.m20874l(j7 - mo20914s(EnumC4900a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i10 = (int) j7;
                if (s8 == i10) {
                    return this;
                }
                EnumC4900a.MONTH_OF_YEAR.m21170I(i10);
                return m21116c0(i8, i10, s7);
            case 11:
                return m21127a0(j7 - m21111P());
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return m21132g0((int) j7);
            case 13:
                return mo20914s(EnumC4900a.ERA) == j7 ? this : m21132g0(1 - i8);
            default:
                throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
    }

    /* renamed from: g0 */
    public final C4888i m21132g0(int i7) {
        if (this.f18025a == i7) {
            return this;
        }
        EnumC4900a.YEAR.m21170I(i7);
        return m21116c0(i7, this.f18026b, this.f18027c);
    }

    /* renamed from: f0 */
    public final C4888i m21131f0(int i7) {
        if (m21119N() == i7) {
            return this;
        }
        EnumC4900a enumC4900a = EnumC4900a.YEAR;
        int i8 = this.f18025a;
        long j7 = i8;
        enumC4900a.m21170I(j7);
        EnumC4900a.DAY_OF_YEAR.m21170I(i7);
        C4855u.f17955d.getClass();
        boolean m21053n = C4855u.m21053n(j7);
        if (i7 == 366 && !m21053n) {
            throw new C4822c("Invalid date 'DayOfYear 366' as '" + i8 + "' is not a leap year");
        }
        EnumC4893n m21155L = EnumC4893n.m21155L(((i7 - 1) / 31) + 1);
        if (i7 > (m21155L.m21157J(m21053n) + m21155L.m21156I(m21053n)) - 1) {
            m21155L = m21155L.m21159M();
        }
        return new C4888i(i8, m21155L.getValue(), (i7 - m21155L.m21156I(m21053n)) + 1);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C4888i mo20903e(long j7, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C4888i) temporalUnit.mo21168l(this, j7);
        }
        switch (AbstractC4887h.f18022b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m21126Z(j7);
            case 2:
                return m21126Z(AbstractC4815a.m20874l(j7, 7));
            case 3:
                return m21127a0(j7);
            case 4:
                return m21128b0(j7);
            case 5:
                return m21128b0(AbstractC4815a.m20874l(j7, 10));
            case 6:
                return m21128b0(AbstractC4815a.m20874l(j7, 100));
            case 7:
                return m21128b0(AbstractC4815a.m20874l(j7, PipesIterator.DEFAULT_QUEUE_SIZE));
            case 8:
                EnumC4900a enumC4900a = EnumC4900a.ERA;
                return mo20902d(AbstractC4815a.m20868f(mo20914s(enumC4900a), j7), enumC4900a);
            default:
                throw new C4918s("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: b0 */
    public final C4888i m21128b0(long j7) {
        return j7 == 0 ? this : m21116c0(EnumC4900a.YEAR.m21178z(this.f18025a + j7), this.f18026b, this.f18027c);
    }

    /* renamed from: a0 */
    public final C4888i m21127a0(long j7) {
        if (j7 == 0) {
            return this;
        }
        long j8 = (this.f18025a * 12) + (this.f18026b - 1) + j7;
        long j9 = 12;
        return m21116c0(EnumC4900a.YEAR.m21178z(AbstractC4815a.m20873k(j8, j9)), ((int) AbstractC4815a.m20872j(j8, j9)) + 1, this.f18027c);
    }

    /* renamed from: Z */
    public final C4888i m21126Z(long j7) {
        if (j7 == 0) {
            return this;
        }
        long j8 = this.f18027c + j7;
        if (j8 > 0) {
            short s7 = this.f18026b;
            int i7 = this.f18025a;
            if (j8 <= 28) {
                return new C4888i(i7, s7, (int) j8);
            }
            if (j8 <= 59) {
                long m21124T = m21124T();
                if (j8 <= m21124T) {
                    return new C4888i(i7, s7, (int) j8);
                }
                if (s7 < 12) {
                    return new C4888i(i7, s7 + 1, (int) (j8 - m21124T));
                }
                int i8 = i7 + 1;
                EnumC4900a.YEAR.m21170I(i8);
                return new C4888i(i8, 1, (int) (j8 - m21124T));
            }
        }
        return m21115X(AbstractC4815a.m20868f(mo20997t(), j7));
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: l */
    public final Temporal mo20909l(long j7, ChronoUnit chronoUnit) {
        return j7 == Long.MIN_VALUE ? mo20903e(Long.MAX_VALUE, chronoUnit).mo20903e(1L, chronoUnit) : mo20903e(-j7, chronoUnit);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final Object mo20915w(InterfaceC4917r interfaceC4917r) {
        return interfaceC4917r == AbstractC4911l.m21191f() ? this : AbstractC4843i.m21026j(this, interfaceC4917r);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        return AbstractC4843i.m21017a(this, temporal);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: f */
    public final long mo20904f(Temporal temporal, TemporalUnit temporalUnit) {
        C4888i m21109K = m21109K(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, m21109K);
        }
        switch (AbstractC4887h.f18022b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m21109K.mo20997t() - mo20997t();
            case 2:
                return (m21109K.mo20997t() - mo20997t()) / 7;
            case 3:
                return m21112U(m21109K);
            case 4:
                return m21112U(m21109K) / 12;
            case 5:
                return m21112U(m21109K) / 120;
            case 6:
                return m21112U(m21109K) / 1200;
            case 7:
                return m21112U(m21109K) / 12000;
            case 8:
                EnumC4900a enumC4900a = EnumC4900a.ERA;
                return m21109K.mo20914s(enumC4900a) - mo20914s(enumC4900a);
            default:
                throw new C4918s("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: U */
    private long m21112U(C4888i c4888i) {
        return (((c4888i.m21111P() * 32) + c4888i.f18027c) - ((m21111P() * 32) + this.f18027c)) / 32;
    }

    @Override // p256j$.time.chrono.InterfaceC4836b
    /* renamed from: u */
    public final InterfaceC4839e mo20998u(C4891l c4891l) {
        return LocalDateTime.m20931Q(this, c4891l);
    }

    @Override // p256j$.time.chrono.InterfaceC4836b
    /* renamed from: t */
    public final long mo20997t() {
        long j7 = this.f18025a;
        long j8 = this.f18026b;
        long j9 = 365 * j7;
        long j10 = (((367 * j8) - 362) / 12) + (j7 >= 0 ? ((j7 + 399) / 400) + (((3 + j7) / 4) - ((99 + j7) / 100)) + j9 : j9 - ((j7 / (-400)) + ((j7 / (-4)) - (j7 / (-100))))) + (this.f18027c - 1);
        if (j8 > 2) {
            j10 = !m21123S() ? j10 - 2 : j10 - 1;
        }
        return j10 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC4836b interfaceC4836b) {
        if (interfaceC4836b instanceof C4888i) {
            return m21117I((C4888i) interfaceC4836b);
        }
        return AbstractC4843i.m21018b(this, interfaceC4836b);
    }

    /* renamed from: I */
    final int m21117I(C4888i c4888i) {
        int i7 = this.f18025a - c4888i.f18025a;
        if (i7 != 0) {
            return i7;
        }
        int i8 = this.f18026b - c4888i.f18026b;
        return i8 == 0 ? this.f18027c - c4888i.f18027c : i8;
    }

    /* renamed from: R */
    public final boolean m21122R(InterfaceC4836b interfaceC4836b) {
        return interfaceC4836b instanceof C4888i ? m21117I((C4888i) interfaceC4836b) < 0 : mo20997t() < interfaceC4836b.mo20997t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4888i) && m21117I((C4888i) obj) == 0;
    }

    @Override // p256j$.time.chrono.InterfaceC4836b
    public final int hashCode() {
        int i7 = this.f18025a;
        return (((i7 << 11) + (this.f18026b << 6)) + this.f18027c) ^ (i7 & (-2048));
    }

    @Override // p256j$.time.chrono.InterfaceC4836b
    public final String toString() {
        int i7 = this.f18025a;
        int abs = Math.abs(i7);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i7 > 9999) {
                sb.append('+');
            }
            sb.append(i7);
        } else if (i7 < 0) {
            sb.append(i7 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i7 + PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS);
            sb.deleteCharAt(0);
        }
        short s7 = this.f18026b;
        sb.append(s7 < 10 ? "-0" : "-");
        sb.append((int) s7);
        short s8 = this.f18027c;
        sb.append(s8 < 10 ? "-0" : "-");
        sb.append((int) s8);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C4920u((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: h0 */
    final void m21133h0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f18025a);
        dataOutput.writeByte(this.f18026b);
        dataOutput.writeByte(this.f18027c);
    }
}
