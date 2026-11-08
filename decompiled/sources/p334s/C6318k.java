package p334s;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p342t.AbstractC6404a;
import p378x5.AbstractC7019j;

/* renamed from: s.k */
/* loaded from: classes.dex */
public class C6318k {

    /* renamed from: a */
    public int[] f22878a;

    /* renamed from: b */
    public Object[] f22879b;

    /* renamed from: c */
    public int f22880c;

    public C6318k() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public final int m26450a(Object obj) {
        int i7 = this.f22880c * 2;
        Object[] objArr = this.f22879b;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (AbstractC5469l.m23024a(obj, objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void m26451b(int i7) {
        int i8 = this.f22880c;
        int[] iArr = this.f22878a;
        if (iArr.length < i7) {
            int[] copyOf = Arrays.copyOf(iArr, i7);
            AbstractC5469l.m23027d(copyOf, "copyOf(this, newSize)");
            this.f22878a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22879b, i7 * 2);
            AbstractC5469l.m23027d(copyOf2, "copyOf(this, newSize)");
            this.f22879b = copyOf2;
        }
        if (this.f22880c != i8) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public final int m26452c(Object obj, int i7) {
        int i8 = this.f22880c;
        if (i8 == 0) {
            return -1;
        }
        int m26746a = AbstractC6404a.m26746a(this.f22878a, i8, i7);
        if (m26746a < 0) {
            return m26746a;
        }
        if (AbstractC5469l.m23024a(obj, this.f22879b[m26746a << 1])) {
            return m26746a;
        }
        int i9 = m26746a + 1;
        while (i9 < i8 && this.f22878a[i9] == i7) {
            if (AbstractC5469l.m23024a(obj, this.f22879b[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = m26746a - 1; i10 >= 0 && this.f22878a[i10] == i7; i10--) {
            if (AbstractC5469l.m23024a(obj, this.f22879b[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public void clear() {
        if (this.f22880c > 0) {
            this.f22878a = AbstractC6404a.f23126a;
            this.f22879b = AbstractC6404a.f23128c;
            this.f22880c = 0;
        }
        if (this.f22880c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m26453d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m26450a(obj) >= 0;
    }

    /* renamed from: d */
    public int m26453d(Object obj) {
        return obj == null ? m26454e() : m26452c(obj, obj.hashCode());
    }

    /* renamed from: e */
    public final int m26454e() {
        int i7 = this.f22880c;
        if (i7 == 0) {
            return -1;
        }
        int m26746a = AbstractC6404a.m26746a(this.f22878a, i7, 0);
        if (m26746a < 0) {
            return m26746a;
        }
        if (this.f22879b[m26746a << 1] == null) {
            return m26746a;
        }
        int i8 = m26746a + 1;
        while (i8 < i7 && this.f22878a[i8] == 0) {
            if (this.f22879b[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = m26746a - 1; i9 >= 0 && this.f22878a[i9] == 0; i9--) {
            if (this.f22879b[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C6318k) {
                if (size() != ((C6318k) obj).size()) {
                    return false;
                }
                C6318k c6318k = (C6318k) obj;
                int i7 = this.f22880c;
                for (int i8 = 0; i8 < i7; i8++) {
                    Object m26455f = m26455f(i8);
                    Object m26459j = m26459j(i8);
                    Object obj2 = c6318k.get(m26455f);
                    if (m26459j == null) {
                        if (obj2 != null || !c6318k.containsKey(m26455f)) {
                            return false;
                        }
                    } else if (!AbstractC5469l.m23024a(m26459j, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i9 = this.f22880c;
            for (int i10 = 0; i10 < i9; i10++) {
                Object m26455f2 = m26455f(i10);
                Object m26459j2 = m26459j(i10);
                Object obj3 = ((Map) obj).get(m26455f2);
                if (m26459j2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(m26455f2)) {
                        return false;
                    }
                } else if (!AbstractC5469l.m23024a(m26459j2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public Object m26455f(int i7) {
        if (i7 >= 0 && i7 < this.f22880c) {
            return this.f22879b[i7 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i7).toString());
    }

    /* renamed from: g */
    public void m26456g(C6318k map) {
        AbstractC5469l.m23028e(map, "map");
        int i7 = map.f22880c;
        m26451b(this.f22880c + i7);
        if (this.f22880c != 0) {
            for (int i8 = 0; i8 < i7; i8++) {
                put(map.m26455f(i8), map.m26459j(i8));
            }
        } else if (i7 > 0) {
            AbstractC7019j.m28795e(map.f22878a, this.f22878a, 0, 0, i7);
            AbstractC7019j.m28797g(map.f22879b, this.f22879b, 0, 0, i7 << 1);
            this.f22880c = i7;
        }
    }

    public Object get(Object obj) {
        int m26453d = m26453d(obj);
        if (m26453d >= 0) {
            return this.f22879b[(m26453d << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int m26453d = m26453d(obj);
        return m26453d >= 0 ? this.f22879b[(m26453d << 1) + 1] : obj2;
    }

    /* renamed from: h */
    public Object m26457h(int i7) {
        int i8;
        if (i7 < 0 || i7 >= (i8 = this.f22880c)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i7).toString());
        }
        Object[] objArr = this.f22879b;
        int i9 = i7 << 1;
        Object obj = objArr[i9 + 1];
        if (i8 <= 1) {
            clear();
        } else {
            int i10 = i8 - 1;
            int[] iArr = this.f22878a;
            if (iArr.length <= 8 || i8 >= iArr.length / 3) {
                if (i7 < i10) {
                    int i11 = i7 + 1;
                    AbstractC7019j.m28795e(iArr, iArr, i7, i11, i8);
                    Object[] objArr2 = this.f22879b;
                    AbstractC7019j.m28797g(objArr2, objArr2, i9, i11 << 1, i8 << 1);
                }
                Object[] objArr3 = this.f22879b;
                int i12 = i10 << 1;
                objArr3[i12] = null;
                objArr3[i12 + 1] = null;
            } else {
                int i13 = i8 > 8 ? i8 + (i8 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i13);
                AbstractC5469l.m23027d(copyOf, "copyOf(this, newSize)");
                this.f22878a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f22879b, i13 << 1);
                AbstractC5469l.m23027d(copyOf2, "copyOf(this, newSize)");
                this.f22879b = copyOf2;
                if (i8 != this.f22880c) {
                    throw new ConcurrentModificationException();
                }
                if (i7 > 0) {
                    AbstractC7019j.m28795e(iArr, this.f22878a, 0, 0, i7);
                    AbstractC7019j.m28797g(objArr, this.f22879b, 0, 0, i9);
                }
                if (i7 < i10) {
                    int i14 = i7 + 1;
                    AbstractC7019j.m28795e(iArr, this.f22878a, i7, i14, i8);
                    AbstractC7019j.m28797g(objArr, this.f22879b, i9, i14 << 1, i8 << 1);
                }
            }
            if (i8 != this.f22880c) {
                throw new ConcurrentModificationException();
            }
            this.f22880c = i10;
        }
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f22878a;
        Object[] objArr = this.f22879b;
        int i7 = this.f22880c;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            i10 += (obj != null ? obj.hashCode() : 0) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return i10;
    }

    /* renamed from: i */
    public Object m26458i(int i7, Object obj) {
        if (i7 < 0 || i7 >= this.f22880c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i7).toString());
        }
        int i8 = (i7 << 1) + 1;
        Object[] objArr = this.f22879b;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.f22880c <= 0;
    }

    /* renamed from: j */
    public Object m26459j(int i7) {
        if (i7 >= 0 && i7 < this.f22880c) {
            return this.f22879b[(i7 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i7).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i7 = this.f22880c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int m26452c = obj != null ? m26452c(obj, hashCode) : m26454e();
        if (m26452c >= 0) {
            int i8 = (m26452c << 1) + 1;
            Object[] objArr = this.f22879b;
            Object obj3 = objArr[i8];
            objArr[i8] = obj2;
            return obj3;
        }
        int i9 = ~m26452c;
        int[] iArr = this.f22878a;
        if (i7 >= iArr.length) {
            int i10 = 8;
            if (i7 >= 8) {
                i10 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i10 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i10);
            AbstractC5469l.m23027d(copyOf, "copyOf(this, newSize)");
            this.f22878a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22879b, i10 << 1);
            AbstractC5469l.m23027d(copyOf2, "copyOf(this, newSize)");
            this.f22879b = copyOf2;
            if (i7 != this.f22880c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i7) {
            int[] iArr2 = this.f22878a;
            int i11 = i9 + 1;
            AbstractC7019j.m28795e(iArr2, iArr2, i11, i9, i7);
            Object[] objArr2 = this.f22879b;
            AbstractC7019j.m28797g(objArr2, objArr2, i11 << 1, i9 << 1, this.f22880c << 1);
        }
        int i12 = this.f22880c;
        if (i7 == i12) {
            int[] iArr3 = this.f22878a;
            if (i9 < iArr3.length) {
                iArr3[i9] = hashCode;
                Object[] objArr3 = this.f22879b;
                int i13 = i9 << 1;
                objArr3[i13] = obj;
                objArr3[i13 + 1] = obj2;
                this.f22880c = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int m26453d = m26453d(obj);
        if (m26453d >= 0) {
            return m26457h(m26453d);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int m26453d = m26453d(obj);
        if (m26453d >= 0) {
            return m26458i(m26453d, obj2);
        }
        return null;
    }

    public int size() {
        return this.f22880c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f22880c * 28);
        sb.append('{');
        int i7 = this.f22880c;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object m26455f = m26455f(i8);
            if (m26455f != sb) {
                sb.append(m26455f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m26459j = m26459j(i8);
            if (m26459j != sb) {
                sb.append(m26459j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC5469l.m23027d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public C6318k(int i7) {
        this.f22878a = i7 == 0 ? AbstractC6404a.f23126a : new int[i7];
        this.f22879b = i7 == 0 ? AbstractC6404a.f23128c : new Object[i7 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int m26453d = m26453d(obj);
        if (m26453d < 0 || !AbstractC5469l.m23024a(obj2, m26459j(m26453d))) {
            return false;
        }
        m26457h(m26453d);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int m26453d = m26453d(obj);
        if (m26453d < 0 || !AbstractC5469l.m23024a(obj2, m26459j(m26453d))) {
            return false;
        }
        m26458i(m26453d, obj3);
        return true;
    }

    public /* synthetic */ C6318k(int i7, int i8, AbstractC5464g abstractC5464g) {
        this((i8 & 1) != 0 ? 0 : i7);
    }

    public C6318k(C6318k c6318k) {
        this(0, 1, null);
        if (c6318k != null) {
            m26456g(c6318k);
        }
    }
}
