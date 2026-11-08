package p256j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.Objects;
import p256j$.util.Spliterator;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.F3 */
/* loaded from: classes3.dex */
final class C5062F3 extends AbstractC5072H3 implements Spliterator, Consumer {

    /* renamed from: f */
    Object f18375f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
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

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f18375f = obj;
    }

    @Override // p256j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (m21465d() != EnumC5067G3.NO_MORE && this.f18391a.tryAdvance(this)) {
            if (m21464b(1L) == 1) {
                consumer.accept(this.f18375f);
                this.f18375f = null;
                return true;
            }
        }
        return false;
    }

    @Override // p256j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C5238m3 c5238m3 = null;
        while (true) {
            EnumC5067G3 m21465d = m21465d();
            if (m21465d == EnumC5067G3.NO_MORE) {
                return;
            }
            EnumC5067G3 enumC5067G3 = EnumC5067G3.MAYBE_MORE;
            Spliterator spliterator = this.f18391a;
            if (m21465d == enumC5067G3) {
                int i7 = this.f18393c;
                if (c5238m3 == null) {
                    c5238m3 = new C5238m3(i7);
                } else {
                    c5238m3.f18664a = 0;
                }
                long j7 = 0;
                while (spliterator.tryAdvance(c5238m3)) {
                    j7++;
                    if (j7 >= i7) {
                        break;
                    }
                }
                if (j7 == 0) {
                    return;
                }
                long m21464b = m21464b(j7);
                for (int i8 = 0; i8 < m21464b; i8++) {
                    consumer.accept(c5238m3.f18657b[i8]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // p256j$.util.stream.AbstractC5072H3
    /* renamed from: c */
    protected final Spliterator mo21451c(Spliterator spliterator) {
        return new C5062F3(spliterator, this);
    }
}
