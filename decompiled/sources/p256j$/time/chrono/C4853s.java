package p256j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.time.AbstractC4861d;
import p256j$.time.C4888i;
import p256j$.time.C4891l;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4918s;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.ChronoUnit;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4913n;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.Temporal;
import p256j$.time.temporal.TemporalUnit;
import p272k4.C5410A;

/* renamed from: j$.time.chrono.s */
/* loaded from: classes3.dex */
public final class C4853s extends AbstractC4838d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a */
    private final transient C4851q f17949a;

    /* renamed from: b */
    private final transient int f17950b;

    /* renamed from: c */
    private final transient int f17951c;

    /* renamed from: d */
    private final transient int f17952d;

    @Override // p256j$.time.chrono.InterfaceC4836b
    /* renamed from: a */
    public final InterfaceC4848n mo20996a() {
        return this.f17949a;
    }

    /* renamed from: Q */
    static C4853s m21047Q(C4851q c4851q, int i7, int i8, int i9) {
        return new C4853s(c4851q, i7, i8, i9);
    }

    /* renamed from: R */
    static C4853s m21048R(C4851q c4851q, long j7) {
        return new C4853s(c4851q, j7);
    }

    private C4853s(C4851q c4851q, int i7, int i8, int i9) {
        c4851q.m21045z(i7, i8, i9);
        this.f17949a = c4851q;
        this.f17950b = i7;
        this.f17951c = i8;
        this.f17952d = i9;
    }

    private C4853s(C4851q c4851q, long j7) {
        int[] m21040I = c4851q.m21040I((int) j7);
        this.f17949a = c4851q;
        this.f17950b = m21040I[0];
        this.f17951c = m21040I[1];
        this.f17952d = m21040I[2];
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: J */
    public final InterfaceC4849o mo20990J() {
        return EnumC4854t.f17953AH;
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return interfaceC4915p.mo21176s(this);
        }
        if (!AbstractC4843i.m21024h(this, interfaceC4915p)) {
            throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
        EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
        int i7 = AbstractC4852r.f17948a[enumC4900a.ordinal()];
        int i8 = this.f17950b;
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? this.f17949a.mo20981C(enumC4900a) : C4919t.m21198j(1L, 5L) : C4919t.m21198j(1L, r3.m21042K(i8)) : C4919t.m21198j(1L, r3.m21041J(i8, this.f17951c));
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return interfaceC4915p.mo21173m(this);
        }
        int i7 = AbstractC4852r.f17948a[((EnumC4900a) interfaceC4915p).ordinal()];
        int i8 = this.f17951c;
        int i9 = this.f17952d;
        int i10 = this.f17950b;
        switch (i7) {
            case 1:
                return i9;
            case 2:
                return m21046P();
            case 3:
                return ((i9 - 1) / 7) + 1;
            case 4:
                return ((int) AbstractC4815a.m20872j(mo20997t() + 3, 7)) + 1;
            case 5:
                return ((i9 - 1) % 7) + 1;
            case 6:
                return ((m21046P() - 1) % 7) + 1;
            case 7:
                return mo20997t();
            case 8:
                return ((m21046P() - 1) / 7) + 1;
            case 9:
                return i8;
            case 10:
                return ((i10 * 12) + i8) - 1;
            case 11:
                return i10;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return i10;
            case 13:
                return i10 <= 1 ? 0 : 1;
            default:
                throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.Temporal
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C4853s mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return (C4853s) super.mo20902d(j7, interfaceC4915p);
        }
        EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
        C4851q c4851q = this.f17949a;
        c4851q.mo20981C(enumC4900a).m21201b(j7, enumC4900a);
        int i7 = (int) j7;
        int i8 = AbstractC4852r.f17948a[enumC4900a.ordinal()];
        int i9 = this.f17952d;
        int i10 = this.f17951c;
        int i11 = this.f17950b;
        switch (i8) {
            case 1:
                return m21049U(i11, i10, i7);
            case 2:
                return mo20991L(Math.min(i7, c4851q.m21042K(i11)) - m21046P());
            case 3:
                return mo20991L((j7 - mo20914s(EnumC4900a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return mo20991L(j7 - (((int) AbstractC4815a.m20872j(mo20997t() + 3, 7)) + 1));
            case 5:
                return mo20991L(j7 - mo20914s(EnumC4900a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return mo20991L(j7 - mo20914s(EnumC4900a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new C4853s(c4851q, j7);
            case 8:
                return mo20991L((j7 - mo20914s(EnumC4900a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return m21049U(i11, i7, i9);
            case 10:
                return mo20992M(j7 - (((i11 * 12) + i10) - 1));
            case 11:
                if (i11 < 1) {
                    i7 = 1 - i7;
                }
                return m21049U(i7, i10, i9);
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return m21049U(i7, i10, i9);
            case 13:
                return m21049U(1 - i11, i10, i9);
            default:
                throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
    }

    /* renamed from: U */
    private C4853s m21049U(int i7, int i8, int i9) {
        C4851q c4851q = this.f17949a;
        int m21041J = c4851q.m21041J(i7, i8);
        if (i9 > m21041J) {
            i9 = m21041J;
        }
        return new C4853s(c4851q, i7, i8, i9);
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: O */
    public final InterfaceC4836b mo20911n(InterfaceC4913n interfaceC4913n) {
        return (C4853s) super.mo20911n(interfaceC4913n);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return (C4853s) super.mo20911n(c4888i);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b
    /* renamed from: t */
    public final long mo20997t() {
        return this.f17949a.m21045z(this.f17950b, this.f17951c, this.f17952d);
    }

    /* renamed from: P */
    private int m21046P() {
        return this.f17949a.m21044w(this.f17950b, this.f17951c) + this.f17952d;
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: N */
    final InterfaceC4836b mo20993N(long j7) {
        if (j7 == 0) {
            return this;
        }
        long j8 = this.f17950b + ((int) j7);
        int i7 = (int) j8;
        if (j8 == i7) {
            return m21049U(i7, this.f17951c, this.f17952d);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final C4853s mo20992M(long j7) {
        if (j7 == 0) {
            return this;
        }
        long j8 = (this.f17950b * 12) + (this.f17951c - 1) + j7;
        return m21049U(this.f17949a.m21043o(AbstractC4815a.m20873k(j8, 12L)), ((int) AbstractC4815a.m20872j(j8, 12L)) + 1, this.f17952d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final C4853s mo20991L(long j7) {
        return new C4853s(this.f17949a, mo20997t() + j7);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b, p256j$.time.temporal.Temporal
    /* renamed from: e */
    public final InterfaceC4836b mo20903e(long j7, TemporalUnit temporalUnit) {
        return (C4853s) super.mo20903e(j7, temporalUnit);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal mo20903e(long j7, TemporalUnit temporalUnit) {
        return (C4853s) super.mo20903e(j7, temporalUnit);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b
    /* renamed from: E */
    public final InterfaceC4836b mo20909l(long j7, TemporalUnit temporalUnit) {
        return (C4853s) super.mo20909l(j7, temporalUnit);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.Temporal
    /* renamed from: l */
    public final Temporal mo20909l(long j7, ChronoUnit chronoUnit) {
        return (C4853s) super.mo20909l(j7, chronoUnit);
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4853s)) {
            return false;
        }
        C4853s c4853s = (C4853s) obj;
        return this.f17950b == c4853s.f17950b && this.f17951c == c4853s.f17951c && this.f17952d == c4853s.f17952d && this.f17949a.equals(c4853s.f17949a);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b
    public final int hashCode() {
        int hashCode = this.f17949a.mo20984k().hashCode();
        int i7 = this.f17950b;
        return (hashCode ^ (i7 & (-2048))) ^ (((i7 << 11) + (this.f17951c << 6)) + this.f17952d);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b
    /* renamed from: u */
    public final InterfaceC4839e mo20998u(C4891l c4891l) {
        return C4841g.m21010J(this, c4891l);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C4829G((byte) 6, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f17949a);
        objectOutput.writeInt(AbstractC4911l.m21186a(this, EnumC4900a.YEAR));
        objectOutput.writeByte(AbstractC4911l.m21186a(this, EnumC4900a.MONTH_OF_YEAR));
        objectOutput.writeByte(AbstractC4911l.m21186a(this, EnumC4900a.DAY_OF_MONTH));
    }
}
