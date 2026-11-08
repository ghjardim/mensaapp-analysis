package p256j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.l0 */
/* loaded from: classes3.dex */
final class C5018l0 implements Spliterator {

    /* renamed from: a */
    private final Object[] f18301a;

    /* renamed from: b */
    private int f18302b;

    /* renamed from: c */
    private final int f18303c;

    /* renamed from: d */
    private final int f18304d;

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC4994d.m21346d(this);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC4994d.m21347e(this, i7);
    }

    public C5018l0(Object[] objArr, int i7, int i8, int i9) {
        this.f18301a = objArr;
        this.f18302b = i7;
        this.f18303c = i8;
        this.f18304d = i9 | 16448;
    }

    @Override // p256j$.util.Spliterator
    public final Spliterator trySplit() {
        int i7 = this.f18302b;
        int i8 = (this.f18303c + i7) >>> 1;
        if (i7 >= i8) {
            return null;
        }
        this.f18302b = i8;
        return new C5018l0(this.f18301a, i7, i8, this.f18304d);
    }

    @Override // p256j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i7;
        consumer.getClass();
        Object[] objArr = this.f18301a;
        int length = objArr.length;
        int i8 = this.f18303c;
        if (length < i8 || (i7 = this.f18302b) < 0) {
            return;
        }
        this.f18302b = i8;
        if (i7 < i8) {
            do {
                consumer.accept(objArr[i7]);
                i7++;
            } while (i7 < i8);
        }
    }

    @Override // p256j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i7 = this.f18302b;
        if (i7 < 0 || i7 >= this.f18303c) {
            return false;
        }
        this.f18302b = i7 + 1;
        consumer.accept(this.f18301a[i7]);
        return true;
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        return this.f18303c - this.f18302b;
    }

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return this.f18304d;
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC4994d.m21347e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
