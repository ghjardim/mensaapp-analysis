package p108P2;

import java.util.concurrent.Callable;

/* renamed from: P2.J3 */
/* loaded from: classes.dex */
public final class CallableC1523J3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f4766a;

    /* renamed from: b */
    public final /* synthetic */ BinderC1699e4 f4767b;

    public CallableC1523J3(BinderC1699e4 binderC1699e4, String str) {
        this.f4766a = str;
        this.f4767b = binderC1699e4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        BinderC1699e4 binderC1699e4 = this.f4767b;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s72 = binderC1699e4.f5111a;
        return c1828s72.m6303E0().m6530q(this.f4766a);
    }
}
