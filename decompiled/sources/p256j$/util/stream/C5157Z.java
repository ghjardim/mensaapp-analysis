package p256j$.util.stream;

import java.util.function.IntConsumer;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.Z */
/* loaded from: classes3.dex */
final class C5157Z extends AbstractC5169b0 {
    @Override // p256j$.util.stream.InterfaceC5204h
    public final InterfaceC5204h unordered() {
        return !m21521L() ? this : new C5281v(this, EnumC5196f3.f18590r, 1);
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* bridge */ /* synthetic */ InterfaceC5187e0 parallel() {
        parallel();
        return this;
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* bridge */ /* synthetic */ InterfaceC5187e0 sequential() {
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

    @Override // p256j$.util.stream.AbstractC5169b0, p256j$.util.stream.InterfaceC5187e0
    public final void forEach(IntConsumer intConsumer) {
        InterfaceC4960Z m21528Z;
        if (!isParallel()) {
            m21528Z = AbstractC5169b0.m21528Z(m21523T());
            m21528Z.forEachRemaining(intConsumer);
        } else {
            super.forEach(intConsumer);
        }
    }

    @Override // p256j$.util.stream.AbstractC5169b0, p256j$.util.stream.InterfaceC5187e0
    public final void forEachOrdered(IntConsumer intConsumer) {
        InterfaceC4960Z m21528Z;
        if (!isParallel()) {
            m21528Z = AbstractC5169b0.m21528Z(m21523T());
            m21528Z.forEachRemaining(intConsumer);
        } else {
            super.forEachOrdered(intConsumer);
        }
    }
}
