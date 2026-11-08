package p108P2;

import java.util.concurrent.Callable;

/* renamed from: P2.T3 */
/* loaded from: classes.dex */
public final class CallableC1606T3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f4936a;

    /* renamed from: b */
    public final /* synthetic */ String f4937b;

    /* renamed from: c */
    public final /* synthetic */ String f4938c;

    /* renamed from: d */
    public final /* synthetic */ BinderC1699e4 f4939d;

    public CallableC1606T3(BinderC1699e4 binderC1699e4, String str, String str2, String str3) {
        this.f4936a = str;
        this.f4937b = str2;
        this.f4938c = str3;
        this.f4939d = binderC1699e4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        BinderC1699e4 binderC1699e4 = this.f4939d;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s72 = binderC1699e4.f5111a;
        return c1828s72.m6303E0().m6526n(this.f4936a, this.f4937b, this.f4938c);
    }
}
