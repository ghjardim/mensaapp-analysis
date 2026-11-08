package p256j$.util.stream;

/* renamed from: j$.util.stream.w2 */
/* loaded from: classes3.dex */
final class C5289w2 extends AbstractC5237m2 {

    /* renamed from: b */
    long f18719b;

    /* renamed from: c */
    long f18720c;

    /* renamed from: d */
    final /* synthetic */ C5294x2 f18721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5289w2(C5294x2 c5294x2, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18721d = c5294x2;
        this.f18719b = c5294x2.f18729m;
        long j7 = c5294x2.f18730n;
        this.f18720c = j7 < 0 ? Long.MAX_VALUE : j7;
    }

    @Override // p256j$.util.stream.AbstractC5237m2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18656a.mo21460l(AbstractC5034A0.m21368A(j7, this.f18721d.f18729m, this.f18720c));
    }

    @Override // p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        long j8 = this.f18719b;
        if (j8 == 0) {
            long j9 = this.f18720c;
            if (j9 > 0) {
                this.f18720c = j9 - 1;
                this.f18656a.accept(j7);
                return;
            }
            return;
        }
        this.f18719b = j8 - 1;
    }

    @Override // p256j$.util.stream.AbstractC5237m2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final boolean mo21455n() {
        return this.f18720c == 0 || this.f18656a.mo21455n();
    }
}
