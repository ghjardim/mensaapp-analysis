package p132S5;

import p069J5.InterfaceC0800l;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p392z5.InterfaceC7157e;

/* renamed from: S5.E */
/* loaded from: classes2.dex */
public abstract class AbstractC2324E {
    /* renamed from: a */
    public static final Object m7969a(Object obj, InterfaceC7157e interfaceC7157e) {
        if (!(obj instanceof C2318B)) {
            return C6927j.m28373b(obj);
        }
        C6927j.a aVar = C6927j.f24803b;
        return C6927j.m28373b(AbstractC6928k.m28381a(((C2318B) obj).f7023a));
    }

    /* renamed from: b */
    public static final Object m7970b(Object obj, InterfaceC0800l interfaceC0800l) {
        Throwable m28375d = C6927j.m28375d(obj);
        return m28375d == null ? interfaceC0800l != null ? new C2320C(obj, interfaceC0800l) : obj : new C2318B(m28375d, false, 2, null);
    }

    /* renamed from: c */
    public static final Object m7971c(Object obj, InterfaceC2394n interfaceC2394n) {
        Throwable m28375d = C6927j.m28375d(obj);
        return m28375d == null ? obj : new C2318B(m28375d, false, 2, null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m7972d(Object obj, InterfaceC0800l interfaceC0800l, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            interfaceC0800l = null;
        }
        return m7970b(obj, interfaceC0800l);
    }
}
