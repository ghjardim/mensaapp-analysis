package p132S5;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0064h;
import p069J5.InterfaceC0804p;
import p167X5.C2842C;
import p167X5.C2862g;
import p174Y5.AbstractC2957b;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: S5.K */
/* loaded from: classes2.dex */
public abstract class AbstractC2336K {
    /* renamed from: a */
    public static final InterfaceC2334J m7996a(InterfaceC7161i interfaceC7161i) {
        InterfaceC2418z m7850b;
        if (interfaceC7161i.get(InterfaceC2409u0.f7157j) == null) {
            m7850b = AbstractC2317A0.m7850b(null, 1, null);
            interfaceC7161i = interfaceC7161i.plus(m7850b);
        }
        return new C2862g(interfaceC7161i);
    }

    /* renamed from: b */
    public static final InterfaceC2334J m7997b() {
        return new C2862g(AbstractC2349Q0.m8020b(null, 1, null).plus(C2363Y.m8055c()));
    }

    /* renamed from: c */
    public static final Object m7998c(InterfaceC0804p interfaceC0804p, InterfaceC7157e interfaceC7157e) {
        C2842C c2842c = new C2842C(interfaceC7157e.getContext(), interfaceC7157e);
        Object m10660b = AbstractC2957b.m10660b(c2842c, c2842c, interfaceC0804p);
        if (m10660b == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m10660b;
    }

    /* renamed from: d */
    public static final void m7999d(InterfaceC2334J interfaceC2334J) {
        AbstractC2417y0.m8200i(interfaceC2334J.mo7995l());
    }

    /* renamed from: e */
    public static final boolean m8000e(InterfaceC2334J interfaceC2334J) {
        InterfaceC2409u0 interfaceC2409u0 = (InterfaceC2409u0) interfaceC2334J.mo7995l().get(InterfaceC2409u0.f7157j);
        if (interfaceC2409u0 != null) {
            return interfaceC2409u0.isActive();
        }
        return true;
    }
}
