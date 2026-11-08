package p108P2;

/* renamed from: P2.a */
/* loaded from: classes.dex */
public final class RunnableC1658a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f5028a;

    /* renamed from: b */
    public final /* synthetic */ long f5029b;

    /* renamed from: c */
    public final /* synthetic */ C1475E0 f5030c;

    public RunnableC1658a(C1475E0 c1475e0, String str, long j7) {
        this.f5028a = str;
        this.f5029b = j7;
        this.f5030c = c1475e0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1475E0.m5741i(this.f5030c, this.f5028a, this.f5029b);
    }
}
