package p256j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p256j$.time.C4888i;
import p256j$.time.C4891l;
import p256j$.time.Instant;
import p256j$.time.LocalDateTime;
import p256j$.time.ZoneId;
import p256j$.time.ZoneOffset;
import p256j$.time.temporal.AbstractC4911l;
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

/* renamed from: j$.time.chrono.m */
/* loaded from: classes3.dex */
final class C4847m implements InterfaceC4845k, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a */
    private final transient C4841g f17932a;

    /* renamed from: b */
    private final transient ZoneOffset f17933b;

    /* renamed from: c */
    private final transient ZoneId f17934c;

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: H */
    public final /* synthetic */ long mo20894H() {
        return AbstractC4843i.m21031o(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final /* synthetic */ int mo20910m(InterfaceC4915p interfaceC4915p) {
        return AbstractC4843i.m21021e(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final /* synthetic */ Object mo20915w(InterfaceC4917r interfaceC4917r) {
        return AbstractC4843i.m21028l(this, interfaceC4917r);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC4843i.m21020d(this, (InterfaceC4845k) obj);
    }

    /* renamed from: I */
    static InterfaceC4845k m21033I(ZoneId zoneId, ZoneOffset zoneOffset, C4841g c4841g) {
        Objects.requireNonNull(c4841g, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new C4847m(zoneId, (ZoneOffset) zoneId, c4841g);
        }
        C4931f mo20961J = zoneId.mo20961J();
        LocalDateTime m20929J = LocalDateTime.m20929J(c4841g);
        List m21248g = mo20961J.m21248g(m20929J);
        if (m21248g.size() == 1) {
            zoneOffset = (ZoneOffset) m21248g.get(0);
        } else if (m21248g.size() == 0) {
            C4927b m21247f = mo20961J.m21247f(m20929J);
            c4841g = c4841g.m21014L(m21247f.m21232n().m21063m());
            zoneOffset = m21247f.m21233o();
        } else if (zoneOffset == null || !m21248g.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) m21248g.get(0);
        }
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        return new C4847m(zoneId, zoneOffset, c4841g);
    }

    /* renamed from: J */
    static C4847m m21034J(InterfaceC4848n interfaceC4848n, Instant instant, ZoneId zoneId) {
        ZoneOffset m21246d = zoneId.mo20961J().m21246d(instant);
        Objects.requireNonNull(m21246d, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        return new C4847m(zoneId, m21246d, (C4841g) interfaceC4848n.mo21005x(LocalDateTime.m20932R(instant.m20922K(), instant.m20923L(), m21246d)));
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            if (interfaceC4915p == EnumC4900a.INSTANT_SECONDS || interfaceC4915p == EnumC4900a.OFFSET_SECONDS) {
                return ((EnumC4900a) interfaceC4915p).mo21172l();
            }
            return ((C4841g) mo20893B()).mo20912o(interfaceC4915p);
        }
        return interfaceC4915p.mo21176s(this);
    }

    /* renamed from: z */
    static C4847m m21035z(InterfaceC4848n interfaceC4848n, Temporal temporal) {
        C4847m c4847m = (C4847m) temporal;
        if (interfaceC4848n.equals(c4847m.mo20899a())) {
            return c4847m;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC4848n.mo20984k() + ", actual: " + c4847m.mo20899a().mo20984k());
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            int i7 = AbstractC4844j.f17930a[((EnumC4900a) interfaceC4915p).ordinal()];
            if (i7 == 1) {
                return mo20894H();
            }
            if (i7 == 2) {
                return mo20906h().m20971Q();
            }
            return ((C4841g) mo20893B()).mo20914s(interfaceC4915p);
        }
        return interfaceC4915p.mo21173m(this);
    }

    private C4847m(ZoneId zoneId, ZoneOffset zoneOffset, C4841g c4841g) {
        this.f17932a = (C4841g) Objects.requireNonNull(c4841g, "dateTime");
        this.f17933b = (ZoneOffset) Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        this.f17934c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: h */
    public final ZoneOffset mo20906h() {
        return this.f17933b;
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: c */
    public final InterfaceC4836b mo20901c() {
        return ((C4841g) mo20893B()).mo20949c();
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: b */
    public final C4891l mo20900b() {
        return ((C4841g) mo20893B()).mo20948b();
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: B */
    public final InterfaceC4839e mo20893B() {
        return this.f17932a;
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: q */
    public final ZoneId mo20913q() {
        return this.f17934c;
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: a */
    public final InterfaceC4848n mo20899a() {
        return mo20901c().mo20996a();
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: j */
    public final InterfaceC4845k mo20908j(ZoneId zoneId) {
        return m21033I(zoneId, this.f17933b, this.f17932a);
    }

    @Override // p256j$.time.chrono.InterfaceC4845k
    /* renamed from: i */
    public final InterfaceC4845k mo20907i(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f17934c.equals(zoneId)) {
            return this;
        }
        return m21034J(mo20899a(), this.f17932a.m21015N(this.f17933b), zoneId);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return (interfaceC4915p instanceof EnumC4900a) || (interfaceC4915p != null && interfaceC4915p.mo21174n(this));
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: d */
    public final Temporal mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return m21035z(mo20899a(), interfaceC4915p.mo21175o(this, j7));
        }
        EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
        int i7 = AbstractC4846l.f17931a[enumC4900a.ordinal()];
        if (i7 == 1) {
            return mo20903e(j7 - AbstractC4843i.m21031o(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.f17934c;
        C4841g c4841g = this.f17932a;
        if (i7 != 2) {
            return m21033I(zoneId, this.f17933b, c4841g.mo20902d(j7, interfaceC4915p));
        }
        return m21034J(mo20899a(), c4841g.m21015N(ZoneOffset.m20967T(enumC4900a.m21178z(j7))), zoneId);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final InterfaceC4845k mo20903e(long j7, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return m21035z(mo20899a(), this.f17932a.mo20903e(j7, temporalUnit).mo20927z(this));
        }
        return m21035z(mo20899a(), temporalUnit.mo21168l(this, j7));
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: f */
    public final long mo20904f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC4845k mo21004v = mo20899a().mo21004v(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.f17932a.mo20904f(mo21004v.mo20907i(this.f17933b).mo20893B(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, mo21004v);
    }

    private Object writeReplace() {
        return new C4829G((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f17932a);
        objectOutput.writeObject(this.f17933b);
        objectOutput.writeObject(this.f17934c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC4845k) && AbstractC4843i.m21020d(this, (InterfaceC4845k) obj) == 0;
    }

    public final int hashCode() {
        return (this.f17932a.hashCode() ^ this.f17933b.hashCode()) ^ Integer.rotateLeft(this.f17934c.hashCode(), 3);
    }

    public final String toString() {
        String c4841g = this.f17932a.toString();
        ZoneOffset zoneOffset = this.f17933b;
        String str = c4841g + zoneOffset.toString();
        ZoneId zoneId = this.f17934c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return m21035z(mo20899a(), c4888i.mo20927z(this));
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: l */
    public final Temporal mo20909l(long j7, ChronoUnit chronoUnit) {
        return m21035z(mo20899a(), AbstractC4911l.m21187b(this, j7, chronoUnit));
    }
}
