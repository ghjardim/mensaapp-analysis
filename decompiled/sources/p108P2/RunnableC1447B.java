package p108P2;

/* renamed from: P2.B */
/* loaded from: classes.dex */
public final class RunnableC1447B implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f4513a;

    /* renamed from: b */
    public final /* synthetic */ long f4514b;

    /* renamed from: c */
    public final /* synthetic */ C1475E0 f4515c;

    public RunnableC1447B(C1475E0 c1475e0, String str, long j7) {
        this.f4513a = str;
        this.f4514b = j7;
        this.f4515c = c1475e0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1475E0.m5742j(this.f4515c, this.f4513a, this.f4514b);
    }
}
