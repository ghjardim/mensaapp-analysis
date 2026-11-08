package p256j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.chrono.AbstractC4843i;
import p256j$.time.chrono.InterfaceC4836b;
import p256j$.time.chrono.InterfaceC4839e;
import p256j$.time.chrono.InterfaceC4845k;
import p256j$.time.chrono.InterfaceC4848n;
import p256j$.time.format.DateTimeFormatter;
import p256j$.time.temporal.AbstractC4911l;
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
public final class LocalDateTime implements Temporal, InterfaceC4913n, InterfaceC4839e, Serializable {

    /* renamed from: c */
    public static final LocalDateTime f17885c = m20931Q(C4888i.f18023d, C4891l.f18031e);

    /* renamed from: d */
    public static final LocalDateTime f17886d = m20931Q(C4888i.f18024e, C4891l.f18032f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a */
    private final C4888i f17887a;

    /* renamed from: b */
    private final C4891l f17888b;

    @Override // p256j$.time.chrono.InterfaceC4839e
    /* renamed from: c */
    public final InterfaceC4836b mo20949c() {
        return this.f17887a;
    }

    @Override // p256j$.time.chrono.InterfaceC4839e
    /* renamed from: a */
    public final InterfaceC4848n mo20947a() {
        return ((C4888i) mo20949c()).mo20996a();
    }

    @Override // p256j$.time.chrono.InterfaceC4839e
    /* renamed from: p */
    public final InterfaceC4845k mo20950p(ZoneOffset zoneOffset) {
        return C4819B.m20890K(this, zoneOffset, null);
    }

    /* renamed from: P */
    public static LocalDateTime m20930P(int i7) {
        return new LocalDateTime(C4888i.m21113V(i7, 12, 31), C4891l.m21137P(0));
    }

    /* renamed from: Q */
    public static LocalDateTime m20931Q(C4888i c4888i, C4891l c4891l) {
        Objects.requireNonNull(c4888i, "date");
        Objects.requireNonNull(c4891l, "time");
        return new LocalDateTime(c4888i, c4891l);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        return temporal.mo20902d(((C4888i) mo20949c()).mo20997t(), EnumC4900a.EPOCH_DAY).mo20902d(mo20948b().m21150Y(), EnumC4900a.NANO_OF_DAY);
    }

    /* renamed from: R */
    public static LocalDateTime m20932R(long j7, int i7, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        long j8 = i7;
        EnumC4900a.NANO_OF_SECOND.m21170I(j8);
        return new LocalDateTime(C4888i.m21115X(AbstractC4815a.m20873k(j7 + zoneOffset.m20971Q(), 86400)), C4891l.m21138Q((((int) AbstractC4815a.m20872j(r5, r7)) * 1000000000) + j8));
    }

    /* renamed from: J */
    public static LocalDateTime m20929J(Temporal temporal) {
        if (temporal instanceof LocalDateTime) {
            return (LocalDateTime) temporal;
        }
        if (temporal instanceof C4819B) {
            return ((C4819B) temporal).m20896N();
        }
        if (temporal instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporal).toLocalDateTime();
        }
        try {
            return new LocalDateTime(C4888i.m21109K(temporal), C4891l.m21135K(temporal));
        } catch (C4822c e7) {
            throw new C4822c("Unable to obtain LocalDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e7);
        }
    }

    private LocalDateTime(C4888i c4888i, C4891l c4891l) {
        this.f17887a = c4888i;
        this.f17888b = c4891l;
    }

    /* renamed from: Y */
    private LocalDateTime m20934Y(C4888i c4888i, C4891l c4891l) {
        return (this.f17887a == c4888i && this.f17888b == c4891l) ? this : new LocalDateTime(c4888i, c4891l);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return interfaceC4915p != null && interfaceC4915p.mo21174n(this);
        }
        EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
        return enumC4900a.mo21177w() || enumC4900a.m21171J();
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            if (((EnumC4900a) interfaceC4915p).m21171J()) {
                C4891l c4891l = this.f17888b;
                c4891l.getClass();
                return AbstractC4911l.m21189d(c4891l, interfaceC4915p);
            }
            return this.f17887a.mo20912o(interfaceC4915p);
        }
        return interfaceC4915p.mo21176s(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            return ((EnumC4900a) interfaceC4915p).m21171J() ? this.f17888b.mo20910m(interfaceC4915p) : this.f17887a.mo20910m(interfaceC4915p);
        }
        return AbstractC4911l.m21186a(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            return ((EnumC4900a) interfaceC4915p).m21171J() ? this.f17888b.mo20914s(interfaceC4915p) : this.f17887a.mo20914s(interfaceC4915p);
        }
        return interfaceC4915p.mo21173m(this);
    }

    /* renamed from: I */
    private int m20928I(LocalDateTime localDateTime) {
        int m21117I = this.f17887a.m21117I(localDateTime.f17887a);
        return m21117I == 0 ? this.f17888b.compareTo(localDateTime.f17888b) : m21117I;
    }

    /* renamed from: V */
    public final C4888i m20943V() {
        return this.f17887a;
    }

    /* renamed from: M */
    public final int m20938M() {
        return this.f17887a.m21121Q();
    }

    @Override // p256j$.time.chrono.InterfaceC4839e
    /* renamed from: b */
    public final C4891l mo20948b() {
        return this.f17888b;
    }

    /* renamed from: L */
    public final int m20937L() {
        return this.f17888b.m21144O();
    }

    /* renamed from: K */
    public final int m20936K() {
        return this.f17888b.m21143N();
    }

    /* renamed from: X */
    public final LocalDateTime m20945X(C4888i c4888i) {
        return m20934Y(c4888i, this.f17888b);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return m20934Y(c4888i, this.f17888b);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            boolean m21171J = ((EnumC4900a) interfaceC4915p).m21171J();
            C4891l c4891l = this.f17888b;
            C4888i c4888i = this.f17887a;
            if (m21171J) {
                return m20934Y(c4888i, c4891l.mo20902d(j7, interfaceC4915p));
            }
            return m20934Y(c4888i.mo20902d(j7, interfaceC4915p), c4891l);
        }
        return (LocalDateTime) interfaceC4915p.mo21175o(this, j7);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime mo20903e(long j7, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            int i7 = AbstractC4889j.f18028a[((ChronoUnit) temporalUnit).ordinal()];
            C4891l c4891l = this.f17888b;
            C4888i c4888i = this.f17887a;
            switch (i7) {
                case 1:
                    return m20933U(this.f17887a, 0L, 0L, 0L, j7);
                case 2:
                    LocalDateTime m20934Y = m20934Y(c4888i.m21126Z(j7 / 86400000000L), c4891l);
                    return m20934Y.m20933U(m20934Y.f17887a, 0L, 0L, 0L, (j7 % 86400000000L) * 1000);
                case 3:
                    LocalDateTime m20934Y2 = m20934Y(c4888i.m21126Z(j7 / 86400000), c4891l);
                    return m20934Y2.m20933U(m20934Y2.f17887a, 0L, 0L, 0L, (j7 % 86400000) * 1000000);
                case 4:
                    return m20942T(j7);
                case 5:
                    return m20933U(this.f17887a, 0L, j7, 0L, 0L);
                case 6:
                    return m20933U(this.f17887a, j7, 0L, 0L, 0L);
                case 7:
                    LocalDateTime m20934Y3 = m20934Y(c4888i.m21126Z(j7 / 256), c4891l);
                    return m20934Y3.m20933U(m20934Y3.f17887a, (j7 % 256) * 12, 0L, 0L, 0L);
                default:
                    return m20934Y(c4888i.mo20903e(j7, temporalUnit), c4891l);
            }
        }
        return (LocalDateTime) temporalUnit.mo21168l(this, j7);
    }

    /* renamed from: T */
    public final LocalDateTime m20942T(long j7) {
        return m20933U(this.f17887a, 0L, 0L, j7, 0L);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: l */
    public final Temporal mo20909l(long j7, ChronoUnit chronoUnit) {
        return j7 == Long.MIN_VALUE ? mo20903e(Long.MAX_VALUE, chronoUnit).mo20903e(1L, chronoUnit) : mo20903e(-j7, chronoUnit);
    }

    /* renamed from: U */
    private LocalDateTime m20933U(C4888i c4888i, long j7, long j8, long j9, long j10) {
        long j11 = j7 | j8 | j9 | j10;
        C4891l c4891l = this.f17888b;
        if (j11 == 0) {
            return m20934Y(c4888i, c4891l);
        }
        long j12 = j7 / 24;
        long j13 = j12 + (j8 / 1440) + (j9 / 86400) + (j10 / 86400000000000L);
        long j14 = 1;
        long j15 = ((j7 % 24) * 3600000000000L) + ((j8 % 1440) * 60000000000L) + ((j9 % 86400) * 1000000000) + (j10 % 86400000000000L);
        long m21150Y = c4891l.m21150Y();
        long j16 = (j15 * j14) + m21150Y;
        long m20873k = AbstractC4815a.m20873k(j16, 86400000000000L) + (j13 * j14);
        long m20872j = AbstractC4815a.m20872j(j16, 86400000000000L);
        if (m20872j != m21150Y) {
            c4891l = C4891l.m21138Q(m20872j);
        }
        return m20934Y(c4888i.m21126Z(m20873k), c4891l);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final Object mo20915w(InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21191f()) {
            return this.f17887a;
        }
        return AbstractC4843i.m21027k(this, interfaceC4917r);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: f */
    public final long mo20904f(Temporal temporal, TemporalUnit temporalUnit) {
        C4888i c4888i;
        long j7;
        long j8;
        LocalDateTime m20929J = m20929J(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, m20929J);
        }
        boolean z6 = ((ChronoUnit) temporalUnit).compareTo(ChronoUnit.DAYS) < 0;
        C4891l c4891l = this.f17888b;
        C4888i c4888i2 = this.f17887a;
        if (!z6) {
            C4888i c4888i3 = m20929J.f17887a;
            c4888i3.getClass();
            boolean z7 = c4888i2 instanceof C4888i;
            C4891l c4891l2 = m20929J.f17888b;
            if (!z7 ? c4888i3.mo20997t() > c4888i2.mo20997t() : c4888i3.m21117I(c4888i2) > 0) {
                if (c4891l2.compareTo(c4891l) < 0) {
                    c4888i = c4888i3.m21126Z(-1L);
                    return c4888i2.mo20904f(c4888i, temporalUnit);
                }
            }
            boolean m21122R = c4888i3.m21122R(c4888i2);
            c4888i = c4888i3;
            if (m21122R) {
                c4888i = c4888i3;
                if (c4891l2.compareTo(c4891l) > 0) {
                    c4888i = c4888i3.m21126Z(1L);
                }
            }
            return c4888i2.mo20904f(c4888i, temporalUnit);
        }
        C4888i c4888i4 = m20929J.f17887a;
        c4888i2.getClass();
        long mo20997t = c4888i4.mo20997t() - c4888i2.mo20997t();
        C4891l c4891l3 = m20929J.f17888b;
        if (mo20997t == 0) {
            return c4891l.mo20904f(c4891l3, temporalUnit);
        }
        long m21150Y = c4891l3.m21150Y() - c4891l.m21150Y();
        if (mo20997t > 0) {
            j7 = mo20997t - 1;
            j8 = m21150Y + 86400000000000L;
        } else {
            j7 = mo20997t + 1;
            j8 = m21150Y - 86400000000000L;
        }
        switch (AbstractC4889j.f18028a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                j7 = AbstractC4815a.m20874l(j7, 86400000000000L);
                break;
            case 2:
                j7 = AbstractC4815a.m20874l(j7, 86400000000L);
                j8 /= 1000;
                break;
            case 3:
                j7 = AbstractC4815a.m20874l(j7, 86400000L);
                j8 /= 1000000;
                break;
            case 4:
                j7 = AbstractC4815a.m20874l(j7, 86400);
                j8 /= 1000000000;
                break;
            case 5:
                j7 = AbstractC4815a.m20874l(j7, 1440);
                j8 /= 60000000000L;
                break;
            case 6:
                j7 = AbstractC4815a.m20874l(j7, 24);
                j8 /= 3600000000000L;
                break;
            case 7:
                j7 = AbstractC4815a.m20874l(j7, 2);
                j8 /= 43200000000000L;
                break;
        }
        return AbstractC4815a.m20868f(j7, j8);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.m21065a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC4839e interfaceC4839e) {
        if (interfaceC4839e instanceof LocalDateTime) {
            return m20928I((LocalDateTime) interfaceC4839e);
        }
        return AbstractC4843i.m21019c(this, interfaceC4839e);
    }

    /* renamed from: N */
    public final boolean m20939N(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return m20928I(localDateTime) > 0;
        }
        long mo20997t = this.f17887a.mo20997t();
        long mo20997t2 = localDateTime.f17887a.mo20997t();
        return mo20997t > mo20997t2 || (mo20997t == mo20997t2 && this.f17888b.m21150Y() > localDateTime.f17888b.m21150Y());
    }

    /* renamed from: O */
    public final boolean m20940O(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return m20928I(localDateTime) < 0;
        }
        long mo20997t = this.f17887a.mo20997t();
        long mo20997t2 = localDateTime.f17887a.mo20997t();
        return mo20997t < mo20997t2 || (mo20997t == mo20997t2 && this.f17888b.m21150Y() < localDateTime.f17888b.m21150Y());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f17887a.equals(localDateTime.f17887a) && this.f17888b.equals(localDateTime.f17888b);
    }

    public final int hashCode() {
        return this.f17887a.hashCode() ^ this.f17888b.hashCode();
    }

    public final String toString() {
        return this.f17887a.toString() + "T" + this.f17888b.toString();
    }

    private Object writeReplace() {
        return new C4920u((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: Z */
    final void m20946Z(DataOutput dataOutput) {
        this.f17887a.m21133h0(dataOutput);
        this.f17888b.m21154c0(dataOutput);
    }
}
