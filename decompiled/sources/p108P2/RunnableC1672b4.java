package p108P2;

/* renamed from: P2.b4 */
/* loaded from: classes.dex */
public final class RunnableC1672b4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1891z7 f5044a;

    /* renamed from: b */
    public final /* synthetic */ C1482E7 f5045b;

    /* renamed from: c */
    public final /* synthetic */ BinderC1699e4 f5046c;

    public RunnableC1672b4(BinderC1699e4 binderC1699e4, C1891z7 c1891z7, C1482E7 c1482e7) {
        this.f5044a = c1891z7;
        this.f5045b = c1482e7;
        this.f5046c = binderC1699e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1828s7 c1828s7;
        C1828s7 c1828s72;
        C1828s7 c1828s73;
        BinderC1699e4 binderC1699e4 = this.f5046c;
        c1828s7 = binderC1699e4.f5111a;
        c1828s7.m6352q();
        C1891z7 c1891z7 = this.f5044a;
        if (c1891z7.m6595x0() == null) {
            C1482E7 c1482e7 = this.f5045b;
            c1828s73 = binderC1699e4.f5111a;
            c1828s73.m6336f0(c1891z7.f5639b, c1482e7);
        } else {
            C1482E7 c1482e72 = this.f5045b;
            c1828s72 = binderC1699e4.f5111a;
            c1828s72.m6355r0(c1891z7, c1482e72);
        }
    }
}
