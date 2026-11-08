package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Objects;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.u3 */
/* loaded from: classes3.dex */
final class C5280u3 extends AbstractC5208h3 implements InterfaceC4966c0 {
    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21345c(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21350h(this, consumer);
    }

    @Override // p256j$.util.stream.AbstractC5208h3
    /* renamed from: e */
    final AbstractC5208h3 mo21474e(Spliterator spliterator) {
        return new C5280u3(this.f18610b, spliterator, this.f18609a);
    }

    @Override // p256j$.util.stream.AbstractC5208h3
    /* renamed from: d */
    final void mo21473d() {
        C5155Y2 c5155y2 = new C5155Y2();
        this.f18616h = c5155y2;
        Objects.requireNonNull(c5155y2);
        this.f18613e = this.f18610b.m21525W(new C5275t3(c5155y2, 0));
        this.f18614f = new C5162a(4, this);
    }

    @Override // p256j$.util.stream.AbstractC5208h3, p256j$.util.Spliterator
    public final Spliterator trySplit() {
        return (InterfaceC4966c0) super.trySplit();
    }

    @Override // p256j$.util.stream.AbstractC5208h3, p256j$.util.Spliterator
    public final InterfaceC4966c0 trySplit() {
        return (InterfaceC4966c0) super.trySplit();
    }

    @Override // p256j$.util.stream.AbstractC5208h3, p256j$.util.Spliterator
    public final InterfaceC4999f0 trySplit() {
        return (InterfaceC4966c0) super.trySplit();
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j7;
        Objects.requireNonNull(longConsumer);
        boolean m21563a = m21563a();
        if (m21563a) {
            C5155Y2 c5155y2 = (C5155Y2) this.f18616h;
            long j8 = this.f18615g;
            int m21509u = c5155y2.m21509u(j8);
            if (c5155y2.f18557c == 0 && m21509u == 0) {
                j7 = ((long[]) c5155y2.f18532e)[(int) j8];
            } else {
                j7 = ((long[][]) c5155y2.f18533f)[m21509u][(int) (j8 - c5155y2.f18558d[m21509u])];
            }
            longConsumer.accept(j7);
        }
        return m21563a;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f18616h == null && !this.f18617i) {
            Objects.requireNonNull(longConsumer);
            m21564c();
            Objects.requireNonNull(longConsumer);
            C5275t3 c5275t3 = new C5275t3(longConsumer, 1);
            this.f18610b.m21524V(this.f18612d, c5275t3);
            this.f18617i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
