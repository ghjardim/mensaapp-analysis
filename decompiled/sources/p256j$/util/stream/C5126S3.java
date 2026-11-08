package p256j$.util.stream;

import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.S3 */
/* loaded from: classes3.dex */
final class C5126S3 extends AbstractC5231l2 {

    /* renamed from: b */
    boolean f18485b;

    /* renamed from: c */
    final /* synthetic */ C5131T3 f18486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5126S3(C5131T3 c5131t3, InterfaceC5264r2 interfaceC5264r2) {
        super(interfaceC5264r2);
        this.f18486c = c5131t3;
        this.f18485b = true;
    }

    @Override // p256j$.util.stream.AbstractC5231l2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18649a.mo21460l(-1L);
    }

    @Override // p256j$.util.stream.InterfaceC5254p2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        if (this.f18485b) {
            this.f18486c.getClass();
            IntPredicate intPredicate = null;
            intPredicate.test(i7);
            throw null;
        }
    }

    @Override // p256j$.util.stream.AbstractC5231l2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final boolean mo21455n() {
        return !this.f18485b || this.f18649a.mo21455n();
    }
}
