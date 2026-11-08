package p256j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p256j$.time.C4888i;
import p256j$.time.Instant;
import p256j$.time.ZoneId;
import p256j$.time.temporal.C4918s;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.x */
/* loaded from: classes3.dex */
public final class C4858x extends AbstractC4835a implements Serializable {

    /* renamed from: d */
    public static final C4858x f17959d = new C4858x();
    private static final long serialVersionUID = 459996390165777884L;

    private C4858x() {
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: k */
    public final String mo20984k() {
        return "Japanese";
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: r */
    public final String mo20985r() {
        return "japanese";
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: y */
    public final InterfaceC4836b mo20986y(Temporal temporal) {
        if (temporal instanceof C4860z) {
            return (C4860z) temporal;
        }
        return new C4860z(C4888i.m21109K(temporal));
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: G */
    public final InterfaceC4849o mo20983G(int i7) {
        return C4823A.m20977y(i7);
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: C */
    public final C4919t mo20981C(EnumC4900a enumC4900a) {
        switch (AbstractC4857w.f17958a[enumC4900a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new C4918s("Unsupported field: " + enumC4900a);
            case 5:
                return C4919t.m21199k(C4823A.m20974D(), 999999999 - C4823A.m20976r().m20979v().m21121Q());
            case 6:
                return C4919t.m21199k(C4823A.m20973C(), EnumC4900a.DAY_OF_YEAR.mo21172l().m21202d());
            case 7:
                return C4919t.m21198j(C4860z.f17961d.m21121Q(), 999999999L);
            case 8:
                return C4919t.m21198j(C4823A.f17900d.getValue(), C4823A.m20976r().getValue());
            default:
                return enumC4900a.mo21172l();
        }
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: D */
    public final InterfaceC4845k mo20982D(Instant instant, ZoneId zoneId) {
        return C4847m.m21034J(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new C4829G((byte) 1, this);
    }
}
