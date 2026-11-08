package p256j$.util.concurrent;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import p256j$.util.Collection;
import p256j$.util.Spliterator;
import p256j$.util.stream.Stream;

/* renamed from: j$.util.concurrent.s */
/* loaded from: classes3.dex */
final class C4986s extends AbstractC4969b implements Collection {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection, p256j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.Collection, java.lang.Iterable
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

    @Override // p256j$.util.concurrent.AbstractC4969b, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f18203a.containsValue(obj);
    }

    @Override // p256j$.util.concurrent.AbstractC4969b, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        AbstractC4968a abstractC4968a;
        if (obj == null) {
            return false;
        }
        Object it = iterator();
        do {
            abstractC4968a = (AbstractC4968a) it;
            if (!abstractC4968a.hasNext()) {
                return false;
            }
        } while (!obj.equals(((C4976i) it).next()));
        abstractC4968a.remove();
        return true;
    }

    @Override // p256j$.util.concurrent.AbstractC4969b, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f18203a;
        C4979l[] c4979lArr = concurrentHashMap.f18187a;
        int length = c4979lArr == null ? 0 : c4979lArr.length;
        return new C4976i(c4979lArr, length, length, concurrentHashMap, 1);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p256j$.util.concurrent.AbstractC4969b, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        Object it = iterator();
        boolean z6 = false;
        while (true) {
            AbstractC4968a abstractC4968a = (AbstractC4968a) it;
            if (!abstractC4968a.hasNext()) {
                return z6;
            }
            if (collection.contains(((C4976i) it).next())) {
                abstractC4968a.remove();
                z6 = true;
            }
        }
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
                if (predicate.test(obj2) && concurrentHashMap.m21317g(obj, null, obj2) != null) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.lang.Iterable, p256j$.util.Collection
    public final p256j$.util.Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f18203a;
        long m21318j = concurrentHashMap.m21318j();
        C4979l[] c4979lArr = concurrentHashMap.f18187a;
        int length = c4979lArr == null ? 0 : c4979lArr.length;
        return new C4977j(c4979lArr, length, 0, length, m21318j < 0 ? 0L : m21318j, 1);
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
                consumer.m21477p(m21329a.f18225c);
            }
        }
    }
}
