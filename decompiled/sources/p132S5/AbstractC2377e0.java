package p132S5;

import p378x5.C7016g;

/* renamed from: S5.e0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2377e0 extends AbstractC2328G {

    /* renamed from: c */
    public long f7111c;

    /* renamed from: d */
    public boolean f7112d;

    /* renamed from: e */
    public C7016g f7113e;

    /* renamed from: M */
    public static /* synthetic */ void m8072M(AbstractC2377e0 abstractC2377e0, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        abstractC2377e0.m8074K(z6);
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m8073c0(AbstractC2377e0 abstractC2377e0, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        abstractC2377e0.m8078T(z6);
    }

    /* renamed from: K */
    public final void m8074K(boolean z6) {
        long m8075N = this.f7111c - m8075N(z6);
        this.f7111c = m8075N;
        if (m8075N <= 0 && this.f7112d) {
            shutdown();
        }
    }

    /* renamed from: N */
    public final long m8075N(boolean z6) {
        return z6 ? 4294967296L : 1L;
    }

    /* renamed from: R */
    public final void m8076R(AbstractC2359W abstractC2359W) {
        C7016g c7016g = this.f7113e;
        if (c7016g == null) {
            c7016g = new C7016g();
            this.f7113e = c7016g;
        }
        c7016g.addLast(abstractC2359W);
    }

    /* renamed from: S */
    public long mo8077S() {
        C7016g c7016g = this.f7113e;
        return (c7016g == null || c7016g.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: T */
    public final void m8078T(boolean z6) {
        this.f7111c += m8075N(z6);
        if (z6) {
            return;
        }
        this.f7112d = true;
    }

    /* renamed from: d0 */
    public final boolean m8079d0() {
        return this.f7111c >= m8075N(true);
    }

    /* renamed from: f0 */
    public final boolean m8080f0() {
        C7016g c7016g = this.f7113e;
        if (c7016g != null) {
            return c7016g.isEmpty();
        }
        return true;
    }

    /* renamed from: k0 */
    public abstract long mo8081k0();

    /* renamed from: l0 */
    public final boolean m8082l0() {
        AbstractC2359W abstractC2359W;
        C7016g c7016g = this.f7113e;
        if (c7016g == null || (abstractC2359W = (AbstractC2359W) c7016g.m28788o()) == null) {
            return false;
        }
        abstractC2359W.run();
        return true;
    }

    /* renamed from: q0 */
    public boolean m8083q0() {
        return false;
    }

    public abstract void shutdown();
}
