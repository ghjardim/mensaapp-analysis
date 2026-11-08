package p108P2;

/* renamed from: P2.Y3 */
/* loaded from: classes.dex */
public final class RunnableC1646Y3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1519J f5004a;

    /* renamed from: b */
    public final /* synthetic */ C1482E7 f5005b;

    /* renamed from: c */
    public final /* synthetic */ BinderC1699e4 f5006c;

    public RunnableC1646Y3(BinderC1699e4 binderC1699e4, C1519J c1519j, C1482E7 c1482e7) {
        this.f5004a = c1519j;
        this.f5005b = c1482e7;
        this.f5006c = binderC1699e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1519J c1519j = this.f5004a;
        C1482E7 c1482e7 = this.f5005b;
        BinderC1699e4 binderC1699e4 = this.f5006c;
        binderC1699e4.m6039a0(binderC1699e4.m6048g0(c1519j, c1482e7), c1482e7);
    }
}
