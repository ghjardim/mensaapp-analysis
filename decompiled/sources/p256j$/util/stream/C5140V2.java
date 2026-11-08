package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.V2 */
/* loaded from: classes3.dex */
final class C5140V2 extends AbstractC5160Z2 implements InterfaceC4960Z {

    /* renamed from: g */
    final /* synthetic */ C5145W2 f18509g;

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21344b(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21349g(this, consumer);
    }

    @Override // p256j$.util.stream.AbstractC5160Z2
    /* renamed from: a */
    final void mo21499a(int i7, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i7]);
    }

    @Override // p256j$.util.stream.AbstractC5160Z2
    /* renamed from: b */
    final InterfaceC4999f0 mo21500b(Object obj, int i7, int i8) {
        return Spliterators.m21291k((int[]) obj, i7, i8 + i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5140V2(C5145W2 c5145w2, int i7, int i8, int i9, int i10) {
        super(c5145w2, i7, i8, i9, i10);
        this.f18509g = c5145w2;
    }

    @Override // p256j$.util.stream.AbstractC5160Z2
    /* renamed from: c */
    final InterfaceC4999f0 mo21501c(int i7, int i8, int i9, int i10) {
        return new C5140V2(this.f18509g, i7, i8, i9, i10);
    }
}
