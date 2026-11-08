package p108P2;

/* renamed from: P2.O4 */
/* loaded from: classes.dex */
public final class RunnableC1568O4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f4860a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f4861b;

    public RunnableC1568O4(C1799p5 c1799p5, long j7) {
        this.f4860a = j7;
        this.f4861b = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1460C3 c1460c3 = this.f4861b.f5129a;
        C1645Y2 c1645y2 = c1460c3.m5611H().f5072m;
        long j7 = this.f4860a;
        c1645y2.m5980b(j7);
        c1460c3.mo5624b().m5935q().m5903b("Session timeout duration set", Long.valueOf(j7));
    }
}
