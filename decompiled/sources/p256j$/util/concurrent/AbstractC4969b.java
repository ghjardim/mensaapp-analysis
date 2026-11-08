package p256j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: j$.util.concurrent.b */
/* loaded from: classes3.dex */
abstract class AbstractC4969b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a */
    final ConcurrentHashMap f18203a;

    @Override // java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.Collection, java.util.Set
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public final Object[] toArray() {
        long m21318j = this.f18203a.m21318j();
        if (m21318j < 0) {
            m21318j = 0;
        }
        if (m21318j > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i7 = (int) m21318j;
        Object[] objArr = new Object[i7];
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i8 == i7) {
                if (i7 >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i9 = i7 < 1073741819 ? (i7 >>> 1) + 1 + i7 : 2147483639;
                objArr = Arrays.copyOf(objArr, i9);
                i7 = i9;
            }
            objArr[i8] = next;
            i8++;
        }
        return i8 == i7 ? objArr : Arrays.copyOf(objArr, i8);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long m21318j = this.f18203a.m21318j();
        if (m21318j < 0) {
            m21318j = 0;
        }
        if (m21318j > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i7 = (int) m21318j;
        Object[] objArr2 = objArr.length >= i7 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        int length = objArr2.length;
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i8 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i9 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArr2 = Arrays.copyOf(objArr2, i9);
                length = i9;
            }
            objArr2[i8] = next;
            i8++;
        }
        if (objArr != objArr2 || i8 >= length) {
            return i8 == length ? objArr2 : Arrays.copyOf(objArr2, i8);
        }
        objArr2[i8] = null;
        return objArr2;
    }

    AbstractC4969b(ConcurrentHashMap concurrentHashMap) {
        this.f18203a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f18203a.clear();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f18203a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f18203a.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == this) {
            return true;
        }
        for (Object obj : collection) {
            if (obj == null || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        C4979l[] c4979lArr = this.f18203a.f18187a;
        boolean z6 = false;
        if (c4979lArr == null) {
            return false;
        }
        if ((collection instanceof Set) && collection.size() > c4979lArr.length) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z6 = true;
                }
            }
        } else {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                z6 |= remove(it2.next());
            }
        }
        return z6;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }
}
