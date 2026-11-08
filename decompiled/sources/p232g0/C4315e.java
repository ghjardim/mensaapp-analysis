package p232g0;

/* renamed from: g0.e */
/* loaded from: classes.dex */
public final class C4315e {

    /* renamed from: a */
    public final int f15024a;

    /* renamed from: b */
    public final float f15025b;

    public C4315e(int i7, float f7) {
        this.f15024a = i7;
        this.f15025b = f7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4315e.class != obj.getClass()) {
            return false;
        }
        C4315e c4315e = (C4315e) obj;
        return this.f15024a == c4315e.f15024a && Float.compare(c4315e.f15025b, this.f15025b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f15024a) * 31) + Float.floatToIntBits(this.f15025b);
    }
}
