package p067J3;

import java.util.Iterator;
import p067J3.C0762p;
import p088M3.AbstractC1184z;
import p088M3.C1176r;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;
import p272k4.C5413D;

/* renamed from: J3.e */
/* loaded from: classes.dex */
public class C0740e extends C0762p {
    public C0740e(C1176r c1176r, C5413D c5413d) {
        super(c1176r, C0762p.b.ARRAY_CONTAINS_ANY, c5413d);
        AbstractC2133b.m7217d(AbstractC1184z.m4611u(c5413d), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    @Override // p067J3.C0762p, p067J3.AbstractC0764q
    /* renamed from: d */
    public boolean mo3063d(InterfaceC1167i interfaceC1167i) {
        C5413D mo4485f = interfaceC1167i.mo4485f(m3270f());
        if (!AbstractC1184z.m4611u(mo4485f)) {
            return false;
        }
        Iterator it = mo4485f.m22453l0().mo22555g().iterator();
        while (it.hasNext()) {
            if (AbstractC1184z.m4607q(m3272h().m22453l0(), (C5413D) it.next())) {
                return true;
            }
        }
        return false;
    }
}
