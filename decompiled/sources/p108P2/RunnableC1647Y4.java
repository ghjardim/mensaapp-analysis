package p108P2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.Y4 */
/* loaded from: classes.dex */
public final class RunnableC1647Y4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f5007a;

    /* renamed from: b */
    public final /* synthetic */ String f5008b;

    /* renamed from: c */
    public final /* synthetic */ String f5009c;

    /* renamed from: d */
    public final /* synthetic */ C1799p5 f5010d;

    public RunnableC1647Y4(C1799p5 c1799p5, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f5007a = atomicReference;
        this.f5008b = str2;
        this.f5009c = str3;
        this.f5010d = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5010d.f5129a.m5617O().m6416u(this.f5007a, null, this.f5008b, this.f5009c);
    }
}
