package p256j$.util.stream;

import java.util.function.Consumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4960Z;

/* renamed from: j$.util.stream.m1 */
/* loaded from: classes3.dex */
final class C5236m1 extends AbstractC5248o1 implements InterfaceC4960Z {
    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21344b(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21349g(this, consumer);
    }
}
