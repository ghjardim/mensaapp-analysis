package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.C3 */
/* loaded from: classes3.dex */
final class C5047C3 extends AbstractC5057E3 implements InterfaceC4960Z, IntConsumer {

    /* renamed from: f */
    int f18355f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21344b(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21349g(this, consumer);
    }

    @Override // p256j$.util.stream.AbstractC5072H3
    /* renamed from: c */
    protected final Spliterator mo21451c(Spliterator spliterator) {
        return new C5047C3((InterfaceC4960Z) spliterator, this);
    }

    @Override // p256j$.util.stream.AbstractC5057E3
    /* renamed from: e */
    protected final void mo21452e(Object obj) {
        ((IntConsumer) obj).accept(this.f18355f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        this.f18355f = i7;
    }

    @Override // p256j$.util.stream.AbstractC5057E3
    /* renamed from: h */
    protected final AbstractC5232l3 mo21453h(int i7) {
        return new C5220j3(i7);
    }
}
