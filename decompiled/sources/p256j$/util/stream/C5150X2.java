package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.X2 */
/* loaded from: classes3.dex */
final class C5150X2 extends AbstractC5160Z2 implements InterfaceC4966c0 {

    /* renamed from: g */
    final /* synthetic */ C5155Y2 f18516g;

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21345c(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21350h(this, consumer);
    }

    @Override // p256j$.util.stream.AbstractC5160Z2
    /* renamed from: a */
    final void mo21499a(int i7, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i7]);
    }

    @Override // p256j$.util.stream.AbstractC5160Z2
    /* renamed from: b */
    final InterfaceC4999f0 mo21500b(Object obj, int i7, int i8) {
        return Spliterators.m21292l((long[]) obj, i7, i8 + i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5150X2(C5155Y2 c5155y2, int i7, int i8, int i9, int i10) {
        super(c5155y2, i7, i8, i9, i10);
        this.f18516g = c5155y2;
    }

    @Override // p256j$.util.stream.AbstractC5160Z2
    /* renamed from: c */
    final InterfaceC4999f0 mo21501c(int i7, int i8, int i9, int i10) {
        return new C5150X2(this.f18516g, i7, i8, i9, i10);
    }
}
