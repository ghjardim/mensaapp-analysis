package p067J3;

import p067J3.C0762p;
import p088M3.AbstractC1184z;
import p088M3.C1170l;
import p088M3.C1176r;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;
import p272k4.C5413D;

/* renamed from: J3.T */
/* loaded from: classes.dex */
public class C0725T extends C0762p {

    /* renamed from: d */
    public final C1170l f2553d;

    public C0725T(C1176r c1176r, C0762p.b bVar, C5413D c5413d) {
        super(c1176r, bVar, c5413d);
        AbstractC2133b.m7217d(AbstractC1184z.m4583C(c5413d), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.f2553d = C1170l.m4497i(m3272h().m22460t0());
    }

    @Override // p067J3.C0762p, p067J3.AbstractC0764q
    /* renamed from: d */
    public boolean mo3063d(InterfaceC1167i interfaceC1167i) {
        return m3274j(interfaceC1167i.getKey().compareTo(this.f2553d));
    }
}
