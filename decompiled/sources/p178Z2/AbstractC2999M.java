package p178Z2;

import java.util.Comparator;
import p171Y2.AbstractC2932o;
import p171Y2.InterfaceC2924g;

/* renamed from: Z2.M */
/* loaded from: classes.dex */
public abstract class AbstractC2999M implements Comparator {
    /* renamed from: b */
    public static AbstractC2999M m10842b(Comparator comparator) {
        return comparator instanceof AbstractC2999M ? (AbstractC2999M) comparator : new C3024m(comparator);
    }

    /* renamed from: d */
    public static AbstractC2999M m10843d() {
        return C2996J.f9182a;
    }

    /* renamed from: a */
    public AbstractC2999M m10844a(Comparator comparator) {
        return new C3026o(this, (Comparator) AbstractC2932o.m10572o(comparator));
    }

    /* renamed from: c */
    public AbstractC3033v m10845c(Iterable iterable) {
        return AbstractC3033v.m11042B(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    /* renamed from: e */
    public AbstractC2999M m10846e() {
        return m10847f(AbstractC2992F.m10797e());
    }

    /* renamed from: f */
    public AbstractC2999M m10847f(InterfaceC2924g interfaceC2924g) {
        return new C3019h(interfaceC2924g, this);
    }

    /* renamed from: g */
    public AbstractC2999M mo10834g() {
        return new C3005T(this);
    }
}
