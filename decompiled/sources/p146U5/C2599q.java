package p146U5;

import p132S5.AbstractC2332I;
import p146U5.InterfaceC2602t;
import p371w5.C6934q;
import p392z5.InterfaceC7161i;

/* renamed from: U5.q */
/* loaded from: classes2.dex */
public final class C2599q extends AbstractC2587e implements InterfaceC2600r {
    public C2599q(InterfaceC7161i interfaceC7161i, InterfaceC2586d interfaceC2586d) {
        super(interfaceC7161i, interfaceC2586d, true, true);
    }

    @Override // p132S5.AbstractC2367a
    /* renamed from: O0 */
    public void mo8057O0(Throwable th, boolean z6) {
        if (m8846R0().mo8781k(th) || z6) {
            return;
        }
        AbstractC2332I.m7992a(getContext(), th);
    }

    @Override // p132S5.AbstractC2367a
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public void mo8058P0(C6934q c6934q) {
        InterfaceC2602t.a.m8883a(m8846R0(), null, 1, null);
    }

    @Override // p132S5.AbstractC2367a, p132S5.C2321C0, p132S5.InterfaceC2409u0
    public boolean isActive() {
        return super.isActive();
    }
}
