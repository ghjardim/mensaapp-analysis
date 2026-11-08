package p256j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p256j$.time.C4822c;
import p256j$.time.C4888i;
import p256j$.time.Instant;
import p256j$.time.ZoneId;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.C */
/* loaded from: classes3.dex */
public final class C4825C extends AbstractC4835a implements Serializable {

    /* renamed from: d */
    public static final C4825C f17906d = new C4825C();
    private static final long serialVersionUID = 1039765215346859963L;

    private C4825C() {
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: k */
    public final String mo20984k() {
        return "Minguo";
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: G */
    public final InterfaceC4849o mo20983G(int i7) {
        if (i7 == 0) {
            return EnumC4828F.BEFORE_ROC;
        }
        if (i7 == 1) {
            return EnumC4828F.ROC;
        }
        throw new C4822c("Invalid era: " + i7);
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: r */
    public final String mo20985r() {
        return "roc";
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: y */
    public final InterfaceC4836b mo20986y(Temporal temporal) {
        if (temporal instanceof C4827E) {
            return (C4827E) temporal;
        }
        return new C4827E(C4888i.m21109K(temporal));
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: C */
    public final C4919t mo20981C(EnumC4900a enumC4900a) {
        int i7 = AbstractC4824B.f17905a[enumC4900a.ordinal()];
        if (i7 == 1) {
            C4919t mo21172l = EnumC4900a.PROLEPTIC_MONTH.mo21172l();
            return C4919t.m21198j(mo21172l.m21203e() - 22932, mo21172l.m21202d() - 22932);
        }
        if (i7 == 2) {
            C4919t mo21172l2 = EnumC4900a.YEAR.mo21172l();
            return C4919t.m21199k(mo21172l2.m21202d() - 1911, (-mo21172l2.m21203e()) + 1912);
        }
        if (i7 == 3) {
            C4919t mo21172l3 = EnumC4900a.YEAR.mo21172l();
            return C4919t.m21198j(mo21172l3.m21203e() - 1911, mo21172l3.m21202d() - 1911);
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
