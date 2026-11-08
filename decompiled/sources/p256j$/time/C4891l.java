package p256j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.StringUtils;
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
import p272k4.C5410A;

/* renamed from: j$.time.l */
/* loaded from: classes3.dex */
public final class C4891l implements Temporal, InterfaceC4913n, Comparable, Serializable {

    /* renamed from: e */
    public static final C4891l f18031e;

    /* renamed from: f */
    public static final C4891l f18032f;

    /* renamed from: g */
    public static final C4891l f18033g;

    /* renamed from: h */
    private static final C4891l[] f18034h = new C4891l[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a */
    private final byte f18035a;

    /* renamed from: b */
    private final byte f18036b;

    /* renamed from: c */
    private final byte f18037c;

    /* renamed from: d */
    private final int f18038d;

    static {
        int i7 = 0;
        while (true) {
            C4891l[] c4891lArr = f18034h;
            if (i7 < c4891lArr.length) {
                c4891lArr[i7] = new C4891l(i7, 0, 0, 0);
                i7++;
            } else {
                C4891l c4891l = c4891lArr[0];
                f18033g = c4891l;
                C4891l c4891l2 = c4891lArr[12];
                f18031e = c4891l;
                f18032f = new C4891l(23, 59, 59, 999999999);
                return;
            }
        }
    }

    /* renamed from: P */
    public static C4891l m21137P(int i7) {
        EnumC4900a.HOUR_OF_DAY.m21170I(i7);
        return f18034h[i7];
    }

    /* renamed from: R */
    public static C4891l m21139R(long j7) {
        EnumC4900a.SECOND_OF_DAY.m21170I(j7);
        int i7 = (int) (j7 / 3600);
        long j8 = j7 - (i7 * 3600);
        return m21134J(i7, (int) (j8 / 60), (int) (j8 - (r1 * 60)), 0);
    }

    /* renamed from: Q */
    public static C4891l m21138Q(long j7) {
        EnumC4900a.NANO_OF_DAY.m21170I(j7);
        int i7 = (int) (j7 / 3600000000000L);
        long j8 = j7 - (i7 * 3600000000000L);
        int i8 = (int) (j8 / 60000000000L);
        long j9 = j8 - (i8 * 60000000000L);
        int i9 = (int) (j9 / 1000000000);
        return m21134J(i7, i8, i9, (int) (j9 - (i9 * 1000000000)));
    }

    /* renamed from: K */
    public static C4891l m21135K(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        C4891l c4891l = (C4891l) temporal.mo20915w(AbstractC4911l.m21192g());
        if (c4891l != null) {
            return c4891l;
        }
        throw new C4822c("Unable to obtain LocalTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    /* renamed from: J */
    private static C4891l m21134J(int i7, int i8, int i9, int i10) {
        if ((i8 | i9 | i10) == 0) {
            return f18034h[i7];
        }
        return new C4891l(i7, i8, i9, i10);
    }

    private C4891l(int i7, int i8, int i9, int i10) {
        this.f18035a = (byte) i7;
        this.f18036b = (byte) i8;
        this.f18037c = (byte) i9;
        this.f18038d = i10;
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            return ((EnumC4900a) interfaceC4915p).m21171J();
        }
        return interfaceC4915p != null && interfaceC4915p.mo21174n(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        return AbstractC4911l.m21189d(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            return m21136L(interfaceC4915p);
        }
        return AbstractC4911l.m21186a(this, interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p instanceof EnumC4900a) {
            if (interfaceC4915p == EnumC4900a.NANO_OF_DAY) {
                return m21150Y();
            }
            if (interfaceC4915p == EnumC4900a.MICRO_OF_DAY) {
                return m21150Y() / 1000;
            }
            return m21136L(interfaceC4915p);
        }
        return interfaceC4915p.mo21173m(this);
    }

    /* renamed from: L */
    private int m21136L(InterfaceC4915p interfaceC4915p) {
        int i7 = AbstractC4890k.f18029a[((EnumC4900a) interfaceC4915p).ordinal()];
        byte b7 = this.f18036b;
        int i8 = this.f18038d;
        byte b8 = this.f18035a;
        switch (i7) {
            case 1:
                return i8;
            case 2:
                throw new C4918s("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i8 / PipesIterator.DEFAULT_QUEUE_SIZE;
            case 4:
                throw new C4918s("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i8 / 1000000;
            case 6:
                return (int) (m21150Y() / 1000000);
            case 7:
                return this.f18037c;
            case 8:
                return m21151Z();
            case 9:
                return b7;
            case 10:
                return (b8 * 60) + b7;
            case 11:
                return b8 % 12;
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                int i9 = b8 % 12;
                if (i9 % 12 == 0) {
                    return 12;
                }
                return i9;
            case 13:
                return b8;
            case 14:
                if (b8 == 0) {
                    return 24;
                }
                return b8;
            case 15:
                return b8 / 12;
            default:
                throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
    }

    /* renamed from: M */
    public final int m21142M() {
        return this.f18035a;
    }

    /* renamed from: O */
    public final int m21144O() {
        return this.f18037c;
    }

    /* renamed from: N */
    public final int m21143N() {
        return this.f18038d;
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C4891l mo20902d(long j7, InterfaceC4915p interfaceC4915p) {
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return (C4891l) interfaceC4915p.mo21175o(this, j7);
        }
        EnumC4900a enumC4900a = (EnumC4900a) interfaceC4915p;
        enumC4900a.m21170I(j7);
        int i7 = AbstractC4890k.f18029a[enumC4900a.ordinal()];
        byte b7 = this.f18036b;
        byte b8 = this.f18037c;
        int i8 = this.f18038d;
        byte b9 = this.f18035a;
        switch (i7) {
            case 1:
                return m21153b0((int) j7);
            case 2:
                return m21138Q(j7);
            case 3:
                return m21153b0(((int) j7) * PipesIterator.DEFAULT_QUEUE_SIZE);
            case 4:
                return m21138Q(j7 * 1000);
            case 5:
                return m21153b0(((int) j7) * 1000000);
            case 6:
                return m21138Q(j7 * 1000000);
            case 7:
                int i9 = (int) j7;
                if (b8 == i9) {
                    return this;
                }
                EnumC4900a.SECOND_OF_MINUTE.m21170I(i9);
                return m21134J(b9, b7, i9, i8);
            case 8:
                return m21149W(j7 - m21151Z());
            case 9:
                int i10 = (int) j7;
                if (b7 == i10) {
                    return this;
                }
                EnumC4900a.MINUTE_OF_HOUR.m21170I(i10);
                return m21134J(b9, i10, b8, i8);
            case 10:
                return m21147U(j7 - ((b9 * 60) + b7));
            case 11:
                return m21146T(j7 - (b9 % 12));
            case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                if (j7 == 12) {
                    j7 = 0;
                }
                return m21146T(j7 - (b9 % 12));
            case 13:
                int i11 = (int) j7;
                if (b9 == i11) {
                    return this;
                }
                EnumC4900a.HOUR_OF_DAY.m21170I(i11);
                return m21134J(i11, b7, b8, i8);
            case 14:
                if (j7 == 24) {
                    j7 = 0;
                }
                int i12 = (int) j7;
                if (b9 == i12) {
                    return this;
                }
                EnumC4900a.HOUR_OF_DAY.m21170I(i12);
                return m21134J(i12, b7, b8, i8);
            case 15:
                return m21146T((j7 - (b9 / 12)) * 12);
            default:
                throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
        }
    }

    /* renamed from: b0 */
    public final C4891l m21153b0(int i7) {
        if (this.f18038d == i7) {
            return this;
        }
        EnumC4900a.NANO_OF_SECOND.m21170I(i7);
        return m21134J(this.f18035a, this.f18036b, this.f18037c, i7);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final C4891l mo20903e(long j7, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (AbstractC4890k.f18030b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return m21148V(j7);
                case 2:
                    return m21148V((j7 % 86400000000L) * 1000);
                case 3:
                    return m21148V((j7 % 86400000) * 1000000);
                case 4:
                    return m21149W(j7);
                case 5:
                    return m21147U(j7);
                case 6:
                    return m21146T(j7);
                case 7:
                    return m21146T((j7 % 2) * 12);
                default:
                    throw new C4918s("Unsupported unit: " + temporalUnit);
            }
        }
        return (C4891l) temporalUnit.mo21168l(this, j7);
    }

    /* renamed from: T */
    public final C4891l m21146T(long j7) {
        if (j7 == 0) {
            return this;
        }
        return m21134J(((((int) (j7 % 24)) + this.f18035a) + 24) % 24, this.f18036b, this.f18037c, this.f18038d);
    }

    /* renamed from: U */
    public final C4891l m21147U(long j7) {
        if (j7 == 0) {
            return this;
        }
        int i7 = (this.f18035a * 60) + this.f18036b;
        int i8 = ((((int) (j7 % 1440)) + i7) + 1440) % 1440;
        return i7 == i8 ? this : m21134J(i8 / 60, i8 % 60, this.f18037c, this.f18038d);
    }

    /* renamed from: W */
    public final C4891l m21149W(long j7) {
        if (j7 == 0) {
            return this;
        }
        int i7 = (this.f18036b * 60) + (this.f18035a * 3600) + this.f18037c;
        int i8 = ((((int) (j7 % 86400)) + i7) + 86400) % 86400;
        return i7 == i8 ? this : m21134J(i8 / 3600, (i8 / 60) % 60, i8 % 60, this.f18038d);
    }

    /* renamed from: V */
    public final C4891l m21148V(long j7) {
        if (j7 == 0) {
            return this;
        }
        long m21150Y = m21150Y();
        long j8 = (((j7 % 86400000000000L) + m21150Y) + 86400000000000L) % 86400000000000L;
        return m21150Y == j8 ? this : m21134J((int) (j8 / 3600000000000L), (int) ((j8 / 60000000000L) % 60), (int) ((j8 / 1000000000) % 60), (int) (j8 % 1000000000));
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: l */
    public final Temporal mo20909l(long j7, ChronoUnit chronoUnit) {
        return j7 == Long.MIN_VALUE ? mo20903e(Long.MAX_VALUE, chronoUnit).mo20903e(1L, chronoUnit) : mo20903e(-j7, chronoUnit);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final Object mo20915w(InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21190e() || interfaceC4917r == AbstractC4911l.m21196k() || interfaceC4917r == AbstractC4911l.m21195j() || interfaceC4917r == AbstractC4911l.m21193h()) {
            return null;
        }
        if (interfaceC4917r == AbstractC4911l.m21192g()) {
            return this;
        }
        if (interfaceC4917r == AbstractC4911l.m21191f()) {
            return null;
        }
        if (interfaceC4917r == AbstractC4911l.m21194i()) {
            return ChronoUnit.NANOS;
        }
        return interfaceC4917r.mo21070a(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        return temporal.mo20902d(m21150Y(), EnumC4900a.NANO_OF_DAY);
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: f */
    public final long mo20904f(Temporal temporal, TemporalUnit temporalUnit) {
        C4891l m21135K = m21135K(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long m21150Y = m21135K.m21150Y() - m21150Y();
            switch (AbstractC4890k.f18030b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return m21150Y;
                case 2:
                    return m21150Y / 1000;
                case 3:
                    return m21150Y / 1000000;
                case 4:
                    return m21150Y / 1000000000;
                case 5:
                    return m21150Y / 60000000000L;
                case 6:
                    return m21150Y / 3600000000000L;
                case 7:
                    return m21150Y / 43200000000000L;
                default:
                    throw new C4918s("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, m21135K);
    }

    /* renamed from: Z */
    public final int m21151Z() {
        return (this.f18036b * 60) + (this.f18035a * 3600) + this.f18037c;
    }

    /* renamed from: Y */
    public final long m21150Y() {
        return (this.f18037c * 1000000000) + (this.f18036b * 60000000000L) + (this.f18035a * 3600000000000L) + this.f18038d;
    }

    @Override // java.lang.Comparable
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4891l c4891l) {
        int compare = Integer.compare(this.f18035a, c4891l.f18035a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.f18036b, c4891l.f18036b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.f18037c, c4891l.f18037c);
        return compare3 == 0 ? Integer.compare(this.f18038d, c4891l.f18038d) : compare3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4891l)) {
            return false;
        }
        C4891l c4891l = (C4891l) obj;
        return this.f18035a == c4891l.f18035a && this.f18036b == c4891l.f18036b && this.f18037c == c4891l.f18037c && this.f18038d == c4891l.f18038d;
    }

    @Override // p256j$.time.temporal.Temporal
    /* renamed from: n */
    public final Temporal mo20911n(C4888i c4888i) {
        return (C4891l) AbstractC4843i.m21017a(c4888i, this);
    }

    public final int hashCode() {
        long m21150Y = m21150Y();
        return (int) (m21150Y ^ (m21150Y >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b7 = this.f18035a;
        sb.append(b7 < 10 ? "0" : StringUtils.EMPTY);
        sb.append((int) b7);
        String str = TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
        byte b8 = this.f18036b;
        sb.append(b8 < 10 ? ":0" : TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb.append((int) b8);
        byte b9 = this.f18037c;
        int i7 = this.f18038d;
        if (b9 > 0 || i7 > 0) {
            if (b9 < 10) {
                str = ":0";
            }
            sb.append(str);
            sb.append((int) b9);
            if (i7 > 0) {
                sb.append('.');
                if (i7 % 1000000 == 0) {
                    sb.append(Integer.toString((i7 / 1000000) + PipesIterator.DEFAULT_QUEUE_SIZE).substring(1));
                } else if (i7 % PipesIterator.DEFAULT_QUEUE_SIZE == 0) {
                    sb.append(Integer.toString((i7 / PipesIterator.DEFAULT_QUEUE_SIZE) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i7 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new C4920u((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: c0 */
    final void m21154c0(DataOutput dataOutput) {
        byte b7 = this.f18037c;
        byte b8 = this.f18035a;
        byte b9 = this.f18036b;
        int i7 = this.f18038d;
        if (i7 != 0) {
            dataOutput.writeByte(b8);
            dataOutput.writeByte(b9);
            dataOutput.writeByte(b7);
            dataOutput.writeInt(i7);
            return;
        }
        if (b7 != 0) {
            dataOutput.writeByte(b8);
            dataOutput.writeByte(b9);
            dataOutput.writeByte(~b7);
        } else if (b9 == 0) {
            dataOutput.writeByte(~b8);
        } else {
            dataOutput.writeByte(b8);
            dataOutput.writeByte(~b9);
        }
    }

    /* renamed from: X */
    static C4891l m21140X(ObjectInput objectInput) {
        int i7;
        int i8;
        int readByte = objectInput.readByte();
        int i9 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i7 = 0;
            i8 = 0;
        } else {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                int i10 = ~readByte2;
                i8 = 0;
                i9 = i10;
                i7 = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    i7 = ~readByte3;
                } else {
                    i9 = objectInput.readInt();
                    i7 = readByte3;
                }
                i8 = i9;
                i9 = readByte2;
            }
        }
        EnumC4900a.HOUR_OF_DAY.m21170I(readByte);
        EnumC4900a.MINUTE_OF_HOUR.m21170I(i9);
        EnumC4900a.SECOND_OF_MINUTE.m21170I(i7);
        EnumC4900a.NANO_OF_SECOND.m21170I(i8);
        return m21134J(readByte, i9, i7, i8);
    }
}
