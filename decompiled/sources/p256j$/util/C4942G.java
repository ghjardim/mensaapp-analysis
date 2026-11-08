package p256j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.G */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4942G implements InterfaceC4944I, InterfaceC4936A {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfDouble f18144a;

    private /* synthetic */ C4942G(PrimitiveIterator.OfDouble ofDouble) {
        this.f18144a = ofDouble;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC4944I m21271a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C4943H ? ((C4943H) ofDouble).f18145a : new C4942G(ofDouble);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f18144a;
        if (obj instanceof C4942G) {
            obj = ((C4942G) obj).f18144a;
        }
        return ofDouble.equals(obj);
    }

    @Override // p256j$.util.InterfaceC4953S
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18144a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // p256j$.util.InterfaceC4944I, java.util.Iterator, p256j$.util.InterfaceC4936A
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18144a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // p256j$.util.InterfaceC4944I
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f18144a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f18144a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f18144a.hashCode();
    }

    @Override // p256j$.util.InterfaceC4944I, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f18144a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f18144a.next();
    }

    @Override // p256j$.util.InterfaceC4944I
    public final /* synthetic */ double nextDouble() {
        return this.f18144a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f18144a.remove();
    }
}
