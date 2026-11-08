package p256j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import p256j$.time.AbstractC4861d;
import p256j$.time.C4822c;
import p256j$.time.C4888i;
import p256j$.time.C4891l;
import p256j$.time.temporal.C4918s;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.ChronoUnit;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4913n;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.Temporal;
import p256j$.time.temporal.TemporalUnit;

/* renamed from: j$.time.chrono.z */
/* loaded from: classes3.dex */
public final class C4860z extends AbstractC4838d {

    /* renamed from: d */
    static final C4888i f17961d = C4888i.m21113V(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a */
    private final transient C4888i f17962a;

    /* renamed from: b */
    private transient C4823A f17963b;

    /* renamed from: c */
    private transient int f17964c;

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: J */
    public final InterfaceC4849o mo20990J() {
        return this.f17963b;
    }

    C4860z(C4888i c4888i) {
        if (c4888i.m21122R(f17961d)) {
            throw new C4822c("JapaneseDate before Meiji 6 is not supported");
        }
        C4823A m20975k = C4823A.m20975k(c4888i);
        this.f17963b = m20975k;
        this.f17964c = (c4888i.m21121Q() - m20975k.m20979v().m21121Q()) + 1;
        this.f17962a = c4888i;
    }

    @Override // p256j$.time.chrono.InterfaceC4836b
    /* renamed from: a */
    public final InterfaceC4848n mo20996a() {
        return C4858x.f17959d;
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b
    public final int hashCode() {
        C4858x.f17959d.getClass();
        return this.f17962a.hashCode() ^ (-688086063);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b, p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.ALIGNED_DAY_OF_WEEK_IN_MONTH || interfaceC4915p == EnumC4900a.ALIGNED_DAY_OF_WEEK_IN_YEAR || interfaceC4915p == EnumC4900a.ALIGNED_WEEK_OF_MONTH || interfaceC4915p == EnumC4900a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (interfaceC4915p instanceof EnumC4900a) {
            return ((EnumC4900a) interfaceC4915p).mo21177w();
        }
        return interfaceC4915p != null && interfaceC4915p.mo21174n(this);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return interfaceC4915p.mo21176s(this);
        }
        if (!mo20905g(interfaceC4915p)) {
            throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
        EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
        int i7 = AbstractC4859y.f17960a[enumC4900a.ordinal()];
        C4888i c4888i = this.f17962a;
        if (i7 == 1) {
            return C4919t.m21198j(1L, c4888i.m21124T());
        }
        C4823A c4823a = this.f17963b;
        if (i7 != 2) {
            if (i7 != 3) {
                return C4858x.f17959d.mo20981C(enumC4900a);
            }
            int m21121Q = c4823a.m20979v().m21121Q();
            return c4823a.m20980x() != null ? C4919t.m21198j(1L, (r0.m20979v().m21121Q() - m21121Q) + 1) : C4919t.m21198j(1L, 999999999 - m21121Q);
        }
        C4823A m20980x = c4823a.m20980x();
        int m21119N = (m20980x == null || m20980x.m20979v().m21121Q() != c4888i.m21121Q()) ? c4888i.m21123S() ? 366 : 365 : m20980x.m20979v().m21119N() - 1;
        if (this.f17964c == 1) {
            m21119N -= c4823a.m20979v().m21119N() - 1;
        }
        return C4919t.m21198j(1L, m21119N);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return interfaceC4915p.mo21173m(this);
        }
        int i7 = AbstractC4859y.f17960a[((EnumC4900a) interfaceC4915p).ordinal()];
        int i8 = this.f17964c;
        C4823A c4823a = this.f17963b;
        C4888i c4888i = this.f17962a;
        switch (i7) {
            case 2:
                return i8 == 1 ? (c4888i.m21119N() - c4823a.m20979v().m21119N()) + 1 : c4888i.m21119N();
            case 3:
                return i8;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
            case 8:
                return c4823a.getValue();
            default:
                return c4888i.mo20914s(interfaceC4915p);
        }
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final C4860z mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
            if (mo20914s(enumC4900a) == j7) {
                return this;
            }
            int[] iArr = AbstractC4859y.f17960a;
            int i7 = iArr[enumC4900a.ordinal()];
            C4888i c4888i = this.f17962a;
            if (i7 == 3 || i7 == 8 || i7 == 9) {
                int m21200a = C4858x.f17959d.mo20981C(enumC4900a).m21200a(j7, enumC4900a);
                int i8 = iArr[enumC4900a.ordinal()];
                if (i8 == 3) {
                    return m21055R(this.f17963b, m21200a);
                }
                if (i8 == 8) {
                    return m21055R(C4823A.m20977y(m21200a), this.f17964c);
                }
                if (i8 == 9) {
                    return m21054Q(c4888i.m21132g0(m21200a));
                }
            }
            return m21054Q(c4888i.mo20902d(j7, interfaceC4915p));
        }
        return (C4860z) super.mo20902d(j7, interfaceC4915p);
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: O */
    public final InterfaceC4836b mo20911n(InterfaceC4913n interfaceC4913n) {
        return (C4860z) super.mo20911n(interfaceC4913n);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return (C4860z) super.mo20911n(c4888i);
    }

    /* renamed from: R */
    private C4860z m21055R(C4823A c4823a, int i7) {
        C4858x.f17959d.getClass();
        if (!(c4823a instanceof C4823A)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int m21121Q = (c4823a.m20979v().m21121Q() + i7) - 1;
        if (i7 != 1 && (m21121Q < -999999999 || m21121Q > 999999999 || m21121Q < c4823a.m20979v().m21121Q() || c4823a != C4823A.m20975k(C4888i.m21113V(m21121Q, 1, 1)))) {
            throw new C4822c("Invalid yearOfEra value");
        }
        return m21054Q(this.f17962a.m21132g0(m21121Q));
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b
    /* renamed from: u */
    public final InterfaceC4839e mo20998u(C4891l c4891l) {
        return C4841g.m21010J(this, c4891l);
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: N */
    final InterfaceC4836b mo20993N(long j7) {
        return m21054Q(this.f17962a.m21128b0(j7));
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: M */
    final InterfaceC4836b mo20992M(long j7) {
        return m21054Q(this.f17962a.m21127a0(j7));
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: L */
    final InterfaceC4836b mo20991L(long j7) {
        return m21054Q(this.f17962a.m21126Z(j7));
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b, p256j$.time.temporal.Temporal
    /* renamed from: e */
    public final InterfaceC4836b mo20903e(long j7, TemporalUnit temporalUnit) {
        return (C4860z) super.mo20903e(j7, temporalUnit);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal mo20903e(long j7, TemporalUnit temporalUnit) {
        return (C4860z) super.mo20903e(j7, temporalUnit);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b
    /* renamed from: E */
    public final InterfaceC4836b mo20909l(long j7, TemporalUnit temporalUnit) {
        return (C4860z) super.mo20909l(j7, temporalUnit);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.Temporal
    /* renamed from: l */
    public final Temporal mo20909l(long j7, ChronoUnit chronoUnit) {
        return (C4860z) super.mo20909l(j7, chronoUnit);
    }

    /* renamed from: Q */
    private C4860z m21054Q(C4888i c4888i) {
        return c4888i.equals(this.f17962a) ? this : new C4860z(c4888i);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b
    /* renamed from: t */
    public final long mo20997t() {
        return this.f17962a.mo20997t();
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4860z) {
            return this.f17962a.equals(((C4860z) obj).f17962a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C4829G((byte) 4, this);
    }
}
