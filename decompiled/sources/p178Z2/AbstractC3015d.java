package p178Z2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p171Y2.AbstractC2932o;
import p178Z2.AbstractC2992F;
import p178Z2.AbstractC3017f;
import p256j$.util.Objects;

/* renamed from: Z2.d */
/* loaded from: classes.dex */
public abstract class AbstractC3015d extends AbstractC3017f implements Serializable {

    /* renamed from: e */
    public transient Map f9230e;

    /* renamed from: f */
    public transient int f9231f;

    /* renamed from: Z2.d$b */
    public class b extends d {
        public b(AbstractC3015d abstractC3015d) {
            super();
        }

        @Override // p178Z2.AbstractC3015d.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry mo10910a(Object obj, Object obj2) {
            return AbstractC2992F.m10796d(obj, obj2);
        }
    }

    /* renamed from: Z2.d$c */
    public class c extends AbstractC2992F.f {

        /* renamed from: c */
        public final transient Map f9232c;

        /* renamed from: Z2.d$c$a */
        public class a extends AbstractC2992F.c {
            public a() {
            }

            @Override // p178Z2.AbstractC2992F.c
            /* renamed from: a */
            public Map mo10810a() {
                return c.this;
            }

            @Override // p178Z2.AbstractC2992F.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AbstractC3021j.m10947c(c.this.f9232c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC3015d.this.m10908w(entry.getKey());
                return true;
            }
        }

        /* renamed from: Z2.d$c$b */
        public class b implements Iterator {

            /* renamed from: a */
            public final Iterator f9235a;

            /* renamed from: b */
            public Collection f9236b;

            public b() {
                this.f9235a = c.this.f9232c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f9235a.next();
                this.f9236b = (Collection) entry.getValue();
                return c.this.m10914e(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f9235a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                AbstractC2932o.m10579v(this.f9236b != null, "no calls to next() since the last call to remove()");
                this.f9235a.remove();
                AbstractC3015d.m10898p(AbstractC3015d.this, this.f9236b.size());
                this.f9236b.clear();
                this.f9236b = null;
            }
        }

        public c(Map map) {
            this.f9232c = map;
        }

        @Override // p178Z2.AbstractC2992F.f
        /* renamed from: a */
        public Set mo10813a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) AbstractC2992F.m10801i(this.f9232c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC3015d.this.mo10892y(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f9232c == AbstractC3015d.this.f9230e) {
                AbstractC3015d.this.clear();
            } else {
                AbstractC2988B.m10761c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return AbstractC2992F.m10800h(this.f9232c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f9232c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection mo10832r = AbstractC3015d.this.mo10832r();
            mo10832r.addAll(collection);
            AbstractC3015d.m10898p(AbstractC3015d.this, collection.size());
            collection.clear();
            return mo10832r;
        }

        /* renamed from: e */
        public Map.Entry m10914e(Map.Entry entry) {
            Object key = entry.getKey();
            return AbstractC2992F.m10796d(key, AbstractC3015d.this.mo10892y(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f9232c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f9232c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractC3015d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f9232c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f9232c.toString();
        }
    }

    /* renamed from: Z2.d$d */
    public abstract class d implements Iterator {

        /* renamed from: a */
        public final Iterator f9238a;

        /* renamed from: b */
        public Object f9239b = null;

        /* renamed from: c */
        public Collection f9240c = null;

        /* renamed from: d */
        public Iterator f9241d = AbstractC2988B.m10766h();

        public d() {
            this.f9238a = AbstractC3015d.this.f9230e.entrySet().iterator();
        }

        /* renamed from: a */
        public abstract Object mo10910a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9238a.hasNext() || this.f9241d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f9241d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f9238a.next();
                this.f9239b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f9240c = collection;
                this.f9241d = collection.iterator();
            }
            return mo10910a(AbstractC2997K.m10836a(this.f9239b), this.f9241d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f9241d.remove();
            Collection collection = this.f9240c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f9238a.remove();
            }
            AbstractC3015d.m10896n(AbstractC3015d.this);
        }
    }

    /* renamed from: Z2.d$e */
    public class e extends AbstractC2992F.d {

        /* renamed from: Z2.d$e$a */
        public class a implements Iterator {

            /* renamed from: a */
            public Map.Entry f9244a;

            /* renamed from: b */
            public final /* synthetic */ Iterator f9245b;

            public a(Iterator it) {
                this.f9245b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f9245b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f9245b.next();
                this.f9244a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                AbstractC2932o.m10579v(this.f9244a != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f9244a.getValue();
                this.f9245b.remove();
                AbstractC3015d.m10898p(AbstractC3015d.this, collection.size());
                collection.clear();
                this.f9244a = null;
            }
        }

        public e(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC2988B.m10761c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return m10811a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || m10811a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return m10811a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(m10811a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i7;
            Collection collection = (Collection) m10811a().remove(obj);
            if (collection != null) {
                i7 = collection.size();
                collection.clear();
                AbstractC3015d.m10898p(AbstractC3015d.this, i7);
            } else {
                i7 = 0;
            }
            return i7 > 0;
        }
    }

    /* renamed from: Z2.d$f */
    public final class f extends i implements NavigableMap {
        public f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry ceilingEntry = mo10918h().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return m10914e(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return mo10918h().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return AbstractC3015d.this.new f(mo10918h().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry firstEntry = mo10918h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m10914e(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry floorEntry = mo10918h().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return m10914e(floorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return mo10918h().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry higherEntry = mo10918h().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return m10914e(higherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return mo10918h().higherKey(obj);
        }

        @Override // p178Z2.AbstractC3015d.i
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet mo10916f() {
            return AbstractC3015d.this.new g(mo10918h());
        }

        @Override // p178Z2.AbstractC3015d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // p178Z2.AbstractC3015d.i, p178Z2.AbstractC3015d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        /* renamed from: l */
        public Map.Entry m10922l(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection mo10832r = AbstractC3015d.this.mo10832r();
            mo10832r.addAll((Collection) entry.getValue());
            it.remove();
            return AbstractC2992F.m10796d(entry.getKey(), AbstractC3015d.this.mo10891x(mo10832r));
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry lastEntry = mo10918h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m10914e(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry lowerEntry = mo10918h().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return m10914e(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return mo10918h().lowerKey(obj);
        }

        @Override // p178Z2.AbstractC3015d.i
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap mo10918h() {
            return (NavigableMap) super.mo10918h();
        }

        @Override // p178Z2.AbstractC3015d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return mo10917g();
        }

        @Override // p178Z2.AbstractC3015d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return m10922l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return m10922l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z6) {
            return AbstractC3015d.this.new f(mo10918h().headMap(obj, z6));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z6, Object obj2, boolean z7) {
            return AbstractC3015d.this.new f(mo10918h().subMap(obj, z6, obj2, z7));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z6) {
            return AbstractC3015d.this.new f(mo10918h().tailMap(obj, z6));
        }
    }

    /* renamed from: Z2.d$g */
    public final class g extends j implements NavigableSet {
        public g(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return mo10926b().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return AbstractC3015d.this.new g(mo10926b().descendingMap());
        }

        @Override // p178Z2.AbstractC3015d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // p178Z2.AbstractC3015d.j
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap mo10926b() {
            return (NavigableMap) super.mo10926b();
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return mo10926b().floorKey(obj);
        }

        @Override // p178Z2.AbstractC3015d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // p178Z2.AbstractC3015d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return mo10926b().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return mo10926b().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return AbstractC2988B.m10774p(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return AbstractC2988B.m10774p(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z6) {
            return AbstractC3015d.this.new g(mo10926b().headMap(obj, z6));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z6, Object obj2, boolean z7) {
            return AbstractC3015d.this.new g(mo10926b().subMap(obj, z6, obj2, z7));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z6) {
            return AbstractC3015d.this.new g(mo10926b().tailMap(obj, z6));
        }
    }

    /* renamed from: Z2.d$h */
    public class h extends l implements RandomAccess {
        public h(AbstractC3015d abstractC3015d, Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }
    }

    /* renamed from: Z2.d$i */
    public class i extends c implements SortedMap {

        /* renamed from: e */
        public SortedSet f9249e;

        public i(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return mo10918h().comparator();
        }

        /* renamed from: f */
        public SortedSet mo10916f() {
            return AbstractC3015d.this.new j(mo10918h());
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return mo10918h().firstKey();
        }

        @Override // p178Z2.AbstractC3015d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: g */
        public SortedSet keySet() {
            SortedSet sortedSet = this.f9249e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet mo10916f = mo10916f();
            this.f9249e = mo10916f;
            return mo10916f;
        }

        /* renamed from: h */
        public SortedMap mo10918h() {
            return (SortedMap) this.f9232c;
        }

        public SortedMap headMap(Object obj) {
            return AbstractC3015d.this.new i(mo10918h().headMap(obj));
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return mo10918h().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return AbstractC3015d.this.new i(mo10918h().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return AbstractC3015d.this.new i(mo10918h().tailMap(obj));
        }
    }

    /* renamed from: Z2.d$j */
    public class j extends e implements SortedSet {
        public j(SortedMap sortedMap) {
            super(sortedMap);
        }

        /* renamed from: b */
        public SortedMap mo10926b() {
            return (SortedMap) super.m10811a();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return mo10926b().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return mo10926b().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return AbstractC3015d.this.new j(mo10926b().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return mo10926b().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return AbstractC3015d.this.new j(mo10926b().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return AbstractC3015d.this.new j(mo10926b().tailMap(obj));
        }
    }

    public AbstractC3015d(Map map) {
        AbstractC2932o.m10561d(map.isEmpty());
        this.f9230e = map;
    }

    /* renamed from: m */
    public static /* synthetic */ int m10895m(AbstractC3015d abstractC3015d) {
        int i7 = abstractC3015d.f9231f;
        abstractC3015d.f9231f = i7 + 1;
        return i7;
    }

    /* renamed from: n */
    public static /* synthetic */ int m10896n(AbstractC3015d abstractC3015d) {
        int i7 = abstractC3015d.f9231f;
        abstractC3015d.f9231f = i7 - 1;
        return i7;
    }

    /* renamed from: o */
    public static /* synthetic */ int m10897o(AbstractC3015d abstractC3015d, int i7) {
        int i8 = abstractC3015d.f9231f + i7;
        abstractC3015d.f9231f = i8;
        return i8;
    }

    /* renamed from: p */
    public static /* synthetic */ int m10898p(AbstractC3015d abstractC3015d, int i7) {
        int i8 = abstractC3015d.f9231f - i7;
        abstractC3015d.f9231f = i8;
        return i8;
    }

    /* renamed from: v */
    public static Iterator m10900v(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // p178Z2.AbstractC3017f, p178Z2.InterfaceC2993G
    /* renamed from: a */
    public Collection mo10815a() {
        return super.mo10815a();
    }

    @Override // p178Z2.InterfaceC2993G
    public void clear() {
        Iterator it = this.f9230e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f9230e.clear();
        this.f9231f = 0;
    }

    @Override // p178Z2.AbstractC3017f
    /* renamed from: f */
    public Collection mo10901f() {
        return new AbstractC3017f.a();
    }

    @Override // p178Z2.InterfaceC2993G
    public Collection get(Object obj) {
        Collection collection = (Collection) this.f9230e.get(obj);
        if (collection == null) {
            collection = m10905s(obj);
        }
        return mo10892y(obj, collection);
    }

    @Override // p178Z2.AbstractC3017f
    /* renamed from: h */
    public Collection mo10902h() {
        return new AbstractC3017f.b();
    }

    @Override // p178Z2.AbstractC3017f
    /* renamed from: i */
    public Iterator mo10903i() {
        return new b(this);
    }

    @Override // p178Z2.AbstractC3017f
    /* renamed from: j */
    public Iterator mo10904j() {
        return new a(this);
    }

    @Override // p178Z2.InterfaceC2993G
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f9230e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f9231f++;
            return true;
        }
        Collection m10905s = m10905s(obj);
        if (!m10905s.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f9231f++;
        this.f9230e.put(obj, m10905s);
        return true;
    }

    /* renamed from: r */
    public abstract Collection mo10832r();

    /* renamed from: s */
    public Collection m10905s(Object obj) {
        return mo10832r();
    }

    @Override // p178Z2.InterfaceC2993G
    public int size() {
        return this.f9231f;
    }

    /* renamed from: t */
    public final Map m10906t() {
        Map map = this.f9230e;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f9230e) : map instanceof SortedMap ? new i((SortedMap) this.f9230e) : new c(this.f9230e);
    }

    /* renamed from: u */
    public final Set m10907u() {
        Map map = this.f9230e;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f9230e) : map instanceof SortedMap ? new j((SortedMap) this.f9230e) : new e(this.f9230e);
    }

    @Override // p178Z2.AbstractC3017f, p178Z2.InterfaceC2993G
    public Collection values() {
        return super.values();
    }

    /* renamed from: w */
    public final void m10908w(Object obj) {
        Collection collection = (Collection) AbstractC2992F.m10802j(this.f9230e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f9231f -= size;
        }
    }

    /* renamed from: x */
    public abstract Collection mo10891x(Collection collection);

    /* renamed from: y */
    public abstract Collection mo10892y(Object obj, Collection collection);

    /* renamed from: z */
    public final List m10909z(Object obj, List list, k kVar) {
        return list instanceof RandomAccess ? new h(this, obj, list, kVar) : new l(obj, list, kVar);
    }

    /* renamed from: Z2.d$k */
    public class k extends AbstractCollection {

        /* renamed from: a */
        public final Object f9252a;

        /* renamed from: b */
        public Collection f9253b;

        /* renamed from: c */
        public final k f9254c;

        /* renamed from: d */
        public final Collection f9255d;

        public k(Object obj, Collection collection, k kVar) {
            this.f9252a = obj;
            this.f9253b = collection;
            this.f9254c = kVar;
            this.f9255d = kVar == null ? null : kVar.m10933e();
        }

        /* renamed from: a */
        public void m10931a() {
            k kVar = this.f9254c;
            if (kVar != null) {
                kVar.m10931a();
            } else {
                AbstractC3015d.this.f9230e.put(this.f9252a, this.f9253b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            m10935g();
            boolean isEmpty = this.f9253b.isEmpty();
            boolean add = this.f9253b.add(obj);
            if (add) {
                AbstractC3015d.m10895m(AbstractC3015d.this);
                if (isEmpty) {
                    m10931a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f9253b.addAll(collection);
            if (addAll) {
                AbstractC3015d.m10897o(AbstractC3015d.this, this.f9253b.size() - size);
                if (size == 0) {
                    m10931a();
                }
            }
            return addAll;
        }

        /* renamed from: b */
        public k m10932b() {
            return this.f9254c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f9253b.clear();
            AbstractC3015d.m10898p(AbstractC3015d.this, size);
            m10936h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m10935g();
            return this.f9253b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            m10935g();
            return this.f9253b.containsAll(collection);
        }

        /* renamed from: e */
        public Collection m10933e() {
            return this.f9253b;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m10935g();
            return this.f9253b.equals(obj);
        }

        /* renamed from: f */
        public Object m10934f() {
            return this.f9252a;
        }

        /* renamed from: g */
        public void m10935g() {
            Collection collection;
            k kVar = this.f9254c;
            if (kVar != null) {
                kVar.m10935g();
                if (this.f9254c.m10933e() != this.f9255d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f9253b.isEmpty() || (collection = (Collection) AbstractC3015d.this.f9230e.get(this.f9252a)) == null) {
                    return;
                }
                this.f9253b = collection;
            }
        }

        /* renamed from: h */
        public void m10936h() {
            k kVar = this.f9254c;
            if (kVar != null) {
                kVar.m10936h();
            } else if (this.f9253b.isEmpty()) {
                AbstractC3015d.this.f9230e.remove(this.f9252a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            m10935g();
            return this.f9253b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            m10935g();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m10935g();
            boolean remove = this.f9253b.remove(obj);
            if (remove) {
                AbstractC3015d.m10896n(AbstractC3015d.this);
                m10936h();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f9253b.removeAll(collection);
            if (removeAll) {
                AbstractC3015d.m10897o(AbstractC3015d.this, this.f9253b.size() - size);
                m10936h();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            AbstractC2932o.m10572o(collection);
            int size = size();
            boolean retainAll = this.f9253b.retainAll(collection);
            if (retainAll) {
                AbstractC3015d.m10897o(AbstractC3015d.this, this.f9253b.size() - size);
                m10936h();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m10935g();
            return this.f9253b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m10935g();
            return this.f9253b.toString();
        }

        /* renamed from: Z2.d$k$a */
        public class a implements Iterator {

            /* renamed from: a */
            public final Iterator f9257a;

            /* renamed from: b */
            public final Collection f9258b;

            public a() {
                Collection collection = k.this.f9253b;
                this.f9258b = collection;
                this.f9257a = AbstractC3015d.m10900v(collection);
            }

            /* renamed from: a */
            public Iterator m10937a() {
                m10938c();
                return this.f9257a;
            }

            /* renamed from: c */
            public void m10938c() {
                k.this.m10935g();
                if (k.this.f9253b != this.f9258b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m10938c();
                return this.f9257a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                m10938c();
                return this.f9257a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f9257a.remove();
                AbstractC3015d.m10896n(AbstractC3015d.this);
                k.this.m10936h();
            }

            public a(Iterator it) {
                this.f9258b = k.this.f9253b;
                this.f9257a = it;
            }
        }
    }

    /* renamed from: Z2.d$l */
    public class l extends k implements List {

        /* renamed from: Z2.d$l$a */
        public class a extends k.a implements ListIterator {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean isEmpty = l.this.isEmpty();
                m10940d().add(obj);
                AbstractC3015d.m10895m(AbstractC3015d.this);
                if (isEmpty) {
                    l.this.m10931a();
                }
            }

            /* renamed from: d */
            public final ListIterator m10940d() {
                return (ListIterator) m10937a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m10940d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m10940d().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return m10940d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m10940d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                m10940d().set(obj);
            }

            public a(int i7) {
                super(l.this.m10939i().listIterator(i7));
            }
        }

        public l(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }

        @Override // java.util.List
        public void add(int i7, Object obj) {
            m10935g();
            boolean isEmpty = m10933e().isEmpty();
            m10939i().add(i7, obj);
            AbstractC3015d.m10895m(AbstractC3015d.this);
            if (isEmpty) {
                m10931a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i7, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m10939i().addAll(i7, collection);
            if (addAll) {
                AbstractC3015d.m10897o(AbstractC3015d.this, m10933e().size() - size);
                if (size == 0) {
                    m10931a();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public Object get(int i7) {
            m10935g();
            return m10939i().get(i7);
        }

        /* renamed from: i */
        public List m10939i() {
            return (List) m10933e();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m10935g();
            return m10939i().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m10935g();
            return m10939i().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            m10935g();
            return new a();
        }

        @Override // java.util.List
        public Object remove(int i7) {
            m10935g();
            Object remove = m10939i().remove(i7);
            AbstractC3015d.m10896n(AbstractC3015d.this);
            m10936h();
            return remove;
        }

        @Override // java.util.List
        public Object set(int i7, Object obj) {
            m10935g();
            return m10939i().set(i7, obj);
        }

        @Override // java.util.List
        public List subList(int i7, int i8) {
            m10935g();
            return AbstractC3015d.this.m10909z(m10934f(), m10939i().subList(i7, i8), m10932b() == null ? this : m10932b());
        }

        @Override // java.util.List
        public ListIterator listIterator(int i7) {
            m10935g();
            return new a(i7);
        }
    }

    /* renamed from: Z2.d$a */
    public class a extends d {
        public a(AbstractC3015d abstractC3015d) {
            super();
        }

        @Override // p178Z2.AbstractC3015d.d
        /* renamed from: a */
        public Object mo10910a(Object obj, Object obj2) {
            return obj2;
        }
    }
}
