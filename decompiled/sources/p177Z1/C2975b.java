package p177Z1;

import p177Z1.AbstractC2980g;

/* renamed from: Z1.b */
/* loaded from: classes.dex */
public final class C2975b extends AbstractC2980g {

    /* renamed from: a */
    public final AbstractC2980g.a f9131a;

    /* renamed from: b */
    public final long f9132b;

    public C2975b(AbstractC2980g.a aVar, long j7) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f9131a = aVar;
        this.f9132b = j7;
    }

    @Override // p177Z1.AbstractC2980g
    /* renamed from: b */
    public long mo10724b() {
        return this.f9132b;
    }

    @Override // p177Z1.AbstractC2980g
    /* renamed from: c */
    public AbstractC2980g.a mo10725c() {
        return this.f9131a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2980g)) {
            return false;
        }
        AbstractC2980g abstractC2980g = (AbstractC2980g) obj;
        return this.f9131a.equals(abstractC2980g.mo10725c()) && this.f9132b == abstractC2980g.mo10724b();
    }

    public int hashCode() {
        int hashCode = (this.f9131a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.f9132b;
        return hashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f9131a + ", nextRequestWaitMillis=" + this.f9132b + "}";
    }
}
