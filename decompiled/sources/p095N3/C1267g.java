package p095N3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p081L3.C1082h0;
import p088M3.C1170l;
import p088M3.C1177s;
import p088M3.C1181w;
import p116Q3.AbstractC2133b;
import p219e3.C4188r;

/* renamed from: N3.g */
/* loaded from: classes.dex */
public final class C1267g {

    /* renamed from: a */
    public final int f3995a;

    /* renamed from: b */
    public final C4188r f3996b;

    /* renamed from: c */
    public final List f3997c;

    /* renamed from: d */
    public final List f3998d;

    public C1267g(int i7, C4188r c4188r, List list, List list2) {
        AbstractC2133b.m7217d(!list2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f3995a = i7;
        this.f3996b = c4188r;
        this.f3997c = list;
        this.f3998d = list2;
    }

    /* renamed from: a */
    public Map m4843a(Map map, Set set) {
        HashMap hashMap = new HashMap();
        for (C1170l c1170l : m4848f()) {
            C1177s c1177s = (C1177s) ((C1082h0) map.get(c1170l)).m4303a();
            C1264d m4844b = m4844b(c1177s, ((C1082h0) map.get(c1170l)).m4304b());
            if (set.contains(c1170l)) {
                m4844b = null;
            }
            AbstractC1266f m4832c = AbstractC1266f.m4832c(c1177s, m4844b);
            if (m4832c != null) {
                hashMap.put(c1170l, m4832c);
            }
            if (!c1177s.m4545o()) {
                c1177s.m4543m(C1181w.f3793b);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public C1264d m4844b(C1177s c1177s, C1264d c1264d) {
        for (int i7 = 0; i7 < this.f3997c.size(); i7++) {
            AbstractC1266f abstractC1266f = (AbstractC1266f) this.f3997c.get(i7);
            if (abstractC1266f.m4835g().equals(c1177s.getKey())) {
                c1264d = abstractC1266f.mo4824a(c1177s, c1264d, this.f3996b);
            }
        }
        for (int i8 = 0; i8 < this.f3998d.size(); i8++) {
            AbstractC1266f abstractC1266f2 = (AbstractC1266f) this.f3998d.get(i8);
            if (abstractC1266f2.m4835g().equals(c1177s.getKey())) {
                c1264d = abstractC1266f2.mo4824a(c1177s, c1264d, this.f3996b);
            }
        }
        return c1264d;
    }

    /* renamed from: c */
    public void m4845c(C1177s c1177s, C1268h c1268h) {
        int size = this.f3998d.size();
        List m4855e = c1268h.m4855e();
        AbstractC2133b.m7217d(m4855e.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(m4855e.size()));
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC1266f abstractC1266f = (AbstractC1266f) this.f3998d.get(i7);
            if (abstractC1266f.m4835g().equals(c1177s.getKey())) {
                abstractC1266f.mo4825b(c1177s, (C1269i) m4855e.get(i7));
            }
        }
    }

    /* renamed from: d */
    public List m4846d() {
        return this.f3997c;
    }

    /* renamed from: e */
    public int m4847e() {
        return this.f3995a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1267g.class != obj.getClass()) {
            return false;
        }
        C1267g c1267g = (C1267g) obj;
        return this.f3995a == c1267g.f3995a && this.f3996b.equals(c1267g.f3996b) && this.f3997c.equals(c1267g.f3997c) && this.f3998d.equals(c1267g.f3998d);
    }

    /* renamed from: f */
    public Set m4848f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f3998d.iterator();
        while (it.hasNext()) {
            hashSet.add(((AbstractC1266f) it.next()).m4835g());
        }
        return hashSet;
    }

    /* renamed from: g */
    public C4188r m4849g() {
        return this.f3996b;
    }

    /* renamed from: h */
    public List m4850h() {
        return this.f3998d;
    }

    public int hashCode() {
        return (((((this.f3995a * 31) + this.f3996b.hashCode()) * 31) + this.f3997c.hashCode()) * 31) + this.f3998d.hashCode();
    }

    public String toString() {
        return "MutationBatch(batchId=" + this.f3995a + ", localWriteTime=" + this.f3996b + ", baseMutations=" + this.f3997c + ", mutations=" + this.f3998d + ')';
    }
}
