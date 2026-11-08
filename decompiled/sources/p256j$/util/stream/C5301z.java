package p256j$.util.stream;

import java.util.function.DoubleConsumer;
import p256j$.util.InterfaceC4957W;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.z */
/* loaded from: classes3.dex */
final class C5301z extends AbstractC5038B {
    @Override // p256j$.util.stream.InterfaceC5204h
    public final InterfaceC5204h unordered() {
        return !m21521L() ? this : new C5276u(this, EnumC5196f3.f18590r, 1);
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* bridge */ /* synthetic */ InterfaceC5053E parallel() {
        parallel();
        return this;
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* bridge */ /* synthetic */ InterfaceC5053E sequential() {
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

    @Override // p256j$.util.stream.AbstractC5038B, p256j$.util.stream.InterfaceC5053E
    public final void forEach(DoubleConsumer doubleConsumer) {
        InterfaceC4957W m21428Z;
        if (!isParallel()) {
            m21428Z = AbstractC5038B.m21428Z(m21523T());
            m21428Z.forEachRemaining(doubleConsumer);
        } else {
            super.forEach(doubleConsumer);
        }
    }

    @Override // p256j$.util.stream.AbstractC5038B, p256j$.util.stream.InterfaceC5053E
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        InterfaceC4957W m21428Z;
        if (!isParallel()) {
            m21428Z = AbstractC5038B.m21428Z(m21523T());
            m21428Z.forEachRemaining(doubleConsumer);
        } else {
            super.forEachOrdered(doubleConsumer);
        }
    }
}
