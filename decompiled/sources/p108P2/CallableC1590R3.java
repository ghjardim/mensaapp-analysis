package p108P2;

import java.util.concurrent.Callable;

/* renamed from: P2.R3 */
/* loaded from: classes.dex */
public final class CallableC1590R3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f4909a;

    /* renamed from: b */
    public final /* synthetic */ String f4910b;

    /* renamed from: c */
    public final /* synthetic */ String f4911c;

    /* renamed from: d */
    public final /* synthetic */ BinderC1699e4 f4912d;

    public CallableC1590R3(BinderC1699e4 binderC1699e4, String str, String str2, String str3) {
        this.f4909a = str;
        this.f4910b = str2;
        this.f4911c = str3;
        this.f4912d = binderC1699e4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        BinderC1699e4 binderC1699e4 = this.f4912d;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s72 = binderC1699e4.f5111a;
        return c1828s72.m6303E0().m6532r(this.f4909a, this.f4910b, this.f4911c);
    }
}
