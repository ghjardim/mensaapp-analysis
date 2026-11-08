package p281l5;

/* renamed from: l5.i */
/* loaded from: classes2.dex */
public final class C5547i {

    /* renamed from: a */
    public int f20033a;

    /* renamed from: b */
    public int f20034b;

    /* renamed from: c */
    public int f20035c;

    /* renamed from: d */
    public final int[] f20036d = new int[10];

    /* renamed from: a */
    public int m23257a(int i7) {
        return this.f20036d[i7];
    }

    /* renamed from: b */
    public int m23258b() {
        if ((this.f20033a & 2) != 0) {
            return this.f20036d[1];
        }
        return -1;
    }

    /* renamed from: c */
    public int m23259c(int i7) {
        return (this.f20033a & 32) != 0 ? this.f20036d[5] : i7;
    }

    /* renamed from: d */
    public boolean m23260d(int i7) {
        return ((1 << i7) & this.f20033a) != 0;
    }

    /* renamed from: e */
    public C5547i m23261e(int i7, int i8, int i9) {
        int[] iArr = this.f20036d;
        if (i7 >= iArr.length) {
            return this;
        }
        int i10 = 1 << i7;
        this.f20033a |= i10;
        if ((i8 & 1) != 0) {
            this.f20034b |= i10;
        } else {
            this.f20034b &= ~i10;
        }
        if ((i8 & 2) != 0) {
            this.f20035c |= i10;
        } else {
            this.f20035c &= ~i10;
        }
        iArr[i7] = i9;
        return this;
    }

    /* renamed from: f */
    public int m23262f() {
        return Integer.bitCount(this.f20033a);
    }
}
