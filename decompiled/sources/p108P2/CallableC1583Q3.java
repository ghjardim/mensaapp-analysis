package p108P2;

import java.util.concurrent.Callable;

/* renamed from: P2.Q3 */
/* loaded from: classes.dex */
public final class CallableC1583Q3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f4887a;

    /* renamed from: b */
    public final /* synthetic */ String f4888b;

    /* renamed from: c */
    public final /* synthetic */ String f4889c;

    /* renamed from: d */
    public final /* synthetic */ BinderC1699e4 f4890d;

    public CallableC1583Q3(BinderC1699e4 binderC1699e4, String str, String str2, String str3) {
        this.f4887a = str;
        this.f4888b = str2;
        this.f4889c = str3;
        this.f4890d = binderC1699e4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        BinderC1699e4 binderC1699e4 = this.f4890d;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s72 = binderC1699e4.f5111a;
        return c1828s72.m6303E0().m6532r(this.f4887a, this.f4888b, this.f4889c);
    }
}
