package p088M3;

import p088M3.AbstractC1175q;

/* renamed from: M3.c */
/* loaded from: classes.dex */
public final class C1161c extends AbstractC1175q.b {

    /* renamed from: a */
    public final long f3749a;

    /* renamed from: b */
    public final AbstractC1175q.a f3750b;

    public C1161c(long j7, AbstractC1175q.a aVar) {
        this.f3749a = j7;
        if (aVar == null) {
            throw new NullPointerException("Null offset");
        }
        this.f3750b = aVar;
    }

    @Override // p088M3.AbstractC1175q.b
    /* renamed from: c */
    public AbstractC1175q.a mo4455c() {
        return this.f3750b;
    }

    @Override // p088M3.AbstractC1175q.b
    /* renamed from: d */
    public long mo4456d() {
        return this.f3749a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1175q.b)) {
            return false;
        }
        AbstractC1175q.b bVar = (AbstractC1175q.b) obj;
        return this.f3749a == bVar.mo4456d() && this.f3750b.equals(bVar.mo4455c());
    }

    public int hashCode() {
        long j7 = this.f3749a;
        return ((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f3750b.hashCode();
    }

    public String toString() {
        return "IndexState{sequenceNumber=" + this.f3749a + ", offset=" + this.f3750b + "}";
    }
}
