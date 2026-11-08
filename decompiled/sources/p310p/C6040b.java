package p310p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: p.b */
/* loaded from: classes.dex */
public class C6040b implements Iterable {

    /* renamed from: a */
    public c f21473a;

    /* renamed from: b */
    public c f21474b;

    /* renamed from: c */
    public final WeakHashMap f21475c = new WeakHashMap();

    /* renamed from: d */
    public int f21476d = 0;

    /* renamed from: p.b$a */
    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p310p.C6040b.e
        /* renamed from: c */
        public c mo25099c(c cVar) {
            return cVar.f21480d;
        }

        @Override // p310p.C6040b.e
        /* renamed from: d */
        public c mo25100d(c cVar) {
            return cVar.f21479c;
        }
    }

    /* renamed from: p.b$b */
    public static class b extends e {
        public b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p310p.C6040b.e
        /* renamed from: c */
        public c mo25099c(c cVar) {
            return cVar.f21479c;
        }

        @Override // p310p.C6040b.e
        /* renamed from: d */
        public c mo25100d(c cVar) {
            return cVar.f21480d;
        }
    }

    /* renamed from: p.b$c */
    public static class c implements Map.Entry {

        /* renamed from: a */
        public final Object f21477a;

        /* renamed from: b */
        public final Object f21478b;

        /* renamed from: c */
        public c f21479c;

        /* renamed from: d */
        public c f21480d;

        public c(Object obj, Object obj2) {
            this.f21477a = obj;
            this.f21478b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f21477a.equals(cVar.f21477a) && this.f21478b.equals(cVar.f21478b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f21477a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f21478b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f21477a.hashCode() ^ this.f21478b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f21477a + "=" + this.f21478b;
        }
    }

    /* renamed from: p.b$d */
    public class d extends f implements Iterator {

        /* renamed from: a */
        public c f21481a;

        /* renamed from: b */
        public boolean f21482b = true;

        public d() {
        }

        @Override // p310p.C6040b.f
        /* renamed from: a */
        public void mo25101a(c cVar) {
            c cVar2 = this.f21481a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f21480d;
                this.f21481a = cVar3;
                this.f21482b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f21482b) {
                this.f21482b = false;
                this.f21481a = C6040b.this.f21473a;
            } else {
                c cVar = this.f21481a;
                this.f21481a = cVar != null ? cVar.f21479c : null;
            }
            return this.f21481a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f21482b) {
                return C6040b.this.f21473a != null;
            }
            c cVar = this.f21481a;
            return (cVar == null || cVar.f21479c == null) ? false : true;
        }
    }

    /* renamed from: p.b$e */
    public static abstract class e extends f implements Iterator {

        /* renamed from: a */
        public c f21484a;

        /* renamed from: b */
        public c f21485b;

        public e(c cVar, c cVar2) {
            this.f21484a = cVar2;
            this.f21485b = cVar;
        }

        @Override // p310p.C6040b.f
        /* renamed from: a */
        public void mo25101a(c cVar) {
            if (this.f21484a == cVar && cVar == this.f21485b) {
                this.f21485b = null;
                this.f21484a = null;
            }
            c cVar2 = this.f21484a;
            if (cVar2 == cVar) {
                this.f21484a = mo25099c(cVar2);
            }
            if (this.f21485b == cVar) {
                this.f21485b = m25104f();
            }
        }

        /* renamed from: c */
        public abstract c mo25099c(c cVar);

        /* renamed from: d */
        public abstract c mo25100d(c cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f21485b;
            this.f21485b = m25104f();
            return cVar;
        }

        /* renamed from: f */
        public final c m25104f() {
            c cVar = this.f21485b;
            c cVar2 = this.f21484a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo25100d(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21485b != null;
        }
    }

    /* renamed from: p.b$f */
    public static abstract class f {
        /* renamed from: a */
        public abstract void mo25101a(c cVar);
    }

    /* renamed from: a */
    public Map.Entry m25095a() {
        return this.f21473a;
    }

    /* renamed from: b */
    public c mo25091b(Object obj) {
        c cVar = this.f21473a;
        while (cVar != null && !cVar.f21477a.equals(obj)) {
            cVar = cVar.f21479c;
        }
        return cVar;
    }

    public Iterator descendingIterator() {
        b bVar = new b(this.f21474b, this.f21473a);
        this.f21475c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: e */
    public d m25096e() {
        d dVar = new d();
        this.f21475c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6040b)) {
            return false;
        }
        C6040b c6040b = (C6040b) obj;
        if (size() != c6040b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c6040b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* renamed from: f */
    public Map.Entry m25097f() {
        return this.f21474b;
    }

    /* renamed from: g */
    public c m25098g(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f21476d++;
        c cVar2 = this.f21474b;
        if (cVar2 == null) {
            this.f21473a = cVar;
            this.f21474b = cVar;
            return cVar;
        }
        cVar2.f21479c = cVar;
        cVar.f21480d = cVar2;
        this.f21474b = cVar;
        return cVar;
    }

    /* renamed from: h */
    public Object mo25092h(Object obj, Object obj2) {
        c mo25091b = mo25091b(obj);
        if (mo25091b != null) {
            return mo25091b.f21478b;
        }
        m25098g(obj, obj2);
        return null;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((Map.Entry) it.next()).hashCode();
        }
        return i7;
    }

    /* renamed from: i */
    public Object mo25093i(Object obj) {
        c mo25091b = mo25091b(obj);
        if (mo25091b == null) {
            return null;
        }
        this.f21476d--;
        if (!this.f21475c.isEmpty()) {
            Iterator it = this.f21475c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo25101a(mo25091b);
            }
        }
        c cVar = mo25091b.f21480d;
        if (cVar != null) {
            cVar.f21479c = mo25091b.f21479c;
        } else {
            this.f21473a = mo25091b.f21479c;
        }
        c cVar2 = mo25091b.f21479c;
        if (cVar2 != null) {
            cVar2.f21480d = cVar;
        } else {
            this.f21474b = cVar;
        }
        mo25091b.f21479c = null;
        mo25091b.f21480d = null;
        return mo25091b.f21478b;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f21473a, this.f21474b);
        this.f21475c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f21476d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
