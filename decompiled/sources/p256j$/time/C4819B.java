package p256j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p256j$.time.chrono.AbstractC4843i;
import p256j$.time.chrono.InterfaceC4836b;
import p256j$.time.chrono.InterfaceC4839e;
import p256j$.time.chrono.InterfaceC4845k;
import p256j$.time.chrono.InterfaceC4848n;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4918s;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.ChronoUnit;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.InterfaceC4917r;
import p256j$.time.temporal.Temporal;
import p256j$.time.temporal.TemporalUnit;
import p256j$.time.zone.C4927b;
import p256j$.time.zone.C4931f;
import p256j$.util.Objects;

/* renamed from: j$.time.B */
/* loaded from: classes3.dex */
public final class C4819B implements Temporal, InterfaceC4845k, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a */
    private final LocalDateTime f17879a;

    /* renamed from: b */
    private final ZoneOffset f17880b;

    /* renamed from: c */
    private final ZoneId f17881c;

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: H */
    public final /* synthetic */ long mo20894H() {
        return AbstractC4843i.m21031o(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC4843i.m21020d(this, (InterfaceC4845k) obj);
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: B */
    public final InterfaceC4839e mo20893B() {
        return this.f17879a;
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: a */
    public final InterfaceC4848n mo20899a() {
        return ((C4888i) mo20901c()).mo20996a();
    }

    /* renamed from: K */
    public static C4819B m20890K(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new C4819B(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        C4931f mo20961J = zoneId.mo20961J();
        List m21248g = mo20961J.m21248g(localDateTime);
        if (m21248g.size() == 1) {
            zoneOffset = (ZoneOffset) m21248g.get(0);
        } else if (m21248g.size() == 0) {
            C4927b m21247f = mo20961J.m21247f(localDateTime);
            localDateTime = localDateTime.m20942T(m21247f.m21232n().m21063m());
            zoneOffset = m21247f.m21233o();
        } else if (zoneOffset == null || !m21248g.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) m21248g.get(0), MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        }
        return new C4819B(localDateTime, zoneId, zoneOffset);
    }

    /* renamed from: J */
    public static C4819B m20889J(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return m20892z(instant.m20922K(), instant.m20923L(), zoneId);
    }

    /* renamed from: z */
    private static C4819B m20892z(long j7, int i7, ZoneId zoneId) {
        ZoneOffset m21246d = zoneId.mo20961J().m21246d(Instant.m20919N(j7, i7));
        return new C4819B(LocalDateTime.m20932R(j7, i7, m21246d), zoneId, m21246d);
    }

    /* renamed from: I */
    public static C4819B m20888I(Temporal temporal) {
        if (temporal instanceof C4819B) {
            return (C4819B) temporal;
        }
        try {
            ZoneId m20956I = ZoneId.m20956I(temporal);
            EnumC4900a enumC4900a = EnumC4900a.INSTANT_SECONDS;
            if (!temporal.mo20905g(enumC4900a)) {
                return m20890K(LocalDateTime.m20931Q(C4888i.m21109K(temporal), C4891l.m21135K(temporal)), m20956I, null);
            }
            return m20892z(temporal.mo20914s(enumC4900a), temporal.mo20910m(EnumC4900a.NANO_OF_SECOND), m20956I);
        } catch (C4822c e7) {
            throw new C4822c("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e7);
        }
    }

    private C4819B(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f17879a = localDateTime;
        this.f17880b = zoneOffset;
        this.f17881c = zoneId;
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return (interfaceC4915p instanceof EnumC4900a) || (interfaceC4915p != null && interfaceC4915p.mo21174n(this));
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            if (interfaceC4915p == EnumC4900a.INSTANT_SECONDS || interfaceC4915p == EnumC4900a.OFFSET_SECONDS) {
                return ((EnumC4900a) interfaceC4915p).mo21172l();
            }
            return this.f17879a.mo20912o(interfaceC4915p);
        }
        return interfaceC4915p.mo21176s(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            int i7 = AbstractC4818A.f17878a[((EnumC4900a) interfaceC4915p).ordinal()];
            if (i7 == 1) {
                throw new C4918s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i7 == 2) {
                return this.f17880b.m20971Q();
            }
            return this.f17879a.mo20910m(interfaceC4915p);
        }
        return AbstractC4843i.m21021e(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return interfaceC4915p.mo21173m(this);
        }
        int i7 = AbstractC4818A.f17878a[((EnumC4900a) interfaceC4915p).ordinal()];
        return i7 != 1 ? i7 != 2 ? this.f17879a.mo20914s(interfaceC4915p) : this.f17880b.m20971Q() : AbstractC4843i.m21031o(this);
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: h */
    public final ZoneOffset mo20906h() {
        return this.f17880b;
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: q */
    public final ZoneId mo20913q() {
        return this.f17881c;
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: j */
    public final InterfaceC4845k mo20908j(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f17881c.equals(zoneId) ? this : m20890K(this.f17879a, zoneId, this.f17880b);
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final C4819B mo20907i(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f17881c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.f17879a;
        localDateTime.getClass();
        return m20892z(AbstractC4843i.m21030n(localDateTime, this.f17880b), localDateTime.m20936K(), zoneId);
    }

    /* renamed from: N */
    public final LocalDateTime m20896N() {
        return this.f17879a;
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: c */
    public final InterfaceC4836b mo20901c() {
        return this.f17879a.m20943V();
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: b */
    public final C4891l mo20900b() {
        return this.f17879a.mo20948b();
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return m20890K(LocalDateTime.m20931Q(c4888i, this.f17879a.mo20948b()), this.f17881c, this.f17880b);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: d */
    public final Temporal mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
            int i7 = AbstractC4818A.f17878a[enumC4900a.ordinal()];
            LocalDateTime localDateTime = this.f17879a;
            ZoneId zoneId = this.f17881c;
            if (i7 == 1) {
                return m20892z(j7, localDateTime.m20936K(), zoneId);
            }
            ZoneOffset zoneOffset = this.f17880b;
            if (i7 != 2) {
                return m20890K(localDateTime.mo20902d(j7, interfaceC4915p), zoneId, zoneOffset);
            }
            ZoneOffset m20967T = ZoneOffset.m20967T(enumC4900a.m21178z(j7));
            return (m20967T.equals(zoneOffset) || !zoneId.mo20961J().m21248g(localDateTime).contains(m20967T)) ? this : new C4819B(localDateTime, zoneId, m20967T);
        }
        return (C4819B) interfaceC4915p.mo21175o(this, j7);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final C4819B mo20903e(long j7, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C4819B) temporalUnit.mo21168l(this, j7);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        boolean z6 = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        ZoneOffset zoneOffset = this.f17880b;
        ZoneId zoneId = this.f17881c;
        LocalDateTime localDateTime = this.f17879a;
        if (z6) {
            return m20890K(localDateTime.mo20903e(j7, temporalUnit), zoneId, zoneOffset);
        }
        LocalDateTime mo20903e = localDateTime.mo20903e(j7, temporalUnit);
        Objects.requireNonNull(mo20903e, "localDateTime");
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.mo20961J().m21248g(mo20903e).contains(zoneOffset)) {
            return new C4819B(mo20903e, zoneId, zoneOffset);
        }
        mo20903e.getClass();
        return m20892z(AbstractC4843i.m21030n(mo20903e, zoneOffset), mo20903e.m20936K(), zoneId);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: l */
    public final Temporal mo20909l(long j7, ChronoUnit chronoUnit) {
        return j7 == Long.MIN_VALUE ? mo20903e(Long.MAX_VALUE, chronoUnit).mo20903e(1L, chronoUnit) : mo20903e(-j7, chronoUnit);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final Object mo20915w(InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21191f()) {
            return this.f17879a.m20943V();
        }
        return AbstractC4843i.m21028l(this, interfaceC4917r);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: f */
    public final long mo20904f(Temporal temporal, TemporalUnit temporalUnit) {
        C4819B m20888I = m20888I(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            C4819B mo20907i = m20888I.mo20907i(this.f17881c);
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            int compareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
            LocalDateTime localDateTime = this.f17879a;
            LocalDateTime localDateTime2 = mo20907i.f17879a;
            if (compareTo >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return localDateTime.mo20904f(localDateTime2, temporalUnit);
            }
            return OffsetDateTime.m20951I(localDateTime, this.f17880b).mo20904f(OffsetDateTime.m20951I(localDateTime2, mo20907i.f17880b), temporalUnit);
        }
        return temporalUnit.between(this, m20888I);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4819B)) {
            return false;
        }
        C4819B c4819b = (C4819B) obj;
        return this.f17879a.equals(c4819b.f17879a) && this.f17880b.equals(c4819b.f17880b) && this.f17881c.equals(c4819b.f17881c);
    }

    public final int hashCode() {
        return (this.f17879a.hashCode() ^ this.f17880b.hashCode()) ^ Integer.rotateLeft(this.f17881c.hashCode(), 3);
    }

    public final String toString() {
        String localDateTime = this.f17879a.toString();
        ZoneOffset zoneOffset = this.f17880b;
        String str = localDateTime + zoneOffset.toString();
        ZoneId zoneId = this.f17881c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new C4920u((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: P */
    final void m20898P(DataOutput dataOutput) {
        this.f17879a.m20946Z(dataOutput);
        this.f17880b.m20972W(dataOutput);
        this.f17881c.mo20962N((ObjectOutput) dataOutput);
    }

    /* renamed from: M */
    static C4819B m20891M(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f17885c;
        C4888i c4888i = C4888i.f18023d;
        LocalDateTime m20931Q = LocalDateTime.m20931Q(C4888i.m21113V(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C4891l.m21140X(objectInput));
        ZoneOffset m20969V = ZoneOffset.m20969V(objectInput);
        ZoneId zoneId = (ZoneId) C4920u.m21208a(objectInput);
        Objects.requireNonNull(m20931Q, "localDateTime");
        Objects.requireNonNull(m20969V, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        Objects.requireNonNull(zoneId, "zone");
        if ((zoneId instanceof ZoneOffset) && !m20969V.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new C4819B(m20931Q, zoneId, m20969V);
    }
}
