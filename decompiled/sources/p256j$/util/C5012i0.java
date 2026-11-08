package p256j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.i0 */
/* loaded from: classes3.dex */
final class C5012i0 implements InterfaceC4948M, IntConsumer, InterfaceC4936A {

    /* renamed from: a */
    boolean f18287a = false;

    /* renamed from: b */
    int f18288b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC4960Z f18289c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    @Override // p256j$.util.InterfaceC4953S
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (AbstractC5311v0.f18756a) {
            AbstractC5311v0.m21606a(C5012i0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // p256j$.util.InterfaceC4948M, java.util.Iterator, p256j$.util.InterfaceC4936A
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (AbstractC5311v0.f18756a) {
            AbstractC5311v0.m21606a(C5012i0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new C4945J(consumer));
    }

    C5012i0(InterfaceC4960Z interfaceC4960Z) {
        this.f18289c = interfaceC4960Z;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        this.f18287a = true;
        this.f18288b = i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f18287a) {
            this.f18289c.tryAdvance((IntConsumer) this);
        }
        return this.f18287a;
    }

    @Override // p256j$.util.InterfaceC4948M
    public final int nextInt() {
        if (!this.f18287a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18287a = false;
        return this.f18288b;
    }
}
