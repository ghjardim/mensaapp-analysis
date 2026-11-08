package p108P2;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.Q5 */
/* loaded from: classes.dex */
public final class BinderC1585Q5 extends AbstractBinderC1850v2 {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f4900a;

    public BinderC1585Q5(C1836t6 c1836t6, AtomicReference atomicReference) {
        this.f4900a = atomicReference;
    }

    @Override // p108P2.InterfaceC1859w2
    public final void zze(List list) {
        AtomicReference atomicReference = this.f4900a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
