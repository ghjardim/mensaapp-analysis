package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4957W;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.T2 */
/* loaded from: classes3.dex */
final class C5130T2 extends AbstractC5160Z2 implements InterfaceC4957W {

    /* renamed from: g */
    final /* synthetic */ C5135U2 f18498g;

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21343a(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21348f(this, consumer);
    }

    @Override // p256j$.util.stream.AbstractC5160Z2
    /* renamed from: a */
    final void mo21499a(int i7, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i7]);
    }

    @Override // p256j$.util.stream.AbstractC5160Z2
    /* renamed from: b */
    final InterfaceC4999f0 mo21500b(Object obj, int i7, int i8) {
        return Spliterators.m21290j((double[]) obj, i7, i8 + i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5130T2(C5135U2 c5135u2, int i7, int i8, int i9, int i10) {
        super(c5135u2, i7, i8, i9, i10);
        this.f18498g = c5135u2;
    }

    @Override // p256j$.util.stream.AbstractC5160Z2
    /* renamed from: c */
    final InterfaceC4999f0 mo21501c(int i7, int i8, int i9, int i10) {
        return new C5130T2(this.f18498g, i7, i8, i9, i10);
    }
}
