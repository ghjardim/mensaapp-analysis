package p178Z2;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import p171Y2.AbstractC2932o;
import p171Y2.AbstractC2934q;
import p171Y2.InterfaceC2933p;
import p178Z2.AbstractC3021j;

/* renamed from: Z2.U */
/* loaded from: classes.dex */
public abstract class AbstractC3006U {

    /* renamed from: Z2.U$a */
    public class a extends f {

        /* renamed from: a */
        public final /* synthetic */ Set f9209a;

        /* renamed from: b */
        public final /* synthetic */ Set f9210b;

        /* renamed from: Z2.U$a$a, reason: collision with other inner class name */
        public class C7195a extends AbstractC3013b {

            /* renamed from: c */
            public final Iterator f9211c;

            /* renamed from: d */
            public final Iterator f9212d;

            public C7195a() {
                this.f9211c = a.this.f9209a.iterator();
                this.f9212d = a.this.f9210b.iterator();
            }

            @Override // p178Z2.AbstractC3013b
            /* renamed from: a */
            public Object mo10778a() {
                if (this.f9211c.hasNext()) {
                    return this.f9211c.next();
                }
                while (this.f9212d.hasNext()) {
                    Object next = this.f9212d.next();
                    if (!a.this.f9209a.contains(next)) {
                        return next;
                    }
                }
                return m10887c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f9209a = set;
            this.f9210b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC3010Y iterator() {
            return new C7195a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f9209a.contains(obj) || this.f9210b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f9209a.isEmpty() && this.f9210b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f9209a.size();
            Iterator it = this.f9210b.iterator();
            while (it.hasNext()) {
                if (!this.f9209a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* renamed from: Z2.U$b */
    public class b extends f {

        /* renamed from: a */
        public final /* synthetic */ Set f9214a;

        /* renamed from: b */
        public final /* synthetic */ Set f9215b;

        /* renamed from: Z2.U$b$a */
        public class a extends AbstractC3013b {

            /* renamed from: c */
            public final Iterator f9216c;

            public a() {
                this.f9216c = b.this.f9214a.iterator();
            }

            @Override // p178Z2.AbstractC3013b
            /* renamed from: a */
            public Object mo10778a() {
                while (this.f9216c.hasNext()) {
                    Object next = this.f9216c.next();
                    if (b.this.f9215b.contains(next)) {
                        return next;
                    }
                }
                return m10887c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set set, Set set2) {
            super(null);
            this.f9214a = set;
            this.f9215b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public AbstractC3010Y iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f9214a.contains(obj) && this.f9215b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.f9214a.containsAll(collection) && this.f9215b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f9215b, this.f9214a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f9214a.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                if (this.f9215b.contains(it.next())) {
                    i7++;
                }
            }
            return i7;
        }
    }

    /* renamed from: Z2.U$c */
    public static class c extends AbstractC3021j.a implements Set {
        public c(Set set, InterfaceC2933p interfaceC2933p) {
            super(set, interfaceC2933p);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return AbstractC3006U.m10874a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return AbstractC3006U.m10877d(this);
        }
    }

    /* renamed from: Z2.U$d */
    public static class d extends c implements SortedSet {
        public d(SortedSet sortedSet, InterfaceC2933p interfaceC2933p) {
            super(sortedSet, interfaceC2933p);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.f9270a).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return AbstractC2988B.m10768j(this.f9270a.iterator(), this.f9271b);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new d(((SortedSet) this.f9270a).headSet(obj), this.f9271b);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSet = (SortedSet) this.f9270a;
            while (true) {
                Object last = sortedSet.last();
                if (this.f9271b.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new d(((SortedSet) this.f9270a).subSet(obj, obj2), this.f9271b);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new d(((SortedSet) this.f9270a).tailSet(obj), this.f9271b);
        }
    }

    /* renamed from: Z2.U$e */
    public static abstract class e extends AbstractSet {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return AbstractC3006U.m10882i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) AbstractC2932o.m10572o(collection));
        }
    }

    /* renamed from: Z2.U$f */
    public static abstract class f extends AbstractSet {
        public /* synthetic */ f(a aVar) {
            this();
        }

        /* renamed from: a */
        public abstract AbstractC3010Y iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public f() {
        }
    }

    /* renamed from: a */
    public static boolean m10874a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Set m10875b(Set set, InterfaceC2933p interfaceC2933p) {
        if (set instanceof SortedSet) {
            return m10876c((SortedSet) set, interfaceC2933p);
        }
        if (!(set instanceof c)) {
            return new c((Set) AbstractC2932o.m10572o(set), (InterfaceC2933p) AbstractC2932o.m10572o(interfaceC2933p));
        }
        c cVar = (c) set;
        return new c((Set) cVar.f9270a, AbstractC2934q.m10583b(cVar.f9271b, interfaceC2933p));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static SortedSet m10876c(SortedSet sortedSet, InterfaceC2933p interfaceC2933p) {
        if (!(sortedSet instanceof c)) {
            return new d((SortedSet) AbstractC2932o.m10572o(sortedSet), (InterfaceC2933p) AbstractC2932o.m10572o(interfaceC2933p));
        }
        c cVar = (c) sortedSet;
        return new d((SortedSet) cVar.f9270a, AbstractC2934q.m10583b(cVar.f9271b, interfaceC2933p));
    }

    /* renamed from: d */
    public static int m10877d(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ~(~(i7 + (next != null ? next.hashCode() : 0)));
        }
        return i7;
    }

    /* renamed from: e */
    public static f m10878e(Set set, Set set2) {
        AbstractC2932o.m10573p(set, "set1");
        AbstractC2932o.m10573p(set2, "set2");
        return new b(set, set2);
    }

    /* renamed from: f */
    public static HashSet m10879f() {
        return new HashSet();
    }

    /* renamed from: g */
    public static HashSet m10880g(int i7) {
        return new HashSet(AbstractC2992F.m10793a(i7));
    }

    /* renamed from: h */
    public static Set m10881h() {
        return Collections.newSetFromMap(AbstractC2992F.m10799g());
    }

    /* renamed from: i */
    public static boolean m10882i(Set set, Collection collection) {
        AbstractC2932o.m10572o(collection);
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? m10883j(set, collection.iterator()) : AbstractC2988B.m10775q(set.iterator(), collection);
    }

    /* renamed from: j */
    public static boolean m10883j(Set set, Iterator it) {
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= set.remove(it.next());
        }
        return z6;
    }

    /* renamed from: k */
    public static f m10884k(Set set, Set set2) {
        AbstractC2932o.m10573p(set, "set1");
        AbstractC2932o.m10573p(set2, "set2");
        return new a(set, set2);
    }
}
