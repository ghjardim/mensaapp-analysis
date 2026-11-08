package p376x3;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p376x3.AbstractC6948c;

/* renamed from: x3.a */
/* loaded from: classes.dex */
public class C6946a extends AbstractC6948c {

    /* renamed from: a */
    public final Object[] f24852a;

    /* renamed from: b */
    public final Object[] f24853b;

    /* renamed from: c */
    public final Comparator f24854c;

    /* renamed from: x3.a$a */
    public class a implements Iterator {

        /* renamed from: a */
        public int f24855a;

        /* renamed from: b */
        public final /* synthetic */ int f24856b;

        /* renamed from: c */
        public final /* synthetic */ boolean f24857c;

        public a(int i7, boolean z6) {
            this.f24856b = i7;
            this.f24857c = z6;
            this.f24855a = i7;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object obj = C6946a.this.f24852a[this.f24855a];
            Object[] objArr = C6946a.this.f24853b;
            int i7 = this.f24855a;
            Object obj2 = objArr[i7];
            this.f24855a = this.f24857c ? i7 - 1 : i7 + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24857c) {
                if (this.f24855a < 0) {
                    return false;
                }
            } else if (this.f24855a >= C6946a.this.f24852a.length) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public C6946a(Comparator comparator) {
        this.f24852a = new Object[0];
        this.f24853b = new Object[0];
        this.f24854c = comparator;
    }

    /* renamed from: n */
    public static Object[] m28446n(Object[] objArr, int i7, Object obj) {
        Object[] objArr2 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr2, 0, i7);
        objArr2[i7] = obj;
        System.arraycopy(objArr, i7, objArr2, i7 + 1, (r0 - i7) - 1);
        return objArr2;
    }

    /* renamed from: o */
    public static C6946a m28447o(List list, Map map, AbstractC6948c.a.InterfaceC7243a interfaceC7243a, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i7 = 0;
        for (Object obj : list) {
            objArr[i7] = obj;
            objArr2[i7] = map.get(interfaceC7243a.mo28462a(obj));
            i7++;
        }
        return new C6946a(comparator, objArr, objArr2);
    }

    /* renamed from: s */
    public static Object[] m28448s(Object[] objArr, int i7) {
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, i7);
        System.arraycopy(objArr, i7 + 1, objArr2, i7, length - i7);
        return objArr2;
    }

    /* renamed from: t */
    public static Object[] m28449t(Object[] objArr, int i7, Object obj) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        objArr2[i7] = obj;
        return objArr2;
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: a */
    public boolean mo28450a(Object obj) {
        return m28458p(obj) != -1;
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: b */
    public Object mo28451b(Object obj) {
        int m28458p = m28458p(obj);
        if (m28458p != -1) {
            return this.f24853b[m28458p];
        }
        return null;
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: e */
    public Comparator mo28452e() {
        return this.f24854c;
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: f */
    public Object mo28453f() {
        Object[] objArr = this.f24852a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: g */
    public Object mo28454g() {
        Object[] objArr = this.f24852a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: h */
    public AbstractC6948c mo28455h(Object obj, Object obj2) {
        int m28458p = m28458p(obj);
        if (m28458p != -1) {
            Object[] objArr = this.f24852a;
            if (objArr[m28458p] == obj && this.f24853b[m28458p] == obj2) {
                return this;
            }
            return new C6946a(this.f24854c, m28449t(objArr, m28458p, obj), m28449t(this.f24853b, m28458p, obj2));
        }
        if (this.f24852a.length <= 25) {
            int m28459q = m28459q(obj);
            return new C6946a(this.f24854c, m28446n(this.f24852a, m28459q, obj), m28446n(this.f24853b, m28459q, obj2));
        }
        HashMap hashMap = new HashMap(this.f24852a.length + 1);
        int i7 = 0;
        while (true) {
            Object[] objArr2 = this.f24852a;
            if (i7 >= objArr2.length) {
                hashMap.put(obj, obj2);
                return C6956k.m28497m(hashMap, this.f24854c);
            }
            hashMap.put(objArr2[i7], this.f24853b[i7]);
            i7++;
        }
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: i */
    public Iterator mo28456i(Object obj) {
        return m28460r(m28459q(obj), false);
    }

    @Override // p376x3.AbstractC6948c
    public int indexOf(Object obj) {
        return m28458p(obj);
    }

    @Override // p376x3.AbstractC6948c
    public boolean isEmpty() {
        return this.f24852a.length == 0;
    }

    @Override // p376x3.AbstractC6948c, java.lang.Iterable
    public Iterator iterator() {
        return m28460r(0, false);
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: k */
    public AbstractC6948c mo28457k(Object obj) {
        int m28458p = m28458p(obj);
        if (m28458p == -1) {
            return this;
        }
        return new C6946a(this.f24854c, m28448s(this.f24852a, m28458p), m28448s(this.f24853b, m28458p));
    }

    /* renamed from: p */
    public final int m28458p(Object obj) {
        int i7 = 0;
        for (Object obj2 : this.f24852a) {
            if (this.f24854c.compare(obj, obj2) == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* renamed from: q */
    public final int m28459q(Object obj) {
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f24852a;
            if (i7 >= objArr.length || this.f24854c.compare(objArr[i7], obj) >= 0) {
                break;
            }
            i7++;
        }
        return i7;
    }

    /* renamed from: r */
    public final Iterator m28460r(int i7, boolean z6) {
        return new a(i7, z6);
    }

    @Override // p376x3.AbstractC6948c
    public int size() {
        return this.f24852a.length;
    }

    public C6946a(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f24852a = objArr;
        this.f24853b = objArr2;
        this.f24854c = comparator;
    }
}
