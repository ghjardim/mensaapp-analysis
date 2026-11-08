package p256j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.t0 */
/* loaded from: classes3.dex */
final class C5307t0 implements InterfaceC4966c0 {

    /* renamed from: a */
    private final long[] f18748a;

    /* renamed from: b */
    private int f18749b;

    /* renamed from: c */
    private final int f18750c;

    /* renamed from: d */
    private final int f18751d;

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

    public C5307t0(long[] jArr, int i7, int i8, int i9) {
        this.f18748a = jArr;
        this.f18749b = i7;
        this.f18750c = i8;
        this.f18751d = i9 | 16448;
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public final InterfaceC4966c0 trySplit() {
        int i7 = this.f18749b;
        int i8 = (this.f18750c + i7) >>> 1;
        if (i7 >= i8) {
            return null;
        }
        this.f18749b = i8;
        return new C5307t0(this.f18748a, i7, i8, this.f18751d);
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i7;
        longConsumer.getClass();
        long[] jArr = this.f18748a;
        int length = jArr.length;
        int i8 = this.f18750c;
        if (length < i8 || (i7 = this.f18749b) < 0) {
            return;
        }
        this.f18749b = i8;
        if (i7 < i8) {
            do {
                longConsumer.accept(jArr[i7]);
                i7++;
            } while (i7 < i8);
        }
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i7 = this.f18749b;
        if (i7 < 0 || i7 >= this.f18750c) {
            return false;
        }
        this.f18749b = i7 + 1;
        longConsumer.accept(this.f18748a[i7]);
        return true;
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        return this.f18750c - this.f18749b;
    }

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return this.f18751d;
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC4994d.m21347e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
