package p167X5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p132S5.InterfaceC2335J0;
import p392z5.InterfaceC7161i;

/* renamed from: X5.D */
/* loaded from: classes2.dex */
public abstract class AbstractC2843D extends AbstractC2860e implements InterfaceC2335J0 {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8805d = AtomicIntegerFieldUpdater.newUpdater(AbstractC2843D.class, "cleanedAndPointers$volatile");

    /* renamed from: c */
    public final long f8806c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC2843D(long j7, AbstractC2843D abstractC2843D, int i7) {
        super(abstractC2843D);
        this.f8806c = j7;
        this.cleanedAndPointers$volatile = i7 << 16;
    }

    @Override // p167X5.AbstractC2860e
    /* renamed from: k */
    public boolean mo10254k() {
        return f8805d.get(this) == mo8866r() && !m10318l();
    }

    /* renamed from: p */
    public final boolean m10255p() {
        return f8805d.addAndGet(this, -65536) == mo8866r() && !m10318l();
    }

    /* renamed from: r */
    public abstract int mo8866r();

    /* renamed from: s */
    public abstract void mo8867s(int i7, Throwable th, InterfaceC7161i interfaceC7161i);

    /* renamed from: t */
    public final void m10256t() {
        if (f8805d.incrementAndGet(this) == mo8866r()) {
            m10320n();
        }
    }

    /* renamed from: u */
    public final boolean m10257u() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8805d;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == mo8866r() && !m10318l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
