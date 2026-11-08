package p256j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.chrono.AbstractC4843i;
import p256j$.time.format.DateTimeFormatter;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4918s;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.ChronoUnit;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4913n;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.InterfaceC4917r;
import p256j$.time.temporal.Temporal;
import p256j$.time.temporal.TemporalUnit;
import p256j$.util.Objects;

/* loaded from: classes3.dex */
public final class Instant implements Temporal, InterfaceC4913n, Comparable<Instant>, Serializable {

    /* renamed from: c */
    public static final Instant f17882c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a */
    private final long f17883a;

    /* renamed from: b */
    private final int f17884b;

    public static Instant now() {
        C4820a.f17898b.getClass();
        return m20918M(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.f17883a, instant2.f17883a);
        return compare != 0 ? compare : this.f17884b - instant2.f17884b;
    }

    static {
        m20919N(-31557014167219200L, 0L);
        m20919N(31556889864403199L, 999999999L);
    }

    /* renamed from: N */
    public static Instant m20919N(long j7, long j8) {
        return m20916I(AbstractC4815a.m20868f(j7, AbstractC4815a.m20873k(j8, 1000000000L)), (int) AbstractC4815a.m20872j(j8, 1000000000L));
    }

    /* renamed from: M */
    public static Instant m20918M(long j7) {
        long j8 = PipesIterator.DEFAULT_QUEUE_SIZE;
        return m20916I(AbstractC4815a.m20873k(j7, j8), ((int) AbstractC4815a.m20872j(j7, j8)) * 1000000);
    }

    /* renamed from: J */
    public static Instant m20917J(Temporal temporal) {
        if (temporal instanceof Instant) {
            return (Instant) temporal;
        }
        Objects.requireNonNull(temporal, "temporal");
        try {
            return m20919N(temporal.mo20914s(EnumC4900a.INSTANT_SECONDS), temporal.mo20910m(EnumC4900a.NANO_OF_SECOND));
        } catch (C4822c e7) {
            throw new C4822c("Unable to obtain Instant from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e7);
        }
    }

    /* renamed from: I */
    private static Instant m20916I(long j7, int i7) {
        if ((i7 | j7) == 0) {
            return f17882c;
        }
        if (j7 < -31557014167219200L || j7 > 31556889864403199L) {
            throw new C4822c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j7, i7);
    }

    private Instant(long j7, int i7) {
        this.f17883a = j7;
        this.f17884b = i7;
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return interfaceC4915p instanceof EnumC4900a ? interfaceC4915p == EnumC4900a.INSTANT_SECONDS || interfaceC4915p == EnumC4900a.NANO_OF_SECOND || interfaceC4915p == EnumC4900a.MICRO_OF_SECOND || interfaceC4915p == EnumC4900a.MILLI_OF_SECOND : interfaceC4915p != null && interfaceC4915p.mo21174n(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        return AbstractC4911l.m21189d(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return AbstractC4911l.m21189d(this, interfaceC4915p).m21200a(interfaceC4915p.mo21173m(this), interfaceC4915p);
        }
        int i7 = AbstractC4886g.f18019a[((EnumC4900a) interfaceC4915p).ordinal()];
        int i8 = this.f17884b;
        if (i7 == 1) {
            return i8;
        }
        if (i7 == 2) {
            return i8 / PipesIterator.DEFAULT_QUEUE_SIZE;
        }
        if (i7 == 3) {
            return i8 / 1000000;
        }
        if (i7 == 4) {
            EnumC4900a.INSTANT_SECONDS.m21178z(this.f17883a);
        }
        throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        int i7;
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return interfaceC4915p.mo21173m(this);
        }
        int i8 = AbstractC4886g.f18019a[((EnumC4900a) interfaceC4915p).ordinal()];
        int i9 = this.f17884b;
        if (i8 == 1) {
            return i9;
        }
        if (i8 == 2) {
            i7 = i9 / PipesIterator.DEFAULT_QUEUE_SIZE;
        } else {
            if (i8 != 3) {
                if (i8 == 4) {
                    return this.f17883a;
                }
                throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
            }
            i7 = i9 / 1000000;
        }
        return i7;
    }

    /* renamed from: K */
    public final long m20922K() {
        return this.f17883a;
    }

    /* renamed from: L */
    public final int m20923L() {
        return this.f17884b;
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: d */
    public final Temporal mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return (Instant) interfaceC4915p.mo21175o(this, j7);
        }
        EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
        enumC4900a.m21170I(j7);
        int i7 = AbstractC4886g.f18019a[enumC4900a.ordinal()];
        int i8 = this.f17884b;
        long j8 = this.f17883a;
        if (i7 != 1) {
            if (i7 == 2) {
                int i9 = ((int) j7) * PipesIterator.DEFAULT_QUEUE_SIZE;
                if (i9 != i8) {
                    return m20916I(j8, i9);
                }
            } else if (i7 == 3) {
                int i10 = ((int) j7) * 1000000;
                if (i10 != i8) {
                    return m20916I(j8, i10);
                }
            } else {
                if (i7 != 4) {
                    throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
                }
                if (j7 != j8) {
                    return m20916I(j7, i8);
                }
            }
        } else if (j7 != i8) {
            return m20916I(j8, (int) j7);
        }
        return this;
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        C4863f mo21169m = temporalUnit.mo21169m();
        if (mo21169m.m21063m() > 86400) {
            throw new C4918s("Unit is too large to be used for truncation");
        }
        long m21064w = mo21169m.m21064w();
        if (86400000000000L % m21064w != 0) {
            throw new C4918s("Unit must divide into a standard day without remainder");
        }
        long j7 = ((this.f17883a % 86400) * 1000000000) + this.f17884b;
        return m20920O(0L, (AbstractC4815a.m20873k(j7, m21064w) * m21064w) - j7);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final Instant mo20903e(long j7, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.mo21168l(this, j7);
        }
        switch (AbstractC4886g.f18020b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m20920O(0L, j7);
            case 2:
                return m20920O(j7 / 1000000, (j7 % 1000000) * 1000);
            case 3:
                return m20920O(j7 / 1000, (j7 % 1000) * 1000000);
            case 4:
                return m20920O(j7, 0L);
            case 5:
                return m20920O(AbstractC4815a.m20874l(j7, 60), 0L);
            case 6:
                return m20920O(AbstractC4815a.m20874l(j7, 3600), 0L);
            case 7:
                return m20920O(AbstractC4815a.m20874l(j7, 43200), 0L);
            case 8:
                return m20920O(AbstractC4815a.m20874l(j7, 86400), 0L);
            default:
                throw new C4918s("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: O */
    private Instant m20920O(long j7, long j8) {
        if ((j7 | j8) == 0) {
            return this;
        }
        return m20919N(AbstractC4815a.m20868f(AbstractC4815a.m20868f(this.f17883a, j7), j8 / 1000000000), this.f17884b + (j8 % 1000000000));
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: l */
    public final Temporal mo20909l(long j7, ChronoUnit chronoUnit) {
        return j7 == Long.MIN_VALUE ? mo20903e(Long.MAX_VALUE, chronoUnit).mo20903e(1L, chronoUnit) : mo20903e(-j7, chronoUnit);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final Object mo20915w(InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21194i()) {
            return ChronoUnit.NANOS;
        }
        if (interfaceC4917r == AbstractC4911l.m21190e() || interfaceC4917r == AbstractC4911l.m21196k() || interfaceC4917r == AbstractC4911l.m21195j() || interfaceC4917r == AbstractC4911l.m21193h() || interfaceC4917r == AbstractC4911l.m21191f() || interfaceC4917r == AbstractC4911l.m21192g()) {
            return null;
        }
        return interfaceC4917r.mo21070a(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        return temporal.mo20902d(this.f17883a, EnumC4900a.INSTANT_SECONDS).mo20902d(this.f17884b, EnumC4900a.NANO_OF_SECOND);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: f */
    public final long mo20904f(Temporal temporal, TemporalUnit temporalUnit) {
        Instant m20917J = m20917J(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            int i7 = AbstractC4886g.f18020b[((ChronoUnit) temporalUnit).ordinal()];
            int i8 = this.f17884b;
            long j7 = this.f17883a;
            switch (i7) {
                case 1:
                    return AbstractC4815a.m20868f(AbstractC4815a.m20874l(AbstractC4815a.m20875m(m20917J.f17883a, j7), 1000000000L), m20917J.f17884b - i8);
                case 2:
                    return AbstractC4815a.m20868f(AbstractC4815a.m20874l(AbstractC4815a.m20875m(m20917J.f17883a, j7), 1000000000L), m20917J.f17884b - i8) / 1000;
                case 3:
                    return AbstractC4815a.m20875m(m20917J.m20925R(), m20925R());
                case 4:
                    return m20921Q(m20917J);
                case 5:
                    return m20921Q(m20917J) / 60;
                case 6:
                    return m20921Q(m20917J) / 3600;
                case 7:
                    return m20921Q(m20917J) / 43200;
                case 8:
                    return m20921Q(m20917J) / 86400;
                default:
                    throw new C4918s("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, m20917J);
    }

    /* renamed from: Q */
    private long m20921Q(Instant instant) {
        long m20875m = AbstractC4815a.m20875m(instant.f17883a, this.f17883a);
        long j7 = instant.f17884b - this.f17884b;
        return (m20875m <= 0 || j7 >= 0) ? (m20875m >= 0 || j7 <= 0) ? m20875m : m20875m + 1 : m20875m - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m20952J(this, zoneOffset);
    }

    /* renamed from: R */
    public final long m20925R() {
        long j7 = this.f17883a;
        return (j7 >= 0 || this.f17884b <= 0) ? AbstractC4815a.m20868f(AbstractC4815a.m20874l(j7, PipesIterator.DEFAULT_QUEUE_SIZE), r5 / 1000000) : AbstractC4815a.m20868f(AbstractC4815a.m20874l(j7 + 1, PipesIterator.DEFAULT_QUEUE_SIZE), (r5 / 1000000) - PipesIterator.DEFAULT_QUEUE_SIZE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f17883a == instant.f17883a && this.f17884b == instant.f17884b;
    }

    public final int hashCode() {
        long j7 = this.f17883a;
        return (this.f17884b * 51) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return DateTimeFormatter.f17970e.m21065a(this);
    }

    private Object writeReplace() {
        return new C4920u((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: S */
    final void m20926S(DataOutput dataOutput) {
        dataOutput.writeLong(this.f17883a);
        dataOutput.writeInt(this.f17884b);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return (Instant) AbstractC4843i.m21017a(c4888i, this);
    }
}
