package p108P2;

import android.os.Bundle;

/* renamed from: P2.D5 */
/* loaded from: classes.dex */
public final class RunnableC1471D5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f4587a;

    /* renamed from: b */
    public final /* synthetic */ C1462C5 f4588b;

    /* renamed from: c */
    public final /* synthetic */ C1462C5 f4589c;

    /* renamed from: d */
    public final /* synthetic */ long f4590d;

    /* renamed from: e */
    public final /* synthetic */ C1525J5 f4591e;

    public RunnableC1471D5(C1525J5 c1525j5, Bundle bundle, C1462C5 c1462c5, C1462C5 c1462c52, long j7) {
        this.f4587a = bundle;
        this.f4588b = c1462c5;
        this.f4589c = c1462c52;
        this.f4590d = j7;
        this.f4591e = c1525j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1525J5.m5870x(this.f4591e, this.f4587a, this.f4588b, this.f4589c, this.f4590d);
    }
}
