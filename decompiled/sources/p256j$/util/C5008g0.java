package p256j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p256j$.util.Spliterator;

/* renamed from: j$.util.g0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5008g0 implements Spliterator {

    /* renamed from: a */
    public final /* synthetic */ Spliterator f18280a;

    private /* synthetic */ C5008g0(Spliterator spliterator) {
        this.f18280a = spliterator;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator m21366a(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof Spliterator.Wrapper ? Spliterator.this : spliterator instanceof Spliterator.OfPrimitive ? C4995d0.m21361a((Spliterator.OfPrimitive) spliterator) : new C5008g0(spliterator);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18280a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.Spliterator spliterator = this.f18280a;
        if (obj instanceof C5008g0) {
            obj = ((C5008g0) obj).f18280a;
        }
        return spliterator.equals(obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18280a.estimateSize();
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18280a.forEachRemaining(consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f18280a.getComparator();
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18280a.getExactSizeIfKnown();
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return this.f18280a.hasCharacteristics(i7);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18280a.hashCode();
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18280a.tryAdvance(consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return m21366a(this.f18280a.trySplit());
    }
}
