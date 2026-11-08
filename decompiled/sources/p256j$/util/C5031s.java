package p256j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.s */
/* loaded from: classes3.dex */
final class C5031s implements Spliterator {

    /* renamed from: a */
    final Spliterator f18320a;

    C5031s(Spliterator spliterator) {
        this.f18320a = spliterator;
    }

    @Override // p256j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f18320a.tryAdvance(new C5027q(consumer));
    }

    @Override // p256j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f18320a.forEachRemaining(new C5027q(consumer));
    }

    @Override // p256j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f18320a.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new C5031s(trySplit);
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        return this.f18320a.estimateSize();
    }

    @Override // p256j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f18320a.getExactSizeIfKnown();
    }

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return this.f18320a.characteristics();
    }

    @Override // p256j$.util.Spliterator
    public final boolean hasCharacteristics(int i7) {
        return this.f18320a.hasCharacteristics(i7);
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f18320a.getComparator();
    }
}
