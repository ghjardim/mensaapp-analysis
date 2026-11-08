package p256j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.r0 */
/* loaded from: classes3.dex */
final class C5030r0 implements InterfaceC4960Z {

    /* renamed from: a */
    private final int[] f18316a;

    /* renamed from: b */
    private int f18317b;

    /* renamed from: c */
    private final int f18318c;

    /* renamed from: d */
    private final int f18319d;

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

    public C5030r0(int[] iArr, int i7, int i8, int i9) {
        this.f18316a = iArr;
        this.f18317b = i7;
        this.f18318c = i8;
        this.f18319d = i9 | 16448;
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public final InterfaceC4960Z trySplit() {
        int i7 = this.f18317b;
        int i8 = (this.f18318c + i7) >>> 1;
        if (i7 >= i8) {
            return null;
        }
        this.f18317b = i8;
        return new C5030r0(this.f18316a, i7, i8, this.f18319d);
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i7;
        intConsumer.getClass();
        int[] iArr = this.f18316a;
        int length = iArr.length;
        int i8 = this.f18318c;
        if (length < i8 || (i7 = this.f18317b) < 0) {
            return;
        }
        this.f18317b = i8;
        if (i7 < i8) {
            do {
                intConsumer.accept(iArr[i7]);
                i7++;
            } while (i7 < i8);
        }
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i7 = this.f18317b;
        if (i7 < 0 || i7 >= this.f18318c) {
            return false;
        }
        this.f18317b = i7 + 1;
        intConsumer.accept(this.f18316a[i7]);
        return true;
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        return this.f18318c - this.f18317b;
    }

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return this.f18319d;
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC4994d.m21347e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
