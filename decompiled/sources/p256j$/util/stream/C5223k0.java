package p256j$.util.stream;

import java.util.function.LongConsumer;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.k0 */
/* loaded from: classes3.dex */
final class C5223k0 extends AbstractC5235m0 {
    @Override // p256j$.util.stream.InterfaceC5204h
    public final InterfaceC5204h unordered() {
        return !m21521L() ? this : new C5286w(this, EnumC5196f3.f18590r, 4);
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* bridge */ /* synthetic */ InterfaceC5252p0 parallel() {
        parallel();
        return this;
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* bridge */ /* synthetic */ InterfaceC5252p0 sequential() {
        sequential();
        return this;
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
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

    @Override // p256j$.util.stream.AbstractC5235m0, p256j$.util.stream.InterfaceC5252p0
    public final void forEach(LongConsumer longConsumer) {
        InterfaceC4966c0 m21570Z;
        if (!isParallel()) {
            m21570Z = AbstractC5235m0.m21570Z(m21523T());
            m21570Z.forEachRemaining(longConsumer);
        } else {
            super.forEach(longConsumer);
        }
    }

    @Override // p256j$.util.stream.AbstractC5235m0, p256j$.util.stream.InterfaceC5252p0
    public final void forEachOrdered(LongConsumer longConsumer) {
        InterfaceC4966c0 m21570Z;
        if (!isParallel()) {
            m21570Z = AbstractC5235m0.m21570Z(m21523T());
            m21570Z.forEachRemaining(longConsumer);
        } else {
            super.forEachOrdered(longConsumer);
        }
    }
}
