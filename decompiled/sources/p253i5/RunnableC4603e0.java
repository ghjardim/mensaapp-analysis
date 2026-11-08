package p253i5;

import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2932o;
import p171Y2.AbstractC2942y;

/* renamed from: i5.e0 */
/* loaded from: classes2.dex */
public final class RunnableC4603e0 implements Runnable {

    /* renamed from: b */
    public static final Logger f16816b = Logger.getLogger(RunnableC4603e0.class.getName());

    /* renamed from: a */
    public final Runnable f16817a;

    public RunnableC4603e0(Runnable runnable) {
        this.f16817a = (Runnable) AbstractC2932o.m10573p(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f16817a.run();
        } catch (Throwable th) {
            f16816b.log(Level.SEVERE, "Exception while executing runnable " + this.f16817a, th);
            AbstractC2942y.m10620f(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f16817a + ")";
    }
}
