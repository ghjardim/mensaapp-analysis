package p256j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.a0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4962a0 implements InterfaceC4966c0 {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfLong f18167a;

    private /* synthetic */ C4962a0(Spliterator.OfLong ofLong) {
        this.f18167a = ofLong;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC4966c0 m21300a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C4964b0 ? ((C4964b0) ofLong).f18170a : new C4962a0(ofLong);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18167a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.f18167a;
        if (obj instanceof C4962a0) {
            obj = ((C4962a0) obj).f18167a;
        }
        return ofLong.equals(obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18167a.estimateSize();
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18167a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18167a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // p256j$.util.InterfaceC4966c0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f18167a.forEachRemaining(longConsumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f18167a.getComparator();
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18167a.getExactSizeIfKnown();
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return this.f18167a.hasCharacteristics(i7);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18167a.hashCode();
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18167a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18167a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // p256j$.util.InterfaceC4966c0
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f18167a.tryAdvance(longConsumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C5008g0.m21366a(this.f18167a.trySplit());
    }

    @Override // p256j$.util.InterfaceC4966c0, p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public final /* synthetic */ InterfaceC4966c0 trySplit() {
        return m21300a(this.f18167a.trySplit());
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public final /* synthetic */ InterfaceC4999f0 trySplit() {
        return C4995d0.m21361a(this.f18167a.trySplit());
    }
}
