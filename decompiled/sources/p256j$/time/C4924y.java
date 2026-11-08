package p256j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.pipes.PipesConfigBase;
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

/* renamed from: j$.time.y */
/* loaded from: classes3.dex */
public final class C4924y implements Temporal, InterfaceC4913n, Comparable, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f18095c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a */
    private final int f18096a;

    /* renamed from: b */
    private final int f18097b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4924y c4924y = (C4924y) obj;
        int i7 = this.f18096a - c4924y.f18096a;
        return i7 == 0 ? this.f18097b - c4924y.f18097b : i7;
    }

    static {
        C4877n c4877n = new C4877n();
        c4877n.m21090l(EnumC4900a.YEAR, 4, 10, EnumC4884u.EXCEEDS_PAD);
        c4877n.m21084e('-');
        c4877n.m21089k(EnumC4900a.MONTH_OF_YEAR, 2);
        c4877n.m21099v();
    }

    /* renamed from: J */
    public static C4924y m21216J(int i7, int i8) {
        EnumC4900a.YEAR.m21170I(i7);
        EnumC4900a.MONTH_OF_YEAR.m21170I(i8);
        return new C4924y(i7, i8);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: f */
    public final long mo20904f(Temporal temporal, TemporalUnit temporalUnit) {
        C4924y m21216J;
        if (temporal instanceof C4924y) {
            m21216J = (C4924y) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!C4855u.f17955d.equals(AbstractC4843i.m21032p(temporal))) {
                    temporal = C4888i.m21109K(temporal);
                }
                m21216J = m21216J(temporal.mo20910m(EnumC4900a.YEAR), temporal.mo20910m(EnumC4900a.MONTH_OF_YEAR));
            } catch (C4822c e7) {
                throw new C4822c("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e7);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long m21215I = m21216J.m21215I() - m21215I();
            switch (AbstractC4923x.f18094b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return m21215I;
                case 2:
                    return m21215I / 12;
                case 3:
                    return m21215I / 120;
                case 4:
                    return m21215I / 1200;
                case 5:
                    return m21215I / 12000;
                case 6:
                    EnumC4900a enumC4900a = EnumC4900a.ERA;
                    return m21216J.mo20914s(enumC4900a) - mo20914s(enumC4900a);
                default:
                    throw new C4918s("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, m21216J);
    }

    private C4924y(int i7, int i8) {
        this.f18096a = i7;
        this.f18097b = i8;
    }

    /* renamed from: N */
    private C4924y m21217N(int i7, int i8) {
        return (this.f18096a == i7 && this.f18097b == i8) ? this : new C4924y(i7, i8);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return interfaceC4915p instanceof EnumC4900a ? interfaceC4915p == EnumC4900a.YEAR || interfaceC4915p == EnumC4900a.MONTH_OF_YEAR || interfaceC4915p == EnumC4900a.PROLEPTIC_MONTH || interfaceC4915p == EnumC4900a.YEAR_OF_ERA || interfaceC4915p == EnumC4900a.ERA : interfaceC4915p != null && interfaceC4915p.mo21174n(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.YEAR_OF_ERA) {
            return C4919t.m21198j(1L, this.f18096a <= 0 ? 1000000000L : 999999999L);
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
        int i7 = AbstractC4923x.f18093a[((EnumC4900a) interfaceC4915p).ordinal()];
        if (i7 == 1) {
            return this.f18097b;
        }
        if (i7 == 2) {
            return m21215I();
        }
        int i8 = this.f18096a;
        if (i7 == 3) {
            if (i8 < 1) {
                i8 = 1 - i8;
            }
            return i8;
        }
        if (i7 == 4) {
            return i8;
        }
        if (i7 == 5) {
            return i8 < 1 ? 0 : 1;
        }
        throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
    }

    /* renamed from: I */
    private long m21215I() {
        return ((this.f18096a * 12) + this.f18097b) - 1;
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final C4924y mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return (C4924y) interfaceC4915p.mo21175o(this, j7);
        }
        EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
        enumC4900a.m21170I(j7);
        int i7 = AbstractC4923x.f18093a[enumC4900a.ordinal()];
        int i8 = this.f18096a;
        if (i7 == 1) {
            int i9 = (int) j7;
            EnumC4900a.MONTH_OF_YEAR.m21170I(i9);
            return m21217N(i8, i9);
        }
        if (i7 == 2) {
            return m21219L(j7 - m21215I());
        }
        int i10 = this.f18097b;
        if (i7 == 3) {
            if (i8 < 1) {
                j7 = 1 - j7;
            }
            int i11 = (int) j7;
            EnumC4900a.YEAR.m21170I(i11);
            return m21217N(i11, i10);
        }
        if (i7 == 4) {
            int i12 = (int) j7;
            EnumC4900a.YEAR.m21170I(i12);
            return m21217N(i12, i10);
        }
        if (i7 != 5) {
            throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
        if (mo20914s(EnumC4900a.ERA) == j7) {
            return this;
        }
        int i13 = 1 - i8;
        EnumC4900a.YEAR.m21170I(i13);
        return m21217N(i13, i10);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final C4924y mo20903e(long j7, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C4924y) temporalUnit.mo21168l(this, j7);
        }
        switch (AbstractC4923x.f18094b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m21219L(j7);
            case 2:
                return m21220M(j7);
            case 3:
                return m21220M(AbstractC4815a.m20874l(j7, 10));
            case 4:
                return m21220M(AbstractC4815a.m20874l(j7, 100));
            case 5:
                return m21220M(AbstractC4815a.m20874l(j7, PipesIterator.DEFAULT_QUEUE_SIZE));
            case 6:
                EnumC4900a enumC4900a = EnumC4900a.ERA;
                return mo20902d(AbstractC4815a.m20868f(mo20914s(enumC4900a), j7), enumC4900a);
            default:
                throw new C4918s("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: M */
    public final C4924y m21220M(long j7) {
        return j7 == 0 ? this : m21217N(EnumC4900a.YEAR.m21178z(this.f18096a + j7), this.f18097b);
    }

    /* renamed from: L */
    public final C4924y m21219L(long j7) {
        if (j7 == 0) {
            return this;
        }
        long j8 = (this.f18096a * 12) + (this.f18097b - 1) + j7;
        long j9 = 12;
        return m21217N(EnumC4900a.YEAR.m21178z(AbstractC4815a.m20873k(j8, j9)), ((int) AbstractC4815a.m20872j(j8, j9)) + 1);
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
            return ChronoUnit.MONTHS;
        }
        return AbstractC4911l.m21188c(this, interfaceC4917r);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        if (!AbstractC4843i.m21032p(temporal).equals(C4855u.f17955d)) {
            throw new C4822c("Adjustment only supported on ISO date-time");
        }
        return temporal.mo20902d(m21215I(), EnumC4900a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4924y)) {
            return false;
        }
        C4924y c4924y = (C4924y) obj;
        return this.f18096a == c4924y.f18096a && this.f18097b == c4924y.f18097b;
    }

    public final int hashCode() {
        return (this.f18097b << 27) ^ this.f18096a;
    }

    public final String toString() {
        int i7 = this.f18096a;
        int abs = Math.abs(i7);
        StringBuilder sb = new StringBuilder(9);
        if (abs >= 1000) {
            sb.append(i7);
        } else if (i7 < 0) {
            sb.append(i7 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i7 + PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS);
            sb.deleteCharAt(0);
        }
        int i8 = this.f18097b;
        sb.append(i8 < 10 ? "-0" : "-");
        sb.append(i8);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C4920u((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: P */
    final void m21222P(DataOutput dataOutput) {
        dataOutput.writeInt(this.f18096a);
        dataOutput.writeByte(this.f18097b);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return (C4924y) AbstractC4843i.m21017a(c4888i, this);
    }
}
