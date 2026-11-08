package p256j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.j0 */
/* loaded from: classes3.dex */
final class C5217j0 extends AbstractC5229l0 {

    /* renamed from: m */
    public final /* synthetic */ int f18635m;

    /* renamed from: n */
    final /* synthetic */ Object f18636n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5217j0(AbstractC5168b abstractC5168b, int i7, Object obj, int i8) {
        super(abstractC5168b, i7, 1);
        this.f18635m = i8;
        this.f18636n = obj;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: R */
    final InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2) {
        switch (this.f18635m) {
            case 0:
                return new C5211i0(this, interfaceC5264r2);
            case 1:
                return new C5199g0(this, interfaceC5264r2, 5);
            case 2:
                return new C5195f2(this, interfaceC5264r2);
            default:
                return new C5234m(this, interfaceC5264r2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5217j0(AbstractC5235m0 abstractC5235m0, LongConsumer longConsumer) {
        super(abstractC5235m0, 0, 1);
        this.f18635m = 1;
        this.f18636n = longConsumer;
    }
}
