package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4957W;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.i4 */
/* loaded from: classes3.dex */
final class C5215i4 extends AbstractC5239m4 implements DoubleConsumer, InterfaceC4957W {

    /* renamed from: e */
    double f18632e;

    /* renamed from: f */
    public final /* synthetic */ int f18633f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5215i4(Spliterator spliterator, int i7) {
        super(spliterator);
        this.f18633f = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5215i4(Spliterator spliterator, AbstractC5239m4 abstractC5239m4, int i7) {
        super(spliterator, abstractC5239m4);
        this.f18633f = i7;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21343a(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21348f(this, consumer);
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        this.f18661d = (this.f18661d + 1) & 63;
        this.f18632e = d7;
    }

    @Override // p256j$.util.stream.AbstractC5239m4
    /* renamed from: c */
    final Spliterator mo21566c(Spliterator spliterator) {
        switch (this.f18633f) {
            case 0:
                return new C5215i4((InterfaceC4957W) spliterator, this, 0);
            default:
                return new C5215i4((InterfaceC4957W) spliterator, this, 1);
        }
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f18633f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4999f0 trySplit() {
        switch (this.f18633f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p256j$.util.InterfaceC4957W
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f18633f) {
            case 0:
                boolean z6 = this.f18660c;
                Spliterator spliterator = this.f18658a;
                if (z6) {
                    this.f18660c = false;
                    boolean tryAdvance = ((InterfaceC4957W) spliterator).tryAdvance((DoubleConsumer) this);
                    if (tryAdvance && m21581b()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.f18632e);
                        throw null;
                    }
                    if (!tryAdvance) {
                        return tryAdvance;
                    }
                    doubleConsumer.accept(this.f18632e);
                    return tryAdvance;
                }
                return ((InterfaceC4957W) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.f18660c && m21581b() && ((InterfaceC4957W) this.f18658a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.f18632e);
                    throw null;
                }
                this.f18660c = false;
                return false;
        }
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public InterfaceC4957W trySplit() {
        switch (this.f18633f) {
            case 1:
                if (this.f18659b.get()) {
                    return null;
                }
                return (InterfaceC4957W) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p256j$.util.InterfaceC4999f0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f18633f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
