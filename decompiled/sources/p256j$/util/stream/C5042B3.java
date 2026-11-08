package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4957W;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.B3 */
/* loaded from: classes3.dex */
final class C5042B3 extends AbstractC5057E3 implements InterfaceC4957W, DoubleConsumer {

    /* renamed from: f */
    double f18350f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21343a(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21348f(this, consumer);
    }

    @Override // p256j$.util.stream.AbstractC5072H3
    /* renamed from: c */
    protected final Spliterator mo21451c(Spliterator spliterator) {
        return new C5042B3((InterfaceC4957W) spliterator, this);
    }

    @Override // p256j$.util.stream.AbstractC5057E3
    /* renamed from: e */
    protected final void mo21452e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f18350f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        this.f18350f = d7;
    }

    @Override // p256j$.util.stream.AbstractC5057E3
    /* renamed from: h */
    protected final AbstractC5232l3 mo21453h(int i7) {
        return new C5214i3(i7);
    }
}
