package p108P2;

/* renamed from: P2.N3 */
/* loaded from: classes.dex */
public final class RunnableC1559N3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1739j f4846a;

    /* renamed from: b */
    public final /* synthetic */ C1482E7 f4847b;

    /* renamed from: c */
    public final /* synthetic */ BinderC1699e4 f4848c;

    public RunnableC1559N3(BinderC1699e4 binderC1699e4, C1739j c1739j, C1482E7 c1482e7) {
        this.f4846a = c1739j;
        this.f4847b = c1482e7;
        this.f4848c = binderC1699e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        C1828s7 c1828s73;
        BinderC1699e4 binderC1699e4 = this.f4848c;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        C1739j c1739j = this.f4846a;
        if (c1739j.f5171c.m6595x0() == null) {
            C1482E7 c1482e7 = this.f4847b;
            c1828s73 = binderC1699e4.f5111a;
            c1828s73.m6335e0(c1739j, c1482e7);
        } else {
            C1482E7 c1482e72 = this.f4847b;
            c1828s72 = binderC1699e4.f5111a;
            c1828s72.m6348n0(c1739j, c1482e72);
        }
    }
}
