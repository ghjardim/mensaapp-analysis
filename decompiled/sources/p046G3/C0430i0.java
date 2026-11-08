package p046G3;

/* renamed from: G3.i0 */
/* loaded from: classes.dex */
public final class C0430i0 implements InterfaceC0411Y {

    /* renamed from: a */
    public final long f1564a;

    /* renamed from: G3.i0$b */
    public static class b {

        /* renamed from: a */
        public long f1565a;

        /* renamed from: a */
        public C0430i0 m1655a() {
            return new C0430i0(this.f1565a);
        }

        /* renamed from: b */
        public b m1656b(long j7) {
            this.f1565a = j7;
            return this;
        }

        public b() {
            this.f1565a = 104857600L;
        }
    }

    /* renamed from: b */
    public static b m1653b() {
        return new b();
    }

    /* renamed from: a */
    public long m1654a() {
        return this.f1564a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0430i0.class == obj.getClass() && this.f1564a == ((C0430i0) obj).f1564a;
    }

    public int hashCode() {
        long j7 = this.f1564a;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public String toString() {
        return "PersistentCacheSettings{sizeBytes=" + this.f1564a + '}';
    }

    public C0430i0(long j7) {
        this.f1564a = j7;
    }
}
