package p256j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p256j$.time.chrono.AbstractC4843i;
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

/* renamed from: j$.time.s */
/* loaded from: classes3.dex */
public final class C4898s implements Temporal, InterfaceC4913n, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a */
    private final C4891l f18047a;

    /* renamed from: b */
    private final ZoneOffset f18048b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4898s c4898s = (C4898s) obj;
        boolean equals = this.f18048b.equals(c4898s.f18048b);
        C4891l c4891l = this.f18047a;
        C4891l c4891l2 = c4898s.f18047a;
        if (equals) {
            return c4891l.compareTo(c4891l2);
        }
        int compare = Long.compare(m21164L(), c4898s.m21164L());
        return compare == 0 ? c4891l.compareTo(c4891l2) : compare;
    }

    static {
        C4891l c4891l = C4891l.f18031e;
        ZoneOffset zoneOffset = ZoneOffset.f17895g;
        c4891l.getClass();
        m21162I(c4891l, zoneOffset);
        C4891l c4891l2 = C4891l.f18032f;
        ZoneOffset zoneOffset2 = ZoneOffset.f17894f;
        c4891l2.getClass();
        m21162I(c4891l2, zoneOffset2);
    }

    /* renamed from: I */
    public static C4898s m21162I(C4891l c4891l, ZoneOffset zoneOffset) {
        return new C4898s(c4891l, zoneOffset);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: f */
    public final long mo20904f(Temporal temporal, TemporalUnit temporalUnit) {
        C4898s c4898s;
        if (temporal instanceof C4898s) {
            c4898s = (C4898s) temporal;
        } else {
            try {
                c4898s = new C4898s(C4891l.m21135K(temporal), ZoneOffset.m20964P(temporal));
            } catch (C4822c e7) {
                throw new C4822c("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e7);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long m21164L = c4898s.m21164L() - m21164L();
            switch (AbstractC4897r.f18046a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return m21164L;
                case 2:
                    return m21164L / 1000;
                case 3:
                    return m21164L / 1000000;
                case 4:
                    return m21164L / 1000000000;
                case 5:
                    return m21164L / 60000000000L;
                case 6:
                    return m21164L / 3600000000000L;
                case 7:
                    return m21164L / 43200000000000L;
                default:
                    throw new C4918s("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, c4898s);
    }

    private C4898s(C4891l c4891l, ZoneOffset zoneOffset) {
        this.f18047a = (C4891l) Objects.requireNonNull(c4891l, "time");
        this.f18048b = (ZoneOffset) Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
    }

    /* renamed from: M */
    private C4898s m21165M(C4891l c4891l, ZoneOffset zoneOffset) {
        return (this.f18047a == c4891l && this.f18048b.equals(zoneOffset)) ? this : new C4898s(c4891l, zoneOffset);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return interfaceC4915p instanceof EnumC4900a ? ((EnumC4900a) interfaceC4915p).m21171J() || interfaceC4915p == EnumC4900a.OFFSET_SECONDS : interfaceC4915p != null && interfaceC4915p.mo21174n(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            if (interfaceC4915p == EnumC4900a.OFFSET_SECONDS) {
                return ((EnumC4900a) interfaceC4915p).mo21172l();
            }
            C4891l c4891l = this.f18047a;
            c4891l.getClass();
            return AbstractC4911l.m21189d(c4891l, interfaceC4915p);
        }
        return interfaceC4915p.mo21176s(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        return AbstractC4911l.m21186a(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            if (interfaceC4915p == EnumC4900a.OFFSET_SECONDS) {
                return this.f18048b.m20971Q();
            }
            return this.f18047a.mo20914s(interfaceC4915p);
        }
        return interfaceC4915p.mo21173m(this);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: d */
    public final Temporal mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            EnumC4900a enumC4900a = EnumC4900a.OFFSET_SECONDS;
            C4891l c4891l = this.f18047a;
            if (interfaceC4915p == enumC4900a) {
                return m21165M(c4891l, ZoneOffset.m20967T(((EnumC4900a) interfaceC4915p).m21178z(j7)));
            }
            return m21165M(c4891l.mo20902d(j7, interfaceC4915p), this.f18048b);
        }
        return (C4898s) interfaceC4915p.mo21175o(this, j7);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final C4898s mo20903e(long j7, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return m21165M(this.f18047a.mo20903e(j7, temporalUnit), this.f18048b);
        }
        return (C4898s) temporalUnit.mo21168l(this, j7);
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
            return this.f18048b;
        }
        if (((interfaceC4917r == AbstractC4911l.m21196k()) || (interfaceC4917r == AbstractC4911l.m21190e())) || interfaceC4917r == AbstractC4911l.m21191f()) {
            return null;
        }
        if (interfaceC4917r == AbstractC4911l.m21192g()) {
            return this.f18047a;
        }
        if (interfaceC4917r == AbstractC4911l.m21194i()) {
            return ChronoUnit.NANOS;
        }
        return interfaceC4917r.mo21070a(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        return temporal.mo20902d(this.f18047a.m21150Y(), EnumC4900a.NANO_OF_DAY).mo20902d(this.f18048b.m20971Q(), EnumC4900a.OFFSET_SECONDS);
    }

    /* renamed from: L */
    private long m21164L() {
        return this.f18047a.m21150Y() - (this.f18048b.m20971Q() * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4898s)) {
            return false;
        }
        C4898s c4898s = (C4898s) obj;
        return this.f18047a.equals(c4898s.f18047a) && this.f18048b.equals(c4898s.f18048b);
    }

    public final int hashCode() {
        return this.f18047a.hashCode() ^ this.f18048b.hashCode();
    }

    public final String toString() {
        return this.f18047a.toString() + this.f18048b.toString();
    }

    private Object writeReplace() {
        return new C4920u((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f18047a.m21154c0(objectOutput);
        this.f18048b.m20972W(objectOutput);
    }

    /* renamed from: K */
    static C4898s m21163K(ObjectInput objectInput) {
        return new C4898s(C4891l.m21140X(objectInput), ZoneOffset.m20969V(objectInput));
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return (C4898s) AbstractC4843i.m21017a(c4888i, this);
    }
}
