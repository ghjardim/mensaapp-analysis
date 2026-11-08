package p178Z2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p171Y2.AbstractC2932o;
import p178Z2.AbstractC3031t;

/* renamed from: Z2.v */
/* loaded from: classes.dex */
public abstract class AbstractC3033v extends AbstractC3031t implements List, RandomAccess {

    /* renamed from: b */
    public static final AbstractC3011Z f9308b = new b(C3001O.f9183e, 0);

    /* renamed from: Z2.v$a */
    public static final class a extends AbstractC3031t.a {
        public a() {
            this(4);
        }

        @Override // p178Z2.AbstractC3031t.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a mo11040a(Object obj) {
            super.m11035d(obj);
            return this;
        }

        /* renamed from: i */
        public a m11061i(Object... objArr) {
            super.m11036e(objArr);
            return this;
        }

        /* renamed from: j */
        public a m11062j(Iterable iterable) {
            super.mo11034b(iterable);
            return this;
        }

        /* renamed from: k */
        public AbstractC3033v m11063k() {
            this.f9305c = true;
            return AbstractC3033v.m11044l(this.f9303a, this.f9304b);
        }

        public a(int i7) {
            super(i7);
        }
    }

    /* renamed from: Z2.v$b */
    public static class b extends AbstractC3012a {

        /* renamed from: c */
        public final AbstractC3033v f9309c;

        public b(AbstractC3033v abstractC3033v, int i7) {
            super(abstractC3033v.size(), i7);
            this.f9309c = abstractC3033v;
        }

        @Override // p178Z2.AbstractC3012a
        /* renamed from: a */
        public Object mo10779a(int i7) {
            return this.f9309c.get(i7);
        }
    }

    /* renamed from: Z2.v$c */
    public class c extends AbstractC3033v {

        /* renamed from: c */
        public final transient int f9310c;

        /* renamed from: d */
        public final transient int f9311d;

        public c(int i7, int i8) {
            this.f9310c = i7;
            this.f9311d = i8;
        }

        @Override // p178Z2.AbstractC3033v, java.util.List
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public AbstractC3033v subList(int i7, int i8) {
            AbstractC2932o.m10577t(i7, i8, this.f9311d);
            AbstractC3033v abstractC3033v = AbstractC3033v.this;
            int i9 = this.f9310c;
            return abstractC3033v.subList(i7 + i9, i8 + i9);
        }

        @Override // p178Z2.AbstractC3031t
        /* renamed from: e */
        public Object[] mo10853e() {
            return AbstractC3033v.this.mo10853e();
        }

        @Override // p178Z2.AbstractC3031t
        /* renamed from: f */
        public int mo10854f() {
            return AbstractC3033v.this.mo10855g() + this.f9310c + this.f9311d;
        }

        @Override // p178Z2.AbstractC3031t
        /* renamed from: g */
        public int mo10855g() {
            return AbstractC3033v.this.mo10855g() + this.f9310c;
        }

        @Override // java.util.List
        public Object get(int i7) {
            AbstractC2932o.m10570m(i7, this.f9311d);
            return AbstractC3033v.this.get(i7 + this.f9310c);
        }

        @Override // p178Z2.AbstractC3031t
        /* renamed from: h */
        public boolean mo10856h() {
            return true;
        }

        @Override // p178Z2.AbstractC3033v, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p178Z2.AbstractC3033v, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9311d;
        }

        @Override // p178Z2.AbstractC3033v, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
            return super.listIterator(i7);
        }
    }

    /* renamed from: A */
    public static AbstractC3033v m11041A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        AbstractC2932o.m10562e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return m11047o(objArr2);
    }

    /* renamed from: B */
    public static AbstractC3033v m11042B(Comparator comparator, Iterable iterable) {
        AbstractC2932o.m10572o(comparator);
        Object[] m10758k = AbstractC2987A.m10758k(iterable);
        AbstractC2998L.m10839b(m10758k);
        Arrays.sort(m10758k, comparator);
        return m11043k(m10758k);
    }

    /* renamed from: k */
    public static AbstractC3033v m11043k(Object[] objArr) {
        return m11044l(objArr, objArr.length);
    }

    /* renamed from: l */
    public static AbstractC3033v m11044l(Object[] objArr, int i7) {
        return i7 == 0 ? m11050t() : new C3001O(objArr, i7);
    }

    /* renamed from: m */
    public static a m11045m() {
        return new a();
    }

    /* renamed from: n */
    public static a m11046n(int i7) {
        AbstractC3020i.m10943b(i7, "expectedSize");
        return new a(i7);
    }

    /* renamed from: o */
    public static AbstractC3033v m11047o(Object... objArr) {
        return m11043k(AbstractC2998L.m10839b(objArr));
    }

    /* renamed from: p */
    public static AbstractC3033v m11048p(Collection collection) {
        if (!(collection instanceof AbstractC3031t)) {
            return m11047o(collection.toArray());
        }
        AbstractC3033v mo10871a = ((AbstractC3031t) collection).mo10871a();
        return mo10871a.mo10856h() ? m11043k(mo10871a.toArray()) : mo10871a;
    }

    /* renamed from: q */
    public static AbstractC3033v m11049q(Object[] objArr) {
        return objArr.length == 0 ? m11050t() : m11047o((Object[]) objArr.clone());
    }

    /* renamed from: t */
    public static AbstractC3033v m11050t() {
        return C3001O.f9183e;
    }

    /* renamed from: u */
    public static AbstractC3033v m11051u(Object obj) {
        return m11047o(obj);
    }

    /* renamed from: w */
    public static AbstractC3033v m11052w(Object obj, Object obj2) {
        return m11047o(obj, obj2);
    }

    /* renamed from: x */
    public static AbstractC3033v m11053x(Object obj, Object obj2, Object obj3) {
        return m11047o(obj, obj2, obj3);
    }

    /* renamed from: y */
    public static AbstractC3033v m11054y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m11047o(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: z */
    public static AbstractC3033v m11055z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m11047o(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // java.util.List
    /* renamed from: C */
    public AbstractC3033v subList(int i7, int i8) {
        AbstractC2932o.m10577t(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? m11050t() : m11057D(i7, i8);
    }

    /* renamed from: D */
    public AbstractC3033v m11057D(int i7, int i8) {
        return new c(i7, i8 - i7);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: b */
    public int mo10852b(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // p178Z2.AbstractC3031t, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return AbstractC2990D.m10783c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~((i7 * 31) + get(i8).hashCode()));
        }
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC3010Y iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC2990D.m10784d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC2990D.m10786f(this, obj);
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC3011Z listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC3011Z listIterator(int i7) {
        AbstractC2932o.m10575r(i7, size());
        return isEmpty() ? f9308b : new b(this, i7);
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: a */
    public final AbstractC3033v mo10871a() {
        return this;
    }
}
