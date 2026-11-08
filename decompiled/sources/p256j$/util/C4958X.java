package p256j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.X */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4958X implements InterfaceC4960Z {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfInt f18162a;

    private /* synthetic */ C4958X(Spliterator.OfInt ofInt) {
        this.f18162a = ofInt;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC4960Z m21297a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C4959Y ? ((C4959Y) ofInt).f18163a : new C4958X(ofInt);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18162a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.f18162a;
        if (obj instanceof C4958X) {
            obj = ((C4958X) obj).f18162a;
        }
        return ofInt.equals(obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18162a.estimateSize();
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18162a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18162a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // p256j$.util.InterfaceC4960Z
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f18162a.forEachRemaining(intConsumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f18162a.getComparator();
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18162a.getExactSizeIfKnown();
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return this.f18162a.hasCharacteristics(i7);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18162a.hashCode();
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18162a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18162a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // p256j$.util.InterfaceC4960Z
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f18162a.tryAdvance(intConsumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C5008g0.m21366a(this.f18162a.trySplit());
    }

    @Override // p256j$.util.InterfaceC4960Z, p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public final /* synthetic */ InterfaceC4960Z trySplit() {
        return m21297a(this.f18162a.trySplit());
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public final /* synthetic */ InterfaceC4999f0 trySplit() {
        return C4995d0.m21361a(this.f18162a.trySplit());
    }
}
