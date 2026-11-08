package p256j$.util.concurrent;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4966c0;

/* renamed from: j$.util.concurrent.A */
/* loaded from: classes3.dex */
final class C4967A implements InterfaceC4966c0 {

    /* renamed from: a */
    long f18174a;

    /* renamed from: b */
    final long f18175b;

    /* renamed from: c */
    final long f18176c;

    /* renamed from: d */
    final long f18177d;

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21345c(this, consumer);
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
        return AbstractC4994d.m21350h(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    C4967A(long j7, long j8, long j9, long j10) {
        this.f18174a = j7;
        this.f18175b = j8;
        this.f18176c = j9;
        this.f18177d = j10;
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4967A trySplit() {
        long j7 = this.f18174a;
        long j8 = (this.f18175b + j7) >>> 1;
        if (j8 <= j7) {
            return null;
        }
        this.f18174a = j8;
        return new C4967A(j7, j8, this.f18176c, this.f18177d);
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        return this.f18175b - this.f18174a;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j7 = this.f18174a;
        if (j7 >= this.f18175b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().m21326e(this.f18176c, this.f18177d));
        this.f18174a = j7 + 1;
        return true;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j7 = this.f18174a;
        long j8 = this.f18175b;
        if (j7 < j8) {
            this.f18174a = j8;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                longConsumer.accept(current.m21326e(this.f18176c, this.f18177d));
                j7++;
            } while (j7 < j8);
        }
    }
}
