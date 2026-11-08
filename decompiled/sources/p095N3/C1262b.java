package p095N3;

/* renamed from: N3.b */
/* loaded from: classes.dex */
public final class C1262b extends AbstractC1271k {

    /* renamed from: a */
    public final int f3986a;

    /* renamed from: b */
    public final AbstractC1266f f3987b;

    public C1262b(int i7, AbstractC1266f abstractC1266f) {
        this.f3986a = i7;
        if (abstractC1266f == null) {
            throw new NullPointerException("Null mutation");
        }
        this.f3987b = abstractC1266f;
    }

    @Override // p095N3.AbstractC1271k
    /* renamed from: c */
    public int mo4822c() {
        return this.f3986a;
    }

    @Override // p095N3.AbstractC1271k
    /* renamed from: d */
    public AbstractC1266f mo4823d() {
        return this.f3987b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1271k)) {
            return false;
        }
        AbstractC1271k abstractC1271k = (AbstractC1271k) obj;
        return this.f3986a == abstractC1271k.mo4822c() && this.f3987b.equals(abstractC1271k.mo4823d());
    }

    public int hashCode() {
        return ((this.f3986a ^ 1000003) * 1000003) ^ this.f3987b.hashCode();
    }

    public String toString() {
        return "Overlay{largestBatchId=" + this.f3986a + ", mutation=" + this.f3987b + "}";
    }
}
