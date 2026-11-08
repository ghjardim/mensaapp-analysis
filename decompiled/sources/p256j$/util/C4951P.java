package p256j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.P */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4951P implements PrimitiveIterator.OfLong {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC4952Q f18153a;

    private /* synthetic */ C4951P(InterfaceC4952Q interfaceC4952Q) {
        this.f18153a = interfaceC4952Q;
    }

    /* renamed from: a */
    public static /* synthetic */ PrimitiveIterator.OfLong m21280a(InterfaceC4952Q interfaceC4952Q) {
        if (interfaceC4952Q == null) {
            return null;
        }
        return interfaceC4952Q instanceof C4950O ? ((C4950O) interfaceC4952Q).f18150a : new C4951P(interfaceC4952Q);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC4952Q interfaceC4952Q = this.f18153a;
        if (obj instanceof C4951P) {
            obj = ((C4951P) obj).f18153a;
        }
        return interfaceC4952Q.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f18153a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18153a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f18153a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f18153a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f18153a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f18153a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f18153a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.f18153a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f18153a.remove();
    }
}
