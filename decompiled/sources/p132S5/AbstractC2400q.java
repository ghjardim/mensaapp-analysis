package p132S5;

import p167X5.C2866k;
import p392z5.InterfaceC7157e;

/* renamed from: S5.q */
/* loaded from: classes2.dex */
public abstract class AbstractC2400q {
    /* renamed from: a */
    public static final void m8173a(InterfaceC2394n interfaceC2394n, InterfaceC2368a0 interfaceC2368a0) {
        m8175c(interfaceC2394n, new C2371b0(interfaceC2368a0));
    }

    /* renamed from: b */
    public static final C2396o m8174b(InterfaceC7157e interfaceC7157e) {
        if (!(interfaceC7157e instanceof C2866k)) {
            return new C2396o(interfaceC7157e, 1);
        }
        C2396o m10329k = ((C2866k) interfaceC7157e).m10329k();
        if (m10329k != null) {
            if (!m10329k.m8155N()) {
                m10329k = null;
            }
            if (m10329k != null) {
                return m10329k;
            }
        }
        return new C2396o(interfaceC7157e, 2);
    }

    /* renamed from: c */
    public static final void m8175c(InterfaceC2394n interfaceC2394n, InterfaceC2392m interfaceC2392m) {
        if (!(interfaceC2394n instanceof C2396o)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C2396o) interfaceC2394n).m8150H(interfaceC2392m);
    }
}
