package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.W3 */
/* loaded from: classes.dex */
public final class RunnableC1630W3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f4973a;

    /* renamed from: b */
    public final /* synthetic */ BinderC1699e4 f4974b;

    public RunnableC1630W3(BinderC1699e4 binderC1699e4, C1482E7 c1482e7) {
        this.f4973a = c1482e7;
        this.f4974b = binderC1699e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        BinderC1699e4 binderC1699e4 = this.f4974b;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s72 = binderC1699e4.f5111a;
        c1828s72.mo5628f().mo5762h();
        c1828s72.m6354r();
        C1482E7 c1482e7 = this.f4973a;
        AbstractC3802r.m15123e(c1482e7.f4640a);
        c1828s72.m6343j0(c1482e7);
        c1828s72.m6340h0(c1482e7);
    }
}
