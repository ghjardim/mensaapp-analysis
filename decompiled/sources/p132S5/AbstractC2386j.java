package p132S5;

import p069J5.InterfaceC0804p;
import p392z5.C7162j;
import p392z5.InterfaceC7158f;
import p392z5.InterfaceC7161i;

/* renamed from: S5.j */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2386j {
    /* renamed from: a */
    public static final Object m8122a(InterfaceC7161i interfaceC7161i, InterfaceC0804p interfaceC0804p) {
        AbstractC2377e0 m8024a;
        InterfaceC7161i m7976d;
        Thread currentThread = Thread.currentThread();
        InterfaceC7158f interfaceC7158f = (InterfaceC7158f) interfaceC7161i.get(InterfaceC7158f.f25437m);
        if (interfaceC7158f == null) {
            m8024a = C2352S0.f7083a.m8025b();
            m7976d = AbstractC2326F.m7976d(C2395n0.f7141a, interfaceC7161i.plus(m8024a));
        } else {
            AbstractC2377e0 abstractC2377e0 = interfaceC7158f instanceof AbstractC2377e0 ? (AbstractC2377e0) interfaceC7158f : null;
            if (abstractC2377e0 != null) {
                AbstractC2377e0 abstractC2377e02 = abstractC2377e0.m8083q0() ? abstractC2377e0 : null;
                if (abstractC2377e02 != null) {
                    m8024a = abstractC2377e02;
                    m7976d = AbstractC2326F.m7976d(C2395n0.f7141a, interfaceC7161i);
                }
            }
            m8024a = C2352S0.f7083a.m8024a();
            m7976d = AbstractC2326F.m7976d(C2395n0.f7141a, interfaceC7161i);
        }
        C2380g c2380g = new C2380g(m7976d, currentThread, m8024a);
        c2380g.m8059Q0(EnumC2338L.f7068a, c2380g, interfaceC0804p);
        return c2380g.m8109R0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m8123b(InterfaceC7161i interfaceC7161i, InterfaceC0804p interfaceC0804p, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC7161i = C7162j.f25439a;
        }
        return AbstractC2384i.m8116e(interfaceC7161i, interfaceC0804p);
    }
}
