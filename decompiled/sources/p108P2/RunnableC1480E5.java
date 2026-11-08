package p108P2;

/* renamed from: P2.E5 */
/* loaded from: classes.dex */
public final class RunnableC1480E5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1462C5 f4619a;

    /* renamed from: b */
    public final /* synthetic */ C1462C5 f4620b;

    /* renamed from: c */
    public final /* synthetic */ long f4621c;

    /* renamed from: d */
    public final /* synthetic */ boolean f4622d;

    /* renamed from: e */
    public final /* synthetic */ C1525J5 f4623e;

    public RunnableC1480E5(C1525J5 c1525j5, C1462C5 c1462c5, C1462C5 c1462c52, long j7, boolean z6) {
        this.f4619a = c1462c5;
        this.f4620b = c1462c52;
        this.f4621c = j7;
        this.f4622d = z6;
        this.f4623e = c1525j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4623e.m5880p(this.f4619a, this.f4620b, this.f4621c, this.f4622d, null);
    }
}
