package p078L0;

/* renamed from: L0.N */
/* loaded from: classes.dex */
public final class C0856N {

    /* renamed from: c */
    public static final C0856N f2940c = new C0856N(0, 0);

    /* renamed from: a */
    public final long f2941a;

    /* renamed from: b */
    public final long f2942b;

    public C0856N(long j7, long j8) {
        this.f2941a = j7;
        this.f2942b = j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0856N.class != obj.getClass()) {
            return false;
        }
        C0856N c0856n = (C0856N) obj;
        return this.f2941a == c0856n.f2941a && this.f2942b == c0856n.f2942b;
    }

    public int hashCode() {
        return (((int) this.f2941a) * 31) + ((int) this.f2942b);
    }

    public String toString() {
        return "[timeUs=" + this.f2941a + ", position=" + this.f2942b + "]";
    }
}
