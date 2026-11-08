package p256j$.util.stream;

import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.O */
/* loaded from: classes3.dex */
final class C5103O extends AbstractC5113Q implements InterfaceC5259q2 {

    /* renamed from: b */
    final LongConsumer f18432b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21458j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p256j$.util.stream.InterfaceC5259q2
    /* renamed from: j */
    public final /* synthetic */ void mo21458j(Long l7) {
        AbstractC5034A0.m21404i(this, l7);
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

    C5103O(LongConsumer longConsumer, boolean z6) {
        super(z6);
        this.f18432b = longConsumer;
    }

    @Override // p256j$.util.stream.AbstractC5113Q, p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        this.f18432b.accept(j7);
    }
}
