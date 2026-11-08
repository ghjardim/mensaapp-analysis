package p256j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.L */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4947L implements PrimitiveIterator.OfInt {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC4948M f18148a;

    private /* synthetic */ C4947L(InterfaceC4948M interfaceC4948M) {
        this.f18148a = interfaceC4948M;
    }

    /* renamed from: a */
    public static /* synthetic */ PrimitiveIterator.OfInt m21274a(InterfaceC4948M interfaceC4948M) {
        if (interfaceC4948M == null) {
            return null;
        }
        return interfaceC4948M instanceof C4946K ? ((C4946K) interfaceC4948M).f18147a : new C4947L(interfaceC4948M);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC4948M interfaceC4948M = this.f18148a;
        if (obj instanceof C4947L) {
            obj = ((C4947L) obj).f18148a;
        }
        return interfaceC4948M.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f18148a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18148a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f18148a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f18148a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f18148a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f18148a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f18148a.next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return this.f18148a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f18148a.remove();
    }
}
