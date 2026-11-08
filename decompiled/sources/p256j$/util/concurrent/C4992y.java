package p256j$.util.concurrent;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4957W;

/* renamed from: j$.util.concurrent.y */
/* loaded from: classes3.dex */
final class C4992y implements InterfaceC4957W {

    /* renamed from: a */
    long f18252a;

    /* renamed from: b */
    final long f18253b;

    /* renamed from: c */
    final double f18254c;

    /* renamed from: d */
    final double f18255d;

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21343a(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC4994d.m21346d(this);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC4994d.m21347e(this, i7);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21348f(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    C4992y(long j7, long j8, double d7, double d8) {
        this.f18252a = j7;
        this.f18253b = j8;
        this.f18254c = d7;
        this.f18255d = d8;
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4992y trySplit() {
        long j7 = this.f18252a;
        long j8 = (this.f18253b + j7) >>> 1;
        if (j8 <= j7) {
            return null;
        }
        this.f18252a = j8;
        return new C4992y(j7, j8, this.f18254c, this.f18255d);
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        return this.f18253b - this.f18252a;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j7 = this.f18252a;
        if (j7 >= this.f18253b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().m21324c(this.f18254c, this.f18255d));
        this.f18252a = j7 + 1;
        return true;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j7 = this.f18252a;
        long j8 = this.f18253b;
        if (j7 < j8) {
            this.f18252a = j8;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(current.m21324c(this.f18254c, this.f18255d));
                j7++;
            } while (j7 < j8);
        }
    }
}
