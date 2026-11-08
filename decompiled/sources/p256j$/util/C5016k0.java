package p256j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.k0 */
/* loaded from: classes3.dex */
final class C5016k0 implements InterfaceC4944I, DoubleConsumer, InterfaceC4936A {

    /* renamed from: a */
    boolean f18298a = false;

    /* renamed from: b */
    double f18299b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC4957W f18300c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // p256j$.util.InterfaceC4953S
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (AbstractC5311v0.f18756a) {
            AbstractC5311v0.m21606a(C5016k0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // p256j$.util.InterfaceC4944I, java.util.Iterator, p256j$.util.InterfaceC4936A
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (AbstractC5311v0.f18756a) {
            AbstractC5311v0.m21606a(C5016k0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new C4941F(consumer));
    }

    C5016k0(InterfaceC4957W interfaceC4957W) {
        this.f18300c = interfaceC4957W;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        this.f18298a = true;
        this.f18299b = d7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f18298a) {
            this.f18300c.tryAdvance((DoubleConsumer) this);
        }
        return this.f18298a;
    }

    @Override // p256j$.util.InterfaceC4944I
    public final double nextDouble() {
        if (!this.f18298a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18298a = false;
        return this.f18299b;
    }
}
