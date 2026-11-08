package p256j$.util.stream;

import java.util.function.Consumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.w3 */
/* loaded from: classes3.dex */
final class C5290w3 extends AbstractC5300y3 implements InterfaceC4960Z {
    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21344b(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21349g(this, consumer);
    }

    @Override // p256j$.util.stream.AbstractC5037A3
    /* renamed from: a */
    protected final Spliterator mo21426a(Spliterator spliterator, long j7, long j8, long j9, long j10) {
        return new C5290w3((InterfaceC4960Z) spliterator, j7, j8, j9, j10);
    }

    @Override // p256j$.util.stream.AbstractC5300y3
    /* renamed from: b */
    protected final Object mo21603b() {
        return new C5069H0(1);
    }
}
