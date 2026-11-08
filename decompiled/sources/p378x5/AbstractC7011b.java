package p378x5;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5463f;
import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;
import p076K5.InterfaceC0834a;

/* renamed from: x5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC7011b implements Collection, InterfaceC0834a {
    /* renamed from: e */
    public static final CharSequence m28763e(AbstractC7011b abstractC7011b, Object obj) {
        return obj == abstractC7011b ? "(this Collection)" : String.valueOf(obj);
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public abstract int mo240b();

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (AbstractC5469l.m23024a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC5469l.m23028e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo240b();
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC5463f.m23021a(this);
    }

    public String toString() {
        return AbstractC7032w.m28878D(this, ", ", "[", "]", 0, null, new InterfaceC0800l() { // from class: x5.a
            @Override // p069J5.InterfaceC0800l
            public final Object invoke(Object obj) {
                CharSequence m28763e;
                m28763e = AbstractC7011b.m28763e(AbstractC7011b.this, obj);
                return m28763e;
            }
        }, 24, null);
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC5469l.m23028e(array, "array");
        return AbstractC5463f.m23022b(this, array);
    }
}
