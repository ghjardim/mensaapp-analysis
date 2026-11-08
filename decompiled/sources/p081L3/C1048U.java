package p081L3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import org.apache.tika.utils.StringUtils;
import p088M3.C1170l;
import p088M3.C1179u;
import p095N3.AbstractC1266f;
import p095N3.AbstractC1271k;
import p116Q3.AbstractC2157z;

/* renamed from: L3.U */
/* loaded from: classes.dex */
public class C1048U implements InterfaceC1063b {

    /* renamed from: a */
    public final TreeMap f3468a = new TreeMap();

    /* renamed from: b */
    public final Map f3469b = new HashMap();

    @Override // p081L3.InterfaceC1063b
    /* renamed from: a */
    public AbstractC1271k mo4150a(C1170l c1170l) {
        return (AbstractC1271k) this.f3468a.get(c1170l);
    }

    @Override // p081L3.InterfaceC1063b
    /* renamed from: b */
    public Map mo4151b(SortedSet sortedSet) {
        HashMap hashMap = new HashMap();
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            C1170l c1170l = (C1170l) it.next();
            AbstractC1271k abstractC1271k = (AbstractC1271k) this.f3468a.get(c1170l);
            if (abstractC1271k != null) {
                hashMap.put(c1170l, abstractC1271k);
            }
        }
        return hashMap;
    }

    @Override // p081L3.InterfaceC1063b
    /* renamed from: c */
    public void mo4152c(int i7) {
        if (this.f3469b.containsKey(Integer.valueOf(i7))) {
            Set set = (Set) this.f3469b.get(Integer.valueOf(i7));
            this.f3469b.remove(Integer.valueOf(i7));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f3468a.remove((C1170l) it.next());
            }
        }
    }

    @Override // p081L3.InterfaceC1063b
    /* renamed from: d */
    public Map mo4153d(C1179u c1179u, int i7) {
        HashMap hashMap = new HashMap();
        int m4471q = c1179u.m4471q() + 1;
        for (AbstractC1271k abstractC1271k : this.f3468a.tailMap(C1170l.m4498j((C1179u) c1179u.m4463f(StringUtils.EMPTY))).values()) {
            C1170l m4864b = abstractC1271k.m4864b();
            if (!c1179u.m4470p(m4864b.m4505o())) {
                break;
            }
            if (m4864b.m4505o().m4471q() == m4471q && abstractC1271k.mo4822c() > i7) {
                hashMap.put(abstractC1271k.m4864b(), abstractC1271k);
            }
        }
        return hashMap;
    }

    @Override // p081L3.InterfaceC1063b
    /* renamed from: e */
    public void mo4154e(int i7, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            m4156g(i7, (AbstractC1266f) AbstractC2157z.m7331d((AbstractC1266f) entry.getValue(), "null value for key: %s", entry.getKey()));
        }
    }

    @Override // p081L3.InterfaceC1063b
    /* renamed from: f */
    public Map mo4155f(String str, int i7, int i8) {
        TreeMap treeMap = new TreeMap();
        for (AbstractC1271k abstractC1271k : this.f3468a.values()) {
            if (abstractC1271k.m4864b().m4502l().equals(str) && abstractC1271k.mo4822c() > i7) {
                Map map = (Map) treeMap.get(Integer.valueOf(abstractC1271k.mo4822c()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(abstractC1271k.mo4822c()), map);
                }
                map.put(abstractC1271k.m4864b(), abstractC1271k);
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            hashMap.putAll((Map) it.next());
            if (hashMap.size() >= i8) {
                break;
            }
        }
        return hashMap;
    }

    /* renamed from: g */
    public final void m4156g(int i7, AbstractC1266f abstractC1266f) {
        AbstractC1271k abstractC1271k = (AbstractC1271k) this.f3468a.get(abstractC1266f.m4835g());
        if (abstractC1271k != null) {
            ((Set) this.f3469b.get(Integer.valueOf(abstractC1271k.mo4822c()))).remove(abstractC1266f.m4835g());
        }
        this.f3468a.put(abstractC1266f.m4835g(), AbstractC1271k.m4863a(i7, abstractC1266f));
        if (this.f3469b.get(Integer.valueOf(i7)) == null) {
            this.f3469b.put(Integer.valueOf(i7), new HashSet());
        }
        ((Set) this.f3469b.get(Integer.valueOf(i7))).add(abstractC1266f.m4835g());
    }
}
