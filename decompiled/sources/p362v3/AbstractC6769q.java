package p362v3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: v3.q */
/* loaded from: classes.dex */
public abstract class AbstractC6769q {

    /* renamed from: v3.q$b */
    public static class b {

        /* renamed from: a */
        public final C6755c f24356a;

        /* renamed from: b */
        public final Set f24357b = new HashSet();

        /* renamed from: c */
        public final Set f24358c = new HashSet();

        public b(C6755c c6755c) {
            this.f24356a = c6755c;
        }

        /* renamed from: a */
        public void m27785a(b bVar) {
            this.f24357b.add(bVar);
        }

        /* renamed from: b */
        public void m27786b(b bVar) {
            this.f24358c.add(bVar);
        }

        /* renamed from: c */
        public C6755c m27787c() {
            return this.f24356a;
        }

        /* renamed from: d */
        public Set m27788d() {
            return this.f24357b;
        }

        /* renamed from: e */
        public boolean m27789e() {
            return this.f24357b.isEmpty();
        }

        /* renamed from: f */
        public boolean m27790f() {
            return this.f24358c.isEmpty();
        }

        /* renamed from: g */
        public void m27791g(b bVar) {
            this.f24358c.remove(bVar);
        }
    }

    /* renamed from: v3.q$c */
    public static class c {

        /* renamed from: a */
        public final C6751F f24359a;

        /* renamed from: b */
        public final boolean f24360b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f24359a.equals(this.f24359a) && cVar.f24360b == this.f24360b;
        }

        public int hashCode() {
            return ((this.f24359a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f24360b).hashCode();
        }

        public c(C6751F c6751f, boolean z6) {
            this.f24359a = c6751f;
            this.f24360b = z6;
        }
    }

    /* renamed from: a */
    public static void m27782a(List list) {
        Set<b> m27784c = m27784c(list);
        Set m27783b = m27783b(m27784c);
        int i7 = 0;
        while (!m27783b.isEmpty()) {
            b bVar = (b) m27783b.iterator().next();
            m27783b.remove(bVar);
            i7++;
            for (b bVar2 : bVar.m27788d()) {
                bVar2.m27791g(bVar);
                if (bVar2.m27790f()) {
                    m27783b.add(bVar2);
                }
            }
        }
        if (i7 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : m27784c) {
            if (!bVar3.m27790f() && !bVar3.m27789e()) {
                arrayList.add(bVar3.m27787c());
            }
        }
        throw new C6771s(arrayList);
    }

    /* renamed from: b */
    public static Set m27783b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.m27790f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public static Set m27784c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (C6770r c6770r : bVar.m27787c().m27727g()) {
                            if (c6770r.m27804e() && (set = (Set) hashMap.get(new c(c6770r.m27802c(), c6770r.m27806g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.m27785a(bVar2);
                                    bVar2.m27786b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C6755c c6755c = (C6755c) it.next();
            b bVar3 = new b(c6755c);
            for (C6751F c6751f : c6755c.m27730j()) {
                c cVar = new c(c6751f, !c6755c.m27734p());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f24360b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c6751f));
                }
                set2.add(bVar3);
            }
        }
    }
}
