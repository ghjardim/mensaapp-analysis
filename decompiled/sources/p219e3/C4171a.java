package p219e3;

/* renamed from: e3.a */
/* loaded from: classes.dex */
public final class C4171a extends AbstractC4187q {

    /* renamed from: a */
    public final long f13990a;

    /* renamed from: b */
    public final long f13991b;

    /* renamed from: c */
    public final long f13992c;

    public C4171a(long j7, long j8, long j9) {
        this.f13990a = j7;
        this.f13991b = j8;
        this.f13992c = j9;
    }

    @Override // p219e3.AbstractC4187q
    /* renamed from: b */
    public long mo17504b() {
        return this.f13991b;
    }

    @Override // p219e3.AbstractC4187q
    /* renamed from: c */
    public long mo17505c() {
        return this.f13990a;
    }

    @Override // p219e3.AbstractC4187q
    /* renamed from: d */
    public long mo17506d() {
        return this.f13992c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4187q)) {
            return false;
        }
        AbstractC4187q abstractC4187q = (AbstractC4187q) obj;
        return this.f13990a == abstractC4187q.mo17505c() && this.f13991b == abstractC4187q.mo17504b() && this.f13992c == abstractC4187q.mo17506d();
    }

    public int hashCode() {
        long j7 = this.f13990a;
        long j8 = this.f13991b;
        int i7 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f13992c;
        return i7 ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f13990a + ", elapsedRealtime=" + this.f13991b + ", uptimeMillis=" + this.f13992c + "}";
    }
}
