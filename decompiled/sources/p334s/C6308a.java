package p334s;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p256j$.util.Map;
import p342t.AbstractC6404a;

/* renamed from: s.a */
/* loaded from: classes.dex */
public class C6308a extends C6318k implements Map, p256j$.util.Map {

    /* renamed from: d */
    public a f22849d;

    /* renamed from: e */
    public c f22850e;

    /* renamed from: f */
    public e f22851f;

    /* renamed from: s.a$a */
    public final class a extends AbstractSet {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C6308a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6308a.this.size();
        }
    }

    /* renamed from: s.a$b */
    public final class b extends AbstractC6314g {
        public b() {
            super(C6308a.this.size());
        }

        @Override // p334s.AbstractC6314g
        /* renamed from: a */
        public Object mo26414a(int i7) {
            return C6308a.this.m26455f(i7);
        }

        @Override // p334s.AbstractC6314g
        /* renamed from: c */
        public void mo26415c(int i7) {
            C6308a.this.m26457h(i7);
        }
    }

    /* renamed from: s.a$d */
    public final class d implements Iterator, Map.Entry {

        /* renamed from: a */
        public int f22855a;

        /* renamed from: b */
        public int f22856b = -1;

        /* renamed from: c */
        public boolean f22857c;

        public d() {
            this.f22855a = C6308a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f22856b++;
            this.f22857c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f22857c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC6404a.m26748c(entry.getKey(), C6308a.this.m26455f(this.f22856b)) && AbstractC6404a.m26748c(entry.getValue(), C6308a.this.m26459j(this.f22856b));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f22857c) {
                return C6308a.this.m26455f(this.f22856b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f22857c) {
                return C6308a.this.m26459j(this.f22856b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22856b < this.f22855a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f22857c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object m26455f = C6308a.this.m26455f(this.f22856b);
            Object m26459j = C6308a.this.m26459j(this.f22856b);
            return (m26455f == null ? 0 : m26455f.hashCode()) ^ (m26459j != null ? m26459j.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f22857c) {
                throw new IllegalStateException();
            }
            C6308a.this.m26457h(this.f22856b);
            this.f22856b--;
            this.f22855a--;
            this.f22857c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f22857c) {
                return C6308a.this.m26458i(this.f22856b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: s.a$f */
    public final class f extends AbstractC6314g {
        public f() {
            super(C6308a.this.size());
        }

        @Override // p334s.AbstractC6314g
        /* renamed from: a */
        public Object mo26414a(int i7) {
            return C6308a.this.m26459j(i7);
        }

        @Override // p334s.AbstractC6314g
        /* renamed from: c */
        public void mo26415c(int i7) {
            C6308a.this.m26457h(i7);
        }
    }

    public C6308a() {
    }

    /* renamed from: l */
    public static boolean m26410l(Set set, Object obj) {
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

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // p334s.C6318k, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // p334s.C6318k, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        a aVar = this.f22849d;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f22849d = aVar2;
        return aVar2;
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // p334s.C6318k, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    /* renamed from: k */
    public boolean m26411k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f22850e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f22850e = cVar2;
        return cVar2;
    }

    /* renamed from: m */
    public boolean m26412m(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    /* renamed from: n */
    public boolean m26413n(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(m26455f(size2))) {
                m26457h(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        m26451b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // p334s.C6318k, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f22851f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f22851f = eVar2;
        return eVar2;
    }

    public C6308a(int i7) {
        super(i7);
    }

    /* renamed from: s.a$c */
    public final class c implements Set {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C6308a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C6308a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C6308a.this.m26411k(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C6308a.m26410l(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i7 = 0;
            for (int size = C6308a.this.size() - 1; size >= 0; size--) {
                Object m26455f = C6308a.this.m26455f(size);
                i7 += m26455f == null ? 0 : m26455f.hashCode();
            }
            return i7;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C6308a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C6308a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int m26453d = C6308a.this.m26453d(obj);
            if (m26453d < 0) {
                return false;
            }
            C6308a.this.m26457h(m26453d);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C6308a.this.m26412m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C6308a.this.m26413n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C6308a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C6308a.this.size();
            Object[] objArr = new Object[size];
            for (int i7 = 0; i7 < size; i7++) {
                objArr[i7] = C6308a.this.m26455f(i7);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i7 = 0; i7 < size; i7++) {
                objArr[i7] = C6308a.this.m26455f(i7);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* renamed from: s.a$e */
    public final class e implements Collection {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C6308a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C6308a.this.m26450a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C6308a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C6308a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int m26450a = C6308a.this.m26450a(obj);
            if (m26450a < 0) {
                return false;
            }
            C6308a.this.m26457h(m26450a);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C6308a.this.size();
            int i7 = 0;
            boolean z6 = false;
            while (i7 < size) {
                if (collection.contains(C6308a.this.m26459j(i7))) {
                    C6308a.this.m26457h(i7);
                    i7--;
                    size--;
                    z6 = true;
                }
                i7++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C6308a.this.size();
            int i7 = 0;
            boolean z6 = false;
            while (i7 < size) {
                if (!collection.contains(C6308a.this.m26459j(i7))) {
                    C6308a.this.m26457h(i7);
                    i7--;
                    size--;
                    z6 = true;
                }
                i7++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public int size() {
            return C6308a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C6308a.this.size();
            Object[] objArr = new Object[size];
            for (int i7 = 0; i7 < size; i7++) {
                objArr[i7] = C6308a.this.m26459j(i7);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i7 = 0; i7 < size; i7++) {
                objArr[i7] = C6308a.this.m26459j(i7);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public C6308a(C6318k c6318k) {
        super(c6318k);
    }
}
