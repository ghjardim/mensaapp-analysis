package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4957W;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Objects;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.q3 */
/* loaded from: classes3.dex */
final class C5260q3 extends AbstractC5208h3 implements InterfaceC4957W {
    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21343a(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21348f(this, consumer);
    }

    @Override // p256j$.util.stream.AbstractC5208h3
    /* renamed from: e */
    final AbstractC5208h3 mo21474e(Spliterator spliterator) {
        return new C5260q3(this.f18610b, spliterator, this.f18609a);
    }

    @Override // p256j$.util.stream.AbstractC5208h3
    /* renamed from: d */
    final void mo21473d() {
        C5135U2 c5135u2 = new C5135U2();
        this.f18616h = c5135u2;
        Objects.requireNonNull(c5135u2);
        this.f18613e = this.f18610b.m21525W(new C5255p3(c5135u2, 0));
        this.f18614f = new C5162a(2, this);
    }

    @Override // p256j$.util.stream.AbstractC5208h3, p256j$.util.Spliterator
    public final Spliterator trySplit() {
        return (InterfaceC4957W) super.trySplit();
    }

    @Override // p256j$.util.stream.AbstractC5208h3, p256j$.util.Spliterator
    public final InterfaceC4957W trySplit() {
        return (InterfaceC4957W) super.trySplit();
    }

    @Override // p256j$.util.stream.AbstractC5208h3, p256j$.util.Spliterator
    public final InterfaceC4999f0 trySplit() {
        return (InterfaceC4957W) super.trySplit();
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d7;
        Objects.requireNonNull(doubleConsumer);
        boolean m21563a = m21563a();
        if (m21563a) {
            C5135U2 c5135u2 = (C5135U2) this.f18616h;
            long j7 = this.f18615g;
            int m21509u = c5135u2.m21509u(j7);
            if (c5135u2.f18557c == 0 && m21509u == 0) {
                d7 = ((double[]) c5135u2.f18532e)[(int) j7];
            } else {
                d7 = ((double[][]) c5135u2.f18533f)[m21509u][(int) (j7 - c5135u2.f18558d[m21509u])];
            }
            doubleConsumer.accept(d7);
        }
        return m21563a;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f18616h == null && !this.f18617i) {
            Objects.requireNonNull(doubleConsumer);
            m21564c();
            Objects.requireNonNull(doubleConsumer);
            C5255p3 c5255p3 = new C5255p3(doubleConsumer, 1);
            this.f18610b.m21524V(this.f18612d, c5255p3);
            this.f18617i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
