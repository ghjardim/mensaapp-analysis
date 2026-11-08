package p095N3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p088M3.C1170l;
import p088M3.C1176r;
import p088M3.C1177s;
import p088M3.C1178t;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;
import p219e3.C4188r;
import p272k4.C5413D;

/* renamed from: N3.f */
/* loaded from: classes.dex */
public abstract class AbstractC1266f {

    /* renamed from: a */
    public final C1170l f3992a;

    /* renamed from: b */
    public final C1273m f3993b;

    /* renamed from: c */
    public final List f3994c;

    public AbstractC1266f(C1170l c1170l, C1273m c1273m) {
        this(c1170l, c1273m, new ArrayList());
    }

    /* renamed from: c */
    public static AbstractC1266f m4832c(C1177s c1177s, C1264d c1264d) {
        if (!c1177s.mo4484e()) {
            return null;
        }
        if (c1264d != null && c1264d.m4829c().isEmpty()) {
            return null;
        }
        if (c1264d == null) {
            return c1177s.mo4488i() ? new C1263c(c1177s.getKey(), C1273m.f4009c) : new C1275o(c1177s.getKey(), c1177s.mo4480a(), C1273m.f4009c);
        }
        C1178t mo4480a = c1177s.mo4480a();
        C1178t c1178t = new C1178t();
        HashSet hashSet = new HashSet();
        for (C1176r c1176r : c1264d.m4829c()) {
            if (!hashSet.contains(c1176r)) {
                if (mo4480a.m4558i(c1176r) == null && c1176r.m4471q() > 1) {
                    c1176r = (C1176r) c1176r.m4473s();
                }
                c1178t.m4561l(c1176r, mo4480a.m4558i(c1176r));
                hashSet.add(c1176r);
            }
        }
        return new C1272l(c1177s.getKey(), c1178t, C1264d.m4827b(hashSet), C1273m.f4009c);
    }

    /* renamed from: a */
    public abstract C1264d mo4824a(C1177s c1177s, C1264d c1264d, C4188r c4188r);

    /* renamed from: b */
    public abstract void mo4825b(C1177s c1177s, C1269i c1269i);

    /* renamed from: d */
    public C1178t m4833d(InterfaceC1167i interfaceC1167i) {
        C1178t c1178t = null;
        for (C1265e c1265e : this.f3994c) {
            C5413D mo4817a = c1265e.m4831b().mo4817a(interfaceC1167i.mo4485f(c1265e.m4830a()));
            if (mo4817a != null) {
                if (c1178t == null) {
                    c1178t = new C1178t();
                }
                c1178t.m4561l(c1265e.m4830a(), mo4817a);
            }
        }
        return c1178t;
    }

    /* renamed from: e */
    public abstract C1264d mo4826e();

    /* renamed from: f */
    public List m4834f() {
        return this.f3994c;
    }

    /* renamed from: g */
    public C1170l m4835g() {
        return this.f3992a;
    }

    /* renamed from: h */
    public C1273m m4836h() {
        return this.f3993b;
    }

    /* renamed from: i */
    public boolean m4837i(AbstractC1266f abstractC1266f) {
        return this.f3992a.equals(abstractC1266f.f3992a) && this.f3993b.equals(abstractC1266f.f3993b);
    }

    /* renamed from: j */
    public int m4838j() {
        return (m4835g().hashCode() * 31) + this.f3993b.hashCode();
    }

    /* renamed from: k */
    public String m4839k() {
        return "key=" + this.f3992a + ", precondition=" + this.f3993b;
    }

    /* renamed from: l */
    public Map m4840l(C4188r c4188r, C1177s c1177s) {
        HashMap hashMap = new HashMap(this.f3994c.size());
        for (C1265e c1265e : this.f3994c) {
            hashMap.put(c1265e.m4830a(), c1265e.m4831b().mo4819c(c1177s.mo4485f(c1265e.m4830a()), c4188r));
        }
        return hashMap;
    }

    /* renamed from: m */
    public Map m4841m(C1177s c1177s, List list) {
        HashMap hashMap = new HashMap(this.f3994c.size());
        AbstractC2133b.m7217d(this.f3994c.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.f3994c.size()));
        for (int i7 = 0; i7 < list.size(); i7++) {
            C1265e c1265e = (C1265e) this.f3994c.get(i7);
            hashMap.put(c1265e.m4830a(), c1265e.m4831b().mo4818b(c1177s.mo4485f(c1265e.m4830a()), (C5413D) list.get(i7)));
        }
        return hashMap;
    }

    /* renamed from: n */
    public void m4842n(C1177s c1177s) {
        AbstractC2133b.m7217d(c1177s.getKey().equals(m4835g()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    public AbstractC1266f(C1170l c1170l, C1273m c1273m, List list) {
        this.f3992a = c1170l;
        this.f3993b = c1273m;
        this.f3994c = list;
    }
}
