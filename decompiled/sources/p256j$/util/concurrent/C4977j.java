package p256j$.util.concurrent;

import java.util.Comparator;
import java.util.function.Consumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.Spliterator;

/* renamed from: j$.util.concurrent.j */
/* loaded from: classes3.dex */
final class C4977j extends C4983p implements Spliterator {

    /* renamed from: i */
    public final /* synthetic */ int f18218i;

    /* renamed from: j */
    long f18219j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4977j(C4979l[] c4979lArr, int i7, int i8, int i9, long j7, int i10) {
        super(c4979lArr, i7, i8, i9);
        this.f18218i = i10;
        this.f18219j = j7;
    }

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        switch (this.f18218i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f18218i) {
        }
        return AbstractC4994d.m21346d(this);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        switch (this.f18218i) {
        }
        return AbstractC4994d.m21347e(this, i7);
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f18218i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // p256j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f18218i) {
            case 0:
                int i7 = this.f18236f;
                int i8 = this.f18237g;
                int i9 = (i7 + i8) >>> 1;
                if (i9 <= i7) {
                    return null;
                }
                C4979l[] c4979lArr = this.f18231a;
                this.f18237g = i9;
                long j7 = this.f18219j >>> 1;
                this.f18219j = j7;
                return new C4977j(c4979lArr, this.f18238h, i9, i8, j7, 0);
            default:
                int i10 = this.f18236f;
                int i11 = this.f18237g;
                int i12 = (i10 + i11) >>> 1;
                if (i12 <= i10) {
                    return null;
                }
                C4979l[] c4979lArr2 = this.f18231a;
                this.f18237g = i12;
                long j8 = this.f18219j >>> 1;
                this.f18219j = j8;
                return new C4977j(c4979lArr2, this.f18238h, i12, i11, j8, 1);
        }
    }

    @Override // p256j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f18218i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C4979l m21329a = m21329a();
                    if (m21329a == null) {
                        break;
                    } else {
                        consumer.accept(m21329a.f18224b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    C4979l m21329a2 = m21329a();
                    if (m21329a2 == null) {
                        break;
                    } else {
                        consumer.accept(m21329a2.f18225c);
                    }
                }
        }
    }

    @Override // p256j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f18218i) {
            case 0:
                consumer.getClass();
                C4979l m21329a = m21329a();
                if (m21329a != null) {
                    consumer.accept(m21329a.f18224b);
                    break;
                }
                break;
            default:
                consumer.getClass();
                C4979l m21329a2 = m21329a();
                if (m21329a2 != null) {
                    consumer.accept(m21329a2.f18225c);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f18218i) {
        }
        return this.f18219j;
    }
}
