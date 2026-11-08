package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p207d.AbstractC4094d;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public class C3457c extends AbstractC3465k {

    /* renamed from: h */
    public ArrayList f11535h = new ArrayList();

    /* renamed from: i */
    public ArrayList f11536i = new ArrayList();

    /* renamed from: j */
    public ArrayList f11537j = new ArrayList();

    /* renamed from: k */
    public ArrayList f11538k = new ArrayList();

    /* renamed from: l */
    public ArrayList f11539l = new ArrayList();

    /* renamed from: m */
    public ArrayList f11540m = new ArrayList();

    /* renamed from: n */
    public ArrayList f11541n = new ArrayList();

    /* renamed from: o */
    public ArrayList f11542o = new ArrayList();

    /* renamed from: p */
    public ArrayList f11543p = new ArrayList();

    /* renamed from: q */
    public ArrayList f11544q = new ArrayList();

    /* renamed from: r */
    public ArrayList f11545r = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.c$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f11546a;

        public a(ArrayList arrayList) {
            this.f11546a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f11546a.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                C3457c c3457c = C3457c.this;
                eVar.getClass();
                c3457c.m13874o(null, eVar.f11552a, eVar.f11553b, eVar.f11554c, eVar.f11555d);
            }
            this.f11546a.clear();
            C3457c.this.f11540m.remove(this.f11546a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f11548a;

        public b(ArrayList arrayList) {
            this.f11548a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f11548a.iterator();
            while (it.hasNext()) {
                C3457c.this.m13873n((d) it.next());
            }
            this.f11548a.clear();
            C3457c.this.f11541n.remove(this.f11548a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f11550a;

        public c(ArrayList arrayList) {
            this.f11550a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f11550a.iterator();
            while (it.hasNext()) {
                AbstractC4094d.m17162a(it.next());
                C3457c.this.m13872m(null);
            }
            this.f11550a.clear();
            C3457c.this.f11539l.remove(this.f11550a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$d */
    public static class d {
    }

    /* renamed from: androidx.recyclerview.widget.c$e */
    public static class e {

        /* renamed from: a */
        public int f11552a;

        /* renamed from: b */
        public int f11553b;

        /* renamed from: c */
        public int f11554c;

        /* renamed from: d */
        public int f11555d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3433k
    /* renamed from: c */
    public void mo13667c() {
        int size = this.f11537j.size() - 1;
        if (size >= 0) {
            ((e) this.f11537j.get(size)).getClass();
            throw null;
        }
        for (int size2 = this.f11535h.size() - 1; size2 >= 0; size2--) {
            AbstractC4094d.m17162a(this.f11535h.get(size2));
            m13929k(null);
            this.f11535h.remove(size2);
        }
        int size3 = this.f11536i.size() - 1;
        if (size3 >= 0) {
            AbstractC4094d.m17162a(this.f11536i.get(size3));
            throw null;
        }
        for (int size4 = this.f11538k.size() - 1; size4 >= 0; size4--) {
            m13877r((d) this.f11538k.get(size4));
        }
        this.f11538k.clear();
        if (mo13671g()) {
            for (int size5 = this.f11540m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f11540m.get(size5);
                int size6 = arrayList.size() - 1;
                if (size6 >= 0) {
                    ((e) arrayList.get(size6)).getClass();
                    throw null;
                }
            }
            for (int size7 = this.f11539l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f11539l.get(size7);
                int size8 = arrayList2.size() - 1;
                if (size8 >= 0) {
                    AbstractC4094d.m17162a(arrayList2.get(size8));
                    throw null;
                }
            }
            for (int size9 = this.f11541n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f11541n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m13877r((d) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f11541n.remove(arrayList3);
                    }
                }
            }
            m13876q(this.f11544q);
            m13876q(this.f11543p);
            m13876q(this.f11542o);
            m13876q(this.f11545r);
            m13666b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3433k
    /* renamed from: g */
    public boolean mo13671g() {
        return (this.f11536i.isEmpty() && this.f11538k.isEmpty() && this.f11537j.isEmpty() && this.f11535h.isEmpty() && this.f11543p.isEmpty() && this.f11544q.isEmpty() && this.f11542o.isEmpty() && this.f11545r.isEmpty() && this.f11540m.isEmpty() && this.f11539l.isEmpty() && this.f11541n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3433k
    /* renamed from: i */
    public void mo13673i() {
        boolean isEmpty = this.f11535h.isEmpty();
        boolean isEmpty2 = this.f11537j.isEmpty();
        boolean isEmpty3 = this.f11538k.isEmpty();
        boolean isEmpty4 = this.f11536i.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator it = this.f11535h.iterator();
        while (it.hasNext()) {
            AbstractC4094d.m17162a(it.next());
            m13875p(null);
        }
        this.f11535h.clear();
        if (!isEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f11537j);
            this.f11540m.add(arrayList);
            this.f11537j.clear();
            a aVar = new a(arrayList);
            if (!isEmpty) {
                ((e) arrayList.get(0)).getClass();
                throw null;
            }
            aVar.run();
        }
        if (!isEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f11538k);
            this.f11541n.add(arrayList2);
            this.f11538k.clear();
            b bVar = new b(arrayList2);
            if (!isEmpty) {
                ((d) arrayList2.get(0)).getClass();
                throw null;
            }
            bVar.run();
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f11536i);
        this.f11539l.add(arrayList3);
        this.f11536i.clear();
        c cVar = new c(arrayList3);
        if (isEmpty && isEmpty2 && isEmpty3) {
            cVar.run();
            return;
        }
        if (!isEmpty) {
            m13670f();
        }
        Math.max(!isEmpty2 ? m13669e() : 0L, isEmpty3 ? 0L : m13668d());
        AbstractC4094d.m17162a(arrayList3.get(0));
        throw null;
    }

    /* renamed from: m */
    public void m13872m(RecyclerView.AbstractC3422A abstractC3422A) {
        throw null;
    }

    /* renamed from: n */
    public void m13873n(d dVar) {
        dVar.getClass();
    }

    /* renamed from: o */
    public void m13874o(RecyclerView.AbstractC3422A abstractC3422A, int i7, int i8, int i9, int i10) {
        throw null;
    }

    /* renamed from: p */
    public final void m13875p(RecyclerView.AbstractC3422A abstractC3422A) {
        throw null;
    }

    /* renamed from: q */
    public void m13876q(List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        AbstractC4094d.m17162a(list.get(size));
        throw null;
    }

    /* renamed from: r */
    public final void m13877r(d dVar) {
        dVar.getClass();
    }
}
