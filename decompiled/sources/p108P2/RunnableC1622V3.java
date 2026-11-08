package p108P2;

/* renamed from: P2.V3 */
/* loaded from: classes.dex */
public final class RunnableC1622V3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f4960a;

    /* renamed from: b */
    public final /* synthetic */ BinderC1699e4 f4961b;

    public RunnableC1622V3(BinderC1699e4 binderC1699e4, C1482E7 c1482e7) {
        this.f4960a = c1482e7;
        this.f4961b = binderC1699e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        BinderC1699e4 binderC1699e4 = this.f4961b;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        c1828s72 = binderC1699e4.f5111a;
        c1828s72.m6338g0(this.f4960a);
    }
}
