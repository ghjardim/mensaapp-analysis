package p259j0;

/* renamed from: j0.A */
/* loaded from: classes.dex */
public final class C5318A {

    /* renamed from: c */
    public static final C5318A f18783c = new C5318A(-1, -1);

    /* renamed from: d */
    public static final C5318A f18784d = new C5318A(0, 0);

    /* renamed from: a */
    public final int f18785a;

    /* renamed from: b */
    public final int f18786b;

    public C5318A(int i7, int i8) {
        AbstractC5332a.m21796a((i7 == -1 || i7 >= 0) && (i8 == -1 || i8 >= 0));
        this.f18785a = i7;
        this.f18786b = i8;
    }

    /* renamed from: a */
    public int m21610a() {
        return this.f18786b;
    }

    /* renamed from: b */
    public int m21611b() {
        return this.f18785a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5318A)) {
            return false;
        }
        C5318A c5318a = (C5318A) obj;
        return this.f18785a == c5318a.f18785a && this.f18786b == c5318a.f18786b;
    }

    public int hashCode() {
        int i7 = this.f18786b;
        int i8 = this.f18785a;
        return i7 ^ ((i8 >>> 16) | (i8 << 16));
    }

    public String toString() {
        return this.f18785a + "x" + this.f18786b;
    }
}
