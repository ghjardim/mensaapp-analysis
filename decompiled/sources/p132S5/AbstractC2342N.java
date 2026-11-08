package p132S5;

import p167X5.C2866k;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p392z5.InterfaceC7157e;

/* renamed from: S5.N */
/* loaded from: classes2.dex */
public abstract class AbstractC2342N {
    /* renamed from: a */
    public static final String m8004a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m8005b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m8006c(InterfaceC7157e interfaceC7157e) {
        Object m28373b;
        if (interfaceC7157e instanceof C2866k) {
            return interfaceC7157e.toString();
        }
        try {
            C6927j.a aVar = C6927j.f24803b;
            m28373b = C6927j.m28373b(interfaceC7157e + '@' + m8005b(interfaceC7157e));
        } catch (Throwable th) {
            C6927j.a aVar2 = C6927j.f24803b;
            m28373b = C6927j.m28373b(AbstractC6928k.m28381a(th));
        }
        if (C6927j.m28375d(m28373b) != null) {
            m28373b = interfaceC7157e.getClass().getName() + '@' + m8005b(interfaceC7157e);
        }
        return (String) m28373b;
    }
}
