package p378x5;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5459b;
import kotlin.jvm.internal.AbstractC5463f;
import kotlin.jvm.internal.AbstractC5469l;
import p076K5.InterfaceC0834a;

/* renamed from: x5.f */
/* loaded from: classes2.dex */
public final class C7015f implements Collection, InterfaceC0834a {

    /* renamed from: a */
    public final Object[] f25077a;

    /* renamed from: b */
    public final boolean f25078b;

    public C7015f(Object[] values, boolean z6) {
        AbstractC5469l.m23028e(values, "values");
        this.f25077a = values;
        this.f25078b = z6;
    }

    /* renamed from: a */
    public int m28778a() {
        return this.f25077a.length;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC7020k.m28842o(this.f25077a, obj);
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
        return this.f25077a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC5459b.m23012a(this.f25077a);
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
        return m28778a();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC5469l.m23028e(array, "array");
        return AbstractC5463f.m23022b(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC7023n.m28855a(this.f25077a, this.f25078b);
    }
}
