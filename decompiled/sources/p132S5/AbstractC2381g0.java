package p132S5;

import java.util.concurrent.locks.LockSupport;
import p132S5.AbstractC2379f0;

/* renamed from: S5.g0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2381g0 extends AbstractC2377e0 {
    /* renamed from: x0 */
    public abstract Thread mo8014x0();

    /* renamed from: y0 */
    public void mo8016y0(long j7, AbstractC2379f0.c cVar) {
        RunnableC2344O.f7079p.m8097L0(j7, cVar);
    }

    /* renamed from: z0 */
    public final void m8110z0() {
        Thread mo8014x0 = mo8014x0();
        if (Thread.currentThread() != mo8014x0) {
            AbstractC2372c.m8061a();
            LockSupport.unpark(mo8014x0);
        }
    }
}
