package p256j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.X0 */
/* loaded from: classes3.dex */
abstract class AbstractC5148X0 extends AbstractC5104O0 implements InterfaceC5089L0 {
    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: o */
    public final /* synthetic */ Object[] mo21485o(IntFunction intFunction) {
        return AbstractC5034A0.m21408m(this, intFunction);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: e */
    public final void mo21481e(Object obj) {
        ((InterfaceC5089L0) this.f18433a).mo21481e(obj);
        ((InterfaceC5089L0) this.f18434b).mo21481e(obj);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: r */
    public final void mo21482r(int i7, Object obj) {
        InterfaceC5094M0 interfaceC5094M0 = this.f18433a;
        ((InterfaceC5089L0) interfaceC5094M0).mo21482r(i7, obj);
        ((InterfaceC5089L0) this.f18434b).mo21482r(i7 + ((int) ((InterfaceC5089L0) interfaceC5094M0).count()), obj);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: d */
    public final Object mo21480d() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object mo21479c = mo21479c((int) count);
        mo21482r(0, mo21479c);
        return mo21479c;
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f18433a, this.f18434b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
