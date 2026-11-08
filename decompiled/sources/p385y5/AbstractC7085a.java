package p385y5;

import kotlin.jvm.internal.AbstractC5469l;
import p069J5.InterfaceC0800l;

/* renamed from: y5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC7085a {
    /* renamed from: a */
    public static int m29183a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: b */
    public static int m29184b(Object obj, Object obj2, InterfaceC0800l... selectors) {
        AbstractC5469l.m23028e(selectors, "selectors");
        if (selectors.length > 0) {
            return m29185c(obj, obj2, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* renamed from: c */
    public static final int m29185c(Object obj, Object obj2, InterfaceC0800l[] interfaceC0800lArr) {
        for (InterfaceC0800l interfaceC0800l : interfaceC0800lArr) {
            int m29183a = m29183a((Comparable) interfaceC0800l.invoke(obj), (Comparable) interfaceC0800l.invoke(obj2));
            if (m29183a != 0) {
                return m29183a;
            }
        }
        return 0;
    }
}
