package p178Z2;

import java.io.Serializable;
import java.util.Comparator;
import p171Y2.AbstractC2932o;

/* renamed from: Z2.m */
/* loaded from: classes.dex */
public final class C3024m extends AbstractC2999M implements Serializable {

    /* renamed from: a */
    public final Comparator f9295a;

    public C3024m(Comparator comparator) {
        this.f9295a = (Comparator) AbstractC2932o.m10572o(comparator);
    }

    @Override // p178Z2.AbstractC2999M, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f9295a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3024m) {
            return this.f9295a.equals(((C3024m) obj).f9295a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9295a.hashCode();
    }

    public String toString() {
        return this.f9295a.toString();
    }
}
