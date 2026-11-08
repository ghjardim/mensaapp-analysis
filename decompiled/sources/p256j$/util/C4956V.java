package p256j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p256j$.util.Spliterator;

/* renamed from: j$.util.V */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4956V implements Spliterator.OfDouble {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC4957W f18161a;

    private /* synthetic */ C4956V(InterfaceC4957W interfaceC4957W) {
        this.f18161a = interfaceC4957W;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfDouble m21296a(InterfaceC4957W interfaceC4957W) {
        if (interfaceC4957W == null) {
            return null;
        }
        return interfaceC4957W instanceof C4955U ? ((C4955U) interfaceC4957W).f18160a : new C4956V(interfaceC4957W);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18161a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC4957W interfaceC4957W = this.f18161a;
        if (obj instanceof C4956V) {
            obj = ((C4956V) obj).f18161a;
        }
        return interfaceC4957W.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18161a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f18161a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18161a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f18161a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f18161a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18161a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return this.f18161a.hasCharacteristics(i7);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18161a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f18161a.tryAdvance((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18161a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return this.f18161a.tryAdvance(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfDouble trySplit() {
        return m21296a(this.f18161a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C4997e0.m21362a(this.f18161a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f18161a.trySplit());
    }
}
