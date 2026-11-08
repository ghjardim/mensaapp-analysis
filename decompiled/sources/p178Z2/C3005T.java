package p178Z2;

import java.io.Serializable;
import p171Y2.AbstractC2932o;

/* renamed from: Z2.T */
/* loaded from: classes.dex */
public final class C3005T extends AbstractC2999M implements Serializable {

    /* renamed from: a */
    public final AbstractC2999M f9208a;

    public C3005T(AbstractC2999M abstractC2999M) {
        this.f9208a = (AbstractC2999M) AbstractC2932o.m10572o(abstractC2999M);
    }

    @Override // p178Z2.AbstractC2999M, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f9208a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3005T) {
            return this.f9208a.equals(((C3005T) obj).f9208a);
        }
        return false;
    }

    @Override // p178Z2.AbstractC2999M
    /* renamed from: g */
    public AbstractC2999M mo10834g() {
        return this.f9208a;
    }

    public int hashCode() {
        return -this.f9208a.hashCode();
    }

    public String toString() {
        return this.f9208a + ".reverse()";
    }
}
