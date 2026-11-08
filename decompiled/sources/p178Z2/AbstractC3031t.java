package p178Z2;

import com.google.android.gms.common.api.C3643a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p171Y2.AbstractC2932o;

/* renamed from: Z2.t */
/* loaded from: classes.dex */
public abstract class AbstractC3031t extends AbstractCollection implements Serializable {

    /* renamed from: a */
    public static final Object[] f9302a = new Object[0];

    /* renamed from: Z2.t$a */
    public static abstract class a extends b {

        /* renamed from: a */
        public Object[] f9303a;

        /* renamed from: b */
        public int f9304b;

        /* renamed from: c */
        public boolean f9305c;

        public a(int i7) {
            AbstractC3020i.m10943b(i7, "initialCapacity");
            this.f9303a = new Object[i7];
            this.f9304b = 0;
        }

        @Override // p178Z2.AbstractC3031t.b
        /* renamed from: b */
        public b mo11034b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m11038g(this.f9304b + collection.size());
                if (collection instanceof AbstractC3031t) {
                    this.f9304b = ((AbstractC3031t) collection).mo10852b(this.f9303a, this.f9304b);
                    return this;
                }
            }
            super.mo11034b(iterable);
            return this;
        }

        /* renamed from: d */
        public a m11035d(Object obj) {
            AbstractC2932o.m10572o(obj);
            m11038g(this.f9304b + 1);
            Object[] objArr = this.f9303a;
            int i7 = this.f9304b;
            this.f9304b = i7 + 1;
            objArr[i7] = obj;
            return this;
        }

        /* renamed from: e */
        public b m11036e(Object... objArr) {
            m11037f(objArr, objArr.length);
            return this;
        }

        /* renamed from: f */
        public final void m11037f(Object[] objArr, int i7) {
            AbstractC2998L.m10840c(objArr, i7);
            m11038g(this.f9304b + i7);
            System.arraycopy(objArr, 0, this.f9303a, this.f9304b, i7);
            this.f9304b += i7;
        }

        /* renamed from: g */
        public final void m11038g(int i7) {
            Object[] objArr = this.f9303a;
            if (objArr.length < i7) {
                this.f9303a = Arrays.copyOf(objArr, b.m11039c(objArr.length, i7));
                this.f9305c = false;
            } else if (this.f9305c) {
                this.f9303a = (Object[]) objArr.clone();
                this.f9305c = false;
            }
        }
    }

    /* renamed from: Z2.t$b */
    public static abstract class b {
        /* renamed from: c */
        public static int m11039c(int i7, int i8) {
            if (i8 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i9 = i7 + (i7 >> 1) + 1;
            if (i9 < i8) {
                i9 = Integer.highestOneBit(i8 - 1) << 1;
            }
            return i9 < 0 ? C3643a.e.API_PRIORITY_OTHER : i9;
        }

        /* renamed from: a */
        public abstract b mo11040a(Object obj);

        /* renamed from: b */
        public b mo11034b(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                mo11040a(it.next());
            }
            return this;
        }
    }

    /* renamed from: a */
    public AbstractC3033v mo10871a() {
        return isEmpty() ? AbstractC3033v.m11050t() : AbstractC3033v.m11043k(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo10852b(Object[] objArr, int i7) {
        AbstractC3010Y it = iterator();
        while (it.hasNext()) {
            objArr[i7] = it.next();
            i7++;
        }
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* renamed from: e */
    public Object[] mo10853e() {
        return null;
    }

    /* renamed from: f */
    public int mo10854f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public int mo10855g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public abstract boolean mo10856h();

    /* renamed from: i */
    public abstract AbstractC3010Y iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f9302a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC2932o.m10572o(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] mo10853e = mo10853e();
            if (mo10853e != null) {
                return AbstractC3000N.m10848a(mo10853e, mo10855g(), mo10854f(), objArr);
            }
            objArr = AbstractC2998L.m10841d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo10852b(objArr, 0);
        return objArr;
    }
}
