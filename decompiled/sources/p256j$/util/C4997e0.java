package p256j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p256j$.util.Spliterator;

/* renamed from: j$.util.e0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4997e0 implements Spliterator.OfPrimitive {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC4999f0 f18261a;

    private /* synthetic */ C4997e0(InterfaceC4999f0 interfaceC4999f0) {
        this.f18261a = interfaceC4999f0;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfPrimitive m21362a(InterfaceC4999f0 interfaceC4999f0) {
        if (interfaceC4999f0 == null) {
            return null;
        }
        return interfaceC4999f0 instanceof C4995d0 ? ((C4995d0) interfaceC4999f0).f18260a : interfaceC4999f0 instanceof InterfaceC4957W ? C4956V.m21296a((InterfaceC4957W) interfaceC4999f0) : interfaceC4999f0 instanceof InterfaceC4960Z ? C4959Y.m21298a((InterfaceC4960Z) interfaceC4999f0) : interfaceC4999f0 instanceof InterfaceC4966c0 ? C4964b0.m21301a((InterfaceC4966c0) interfaceC4999f0) : new C4997e0(interfaceC4999f0);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18261a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC4999f0 interfaceC4999f0 = this.f18261a;
        if (obj instanceof C4997e0) {
            obj = ((C4997e0) obj).f18261a;
        }
        return interfaceC4999f0.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18261a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18261a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18261a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f18261a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18261a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return this.f18261a.hasCharacteristics(i7);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18261a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18261a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18261a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return m21362a(this.f18261a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f18261a.trySplit());
    }
}
