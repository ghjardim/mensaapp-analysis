package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.V */
/* loaded from: classes.dex */
public final class C3275V extends AbstractC3284c implements RandomAccess {

    /* renamed from: d */
    public static final C3275V f10414d = new C3275V(new Object[0], 0, false);

    /* renamed from: b */
    public Object[] f10415b;

    /* renamed from: c */
    public int f10416c;

    public C3275V(Object[] objArr, int i7, boolean z6) {
        super(z6);
        this.f10415b = objArr;
        this.f10416c = i7;
    }

    /* renamed from: b */
    public static Object[] m12185b(int i7) {
        return new Object[i7];
    }

    /* renamed from: e */
    public static C3275V m12186e() {
        return f10414d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m12322a();
        int i7 = this.f10416c;
        Object[] objArr = this.f10415b;
        if (i7 == objArr.length) {
            this.f10415b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f10415b;
        int i8 = this.f10416c;
        this.f10416c = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: f */
    public final void m12188f(int i7) {
        if (i7 < 0 || i7 >= this.f10416c) {
            throw new IndexOutOfBoundsException(m12189g(i7));
        }
    }

    /* renamed from: g */
    public final String m12189g(int i7) {
        return "Index:" + i7 + ", Size:" + this.f10416c;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        m12188f(i7);
        return this.f10415b[i7];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3312u.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C3275V mo12187d(int i7) {
        if (i7 >= this.f10416c) {
            return new C3275V(Arrays.copyOf(this.f10415b, i7), this.f10416c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3284c, java.util.AbstractList, java.util.List
    public Object remove(int i7) {
        m12322a();
        m12188f(i7);
        Object[] objArr = this.f10415b;
        Object obj = objArr[i7];
        if (i7 < this.f10416c - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f10416c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        m12322a();
        m12188f(i7);
        Object[] objArr = this.f10415b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10416c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        int i8;
        m12322a();
        if (i7 >= 0 && i7 <= (i8 = this.f10416c)) {
            Object[] objArr = this.f10415b;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
            } else {
                Object[] m12185b = m12185b(((i8 * 3) / 2) + 1);
                System.arraycopy(this.f10415b, 0, m12185b, 0, i7);
                System.arraycopy(this.f10415b, i7, m12185b, i7 + 1, this.f10416c - i7);
                this.f10415b = m12185b;
            }
            this.f10415b[i7] = obj;
            this.f10416c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m12189g(i7));
    }
}
