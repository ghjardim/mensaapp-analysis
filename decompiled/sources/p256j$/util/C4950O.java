package p256j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.O */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4950O implements InterfaceC4952Q, InterfaceC4936A {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfLong f18150a;

    private /* synthetic */ C4950O(PrimitiveIterator.OfLong ofLong) {
        this.f18150a = ofLong;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC4952Q m21277a(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C4951P ? ((C4951P) ofLong).f18153a : new C4950O(ofLong);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f18150a;
        if (obj instanceof C4950O) {
            obj = ((C4950O) obj).f18150a;
        }
        return ofLong.equals(obj);
    }

    @Override // p256j$.util.InterfaceC4953S
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18150a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // p256j$.util.InterfaceC4952Q, java.util.Iterator, p256j$.util.InterfaceC4936A
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18150a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // p256j$.util.InterfaceC4952Q
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f18150a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f18150a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f18150a.hashCode();
    }

    @Override // p256j$.util.InterfaceC4952Q, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f18150a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f18150a.next();
    }

    @Override // p256j$.util.InterfaceC4952Q
    public final /* synthetic */ long nextLong() {
        return this.f18150a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f18150a.remove();
    }
}
