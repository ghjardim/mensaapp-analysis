package p046G3;

/* renamed from: G3.x0 */
/* loaded from: classes.dex */
public final class C0460x0 {

    /* renamed from: b */
    public static final C0460x0 f1625b = new b().m1691a();

    /* renamed from: a */
    public final int f1626a;

    /* renamed from: G3.x0$b */
    public static final class b {

        /* renamed from: a */
        public int f1627a = 5;

        /* renamed from: a */
        public C0460x0 m1691a() {
            return new C0460x0(this.f1627a);
        }

        /* renamed from: b */
        public b m1692b(int i7) {
            if (i7 < 1) {
                throw new IllegalArgumentException("Max attempts must be at least 1");
            }
            this.f1627a = i7;
            return this;
        }
    }

    /* renamed from: a */
    public int m1690a() {
        return this.f1626a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0460x0.class == obj.getClass() && this.f1626a == ((C0460x0) obj).f1626a;
    }

    public int hashCode() {
        return this.f1626a;
    }

    public String toString() {
        return "TransactionOptions{maxAttempts=" + this.f1626a + '}';
    }

    public C0460x0(int i7) {
        this.f1626a = i7;
    }
}
