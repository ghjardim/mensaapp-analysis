package p132S5;

import java.util.concurrent.Future;

/* renamed from: S5.l */
/* loaded from: classes2.dex */
public final class C2390l implements InterfaceC2392m {

    /* renamed from: a */
    public final Future f7138a;

    public C2390l(Future future) {
        this.f7138a = future;
    }

    @Override // p132S5.InterfaceC2392m
    /* renamed from: a */
    public void mo8060a(Throwable th) {
        if (th != null) {
            this.f7138a.cancel(false);
        }
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f7138a + ']';
    }
}
