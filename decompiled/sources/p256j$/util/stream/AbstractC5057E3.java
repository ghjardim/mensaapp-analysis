package p256j$.util.stream;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Objects;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.E3 */
/* loaded from: classes3.dex */
abstract class AbstractC5057E3 extends AbstractC5072H3 implements InterfaceC4999f0 {
    /* renamed from: e */
    protected abstract void mo21452e(Object obj);

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC4994d.m21346d(this);
    }

    /* renamed from: h */
    protected abstract AbstractC5232l3 mo21453h(int i7);

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC4994d.m21347e(this, i7);
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (m21465d() != EnumC5067G3.NO_MORE && ((InterfaceC4999f0) this.f18391a).tryAdvance(this)) {
            if (m21464b(1L) == 1) {
                mo21452e(obj);
                return true;
            }
        }
        return false;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC5232l3 abstractC5232l3 = null;
        while (true) {
            EnumC5067G3 m21465d = m21465d();
            if (m21465d == EnumC5067G3.NO_MORE) {
                return;
            }
            EnumC5067G3 enumC5067G3 = EnumC5067G3.MAYBE_MORE;
            Spliterator spliterator = this.f18391a;
            if (m21465d == enumC5067G3) {
                int i7 = this.f18393c;
                if (abstractC5232l3 == null) {
                    abstractC5232l3 = mo21453h(i7);
                } else {
                    abstractC5232l3.f18650b = 0;
                }
                long j7 = 0;
                while (((InterfaceC4999f0) spliterator).tryAdvance(abstractC5232l3)) {
                    j7++;
                    if (j7 >= i7) {
                        break;
                    }
                }
                if (j7 == 0) {
                    return;
                } else {
                    abstractC5232l3.mo21565b(obj, m21464b(j7));
                }
            } else {
                ((InterfaceC4999f0) spliterator).forEachRemaining(obj);
                return;
            }
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
