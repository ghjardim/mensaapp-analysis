package p256j$.util.stream;

import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.o1 */
/* loaded from: classes3.dex */
abstract class AbstractC5248o1 extends AbstractC5258q1 implements InterfaceC4999f0 {
    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(Object obj) {
        InterfaceC5089L0 interfaceC5089L0;
        if (!m21592c()) {
            return false;
        }
        boolean tryAdvance = ((InterfaceC4999f0) this.f18683d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f18682c == null && (interfaceC5089L0 = (InterfaceC5089L0) AbstractC5258q1.m21590a(this.f18684e)) != null) {
                InterfaceC4999f0 spliterator = interfaceC5089L0.spliterator();
                this.f18683d = spliterator;
                return spliterator.tryAdvance(obj);
            }
            this.f18680a = null;
        }
        return tryAdvance;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(Object obj) {
        if (this.f18680a == null) {
            return;
        }
        if (this.f18683d == null) {
            Spliterator spliterator = this.f18682c;
            if (spliterator == null) {
                ArrayDeque m21591b = m21591b();
                while (true) {
                    InterfaceC5089L0 interfaceC5089L0 = (InterfaceC5089L0) AbstractC5258q1.m21590a(m21591b);
                    if (interfaceC5089L0 != null) {
                        interfaceC5089L0.mo21481e(obj);
                    } else {
                        this.f18680a = null;
                        return;
                    }
                }
            } else {
                ((InterfaceC4999f0) spliterator).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
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
