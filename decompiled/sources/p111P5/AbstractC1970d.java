package p111P5;

import kotlin.jvm.internal.AbstractC5469l;

/* renamed from: P5.d */
/* loaded from: classes2.dex */
public abstract class AbstractC1970d {
    /* renamed from: a */
    public static final Object m7024a(InterfaceC1969c interfaceC1969c, Object obj) {
        AbstractC5469l.m23028e(interfaceC1969c, "<this>");
        if (interfaceC1969c.mo7023e(obj)) {
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + interfaceC1969c.mo7021a());
    }
}
