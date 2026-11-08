package p067J3;

import java.util.ArrayList;
import java.util.List;
import p067J3.C0762p;
import p088M3.AbstractC1184z;
import p088M3.C1170l;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;
import p272k4.C5413D;

/* renamed from: J3.U */
/* loaded from: classes.dex */
public class C0726U extends C0762p {

    /* renamed from: d */
    public final List f2554d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0726U(p088M3.C1176r r2, p272k4.C5413D r3) {
        /*
            r1 = this;
            J3.p$b r0 = p067J3.C0762p.b.IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2554d = r2
            java.util.List r3 = m3064k(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067J3.C0726U.<init>(M3.r, k4.D):void");
    }

    /* renamed from: k */
    public static List m3064k(C0762p.b bVar, C5413D c5413d) {
        AbstractC2133b.m7217d(bVar == C0762p.b.IN || bVar == C0762p.b.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        AbstractC2133b.m7217d(AbstractC1184z.m4611u(c5413d), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (C5413D c5413d2 : c5413d.m22453l0().mo22555g()) {
            AbstractC2133b.m7217d(AbstractC1184z.m4583C(c5413d2), "Comparing on key with " + bVar.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(C1170l.m4497i(c5413d2.m22460t0()));
        }
        return arrayList;
    }

    @Override // p067J3.C0762p, p067J3.AbstractC0764q
    /* renamed from: d */
    public boolean mo3063d(InterfaceC1167i interfaceC1167i) {
        return this.f2554d.contains(interfaceC1167i.getKey());
    }
}
