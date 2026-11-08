package p256j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.m0 */
/* loaded from: classes3.dex */
final class C5020m0 implements InterfaceC4957W {

    /* renamed from: a */
    private final double[] f18307a;

    /* renamed from: b */
    private int f18308b;

    /* renamed from: c */
    private final int f18309c;

    /* renamed from: d */
    private final int f18310d;

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

    public C5020m0(double[] dArr, int i7, int i8, int i9) {
        this.f18307a = dArr;
        this.f18308b = i7;
        this.f18309c = i8;
        this.f18310d = i9 | 16448;
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public final InterfaceC4957W trySplit() {
        int i7 = this.f18308b;
        int i8 = (this.f18309c + i7) >>> 1;
        if (i7 >= i8) {
            return null;
        }
        this.f18308b = i8;
        return new C5020m0(this.f18307a, i7, i8, this.f18310d);
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i7;
        doubleConsumer.getClass();
        double[] dArr = this.f18307a;
        int length = dArr.length;
        int i8 = this.f18309c;
        if (length < i8 || (i7 = this.f18308b) < 0) {
            return;
        }
        this.f18308b = i8;
        if (i7 < i8) {
            do {
                doubleConsumer.accept(dArr[i7]);
                i7++;
            } while (i7 < i8);
        }
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i7 = this.f18308b;
        if (i7 < 0 || i7 >= this.f18309c) {
            return false;
        }
        this.f18308b = i7 + 1;
        doubleConsumer.accept(this.f18307a[i7]);
        return true;
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        return this.f18309c - this.f18308b;
    }

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return this.f18310d;
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC4994d.m21347e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
