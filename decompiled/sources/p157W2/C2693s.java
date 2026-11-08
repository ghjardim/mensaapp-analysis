package p157W2;

/* renamed from: W2.s */
/* loaded from: classes.dex */
public final class C2693s extends AbstractC2694t {

    /* renamed from: a */
    public final int f7940a;

    /* renamed from: b */
    public final long f7941b;

    public C2693s(int i7, long j7) {
        this.f7940a = i7;
        this.f7941b = j7;
    }

    @Override // p157W2.AbstractC2694t
    /* renamed from: a */
    public final int mo9190a() {
        return this.f7940a;
    }

    @Override // p157W2.AbstractC2694t
    /* renamed from: b */
    public final long mo9191b() {
        return this.f7941b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2694t) {
            AbstractC2694t abstractC2694t = (AbstractC2694t) obj;
            if (this.f7940a == abstractC2694t.mo9190a() && this.f7941b == abstractC2694t.mo9191b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f7941b;
        return ((int) (j7 ^ (j7 >>> 32))) ^ ((this.f7940a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f7940a + ", eventTimestamp=" + this.f7941b + "}";
    }
}
