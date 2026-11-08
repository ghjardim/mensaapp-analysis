package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.k4 */
/* loaded from: classes3.dex */
final class C5227k4 extends AbstractC5239m4 implements LongConsumer, InterfaceC4966c0 {

    /* renamed from: e */
    long f18643e;

    /* renamed from: f */
    public final /* synthetic */ int f18644f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5227k4(Spliterator spliterator, int i7) {
        super(spliterator);
        this.f18644f = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5227k4(Spliterator spliterator, AbstractC5239m4 abstractC5239m4, int i7) {
        super(spliterator, abstractC5239m4);
        this.f18644f = i7;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC4994d.m21345c(this, consumer);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC4994d.m21350h(this, consumer);
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j7) {
        this.f18661d = (this.f18661d + 1) & 63;
        this.f18643e = j7;
    }

    @Override // p256j$.util.stream.AbstractC5239m4
    /* renamed from: c */
    final Spliterator mo21566c(Spliterator spliterator) {
        switch (this.f18644f) {
            case 0:
                return new C5227k4((InterfaceC4966c0) spliterator, this, 0);
            default:
                return new C5227k4((InterfaceC4966c0) spliterator, this, 1);
        }
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f18644f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4999f0 trySplit() {
        switch (this.f18644f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p256j$.util.InterfaceC4966c0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (this.f18644f) {
            case 0:
                boolean z6 = this.f18660c;
                Spliterator spliterator = this.f18658a;
                if (z6) {
                    this.f18660c = false;
                    boolean tryAdvance = ((InterfaceC4966c0) spliterator).tryAdvance((LongConsumer) this);
                    if (tryAdvance && m21581b()) {
                        LongPredicate longPredicate = null;
                        longPredicate.test(this.f18643e);
                        throw null;
                    }
                    if (!tryAdvance) {
                        return tryAdvance;
                    }
                    longConsumer.accept(this.f18643e);
                    return tryAdvance;
                }
                return ((InterfaceC4966c0) spliterator).tryAdvance(longConsumer);
            default:
                if (this.f18660c && m21581b() && ((InterfaceC4966c0) this.f18658a).tryAdvance((LongConsumer) this)) {
                    LongPredicate longPredicate2 = null;
                    longPredicate2.test(this.f18643e);
                    throw null;
                }
                this.f18660c = false;
                return false;
        }
    }

    @Override // p256j$.util.stream.AbstractC5239m4, p256j$.util.Spliterator
    public InterfaceC4966c0 trySplit() {
        switch (this.f18644f) {
            case 1:
                if (this.f18659b.get()) {
                    return null;
                }
                return (InterfaceC4966c0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // p256j$.util.InterfaceC4999f0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f18644f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}
