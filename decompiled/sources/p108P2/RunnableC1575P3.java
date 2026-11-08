package p108P2;

/* renamed from: P2.P3 */
/* loaded from: classes.dex */
public final class RunnableC1575P3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1739j f4871a;

    /* renamed from: b */
    public final /* synthetic */ BinderC1699e4 f4872b;

    public RunnableC1575P3(BinderC1699e4 binderC1699e4, C1739j c1739j) {
        this.f4871a = c1739j;
        this.f4872b = binderC1699e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        C1828s7 c1828s73;
        BinderC1699e4 binderC1699e4 = this.f4872b;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        C1739j c1739j = this.f4871a;
        if (c1739j.f5171c.m6595x0() == null) {
            c1828s73 = binderC1699e4.f5111a;
            c1828s73.m6333d0(c1739j);
        } else {
            c1828s72 = binderC1699e4.f5111a;
            c1828s72.m6347m0(c1739j);
        }
    }
}
