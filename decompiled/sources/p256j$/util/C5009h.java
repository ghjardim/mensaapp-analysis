package p256j$.util;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import p256j$.util.Collection;
import p256j$.util.Spliterator;
import p256j$.util.stream.Stream;

/* renamed from: j$.util.h */
/* loaded from: classes3.dex */
class C5009h implements Collection, Serializable, Collection {
    private static final long serialVersionUID = 3053995032091335093L;

    /* renamed from: a */
    final Collection f18281a;

    /* renamed from: b */
    final Object f18282b;

    @Override // java.util.Collection, p256j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    C5009h(Collection collection) {
        this.f18281a = (Collection) Objects.requireNonNull(collection);
        this.f18282b = this;
    }

    C5009h(Collection collection, Object obj) {
        this.f18281a = (Collection) Objects.requireNonNull(collection);
        this.f18282b = Objects.requireNonNull(obj);
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f18282b) {
            size = this.f18281a.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f18282b) {
            isEmpty = this.f18281a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f18282b) {
            contains = this.f18281a.contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f18282b) {
            array = this.f18281a.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f18282b) {
            array = this.f18281a.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f18281a.iterator();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean add;
        synchronized (this.f18282b) {
            add = this.f18281a.add(obj);
        }
        return add;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f18282b) {
            remove = this.f18281a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.f18282b) {
            containsAll = this.f18281a.containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.f18282b) {
            addAll = this.f18281a.addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.f18282b) {
            removeAll = this.f18281a.removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.f18282b) {
            retainAll = this.f18281a.retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f18282b) {
            this.f18281a.clear();
        }
    }

    public final String toString() {
        String obj;
        synchronized (this.f18282b) {
            obj = this.f18281a.toString();
        }
        return obj;
    }

    @Override // java.lang.Iterable, p256j$.util.Collection
    public final void forEach(Consumer consumer) {
        synchronized (this.f18282b) {
            Collection.EL.m21259a(this.f18281a, consumer);
        }
    }

    @Override // java.util.Collection, p256j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        boolean removeIf;
        synchronized (this.f18282b) {
            java.util.Collection collection = this.f18281a;
            removeIf = collection instanceof Collection ? ((Collection) collection).removeIf(predicate) : Collection.CC.$default$removeIf(collection, predicate);
        }
        return removeIf;
    }

    @Override // java.util.Collection, java.lang.Iterable, p256j$.util.Collection
    public final Spliterator spliterator() {
        return Collection.EL.m21261c(this.f18281a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterator.Wrapper.convert(Collection.EL.m21261c(this.f18281a));
    }

    @Override // java.util.Collection, p256j$.util.Collection
    public final Stream stream() {
        return Collection.EL.stream(this.f18281a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.EL.stream(this.f18281a));
    }

    @Override // java.util.Collection, p256j$.util.Collection
    public final Stream parallelStream() {
        return Collection.EL.m21260b(this.f18281a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.EL.m21260b(this.f18281a));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f18282b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
