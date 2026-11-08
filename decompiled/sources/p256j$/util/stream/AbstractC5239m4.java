package p256j$.util.stream;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4957W;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.m4 */
/* loaded from: classes3.dex */
abstract class AbstractC5239m4 implements Spliterator {

    /* renamed from: a */
    final Spliterator f18658a;

    /* renamed from: b */
    final AtomicBoolean f18659b;

    /* renamed from: c */
    boolean f18660c;

    /* renamed from: d */
    int f18661d;

    /* renamed from: c */
    abstract Spliterator mo21566c(Spliterator spliterator);

    @Override // p256j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC4994d.m21347e(this, i7);
    }

    @Override // p256j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    AbstractC5239m4(Spliterator spliterator) {
        this.f18660c = true;
        this.f18658a = spliterator;
        this.f18659b = new AtomicBoolean();
    }

    AbstractC5239m4(Spliterator spliterator, AbstractC5239m4 abstractC5239m4) {
        this.f18660c = true;
        this.f18658a = spliterator;
        abstractC5239m4.getClass();
        this.f18659b = abstractC5239m4.f18659b;
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        return this.f18658a.estimateSize();
    }

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return this.f18658a.characteristics() & (-16449);
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f18658a.getComparator();
    }

    @Override // p256j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator trySplit = this.f18658a.trySplit();
        if (trySplit != null) {
            return mo21566c(trySplit);
        }
        return null;
    }

    /* renamed from: b */
    final boolean m21581b() {
        return (this.f18661d == 0 && this.f18659b.get()) ? false : true;
    }

    @Override // p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4960Z trySplit() {
        return (InterfaceC4960Z) trySplit();
    }

    @Override // p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4966c0 trySplit() {
        return (InterfaceC4966c0) trySplit();
    }

    @Override // p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4957W trySplit() {
        return (InterfaceC4957W) trySplit();
    }

    @Override // p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4999f0 trySplit() {
        return (InterfaceC4999f0) trySplit();
    }
}
