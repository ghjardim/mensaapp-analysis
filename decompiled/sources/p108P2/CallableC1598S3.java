package p108P2;

import java.util.concurrent.Callable;

/* renamed from: P2.S3 */
/* loaded from: classes.dex */
public final class CallableC1598S3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f4923a;

    /* renamed from: b */
    public final /* synthetic */ String f4924b;

    /* renamed from: c */
    public final /* synthetic */ String f4925c;

    /* renamed from: d */
    public final /* synthetic */ BinderC1699e4 f4926d;

    public CallableC1598S3(BinderC1699e4 binderC1699e4, String str, String str2, String str3) {
        this.f4923a = str;
        this.f4924b = str2;
        this.f4925c = str3;
        this.f4926d = binderC1699e4;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        BinderC1699e4 binderC1699e4 = this.f4926d;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s72 = binderC1699e4.f5111a;
        return c1828s72.m6303E0().m6526n(this.f4923a, this.f4924b, this.f4925c);
    }
}
