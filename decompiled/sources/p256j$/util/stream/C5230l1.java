package p256j$.util.stream;

import java.util.function.Consumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4957W;

/* renamed from: j$.util.stream.l1 */
/* loaded from: classes3.dex */
final class C5230l1 extends AbstractC5248o1 implements InterfaceC4957W {
    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21343a(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21348f(this, consumer);
    }
}
