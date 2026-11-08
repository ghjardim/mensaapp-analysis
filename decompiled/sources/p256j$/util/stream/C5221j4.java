package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.j4 */
/* loaded from: classes3.dex */
final class C5221j4 extends AbstractC5239m4 implements IntConsumer, InterfaceC4960Z {

    /* renamed from: e */
    int f18638e;

    /* renamed from: f */
    public final /* synthetic */ int f18639f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5221j4(Spliterator spliterator, int i7) {
        super(spliterator);
        this.f18639f = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5221j4(Spliterator spliterator, AbstractC5239m4 abstractC5239m4, int i7) {
        super(spliterator, abstractC5239m4);
        this.f18639f = i7;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21344b(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21349g(this, consumer);
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        this.f18661d = (this.f18661d + 1) & 63;
        this.f18638e = i7;
    }

    @Override // p256j$.util.stream.AbstractC5239m4
    /* renamed from: c */
    final Spliterator mo21566c(Spliterator spliterator) {
        switch (this.f18639f) {
            case 0:
                return new C5221j4((InterfaceC4960Z) spliterator, this, 0);
            default:
                return new C5221j4((InterfaceC4960Z) spliterator, this, 1);
        }
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f18639f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4999f0 trySplit() {
        switch (this.f18639f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p256j$.util.InterfaceC4960Z
    public final boolean tryAdvance(IntConsumer intConsumer) {
        switch (this.f18639f) {
            case 0:
                boolean z6 = this.f18660c;
                Spliterator spliterator = this.f18658a;
                if (z6) {
                    this.f18660c = false;
                    boolean tryAdvance = ((InterfaceC4960Z) spliterator).tryAdvance((IntConsumer) this);
                    if (tryAdvance && m21581b()) {
                        IntPredicate intPredicate = null;
                        intPredicate.test(this.f18638e);
                        throw null;
                    }
                    if (!tryAdvance) {
                        return tryAdvance;
                    }
                    intConsumer.accept(this.f18638e);
                    return tryAdvance;
                }
                return ((InterfaceC4960Z) spliterator).tryAdvance(intConsumer);
            default:
                if (this.f18660c && m21581b() && ((InterfaceC4960Z) this.f18658a).tryAdvance((IntConsumer) this)) {
                    IntPredicate intPredicate2 = null;
                    intPredicate2.test(this.f18638e);
                    throw null;
                }
                this.f18660c = false;
                return false;
        }
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public InterfaceC4960Z trySplit() {
        switch (this.f18639f) {
            case 1:
                if (this.f18659b.get()) {
                    return null;
                }
                return (InterfaceC4960Z) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p256j$.util.InterfaceC4999f0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f18639f) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return tryAdvance((IntConsumer) obj);
        }
    }
}
