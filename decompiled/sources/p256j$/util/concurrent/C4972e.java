package p256j$.util.concurrent;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import p256j$.util.Collection;
import p256j$.util.Spliterator;
import p256j$.util.stream.Stream;

/* renamed from: j$.util.concurrent.e */
/* loaded from: classes3.dex */
final class C4972e extends AbstractC4969b implements Set, p256j$.util.Set {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection, p256j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, p256j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.CC.$default$stream(this));
    }

    @Override // java.util.Collection, p256j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.f18203a.m21316f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // p256j$.util.concurrent.AbstractC4969b, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.f18203a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
    }

    @Override // p256j$.util.concurrent.AbstractC4969b, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.f18203a.remove(key, value);
    }

    @Override // p256j$.util.concurrent.AbstractC4969b, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f18203a;
        C4979l[] c4979lArr = concurrentHashMap.f18187a;
        int length = c4979lArr == null ? 0 : c4979lArr.length;
        return new C4971d(c4979lArr, length, length, concurrentHashMap);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f18203a.m21316f(entry.getKey(), entry.getValue(), false) == null) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, p256j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.f18203a;
        concurrentHashMap.getClass();
        predicate.getClass();
        C4979l[] c4979lArr = concurrentHashMap.f18187a;
        boolean z6 = false;
        if (c4979lArr != null) {
            C4983p c4983p = new C4983p(c4979lArr, c4979lArr.length, 0, c4979lArr.length);
            while (true) {
                C4979l m21329a = c4983p.m21329a();
                if (m21329a == null) {
                    break;
                }
                Object obj = m21329a.f18224b;
                Object obj2 = m21329a.f18225c;
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.m21317g(obj, null, obj2) != null) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        C4979l[] c4979lArr = this.f18203a.f18187a;
        int i7 = 0;
        if (c4979lArr != null) {
            C4983p c4983p = new C4983p(c4979lArr, c4979lArr.length, 0, c4979lArr.length);
            while (true) {
                C4979l m21329a = c4983p.m21329a();
                if (m21329a == null) {
                    break;
                }
                i7 += m21329a.hashCode();
            }
        }
        return i7;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, p256j$.util.Collection
    public final p256j$.util.Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f18203a;
        long m21318j = concurrentHashMap.m21318j();
        C4979l[] c4979lArr = concurrentHashMap.f18187a;
        int length = c4979lArr == null ? 0 : c4979lArr.length;
        return new C4973f(c4979lArr, length, 0, length, m21318j >= 0 ? m21318j : 0L, concurrentHashMap);
    }

    @Override // java.lang.Iterable, p256j$.util.Collection
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C4979l[] c4979lArr = this.f18203a.f18187a;
        if (c4979lArr == null) {
            return;
        }
        C4983p c4983p = new C4983p(c4979lArr, c4979lArr.length, 0, c4979lArr.length);
        while (true) {
            C4979l m21329a = c4983p.m21329a();
            if (m21329a == null) {
                return;
            } else {
                consumer.m21477p(new C4978k(m21329a.f18224b, m21329a.f18225c, this.f18203a));
            }
        }
    }
}
