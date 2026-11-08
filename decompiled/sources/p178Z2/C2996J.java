package p178Z2;

import java.io.Serializable;
import p171Y2.AbstractC2932o;

/* renamed from: Z2.J */
/* loaded from: classes.dex */
public final class C2996J extends AbstractC2999M implements Serializable {

    /* renamed from: a */
    public static final C2996J f9182a = new C2996J();

    @Override // p178Z2.AbstractC2999M
    /* renamed from: g */
    public AbstractC2999M mo10834g() {
        return C3004S.f9207a;
    }

    @Override // p178Z2.AbstractC2999M, java.util.Comparator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        AbstractC2932o.m10572o(comparable);
        AbstractC2932o.m10572o(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
