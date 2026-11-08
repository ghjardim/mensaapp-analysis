package p256j$.util.stream;

import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.W */
/* loaded from: classes3.dex */
final class C5142W extends AbstractC5163a0 {

    /* renamed from: m */
    public final /* synthetic */ int f18510m;

    /* renamed from: n */
    final /* synthetic */ Object f18511n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5142W(AbstractC5168b abstractC5168b, int i7, Object obj, int i8) {
        super(abstractC5168b, i7, 1);
        this.f18510m = i8;
        this.f18511n = obj;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: R */
    final InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2) {
        switch (this.f18510m) {
            case 0:
                return new C5137V(this, interfaceC5264r2, 1);
            case 1:
                return new C5137V(this, interfaceC5264r2, 2);
            case 2:
                return new C5152Y(this, interfaceC5264r2);
            case 3:
                return new C5234m(this, interfaceC5264r2, 4);
            default:
                return new C5195f2(this, interfaceC5264r2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5142W(AbstractC5169b0 abstractC5169b0, IntConsumer intConsumer) {
        super(abstractC5169b0, 0, 1);
        this.f18510m = 0;
        this.f18511n = intConsumer;
    }
}
