package p108P2;

/* renamed from: P2.S4 */
/* loaded from: classes.dex */
public final class RunnableC1599S4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f4927a;

    /* renamed from: b */
    public final /* synthetic */ String f4928b;

    /* renamed from: c */
    public final /* synthetic */ Object f4929c;

    /* renamed from: d */
    public final /* synthetic */ long f4930d;

    /* renamed from: e */
    public final /* synthetic */ C1799p5 f4931e;

    public RunnableC1599S4(C1799p5 c1799p5, String str, String str2, Object obj, long j7) {
        this.f4927a = str;
        this.f4928b = str2;
        this.f4929c = obj;
        this.f4930d = j7;
        this.f4931e = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4931e.m6207b0(this.f4927a, this.f4928b, this.f4929c, this.f4930d);
    }
}
