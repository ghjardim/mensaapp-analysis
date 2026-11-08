package p256j$.util.stream;

import java.util.function.DoublePredicate;

/* renamed from: j$.util.stream.a4 */
/* loaded from: classes3.dex */
final class C5167a4 extends AbstractC5225k2 {

    /* renamed from: b */
    boolean f18534b;

    /* renamed from: c */
    final /* synthetic */ C5173b4 f18535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5167a4(C5173b4 c5173b4, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18535c = c5173b4;
        this.f18534b = true;
    }

    @Override // p256j$.util.stream.AbstractC5225k2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18641a.mo21460l(-1L);
    }

    @Override // p256j$.util.stream.InterfaceC5249o2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        if (this.f18534b) {
            this.f18535c.getClass();
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d7);
            throw null;
        }
    }

    @Override // p256j$.util.stream.AbstractC5225k2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final boolean mo21455n() {
        return !this.f18534b || this.f18641a.mo21455n();
    }
}
