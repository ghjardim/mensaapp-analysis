package p256j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.apache.tika.utils.StringUtils;
import p256j$.time.chrono.AbstractC4843i;
import p256j$.time.chrono.C4855u;
import p256j$.time.format.C4877n;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4918s;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.InterfaceC4912m;
import p256j$.time.temporal.InterfaceC4913n;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.InterfaceC4917r;
import p256j$.time.temporal.Temporal;
import p256j$.util.Objects;

/* renamed from: j$.time.p */
/* loaded from: classes3.dex */
public final class C4895p implements InterfaceC4912m, InterfaceC4913n, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a */
    private final int f18043a;

    /* renamed from: b */
    private final int f18044b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4895p c4895p = (C4895p) obj;
        int i7 = this.f18043a - c4895p.f18043a;
        return i7 == 0 ? this.f18044b - c4895p.f18044b : i7;
    }

    static {
        C4877n c4877n = new C4877n();
        c4877n.m21085f("--");
        c4877n.m21089k(EnumC4900a.MONTH_OF_YEAR, 2);
        c4877n.m21084e('-');
        c4877n.m21089k(EnumC4900a.DAY_OF_MONTH, 2);
        c4877n.m21099v();
    }

    private C4895p(int i7, int i8) {
        this.f18043a = i7;
        this.f18044b = i8;
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        return interfaceC4915p instanceof EnumC4900a ? interfaceC4915p == EnumC4900a.MONTH_OF_YEAR || interfaceC4915p == EnumC4900a.DAY_OF_MONTH : interfaceC4915p != null && interfaceC4915p.mo21174n(this);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        if (interfaceC4915p == EnumC4900a.MONTH_OF_YEAR) {
            return interfaceC4915p.mo21172l();
        }
        if (interfaceC4915p != EnumC4900a.DAY_OF_MONTH) {
            return AbstractC4911l.m21189d(this, interfaceC4915p);
        }
        EnumC4893n m21155L = EnumC4893n.m21155L(this.f18043a);
        m21155L.getClass();
        int i7 = AbstractC4892m.f18039a[m21155L.ordinal()];
        return C4919t.m21199k(i7 != 1 ? (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) ? 30 : 31 : 28, EnumC4893n.m21155L(r5).m21158K());
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final int mo20910m(InterfaceC4915p interfaceC4915p) {
        return mo20912o(interfaceC4915p).m21200a(mo20914s(interfaceC4915p), interfaceC4915p);
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        int i7;
        if (!(interfaceC4915p instanceof EnumC4900a)) {
            return interfaceC4915p.mo21173m(this);
        }
        int i8 = AbstractC4894o.f18042a[((EnumC4900a) interfaceC4915p).ordinal()];
        if (i8 == 1) {
            i7 = this.f18044b;
        } else {
            if (i8 != 2) {
                throw new C4918s(AbstractC4861d.m21057a("Unsupported field: ", interfaceC4915p));
            }
            i7 = this.f18043a;
        }
        return i7;
    }

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final Object mo20915w(InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21190e()) {
            return C4855u.f17955d;
        }
        return AbstractC4911l.m21188c(this, interfaceC4917r);
    }

    @Override // p256j$.time.temporal.InterfaceC4913n
    /* renamed from: z */
    public final Temporal mo20927z(Temporal temporal) {
        if (!AbstractC4843i.m21032p(temporal).equals(C4855u.f17955d)) {
            throw new C4822c("Adjustment only supported on ISO date-time");
        }
        Temporal mo20902d = temporal.mo20902d(this.f18043a, EnumC4900a.MONTH_OF_YEAR);
        EnumC4900a enumC4900a = EnumC4900a.DAY_OF_MONTH;
        return mo20902d.mo20902d(Math.min(mo20902d.mo20912o(enumC4900a).m21202d(), this.f18044b), enumC4900a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4895p)) {
            return false;
        }
        C4895p c4895p = (C4895p) obj;
        return this.f18043a == c4895p.f18043a && this.f18044b == c4895p.f18044b;
    }

    public final int hashCode() {
        return (this.f18043a << 6) + this.f18044b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i7 = this.f18043a;
        sb.append(i7 < 10 ? "0" : StringUtils.EMPTY);
        sb.append(i7);
        int i8 = this.f18044b;
        sb.append(i8 < 10 ? "-0" : "-");
        sb.append(i8);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C4920u((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: J */
    final void m21161J(DataOutput dataOutput) {
        dataOutput.writeByte(this.f18043a);
        dataOutput.writeByte(this.f18044b);
    }

    /* renamed from: I */
    static C4895p m21160I(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        byte readByte2 = objectInput.readByte();
        EnumC4893n m21155L = EnumC4893n.m21155L(readByte);
        Objects.requireNonNull(m21155L, "month");
        EnumC4900a.DAY_OF_MONTH.m21170I(readByte2);
        if (readByte2 > m21155L.m21158K()) {
            throw new C4822c("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + m21155L.name());
        }
        return new C4895p(m21155L.getValue(), readByte2);
    }
}
