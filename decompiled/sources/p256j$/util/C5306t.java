package p256j$.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import p256j$.util.Collection;
import p256j$.util.stream.AbstractC5034A0;
import p256j$.util.stream.Stream;

/* renamed from: j$.util.t */
/* loaded from: classes3.dex */
final class C5306t extends C5312w {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // p256j$.util.C5021n, java.lang.Iterable, p256j$.util.Collection
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Collection.EL.m21259a(this.f18311a, new C5027q(consumer));
    }

    @Override // p256j$.util.C5021n, java.util.Collection, java.lang.Iterable, p256j$.util.Collection
    public final Spliterator spliterator() {
        return new C5031s(Collection.EL.m21261c(this.f18311a));
    }

    @Override // p256j$.util.C5021n, java.util.Collection, p256j$.util.Collection
    public final Stream stream() {
        return AbstractC5034A0.m21401f0(spliterator(), false);
    }

    @Override // p256j$.util.C5021n, java.util.Collection, p256j$.util.Collection
    public final Stream parallelStream() {
        return AbstractC5034A0.m21401f0(spliterator(), true);
    }

    @Override // p256j$.util.C5021n, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5019m(this);
    }

    @Override // p256j$.util.C5021n, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.f18311a.toArray();
        for (int i7 = 0; i7 < array.length; i7++) {
            array[i7] = new C5029r((Map.Entry) array[i7]);
        }
        return array;
    }

    @Override // p256j$.util.C5021n, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.f18311a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i7 = 0; i7 < array.length; i7++) {
            array[i7] = new C5029r((Map.Entry) array[i7]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // p256j$.util.C5021n, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.f18311a.contains(new C5029r((Map.Entry) obj));
    }

    @Override // p256j$.util.C5021n, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p256j$.util.C5312w, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != this.f18311a.size()) {
            return false;
        }
        return containsAll(set);
    }
}
