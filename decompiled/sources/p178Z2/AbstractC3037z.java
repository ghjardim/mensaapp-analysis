package p178Z2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import p171Y2.AbstractC2932o;
import p178Z2.AbstractC3031t;
import p256j$.util.Objects;

/* renamed from: Z2.z */
/* loaded from: classes.dex */
public abstract class AbstractC3037z extends AbstractC3031t implements Set {

    /* renamed from: b */
    public transient AbstractC3033v f9339b;

    /* renamed from: Z2.z$a */
    public static class a extends AbstractC3031t.a {

        /* renamed from: d */
        public Object[] f9340d;

        /* renamed from: e */
        public int f9341e;

        public a() {
            super(4);
        }

        @Override // p178Z2.AbstractC3031t.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a mo11040a(Object obj) {
            AbstractC2932o.m10572o(obj);
            if (this.f9340d != null && AbstractC3037z.m11104m(this.f9304b) <= this.f9340d.length) {
                m11118k(obj);
                return this;
            }
            this.f9340d = null;
            super.m11035d(obj);
            return this;
        }

        /* renamed from: i */
        public a m11116i(Object... objArr) {
            if (this.f9340d != null) {
                for (Object obj : objArr) {
                    mo11040a(obj);
                }
            } else {
                super.m11036e(objArr);
            }
            return this;
        }

        /* renamed from: j */
        public a m11117j(Iterable iterable) {
            AbstractC2932o.m10572o(iterable);
            if (this.f9340d != null) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    mo11040a(it.next());
                }
            } else {
                super.mo11034b(iterable);
            }
            return this;
        }

        /* renamed from: k */
        public final void m11118k(Object obj) {
            Objects.requireNonNull(this.f9340d);
            int length = this.f9340d.length - 1;
            int hashCode = obj.hashCode();
            int m11032b = AbstractC3030s.m11032b(hashCode);
            while (true) {
                int i7 = m11032b & length;
                Object[] objArr = this.f9340d;
                Object obj2 = objArr[i7];
                if (obj2 == null) {
                    objArr[i7] = obj;
                    this.f9341e += hashCode;
                    super.m11035d(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    m11032b = i7 + 1;
                }
            }
        }

        /* renamed from: l */
        public AbstractC3037z m11119l() {
            AbstractC3037z m11105n;
            int i7 = this.f9304b;
            if (i7 == 0) {
                return AbstractC3037z.m11108s();
            }
            if (i7 == 1) {
                Object obj = this.f9303a[0];
                Objects.requireNonNull(obj);
                return AbstractC3037z.m11109t(obj);
            }
            if (this.f9340d == null || AbstractC3037z.m11104m(i7) != this.f9340d.length) {
                m11105n = AbstractC3037z.m11105n(this.f9304b, this.f9303a);
                this.f9304b = m11105n.size();
            } else {
                Object[] copyOf = AbstractC3037z.m11114z(this.f9304b, this.f9303a.length) ? Arrays.copyOf(this.f9303a, this.f9304b) : this.f9303a;
                m11105n = new C3003Q(copyOf, this.f9341e, this.f9340d, r5.length - 1, this.f9304b);
            }
            this.f9305c = true;
            this.f9340d = null;
            return m11105n;
        }
    }

    /* renamed from: m */
    public static int m11104m(int i7) {
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            AbstractC2932o.m10562e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    /* renamed from: n */
    public static AbstractC3037z m11105n(int i7, Object... objArr) {
        if (i7 == 0) {
            return m11108s();
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return m11109t(obj);
        }
        int m11104m = m11104m(i7);
        Object[] objArr2 = new Object[m11104m];
        int i8 = m11104m - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object m10838a = AbstractC2998L.m10838a(objArr[i11], i11);
            int hashCode = m10838a.hashCode();
            int m11032b = AbstractC3030s.m11032b(hashCode);
            while (true) {
                int i12 = m11032b & i8;
                Object obj2 = objArr2[i12];
                if (obj2 == null) {
                    objArr[i10] = m10838a;
                    objArr2[i12] = m10838a;
                    i9 += hashCode;
                    i10++;
                    break;
                }
                if (obj2.equals(m10838a)) {
                    break;
                }
                m11032b++;
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new C3007V(obj3);
        }
        if (m11104m(i10) < m11104m / 2) {
            return m11105n(i10, objArr);
        }
        if (m11114z(i10, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new C3003Q(objArr, i9, objArr2, i8, i10);
    }

    /* renamed from: o */
    public static AbstractC3037z m11106o(Collection collection) {
        if ((collection instanceof AbstractC3037z) && !(collection instanceof SortedSet)) {
            AbstractC3037z abstractC3037z = (AbstractC3037z) collection;
            if (!abstractC3037z.mo10856h()) {
                return abstractC3037z;
            }
        }
        Object[] array = collection.toArray();
        return m11105n(array.length, array);
    }

    /* renamed from: p */
    public static AbstractC3037z m11107p(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? m11105n(objArr.length, (Object[]) objArr.clone()) : m11109t(objArr[0]) : m11108s();
    }

    /* renamed from: s */
    public static AbstractC3037z m11108s() {
        return C3003Q.f9201p;
    }

    /* renamed from: t */
    public static AbstractC3037z m11109t(Object obj) {
        return new C3007V(obj);
    }

    /* renamed from: u */
    public static AbstractC3037z m11110u(Object obj, Object obj2) {
        return m11105n(2, obj, obj2);
    }

    /* renamed from: w */
    public static AbstractC3037z m11111w(Object obj, Object obj2, Object obj3) {
        return m11105n(3, obj, obj2, obj3);
    }

    /* renamed from: x */
    public static AbstractC3037z m11112x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m11105n(5, obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: y */
    public static AbstractC3037z m11113y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        AbstractC2932o.m10562e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m11105n(length, objArr2);
    }

    /* renamed from: z */
    public static boolean m11114z(int i7, int i8) {
        return i7 < (i8 >> 1) + (i8 >> 2);
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: a */
    public AbstractC3033v mo10871a() {
        AbstractC3033v abstractC3033v = this.f9339b;
        if (abstractC3033v != null) {
            return abstractC3033v;
        }
        AbstractC3033v mo10869q = mo10869q();
        this.f9339b = mo10869q;
        return mo10869q;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC3037z) && mo10872r() && ((AbstractC3037z) obj).mo10872r() && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC3006U.m10874a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC3006U.m10877d(this);
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: i */
    public abstract AbstractC3010Y iterator();

    /* renamed from: q */
    public AbstractC3033v mo10869q() {
        return AbstractC3033v.m11043k(toArray());
    }

    /* renamed from: r */
    public boolean mo10872r() {
        return false;
    }
}
