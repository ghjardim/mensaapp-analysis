package p088M3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import p067J3.AbstractC0764q;
import p067J3.C0735b0;
import p067J3.C0747h0;
import p067J3.C0762p;
import p088M3.AbstractC1175q;
import p116Q3.AbstractC2133b;

/* renamed from: M3.y */
/* loaded from: classes.dex */
public class C1183y {

    /* renamed from: a */
    public final String f3795a;

    /* renamed from: b */
    public final SortedSet f3796b;

    /* renamed from: c */
    public final List f3797c;

    /* renamed from: d */
    public final List f3798d;

    public C1183y(C0747h0 c0747h0) {
        this.f3795a = c0747h0.m3182d() != null ? c0747h0.m3182d() : c0747h0.m3192n().m4467l();
        this.f3798d = c0747h0.m3191m();
        this.f3796b = new TreeSet(new Comparator() { // from class: M3.x
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m4574e;
                m4574e = C1183y.m4574e((C0762p) obj, (C0762p) obj2);
                return m4574e;
            }
        });
        this.f3797c = new ArrayList();
        Iterator it = c0747h0.m3186h().iterator();
        while (it.hasNext()) {
            C0762p c0762p = (C0762p) ((AbstractC0764q) it.next());
            if (c0762p.m3273i()) {
                this.f3796b.add(c0762p);
            } else {
                this.f3797c.add(c0762p);
            }
        }
    }

    /* renamed from: e */
    public static /* synthetic */ int m4574e(C0762p c0762p, C0762p c0762p2) {
        return c0762p.m3270f().compareTo(c0762p2.m3270f());
    }

    /* renamed from: b */
    public AbstractC1175q m4575b() {
        if (m4577d()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (C0762p c0762p : this.f3797c) {
            if (!c0762p.m3270f().m4537x()) {
                if (c0762p.m3271g().equals(C0762p.b.ARRAY_CONTAINS) || c0762p.m3271g().equals(C0762p.b.ARRAY_CONTAINS_ANY)) {
                    arrayList.add(AbstractC1175q.c.m4529f(c0762p.m3270f(), AbstractC1175q.c.a.CONTAINS));
                } else if (!hashSet.contains(c0762p.m3270f())) {
                    hashSet.add(c0762p.m3270f());
                    arrayList.add(AbstractC1175q.c.m4529f(c0762p.m3270f(), AbstractC1175q.c.a.ASCENDING));
                }
            }
        }
        for (C0735b0 c0735b0 : this.f3798d) {
            if (!c0735b0.m3087c().m4537x() && !hashSet.contains(c0735b0.m3087c())) {
                hashSet.add(c0735b0.m3087c());
                arrayList.add(AbstractC1175q.c.m4529f(c0735b0.m3087c(), c0735b0.m3086b() == C0735b0.a.ASCENDING ? AbstractC1175q.c.a.ASCENDING : AbstractC1175q.c.a.DESCENDING));
            }
        }
        return AbstractC1175q.m4517b(-1, this.f3795a, arrayList, AbstractC1175q.f3765a);
    }

    /* renamed from: c */
    public final boolean m4576c(AbstractC1175q.c cVar) {
        Iterator it = this.f3797c.iterator();
        while (it.hasNext()) {
            if (m4578f((C0762p) it.next(), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m4577d() {
        return this.f3796b.size() > 1;
    }

    /* renamed from: f */
    public final boolean m4578f(C0762p c0762p, AbstractC1175q.c cVar) {
        if (c0762p == null || !c0762p.m3270f().equals(cVar.mo4457g())) {
            return false;
        }
        return cVar.mo4458h().equals(AbstractC1175q.c.a.CONTAINS) == (c0762p.m3271g().equals(C0762p.b.ARRAY_CONTAINS) || c0762p.m3271g().equals(C0762p.b.ARRAY_CONTAINS_ANY));
    }

    /* renamed from: g */
    public final boolean m4579g(C0735b0 c0735b0, AbstractC1175q.c cVar) {
        if (c0735b0.m3087c().equals(cVar.mo4457g())) {
            return (cVar.mo4458h().equals(AbstractC1175q.c.a.ASCENDING) && c0735b0.m3086b().equals(C0735b0.a.ASCENDING)) || (cVar.mo4458h().equals(AbstractC1175q.c.a.DESCENDING) && c0735b0.m3086b().equals(C0735b0.a.DESCENDING));
        }
        return false;
    }

    /* renamed from: h */
    public boolean m4580h(AbstractC1175q abstractC1175q) {
        AbstractC2133b.m7217d(abstractC1175q.mo4448d().equals(this.f3795a), "Collection IDs do not match", new Object[0]);
        if (m4577d()) {
            return false;
        }
        AbstractC1175q.c m4519c = abstractC1175q.m4519c();
        if (m4519c != null && !m4576c(m4519c)) {
            return false;
        }
        Iterator it = this.f3798d.iterator();
        List m4520e = abstractC1175q.m4520e();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (i7 < m4520e.size() && m4576c((AbstractC1175q.c) m4520e.get(i7))) {
            hashSet.add(((AbstractC1175q.c) m4520e.get(i7)).mo4457g().mo4464g());
            i7++;
        }
        if (i7 == m4520e.size()) {
            return true;
        }
        if (this.f3796b.size() > 0) {
            C0762p c0762p = (C0762p) this.f3796b.first();
            if (!hashSet.contains(c0762p.m3270f().mo4464g())) {
                AbstractC1175q.c cVar = (AbstractC1175q.c) m4520e.get(i7);
                if (!m4578f(c0762p, cVar) || !m4579g((C0735b0) it.next(), cVar)) {
                    return false;
                }
            }
            i7++;
        }
        while (i7 < m4520e.size()) {
            AbstractC1175q.c cVar2 = (AbstractC1175q.c) m4520e.get(i7);
            if (!it.hasNext() || !m4579g((C0735b0) it.next(), cVar2)) {
                return false;
            }
            i7++;
        }
        return true;
    }
}
