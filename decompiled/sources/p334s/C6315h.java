package p334s;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p342t.AbstractC6404a;
import p378x5.AbstractC7019j;

/* renamed from: s.h */
/* loaded from: classes.dex */
public class C6315h implements Cloneable {

    /* renamed from: a */
    public /* synthetic */ boolean f22873a;

    /* renamed from: b */
    public /* synthetic */ long[] f22874b;

    /* renamed from: c */
    public /* synthetic */ Object[] f22875c;

    /* renamed from: d */
    public /* synthetic */ int f22876d;

    public C6315h() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public void m26437a(long j7, Object obj) {
        Object obj2;
        int i7 = this.f22876d;
        if (i7 != 0 && j7 <= this.f22874b[i7 - 1]) {
            m26445j(j7, obj);
            return;
        }
        if (this.f22873a) {
            long[] jArr = this.f22874b;
            if (i7 >= jArr.length) {
                Object[] objArr = this.f22875c;
                int i8 = 0;
                for (int i9 = 0; i9 < i7; i9++) {
                    Object obj3 = objArr[i9];
                    obj2 = AbstractC6316i.f22877a;
                    if (obj3 != obj2) {
                        if (i9 != i8) {
                            jArr[i8] = jArr[i9];
                            objArr[i8] = obj3;
                            objArr[i9] = null;
                        }
                        i8++;
                    }
                }
                this.f22873a = false;
                this.f22876d = i8;
            }
        }
        int i10 = this.f22876d;
        if (i10 >= this.f22874b.length) {
            int m26751f = AbstractC6404a.m26751f(i10 + 1);
            long[] copyOf = Arrays.copyOf(this.f22874b, m26751f);
            AbstractC5469l.m23027d(copyOf, "copyOf(this, newSize)");
            this.f22874b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22875c, m26751f);
            AbstractC5469l.m23027d(copyOf2, "copyOf(this, newSize)");
            this.f22875c = copyOf2;
        }
        this.f22874b[i10] = j7;
        this.f22875c[i10] = obj;
        this.f22876d = i10 + 1;
    }

    /* renamed from: b */
    public void m26438b() {
        int i7 = this.f22876d;
        Object[] objArr = this.f22875c;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f22876d = 0;
        this.f22873a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C6315h clone() {
        Object clone = super.clone();
        AbstractC5469l.m23026c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C6315h c6315h = (C6315h) clone;
        c6315h.f22874b = (long[]) this.f22874b.clone();
        c6315h.f22875c = (Object[]) this.f22875c.clone();
        return c6315h;
    }

    /* renamed from: d */
    public void m26440d(long j7) {
        Object obj;
        Object obj2;
        int m26747b = AbstractC6404a.m26747b(this.f22874b, this.f22876d, j7);
        if (m26747b >= 0) {
            Object obj3 = this.f22875c[m26747b];
            obj = AbstractC6316i.f22877a;
            if (obj3 != obj) {
                Object[] objArr = this.f22875c;
                obj2 = AbstractC6316i.f22877a;
                objArr[m26747b] = obj2;
                this.f22873a = true;
            }
        }
    }

    /* renamed from: e */
    public Object m26441e(long j7) {
        Object obj;
        int m26747b = AbstractC6404a.m26747b(this.f22874b, this.f22876d, j7);
        if (m26747b >= 0) {
            Object obj2 = this.f22875c[m26747b];
            obj = AbstractC6316i.f22877a;
            if (obj2 != obj) {
                return this.f22875c[m26747b];
            }
        }
        return null;
    }

    /* renamed from: f */
    public Object m26442f(long j7, Object obj) {
        Object obj2;
        int m26747b = AbstractC6404a.m26747b(this.f22874b, this.f22876d, j7);
        if (m26747b < 0) {
            return obj;
        }
        Object obj3 = this.f22875c[m26747b];
        obj2 = AbstractC6316i.f22877a;
        return obj3 == obj2 ? obj : this.f22875c[m26747b];
    }

    /* renamed from: g */
    public int m26443g(long j7) {
        Object obj;
        if (this.f22873a) {
            int i7 = this.f22876d;
            long[] jArr = this.f22874b;
            Object[] objArr = this.f22875c;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj2 = objArr[i9];
                obj = AbstractC6316i.f22877a;
                if (obj2 != obj) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj2;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f22873a = false;
            this.f22876d = i8;
        }
        return AbstractC6404a.m26747b(this.f22874b, this.f22876d, j7);
    }

    /* renamed from: i */
    public long m26444i(int i7) {
        int i8;
        Object obj;
        if (i7 < 0 || i7 >= (i8 = this.f22876d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i7).toString());
        }
        if (this.f22873a) {
            long[] jArr = this.f22874b;
            Object[] objArr = this.f22875c;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj2 = objArr[i10];
                obj = AbstractC6316i.f22877a;
                if (obj2 != obj) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj2;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f22873a = false;
            this.f22876d = i9;
        }
        return this.f22874b[i7];
    }

    /* renamed from: j */
    public void m26445j(long j7, Object obj) {
        Object obj2;
        Object obj3;
        int m26747b = AbstractC6404a.m26747b(this.f22874b, this.f22876d, j7);
        if (m26747b >= 0) {
            this.f22875c[m26747b] = obj;
            return;
        }
        int i7 = ~m26747b;
        if (i7 < this.f22876d) {
            Object obj4 = this.f22875c[i7];
            obj3 = AbstractC6316i.f22877a;
            if (obj4 == obj3) {
                this.f22874b[i7] = j7;
                this.f22875c[i7] = obj;
                return;
            }
        }
        if (this.f22873a) {
            int i8 = this.f22876d;
            long[] jArr = this.f22874b;
            if (i8 >= jArr.length) {
                Object[] objArr = this.f22875c;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj5 = objArr[i10];
                    obj2 = AbstractC6316i.f22877a;
                    if (obj5 != obj2) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj5;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f22873a = false;
                this.f22876d = i9;
                i7 = ~AbstractC6404a.m26747b(this.f22874b, i9, j7);
            }
        }
        int i11 = this.f22876d;
        if (i11 >= this.f22874b.length) {
            int m26751f = AbstractC6404a.m26751f(i11 + 1);
            long[] copyOf = Arrays.copyOf(this.f22874b, m26751f);
            AbstractC5469l.m23027d(copyOf, "copyOf(this, newSize)");
            this.f22874b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22875c, m26751f);
            AbstractC5469l.m23027d(copyOf2, "copyOf(this, newSize)");
            this.f22875c = copyOf2;
        }
        int i12 = this.f22876d;
        if (i12 - i7 != 0) {
            long[] jArr2 = this.f22874b;
            int i13 = i7 + 1;
            AbstractC7019j.m28796f(jArr2, jArr2, i13, i7, i12);
            Object[] objArr2 = this.f22875c;
            AbstractC7019j.m28797g(objArr2, objArr2, i13, i7, this.f22876d);
        }
        this.f22874b[i7] = j7;
        this.f22875c[i7] = obj;
        this.f22876d++;
    }

    /* renamed from: k */
    public int m26446k() {
        Object obj;
        if (this.f22873a) {
            int i7 = this.f22876d;
            long[] jArr = this.f22874b;
            Object[] objArr = this.f22875c;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj2 = objArr[i9];
                obj = AbstractC6316i.f22877a;
                if (obj2 != obj) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj2;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f22873a = false;
            this.f22876d = i8;
        }
        return this.f22876d;
    }

    /* renamed from: l */
    public Object m26447l(int i7) {
        int i8;
        Object obj;
        if (i7 < 0 || i7 >= (i8 = this.f22876d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i7).toString());
        }
        if (this.f22873a) {
            long[] jArr = this.f22874b;
            Object[] objArr = this.f22875c;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj2 = objArr[i10];
                obj = AbstractC6316i.f22877a;
                if (obj2 != obj) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj2;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f22873a = false;
            this.f22876d = i9;
        }
        return this.f22875c[i7];
    }

    public String toString() {
        if (m26446k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f22876d * 28);
        sb.append('{');
        int i7 = this.f22876d;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(m26444i(i8));
            sb.append('=');
            Object m26447l = m26447l(i8);
            if (m26447l != sb) {
                sb.append(m26447l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC5469l.m23027d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public C6315h(int i7) {
        if (i7 == 0) {
            this.f22874b = AbstractC6404a.f23127b;
            this.f22875c = AbstractC6404a.f23128c;
        } else {
            int m26751f = AbstractC6404a.m26751f(i7);
            this.f22874b = new long[m26751f];
            this.f22875c = new Object[m26751f];
        }
    }

    public /* synthetic */ C6315h(int i7, int i8, AbstractC5464g abstractC5464g) {
        this((i8 & 1) != 0 ? 10 : i7);
    }
}
