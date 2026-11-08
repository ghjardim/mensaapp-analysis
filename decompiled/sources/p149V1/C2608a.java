package p149V1;

/* renamed from: V1.a */
/* loaded from: classes.dex */
public final class C2608a extends AbstractC2611d {

    /* renamed from: a */
    public final Integer f7718a;

    /* renamed from: b */
    public final Object f7719b;

    /* renamed from: c */
    public final EnumC2612e f7720c;

    /* renamed from: d */
    public final AbstractC2613f f7721d;

    public C2608a(Integer num, Object obj, EnumC2612e enumC2612e, AbstractC2613f abstractC2613f) {
        this.f7718a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f7719b = obj;
        if (enumC2612e == null) {
            throw new NullPointerException("Null priority");
        }
        this.f7720c = enumC2612e;
        this.f7721d = abstractC2613f;
    }

    @Override // p149V1.AbstractC2611d
    /* renamed from: a */
    public Integer mo8985a() {
        return this.f7718a;
    }

    @Override // p149V1.AbstractC2611d
    /* renamed from: b */
    public Object mo8986b() {
        return this.f7719b;
    }

    @Override // p149V1.AbstractC2611d
    /* renamed from: c */
    public EnumC2612e mo8987c() {
        return this.f7720c;
    }

    @Override // p149V1.AbstractC2611d
    /* renamed from: d */
    public AbstractC2613f mo8988d() {
        return this.f7721d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2611d)) {
            return false;
        }
        AbstractC2611d abstractC2611d = (AbstractC2611d) obj;
        Integer num = this.f7718a;
        if (num != null ? num.equals(abstractC2611d.mo8985a()) : abstractC2611d.mo8985a() == null) {
            if (this.f7719b.equals(abstractC2611d.mo8986b()) && this.f7720c.equals(abstractC2611d.mo8987c())) {
                AbstractC2613f abstractC2613f = this.f7721d;
                if (abstractC2613f == null) {
                    if (abstractC2611d.mo8988d() == null) {
                        return true;
                    }
                } else if (abstractC2613f.equals(abstractC2611d.mo8988d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f7718a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f7719b.hashCode()) * 1000003) ^ this.f7720c.hashCode()) * 1000003;
        AbstractC2613f abstractC2613f = this.f7721d;
        return hashCode ^ (abstractC2613f != null ? abstractC2613f.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f7718a + ", payload=" + this.f7719b + ", priority=" + this.f7720c + ", productData=" + this.f7721d + "}";
    }
}
