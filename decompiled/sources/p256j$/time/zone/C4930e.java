package p256j$.time.zone;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.apache.tika.utils.StringUtils;
import p256j$.time.C4888i;
import p256j$.time.C4891l;
import p256j$.time.EnumC4862e;
import p256j$.time.EnumC4893n;
import p256j$.time.LocalDateTime;
import p256j$.time.ZoneOffset;
import p256j$.time.chrono.C4855u;
import p256j$.time.temporal.InterfaceC4913n;
import p256j$.util.Objects;

/* renamed from: j$.time.zone.e */
/* loaded from: classes3.dex */
public final class C4930e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a */
    private final EnumC4893n f18109a;

    /* renamed from: b */
    private final byte f18110b;

    /* renamed from: c */
    private final EnumC4862e f18111c;

    /* renamed from: d */
    private final C4891l f18112d;

    /* renamed from: e */
    private final boolean f18113e;

    /* renamed from: f */
    private final EnumC4929d f18114f;

    /* renamed from: g */
    private final ZoneOffset f18115g;

    /* renamed from: h */
    private final ZoneOffset f18116h;

    /* renamed from: i */
    private final ZoneOffset f18117i;

    C4930e(EnumC4893n enumC4893n, int i7, EnumC4862e enumC4862e, C4891l c4891l, boolean z6, EnumC4929d enumC4929d, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f18109a = enumC4893n;
        this.f18110b = (byte) i7;
        this.f18111c = enumC4862e;
        this.f18112d = c4891l;
        this.f18113e = z6;
        this.f18114f = enumC4929d;
        this.f18115g = zoneOffset;
        this.f18116h = zoneOffset2;
        this.f18117i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C4926a((byte) 3, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        C4891l c4891l = this.f18112d;
        boolean z6 = this.f18113e;
        int m21151Z = z6 ? 86400 : c4891l.m21151Z();
        int m20971Q = this.f18115g.m20971Q();
        ZoneOffset zoneOffset = this.f18116h;
        int m20971Q2 = zoneOffset.m20971Q() - m20971Q;
        ZoneOffset zoneOffset2 = this.f18117i;
        int m20971Q3 = zoneOffset2.m20971Q() - m20971Q;
        int m21142M = m21151Z % 3600 == 0 ? z6 ? 24 : c4891l.m21142M() : 31;
        int i7 = m20971Q % 900 == 0 ? (m20971Q / 900) + 128 : 255;
        int i8 = (m20971Q2 == 0 || m20971Q2 == 1800 || m20971Q2 == 3600) ? m20971Q2 / 1800 : 3;
        int i9 = (m20971Q3 == 0 || m20971Q3 == 1800 || m20971Q3 == 3600) ? m20971Q3 / 1800 : 3;
        EnumC4862e enumC4862e = this.f18111c;
        objectOutput.writeInt((this.f18109a.getValue() << 28) + ((this.f18110b + 32) << 22) + ((enumC4862e == null ? 0 : enumC4862e.getValue()) << 19) + (m21142M << 14) + (this.f18114f.ordinal() << 12) + (i7 << 4) + (i8 << 2) + i9);
        if (m21142M == 31) {
            objectOutput.writeInt(m21151Z);
        }
        if (i7 == 255) {
            objectOutput.writeInt(m20971Q);
        }
        if (i8 == 3) {
            objectOutput.writeInt(zoneOffset.m20971Q());
        }
        if (i9 == 3) {
            objectOutput.writeInt(zoneOffset2.m20971Q());
        }
    }

    /* renamed from: b */
    static C4930e m21237b(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        EnumC4893n m21155L = EnumC4893n.m21155L(readInt >>> 28);
        int i7 = ((264241152 & readInt) >>> 22) - 32;
        int i8 = (3670016 & readInt) >>> 19;
        EnumC4862e m21058I = i8 == 0 ? null : EnumC4862e.m21058I(i8);
        int i9 = (507904 & readInt) >>> 14;
        EnumC4929d enumC4929d = EnumC4929d.values()[(readInt & 12288) >>> 12];
        int i10 = (readInt & 4080) >>> 4;
        int i11 = (readInt & 12) >>> 2;
        int i12 = readInt & 3;
        C4891l m21139R = i9 == 31 ? C4891l.m21139R(objectInput.readInt()) : C4891l.m21137P(i9 % 24);
        ZoneOffset m20967T = ZoneOffset.m20967T(i10 == 255 ? objectInput.readInt() : (i10 - 128) * 900);
        ZoneOffset m20967T2 = i11 == 3 ? ZoneOffset.m20967T(objectInput.readInt()) : ZoneOffset.m20967T((i11 * 1800) + m20967T.m20971Q());
        ZoneOffset m20967T3 = i12 == 3 ? ZoneOffset.m20967T(objectInput.readInt()) : ZoneOffset.m20967T((i12 * 1800) + m20967T.m20971Q());
        boolean z6 = i9 == 24;
        Objects.requireNonNull(m21155L, "month");
        Objects.requireNonNull(m21139R, "time");
        Objects.requireNonNull(enumC4929d, "timeDefnition");
        Objects.requireNonNull(m20967T, "standardOffset");
        Objects.requireNonNull(m20967T2, "offsetBefore");
        Objects.requireNonNull(m20967T3, "offsetAfter");
        if (i7 < -28 || i7 > 31 || i7 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z6 && !m21139R.equals(C4891l.f18033g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (m21139R.m21143N() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new C4930e(m21155L, i7, m21058I, m21139R, z6, enumC4929d, m20967T, m20967T2, m20967T3);
    }

    /* renamed from: a */
    public final C4927b m21238a(int i7) {
        C4888i m21114W;
        EnumC4862e enumC4862e = this.f18111c;
        EnumC4893n enumC4893n = this.f18109a;
        byte b7 = this.f18110b;
        if (b7 < 0) {
            C4855u.f17955d.getClass();
            m21114W = C4888i.m21114W(i7, enumC4893n, enumC4893n.m21157J(C4855u.m21053n(i7)) + 1 + b7);
            if (enumC4862e != null) {
                final int value = enumC4862e.getValue();
                final int i8 = 1;
                m21114W = m21114W.mo20911n(new InterfaceC4913n() { // from class: j$.time.temporal.o
                    @Override // p256j$.time.temporal.InterfaceC4913n
                    /* renamed from: z */
                    public final Temporal mo20927z(Temporal temporal) {
                        switch (i8) {
                            case 0:
                                int mo20910m = temporal.mo20910m(EnumC4900a.DAY_OF_WEEK);
                                int i9 = value;
                                if (mo20910m == i9) {
                                    return temporal;
                                }
                                return temporal.mo20903e(mo20910m - i9 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                            default:
                                int mo20910m2 = temporal.mo20910m(EnumC4900a.DAY_OF_WEEK);
                                int i10 = value;
                                if (mo20910m2 == i10) {
                                    return temporal;
                                }
                                return temporal.mo20909l(i10 - mo20910m2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
                        }
                    }
                });
            }
        } else {
            m21114W = C4888i.m21114W(i7, enumC4893n, b7);
            if (enumC4862e != null) {
                final int value2 = enumC4862e.getValue();
                final int i9 = 0;
                m21114W = m21114W.mo20911n(new InterfaceC4913n() { // from class: j$.time.temporal.o
                    @Override // p256j$.time.temporal.InterfaceC4913n
                    /* renamed from: z */
                    public final Temporal mo20927z(Temporal temporal) {
                        switch (i9) {
                            case 0:
                                int mo20910m = temporal.mo20910m(EnumC4900a.DAY_OF_WEEK);
                                int i92 = value2;
                                if (mo20910m == i92) {
                                    return temporal;
                                }
                                return temporal.mo20903e(mo20910m - i92 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                            default:
                                int mo20910m2 = temporal.mo20910m(EnumC4900a.DAY_OF_WEEK);
                                int i10 = value2;
                                if (mo20910m2 == i10) {
                                    return temporal;
                                }
                                return temporal.mo20909l(i10 - mo20910m2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
                        }
                    }
                });
            }
        }
        if (this.f18113e) {
            m21114W = m21114W.m21126Z(1L);
        }
        LocalDateTime m20931Q = LocalDateTime.m20931Q(m21114W, this.f18112d);
        EnumC4929d enumC4929d = this.f18114f;
        enumC4929d.getClass();
        int i10 = AbstractC4928c.f18107a[enumC4929d.ordinal()];
        ZoneOffset zoneOffset = this.f18116h;
        if (i10 == 1) {
            m20931Q = m20931Q.m20942T(zoneOffset.m20971Q() - ZoneOffset.UTC.m20971Q());
        } else if (i10 == 2) {
            m20931Q = m20931Q.m20942T(zoneOffset.m20971Q() - this.f18115g.m20971Q());
        }
        return new C4927b(m20931Q, zoneOffset, this.f18117i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4930e)) {
            return false;
        }
        C4930e c4930e = (C4930e) obj;
        return this.f18109a == c4930e.f18109a && this.f18110b == c4930e.f18110b && this.f18111c == c4930e.f18111c && this.f18114f == c4930e.f18114f && this.f18112d.equals(c4930e.f18112d) && this.f18113e == c4930e.f18113e && this.f18115g.equals(c4930e.f18115g) && this.f18116h.equals(c4930e.f18116h) && this.f18117i.equals(c4930e.f18117i);
    }

    public final int hashCode() {
        int m21151Z = ((this.f18112d.m21151Z() + (this.f18113e ? 1 : 0)) << 15) + (this.f18109a.ordinal() << 11) + ((this.f18110b + 32) << 5);
        EnumC4862e enumC4862e = this.f18111c;
        return ((this.f18115g.hashCode() ^ (this.f18114f.ordinal() + (m21151Z + ((enumC4862e == null ? 7 : enumC4862e.ordinal()) << 2)))) ^ this.f18116h.hashCode()) ^ this.f18117i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f18116h;
        ZoneOffset zoneOffset2 = this.f18117i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        EnumC4893n enumC4893n = this.f18109a;
        byte b7 = this.f18110b;
        EnumC4862e enumC4862e = this.f18111c;
        if (enumC4862e == null) {
            sb.append(enumC4893n.name());
            sb.append(' ');
            sb.append((int) b7);
        } else if (b7 == -1) {
            sb.append(enumC4862e.name());
            sb.append(" on or before last day of ");
            sb.append(enumC4893n.name());
        } else if (b7 < 0) {
            sb.append(enumC4862e.name());
            sb.append(" on or before last day minus ");
            sb.append((-b7) - 1);
            sb.append(" of ");
            sb.append(enumC4893n.name());
        } else {
            sb.append(enumC4862e.name());
            sb.append(" on or after ");
            sb.append(enumC4893n.name());
            sb.append(' ');
            sb.append((int) b7);
        }
        sb.append(" at ");
        sb.append(this.f18113e ? "24:00" : this.f18112d.toString());
        sb.append(StringUtils.SPACE);
        sb.append(this.f18114f);
        sb.append(", standard offset ");
        sb.append(this.f18115g);
        sb.append(']');
        return sb.toString();
    }
}
