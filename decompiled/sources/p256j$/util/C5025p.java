package p256j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* renamed from: j$.util.p */
/* loaded from: classes3.dex */
class C5025p extends C5021n implements List, List {
    private static final long serialVersionUID = -283967356065247728L;

    /* renamed from: b */
    final List f18313b;

    C5025p(List list) {
        super(list);
        this.f18313b = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || this.f18313b.equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f18313b.hashCode();
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return this.f18313b.get(i7);
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f18313b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f18313b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p256j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p256j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C5023o(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new C5023o(this, i7);
    }

    @Override // java.util.List
    public List subList(int i7, int i8) {
        return new C5025p(this.f18313b.subList(i7, i8));
    }

    private Object readResolve() {
        List list = this.f18313b;
        return list instanceof RandomAccess ? new C5310v(list) : this;
    }
}
