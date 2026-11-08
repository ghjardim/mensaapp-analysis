package p095N3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p088M3.C1170l;
import p088M3.C1176r;
import p088M3.C1177s;
import p088M3.C1178t;
import p219e3.C4188r;

/* renamed from: N3.l */
/* loaded from: classes.dex */
public final class C1272l extends AbstractC1266f {

    /* renamed from: d */
    public final C1178t f4007d;

    /* renamed from: e */
    public final C1264d f4008e;

    public C1272l(C1170l c1170l, C1178t c1178t, C1264d c1264d, C1273m c1273m) {
        this(c1170l, c1178t, c1264d, c1273m, new ArrayList());
    }

    @Override // p095N3.AbstractC1266f
    /* renamed from: a */
    public C1264d mo4824a(C1177s c1177s, C1264d c1264d, C4188r c4188r) {
        m4842n(c1177s);
        if (!m4836h().m4873e(c1177s)) {
            return c1264d;
        }
        Map m4840l = m4840l(c4188r, c1177s);
        Map m4866p = m4866p();
        C1178t mo4480a = c1177s.mo4480a();
        mo4480a.m4562m(m4866p);
        mo4480a.m4562m(m4840l);
        c1177s.m4542l(c1177s.mo4490k(), c1177s.mo4480a()).m4547u();
        if (c1264d == null) {
            return null;
        }
        HashSet hashSet = new HashSet(c1264d.m4829c());
        hashSet.addAll(this.f4008e.m4829c());
        hashSet.addAll(m4865o());
        return C1264d.m4827b(hashSet);
    }

    @Override // p095N3.AbstractC1266f
    /* renamed from: b */
    public void mo4825b(C1177s c1177s, C1269i c1269i) {
        m4842n(c1177s);
        if (!m4836h().m4873e(c1177s)) {
            c1177s.m4544n(c1269i.m4858b());
            return;
        }
        Map m4841m = m4841m(c1177s, c1269i.m4857a());
        C1178t mo4480a = c1177s.mo4480a();
        mo4480a.m4562m(m4866p());
        mo4480a.m4562m(m4841m);
        c1177s.m4542l(c1269i.m4858b(), c1177s.mo4480a()).m4546t();
    }

    @Override // p095N3.AbstractC1266f
    /* renamed from: e */
    public C1264d mo4826e() {
        return this.f4008e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1272l.class != obj.getClass()) {
            return false;
        }
        C1272l c1272l = (C1272l) obj;
        return m4837i(c1272l) && this.f4007d.equals(c1272l.f4007d) && m4834f().equals(c1272l.m4834f());
    }

    public int hashCode() {
        return (m4838j() * 31) + this.f4007d.hashCode();
    }

    /* renamed from: o */
    public final List m4865o() {
        ArrayList arrayList = new ArrayList();
        Iterator it = m4834f().iterator();
        while (it.hasNext()) {
            arrayList.add(((C1265e) it.next()).m4830a());
        }
        return arrayList;
    }

    /* renamed from: p */
    public final Map m4866p() {
        HashMap hashMap = new HashMap();
        for (C1176r c1176r : this.f4008e.m4829c()) {
            if (!c1176r.m4469n()) {
                hashMap.put(c1176r, this.f4007d.m4558i(c1176r));
            }
        }
        return hashMap;
    }

    /* renamed from: q */
    public C1178t m4867q() {
        return this.f4007d;
    }

    public String toString() {
        return "PatchMutation{" + m4839k() + ", mask=" + this.f4008e + ", value=" + this.f4007d + "}";
    }

    public C1272l(C1170l c1170l, C1178t c1178t, C1264d c1264d, C1273m c1273m, List list) {
        super(c1170l, c1273m, list);
        this.f4007d = c1178t;
        this.f4008e = c1264d;
    }
}
