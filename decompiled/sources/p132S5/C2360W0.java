package p132S5;

import p207d.AbstractC4094d;
import p392z5.InterfaceC7161i;

/* renamed from: S5.W0 */
/* loaded from: classes2.dex */
public final class C2360W0 extends AbstractC2328G {

    /* renamed from: c */
    public static final C2360W0 f7089c = new C2360W0();

    @Override // p132S5.AbstractC2328G
    /* renamed from: D */
    public void mo7983D(InterfaceC7161i interfaceC7161i, Runnable runnable) {
        AbstractC4094d.m17162a(interfaceC7161i.get(AbstractC2369a1.f7098b));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // p132S5.AbstractC2328G
    /* renamed from: F */
    public boolean mo7984F(InterfaceC7161i interfaceC7161i) {
        return false;
    }

    @Override // p132S5.AbstractC2328G
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
