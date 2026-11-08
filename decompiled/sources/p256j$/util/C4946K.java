package p256j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.K */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4946K implements InterfaceC4948M, InterfaceC4936A {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfInt f18147a;

    private /* synthetic */ C4946K(PrimitiveIterator.OfInt ofInt) {
        this.f18147a = ofInt;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC4948M m21273a(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C4947L ? ((C4947L) ofInt).f18148a : new C4946K(ofInt);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f18147a;
        if (obj instanceof C4946K) {
            obj = ((C4946K) obj).f18147a;
        }
        return ofInt.equals(obj);
    }

    @Override // p256j$.util.InterfaceC4953S
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18147a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // p256j$.util.InterfaceC4948M, java.util.Iterator, p256j$.util.InterfaceC4936A
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18147a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // p256j$.util.InterfaceC4948M
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f18147a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f18147a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f18147a.hashCode();
    }

    @Override // p256j$.util.InterfaceC4948M, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f18147a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f18147a.next();
    }

    @Override // p256j$.util.InterfaceC4948M
    public final /* synthetic */ int nextInt() {
        return this.f18147a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f18147a.remove();
    }
}
