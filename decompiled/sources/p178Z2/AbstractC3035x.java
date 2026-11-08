package p178Z2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p178Z2.AbstractC3031t;
import p256j$.util.Map;
import p256j$.util.Objects;

/* renamed from: Z2.x */
/* loaded from: classes.dex */
public abstract class AbstractC3035x implements Map, Serializable, p256j$.util.Map {

    /* renamed from: d */
    public static final Map.Entry[] f9313d = new Map.Entry[0];

    /* renamed from: a */
    public transient AbstractC3037z f9314a;

    /* renamed from: b */
    public transient AbstractC3037z f9315b;

    /* renamed from: c */
    public transient AbstractC3031t f9316c;

    /* renamed from: Z2.x$a */
    public static class a {

        /* renamed from: a */
        public Comparator f9317a;

        /* renamed from: b */
        public Object[] f9318b;

        /* renamed from: c */
        public int f9319c;

        /* renamed from: d */
        public boolean f9320d;

        /* renamed from: e */
        public C7196a f9321e;

        /* renamed from: Z2.x$a$a, reason: collision with other inner class name */
        public static final class C7196a {

            /* renamed from: a */
            public final Object f9322a;

            /* renamed from: b */
            public final Object f9323b;

            /* renamed from: c */
            public final Object f9324c;

            public C7196a(Object obj, Object obj2, Object obj3) {
                this.f9322a = obj;
                this.f9323b = obj2;
                this.f9324c = obj3;
            }

            /* renamed from: a */
            public IllegalArgumentException m11090a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f9322a + "=" + this.f9323b + " and " + this.f9322a + "=" + this.f9324c);
            }
        }

        public a() {
            this(4);
        }

        /* renamed from: j */
        public static void m11080j(Object[] objArr, int i7, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = i8 * 2;
                Object obj = objArr[i9];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i9 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i8] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i7, AbstractC2999M.m10842b(comparator).m10847f(AbstractC2992F.m10804l()));
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = i10 * 2;
                objArr[i11] = entryArr[i10].getKey();
                objArr[i11 + 1] = entryArr[i10].getValue();
            }
        }

        /* renamed from: a */
        public AbstractC3035x m11081a() {
            return m11083c();
        }

        /* renamed from: b */
        public final AbstractC3035x m11082b(boolean z6) {
            Object[] objArr;
            C7196a c7196a;
            C7196a c7196a2;
            if (z6 && (c7196a2 = this.f9321e) != null) {
                throw c7196a2.m11090a();
            }
            int i7 = this.f9319c;
            if (this.f9317a == null) {
                objArr = this.f9318b;
            } else {
                if (this.f9320d) {
                    this.f9318b = Arrays.copyOf(this.f9318b, i7 * 2);
                }
                objArr = this.f9318b;
                if (!z6) {
                    objArr = m11085e(objArr, this.f9319c);
                    if (objArr.length < this.f9318b.length) {
                        i7 = objArr.length >>> 1;
                    }
                }
                m11080j(objArr, i7, this.f9317a);
            }
            this.f9320d = true;
            C3002P m10858q = C3002P.m10858q(i7, objArr, this);
            if (!z6 || (c7196a = this.f9321e) == null) {
                return m10858q;
            }
            throw c7196a.m11090a();
        }

        /* renamed from: c */
        public AbstractC3035x m11083c() {
            return m11082b(true);
        }

        /* renamed from: d */
        public final void m11084d(int i7) {
            int i8 = i7 * 2;
            Object[] objArr = this.f9318b;
            if (i8 > objArr.length) {
                this.f9318b = Arrays.copyOf(objArr, AbstractC3031t.b.m11039c(objArr.length, i8));
                this.f9320d = false;
            }
        }

        /* renamed from: e */
        public final Object[] m11085e(Object[] objArr, int i7) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i8 = i7 - 1; i8 >= 0; i8--) {
                Object obj = objArr[i8 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i8);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i7 - bitSet.cardinality()) * 2];
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7 * 2) {
                if (bitSet.get(i9 >>> 1)) {
                    i9 += 2;
                } else {
                    int i11 = i10 + 1;
                    int i12 = i9 + 1;
                    Object obj2 = objArr[i9];
                    Objects.requireNonNull(obj2);
                    objArr2[i10] = obj2;
                    i10 += 2;
                    i9 += 2;
                    Object obj3 = objArr[i12];
                    Objects.requireNonNull(obj3);
                    objArr2[i11] = obj3;
                }
            }
            return objArr2;
        }

        /* renamed from: f */
        public a m11086f(Object obj, Object obj2) {
            m11084d(this.f9319c + 1);
            AbstractC3020i.m10942a(obj, obj2);
            Object[] objArr = this.f9318b;
            int i7 = this.f9319c;
            objArr[i7 * 2] = obj;
            objArr[(i7 * 2) + 1] = obj2;
            this.f9319c = i7 + 1;
            return this;
        }

        /* renamed from: g */
        public a m11087g(Map.Entry entry) {
            return m11086f(entry.getKey(), entry.getValue());
        }

        /* renamed from: h */
        public a m11088h(Iterable iterable) {
            if (iterable instanceof Collection) {
                m11084d(this.f9319c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m11087g((Map.Entry) it.next());
            }
            return this;
        }

        /* renamed from: i */
        public a m11089i(Map map) {
            return m11088h(map.entrySet());
        }

        public a(int i7) {
            this.f9318b = new Object[i7 * 2];
            this.f9319c = 0;
            this.f9320d = false;
        }
    }

    /* renamed from: a */
    public static a m11069a() {
        return new a();
    }

    /* renamed from: b */
    public static AbstractC3035x m11070b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.m11088h(iterable);
        return aVar.m11081a();
    }

    /* renamed from: c */
    public static AbstractC3035x m11071c(Map map) {
        if ((map instanceof AbstractC3035x) && !(map instanceof SortedMap)) {
            AbstractC3035x abstractC3035x = (AbstractC3035x) map;
            if (!abstractC3035x.mo10864h()) {
                return abstractC3035x;
            }
        }
        return m11070b(map.entrySet());
    }

    /* renamed from: j */
    public static AbstractC3035x m11072j() {
        return C3002P.f9186o;
    }

    /* renamed from: k */
    public static AbstractC3035x m11073k(Object obj, Object obj2) {
        AbstractC3020i.m10942a(obj, obj2);
        return C3002P.m10857p(1, new Object[]{obj, obj2});
    }

    /* renamed from: l */
    public static AbstractC3035x m11074l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        AbstractC3020i.m10942a(obj, obj2);
        AbstractC3020i.m10942a(obj3, obj4);
        AbstractC3020i.m10942a(obj5, obj6);
        AbstractC3020i.m10942a(obj7, obj8);
        return C3002P.m10857p(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    /* renamed from: m */
    public static AbstractC3035x m11075m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        AbstractC3020i.m10942a(obj, obj2);
        AbstractC3020i.m10942a(obj3, obj4);
        AbstractC3020i.m10942a(obj5, obj6);
        AbstractC3020i.m10942a(obj7, obj8);
        AbstractC3020i.m10942a(obj9, obj10);
        return C3002P.m10857p(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    /* renamed from: n */
    public static AbstractC3035x m11076n(Map.Entry... entryArr) {
        return m11070b(Arrays.asList(entryArr));
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    public abstract AbstractC3037z mo10861d();

    /* renamed from: e */
    public abstract AbstractC3037z mo10862e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return AbstractC2992F.m10795c(this, obj);
    }

    /* renamed from: f */
    public abstract AbstractC3031t mo10863f();

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC3037z entrySet() {
        AbstractC3037z abstractC3037z = this.f9314a;
        if (abstractC3037z != null) {
            return abstractC3037z;
        }
        AbstractC3037z mo10861d = mo10861d();
        this.f9314a = mo10861d;
        return mo10861d;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, p256j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: h */
    public abstract boolean mo10864h();

    @Override // java.util.Map
    public int hashCode() {
        return AbstractC3006U.m10877d(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC3037z keySet() {
        AbstractC3037z abstractC3037z = this.f9315b;
        if (abstractC3037z != null) {
            return abstractC3037z;
        }
        AbstractC3037z mo10862e = mo10862e();
        this.f9315b = mo10862e;
        return mo10862e;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC3031t values() {
        AbstractC3031t abstractC3031t = this.f9316c;
        if (abstractC3031t != null) {
            return abstractC3031t;
        }
        AbstractC3031t mo10863f = mo10863f();
        this.f9316c = mo10863f;
        return mo10863f;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public String toString() {
        return AbstractC2992F.m10803k(this);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p256j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
