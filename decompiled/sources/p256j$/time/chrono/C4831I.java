package p256j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import p256j$.time.C4822c;
import p256j$.time.C4888i;
import p256j$.time.Instant;
import p256j$.time.ZoneId;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.I */
/* loaded from: classes3.dex */
public final class C4831I extends AbstractC4835a implements Serializable {

    /* renamed from: d */
    public static final C4831I f17913d = new C4831I();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: G */
    public final InterfaceC4849o mo20983G(int i7) {
        if (i7 == 0) {
            return EnumC4834L.BEFORE_BE;
        }
        if (i7 == 1) {
            return EnumC4834L.f17916BE;
        }
        throw new C4822c("Invalid era: " + i7);
    }

    private C4831I() {
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: k */
    public final String mo20984k() {
        return "ThaiBuddhist";
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: r */
    public final String mo20985r() {
        return "buddhist";
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: y */
    public final InterfaceC4836b mo20986y(Temporal temporal) {
        if (temporal instanceof C4833K) {
            return (C4833K) temporal;
        }
        return new C4833K(C4888i.m21109K(temporal));
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: C */
    public final C4919t mo20981C(EnumC4900a enumC4900a) {
        int i7 = AbstractC4830H.f17912a[enumC4900a.ordinal()];
        if (i7 == 1) {
            C4919t mo21172l = EnumC4900a.PROLEPTIC_MONTH.mo21172l();
            return C4919t.m21198j(mo21172l.m21203e() + 6516, mo21172l.m21202d() + 6516);
        }
        if (i7 == 2) {
            C4919t mo21172l2 = EnumC4900a.YEAR.mo21172l();
            return C4919t.m21199k((-(mo21172l2.m21203e() + 543)) + 1, mo21172l2.m21202d() + 543);
        }
        if (i7 == 3) {
            C4919t mo21172l3 = EnumC4900a.YEAR.mo21172l();
            return C4919t.m21198j(mo21172l3.m21203e() + 543, mo21172l3.m21202d() + 543);
        }
        return enumC4900a.mo21172l();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: D */
    public final InterfaceC4845k mo20982D(Instant instant, ZoneId zoneId) {
        return C4847m.m21034J(this, instant, zoneId);
    }

    Object writeReplace() {
        return new C4829G((byte) 1, this);
    }
}
