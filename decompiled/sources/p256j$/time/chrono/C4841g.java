package p256j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.C4888i;
import p256j$.time.C4891l;
import p256j$.time.Instant;
import p256j$.time.ZoneOffset;
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

/* renamed from: j$.time.chrono.g */
/* loaded from: classes3.dex */
final class C4841g implements InterfaceC4839e, Temporal, InterfaceC4913n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a */
    private final transient InterfaceC4836b f17923a;

    /* renamed from: b */
    private final transient C4891l f17924b;

    @Override // java.lang.Comparable
    /* renamed from: A */
    public final /* synthetic */ int compareTo(InterfaceC4839e interfaceC4839e) {
        return AbstractC4843i.m21019c(this, interfaceC4839e);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final /* synthetic */ Object mo20915w(InterfaceC4917r interfaceC4917r) {
        return AbstractC4843i.m21027k(this, interfaceC4917r);
    }

    /* renamed from: J */
    static C4841g m21010J(InterfaceC4836b interfaceC4836b, C4891l c4891l) {
        return new C4841g(interfaceC4836b, c4891l);
    }

    /* renamed from: I */
    static C4841g m21009I(InterfaceC4848n interfaceC4848n, Temporal temporal) {
        C4841g c4841g = (C4841g) temporal;
        if (interfaceC4848n.equals(c4841g.f17923a.mo20996a())) {
            return c4841g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC4848n.mo20984k() + ", actual: " + c4841g.f17923a.mo20996a().mo20984k());
    }

    @Override // p256j$.time.chrono.InterfaceC4839e
    /* renamed from: a */
    public final InterfaceC4848n mo20947a() {
        return this.f17923a.mo20996a();
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: l */
    public final Temporal mo20909l(long j7, ChronoUnit chronoUnit) {
        return m21009I(this.f17923a.mo20996a(), AbstractC4911l.m21187b(this, j7, chronoUnit));
    }

    private C4841g(InterfaceC4836b interfaceC4836b, C4891l c4891l) {
        Objects.requireNonNull(interfaceC4836b, "date");
        Objects.requireNonNull(c4891l, "time");
        this.f17923a = interfaceC4836b;
        this.f17924b = c4891l;
    }

    /* renamed from: P */
    private C4841g m21012P(Temporal temporal, C4891l c4891l) {
        InterfaceC4836b interfaceC4836b = this.f17923a;
        return (interfaceC4836b == temporal && this.f17924b == c4891l) ? this : new C4841g(AbstractC4838d.m21007I(interfaceC4836b.mo20996a(), temporal), c4891l);
    }

    @Override // p256j$.time.chrono.InterfaceC4839e
    /* renamed from: c */
    public final InterfaceC4836b mo20949c() {
        return this.f17923a;
    }

    @Override // p256j$.time.chrono.InterfaceC4839e
    /* renamed from: b */
    public final C4891l mo20948b() {
        return this.f17924b;
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
            if (!((EnumC4900a) interfaceC4915p).m21171J()) {
                return this.f17923a.mo20912o(interfaceC4915p);
            }
            C4891l c4891l = this.f17924b;
            c4891l.getClass();
            return AbstractC4911l.m21189d(c4891l, interfaceC4915p);
        }
        return interfaceC4915p.mo21176s(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            return ((EnumC4900a) interfaceC4915p).m21171J() ? this.f17924b.mo20910m(interfaceC4915p) : this.f17923a.mo20910m(interfaceC4915p);
        }
        return mo20912o(interfaceC4915p).m21200a(mo20914s(interfaceC4915p), interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            return ((EnumC4900a) interfaceC4915p).m21171J() ? this.f17924b.mo20914s(interfaceC4915p) : this.f17923a.mo20914s(interfaceC4915p);
        }
        return interfaceC4915p.mo21173m(this);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return m21012P(c4888i, this.f17924b);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final C4841g mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        boolean z6 = interfaceC4915p instanceof EnumC4900a;
        InterfaceC4836b interfaceC4836b = this.f17923a;
        if (z6) {
            boolean m21171J = ((EnumC4900a) interfaceC4915p).m21171J();
            C4891l c4891l = this.f17924b;
            if (m21171J) {
                return m21012P(interfaceC4836b, c4891l.mo20902d(j7, interfaceC4915p));
            }
            return m21012P(interfaceC4836b.mo20902d(j7, interfaceC4915p), c4891l);
        }
        return m21009I(interfaceC4836b.mo20996a(), interfaceC4915p.mo21175o(this, j7));
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final C4841g mo20903e(long j7, TemporalUnit temporalUnit) {
        boolean z6 = temporalUnit instanceof ChronoUnit;
        InterfaceC4836b interfaceC4836b = this.f17923a;
        if (z6) {
            int i7 = AbstractC4840f.f17922a[((ChronoUnit) temporalUnit).ordinal()];
            C4891l c4891l = this.f17924b;
            switch (i7) {
                case 1:
                    return m21011M(this.f17923a, 0L, 0L, 0L, j7);
                case 2:
                    C4841g m21012P = m21012P(interfaceC4836b.mo20903e(j7 / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), c4891l);
                    return m21012P.m21011M(m21012P.f17923a, 0L, 0L, 0L, (j7 % 86400000000L) * 1000);
                case 3:
                    C4841g m21012P2 = m21012P(interfaceC4836b.mo20903e(j7 / 86400000, (TemporalUnit) ChronoUnit.DAYS), c4891l);
                    return m21012P2.m21011M(m21012P2.f17923a, 0L, 0L, 0L, (j7 % 86400000) * 1000000);
                case 4:
                    return m21014L(j7);
                case 5:
                    return m21011M(this.f17923a, 0L, j7, 0L, 0L);
                case 6:
                    return m21011M(this.f17923a, j7, 0L, 0L, 0L);
                case 7:
                    C4841g m21012P3 = m21012P(interfaceC4836b.mo20903e(j7 / 256, (TemporalUnit) ChronoUnit.DAYS), c4891l);
                    return m21012P3.m21011M(m21012P3.f17923a, (j7 % 256) * 12, 0L, 0L, 0L);
                default:
                    return m21012P(interfaceC4836b.mo20903e(j7, temporalUnit), c4891l);
            }
        }
        return m21009I(interfaceC4836b.mo20996a(), temporalUnit.mo21168l(this, j7));
    }

    /* renamed from: L */
    final C4841g m21014L(long j7) {
        return m21011M(this.f17923a, 0L, 0L, j7, 0L);
    }

    /* renamed from: M */
    private C4841g m21011M(InterfaceC4836b interfaceC4836b, long j7, long j8, long j9, long j10) {
        long j11 = j7 | j8 | j9 | j10;
        C4891l c4891l = this.f17924b;
        if (j11 == 0) {
            return m21012P(interfaceC4836b, c4891l);
        }
        long j12 = j8 / 1440;
        long j13 = j7 / 24;
        long j14 = (j8 % 1440) * 60000000000L;
        long j15 = ((j7 % 24) * 3600000000000L) + j14 + ((j9 % 86400) * 1000000000) + (j10 % 86400000000000L);
        long m21150Y = c4891l.m21150Y();
        long j16 = j15 + m21150Y;
        long m20873k = AbstractC4815a.m20873k(j16, 86400000000000L) + j13 + j12 + (j9 / 86400) + (j10 / 86400000000000L);
        long m20872j = AbstractC4815a.m20872j(j16, 86400000000000L);
        if (m20872j != m21150Y) {
            c4891l = C4891l.m21138Q(m20872j);
        }
        return m21012P(interfaceC4836b.mo20903e(m20873k, (TemporalUnit) ChronoUnit.DAYS), c4891l);
    }

    @Override // p256j$.time.chrono.InterfaceC4839e
    /* renamed from: p */
    public final InterfaceC4845k mo20950p(ZoneOffset zoneOffset) {
        return C4847m.m21033I(zoneOffset, null, this);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: f */
    public final long mo20904f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC4836b interfaceC4836b = this.f17923a;
        InterfaceC4839e mo21005x = interfaceC4836b.mo20996a().mo21005x(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, mo21005x);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        boolean z6 = ((ChronoUnit) temporalUnit).compareTo(chronoUnit) < 0;
        C4891l c4891l = this.f17924b;
        if (!z6) {
            InterfaceC4836b mo20949c = mo21005x.mo20949c();
            if (mo21005x.mo20948b().compareTo(c4891l) < 0) {
                mo20949c = mo20949c.mo20909l(1L, chronoUnit);
            }
            return interfaceC4836b.mo20904f(mo20949c, temporalUnit);
        }
        EnumC4900a enumC4900a = EnumC4900a.EPOCH_DAY;
        long mo20914s = mo21005x.mo20914s(enumC4900a) - interfaceC4836b.mo20914s(enumC4900a);
        switch (AbstractC4840f.f17922a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                mo20914s = AbstractC4815a.m20874l(mo20914s, 86400000000000L);
                break;
            case 2:
                mo20914s = AbstractC4815a.m20874l(mo20914s, 86400000000L);
                break;
            case 3:
                mo20914s = AbstractC4815a.m20874l(mo20914s, 86400000L);
                break;
            case 4:
                mo20914s = AbstractC4815a.m20874l(mo20914s, 86400);
                break;
            case 5:
                mo20914s = AbstractC4815a.m20874l(mo20914s, 1440);
                break;
            case 6:
                mo20914s = AbstractC4815a.m20874l(mo20914s, 24);
                break;
            case 7:
                mo20914s = AbstractC4815a.m20874l(mo20914s, 2);
                break;
        }
        return AbstractC4815a.m20868f(mo20914s, c4891l.mo20904f(mo21005x.mo20948b(), temporalUnit));
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        return temporal.mo20902d(mo20949c().mo20997t(), EnumC4900a.EPOCH_DAY).mo20902d(mo20948b().m21150Y(), EnumC4900a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new C4829G((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f17923a);
        objectOutput.writeObject(this.f17924b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC4839e) && AbstractC4843i.m21019c(this, (InterfaceC4839e) obj) == 0;
    }

    public final int hashCode() {
        return this.f17923a.hashCode() ^ this.f17924b.hashCode();
    }

    /* renamed from: N */
    public final Instant m21015N(ZoneOffset zoneOffset) {
        return Instant.m20919N(AbstractC4843i.m21030n(this, zoneOffset), this.f17924b.m21143N());
    }

    public final String toString() {
        return this.f17923a.toString() + "T" + this.f17924b.toString();
    }
}
