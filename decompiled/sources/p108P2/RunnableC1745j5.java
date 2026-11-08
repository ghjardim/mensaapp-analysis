package p108P2;

/* renamed from: P2.j5 */
/* loaded from: classes.dex */
public final class RunnableC1745j5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1771m4 f5188a;

    /* renamed from: b */
    public final /* synthetic */ long f5189b;

    /* renamed from: c */
    public final /* synthetic */ boolean f5190c;

    /* renamed from: d */
    public final /* synthetic */ C1799p5 f5191d;

    public RunnableC1745j5(C1799p5 c1799p5, C1771m4 c1771m4, long j7, boolean z6) {
        this.f5188a = c1771m4;
        this.f5189b = j7;
        this.f5190c = z6;
        this.f5191d = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1799p5 c1799p5 = this.f5191d;
        C1771m4 c1771m4 = this.f5188a;
        c1799p5.m6203X(c1771m4);
        C1799p5.m6175r(c1799p5, c1771m4, this.f5189b, false, this.f5190c);
    }
}
