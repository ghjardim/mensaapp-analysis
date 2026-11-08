package p116Q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p067J3.AbstractC0764q;
import p067J3.C0724S;
import p067J3.C0752k;
import p067J3.C0762p;
import p272k4.C5413D;

/* renamed from: Q3.y */
/* loaded from: classes.dex */
public abstract class AbstractC2156y {
    /* renamed from: a */
    public static AbstractC0764q m7315a(AbstractC0764q abstractC0764q) {
        m7320f(abstractC0764q);
        if (m7327m(abstractC0764q)) {
            return abstractC0764q;
        }
        C0752k c0752k = (C0752k) abstractC0764q;
        List mo3221b = c0752k.mo3221b();
        if (mo3221b.size() == 1) {
            return m7315a((AbstractC0764q) mo3221b.get(0));
        }
        if (c0752k.m3226h()) {
            return c0752k;
        }
        ArrayList<AbstractC0764q> arrayList = new ArrayList();
        Iterator it = mo3221b.iterator();
        while (it.hasNext()) {
            arrayList.add(m7315a((AbstractC0764q) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC0764q abstractC0764q2 : arrayList) {
            if (abstractC0764q2 instanceof C0762p) {
                arrayList2.add(abstractC0764q2);
            } else if (abstractC0764q2 instanceof C0752k) {
                C0752k c0752k2 = (C0752k) abstractC0764q2;
                if (c0752k2.m3223e().equals(c0752k.m3223e())) {
                    arrayList2.addAll(c0752k2.mo3221b());
                } else {
                    arrayList2.add(c0752k2);
                }
            }
        }
        return arrayList2.size() == 1 ? (AbstractC0764q) arrayList2.get(0) : new C0752k(arrayList2, c0752k.m3223e());
    }

    /* renamed from: b */
    public static AbstractC0764q m7316b(C0752k c0752k, C0752k c0752k2) {
        AbstractC2133b.m7217d((c0752k.mo3221b().isEmpty() || c0752k2.mo3221b().isEmpty()) ? false : true, "Found an empty composite filter", new Object[0]);
        if (c0752k.m3224f() && c0752k2.m3224f()) {
            return c0752k.m3228j(c0752k2.mo3221b());
        }
        C0752k c0752k3 = c0752k.m3225g() ? c0752k : c0752k2;
        if (c0752k.m3225g()) {
            c0752k = c0752k2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c0752k3.mo3221b().iterator();
        while (it.hasNext()) {
            arrayList.add(m7319e((AbstractC0764q) it.next(), c0752k));
        }
        return new C0752k(arrayList, C0752k.a.OR);
    }

    /* renamed from: c */
    public static AbstractC0764q m7317c(C0762p c0762p, C0752k c0752k) {
        if (c0752k.m3224f()) {
            return c0752k.m3228j(Collections.singletonList(c0762p));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c0752k.mo3221b().iterator();
        while (it.hasNext()) {
            arrayList.add(m7319e(c0762p, (AbstractC0764q) it.next()));
        }
        return new C0752k(arrayList, C0752k.a.OR);
    }

    /* renamed from: d */
    public static AbstractC0764q m7318d(C0762p c0762p, C0762p c0762p2) {
        return new C0752k(Arrays.asList(c0762p, c0762p2), C0752k.a.AND);
    }

    /* renamed from: e */
    public static AbstractC0764q m7319e(AbstractC0764q abstractC0764q, AbstractC0764q abstractC0764q2) {
        m7320f(abstractC0764q);
        m7320f(abstractC0764q2);
        boolean z6 = abstractC0764q instanceof C0762p;
        return m7315a((z6 && (abstractC0764q2 instanceof C0762p)) ? m7318d((C0762p) abstractC0764q, (C0762p) abstractC0764q2) : (z6 && (abstractC0764q2 instanceof C0752k)) ? m7317c((C0762p) abstractC0764q, (C0752k) abstractC0764q2) : ((abstractC0764q instanceof C0752k) && (abstractC0764q2 instanceof C0762p)) ? m7317c((C0762p) abstractC0764q2, (C0752k) abstractC0764q) : m7316b((C0752k) abstractC0764q, (C0752k) abstractC0764q2));
    }

    /* renamed from: f */
    public static void m7320f(AbstractC0764q abstractC0764q) {
        AbstractC2133b.m7217d((abstractC0764q instanceof C0762p) || (abstractC0764q instanceof C0752k), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    /* renamed from: g */
    public static AbstractC0764q m7321g(AbstractC0764q abstractC0764q) {
        m7320f(abstractC0764q);
        if (abstractC0764q instanceof C0762p) {
            return abstractC0764q;
        }
        C0752k c0752k = (C0752k) abstractC0764q;
        if (c0752k.mo3221b().size() == 1) {
            return m7321g((AbstractC0764q) abstractC0764q.mo3221b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c0752k.mo3221b().iterator();
        while (it.hasNext()) {
            arrayList.add(m7321g((AbstractC0764q) it.next()));
        }
        AbstractC0764q m7315a = m7315a(new C0752k(arrayList, c0752k.m3223e()));
        if (m7325k(m7315a)) {
            return m7315a;
        }
        AbstractC2133b.m7217d(m7315a instanceof C0752k, "field filters are already in DNF form.", new Object[0]);
        C0752k c0752k2 = (C0752k) m7315a;
        AbstractC2133b.m7217d(c0752k2.m3224f(), "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        AbstractC2133b.m7217d(c0752k2.mo3221b().size() > 1, "Single-filter composite filters are already in DNF form.", new Object[0]);
        AbstractC0764q abstractC0764q2 = (AbstractC0764q) c0752k2.mo3221b().get(0);
        for (int i7 = 1; i7 < c0752k2.mo3221b().size(); i7++) {
            abstractC0764q2 = m7319e(abstractC0764q2, (AbstractC0764q) c0752k2.mo3221b().get(i7));
        }
        return abstractC0764q2;
    }

    /* renamed from: h */
    public static AbstractC0764q m7322h(AbstractC0764q abstractC0764q) {
        m7320f(abstractC0764q);
        ArrayList arrayList = new ArrayList();
        if (!(abstractC0764q instanceof C0762p)) {
            C0752k c0752k = (C0752k) abstractC0764q;
            Iterator it = c0752k.mo3221b().iterator();
            while (it.hasNext()) {
                arrayList.add(m7322h((AbstractC0764q) it.next()));
            }
            return new C0752k(arrayList, c0752k.m3223e());
        }
        if (!(abstractC0764q instanceof C0724S)) {
            return abstractC0764q;
        }
        C0724S c0724s = (C0724S) abstractC0764q;
        Iterator it2 = c0724s.m3272h().m22453l0().mo22555g().iterator();
        while (it2.hasNext()) {
            arrayList.add(C0762p.m3269e(c0724s.m3270f(), C0762p.b.EQUAL, (C5413D) it2.next()));
        }
        return new C0752k(arrayList, C0752k.a.OR);
    }

    /* renamed from: i */
    public static List m7323i(C0752k c0752k) {
        if (c0752k.mo3221b().isEmpty()) {
            return Collections.emptyList();
        }
        AbstractC0764q m7321g = m7321g(m7322h(c0752k));
        AbstractC2133b.m7217d(m7325k(m7321g), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
        return (m7327m(m7321g) || m7326l(m7321g)) ? Collections.singletonList(m7321g) : m7321g.mo3221b();
    }

    /* renamed from: j */
    public static boolean m7324j(AbstractC0764q abstractC0764q) {
        if (abstractC0764q instanceof C0752k) {
            C0752k c0752k = (C0752k) abstractC0764q;
            if (c0752k.m3225g()) {
                for (AbstractC0764q abstractC0764q2 : c0752k.mo3221b()) {
                    if (!m7327m(abstractC0764q2) && !m7326l(abstractC0764q2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m7325k(AbstractC0764q abstractC0764q) {
        return m7327m(abstractC0764q) || m7326l(abstractC0764q) || m7324j(abstractC0764q);
    }

    /* renamed from: l */
    public static boolean m7326l(AbstractC0764q abstractC0764q) {
        return (abstractC0764q instanceof C0752k) && ((C0752k) abstractC0764q).m3227i();
    }

    /* renamed from: m */
    public static boolean m7327m(AbstractC0764q abstractC0764q) {
        return abstractC0764q instanceof C0762p;
    }
}
