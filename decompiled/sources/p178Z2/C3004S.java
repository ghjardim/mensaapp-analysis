package p178Z2;

import java.io.Serializable;
import p171Y2.AbstractC2932o;

/* renamed from: Z2.S */
/* loaded from: classes.dex */
public final class C3004S extends AbstractC2999M implements Serializable {

    /* renamed from: a */
    public static final C3004S f9207a = new C3004S();

    @Override // p178Z2.AbstractC2999M
    /* renamed from: g */
    public AbstractC2999M mo10834g() {
        return AbstractC2999M.m10843d();
    }

    @Override // p178Z2.AbstractC2999M, java.util.Comparator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        AbstractC2932o.m10572o(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
