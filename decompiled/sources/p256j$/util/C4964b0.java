package p256j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p256j$.util.Spliterator;

/* renamed from: j$.util.b0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4964b0 implements Spliterator.OfLong {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC4966c0 f18170a;

    private /* synthetic */ C4964b0(InterfaceC4966c0 interfaceC4966c0) {
        this.f18170a = interfaceC4966c0;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfLong m21301a(InterfaceC4966c0 interfaceC4966c0) {
        if (interfaceC4966c0 == null) {
            return null;
        }
        return interfaceC4966c0 instanceof C4962a0 ? ((C4962a0) interfaceC4966c0).f18167a : new C4964b0(interfaceC4966c0);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18170a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC4966c0 interfaceC4966c0 = this.f18170a;
        if (obj instanceof C4964b0) {
            obj = ((C4964b0) obj).f18170a;
        }
        return interfaceC4966c0.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18170a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f18170a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18170a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f18170a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f18170a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18170a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return this.f18170a.hasCharacteristics(i7);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18170a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f18170a.tryAdvance((Object) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18170a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(LongConsumer longConsumer) {
        return this.f18170a.tryAdvance(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfLong trySplit() {
        return m21301a(this.f18170a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C4997e0.m21362a(this.f18170a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f18170a.trySplit());
    }
}
