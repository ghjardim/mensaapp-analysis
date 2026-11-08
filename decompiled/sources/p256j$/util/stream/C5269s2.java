package p256j$.util.stream;

/* renamed from: j$.util.stream.s2 */
/* loaded from: classes3.dex */
final class C5269s2 extends AbstractC5243n2 {

    /* renamed from: b */
    long f18697b;

    /* renamed from: c */
    long f18698c;

    /* renamed from: d */
    final /* synthetic */ C5274t2 f18699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5269s2(C5274t2 c5274t2, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18699d = c5274t2;
        this.f18697b = c5274t2.f18702m;
        long j7 = c5274t2.f18703n;
        this.f18698c = j7 < 0 ? Long.MAX_VALUE : j7;
    }

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18663a.mo21460l(AbstractC5034A0.m21368A(j7, this.f18699d.f18702m, this.f18698c));
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void m21477p(Object obj) {
        long j7 = this.f18697b;
        if (j7 == 0) {
            long j8 = this.f18698c;
            if (j8 > 0) {
                this.f18698c = j8 - 1;
                this.f18663a.m21477p((InterfaceC5264r2) obj);
                return;
            }
            return;
        }
        this.f18697b = j7 - 1;
    }

    @Override // p256j$.util.stream.AbstractC5243n2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final boolean mo21455n() {
        return this.f18698c == 0 || this.f18663a.mo21455n();
    }
}
