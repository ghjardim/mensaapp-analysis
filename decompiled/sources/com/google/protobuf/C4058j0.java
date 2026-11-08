package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.j0 */
/* loaded from: classes.dex */
public final class C4058j0 extends AbstractC4043c implements RandomAccess {

    /* renamed from: d */
    public static final C4058j0 f13440d = new C4058j0(new Object[0], 0, false);

    /* renamed from: b */
    public Object[] f13441b;

    /* renamed from: c */
    public int f13442c;

    public C4058j0(Object[] objArr, int i7, boolean z6) {
        super(z6);
        this.f13441b = objArr;
        this.f13442c = i7;
    }

    /* renamed from: b */
    public static Object[] m16623b(int i7) {
        return new Object[i7];
    }

    /* renamed from: e */
    public static C4058j0 m16624e() {
        return f13440d;
    }

    /* renamed from: f */
    private void m16625f(int i7) {
        if (i7 < 0 || i7 >= this.f13442c) {
            throw new IndexOutOfBoundsException(m16626g(i7));
        }
    }

    /* renamed from: g */
    private String m16626g(int i7) {
        return "Index:" + i7 + ", Size:" + this.f13442c;
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m16424a();
        int i7 = this.f13442c;
        Object[] objArr = this.f13441b;
        if (i7 == objArr.length) {
            this.f13441b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f13441b;
        int i8 = this.f13442c;
        this.f13442c = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        m16625f(i7);
        return this.f13441b[i7];
    }

    @Override // com.google.protobuf.AbstractC4015C.e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C4058j0 mo16168d(int i7) {
        if (i7 >= this.f13442c) {
            return new C4058j0(Arrays.copyOf(this.f13441b, i7), this.f13442c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractList, java.util.List
    public Object remove(int i7) {
        m16424a();
        m16625f(i7);
        Object[] objArr = this.f13441b;
        Object obj = objArr[i7];
        if (i7 < this.f13442c - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f13442c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        m16424a();
        m16625f(i7);
        Object[] objArr = this.f13441b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13442c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        int i8;
        m16424a();
        if (i7 >= 0 && i7 <= (i8 = this.f13442c)) {
            Object[] objArr = this.f13441b;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
            } else {
                Object[] m16623b = m16623b(((i8 * 3) / 2) + 1);
                System.arraycopy(this.f13441b, 0, m16623b, 0, i7);
                System.arraycopy(this.f13441b, i7, m16623b, i7 + 1, this.f13442c - i7);
                this.f13441b = m16623b;
            }
            this.f13441b[i7] = obj;
            this.f13442c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m16626g(i7));
    }
}
