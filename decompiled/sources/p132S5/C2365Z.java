package p132S5;

import java.util.concurrent.Future;

/* renamed from: S5.Z */
/* loaded from: classes2.dex */
public final class C2365Z implements InterfaceC2368a0 {

    /* renamed from: a */
    public final Future f7096a;

    public C2365Z(Future future) {
        this.f7096a = future;
    }

    @Override // p132S5.InterfaceC2368a0
    /* renamed from: b */
    public void mo7864b() {
        this.f7096a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f7096a + ']';
    }
}
