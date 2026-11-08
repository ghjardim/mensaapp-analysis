package p259j0;

import java.util.Arrays;

/* renamed from: j0.p */
/* loaded from: classes.dex */
public final class C5347p {

    /* renamed from: a */
    public int f18864a;

    /* renamed from: b */
    public long[] f18865b;

    public C5347p() {
        this(32);
    }

    /* renamed from: a */
    public void m21873a(long j7) {
        int i7 = this.f18864a;
        long[] jArr = this.f18865b;
        if (i7 == jArr.length) {
            this.f18865b = Arrays.copyOf(jArr, i7 * 2);
        }
        long[] jArr2 = this.f18865b;
        int i8 = this.f18864a;
        this.f18864a = i8 + 1;
        jArr2[i8] = j7;
    }

    /* renamed from: b */
    public long m21874b(int i7) {
        if (i7 >= 0 && i7 < this.f18864a) {
            return this.f18865b[i7];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i7 + ", size is " + this.f18864a);
    }

    /* renamed from: c */
    public int m21875c() {
        return this.f18864a;
    }

    public C5347p(int i7) {
        this.f18865b = new long[i7];
    }
}
