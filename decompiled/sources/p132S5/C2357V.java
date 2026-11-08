package p132S5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p006A5.AbstractC0023b;
import p006A5.AbstractC0024c;
import p167X5.AbstractC2867l;
import p167X5.C2842C;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: S5.V */
/* loaded from: classes2.dex */
public final class C2357V extends C2842C {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7087e = AtomicIntegerFieldUpdater.newUpdater(C2357V.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C2357V(InterfaceC7161i interfaceC7161i, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7161i, interfaceC7157e);
    }

    /* renamed from: T0 */
    private final boolean m8033T0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7087e;
        do {
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f7087e.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: U0 */
    private final boolean m8034U0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7087e;
        do {
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f7087e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p167X5.C2842C, p132S5.C2321C0
    /* renamed from: E */
    public void mo7883E(Object obj) {
        mo8035N0(obj);
    }

    @Override // p167X5.C2842C, p132S5.AbstractC2367a
    /* renamed from: N0 */
    public void mo8035N0(Object obj) {
        if (m8033T0()) {
            return;
        }
        AbstractC2867l.m10337c(AbstractC0023b.m74c(this.f8804d), AbstractC2324E.m7969a(obj, this.f8804d), null, 2, null);
    }

    /* renamed from: R0 */
    public final Object m8036R0() {
        if (m8034U0()) {
            return AbstractC0024c.m76e();
        }
        Object m7968h = AbstractC2323D0.m7968h(m7914b0());
        if (m7968h instanceof C2318B) {
            throw ((C2318B) m7968h).f7023a;
        }
        return m7968h;
    }
}
