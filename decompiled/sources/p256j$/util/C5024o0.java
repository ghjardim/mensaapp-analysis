package p256j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.o0 */
/* loaded from: classes3.dex */
final class C5024o0 extends AbstractC4994d implements InterfaceC4960Z {
    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21344b(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC4994d.m21346d(this);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC4994d.m21347e(this, i7);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21349g(this, consumer);
    }

    @Override // p256j$.util.AbstractC4994d, p256j$.util.InterfaceC4957W, p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC4960Z trySplit() {
        return null;
    }

    @Override // p256j$.util.AbstractC4994d, p256j$.util.InterfaceC4957W, p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public final /* bridge */ /* synthetic */ InterfaceC4999f0 trySplit() {
        return null;
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p256j$.util.InterfaceC4960Z
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return false;
    }

    @Override // p256j$.util.InterfaceC4960Z
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
    }
}
