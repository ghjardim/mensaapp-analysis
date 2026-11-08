package p256j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.H */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4943H implements PrimitiveIterator.OfDouble {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC4944I f18145a;

    private /* synthetic */ C4943H(InterfaceC4944I interfaceC4944I) {
        this.f18145a = interfaceC4944I;
    }

    /* renamed from: a */
    public static /* synthetic */ PrimitiveIterator.OfDouble m21272a(InterfaceC4944I interfaceC4944I) {
        if (interfaceC4944I == null) {
            return null;
        }
        return interfaceC4944I instanceof C4942G ? ((C4942G) interfaceC4944I).f18144a : new C4943H(interfaceC4944I);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC4944I interfaceC4944I = this.f18145a;
        if (obj instanceof C4943H) {
            obj = ((C4943H) obj).f18145a;
        }
        return interfaceC4944I.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f18145a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18145a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f18145a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f18145a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f18145a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f18145a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f18145a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f18145a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f18145a.remove();
    }
}
