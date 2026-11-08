package p256j$.util.concurrent;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4960Z;

/* renamed from: j$.util.concurrent.z */
/* loaded from: classes3.dex */
final class C4993z implements InterfaceC4960Z {

    /* renamed from: a */
    long f18256a;

    /* renamed from: b */
    final long f18257b;

    /* renamed from: c */
    final int f18258c;

    /* renamed from: d */
    final int f18259d;

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21344b(this, consumer);
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
        return AbstractC4994d.m21349g(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    C4993z(long j7, long j8, int i7, int i8) {
        this.f18256a = j7;
        this.f18257b = j8;
        this.f18258c = i7;
        this.f18259d = i8;
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4993z trySplit() {
        long j7 = this.f18256a;
        long j8 = (this.f18257b + j7) >>> 1;
        if (j8 <= j7) {
            return null;
        }
        this.f18256a = j8;
        return new C4993z(j7, j8, this.f18258c, this.f18259d);
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        return this.f18257b - this.f18256a;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j7 = this.f18256a;
        if (j7 >= this.f18257b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().m21325d(this.f18258c, this.f18259d));
        this.f18256a = j7 + 1;
        return true;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j7 = this.f18256a;
        long j8 = this.f18257b;
        if (j7 < j8) {
            this.f18256a = j8;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.m21325d(this.f18258c, this.f18259d));
                j7++;
            } while (j7 < j8);
        }
    }
}
