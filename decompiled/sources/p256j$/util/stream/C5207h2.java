package p256j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.h2 */
/* loaded from: classes3.dex */
final class C5207h2 extends AbstractC5219j2 {
    @Override // p256j$.util.stream.InterfaceC5204h
    public final InterfaceC5204h unordered() {
        return !m21521L() ? this : new C5201g2(this, EnumC5196f3.f18590r, 1);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: Q */
    final boolean mo21367Q() {
        throw new UnsupportedOperationException();
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: R */
    final InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2) {
        throw new UnsupportedOperationException();
    }

    @Override // p256j$.util.stream.AbstractC5219j2, p256j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            m21523T().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // p256j$.util.stream.AbstractC5219j2, p256j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!isParallel()) {
            m21523T().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }
}
