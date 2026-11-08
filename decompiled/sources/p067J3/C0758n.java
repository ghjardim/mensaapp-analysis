package p067J3;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import p067J3.C0756m;
import p088M3.C1170l;
import p116Q3.AbstractC2133b;

/* renamed from: J3.n */
/* loaded from: classes.dex */
public class C0758n {

    /* renamed from: a */
    public final TreeMap f2689a = new TreeMap();

    /* renamed from: a */
    public void m3254a(C0756m c0756m) {
        C1170l key = c0756m.m3251b().getKey();
        C0756m c0756m2 = (C0756m) this.f2689a.get(key);
        if (c0756m2 == null) {
            this.f2689a.put(key, c0756m);
            return;
        }
        C0756m.a m3252c = c0756m2.m3252c();
        C0756m.a m3252c2 = c0756m.m3252c();
        C0756m.a aVar = C0756m.a.ADDED;
        if (m3252c2 != aVar && m3252c == C0756m.a.METADATA) {
            this.f2689a.put(key, c0756m);
            return;
        }
        if (m3252c2 == C0756m.a.METADATA && m3252c != C0756m.a.REMOVED) {
            this.f2689a.put(key, C0756m.m3250a(m3252c, c0756m.m3251b()));
            return;
        }
        C0756m.a aVar2 = C0756m.a.MODIFIED;
        if (m3252c2 == aVar2 && m3252c == aVar2) {
            this.f2689a.put(key, C0756m.m3250a(aVar2, c0756m.m3251b()));
            return;
        }
        if (m3252c2 == aVar2 && m3252c == aVar) {
            this.f2689a.put(key, C0756m.m3250a(aVar, c0756m.m3251b()));
            return;
        }
        C0756m.a aVar3 = C0756m.a.REMOVED;
        if (m3252c2 == aVar3 && m3252c == aVar) {
            this.f2689a.remove(key);
            return;
        }
        if (m3252c2 == aVar3 && m3252c == aVar2) {
            this.f2689a.put(key, C0756m.m3250a(aVar3, c0756m2.m3251b()));
        } else {
            if (m3252c2 != aVar || m3252c != aVar3) {
                throw AbstractC2133b.m7214a("Unsupported combination of changes %s after %s", m3252c2, m3252c);
            }
            this.f2689a.put(key, C0756m.m3250a(aVar2, c0756m.m3251b()));
        }
    }

    /* renamed from: b */
    public List m3255b() {
        return new ArrayList(this.f2689a.values());
    }
}
