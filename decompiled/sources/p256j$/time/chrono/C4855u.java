package p256j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p256j$.time.C4819B;
import p256j$.time.C4822c;
import p256j$.time.C4888i;
import p256j$.time.Instant;
import p256j$.time.LocalDateTime;
import p256j$.time.ZoneId;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.EnumC4900a;
import p256j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.u */
/* loaded from: classes3.dex */
public final class C4855u extends AbstractC4835a implements Serializable {

    /* renamed from: d */
    public static final C4855u f17955d = new C4855u();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: G */
    public final InterfaceC4849o mo20983G(int i7) {
        if (i7 == 0) {
            return EnumC4856v.BCE;
        }
        if (i7 == 1) {
            return EnumC4856v.f17956CE;
        }
        throw new C4822c("Invalid era: " + i7);
    }

    private C4855u() {
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: k */
    public final String mo20984k() {
        return "ISO";
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: r */
    public final String mo20985r() {
        return "iso8601";
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: y */
    public final InterfaceC4836b mo20986y(Temporal temporal) {
        return C4888i.m21109K(temporal);
    }

    @Override // p256j$.time.chrono.AbstractC4835a, p256j$.time.chrono.InterfaceC4848n
    /* renamed from: x */
    public final InterfaceC4839e mo21005x(Temporal temporal) {
        return LocalDateTime.m20929J(temporal);
    }

    @Override // p256j$.time.chrono.AbstractC4835a, p256j$.time.chrono.InterfaceC4848n
    /* renamed from: v */
    public final InterfaceC4845k mo21004v(Temporal temporal) {
        return C4819B.m20888I(temporal);
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: D */
    public final InterfaceC4845k mo20982D(Instant instant, ZoneId zoneId) {
        return C4819B.m20889J(instant, zoneId);
    }

    /* renamed from: n */
    public static boolean m21053n(long j7) {
        return (3 & j7) == 0 && (j7 % 100 != 0 || j7 % 400 == 0);
    }

    @Override // p256j$.time.chrono.InterfaceC4848n
    /* renamed from: C */
    public final C4919t mo20981C(EnumC4900a enumC4900a) {
        return enumC4900a.mo21172l();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new C4829G((byte) 1, this);
    }
}
