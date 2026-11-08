package p256j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.j0 */
/* loaded from: classes3.dex */
final class C5014j0 implements InterfaceC4952Q, LongConsumer, InterfaceC4936A {

    /* renamed from: a */
    boolean f18295a = false;

    /* renamed from: b */
    long f18296b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC4966c0 f18297c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    @Override // p256j$.util.InterfaceC4953S
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (AbstractC5311v0.f18756a) {
            AbstractC5311v0.m21606a(C5014j0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // p256j$.util.InterfaceC4952Q, java.util.Iterator, p256j$.util.InterfaceC4936A
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (AbstractC5311v0.f18756a) {
            AbstractC5311v0.m21606a(C5014j0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new C4949N(consumer));
    }

    C5014j0(InterfaceC4966c0 interfaceC4966c0) {
        this.f18297c = interfaceC4966c0;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j7) {
        this.f18295a = true;
        this.f18296b = j7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f18295a) {
            this.f18297c.tryAdvance((LongConsumer) this);
        }
        return this.f18295a;
    }

    @Override // p256j$.util.InterfaceC4952Q
    public final long nextLong() {
        if (!this.f18295a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18295a = false;
        return this.f18296b;
    }
}
