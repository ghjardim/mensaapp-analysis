package p132S5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: S5.s0 */
/* loaded from: classes2.dex */
public final class C2405s0 extends AbstractC2413w0 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7153f = AtomicIntegerFieldUpdater.newUpdater(C2405s0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e */
    public final InterfaceC2403r0 f7154e;

    public C2405s0(InterfaceC2403r0 interfaceC2403r0) {
        this.f7154e = interfaceC2403r0;
    }

    @Override // p132S5.InterfaceC2403r0
    /* renamed from: a */
    public void mo7940a(Throwable th) {
        if (f7153f.compareAndSet(this, 0, 1)) {
            this.f7154e.mo7940a(th);
        }
    }
}
