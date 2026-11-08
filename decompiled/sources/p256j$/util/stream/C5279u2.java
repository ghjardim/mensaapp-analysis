package p256j$.util.stream;

/* renamed from: j$.util.stream.u2 */
/* loaded from: classes3.dex */
final class C5279u2 extends AbstractC5231l2 {

    /* renamed from: b */
    long f18708b;

    /* renamed from: c */
    long f18709c;

    /* renamed from: d */
    final /* synthetic */ C5284v2 f18710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5279u2(C5284v2 c5284v2, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18710d = c5284v2;
        this.f18708b = c5284v2.f18713m;
        long j7 = c5284v2.f18714n;
        this.f18709c = j7 < 0 ? Long.MAX_VALUE : j7;
    }

    @Override // p256j$.util.stream.AbstractC5231l2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18649a.mo21460l(AbstractC5034A0.m21368A(j7, this.f18710d.f18713m, this.f18709c));
    }

    @Override // p256j$.util.stream.InterfaceC5254p2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        long j7 = this.f18708b;
        if (j7 == 0) {
            long j8 = this.f18709c;
            if (j8 > 0) {
                this.f18709c = j8 - 1;
                this.f18649a.accept(i7);
                return;
            }
            return;
        }
        this.f18708b = j7 - 1;
    }

    @Override // p256j$.util.stream.AbstractC5231l2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final boolean mo21455n() {
        return this.f18709c == 0 || this.f18649a.mo21455n();
    }
}
