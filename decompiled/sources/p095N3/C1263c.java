package p095N3;

import p088M3.C1170l;
import p088M3.C1177s;
import p116Q3.AbstractC2133b;
import p219e3.C4188r;

/* renamed from: N3.c */
/* loaded from: classes.dex */
public final class C1263c extends AbstractC1266f {
    public C1263c(C1170l c1170l, C1273m c1273m) {
        super(c1170l, c1273m);
    }

    @Override // p095N3.AbstractC1266f
    /* renamed from: a */
    public C1264d mo4824a(C1177s c1177s, C1264d c1264d, C4188r c4188r) {
        m4842n(c1177s);
        if (!m4836h().m4873e(c1177s)) {
            return c1264d;
        }
        c1177s.m4543m(c1177s.mo4490k()).m4547u();
        return null;
    }

    @Override // p095N3.AbstractC1266f
    /* renamed from: b */
    public void mo4825b(C1177s c1177s, C1269i c1269i) {
        m4842n(c1177s);
        AbstractC2133b.m7217d(c1269i.m4857a().isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        c1177s.m4543m(c1269i.m4858b()).m4546t();
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
        if (obj == null || C1263c.class != obj.getClass()) {
            return false;
        }
        return m4837i((C1263c) obj);
    }

    public int hashCode() {
        return m4838j();
    }

    public String toString() {
        return "DeleteMutation{" + m4839k() + "}";
    }
}
