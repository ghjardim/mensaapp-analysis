package p256j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.d0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4995d0 implements InterfaceC4999f0 {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfPrimitive f18260a;

    private /* synthetic */ C4995d0(Spliterator.OfPrimitive ofPrimitive) {
        this.f18260a = ofPrimitive;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC4999f0 m21361a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof C4997e0 ? ((C4997e0) ofPrimitive).f18261a : ofPrimitive instanceof Spliterator.OfDouble ? C4955U.m21295a((Spliterator.OfDouble) ofPrimitive) : ofPrimitive instanceof Spliterator.OfInt ? C4958X.m21297a((Spliterator.OfInt) ofPrimitive) : ofPrimitive instanceof Spliterator.OfLong ? C4962a0.m21300a((Spliterator.OfLong) ofPrimitive) : new C4995d0(ofPrimitive);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18260a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.f18260a;
        if (obj instanceof C4995d0) {
            obj = ((C4995d0) obj).f18260a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18260a.estimateSize();
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18260a.forEachRemaining((Spliterator.OfPrimitive) obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18260a.forEachRemaining(consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f18260a.getComparator();
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18260a.getExactSizeIfKnown();
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return this.f18260a.hasCharacteristics(i7);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18260a.hashCode();
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18260a.tryAdvance((Spliterator.OfPrimitive) obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18260a.tryAdvance(consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C5008g0.m21366a(this.f18260a.trySplit());
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public final /* synthetic */ InterfaceC4999f0 trySplit() {
        return m21361a(this.f18260a.trySplit());
    }
}
