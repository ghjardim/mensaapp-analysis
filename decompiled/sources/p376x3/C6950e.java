package p376x3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p376x3.AbstractC6948c;

/* renamed from: x3.e */
/* loaded from: classes.dex */
public class C6950e implements Iterable {

    /* renamed from: a */
    public final AbstractC6948c f24862a;

    /* renamed from: x3.e$a */
    public static class a implements Iterator {

        /* renamed from: a */
        public final Iterator f24863a;

        public a(Iterator it) {
            this.f24863a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24863a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return ((Map.Entry) this.f24863a.next()).getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f24863a.remove();
        }
    }

    public C6950e(List list, Comparator comparator) {
        this.f24862a = AbstractC6948c.a.m28464b(list, Collections.emptyMap(), AbstractC6948c.a.m28466d(), comparator);
    }

    /* renamed from: a */
    public Object m28469a() {
        return this.f24862a.mo28453f();
    }

    /* renamed from: b */
    public Object m28470b() {
        return this.f24862a.mo28454g();
    }

    public boolean contains(Object obj) {
        return this.f24862a.mo28450a(obj);
    }

    /* renamed from: e */
    public C6950e m28471e(Object obj) {
        return new C6950e(this.f24862a.mo28455h(obj, null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6950e) {
            return this.f24862a.equals(((C6950e) obj).f24862a);
        }
        return false;
    }

    /* renamed from: f */
    public Iterator m28472f(Object obj) {
        return new a(this.f24862a.mo28456i(obj));
    }

    /* renamed from: g */
    public C6950e m28473g(Object obj) {
        AbstractC6948c mo28457k = this.f24862a.mo28457k(obj);
        return mo28457k == this.f24862a ? this : new C6950e(mo28457k);
    }

    /* renamed from: h */
    public C6950e m28474h(C6950e c6950e) {
        C6950e c6950e2;
        if (size() < c6950e.size()) {
            c6950e2 = c6950e;
            c6950e = this;
        } else {
            c6950e2 = this;
        }
        Iterator it = c6950e.iterator();
        while (it.hasNext()) {
            c6950e2 = c6950e2.m28471e(it.next());
        }
        return c6950e2;
    }

    public int hashCode() {
        return this.f24862a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f24862a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f24862a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this.f24862a.iterator());
    }

    public int size() {
        return this.f24862a.size();
    }

    public C6950e(AbstractC6948c abstractC6948c) {
        this.f24862a = abstractC6948c;
    }
}
