package p108P2;

/* renamed from: P2.i5 */
/* loaded from: classes.dex */
public final class RunnableC1736i5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1771m4 f5157a;

    /* renamed from: b */
    public final /* synthetic */ long f5158b;

    /* renamed from: c */
    public final /* synthetic */ boolean f5159c;

    /* renamed from: d */
    public final /* synthetic */ C1799p5 f5160d;

    public RunnableC1736i5(C1799p5 c1799p5, C1771m4 c1771m4, long j7, boolean z6) {
        this.f5157a = c1771m4;
        this.f5158b = j7;
        this.f5159c = z6;
        this.f5160d = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1799p5 c1799p5 = this.f5160d;
        C1771m4 c1771m4 = this.f5157a;
        c1799p5.m6203X(c1771m4);
        C1799p5.m6175r(c1799p5, c1771m4, this.f5158b, true, this.f5159c);
    }
}
