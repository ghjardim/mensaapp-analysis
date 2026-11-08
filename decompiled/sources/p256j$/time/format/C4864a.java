package p256j$.time.format;

import p256j$.time.ZoneId;
import p256j$.time.ZoneOffset;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.InterfaceC4912m;
import p256j$.time.temporal.InterfaceC4917r;

/* renamed from: j$.time.format.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4864a implements InterfaceC4917r {
    @Override // p256j$.time.temporal.InterfaceC4917r
    /* renamed from: a */
    public final Object mo21070a(InterfaceC4912m interfaceC4912m) {
        ZoneId zoneId = (ZoneId) interfaceC4912m.mo20915w(AbstractC4911l.m21196k());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
