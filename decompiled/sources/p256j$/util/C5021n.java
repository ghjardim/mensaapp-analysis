package p256j$.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import p256j$.util.Collection;
import p256j$.util.Spliterator;
import p256j$.util.stream.Stream;

/* renamed from: j$.util.n */
/* loaded from: classes3.dex */
class C5021n implements Collection, Serializable, Collection {
    private static final long serialVersionUID = 1820017752578914078L;

    /* renamed from: a */
    final Collection f18311a;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection, p256j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    C5021n(Collection collection) {
        collection.getClass();
        this.f18311a = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f18311a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f18311a.isEmpty();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f18311a.contains(obj);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.f18311a.toArray();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f18311a.toArray(objArr);
    }

    public final String toString() {
        return this.f18311a.toString();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C5019m(this);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f18311a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable, p256j$.util.Collection
    public void forEach(Consumer consumer) {
        Collection.EL.m21259a(this.f18311a, consumer);
    }

    @Override // java.util.Collection, p256j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable, p256j$.util.Collection
    public Spliterator spliterator() {
        return Collection.EL.m21261c(this.f18311a);
    }

    @Override // java.util.Collection, p256j$.util.Collection
    public p256j$.util.stream.Stream stream() {
        return Collection.EL.stream(this.f18311a);
    }

    @Override // java.util.Collection, p256j$.util.Collection
    public p256j$.util.stream.Stream parallelStream() {
        return Collection.EL.m21260b(this.f18311a);
    }
}
