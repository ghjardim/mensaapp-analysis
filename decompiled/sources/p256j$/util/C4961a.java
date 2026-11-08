package p256j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.function.Consumer;

/* renamed from: j$.util.a */
/* loaded from: classes3.dex */
final class C4961a implements Spliterator {

    /* renamed from: a */
    private final List f18164a;

    /* renamed from: b */
    private int f18165b;

    /* renamed from: c */
    private int f18166c;

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    C4961a(List list) {
        this.f18164a = list;
        this.f18165b = 0;
        this.f18166c = -1;
    }

    private C4961a(C4961a c4961a, int i7, int i8) {
        this.f18164a = c4961a.f18164a;
        this.f18165b = i7;
        this.f18166c = i8;
    }

    /* renamed from: a */
    private int m21299a() {
        int i7 = this.f18166c;
        if (i7 >= 0) {
            return i7;
        }
        int size = this.f18164a.size();
        this.f18166c = size;
        return size;
    }

    @Override // p256j$.util.Spliterator
    public final Spliterator trySplit() {
        int m21299a = m21299a();
        int i7 = this.f18165b;
        int i8 = (m21299a + i7) >>> 1;
        if (i7 >= i8) {
            return null;
        }
        this.f18165b = i8;
        return new C4961a(this, i7, i8);
    }

    @Override // p256j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int m21299a = m21299a();
        int i7 = this.f18165b;
        if (i7 >= m21299a) {
            return false;
        }
        this.f18165b = i7 + 1;
        try {
            consumer.accept(this.f18164a.get(i7));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p256j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int m21299a = m21299a();
        this.f18165b = m21299a;
        for (int i7 = this.f18165b; i7 < m21299a; i7++) {
            try {
                consumer.accept(this.f18164a.get(i7));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        return m21299a() - this.f18165b;
    }
}
