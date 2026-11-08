package p256j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* renamed from: j$.util.s0 */
/* loaded from: classes3.dex */
class C5032s0 implements Spliterator {

    /* renamed from: a */
    private final Collection f18321a;

    /* renamed from: b */
    private Iterator f18322b;

    /* renamed from: c */
    private final int f18323c;

    /* renamed from: d */
    private long f18324d;

    /* renamed from: e */
    private int f18325e;

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC4994d.m21346d(this);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC4994d.m21347e(this, i7);
    }

    public C5032s0(Collection collection, int i7) {
        this.f18321a = collection;
        this.f18322b = null;
        this.f18323c = (i7 & 4096) == 0 ? i7 | 16448 : i7;
    }

    public C5032s0(Iterator it) {
        this.f18321a = null;
        this.f18322b = it;
        this.f18324d = Long.MAX_VALUE;
        this.f18323c = 272;
    }

    @Override // p256j$.util.Spliterator
    public final Spliterator trySplit() {
        long j7;
        Iterator it = this.f18322b;
        if (it == null) {
            Collection collection = this.f18321a;
            Iterator it2 = collection.iterator();
            this.f18322b = it2;
            j7 = collection.size();
            this.f18324d = j7;
            it = it2;
        } else {
            j7 = this.f18324d;
        }
        if (j7 <= 1 || !it.hasNext()) {
            return null;
        }
        int i7 = this.f18325e + 1024;
        if (i7 > j7) {
            i7 = (int) j7;
        }
        if (i7 > 33554432) {
            i7 = 33554432;
        }
        Object[] objArr = new Object[i7];
        int i8 = 0;
        do {
            objArr[i8] = it.next();
            i8++;
            if (i8 >= i7) {
                break;
            }
        } while (it.hasNext());
        this.f18325e = i8;
        long j8 = this.f18324d;
        if (j8 != Long.MAX_VALUE) {
            this.f18324d = j8 - i8;
        }
        return new C5018l0(objArr, 0, i8, this.f18323c);
    }

    @Override // p256j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f18322b;
        if (it == null) {
            Iterator it2 = this.f18321a.iterator();
            this.f18322b = it2;
            this.f18324d = r0.size();
            it = it2;
        }
        AbstractC4994d.m21359q(it, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f18322b == null) {
            this.f18322b = this.f18321a.iterator();
            this.f18324d = r0.size();
        }
        if (!this.f18322b.hasNext()) {
            return false;
        }
        consumer.accept(this.f18322b.next());
        return true;
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        if (this.f18322b == null) {
            Collection collection = this.f18321a;
            this.f18322b = collection.iterator();
            long size = collection.size();
            this.f18324d = size;
            return size;
        }
        return this.f18324d;
    }

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return this.f18323c;
    }

    @Override // p256j$.util.Spliterator
    public Comparator getComparator() {
        if (AbstractC4994d.m21347e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
