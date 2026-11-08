package p108P2;

/* renamed from: P2.H5 */
/* loaded from: classes.dex */
public final class RunnableC1507H5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1462C5 f4698a;

    /* renamed from: b */
    public final /* synthetic */ long f4699b;

    /* renamed from: c */
    public final /* synthetic */ C1525J5 f4700c;

    public RunnableC1507H5(C1525J5 c1525j5, C1462C5 c1462c5, long j7) {
        this.f4698a = c1462c5;
        this.f4699b = j7;
        this.f4700c = c1525j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1525J5 c1525j5 = this.f4700c;
        c1525j5.m5881q(this.f4698a, false, this.f4699b);
        c1525j5.f4771e = null;
        c1525j5.f5129a.m5617O().m6391F(null);
    }
}
