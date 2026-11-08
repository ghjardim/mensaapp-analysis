package p256j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

/* renamed from: j$.util.o */
/* loaded from: classes3.dex */
final class C5023o implements ListIterator, InterfaceC4936A {

    /* renamed from: a */
    private final ListIterator f18312a;

    C5023o(C5025p c5025p, int i7) {
        this.f18312a = c5025p.f18313b.listIterator(i7);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f18312a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f18312a.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18312a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f18312a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18312a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18312a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, p256j$.util.InterfaceC4936A
    public final void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21359q(this.f18312a, consumer);
    }
}
