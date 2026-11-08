package p256j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p256j$.util.Spliterator;

/* renamed from: j$.util.Y */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4959Y implements Spliterator.OfInt {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC4960Z f18163a;

    private /* synthetic */ C4959Y(InterfaceC4960Z interfaceC4960Z) {
        this.f18163a = interfaceC4960Z;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfInt m21298a(InterfaceC4960Z interfaceC4960Z) {
        if (interfaceC4960Z == null) {
            return null;
        }
        return interfaceC4960Z instanceof C4958X ? ((C4958X) interfaceC4960Z).f18162a : new C4959Y(interfaceC4960Z);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18163a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC4960Z interfaceC4960Z = this.f18163a;
        if (obj instanceof C4959Y) {
            obj = ((C4959Y) obj).f18163a;
        }
        return interfaceC4960Z.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18163a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f18163a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18163a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f18163a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f18163a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18163a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return this.f18163a.hasCharacteristics(i7);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18163a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f18163a.tryAdvance((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18163a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(IntConsumer intConsumer) {
        return this.f18163a.tryAdvance(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfInt trySplit() {
        return m21298a(this.f18163a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C4997e0.m21362a(this.f18163a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f18163a.trySplit());
    }
}
