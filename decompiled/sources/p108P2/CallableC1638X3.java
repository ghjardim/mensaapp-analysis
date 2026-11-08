package p108P2;

import java.util.concurrent.Callable;

/* renamed from: P2.X3 */
/* loaded from: classes.dex */
public final class CallableC1638X3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f4986a;

    /* renamed from: b */
    public final /* synthetic */ BinderC1699e4 f4987b;

    public CallableC1638X3(BinderC1699e4 binderC1699e4, C1482E7 c1482e7) {
        this.f4986a = c1482e7;
        this.f4987b = binderC1699e4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        BinderC1699e4 binderC1699e4 = this.f4987b;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        C1482E7 c1482e7 = this.f4986a;
        c1828s72 = binderC1699e4.f5111a;
        return new C1802q(c1828s72.m6371z0(c1482e7.f4640a));
    }
}
