package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Objects;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.s3 */
/* loaded from: classes3.dex */
final class C5270s3 extends AbstractC5208h3 implements InterfaceC4960Z {
    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21344b(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21349g(this, consumer);
    }

    @Override // p256j$.util.stream.AbstractC5208h3
    /* renamed from: e */
    final AbstractC5208h3 mo21474e(Spliterator spliterator) {
        return new C5270s3(this.f18610b, spliterator, this.f18609a);
    }

    @Override // p256j$.util.stream.AbstractC5208h3
    /* renamed from: d */
    final void mo21473d() {
        C5145W2 c5145w2 = new C5145W2();
        this.f18616h = c5145w2;
        Objects.requireNonNull(c5145w2);
        this.f18613e = this.f18610b.m21525W(new C5265r3(c5145w2, 0));
        this.f18614f = new C5162a(3, this);
    }

    @Override // p256j$.util.stream.AbstractC5208h3, p256j$.util.Spliterator
    public final Spliterator trySplit() {
        return (InterfaceC4960Z) super.trySplit();
    }

    @Override // p256j$.util.stream.AbstractC5208h3, p256j$.util.Spliterator
    public final InterfaceC4960Z trySplit() {
        return (InterfaceC4960Z) super.trySplit();
    }

    @Override // p256j$.util.stream.AbstractC5208h3, p256j$.util.Spliterator
    public final InterfaceC4999f0 trySplit() {
        return (InterfaceC4960Z) super.trySplit();
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i7;
        Objects.requireNonNull(intConsumer);
        boolean m21563a = m21563a();
        if (m21563a) {
            C5145W2 c5145w2 = (C5145W2) this.f18616h;
            long j7 = this.f18615g;
            int m21509u = c5145w2.m21509u(j7);
            if (c5145w2.f18557c == 0 && m21509u == 0) {
                i7 = ((int[]) c5145w2.f18532e)[(int) j7];
            } else {
                i7 = ((int[][]) c5145w2.f18533f)[m21509u][(int) (j7 - c5145w2.f18558d[m21509u])];
            }
            intConsumer.accept(i7);
        }
        return m21563a;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f18616h == null && !this.f18617i) {
            Objects.requireNonNull(intConsumer);
            m21564c();
            Objects.requireNonNull(intConsumer);
            C5265r3 c5265r3 = new C5265r3(intConsumer, 1);
            this.f18610b.m21524V(this.f18612d, c5265r3);
            this.f18617i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
