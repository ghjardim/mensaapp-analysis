package p095N3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p088M3.C1170l;
import p088M3.C1177s;
import p088M3.C1178t;
import p219e3.C4188r;

/* renamed from: N3.o */
/* loaded from: classes.dex */
public final class C1275o extends AbstractC1266f {

    /* renamed from: d */
    public final C1178t f4013d;

    public C1275o(C1170l c1170l, C1178t c1178t, C1273m c1273m) {
        this(c1170l, c1178t, c1273m, new ArrayList());
    }

    @Override // p095N3.AbstractC1266f
    /* renamed from: a */
    public C1264d mo4824a(C1177s c1177s, C1264d c1264d, C4188r c4188r) {
        m4842n(c1177s);
        if (!m4836h().m4873e(c1177s)) {
            return c1264d;
        }
        Map m4840l = m4840l(c4188r, c1177s);
        C1178t clone = this.f4013d.clone();
        clone.m4562m(m4840l);
        c1177s.m4542l(c1177s.mo4490k(), clone).m4547u();
        return null;
    }

    @Override // p095N3.AbstractC1266f
    /* renamed from: b */
    public void mo4825b(C1177s c1177s, C1269i c1269i) {
        m4842n(c1177s);
        C1178t clone = this.f4013d.clone();
        clone.m4562m(m4841m(c1177s, c1269i.m4857a()));
        c1177s.m4542l(c1269i.m4858b(), clone).m4546t();
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
        if (obj == null || C1275o.class != obj.getClass()) {
            return false;
        }
        C1275o c1275o = (C1275o) obj;
        return m4837i(c1275o) && this.f4013d.equals(c1275o.f4013d) && m4834f().equals(c1275o.m4834f());
    }

    public int hashCode() {
        return (m4838j() * 31) + this.f4013d.hashCode();
    }

    /* renamed from: o */
    public C1178t m4875o() {
        return this.f4013d;
    }

    public String toString() {
        return "SetMutation{" + m4839k() + ", value=" + this.f4013d + "}";
    }

    public C1275o(C1170l c1170l, C1178t c1178t, C1273m c1273m, List list) {
        super(c1170l, c1273m, list);
        this.f4013d = c1178t;
    }
}
