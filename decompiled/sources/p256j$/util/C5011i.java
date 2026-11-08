package p256j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
import p256j$.util.List;

/* renamed from: j$.util.i */
/* loaded from: classes3.dex */
class C5011i extends C5009h implements List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* renamed from: c */
    final List f18286c;

    C5011i(List list) {
        super(list);
        this.f18286c = list;
    }

    C5011i(List list, Object obj) {
        super(list, obj);
        this.f18286c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f18282b) {
            equals = this.f18286c.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int hashCode;
        synchronized (this.f18282b) {
            hashCode = this.f18286c.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object obj;
        synchronized (this.f18282b) {
            obj = this.f18286c.get(i7);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        Object obj2;
        synchronized (this.f18282b) {
            obj2 = this.f18286c.set(i7, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        synchronized (this.f18282b) {
            this.f18286c.add(i7, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        Object remove;
        synchronized (this.f18282b) {
            remove = this.f18286c.remove(i7);
        }
        return remove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int indexOf;
        synchronized (this.f18282b) {
            indexOf = this.f18286c.indexOf(obj);
        }
        return indexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.f18282b) {
            lastIndexOf = this.f18286c.lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        boolean addAll;
        synchronized (this.f18282b) {
            addAll = this.f18286c.addAll(i7, collection);
        }
        return addAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f18286c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return this.f18286c.listIterator(i7);
    }

    @Override // java.util.List
    public List subList(int i7, int i8) {
        C5011i c5011i;
        synchronized (this.f18282b) {
            c5011i = new C5011i(this.f18286c.subList(i7, i8), this.f18282b);
        }
        return c5011i;
    }

    @Override // java.util.List, p256j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f18282b) {
            List list = this.f18286c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                List.CC.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List, p256j$.util.List
    public final void sort(Comparator comparator) {
        synchronized (this.f18282b) {
            List.EL.sort(this.f18286c, comparator);
        }
    }

    private Object readResolve() {
        java.util.List list = this.f18286c;
        return list instanceof RandomAccess ? new C5015k(list) : this;
    }
}
