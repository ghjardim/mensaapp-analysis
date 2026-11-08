package p108P2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.Z4 */
/* loaded from: classes.dex */
public final class RunnableC1655Z4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f5021a;

    /* renamed from: b */
    public final /* synthetic */ String f5022b;

    /* renamed from: c */
    public final /* synthetic */ String f5023c;

    /* renamed from: d */
    public final /* synthetic */ boolean f5024d;

    /* renamed from: e */
    public final /* synthetic */ C1799p5 f5025e;

    public RunnableC1655Z4(C1799p5 c1799p5, AtomicReference atomicReference, String str, String str2, String str3, boolean z6) {
        this.f5021a = atomicReference;
        this.f5022b = str2;
        this.f5023c = str3;
        this.f5024d = z6;
        this.f5025e = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5025e.f5129a.m5617O().m6420y(this.f5021a, null, this.f5022b, this.f5023c, this.f5024d);
    }
}
