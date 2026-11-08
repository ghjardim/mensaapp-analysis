package p291n;

/* renamed from: n.W */
/* loaded from: classes.dex */
public class C5621W {

    /* renamed from: a */
    public int f20354a = 0;

    /* renamed from: b */
    public int f20355b = 0;

    /* renamed from: c */
    public int f20356c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f20357d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f20358e = 0;

    /* renamed from: f */
    public int f20359f = 0;

    /* renamed from: g */
    public boolean f20360g = false;

    /* renamed from: h */
    public boolean f20361h = false;

    /* renamed from: a */
    public int m23587a() {
        return this.f20360g ? this.f20354a : this.f20355b;
    }

    /* renamed from: b */
    public int m23588b() {
        return this.f20354a;
    }

    /* renamed from: c */
    public int m23589c() {
        return this.f20355b;
    }

    /* renamed from: d */
    public int m23590d() {
        return this.f20360g ? this.f20355b : this.f20354a;
    }

    /* renamed from: e */
    public void m23591e(int i7, int i8) {
        this.f20361h = false;
        if (i7 != Integer.MIN_VALUE) {
            this.f20358e = i7;
            this.f20354a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f20359f = i8;
            this.f20355b = i8;
        }
    }

    /* renamed from: f */
    public void m23592f(boolean z6) {
        if (z6 == this.f20360g) {
            return;
        }
        this.f20360g = z6;
        if (!this.f20361h) {
            this.f20354a = this.f20358e;
            this.f20355b = this.f20359f;
            return;
        }
        if (z6) {
            int i7 = this.f20357d;
            if (i7 == Integer.MIN_VALUE) {
                i7 = this.f20358e;
            }
            this.f20354a = i7;
            int i8 = this.f20356c;
            if (i8 == Integer.MIN_VALUE) {
                i8 = this.f20359f;
            }
            this.f20355b = i8;
            return;
        }
        int i9 = this.f20356c;
        if (i9 == Integer.MIN_VALUE) {
            i9 = this.f20358e;
        }
        this.f20354a = i9;
        int i10 = this.f20357d;
        if (i10 == Integer.MIN_VALUE) {
            i10 = this.f20359f;
        }
        this.f20355b = i10;
    }

    /* renamed from: g */
    public void m23593g(int i7, int i8) {
        this.f20356c = i7;
        this.f20357d = i8;
        this.f20361h = true;
        if (this.f20360g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f20354a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f20355b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f20354a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f20355b = i8;
        }
    }
}
