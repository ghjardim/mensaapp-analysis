package p256j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.chrono.AbstractC4843i;
import p256j$.time.chrono.C4855u;
import p256j$.time.format.C4877n;
import p256j$.time.format.EnumC4884u;
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

/* renamed from: j$.time.w */
/* loaded from: classes3.dex */
public final class C4922w implements Temporal, InterfaceC4913n, Comparable, Serializable {

    /* renamed from: b */
    public static final /* synthetic */ int f18091b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a */
    private final int f18092a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18092a - ((C4922w) obj).f18092a;
    }

    static {
        C4877n c4877n = new C4877n();
        c4877n.m21090l(EnumC4900a.YEAR, 4, 10, EnumC4884u.EXCEEDS_PAD);
        c4877n.m21099v();
    }

    /* renamed from: I */
    public static C4922w m21210I(int i7) {
        EnumC4900a.YEAR.m21170I(i7);
        return new C4922w(i7);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: f */
    public final long mo20904f(Temporal temporal, TemporalUnit temporalUnit) {
        C4922w m21210I;
        if (temporal instanceof C4922w) {
            m21210I = (C4922w) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!C4855u.f17955d.equals(AbstractC4843i.m21032p(temporal))) {
                    temporal = C4888i.m21109K(temporal);
                }
                m21210I = m21210I(temporal.mo20910m(EnumC4900a.YEAR));
            } catch (C4822c e7) {
                throw new C4822c("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e7);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long j7 = m21210I.f18092a - this.f18092a;
            int i7 = AbstractC4921v.f18090b[((ChronoUnit) temporalUnit).ordinal()];
            if (i7 == 1) {
                return j7;
            }
            if (i7 == 2) {
                return j7 / 10;
            }
            if (i7 == 3) {
                return j7 / 100;
            }
            if (i7 == 4) {
                return j7 / 1000;
            }
            if (i7 == 5) {
                EnumC4900a enumC4900a = EnumC4900a.ERA;
                return m21210I.mo20914s(enumC4900a) - mo20914s(enumC4900a);
            }
            throw new C4918s("Unsupported unit: " + temporalUnit);
        }
        return temporalUnit.between(this, m21210I);
    }

    private C4922w(int i7) {
        this.f18092a = i7;
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return interfaceC4915p instanceof EnumC4900a ? interfaceC4915p == EnumC4900a.YEAR || interfaceC4915p == EnumC4900a.YEAR_OF_ERA || interfaceC4915p == EnumC4900a.ERA : interfaceC4915p != null && interfaceC4915p.mo21174n(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.YEAR_OF_ERA) {
            return C4919t.m21198j(1L, this.f18092a <= 0 ? 1000000000L : 999999999L);
        }
        return AbstractC4911l.m21189d(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        return mo20912o(interfaceC4915p).m21200a(mo20914s(interfaceC4915p), interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return interfaceC4915p.mo21173m(this);
        }
        int i7 = AbstractC4921v.f18089a[((EnumC4900a) interfaceC4915p).ordinal()];
        int i8 = this.f18092a;
        if (i7 == 1) {
            if (i8 < 1) {
                i8 = 1 - i8;
            }
            return i8;
        }
        if (i7 == 2) {
            return i8;
        }
        if (i7 == 3) {
            return i8 < 1 ? 0 : 1;
        }
        throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final C4922w mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return (C4922w) interfaceC4915p.mo21175o(this, j7);
        }
        EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
        enumC4900a.m21170I(j7);
        int i7 = AbstractC4921v.f18089a[enumC4900a.ordinal()];
        int i8 = this.f18092a;
        if (i7 == 1) {
            if (i8 < 1) {
                j7 = 1 - j7;
            }
            return m21210I((int) j7);
        }
        if (i7 == 2) {
            return m21210I((int) j7);
        }
        if (i7 == 3) {
            return mo20914s(EnumC4900a.ERA) == j7 ? this : m21210I(1 - i8);
        }
        throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final C4922w mo20903e(long j7, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C4922w) temporalUnit.mo21168l(this, j7);
        }
        int i7 = AbstractC4921v.f18090b[((ChronoUnit) temporalUnit).ordinal()];
        if (i7 == 1) {
            return m21212K(j7);
        }
        if (i7 == 2) {
            return m21212K(AbstractC4815a.m20874l(j7, 10));
        }
        if (i7 == 3) {
            return m21212K(AbstractC4815a.m20874l(j7, 100));
        }
        if (i7 == 4) {
            return m21212K(AbstractC4815a.m20874l(j7, PipesIterator.DEFAULT_QUEUE_SIZE));
        }
        if (i7 == 5) {
            EnumC4900a enumC4900a = EnumC4900a.ERA;
            return mo20902d(AbstractC4815a.m20868f(mo20914s(enumC4900a), j7), enumC4900a);
        }
        throw new C4918s("Unsupported unit: " + temporalUnit);
    }

    /* renamed from: K */
    public final C4922w m21212K(long j7) {
        return j7 == 0 ? this : m21210I(EnumC4900a.YEAR.m21178z(this.f18092a + j7));
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: l */
    public final Temporal mo20909l(long j7, ChronoUnit chronoUnit) {
        return j7 == Long.MIN_VALUE ? mo20903e(Long.MAX_VALUE, chronoUnit).mo20903e(1L, chronoUnit) : mo20903e(-j7, chronoUnit);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final Object mo20915w(InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21190e()) {
            return C4855u.f17955d;
        }
        if (interfaceC4917r == AbstractC4911l.m21194i()) {
            return ChronoUnit.YEARS;
        }
        return AbstractC4911l.m21188c(this, interfaceC4917r);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        if (!AbstractC4843i.m21032p(temporal).equals(C4855u.f17955d)) {
            throw new C4822c("Adjustment only supported on ISO date-time");
        }
        return temporal.mo20902d(this.f18092a, EnumC4900a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4922w) {
            return this.f18092a == ((C4922w) obj).f18092a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18092a;
    }

    public final String toString() {
        return Integer.toString(this.f18092a);
    }

    private Object writeReplace() {
        return new C4920u((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: M */
    final void m21214M(DataOutput dataOutput) {
        dataOutput.writeInt(this.f18092a);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return (C4922w) AbstractC4843i.m21017a(c4888i, this);
    }
}
