package p259j0;

import java.util.Arrays;

/* renamed from: j0.D */
/* loaded from: classes.dex */
public final class C5321D {

    /* renamed from: a */
    public long[] f18791a;

    /* renamed from: b */
    public Object[] f18792b;

    /* renamed from: c */
    public int f18793c;

    /* renamed from: d */
    public int f18794d;

    public C5321D() {
        this(10);
    }

    /* renamed from: f */
    public static Object[] m21636f(int i7) {
        return new Object[i7];
    }

    /* renamed from: a */
    public synchronized void m21637a(long j7, Object obj) {
        m21640d(j7);
        m21641e();
        m21638b(j7, obj);
    }

    /* renamed from: b */
    public final void m21638b(long j7, Object obj) {
        int i7 = this.f18793c;
        int i8 = this.f18794d;
        Object[] objArr = this.f18792b;
        int length = (i7 + i8) % objArr.length;
        this.f18791a[length] = j7;
        objArr[length] = obj;
        this.f18794d = i8 + 1;
    }

    /* renamed from: c */
    public synchronized void m21639c() {
        this.f18793c = 0;
        this.f18794d = 0;
        Arrays.fill(this.f18792b, (Object) null);
    }

    /* renamed from: d */
    public final void m21640d(long j7) {
        if (this.f18794d > 0) {
            if (j7 <= this.f18791a[((this.f18793c + r0) - 1) % this.f18792b.length]) {
                m21639c();
            }
        }
    }

    /* renamed from: e */
    public final void m21641e() {
        int length = this.f18792b.length;
        if (this.f18794d < length) {
            return;
        }
        int i7 = length * 2;
        long[] jArr = new long[i7];
        Object[] m21636f = m21636f(i7);
        int i8 = this.f18793c;
        int i9 = length - i8;
        System.arraycopy(this.f18791a, i8, jArr, 0, i9);
        System.arraycopy(this.f18792b, this.f18793c, m21636f, 0, i9);
        int i10 = this.f18793c;
        if (i10 > 0) {
            System.arraycopy(this.f18791a, 0, jArr, i9, i10);
            System.arraycopy(this.f18792b, 0, m21636f, i9, this.f18793c);
        }
        this.f18791a = jArr;
        this.f18792b = m21636f;
        this.f18793c = 0;
    }

    /* renamed from: g */
    public final Object m21642g(long j7, boolean z6) {
        Object obj = null;
        long j8 = Long.MAX_VALUE;
        while (this.f18794d > 0) {
            long j9 = j7 - this.f18791a[this.f18793c];
            if (j9 < 0 && (z6 || (-j9) >= j8)) {
                break;
            }
            obj = m21645j();
            j8 = j9;
        }
        return obj;
    }

    /* renamed from: h */
    public synchronized Object m21643h() {
        return this.f18794d == 0 ? null : m21645j();
    }

    /* renamed from: i */
    public synchronized Object m21644i(long j7) {
        return m21642g(j7, true);
    }

    /* renamed from: j */
    public final Object m21645j() {
        AbstractC5332a.m21802g(this.f18794d > 0);
        Object[] objArr = this.f18792b;
        int i7 = this.f18793c;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f18793c = (i7 + 1) % objArr.length;
        this.f18794d--;
        return obj;
    }

    /* renamed from: k */
    public synchronized int m21646k() {
        return this.f18794d;
    }

    public C5321D(int i7) {
        this.f18791a = new long[i7];
        this.f18792b = m21636f(i7);
    }
}
