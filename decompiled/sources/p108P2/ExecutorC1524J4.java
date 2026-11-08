package p108P2;

import java.util.concurrent.Executor;

/* renamed from: P2.J4 */
/* loaded from: classes.dex */
public final class ExecutorC1524J4 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ C1799p5 f4768a;

    public ExecutorC1524J4(C1799p5 c1799p5) {
        this.f4768a = c1799p5;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4768a.f5129a.mo5628f().m6446A(runnable);
    }
}
