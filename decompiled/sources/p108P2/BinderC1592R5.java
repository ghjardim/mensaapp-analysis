package p108P2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.R5 */
/* loaded from: classes.dex */
public final class BinderC1592R5 extends AbstractBinderC1877y2 {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f4918a;

    /* renamed from: b */
    public final /* synthetic */ C1836t6 f4919b;

    public BinderC1592R5(C1836t6 c1836t6, AtomicReference atomicReference) {
        this.f4918a = atomicReference;
        this.f4919b = c1836t6;
    }

    @Override // p108P2.InterfaceC1886z2
    /* renamed from: p */
    public final void mo5960p(C1675b7 c1675b7) {
        AtomicReference atomicReference = this.f4918a;
        synchronized (atomicReference) {
            this.f4919b.f5129a.mo5624b().m5940v().m5903b("[sgtm] Got upload batches from service. count", Integer.valueOf(c1675b7.f5053a.size()));
            atomicReference.set(c1675b7);
            atomicReference.notifyAll();
        }
    }
}
