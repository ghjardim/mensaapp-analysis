package p109P3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p067J3.C0747h0;
import p067J3.C0756m;
import p081L3.C1038O1;
import p081L3.EnumC1094l0;
import p088M3.C1164f;
import p088M3.C1170l;
import p088M3.C1177s;
import p088M3.C1181w;
import p109P3.AbstractC1918a0;
import p109P3.C1916Z;
import p109P3.C1934n;
import p116Q3.AbstractC2133b;
import p116Q3.AbstractC2155x;
import p256j$.util.DesugarCollections;
import p272k4.C5424g;
import p376x3.C6950e;

/* renamed from: P3.b0 */
/* loaded from: classes.dex */
public class C1920b0 {

    /* renamed from: a */
    public final c f5755a;

    /* renamed from: b */
    public final Map f5756b = new HashMap();

    /* renamed from: c */
    public Map f5757c = new HashMap();

    /* renamed from: d */
    public Map f5758d = new HashMap();

    /* renamed from: e */
    public Map f5759e = new HashMap();

    /* renamed from: f */
    public final C1164f f5760f;

    /* renamed from: P3.b0$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5761a;

        static {
            int[] iArr = new int[AbstractC1918a0.e.values().length];
            f5761a = iArr;
            try {
                iArr[AbstractC1918a0.e.NoChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5761a[AbstractC1918a0.e.Added.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5761a[AbstractC1918a0.e.Removed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5761a[AbstractC1918a0.e.Current.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5761a[AbstractC1918a0.e.Reset.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: P3.b0$b */
    public enum b {
        SUCCESS,
        SKIPPED,
        FALSE_POSITIVE
    }

    /* renamed from: P3.b0$c */
    public interface c {
        /* renamed from: a */
        C1038O1 mo6732a(int i7);

        /* renamed from: b */
        C6950e mo6733b(int i7);
    }

    public C1920b0(C1164f c1164f, c cVar) {
        this.f5760f = c1164f;
        this.f5755a = cVar;
    }

    /* renamed from: a */
    public final void m6799a(int i7, C1177s c1177s) {
        if (m6810l(i7)) {
            m6803e(i7).m6761a(c1177s.getKey(), m6817s(i7, c1177s.getKey()) ? C0756m.a.MODIFIED : C0756m.a.ADDED);
            this.f5757c.put(c1177s.getKey(), c1177s);
            m6802d(c1177s.getKey()).add(Integer.valueOf(i7));
        }
    }

    /* renamed from: b */
    public final b m6800b(C1934n c1934n, AbstractC1918a0.c cVar, int i7) {
        return cVar.m6792a().m6905a() == i7 - m6804f(c1934n, cVar.m6793b()) ? b.SUCCESS : b.FALSE_POSITIVE;
    }

    /* renamed from: c */
    public C1906O m6801c(C1181w c1181w) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f5756b.entrySet()) {
            Integer num = (Integer) entry.getKey();
            int intValue = num.intValue();
            C1915Y c1915y = (C1915Y) entry.getValue();
            C1038O1 m6812n = m6812n(intValue);
            if (m6812n != null) {
                if (c1915y.m6764d() && m6812n.m4118g().m3197s()) {
                    C1170l m4498j = C1170l.m4498j(m6812n.m4118g().m3192n());
                    if (this.f5757c.get(m4498j) == null && !m6817s(intValue, m4498j)) {
                        m6814p(intValue, m4498j, C1177s.m4540r(m4498j, c1181w));
                    }
                }
                if (c1915y.m6763c()) {
                    hashMap.put(num, c1915y.m6770j());
                    c1915y.m6762b();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry2 : this.f5758d.entrySet()) {
            C1170l c1170l = (C1170l) entry2.getKey();
            Iterator it = ((Set) entry2.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.add(c1170l);
                    break;
                }
                C1038O1 m6812n2 = m6812n(((Integer) it.next()).intValue());
                if (m6812n2 == null || m6812n2.m4114c().equals(EnumC1094l0.LIMBO_RESOLUTION)) {
                }
            }
        }
        Iterator it2 = this.f5757c.values().iterator();
        while (it2.hasNext()) {
            ((C1177s) it2.next()).m4548v(c1181w);
        }
        C1906O c1906o = new C1906O(c1181w, DesugarCollections.unmodifiableMap(hashMap), DesugarCollections.unmodifiableMap(this.f5759e), DesugarCollections.unmodifiableMap(this.f5757c), DesugarCollections.unmodifiableSet(hashSet));
        this.f5757c = new HashMap();
        this.f5758d = new HashMap();
        this.f5759e = new HashMap();
        return c1906o;
    }

    /* renamed from: d */
    public final Set m6802d(C1170l c1170l) {
        Set set = (Set) this.f5758d.get(c1170l);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.f5758d.put(c1170l, hashSet);
        return hashSet;
    }

    /* renamed from: e */
    public final C1915Y m6803e(int i7) {
        C1915Y c1915y = (C1915Y) this.f5756b.get(Integer.valueOf(i7));
        if (c1915y != null) {
            return c1915y;
        }
        C1915Y c1915y2 = new C1915Y();
        this.f5756b.put(Integer.valueOf(i7), c1915y2);
        return c1915y2;
    }

    /* renamed from: f */
    public final int m6804f(C1934n c1934n, int i7) {
        C6950e mo6733b = this.f5755a.mo6733b(i7);
        String str = "projects/" + this.f5760f.m4478i() + "/databases/" + this.f5760f.m4477h() + "/documents/";
        Iterator it = mo6733b.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            C1170l c1170l = (C1170l) it.next();
            if (!c1934n.m6885h(str + c1170l.m4505o().mo4464g())) {
                m6814p(i7, c1170l, null);
                i8++;
            }
        }
        return i8;
    }

    /* renamed from: g */
    public final int m6805g(int i7) {
        C1914X m6770j = m6803e(i7).m6770j();
        return (this.f5755a.mo6733b(i7).size() + m6770j.m6756b().size()) - m6770j.m6758d().size();
    }

    /* renamed from: h */
    public final Collection m6806h(AbstractC1918a0.d dVar) {
        List m6797d = dVar.m6797d();
        if (!m6797d.isEmpty()) {
            return m6797d;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f5756b.keySet()) {
            if (m6810l(num.intValue())) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public void m6807i(AbstractC1918a0.b bVar) {
        C1177s m6789b = bVar.m6789b();
        C1170l m6788a = bVar.m6788a();
        Iterator it = bVar.m6791d().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (m6789b == null || !m6789b.mo4482c()) {
                m6814p(intValue, m6788a, m6789b);
            } else {
                m6799a(intValue, m6789b);
            }
        }
        Iterator it2 = bVar.m6790c().iterator();
        while (it2.hasNext()) {
            m6814p(((Integer) it2.next()).intValue(), m6788a, bVar.m6789b());
        }
    }

    /* renamed from: j */
    public void m6808j(AbstractC1918a0.c cVar) {
        int m6793b = cVar.m6793b();
        int m6905a = cVar.m6792a().m6905a();
        C1038O1 m6812n = m6812n(m6793b);
        if (m6812n != null) {
            C0747h0 m4118g = m6812n.m4118g();
            if (m4118g.m3197s()) {
                if (m6905a != 0) {
                    AbstractC2133b.m7217d(m6905a == 1, "Single document existence filter with count: %d", Integer.valueOf(m6905a));
                    return;
                } else {
                    C1170l m4498j = C1170l.m4498j(m4118g.m3192n());
                    m6814p(m6793b, m4498j, C1177s.m4540r(m4498j, C1181w.f3793b));
                    return;
                }
            }
            int m6805g = m6805g(m6793b);
            if (m6805g != m6905a) {
                C1934n m6811m = m6811m(cVar);
                b m6800b = m6811m != null ? m6800b(m6811m, cVar, m6805g) : b.SKIPPED;
                if (m6800b != b.SUCCESS) {
                    m6816r(m6793b);
                    this.f5759e.put(Integer.valueOf(m6793b), m6800b == b.FALSE_POSITIVE ? EnumC1094l0.EXISTENCE_FILTER_MISMATCH_BLOOM : EnumC1094l0.EXISTENCE_FILTER_MISMATCH);
                }
                C1916Z.m6772a().m6773b(C1916Z.b.m6782e(m6805g, cVar.m6792a(), this.f5760f, m6811m, m6800b));
            }
        }
    }

    /* renamed from: k */
    public void m6809k(AbstractC1918a0.d dVar) {
        Iterator it = m6806h(dVar).iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            C1915Y m6803e = m6803e(intValue);
            int i7 = a.f5761a[dVar.m6795b().ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    m6803e.m6768h();
                    if (!m6803e.m6765e()) {
                        m6803e.m6762b();
                    }
                    m6803e.m6771k(dVar.m6796c());
                } else if (i7 == 3) {
                    m6803e.m6768h();
                    if (!m6803e.m6765e()) {
                        m6815q(intValue);
                    }
                    AbstractC2133b.m7217d(dVar.m6794a() == null, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (i7 != 4) {
                    if (i7 != 5) {
                        throw AbstractC2133b.m7214a("Unknown target watch change state: %s", dVar.m6795b());
                    }
                    if (m6810l(intValue)) {
                        m6816r(intValue);
                        m6803e.m6771k(dVar.m6796c());
                    }
                } else if (m6810l(intValue)) {
                    m6803e.m6766f();
                    m6803e.m6771k(dVar.m6796c());
                }
            } else if (m6810l(intValue)) {
                m6803e.m6771k(dVar.m6796c());
            }
        }
    }

    /* renamed from: l */
    public final boolean m6810l(int i7) {
        return m6812n(i7) != null;
    }

    /* renamed from: m */
    public final C1934n m6811m(AbstractC1918a0.c cVar) {
        C5424g m6906b = cVar.m6792a().m6906b();
        if (m6906b != null && m6906b.m22590d0()) {
            try {
                C1934n m6877a = C1934n.m6877a(m6906b.m22588a0().m22584a0(), m6906b.m22588a0().m22585c0(), m6906b.m22589c0());
                if (m6877a.m6881c() == 0) {
                    return null;
                }
                return m6877a;
            } catch (C1934n.a e7) {
                AbstractC2155x.m7313e("WatchChangeAggregator", "Applying bloom filter failed: (" + e7.getMessage() + "); ignoring the bloom filter and falling back to full re-query.", new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: n */
    public final C1038O1 m6812n(int i7) {
        C1915Y c1915y = (C1915Y) this.f5756b.get(Integer.valueOf(i7));
        if (c1915y == null || !c1915y.m6765e()) {
            return this.f5755a.mo6732a(i7);
        }
        return null;
    }

    /* renamed from: o */
    public void m6813o(int i7) {
        m6803e(i7).m6767g();
    }

    /* renamed from: p */
    public final void m6814p(int i7, C1170l c1170l, C1177s c1177s) {
        if (m6810l(i7)) {
            C1915Y m6803e = m6803e(i7);
            if (m6817s(i7, c1170l)) {
                m6803e.m6761a(c1170l, C0756m.a.REMOVED);
            } else {
                m6803e.m6769i(c1170l);
            }
            m6802d(c1170l).add(Integer.valueOf(i7));
            if (c1177s != null) {
                this.f5757c.put(c1170l, c1177s);
            }
        }
    }

    /* renamed from: q */
    public void m6815q(int i7) {
        this.f5756b.remove(Integer.valueOf(i7));
    }

    /* renamed from: r */
    public final void m6816r(int i7) {
        AbstractC2133b.m7217d((this.f5756b.get(Integer.valueOf(i7)) == null || ((C1915Y) this.f5756b.get(Integer.valueOf(i7))).m6765e()) ? false : true, "Should only reset active targets", new Object[0]);
        this.f5756b.put(Integer.valueOf(i7), new C1915Y());
        Iterator it = this.f5755a.mo6733b(i7).iterator();
        while (it.hasNext()) {
            m6814p(i7, (C1170l) it.next(), null);
        }
    }

    /* renamed from: s */
    public final boolean m6817s(int i7, C1170l c1170l) {
        return this.f5755a.mo6733b(i7).contains(c1170l);
    }
}
