package p256j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p256j$.time.chrono.AbstractC4843i;
import p256j$.time.chrono.C4855u;
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
public final class OffsetDateTime implements Temporal, InterfaceC4913n, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a */
    private final LocalDateTime f17889a;

    /* renamed from: b */
    private final ZoneOffset f17890b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int m21143N;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f17890b;
        ZoneOffset zoneOffset2 = this.f17890b;
        if (zoneOffset2.equals(zoneOffset)) {
            m21143N = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f17889a;
            localDateTime.getClass();
            long m21030n = AbstractC4843i.m21030n(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.f17889a;
            localDateTime2.getClass();
            int compare = Long.compare(m21030n, AbstractC4843i.m21030n(localDateTime2, offsetDateTime2.f17890b));
            m21143N = compare == 0 ? localDateTime.mo20948b().m21143N() - localDateTime2.mo20948b().m21143N() : compare;
        }
        return m21143N == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : m21143N;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f17885c;
        ZoneOffset zoneOffset = ZoneOffset.f17895g;
        localDateTime.getClass();
        m20951I(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f17886d;
        ZoneOffset zoneOffset2 = ZoneOffset.f17894f;
        localDateTime2.getClass();
        m20951I(localDateTime2, zoneOffset2);
    }

    /* renamed from: I */
    public static OffsetDateTime m20951I(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    /* renamed from: J */
    public static OffsetDateTime m20952J(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset m21246d = zoneId.mo20961J().m21246d(instant);
        return new OffsetDateTime(LocalDateTime.m20932R(instant.m20922K(), instant.m20923L(), m21246d), m21246d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // p256j$.time.temporal.Temporal
    /* renamed from: f */
    public final long mo20904f(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset m20964P = ZoneOffset.m20964P(temporal);
                C4888i c4888i = (C4888i) temporal.mo20915w(AbstractC4911l.m21191f());
                C4891l c4891l = (C4891l) temporal.mo20915w(AbstractC4911l.m21192g());
                if (c4888i != null && c4891l != null) {
                    temporal = new OffsetDateTime(LocalDateTime.m20931Q(c4888i, c4891l), m20964P);
                } else {
                    temporal = m20952J(Instant.m20917J(temporal), m20964P);
                }
            } catch (C4822c e7) {
                throw new C4822c("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e7);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = temporal.f17890b;
            ZoneOffset zoneOffset2 = this.f17890b;
            OffsetDateTime offsetDateTime = temporal;
            if (!zoneOffset2.equals(zoneOffset)) {
                offsetDateTime = new OffsetDateTime(temporal.f17889a.m20942T(zoneOffset2.m20971Q() - zoneOffset.m20971Q()), zoneOffset2);
            }
            return this.f17889a.mo20904f(offsetDateTime.f17889a, temporalUnit);
        }
        return temporalUnit.between(this, temporal);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f17889a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f17890b = (ZoneOffset) Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
    }

    /* renamed from: M */
    private OffsetDateTime m20954M(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f17889a == localDateTime && this.f17890b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
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
            return this.f17889a.mo20912o(interfaceC4915p);
        }
        return interfaceC4915p.mo21176s(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            int i7 = AbstractC4896q.f18045a[((EnumC4900a) interfaceC4915p).ordinal()];
            if (i7 == 1) {
                throw new C4918s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i7 == 2) {
                return this.f17890b.m20971Q();
            }
            return this.f17889a.mo20910m(interfaceC4915p);
        }
        return AbstractC4911l.m21186a(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return interfaceC4915p.mo21173m(this);
        }
        int i7 = AbstractC4896q.f18045a[((EnumC4900a) interfaceC4915p).ordinal()];
        ZoneOffset zoneOffset = this.f17890b;
        LocalDateTime localDateTime = this.f17889a;
        if (i7 != 1) {
            return i7 != 2 ? localDateTime.mo20914s(interfaceC4915p) : zoneOffset.m20971Q();
        }
        localDateTime.getClass();
        return AbstractC4843i.m21030n(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f17889a;
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return m20954M(this.f17889a.m20945X(c4888i), this.f17890b);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: d */
    public final Temporal mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
            int i7 = AbstractC4896q.f18045a[enumC4900a.ordinal()];
            ZoneOffset zoneOffset = this.f17890b;
            LocalDateTime localDateTime = this.f17889a;
            if (i7 == 1) {
                return m20952J(Instant.m20919N(j7, localDateTime.m20936K()), zoneOffset);
            }
            if (i7 == 2) {
                return m20954M(localDateTime, ZoneOffset.m20967T(enumC4900a.m21178z(j7)));
            }
            return m20954M(localDateTime.mo20902d(j7, interfaceC4915p), zoneOffset);
        }
        return (OffsetDateTime) interfaceC4915p.mo21175o(this, j7);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime mo20903e(long j7, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return m20954M(this.f17889a.mo20903e(j7, temporalUnit), this.f17890b);
        }
        return (OffsetDateTime) temporalUnit.mo21168l(this, j7);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: l */
    public final Temporal mo20909l(long j7, ChronoUnit chronoUnit) {
        return j7 == Long.MIN_VALUE ? mo20903e(Long.MAX_VALUE, chronoUnit).mo20903e(1L, chronoUnit) : mo20903e(-j7, chronoUnit);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final Object mo20915w(InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21193h() || interfaceC4917r == AbstractC4911l.m21195j()) {
            return this.f17890b;
        }
        if (interfaceC4917r == AbstractC4911l.m21196k()) {
            return null;
        }
        InterfaceC4917r m21191f = AbstractC4911l.m21191f();
        LocalDateTime localDateTime = this.f17889a;
        if (interfaceC4917r == m21191f) {
            return localDateTime.m20943V();
        }
        if (interfaceC4917r == AbstractC4911l.m21192g()) {
            return localDateTime.mo20948b();
        }
        if (interfaceC4917r == AbstractC4911l.m21190e()) {
            return C4855u.f17955d;
        }
        if (interfaceC4917r == AbstractC4911l.m21194i()) {
            return ChronoUnit.NANOS;
        }
        return interfaceC4917r.mo21070a(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        EnumC4900a enumC4900a = EnumC4900a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f17889a;
        return temporal.mo20902d(localDateTime.m20943V().mo20997t(), enumC4900a).mo20902d(localDateTime.mo20948b().m21150Y(), EnumC4900a.NANO_OF_DAY).mo20902d(this.f17890b.m20971Q(), EnumC4900a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f17889a.equals(offsetDateTime.f17889a) && this.f17890b.equals(offsetDateTime.f17890b);
    }

    public final int hashCode() {
        return this.f17889a.hashCode() ^ this.f17890b.hashCode();
    }

    public final String toString() {
        return this.f17889a.toString() + this.f17890b.toString();
    }

    private Object writeReplace() {
        return new C4920u((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f17889a.m20946Z(objectOutput);
        this.f17890b.m20972W(objectOutput);
    }

    /* renamed from: L */
    static OffsetDateTime m20953L(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f17885c;
        C4888i c4888i = C4888i.f18023d;
        return new OffsetDateTime(LocalDateTime.m20931Q(C4888i.m21113V(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C4891l.m21140X(objectInput)), ZoneOffset.m20969V(objectInput));
    }
}
