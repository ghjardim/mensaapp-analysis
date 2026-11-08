package p256j$.util.stream;

/* renamed from: j$.util.stream.K3 */
/* loaded from: classes3.dex */
final class RunnableC5087K3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f18412a;

    /* renamed from: b */
    final /* synthetic */ Runnable f18413b;

    RunnableC5087K3(Runnable runnable, Runnable runnable2) {
        this.f18412a = runnable;
        this.f18413b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f18413b;
        try {
            this.f18412a.run();
            runnable.run();
        } catch (Throwable th) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
