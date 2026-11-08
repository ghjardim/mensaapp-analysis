package p256j$.util.stream;

import java.util.function.Consumer;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.P */
/* loaded from: classes3.dex */
final class C5108P extends AbstractC5113Q {

    /* renamed from: b */
    final Consumer f18442b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p256j$.util.stream.InterfaceC5092L3
    /* renamed from: b */
    public final Object mo21422b(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        abstractC5168b.m21524V(spliterator, this);
        return null;
    }

    @Override // p256j$.util.stream.InterfaceC5092L3
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo21423c(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        m21490e(abstractC5168b, spliterator);
        return null;
    }

    C5108P(Consumer consumer, boolean z6) {
        super(z6);
        this.f18442b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f18442b.accept(obj);
    }
}
