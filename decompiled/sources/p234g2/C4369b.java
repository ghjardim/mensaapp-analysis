package p234g2;

import p170Y1.AbstractC2902i;
import p170Y1.AbstractC2908o;

/* renamed from: g2.b */
/* loaded from: classes.dex */
public final class C4369b extends AbstractC4378k {

    /* renamed from: a */
    public final long f15554a;

    /* renamed from: b */
    public final AbstractC2908o f15555b;

    /* renamed from: c */
    public final AbstractC2902i f15556c;

    public C4369b(long j7, AbstractC2908o abstractC2908o, AbstractC2902i abstractC2902i) {
        this.f15554a = j7;
        if (abstractC2908o == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f15555b = abstractC2908o;
        if (abstractC2902i == null) {
            throw new NullPointerException("Null event");
        }
        this.f15556c = abstractC2902i;
    }

    @Override // p234g2.AbstractC4378k
    /* renamed from: b */
    public AbstractC2902i mo18595b() {
        return this.f15556c;
    }

    @Override // p234g2.AbstractC4378k
    /* renamed from: c */
    public long mo18596c() {
        return this.f15554a;
    }

    @Override // p234g2.AbstractC4378k
    /* renamed from: d */
    public AbstractC2908o mo18597d() {
        return this.f15555b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4378k)) {
            return false;
        }
        AbstractC4378k abstractC4378k = (AbstractC4378k) obj;
        return this.f15554a == abstractC4378k.mo18596c() && this.f15555b.equals(abstractC4378k.mo18597d()) && this.f15556c.equals(abstractC4378k.mo18595b());
    }

    public int hashCode() {
        long j7 = this.f15554a;
        return ((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f15555b.hashCode()) * 1000003) ^ this.f15556c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f15554a + ", transportContext=" + this.f15555b + ", event=" + this.f15556c + "}";
    }
}
