package p256j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.U */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4955U implements InterfaceC4957W {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfDouble f18160a;

    private /* synthetic */ C4955U(Spliterator.OfDouble ofDouble) {
        this.f18160a = ofDouble;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC4957W m21295a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C4956V ? ((C4956V) ofDouble).f18161a : new C4955U(ofDouble);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18160a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.f18160a;
        if (obj instanceof C4955U) {
            obj = ((C4955U) obj).f18160a;
        }
        return ofDouble.equals(obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18160a.estimateSize();
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18160a.forEachRemaining((Spliterator.OfDouble) obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18160a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // p256j$.util.InterfaceC4957W
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f18160a.forEachRemaining(doubleConsumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f18160a.getComparator();
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18160a.getExactSizeIfKnown();
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return this.f18160a.hasCharacteristics(i7);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18160a.hashCode();
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18160a.tryAdvance((Spliterator.OfDouble) obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18160a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // p256j$.util.InterfaceC4957W
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f18160a.tryAdvance(doubleConsumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C5008g0.m21366a(this.f18160a.trySplit());
    }

    @Override // p256j$.util.InterfaceC4957W, p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public final /* synthetic */ InterfaceC4957W trySplit() {
        return m21295a(this.f18160a.trySplit());
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public final /* synthetic */ InterfaceC4999f0 trySplit() {
        return C4995d0.m21361a(this.f18160a.trySplit());
    }
}
