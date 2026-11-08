package p256j$.util.stream;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Objects;

/* renamed from: j$.util.stream.y3 */
/* loaded from: classes3.dex */
abstract class AbstractC5300y3 extends AbstractC5037A3 implements InterfaceC4999f0 {
    /* renamed from: b */
    protected abstract Object mo21603b();

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

    AbstractC5300y3(InterfaceC4999f0 interfaceC4999f0, long j7, long j8) {
        super(interfaceC4999f0, j7, j8, 0L, Math.min(interfaceC4999f0.estimateSize(), j8));
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(Object obj) {
        long j7;
        Objects.requireNonNull(obj);
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
            ((InterfaceC4999f0) this.f18337c).tryAdvance(mo21603b());
            this.f18338d++;
        }
        if (j7 >= this.f18339e) {
            return false;
        }
        this.f18338d = j7 + 1;
        return ((InterfaceC4999f0) this.f18337c).tryAdvance(obj);
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j7 = this.f18339e;
        long j8 = this.f18335a;
        if (j8 >= j7) {
            return;
        }
        long j9 = this.f18338d;
        if (j9 >= j7) {
            return;
        }
        if (j9 >= j8 && ((InterfaceC4999f0) this.f18337c).estimateSize() + j9 <= this.f18336b) {
            ((InterfaceC4999f0) this.f18337c).forEachRemaining(obj);
            this.f18338d = this.f18339e;
            return;
        }
        while (j8 > this.f18338d) {
            ((InterfaceC4999f0) this.f18337c).tryAdvance(mo21603b());
            this.f18338d++;
        }
        while (this.f18338d < this.f18339e) {
            ((InterfaceC4999f0) this.f18337c).tryAdvance(obj);
            this.f18338d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
