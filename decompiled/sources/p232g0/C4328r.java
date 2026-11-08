package p232g0;

import p259j0.AbstractC5332a;

/* renamed from: g0.r */
/* loaded from: classes.dex */
public class C4328r {

    /* renamed from: a */
    public final C4318h f15187a;

    /* renamed from: b */
    public final int f15188b;

    /* renamed from: c */
    public final int f15189c;

    /* renamed from: d */
    public final float f15190d;

    /* renamed from: e */
    public final long f15191e;

    /* renamed from: g0.r$b */
    public static final class b {

        /* renamed from: a */
        public C4318h f15192a;

        /* renamed from: b */
        public int f15193b;

        /* renamed from: c */
        public int f15194c;

        /* renamed from: d */
        public float f15195d = 1.0f;

        /* renamed from: e */
        public long f15196e;

        public b(C4318h c4318h, int i7, int i8) {
            this.f15192a = c4318h;
            this.f15193b = i7;
            this.f15194c = i8;
        }

        /* renamed from: a */
        public C4328r m18272a() {
            return new C4328r(this.f15192a, this.f15193b, this.f15194c, this.f15195d, this.f15196e);
        }

        /* renamed from: b */
        public b m18273b(float f7) {
            this.f15195d = f7;
            return this;
        }
    }

    public C4328r(C4318h c4318h, int i7, int i8, float f7, long j7) {
        AbstractC5332a.m21797b(i7 > 0, "width must be positive, but is: " + i7);
        AbstractC5332a.m21797b(i8 > 0, "height must be positive, but is: " + i8);
        this.f15187a = c4318h;
        this.f15188b = i7;
        this.f15189c = i8;
        this.f15190d = f7;
        this.f15191e = j7;
    }
}
