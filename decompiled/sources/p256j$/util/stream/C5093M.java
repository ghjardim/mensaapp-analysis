package p256j$.util.stream;

import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.M */
/* loaded from: classes3.dex */
final class C5093M extends AbstractC5113Q implements InterfaceC5249o2 {

    /* renamed from: b */
    final DoubleConsumer f18419b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21462p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p256j$.util.stream.InterfaceC5249o2
    /* renamed from: p */
    public final /* synthetic */ void mo21462p(Double d7) {
        AbstractC5034A0.m21399e(this, d7);
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

    C5093M(DoubleConsumer doubleConsumer, boolean z6) {
        super(z6);
        this.f18419b = doubleConsumer;
    }

    @Override // p256j$.util.stream.AbstractC5113Q, p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        this.f18419b.accept(d7);
    }
}
