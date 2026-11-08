package p132S5;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC5469l;
import p392z5.InterfaceC7161i;

/* renamed from: S5.g */
/* loaded from: classes2.dex */
public final class C2380g extends AbstractC2367a {

    /* renamed from: d */
    public final Thread f7131d;

    /* renamed from: e */
    public final AbstractC2377e0 f7132e;

    public C2380g(InterfaceC7161i interfaceC7161i, Thread thread, AbstractC2377e0 abstractC2377e0) {
        super(interfaceC7161i, true, true);
        this.f7131d = thread;
        this.f7132e = abstractC2377e0;
    }

    @Override // p132S5.C2321C0
    /* renamed from: E */
    public void mo7883E(Object obj) {
        if (AbstractC5469l.m23024a(Thread.currentThread(), this.f7131d)) {
            return;
        }
        Thread thread = this.f7131d;
        AbstractC2372c.m8061a();
        LockSupport.unpark(thread);
    }

    /* renamed from: R0 */
    public final Object m8109R0() {
        AbstractC2372c.m8061a();
        try {
            AbstractC2377e0 abstractC2377e0 = this.f7132e;
            if (abstractC2377e0 != null) {
                AbstractC2377e0.m8073c0(abstractC2377e0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC2377e0 abstractC2377e02 = this.f7132e;
                    long mo8081k0 = abstractC2377e02 != null ? abstractC2377e02.mo8081k0() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        AbstractC2377e0 abstractC2377e03 = this.f7132e;
                        if (abstractC2377e03 != null) {
                            AbstractC2377e0.m8072M(abstractC2377e03, false, 1, null);
                        }
                        AbstractC2372c.m8061a();
                        Object m7968h = AbstractC2323D0.m7968h(m7914b0());
                        C2318B c2318b = m7968h instanceof C2318B ? (C2318B) m7968h : null;
                        if (c2318b == null) {
                            return m7968h;
                        }
                        throw c2318b.f7023a;
                    }
                    AbstractC2372c.m8061a();
                    LockSupport.parkNanos(this, mo8081k0);
                } catch (Throwable th) {
                    AbstractC2377e0 abstractC2377e04 = this.f7132e;
                    if (abstractC2377e04 != null) {
                        AbstractC2377e0.m8072M(abstractC2377e04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m7888H(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC2372c.m8061a();
            throw th2;
        }
    }

    @Override // p132S5.C2321C0
    /* renamed from: i0 */
    public boolean mo7919i0() {
        return true;
    }
}
