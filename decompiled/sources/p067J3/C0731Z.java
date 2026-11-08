package p067J3;

import p067J3.C0762p;
import p088M3.AbstractC1184z;
import p088M3.C1176r;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;
import p272k4.C5413D;

/* renamed from: J3.Z */
/* loaded from: classes.dex */
public class C0731Z extends C0762p {
    public C0731Z(C1176r c1176r, C5413D c5413d) {
        super(c1176r, C0762p.b.NOT_IN, c5413d);
        AbstractC2133b.m7217d(AbstractC1184z.m4611u(c5413d), "NotInFilter expects an ArrayValue", new Object[0]);
    }

    @Override // p067J3.C0762p, p067J3.AbstractC0764q
    /* renamed from: d */
    public boolean mo3063d(InterfaceC1167i interfaceC1167i) {
        C5413D mo4485f;
        return (AbstractC1184z.m4607q(m3272h().m22453l0(), AbstractC1184z.f3800b) || (mo4485f = interfaceC1167i.mo4485f(m3270f())) == null || AbstractC1184z.m4607q(m3272h().m22453l0(), mo4485f)) ? false : true;
    }
}
