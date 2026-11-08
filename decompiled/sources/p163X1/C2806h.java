package p163X1;

/* renamed from: X1.h */
/* loaded from: classes.dex */
public final class C2806h extends AbstractC2812n {

    /* renamed from: a */
    public final long f8630a;

    public C2806h(long j7) {
        this.f8630a = j7;
    }

    @Override // p163X1.AbstractC2812n
    /* renamed from: c */
    public long mo10047c() {
        return this.f8630a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC2812n) && this.f8630a == ((AbstractC2812n) obj).mo10047c();
    }

    public int hashCode() {
        long j7 = this.f8630a;
        return ((int) (j7 ^ (j7 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f8630a + "}";
    }
}
