package p256j$.util.stream;

/* renamed from: j$.util.stream.y2 */
/* loaded from: classes3.dex */
final class C5299y2 extends AbstractC5225k2 {

    /* renamed from: b */
    long f18742b;

    /* renamed from: c */
    long f18743c;

    /* renamed from: d */
    final /* synthetic */ C5304z2 f18744d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5299y2(C5304z2 c5304z2, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18744d = c5304z2;
        this.f18742b = c5304z2.f18746m;
        long j7 = c5304z2.f18747n;
        this.f18743c = j7 < 0 ? Long.MAX_VALUE : j7;
    }

    @Override // p256j$.util.stream.AbstractC5225k2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18641a.mo21460l(AbstractC5034A0.m21368A(j7, this.f18744d.f18746m, this.f18743c));
    }

    @Override // p256j$.util.stream.InterfaceC5249o2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        long j7 = this.f18742b;
        if (j7 == 0) {
            long j8 = this.f18743c;
            if (j8 > 0) {
                this.f18743c = j8 - 1;
                this.f18641a.accept(d7);
                return;
            }
            return;
        }
        this.f18742b = j7 - 1;
    }

    @Override // p256j$.util.stream.AbstractC5225k2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final boolean mo21455n() {
        return this.f18743c == 0 || this.f18641a.mo21455n();
    }
}
