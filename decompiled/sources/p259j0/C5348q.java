package p259j0;

import java.util.NoSuchElementException;

/* renamed from: j0.q */
/* loaded from: classes.dex */
public final class C5348q {

    /* renamed from: a */
    public int f18866a;

    /* renamed from: b */
    public int f18867b;

    /* renamed from: c */
    public int f18868c;

    /* renamed from: d */
    public long[] f18869d;

    /* renamed from: e */
    public int f18870e;

    public C5348q() {
        this(16);
    }

    /* renamed from: a */
    public void m21876a() {
        this.f18866a = 0;
        this.f18867b = -1;
        this.f18868c = 0;
    }

    /* renamed from: b */
    public long m21877b() {
        if (this.f18868c != 0) {
            return this.f18869d[this.f18866a];
        }
        throw new NoSuchElementException();
    }

    /* renamed from: c */
    public boolean m21878c() {
        return this.f18868c == 0;
    }

    /* renamed from: d */
    public long m21879d() {
        int i7 = this.f18868c;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f18869d;
        int i8 = this.f18866a;
        long j7 = jArr[i8];
        this.f18866a = this.f18870e & (i8 + 1);
        this.f18868c = i7 - 1;
        return j7;
    }

    public C5348q(int i7) {
        AbstractC5332a.m21796a(i7 >= 0 && i7 <= 1073741824);
        i7 = i7 == 0 ? 1 : i7;
        i7 = Integer.bitCount(i7) != 1 ? Integer.highestOneBit(i7 - 1) << 1 : i7;
        this.f18866a = 0;
        this.f18867b = -1;
        this.f18868c = 0;
        long[] jArr = new long[i7];
        this.f18869d = jArr;
        this.f18870e = jArr.length - 1;
    }
}
