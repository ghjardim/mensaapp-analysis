package p256j$.util.stream;

import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.N */
/* loaded from: classes3.dex */
final class C5098N extends AbstractC5113Q implements InterfaceC5254p2 {

    /* renamed from: b */
    final IntConsumer f18425b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21487m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p256j$.util.stream.InterfaceC5254p2
    /* renamed from: m */
    public final /* synthetic */ void mo21487m(Integer num) {
        AbstractC5034A0.m21402g(this, num);
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

    C5098N(IntConsumer intConsumer, boolean z6) {
        super(z6);
        this.f18425b = intConsumer;
    }

    @Override // p256j$.util.stream.AbstractC5113Q, p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        this.f18425b.accept(i7);
    }
}
