package p081L3;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import p067J3.C0737c0;
import p088M3.AbstractC1168j;
import p088M3.AbstractC1175q;
import p088M3.C1170l;
import p088M3.C1177s;
import p088M3.C1179u;
import p088M3.InterfaceC1167i;
import p095N3.AbstractC1266f;
import p095N3.AbstractC1271k;
import p095N3.C1264d;
import p095N3.C1267g;
import p095N3.C1272l;
import p116Q3.AbstractC2133b;
import p219e3.C4188r;
import p376x3.AbstractC6948c;

/* renamed from: L3.o */
/* loaded from: classes.dex */
public class C1102o {

    /* renamed from: a */
    public final InterfaceC1106p0 f3611a;

    /* renamed from: b */
    public final InterfaceC1076f0 f3612b;

    /* renamed from: c */
    public final InterfaceC1063b f3613c;

    /* renamed from: d */
    public final InterfaceC1096m f3614d;

    public C1102o(InterfaceC1106p0 interfaceC1106p0, InterfaceC1076f0 interfaceC1076f0, InterfaceC1063b interfaceC1063b, InterfaceC1096m interfaceC1096m) {
        this.f3611a = interfaceC1106p0;
        this.f3612b = interfaceC1076f0;
        this.f3613c = interfaceC1063b;
        this.f3614d = interfaceC1096m;
    }

    /* renamed from: a */
    public final Map m4348a(Map map, Map map2, Set set) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (C1177s c1177s : map.values()) {
            AbstractC1271k abstractC1271k = (AbstractC1271k) map2.get(c1177s.getKey());
            if (set.contains(c1177s.getKey()) && (abstractC1271k == null || (abstractC1271k.mo4823d() instanceof C1272l))) {
                hashMap.put(c1177s.getKey(), c1177s);
            } else if (abstractC1271k != null) {
                hashMap2.put(c1177s.getKey(), abstractC1271k.mo4823d().mo4826e());
                abstractC1271k.mo4823d().mo4824a(c1177s, abstractC1271k.mo4823d().mo4826e(), C4188r.m17564i());
            } else {
                hashMap2.put(c1177s.getKey(), C1264d.f3988b);
            }
        }
        hashMap2.putAll(m4361n(hashMap));
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap3.put((C1170l) entry.getKey(), new C1082h0((InterfaceC1167i) entry.getValue(), (C1264d) hashMap2.get(entry.getKey())));
        }
        return hashMap3;
    }

    /* renamed from: b */
    public final C1177s m4349b(C1170l c1170l, AbstractC1271k abstractC1271k) {
        return (abstractC1271k == null || (abstractC1271k.mo4823d() instanceof C1272l)) ? this.f3611a.mo4246d(c1170l) : C1177s.m4539q(c1170l);
    }

    /* renamed from: c */
    public InterfaceC1167i m4350c(C1170l c1170l) {
        AbstractC1271k mo4150a = this.f3613c.mo4150a(c1170l);
        C1177s m4349b = m4349b(c1170l, mo4150a);
        if (mo4150a != null) {
            mo4150a.mo4823d().mo4824a(m4349b, C1264d.f3988b, C4188r.m17564i());
        }
        return m4349b;
    }

    /* renamed from: d */
    public AbstractC6948c m4351d(Iterable iterable) {
        return m4357j(this.f3611a.mo4244b(iterable), new HashSet());
    }

    /* renamed from: e */
    public final AbstractC6948c m4352e(C0737c0 c0737c0, AbstractC1175q.a aVar, C1088j0 c1088j0) {
        AbstractC2133b.m7217d(c0737c0.m3108n().m4469n(), "Currently we only support collection group queries at the root.", new Object[0]);
        String m3100f = c0737c0.m3100f();
        AbstractC6948c m4491a = AbstractC1168j.m4491a();
        Iterator it = this.f3614d.mo3965e(m3100f).iterator();
        while (it.hasNext()) {
            Iterator it2 = m4353f(c0737c0.m3096a((C1179u) ((C1179u) it.next()).m4463f(m3100f)), aVar, c1088j0).iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                m4491a = m4491a.mo28455h((C1170l) entry.getKey(), (InterfaceC1167i) entry.getValue());
            }
        }
        return m4491a;
    }

    /* renamed from: f */
    public final AbstractC6948c m4353f(C0737c0 c0737c0, AbstractC1175q.a aVar, C1088j0 c1088j0) {
        Map mo4153d = this.f3613c.mo4153d(c0737c0.m3108n(), aVar.mo4453k());
        Map mo4247e = this.f3611a.mo4247e(c0737c0, aVar, mo4153d.keySet(), c1088j0);
        for (Map.Entry entry : mo4153d.entrySet()) {
            if (!mo4247e.containsKey(entry.getKey())) {
                mo4247e.put((C1170l) entry.getKey(), C1177s.m4539q((C1170l) entry.getKey()));
            }
        }
        AbstractC6948c m4491a = AbstractC1168j.m4491a();
        for (Map.Entry entry2 : mo4247e.entrySet()) {
            AbstractC1271k abstractC1271k = (AbstractC1271k) mo4153d.get(entry2.getKey());
            if (abstractC1271k != null) {
                abstractC1271k.mo4823d().mo4824a((C1177s) entry2.getValue(), C1264d.f3988b, C4188r.m17564i());
            }
            if (c0737c0.m3115u((InterfaceC1167i) entry2.getValue())) {
                m4491a = m4491a.mo28455h((C1170l) entry2.getKey(), (InterfaceC1167i) entry2.getValue());
            }
        }
        return m4491a;
    }

    /* renamed from: g */
    public final AbstractC6948c m4354g(C1179u c1179u) {
        AbstractC6948c m4491a = AbstractC1168j.m4491a();
        InterfaceC1167i m4350c = m4350c(C1170l.m4498j(c1179u));
        return m4350c.mo4482c() ? m4491a.mo28455h(m4350c.getKey(), m4350c) : m4491a;
    }

    /* renamed from: h */
    public AbstractC6948c m4355h(C0737c0 c0737c0, AbstractC1175q.a aVar) {
        return m4356i(c0737c0, aVar, null);
    }

    /* renamed from: i */
    public AbstractC6948c m4356i(C0737c0 c0737c0, AbstractC1175q.a aVar, C1088j0 c1088j0) {
        return c0737c0.m3112r() ? m4354g(c0737c0.m3108n()) : c0737c0.m3111q() ? m4352e(c0737c0, aVar, c1088j0) : m4353f(c0737c0, aVar, c1088j0);
    }

    /* renamed from: j */
    public AbstractC6948c m4357j(Map map, Set set) {
        HashMap hashMap = new HashMap();
        m4360m(hashMap, map.keySet());
        AbstractC6948c m4491a = AbstractC1168j.m4491a();
        for (Map.Entry entry : m4348a(map, hashMap, set).entrySet()) {
            m4491a = m4491a.mo28455h((C1170l) entry.getKey(), ((C1082h0) entry.getValue()).m4303a());
        }
        return m4491a;
    }

    /* renamed from: k */
    public C1099n m4358k(String str, AbstractC1175q.a aVar, int i7) {
        Map mo4248f = this.f3611a.mo4248f(str, aVar, i7);
        Map mo4155f = i7 - mo4248f.size() > 0 ? this.f3613c.mo4155f(str, aVar.mo4453k(), i7 - mo4248f.size()) : new HashMap();
        int i8 = -1;
        for (AbstractC1271k abstractC1271k : mo4155f.values()) {
            if (!mo4248f.containsKey(abstractC1271k.m4864b())) {
                mo4248f.put(abstractC1271k.m4864b(), m4349b(abstractC1271k.m4864b(), abstractC1271k));
            }
            i8 = Math.max(i8, abstractC1271k.mo4822c());
        }
        m4360m(mo4155f, mo4248f.keySet());
        return C1099n.m4345a(i8, m4348a(mo4248f, mo4155f, Collections.emptySet()));
    }

    /* renamed from: l */
    public Map m4359l(Map map) {
        HashMap hashMap = new HashMap();
        m4360m(hashMap, map.keySet());
        return m4348a(map, hashMap, new HashSet());
    }

    /* renamed from: m */
    public final void m4360m(Map map, Set set) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1170l c1170l = (C1170l) it.next();
            if (!map.containsKey(c1170l)) {
                treeSet.add(c1170l);
            }
        }
        map.putAll(this.f3613c.mo4151b(treeSet));
    }

    /* renamed from: n */
    public final Map m4361n(Map map) {
        List<C1267g> mo4182b = this.f3612b.mo4182b(map.keySet());
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (C1267g c1267g : mo4182b) {
            for (C1170l c1170l : c1267g.m4848f()) {
                C1177s c1177s = (C1177s) map.get(c1170l);
                if (c1177s != null) {
                    hashMap.put(c1170l, c1267g.m4844b(c1177s, hashMap.containsKey(c1170l) ? (C1264d) hashMap.get(c1170l) : C1264d.f3988b));
                    int m4847e = c1267g.m4847e();
                    if (!treeMap.containsKey(Integer.valueOf(m4847e))) {
                        treeMap.put(Integer.valueOf(m4847e), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(m4847e))).add(c1170l);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (C1170l c1170l2 : (Set) entry.getValue()) {
                if (!hashSet.contains(c1170l2)) {
                    AbstractC1266f m4832c = AbstractC1266f.m4832c((C1177s) map.get(c1170l2), (C1264d) hashMap.get(c1170l2));
                    if (m4832c != null) {
                        hashMap2.put(c1170l2, m4832c);
                    }
                    hashSet.add(c1170l2);
                }
            }
            this.f3613c.mo4154e(((Integer) entry.getKey()).intValue(), hashMap2);
        }
        return hashMap;
    }

    /* renamed from: o */
    public void m4362o(Set set) {
        m4361n(this.f3611a.mo4244b(set));
    }
}
