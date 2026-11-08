package p256j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.z0 */
/* loaded from: classes3.dex */
final class C5302z0 extends AbstractC5174c {

    /* renamed from: j */
    private final C5297y0 f18745j;

    C5302z0(C5297y0 c5297y0, AbstractC5168b abstractC5168b, Spliterator spliterator) {
        super(abstractC5168b, spliterator);
        this.f18745j = c5297y0;
    }

    C5302z0(C5302z0 c5302z0, Spliterator spliterator) {
        super(c5302z0, spliterator);
        this.f18745j = c5302z0.f18745j;
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: e */
    protected final AbstractC5186e mo21448e(Spliterator spliterator) {
        return new C5302z0(this, spliterator);
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: a */
    protected final Object mo21447a() {
        boolean z6;
        AbstractC5168b abstractC5168b = this.f18563a;
        AbstractC5287w0 abstractC5287w0 = (AbstractC5287w0) this.f18745j.f18734b.get();
        abstractC5168b.m21524V(this.f18564b, abstractC5287w0);
        boolean z7 = abstractC5287w0.f18717b;
        z6 = this.f18745j.f18733a.f18727b;
        if (z7 == z6) {
            Boolean valueOf = Boolean.valueOf(z7);
            AtomicReference atomicReference = this.f18549h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // p256j$.util.stream.AbstractC5174c
    /* renamed from: j */
    protected final Object mo21450j() {
        boolean z6;
        z6 = this.f18745j.f18733a.f18727b;
        return Boolean.valueOf(!z6);
    }
}
