package p256j$.util.stream;

import java.util.function.Consumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.x3 */
/* loaded from: classes3.dex */
final class C5295x3 extends AbstractC5300y3 implements InterfaceC4966c0 {
    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21345c(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21350h(this, consumer);
    }

    @Override // p256j$.util.stream.AbstractC5037A3
    /* renamed from: a */
    protected final Spliterator mo21426a(Spliterator spliterator, long j7, long j8, long j9, long j10) {
        return new C5295x3((InterfaceC4966c0) spliterator, j7, j8, j9, j10);
    }

    @Override // p256j$.util.stream.AbstractC5300y3
    /* renamed from: b */
    protected final Object mo21603b() {
        return new C5079J0(1);
    }
}
