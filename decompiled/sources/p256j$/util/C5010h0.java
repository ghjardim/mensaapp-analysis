package p256j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.h0 */
/* loaded from: classes3.dex */
final class C5010h0 implements Iterator, Consumer {

    /* renamed from: a */
    boolean f18283a = false;

    /* renamed from: b */
    Object f18284b;

    /* renamed from: c */
    final /* synthetic */ Spliterator f18285c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    C5010h0(Spliterator spliterator) {
        this.f18285c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f18283a = true;
        this.f18284b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f18283a) {
            this.f18285c.tryAdvance(this);
        }
        return this.f18283a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f18283a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18283a = false;
        return this.f18284b;
    }
}
