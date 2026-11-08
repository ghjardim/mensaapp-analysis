package p256j$.util.concurrent;

import java.util.Comparator;
import java.util.function.Consumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.Spliterator;

/* renamed from: j$.util.concurrent.f */
/* loaded from: classes3.dex */
final class C4973f extends C4983p implements Spliterator {

    /* renamed from: i */
    final ConcurrentHashMap f18204i;

    /* renamed from: j */
    long f18205j;

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return 4353;
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

    C4973f(C4979l[] c4979lArr, int i7, int i8, int i9, long j7, ConcurrentHashMap concurrentHashMap) {
        super(c4979lArr, i7, i8, i9);
        this.f18204i = concurrentHashMap;
        this.f18205j = j7;
    }

    @Override // p256j$.util.Spliterator
    public final Spliterator trySplit() {
        int i7 = this.f18236f;
        int i8 = this.f18237g;
        int i9 = (i7 + i8) >>> 1;
        if (i9 <= i7) {
            return null;
        }
        C4979l[] c4979lArr = this.f18231a;
        this.f18237g = i9;
        long j7 = this.f18205j >>> 1;
        this.f18205j = j7;
        return new C4973f(c4979lArr, this.f18238h, i9, i8, j7, this.f18204i);
    }

    @Override // p256j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            C4979l m21329a = m21329a();
            if (m21329a == null) {
                return;
            } else {
                consumer.m21477p(new C4978k(m21329a.f18224b, m21329a.f18225c, this.f18204i));
            }
        }
    }

    @Override // p256j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        C4979l m21329a = m21329a();
        if (m21329a == null) {
            return false;
        }
        consumer.m21477p(new C4978k(m21329a.f18224b, m21329a.f18225c, this.f18204i));
        return true;
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        return this.f18205j;
    }
}
