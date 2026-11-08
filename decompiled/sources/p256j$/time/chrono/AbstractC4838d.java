package p256j$.time.chrono;

import java.io.Serializable;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.StringUtils;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.AbstractC4861d;
import p256j$.time.C4891l;
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

/* renamed from: j$.time.chrono.d */
/* loaded from: classes3.dex */
abstract class AbstractC4838d implements InterfaceC4836b, Temporal, InterfaceC4913n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* renamed from: F */
    public final /* synthetic */ int compareTo(InterfaceC4836b interfaceC4836b) {
        return AbstractC4843i.m21018b(this, interfaceC4836b);
    }

    /* renamed from: L */
    abstract InterfaceC4836b mo20991L(long j7);

    /* renamed from: M */
    abstract InterfaceC4836b mo20992M(long j7);

    /* renamed from: N */
    abstract InterfaceC4836b mo20993N(long j7);

    @Override // p256j$.time.chrono.InterfaceC4836b, p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public /* synthetic */ boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return AbstractC4843i.m21024h(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final /* synthetic */ int mo20910m(InterfaceC4915p interfaceC4915p) {
        return AbstractC4911l.m21186a(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public /* synthetic */ C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        return AbstractC4911l.m21189d(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final /* synthetic */ Object mo20915w(InterfaceC4917r interfaceC4917r) {
        return AbstractC4843i.m21026j(this, interfaceC4917r);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final /* synthetic */ Temporal mo20927z(Temporal temporal) {
        return AbstractC4843i.m21017a(this, temporal);
    }

    /* renamed from: I */
    static InterfaceC4836b m21007I(InterfaceC4848n interfaceC4848n, Temporal temporal) {
        InterfaceC4836b interfaceC4836b = (InterfaceC4836b) temporal;
        if (interfaceC4848n.equals(interfaceC4836b.mo20996a())) {
            return interfaceC4836b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + interfaceC4848n.mo20984k() + ", actual: " + interfaceC4836b.mo20996a().mo20984k());
    }

    AbstractC4838d() {
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: e */
    public InterfaceC4836b mo20903e(long j7, TemporalUnit temporalUnit) {
        boolean z6 = temporalUnit instanceof ChronoUnit;
        if (!z6) {
            if (!z6) {
                return m21007I(mo20996a(), temporalUnit.mo21168l(this, j7));
            }
            throw new C4918s("Unsupported unit: " + temporalUnit);
        }
        switch (AbstractC4837c.f17921a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return mo20991L(j7);
            case 2:
                return mo20991L(AbstractC4815a.m20874l(j7, 7));
            case 3:
                return mo20992M(j7);
            case 4:
                return mo20993N(j7);
            case 5:
                return mo20993N(AbstractC4815a.m20874l(j7, 10));
            case 6:
                return mo20993N(AbstractC4815a.m20874l(j7, 100));
            case 7:
                return mo20993N(AbstractC4815a.m20874l(j7, PipesIterator.DEFAULT_QUEUE_SIZE));
            case 8:
                EnumC4900a enumC4900a = EnumC4900a.ERA;
                return mo20902d(AbstractC4815a.m20868f(mo20914s(enumC4900a), j7), (InterfaceC4915p) enumC4900a);
            default:
                throw new C4918s("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: J */
    public InterfaceC4849o mo20990J() {
        return mo20996a().mo20983G(AbstractC4911l.m21186a(this, EnumC4900a.ERA));
    }

    @Override // p256j$.time.chrono.InterfaceC4836b, p256j$.time.temporal.Temporal
    /* renamed from: f */
    public long mo20904f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC4836b mo20986y = mo20996a().mo20986y(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, mo20986y);
        }
        switch (AbstractC4837c.f17921a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return mo20986y.mo20997t() - mo20997t();
            case 2:
                return (mo20986y.mo20997t() - mo20997t()) / 7;
            case 3:
                return m21008K(mo20986y);
            case 4:
                return m21008K(mo20986y) / 12;
            case 5:
                return m21008K(mo20986y) / 120;
            case 6:
                return m21008K(mo20986y) / 1200;
            case 7:
                return m21008K(mo20986y) / 12000;
            case 8:
                EnumC4900a enumC4900a = EnumC4900a.ERA;
                return mo20986y.mo20914s(enumC4900a) - mo20914s(enumC4900a);
            default:
                throw new C4918s("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: K */
    private long m21008K(InterfaceC4836b interfaceC4836b) {
        if (mo20996a().mo20981C(EnumC4900a.MONTH_OF_YEAR).m21202d() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        EnumC4900a enumC4900a = EnumC4900a.PROLEPTIC_MONTH;
        long mo20914s = mo20914s(enumC4900a) * 32;
        EnumC4900a enumC4900a2 = EnumC4900a.DAY_OF_MONTH;
        return (((interfaceC4836b.mo20914s(enumC4900a) * 32) + interfaceC4836b.mo20910m(enumC4900a2)) - (mo20914s + AbstractC4911l.m21186a(this, enumC4900a2))) / 32;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC4836b) && AbstractC4843i.m21018b(this, (InterfaceC4836b) obj) == 0;
    }

    @Override // p256j$.time.chrono.InterfaceC4836b
    public int hashCode() {
        long mo20997t = mo20997t();
        return ((int) (mo20997t ^ (mo20997t >>> 32))) ^ mo20996a().hashCode();
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public InterfaceC4836b mo20911n(InterfaceC4913n interfaceC4913n) {
        return m21007I(mo20996a(), interfaceC4913n.mo20927z(this));
    }

    @Override // p256j$.time.chrono.InterfaceC4836b
    public String toString() {
        long mo20914s = mo20914s(EnumC4900a.YEAR_OF_ERA);
        long mo20914s2 = mo20914s(EnumC4900a.MONTH_OF_YEAR);
        long mo20914s3 = mo20914s(EnumC4900a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(mo20996a().toString());
        sb.append(StringUtils.SPACE);
        sb.append(mo20990J());
        sb.append(StringUtils.SPACE);
        sb.append(mo20914s);
        sb.append(mo20914s2 < 10 ? "-0" : "-");
        sb.append(mo20914s2);
        sb.append(mo20914s3 < 10 ? "-0" : "-");
        sb.append(mo20914s3);
        return sb.toString();
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: d */
    public InterfaceC4836b mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
        return m21007I(mo20996a(), interfaceC4915p.mo21175o(this, j7));
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public InterfaceC4836b mo20909l(long j7, TemporalUnit temporalUnit) {
        return m21007I(mo20996a(), AbstractC4911l.m21187b(this, j7, temporalUnit));
    }

    @Override // p256j$.time.chrono.InterfaceC4836b
    /* renamed from: u */
    public InterfaceC4839e mo20998u(C4891l c4891l) {
        return C4841g.m21010J(this, c4891l);
    }

    @Override // p256j$.time.chrono.InterfaceC4836b
    /* renamed from: t */
    public long mo20997t() {
        return mo20914s(EnumC4900a.EPOCH_DAY);
    }
}
