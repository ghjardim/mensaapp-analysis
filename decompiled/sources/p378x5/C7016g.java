package p378x5;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p104O5.AbstractC1421h;

/* renamed from: x5.g */
/* loaded from: classes2.dex */
public final class C7016g extends AbstractC7014e {

    /* renamed from: d */
    public static final a f25079d = new a(null);

    /* renamed from: e */
    public static final Object[] f25080e = new Object[0];

    /* renamed from: a */
    public int f25081a;

    /* renamed from: b */
    public Object[] f25082b = f25080e;

    /* renamed from: c */
    public int f25083c;

    /* renamed from: x5.g$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: h */
    private final void m28779h(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f25082b;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f25080e) {
            this.f25082b = new Object[AbstractC1421h.m5528a(i7, 10)];
        } else {
            m28781f(AbstractC7013d.f25070a.m28771e(objArr.length, i7));
        }
    }

    @Override // p378x5.AbstractC7014e
    /* renamed from: a */
    public int mo28776a() {
        return this.f25083c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC5469l.m23028e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m28787n();
        m28779h(size() + elements.size());
        m28780e(m28786m(this.f25081a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        m28787n();
        m28779h(size() + 1);
        int m28782g = m28782g(this.f25081a);
        this.f25081a = m28782g;
        this.f25082b[m28782g] = obj;
        this.f25083c = size() + 1;
    }

    public final void addLast(Object obj) {
        m28787n();
        m28779h(size() + 1);
        this.f25082b[m28786m(this.f25081a + size())] = obj;
        this.f25083c = size() + 1;
    }

    @Override // p378x5.AbstractC7014e
    /* renamed from: b */
    public Object mo28777b(int i7) {
        AbstractC7013d.f25070a.m28768b(i7, size());
        if (i7 == AbstractC7024o.m28863i(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        m28787n();
        int m28786m = m28786m(this.f25081a + i7);
        Object obj = this.f25082b[m28786m];
        if (i7 < (size() >> 1)) {
            int i8 = this.f25081a;
            if (m28786m >= i8) {
                Object[] objArr = this.f25082b;
                AbstractC7019j.m28797g(objArr, objArr, i8 + 1, i8, m28786m);
            } else {
                Object[] objArr2 = this.f25082b;
                AbstractC7019j.m28797g(objArr2, objArr2, 1, 0, m28786m);
                Object[] objArr3 = this.f25082b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i9 = this.f25081a;
                AbstractC7019j.m28797g(objArr3, objArr3, i9 + 1, i9, objArr3.length - 1);
            }
            Object[] objArr4 = this.f25082b;
            int i10 = this.f25081a;
            objArr4[i10] = null;
            this.f25081a = m28783i(i10);
        } else {
            int m28786m2 = m28786m(this.f25081a + AbstractC7024o.m28863i(this));
            if (m28786m <= m28786m2) {
                Object[] objArr5 = this.f25082b;
                AbstractC7019j.m28797g(objArr5, objArr5, m28786m, m28786m + 1, m28786m2 + 1);
            } else {
                Object[] objArr6 = this.f25082b;
                AbstractC7019j.m28797g(objArr6, objArr6, m28786m, m28786m + 1, objArr6.length);
                Object[] objArr7 = this.f25082b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC7019j.m28797g(objArr7, objArr7, 0, 1, m28786m2 + 1);
            }
            this.f25082b[m28786m2] = null;
        }
        this.f25083c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            m28787n();
            m28785l(this.f25081a, m28786m(this.f25081a + size()));
        }
        this.f25081a = 0;
        this.f25083c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m28780e(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f25082b.length;
        while (i7 < length && it.hasNext()) {
            this.f25082b[i7] = it.next();
            i7++;
        }
        int i8 = this.f25081a;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f25082b[i9] = it.next();
        }
        this.f25083c = size() + collection.size();
    }

    /* renamed from: f */
    public final void m28781f(int i7) {
        Object[] objArr = new Object[i7];
        Object[] objArr2 = this.f25082b;
        AbstractC7019j.m28797g(objArr2, objArr, 0, this.f25081a, objArr2.length);
        Object[] objArr3 = this.f25082b;
        int length = objArr3.length;
        int i8 = this.f25081a;
        AbstractC7019j.m28797g(objArr3, objArr, length - i8, 0, i8);
        this.f25081a = 0;
        this.f25082b = objArr;
    }

    /* renamed from: g */
    public final int m28782g(int i7) {
        return i7 == 0 ? AbstractC7020k.m28848u(this.f25082b) : i7 - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        AbstractC7013d.f25070a.m28768b(i7, size());
        return this.f25082b[m28786m(this.f25081a + i7)];
    }

    /* renamed from: i */
    public final int m28783i(int i7) {
        if (i7 == AbstractC7020k.m28848u(this.f25082b)) {
            return 0;
        }
        return i7 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i7;
        int m28786m = m28786m(this.f25081a + size());
        int i8 = this.f25081a;
        if (i8 < m28786m) {
            while (i8 < m28786m) {
                if (AbstractC5469l.m23024a(obj, this.f25082b[i8])) {
                    i7 = this.f25081a;
                } else {
                    i8++;
                }
            }
            return -1;
        }
        if (i8 < m28786m) {
            return -1;
        }
        int length = this.f25082b.length;
        while (true) {
            if (i8 >= length) {
                for (int i9 = 0; i9 < m28786m; i9++) {
                    if (AbstractC5469l.m23024a(obj, this.f25082b[i9])) {
                        i8 = i9 + this.f25082b.length;
                        i7 = this.f25081a;
                    }
                }
                return -1;
            }
            if (AbstractC5469l.m23024a(obj, this.f25082b[i8])) {
                i7 = this.f25081a;
                break;
            }
            i8++;
        }
        return i8 - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public final int m28784k(int i7) {
        return i7 < 0 ? i7 + this.f25082b.length : i7;
    }

    /* renamed from: l */
    public final void m28785l(int i7, int i8) {
        if (i7 < i8) {
            AbstractC7019j.m28803m(this.f25082b, null, i7, i8);
            return;
        }
        Object[] objArr = this.f25082b;
        AbstractC7019j.m28803m(objArr, null, i7, objArr.length);
        AbstractC7019j.m28803m(this.f25082b, null, 0, i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int m28848u;
        int i7;
        int m28786m = m28786m(this.f25081a + size());
        int i8 = this.f25081a;
        if (i8 < m28786m) {
            m28848u = m28786m - 1;
            if (i8 <= m28848u) {
                while (!AbstractC5469l.m23024a(obj, this.f25082b[m28848u])) {
                    if (m28848u != i8) {
                        m28848u--;
                    }
                }
                i7 = this.f25081a;
                return m28848u - i7;
            }
            return -1;
        }
        if (i8 > m28786m) {
            int i9 = m28786m - 1;
            while (true) {
                if (-1 >= i9) {
                    m28848u = AbstractC7020k.m28848u(this.f25082b);
                    int i10 = this.f25081a;
                    if (i10 <= m28848u) {
                        while (!AbstractC5469l.m23024a(obj, this.f25082b[m28848u])) {
                            if (m28848u != i10) {
                                m28848u--;
                            }
                        }
                        i7 = this.f25081a;
                    }
                } else {
                    if (AbstractC5469l.m23024a(obj, this.f25082b[i9])) {
                        m28848u = i9 + this.f25082b.length;
                        i7 = this.f25081a;
                        break;
                    }
                    i9--;
                }
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final int m28786m(int i7) {
        Object[] objArr = this.f25082b;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    /* renamed from: n */
    public final void m28787n() {
        ((AbstractList) this).modCount++;
    }

    /* renamed from: o */
    public final Object m28788o() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    /* renamed from: p */
    public final void m28789p(int i7, int i8) {
        int m28786m = m28786m(this.f25081a + (i7 - 1));
        int m28786m2 = m28786m(this.f25081a + (i8 - 1));
        while (i7 > 0) {
            int i9 = m28786m + 1;
            int min = Math.min(i7, Math.min(i9, m28786m2 + 1));
            Object[] objArr = this.f25082b;
            int i10 = m28786m2 - min;
            int i11 = m28786m - min;
            AbstractC7019j.m28797g(objArr, objArr, i10 + 1, i11 + 1, i9);
            m28786m = m28784k(i11);
            m28786m2 = m28784k(i10);
            i7 -= min;
        }
    }

    /* renamed from: q */
    public final void m28790q(int i7, int i8) {
        int m28786m = m28786m(this.f25081a + i8);
        int m28786m2 = m28786m(this.f25081a + i7);
        int size = size();
        while (true) {
            size -= i8;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f25082b;
            i8 = Math.min(size, Math.min(objArr.length - m28786m, objArr.length - m28786m2));
            Object[] objArr2 = this.f25082b;
            int i9 = m28786m + i8;
            AbstractC7019j.m28797g(objArr2, objArr2, m28786m2, m28786m, i9);
            m28786m = m28786m(i9);
            m28786m2 = m28786m(m28786m2 + i8);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int m28786m;
        AbstractC5469l.m23028e(elements, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f25082b.length != 0) {
            int m28786m2 = m28786m(this.f25081a + size());
            int i7 = this.f25081a;
            if (i7 < m28786m2) {
                m28786m = i7;
                while (i7 < m28786m2) {
                    Object obj = this.f25082b[i7];
                    if (elements.contains(obj)) {
                        z6 = true;
                    } else {
                        this.f25082b[m28786m] = obj;
                        m28786m++;
                    }
                    i7++;
                }
                AbstractC7019j.m28803m(this.f25082b, null, m28786m, m28786m2);
            } else {
                int length = this.f25082b.length;
                boolean z7 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f25082b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        z7 = true;
                    } else {
                        this.f25082b[i8] = obj2;
                        i8++;
                    }
                    i7++;
                }
                m28786m = m28786m(i8);
                for (int i9 = 0; i9 < m28786m2; i9++) {
                    Object[] objArr2 = this.f25082b;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (elements.contains(obj3)) {
                        z7 = true;
                    } else {
                        this.f25082b[m28786m] = obj3;
                        m28786m = m28783i(m28786m);
                    }
                }
                z6 = z7;
            }
            if (z6) {
                m28787n();
                this.f25083c = m28784k(m28786m - this.f25081a);
            }
        }
        return z6;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m28787n();
        Object[] objArr = this.f25082b;
        int i7 = this.f25081a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f25081a = m28783i(i7);
        this.f25083c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m28787n();
        int m28786m = m28786m(this.f25081a + AbstractC7024o.m28863i(this));
        Object[] objArr = this.f25082b;
        Object obj = objArr[m28786m];
        objArr[m28786m] = null;
        this.f25083c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i7, int i8) {
        AbstractC7013d.f25070a.m28770d(i7, i8, size());
        int i9 = i8 - i7;
        if (i9 == 0) {
            return;
        }
        if (i9 == size()) {
            clear();
            return;
        }
        if (i9 == 1) {
            remove(i7);
            return;
        }
        m28787n();
        if (i7 < size() - i8) {
            m28789p(i7, i8);
            int m28786m = m28786m(this.f25081a + i9);
            m28785l(this.f25081a, m28786m);
            this.f25081a = m28786m;
        } else {
            m28790q(i7, i8);
            int m28786m2 = m28786m(this.f25081a + size());
            m28785l(m28784k(m28786m2 - i9), m28786m2);
        }
        this.f25083c = size() - i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int m28786m;
        AbstractC5469l.m23028e(elements, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f25082b.length != 0) {
            int m28786m2 = m28786m(this.f25081a + size());
            int i7 = this.f25081a;
            if (i7 < m28786m2) {
                m28786m = i7;
                while (i7 < m28786m2) {
                    Object obj = this.f25082b[i7];
                    if (elements.contains(obj)) {
                        this.f25082b[m28786m] = obj;
                        m28786m++;
                    } else {
                        z6 = true;
                    }
                    i7++;
                }
                AbstractC7019j.m28803m(this.f25082b, null, m28786m, m28786m2);
            } else {
                int length = this.f25082b.length;
                boolean z7 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f25082b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        this.f25082b[i8] = obj2;
                        i8++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                m28786m = m28786m(i8);
                for (int i9 = 0; i9 < m28786m2; i9++) {
                    Object[] objArr2 = this.f25082b;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (elements.contains(obj3)) {
                        this.f25082b[m28786m] = obj3;
                        m28786m = m28783i(m28786m);
                    } else {
                        z7 = true;
                    }
                }
                z6 = z7;
            }
            if (z6) {
                m28787n();
                this.f25083c = m28784k(m28786m - this.f25081a);
            }
        }
        return z6;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        AbstractC7013d.f25070a.m28768b(i7, size());
        int m28786m = m28786m(this.f25081a + i7);
        Object[] objArr = this.f25082b;
        Object obj2 = objArr[m28786m];
        objArr[m28786m] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC5469l.m23028e(array, "array");
        if (array.length < size()) {
            array = AbstractC7017h.m28791a(array, size());
        }
        int m28786m = m28786m(this.f25081a + size());
        int i7 = this.f25081a;
        if (i7 < m28786m) {
            AbstractC7019j.m28800j(this.f25082b, array, 0, i7, m28786m, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f25082b;
            AbstractC7019j.m28797g(objArr, array, 0, this.f25081a, objArr.length);
            Object[] objArr2 = this.f25082b;
            AbstractC7019j.m28797g(objArr2, array, objArr2.length - this.f25081a, 0, m28786m);
        }
        return AbstractC7023n.m28858d(size(), array);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        AbstractC7013d.f25070a.m28769c(i7, size());
        if (i7 == size()) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        m28787n();
        m28779h(size() + 1);
        int m28786m = m28786m(this.f25081a + i7);
        if (i7 < ((size() + 1) >> 1)) {
            int m28782g = m28782g(m28786m);
            int m28782g2 = m28782g(this.f25081a);
            int i8 = this.f25081a;
            if (m28782g >= i8) {
                Object[] objArr = this.f25082b;
                objArr[m28782g2] = objArr[i8];
                AbstractC7019j.m28797g(objArr, objArr, i8, i8 + 1, m28782g + 1);
            } else {
                Object[] objArr2 = this.f25082b;
                AbstractC7019j.m28797g(objArr2, objArr2, i8 - 1, i8, objArr2.length);
                Object[] objArr3 = this.f25082b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC7019j.m28797g(objArr3, objArr3, 0, 1, m28782g + 1);
            }
            this.f25082b[m28782g] = obj;
            this.f25081a = m28782g2;
        } else {
            int m28786m2 = m28786m(this.f25081a + size());
            if (m28786m < m28786m2) {
                Object[] objArr4 = this.f25082b;
                AbstractC7019j.m28797g(objArr4, objArr4, m28786m + 1, m28786m, m28786m2);
            } else {
                Object[] objArr5 = this.f25082b;
                AbstractC7019j.m28797g(objArr5, objArr5, 1, 0, m28786m2);
                Object[] objArr6 = this.f25082b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC7019j.m28797g(objArr6, objArr6, m28786m + 1, m28786m, objArr6.length - 1);
            }
            this.f25082b[m28786m] = obj;
        }
        this.f25083c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection elements) {
        AbstractC5469l.m23028e(elements, "elements");
        AbstractC7013d.f25070a.m28769c(i7, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i7 == size()) {
            return addAll(elements);
        }
        m28787n();
        m28779h(size() + elements.size());
        int m28786m = m28786m(this.f25081a + size());
        int m28786m2 = m28786m(this.f25081a + i7);
        int size = elements.size();
        if (i7 < ((size() + 1) >> 1)) {
            int i8 = this.f25081a;
            int i9 = i8 - size;
            if (m28786m2 < i8) {
                Object[] objArr = this.f25082b;
                AbstractC7019j.m28797g(objArr, objArr, i9, i8, objArr.length);
                if (size >= m28786m2) {
                    Object[] objArr2 = this.f25082b;
                    AbstractC7019j.m28797g(objArr2, objArr2, objArr2.length - size, 0, m28786m2);
                } else {
                    Object[] objArr3 = this.f25082b;
                    AbstractC7019j.m28797g(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f25082b;
                    AbstractC7019j.m28797g(objArr4, objArr4, 0, size, m28786m2);
                }
            } else if (i9 >= 0) {
                Object[] objArr5 = this.f25082b;
                AbstractC7019j.m28797g(objArr5, objArr5, i9, i8, m28786m2);
            } else {
                Object[] objArr6 = this.f25082b;
                i9 += objArr6.length;
                int i10 = m28786m2 - i8;
                int length = objArr6.length - i9;
                if (length >= i10) {
                    AbstractC7019j.m28797g(objArr6, objArr6, i9, i8, m28786m2);
                } else {
                    AbstractC7019j.m28797g(objArr6, objArr6, i9, i8, i8 + length);
                    Object[] objArr7 = this.f25082b;
                    AbstractC7019j.m28797g(objArr7, objArr7, 0, this.f25081a + length, m28786m2);
                }
            }
            this.f25081a = i9;
            m28780e(m28784k(m28786m2 - size), elements);
        } else {
            int i11 = m28786m2 + size;
            if (m28786m2 < m28786m) {
                int i12 = size + m28786m;
                Object[] objArr8 = this.f25082b;
                if (i12 <= objArr8.length) {
                    AbstractC7019j.m28797g(objArr8, objArr8, i11, m28786m2, m28786m);
                } else if (i11 >= objArr8.length) {
                    AbstractC7019j.m28797g(objArr8, objArr8, i11 - objArr8.length, m28786m2, m28786m);
                } else {
                    int length2 = m28786m - (i12 - objArr8.length);
                    AbstractC7019j.m28797g(objArr8, objArr8, 0, length2, m28786m);
                    Object[] objArr9 = this.f25082b;
                    AbstractC7019j.m28797g(objArr9, objArr9, i11, m28786m2, length2);
                }
            } else {
                Object[] objArr10 = this.f25082b;
                AbstractC7019j.m28797g(objArr10, objArr10, size, 0, m28786m);
                Object[] objArr11 = this.f25082b;
                if (i11 >= objArr11.length) {
                    AbstractC7019j.m28797g(objArr11, objArr11, i11 - objArr11.length, m28786m2, objArr11.length);
                } else {
                    AbstractC7019j.m28797g(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f25082b;
                    AbstractC7019j.m28797g(objArr12, objArr12, i11, m28786m2, objArr12.length - size);
                }
            }
            m28780e(m28786m2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
