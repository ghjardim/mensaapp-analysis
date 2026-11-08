package p256j$.util.stream;

import java.util.function.LongPredicate;

/* renamed from: j$.util.stream.W3 */
/* loaded from: classes3.dex */
final class C5146W3 extends AbstractC5237m2 {

    /* renamed from: b */
    boolean f18512b;

    /* renamed from: c */
    final /* synthetic */ C5151X3 f18513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5146W3(C5151X3 c5151x3, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18513c = c5151x3;
        this.f18512b = true;
    }

    @Override // p256j$.util.stream.AbstractC5237m2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18656a.mo21460l(-1L);
    }

    @Override // p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        if (this.f18512b) {
            this.f18513c.getClass();
            LongPredicate longPredicate = null;
            longPredicate.test(j7);
            throw null;
        }
    }

    @Override // p256j$.util.stream.AbstractC5237m2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final boolean mo21455n() {
        return !this.f18512b || this.f18656a.mo21455n();
    }
}
