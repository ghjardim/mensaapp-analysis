package p256j$.time.format;

import p256j$.time.ZoneId;

/* renamed from: j$.time.format.l */
/* loaded from: classes3.dex */
final class C4875l implements InterfaceC4869f {

    /* renamed from: a */
    public final /* synthetic */ int f17995a;

    /* renamed from: b */
    private final Object f17996b;

    public /* synthetic */ C4875l(int i7, Object obj) {
        this.f17995a = i7;
        this.f17996b = obj;
    }

    @Override // p256j$.time.format.InterfaceC4869f
    /* renamed from: l */
    public final boolean mo21072l(C4879p c4879p, StringBuilder sb) {
        switch (this.f17995a) {
            case 0:
                sb.append((String) this.f17996b);
                break;
            default:
                ZoneId zoneId = (ZoneId) c4879p.m21105f((C4864a) this.f17996b);
                if (zoneId != null) {
                    sb.append(zoneId.mo20963k());
                    break;
                }
                break;
        }
        return true;
    }

    public final String toString() {
        switch (this.f17995a) {
            case 0:
                return "'" + ((String) this.f17996b).replace("'", "''") + "'";
            default:
                return "ZoneRegionId()";
        }
    }
}
