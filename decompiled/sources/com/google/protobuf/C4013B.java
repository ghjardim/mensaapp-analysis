package com.google.protobuf;

import com.google.android.gms.common.api.C3643a;
import com.google.protobuf.AbstractC4015C;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.B */
/* loaded from: classes.dex */
public final class C4013B extends AbstractC4043c implements AbstractC4015C.d, RandomAccess, InterfaceC4052g0 {

    /* renamed from: d */
    public static final C4013B f13235d = new C4013B(new int[0], 0, false);

    /* renamed from: b */
    public int[] f13236b;

    /* renamed from: c */
    public int f13237c;

    public C4013B(int[] iArr, int i7, boolean z6) {
        super(z6);
        this.f13236b = iArr;
        this.f13237c = i7;
    }

    /* renamed from: h */
    public static C4013B m16164h() {
        return f13235d;
    }

    /* renamed from: i */
    private void m16165i(int i7) {
        if (i7 < 0 || i7 >= this.f13237c) {
            throw new IndexOutOfBoundsException(m16166m(i7));
        }
    }

    /* renamed from: m */
    private String m16166m(int i7) {
        return "Index:" + i7 + ", Size:" + this.f13237c;
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m16424a();
        AbstractC4015C.m16183a(collection);
        if (!(collection instanceof C4013B)) {
            return super.addAll(collection);
        }
        C4013B c4013b = (C4013B) collection;
        int i7 = c4013b.f13237c;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f13237c;
        if (C3643a.e.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f13236b;
        if (i9 > iArr.length) {
            this.f13236b = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(c4013b.f13236b, 0, this.f13236b, this.f13237c, c4013b.f13237c);
        this.f13237c = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i7, Integer num) {
        m16171g(i7, num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        m16170f(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4013B)) {
            return super.equals(obj);
        }
        C4013B c4013b = (C4013B) obj;
        if (this.f13237c != c4013b.f13237c) {
            return false;
        }
        int[] iArr = c4013b.f13236b;
        for (int i7 = 0; i7 < this.f13237c; i7++) {
            if (this.f13236b[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public void m16170f(int i7) {
        m16424a();
        int i8 = this.f13237c;
        int[] iArr = this.f13236b;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.f13236b = iArr2;
        }
        int[] iArr3 = this.f13236b;
        int i9 = this.f13237c;
        this.f13237c = i9 + 1;
        iArr3[i9] = i7;
    }

    /* renamed from: g */
    public final void m16171g(int i7, int i8) {
        int i9;
        m16424a();
        if (i7 < 0 || i7 > (i9 = this.f13237c)) {
            throw new IndexOutOfBoundsException(m16166m(i7));
        }
        int[] iArr = this.f13236b;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i9 - i7);
        } else {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.f13236b, i7, iArr2, i7 + 1, this.f13237c - i7);
            this.f13236b = iArr2;
        }
        this.f13236b[i7] = i8;
        this.f13237c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f13237c; i8++) {
            i7 = (i7 * 31) + this.f13236b[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f13236b[i7] == intValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer get(int i7) {
        return Integer.valueOf(m16173l(i7));
    }

    /* renamed from: l */
    public int m16173l(int i7) {
        m16165i(i7);
        return this.f13236b[i7];
    }

    @Override // com.google.protobuf.AbstractC4015C.e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC4015C.d mo16168d(int i7) {
        if (i7 >= this.f13237c) {
            return new C4013B(Arrays.copyOf(this.f13236b, i7), this.f13237c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC4043c, java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i7) {
        m16424a();
        m16165i(i7);
        int[] iArr = this.f13236b;
        int i8 = iArr[i7];
        if (i7 < this.f13237c - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.f13237c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer set(int i7, Integer num) {
        return Integer.valueOf(m16177q(i7, num.intValue()));
    }

    /* renamed from: q */
    public int m16177q(int i7, int i8) {
        m16424a();
        m16165i(i7);
        int[] iArr = this.f13236b;
        int i9 = iArr[i7];
        iArr[i7] = i8;
        return i9;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i7, int i8) {
        m16424a();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f13236b;
        System.arraycopy(iArr, i8, iArr, i7, this.f13237c - i8);
        this.f13237c -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13237c;
    }
}
