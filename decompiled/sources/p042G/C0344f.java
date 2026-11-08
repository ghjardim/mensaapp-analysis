package p042G;

/* renamed from: G.f */
/* loaded from: classes.dex */
public final class C0344f {

    /* renamed from: a */
    public final float f1289a;

    /* renamed from: b */
    public final float f1290b;

    public C0344f(float f7, float f8) {
        this.f1289a = AbstractC0343e.m1351a(f7, "width");
        this.f1290b = AbstractC0343e.m1351a(f8, "height");
    }

    /* renamed from: a */
    public float m1355a() {
        return this.f1290b;
    }

    /* renamed from: b */
    public float m1356b() {
        return this.f1289a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0344f)) {
            return false;
        }
        C0344f c0344f = (C0344f) obj;
        return c0344f.f1289a == this.f1289a && c0344f.f1290b == this.f1290b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f1289a) ^ Float.floatToIntBits(this.f1290b);
    }

    public String toString() {
        return this.f1289a + "x" + this.f1290b;
    }
}
