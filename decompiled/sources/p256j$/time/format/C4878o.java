package p256j$.time.format;

import org.apache.tika.utils.StringUtils;
import p256j$.time.ZoneId;
import p256j$.time.chrono.InterfaceC4836b;
import p256j$.time.chrono.InterfaceC4848n;
import p256j$.time.temporal.AbstractC4911l;
import p256j$.time.temporal.C4919t;
import p256j$.time.temporal.InterfaceC4912m;
import p256j$.time.temporal.InterfaceC4915p;
import p256j$.time.temporal.InterfaceC4917r;

/* renamed from: j$.time.format.o */
/* loaded from: classes3.dex */
final class C4878o implements InterfaceC4912m {

    /* renamed from: a */
    final /* synthetic */ InterfaceC4836b f18007a;

    /* renamed from: b */
    final /* synthetic */ Object f18008b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC4848n f18009c;

    /* renamed from: d */
    final /* synthetic */ ZoneId f18010d;

    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: m */
    public final /* synthetic */ int mo20910m(InterfaceC4915p interfaceC4915p) {
        return AbstractC4911l.m21186a(this, interfaceC4915p);
    }

    C4878o(InterfaceC4836b interfaceC4836b, InterfaceC4912m interfaceC4912m, InterfaceC4848n interfaceC4848n, ZoneId zoneId) {
        this.f18007a = interfaceC4836b;
        this.f18008b = interfaceC4912m;
        this.f18009c = interfaceC4848n;
        this.f18010d = zoneId;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.m, java.lang.Object] */
    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: g */
    public final boolean mo20905g(InterfaceC4915p interfaceC4915p) {
        InterfaceC4836b interfaceC4836b = this.f18007a;
        if (interfaceC4836b != null && interfaceC4915p.mo21177w()) {
            return interfaceC4836b.mo20905g(interfaceC4915p);
        }
        return this.f18008b.mo20905g(interfaceC4915p);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.m, java.lang.Object] */
    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: o */
    public final C4919t mo20912o(InterfaceC4915p interfaceC4915p) {
        InterfaceC4836b interfaceC4836b = this.f18007a;
        if (interfaceC4836b != null && interfaceC4915p.mo21177w()) {
            return interfaceC4836b.mo20912o(interfaceC4915p);
        }
        return this.f18008b.mo20912o(interfaceC4915p);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.m, java.lang.Object] */
    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: s */
    public final long mo20914s(InterfaceC4915p interfaceC4915p) {
        InterfaceC4836b interfaceC4836b = this.f18007a;
        if (interfaceC4836b != null && interfaceC4915p.mo21177w()) {
            return interfaceC4836b.mo20914s(interfaceC4915p);
        }
        return this.f18008b.mo20914s(interfaceC4915p);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.m, java.lang.Object] */
    @Override // p256j$.time.temporal.InterfaceC4912m
    /* renamed from: w */
    public final Object mo20915w(InterfaceC4917r interfaceC4917r) {
        if (interfaceC4917r == AbstractC4911l.m21190e()) {
            return this.f18009c;
        }
        if (interfaceC4917r == AbstractC4911l.m21196k()) {
            return this.f18010d;
        }
        if (interfaceC4917r == AbstractC4911l.m21194i()) {
            return this.f18008b.mo20915w(interfaceC4917r);
        }
        return interfaceC4917r.mo21070a(this);
    }

    public final String toString() {
        String str;
        String str2 = StringUtils.EMPTY;
        InterfaceC4848n interfaceC4848n = this.f18009c;
        if (interfaceC4848n != null) {
            str = " with chronology " + interfaceC4848n;
        } else {
            str = StringUtils.EMPTY;
        }
        ZoneId zoneId = this.f18010d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f18008b + str + str2;
    }
}
