package p088M3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p088M3.AbstractC1175q;
import p219e3.C4188r;

/* renamed from: M3.q */
/* loaded from: classes.dex */
public abstract class AbstractC1175q {

    /* renamed from: a */
    public static b f3765a = b.m4527a(0, a.f3767a);

    /* renamed from: b */
    public static final Comparator f3766b = new Comparator() { // from class: M3.o
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m4518i;
            m4518i = AbstractC1175q.m4518i((AbstractC1175q) obj, (AbstractC1175q) obj2);
            return m4518i;
        }
    };

    /* renamed from: M3.q$a */
    public static abstract class a implements Comparable {

        /* renamed from: a */
        public static final a f3767a = m4522g(C1181w.f3793b, C1170l.m4495g(), -1);

        /* renamed from: b */
        public static final Comparator f3768b = new Comparator() { // from class: M3.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m4525m;
                m4525m = AbstractC1175q.a.m4525m((C1177s) obj, (C1177s) obj2);
                return m4525m;
            }
        };

        /* renamed from: g */
        public static a m4522g(C1181w c1181w, C1170l c1170l, int i7) {
            return new C1160b(c1181w, c1170l, i7);
        }

        /* renamed from: h */
        public static a m4523h(C1181w c1181w, int i7) {
            long m17567h = c1181w.m4572f().m17567h();
            int m17566f = c1181w.m4572f().m17566f() + 1;
            return m4522g(new C1181w(((double) m17566f) == 1.0E9d ? new C4188r(m17567h + 1, 0) : new C4188r(m17567h, m17566f)), C1170l.m4495g(), i7);
        }

        /* renamed from: i */
        public static a m4524i(InterfaceC1167i interfaceC1167i) {
            return m4522g(interfaceC1167i.mo4487h(), interfaceC1167i.getKey(), -1);
        }

        /* renamed from: m */
        public static /* synthetic */ int m4525m(C1177s c1177s, C1177s c1177s2) {
            return m4524i(c1177s).compareTo(m4524i(c1177s2));
        }

        @Override // java.lang.Comparable
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int compareTo = mo4454l().compareTo(aVar.mo4454l());
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = mo4452j().compareTo(aVar.mo4452j());
            return compareTo2 != 0 ? compareTo2 : Integer.compare(mo4453k(), aVar.mo4453k());
        }

        /* renamed from: j */
        public abstract C1170l mo4452j();

        /* renamed from: k */
        public abstract int mo4453k();

        /* renamed from: l */
        public abstract C1181w mo4454l();
    }

    /* renamed from: M3.q$b */
    public static abstract class b {
        /* renamed from: a */
        public static b m4527a(long j7, a aVar) {
            return new C1161c(j7, aVar);
        }

        /* renamed from: b */
        public static b m4528b(long j7, C1181w c1181w, C1170l c1170l, int i7) {
            return m4527a(j7, a.m4522g(c1181w, c1170l, i7));
        }

        /* renamed from: c */
        public abstract a mo4455c();

        /* renamed from: d */
        public abstract long mo4456d();
    }

    /* renamed from: M3.q$c */
    public static abstract class c implements Comparable {

        /* renamed from: M3.q$c$a */
        public enum a {
            ASCENDING,
            DESCENDING,
            CONTAINS
        }

        /* renamed from: f */
        public static c m4529f(C1176r c1176r, a aVar) {
            return new C1162d(c1176r, aVar);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int compareTo = mo4457g().compareTo(cVar.mo4457g());
            return compareTo != 0 ? compareTo : mo4458h().compareTo(cVar.mo4458h());
        }

        /* renamed from: g */
        public abstract C1176r mo4457g();

        /* renamed from: h */
        public abstract a mo4458h();
    }

    /* renamed from: b */
    public static AbstractC1175q m4517b(int i7, String str, List list, b bVar) {
        return new C1159a(i7, str, list, bVar);
    }

    /* renamed from: i */
    public static /* synthetic */ int m4518i(AbstractC1175q abstractC1175q, AbstractC1175q abstractC1175q2) {
        int compareTo = abstractC1175q.mo4448d().compareTo(abstractC1175q2.mo4448d());
        if (compareTo != 0) {
            return compareTo;
        }
        Iterator it = abstractC1175q.mo4451h().iterator();
        Iterator it2 = abstractC1175q2.mo4451h().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo2 = ((c) it.next()).compareTo((c) it2.next());
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return Boolean.compare(it.hasNext(), it2.hasNext());
    }

    /* renamed from: c */
    public c m4519c() {
        for (c cVar : mo4451h()) {
            if (cVar.mo4458h().equals(c.a.CONTAINS)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public abstract String mo4448d();

    /* renamed from: e */
    public List m4520e() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : mo4451h()) {
            if (!cVar.mo4458h().equals(c.a.CONTAINS)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public abstract int mo4449f();

    /* renamed from: g */
    public abstract b mo4450g();

    /* renamed from: h */
    public abstract List mo4451h();
}
