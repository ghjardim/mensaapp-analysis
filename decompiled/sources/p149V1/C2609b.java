package p149V1;

/* renamed from: V1.b */
/* loaded from: classes.dex */
public final class C2609b extends AbstractC2613f {

    /* renamed from: a */
    public final Integer f7722a;

    public C2609b(Integer num) {
        this.f7722a = num;
    }

    @Override // p149V1.AbstractC2613f
    /* renamed from: a */
    public Integer mo8989a() {
        return this.f7722a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2613f)) {
            return false;
        }
        Integer num = this.f7722a;
        Integer mo8989a = ((AbstractC2613f) obj).mo8989a();
        return num == null ? mo8989a == null : num.equals(mo8989a);
    }

    public int hashCode() {
        Integer num = this.f7722a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f7722a + "}";
    }
}
