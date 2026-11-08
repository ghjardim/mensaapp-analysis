package p095N3;

import p088M3.C1170l;
import p088M3.C1177s;
import p116Q3.AbstractC2133b;
import p219e3.C4188r;

/* renamed from: N3.q */
/* loaded from: classes.dex */
public final class C1277q extends AbstractC1266f {
    public C1277q(C1170l c1170l, C1273m c1273m) {
        super(c1170l, c1273m);
    }

    @Override // p095N3.AbstractC1266f
    /* renamed from: a */
    public C1264d mo4824a(C1177s c1177s, C1264d c1264d, C4188r c4188r) {
        throw AbstractC2133b.m7214a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // p095N3.AbstractC1266f
    /* renamed from: b */
    public void mo4825b(C1177s c1177s, C1269i c1269i) {
        throw AbstractC2133b.m7214a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // p095N3.AbstractC1266f
    /* renamed from: e */
    public C1264d mo4826e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1277q.class != obj.getClass()) {
            return false;
        }
        return m4837i((C1277q) obj);
    }

    public int hashCode() {
        return m4838j();
    }

    public String toString() {
        return "VerifyMutation{" + m4839k() + "}";
    }
}
