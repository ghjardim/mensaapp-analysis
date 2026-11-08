package p178Z2;

import java.io.Serializable;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p171Y2.InterfaceC2924g;

/* renamed from: Z2.h */
/* loaded from: classes.dex */
public final class C3019h extends AbstractC2999M implements Serializable {

    /* renamed from: a */
    public final InterfaceC2924g f9268a;

    /* renamed from: b */
    public final AbstractC2999M f9269b;

    public C3019h(InterfaceC2924g interfaceC2924g, AbstractC2999M abstractC2999M) {
        this.f9268a = (InterfaceC2924g) AbstractC2932o.m10572o(interfaceC2924g);
        this.f9269b = (AbstractC2999M) AbstractC2932o.m10572o(abstractC2999M);
    }

    @Override // p178Z2.AbstractC2999M, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f9269b.compare(this.f9268a.apply(obj), this.f9268a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3019h)) {
            return false;
        }
        C3019h c3019h = (C3019h) obj;
        return this.f9268a.equals(c3019h.f9268a) && this.f9269b.equals(c3019h.f9269b);
    }

    public int hashCode() {
        return AbstractC2928k.m10551b(this.f9268a, this.f9269b);
    }

    public String toString() {
        return this.f9269b + ".onResultOf(" + this.f9268a + ")";
    }
}
