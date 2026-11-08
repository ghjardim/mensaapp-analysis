package p256j$.util.stream;

import java.util.function.Consumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4966c0;

/* renamed from: j$.util.stream.n1 */
/* loaded from: classes3.dex */
final class C5242n1 extends AbstractC5248o1 implements InterfaceC4966c0 {
    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21345c(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21350h(this, consumer);
    }
}
