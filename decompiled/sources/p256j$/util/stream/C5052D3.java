package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.D3 */
/* loaded from: classes3.dex */
final class C5052D3 extends AbstractC5057E3 implements InterfaceC4966c0, LongConsumer {

    /* renamed from: f */
    long f18361f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21345c(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21350h(this, consumer);
    }

    @Override // p256j$.util.stream.AbstractC5072H3
    /* renamed from: c */
    protected final Spliterator mo21451c(Spliterator spliterator) {
        return new C5052D3((InterfaceC4966c0) spliterator, this);
    }

    @Override // p256j$.util.stream.AbstractC5057E3
    /* renamed from: e */
    protected final void mo21452e(Object obj) {
        ((LongConsumer) obj).accept(this.f18361f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j7) {
        this.f18361f = j7;
    }

    @Override // p256j$.util.stream.AbstractC5057E3
    /* renamed from: h */
    protected final AbstractC5232l3 mo21453h(int i7) {
        return new C5226k3(i7);
    }
}
