package p256j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.Objects;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.z3 */
/* loaded from: classes3.dex */
final class C5305z3 extends AbstractC5037A3 implements Spliterator {
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

    C5305z3(Spliterator spliterator, long j7, long j8) {
        super(spliterator, j7, j8, 0L, Math.min(spliterator.estimateSize(), j8));
    }

    @Override // p256j$.util.stream.AbstractC5037A3
    /* renamed from: a */
    protected final Spliterator mo21426a(Spliterator spliterator, long j7, long j8, long j9, long j10) {
        return new C5305z3(spliterator, j7, j8, j9, j10);
    }

    @Override // p256j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j7;
        Objects.requireNonNull(consumer);
        long j8 = this.f18339e;
        long j9 = this.f18335a;
        if (j9 >= j8) {
            return false;
        }
        while (true) {
            j7 = this.f18338d;
            if (j9 <= j7) {
                break;
            }
            this.f18337c.tryAdvance(new C5189e2(4));
            this.f18338d++;
        }
        if (j7 >= this.f18339e) {
            return false;
        }
        this.f18338d = j7 + 1;
        return this.f18337c.tryAdvance(consumer);
    }

    @Override // p256j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j7 = this.f18339e;
        long j8 = this.f18335a;
        if (j8 >= j7) {
            return;
        }
        long j9 = this.f18338d;
        if (j9 >= j7) {
            return;
        }
        if (j9 >= j8 && this.f18337c.estimateSize() + j9 <= this.f18336b) {
            this.f18337c.forEachRemaining(consumer);
            this.f18338d = this.f18339e;
            return;
        }
        while (j8 > this.f18338d) {
            this.f18337c.tryAdvance(new C5189e2(5));
            this.f18338d++;
        }
        while (this.f18338d < this.f18339e) {
            this.f18337c.tryAdvance(consumer);
            this.f18338d++;
        }
    }
}
