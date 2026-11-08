package p256j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import p256j$.time.AbstractC4861d;
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
import p256j$.util.Objects;

/* renamed from: j$.time.chrono.E */
/* loaded from: classes3.dex */
public final class C4827E extends AbstractC4838d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a */
    private final transient C4888i f17908a;

    C4827E(C4888i c4888i) {
        Objects.requireNonNull(c4888i, "isoDate");
        this.f17908a = c4888i;
    }

    @Override // p256j$.time.chrono.InterfaceC4836b
    /* renamed from: a */
    public final InterfaceC4848n mo20996a() {
        return C4825C.f17906d;
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b
    public final int hashCode() {
        C4825C.f17906d.getClass();
        return this.f17908a.hashCode() ^ (-1990173233);
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: J */
    public final InterfaceC4849o mo20990J() {
        return m20987P() >= 1 ? EnumC4828F.ROC : EnumC4828F.BEFORE_ROC;
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
        int i7 = AbstractC4826D.f17907a[enumC4900a.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            return this.f17908a.mo20912o(interfaceC4915p);
        }
        if (i7 != 4) {
            return C4825C.f17906d.mo20981C(enumC4900a);
        }
        C4919t mo21172l = EnumC4900a.YEAR.mo21172l();
        return C4919t.m21198j(1L, m20987P() <= 0 ? (-mo21172l.m21203e()) + 1912 : mo21172l.m21202d() - 1911);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            int i7 = AbstractC4826D.f17907a[((EnumC4900a) interfaceC4915p).ordinal()];
            if (i7 == 4) {
                int m20987P = m20987P();
                if (m20987P < 1) {
                    m20987P = 1 - m20987P;
                }
                return m20987P;
            }
            C4888i c4888i = this.f17908a;
            if (i7 == 5) {
                return ((m20987P() * 12) + c4888i.m21120O()) - 1;
            }
            if (i7 == 6) {
                return m20987P();
            }
            if (i7 != 7) {
                return c4888i.mo20914s(interfaceC4915p);
            }
            return m20987P() < 1 ? 0 : 1;
        }
        return interfaceC4915p.mo21173m(this);
    }

    /* renamed from: P */
    private int m20987P() {
        return this.f17908a.m21121Q() - 1911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p256j$.time.chrono.C4827E mo20902d(long r9, p256j$.time.temporal.InterfaceC4915p r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p256j$.time.temporal.EnumC4900a
            if (r0 == 0) goto L99
            r0 = r11
            j$.time.temporal.a r0 = (p256j$.time.temporal.EnumC4900a) r0
            long r1 = r8.mo20914s(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r8
        L10:
            int[] r1 = p256j$.time.chrono.AbstractC4826D.f17907a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.i r3 = r8.f17908a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4b
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L4b
            goto L61
        L27:
            j$.time.chrono.C r11 = p256j$.time.chrono.C4825C.f17906d
            j$.time.temporal.t r11 = r11.mo20981C(r0)
            r11.m21201b(r9, r0)
            int r11 = r8.m20987P()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.m21120O()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.i r9 = r3.m21127a0(r9)
            j$.time.chrono.E r9 = r8.m20988R(r9)
            return r9
        L4b:
            j$.time.chrono.C r2 = p256j$.time.chrono.C4825C.f17906d
            j$.time.temporal.t r2 = r2.mo20981C(r0)
            int r2 = r2.m21200a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L84
            if (r0 == r5) goto L79
            if (r0 == r4) goto L6a
        L61:
            j$.time.i r9 = r3.mo20902d(r9, r11)
            j$.time.chrono.E r9 = r8.m20988R(r9)
            return r9
        L6a:
            int r9 = r8.m20987P()
            int r9 = 1912 - r9
            j$.time.i r9 = r3.m21132g0(r9)
            j$.time.chrono.E r9 = r8.m20988R(r9)
            return r9
        L79:
            int r2 = r2 + 1911
            j$.time.i r9 = r3.m21132g0(r2)
            j$.time.chrono.E r9 = r8.m20988R(r9)
            return r9
        L84:
            int r9 = r8.m20987P()
            r10 = 1
            if (r9 < r10) goto L8e
            int r2 = r2 + 1911
            goto L90
        L8e:
            int r2 = 1912 - r2
        L90:
            j$.time.i r9 = r3.m21132g0(r2)
            j$.time.chrono.E r9 = r8.m20988R(r9)
            return r9
        L99:
            j$.time.chrono.b r9 = super.mo20902d(r9, r11)
            j$.time.chrono.E r9 = (p256j$.time.chrono.C4827E) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.time.chrono.C4827E.mo20902d(long, j$.time.temporal.p):j$.time.chrono.E");
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: O */
    public final InterfaceC4836b mo20911n(InterfaceC4913n interfaceC4913n) {
        return (C4827E) super.mo20911n(interfaceC4913n);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return (C4827E) super.mo20911n(c4888i);
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: N */
    final InterfaceC4836b mo20993N(long j7) {
        return m20988R(this.f17908a.m21128b0(j7));
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: M */
    final InterfaceC4836b mo20992M(long j7) {
        return m20988R(this.f17908a.m21127a0(j7));
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    /* renamed from: L */
    final InterfaceC4836b mo20991L(long j7) {
        return m20988R(this.f17908a.m21126Z(j7));
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b, p256j$.time.temporal.Temporal
    /* renamed from: e */
    public final InterfaceC4836b mo20903e(long j7, TemporalUnit temporalUnit) {
        return (C4827E) super.mo20903e(j7, temporalUnit);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.Temporal
    /* renamed from: e */
    public final Temporal mo20903e(long j7, TemporalUnit temporalUnit) {
        return (C4827E) super.mo20903e(j7, temporalUnit);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b
    /* renamed from: E */
    public final InterfaceC4836b mo20909l(long j7, TemporalUnit temporalUnit) {
        return (C4827E) super.mo20909l(j7, temporalUnit);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.temporal.Temporal
    /* renamed from: l */
    public final Temporal mo20909l(long j7, ChronoUnit chronoUnit) {
        return (C4827E) super.mo20909l(j7, chronoUnit);
    }

    /* renamed from: R */
    private C4827E m20988R(C4888i c4888i) {
        return c4888i.equals(this.f17908a) ? this : new C4827E(c4888i);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b
    /* renamed from: t */
    public final long mo20997t() {
        return this.f17908a.mo20997t();
    }

    @Override // p256j$.time.chrono.AbstractC4838d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4827E) {
            return this.f17908a.equals(((C4827E) obj).f17908a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C4829G((byte) 7, this);
    }

    @Override // p256j$.time.chrono.AbstractC4838d, p256j$.time.chrono.InterfaceC4836b
    /* renamed from: u */
    public final InterfaceC4839e mo20998u(C4891l c4891l) {
        return C4841g.m21010J(this, c4891l);
    }
}
