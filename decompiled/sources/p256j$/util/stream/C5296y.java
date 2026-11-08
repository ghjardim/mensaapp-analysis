package p256j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.y */
/* loaded from: classes3.dex */
final class C5296y extends AbstractC5033A {

    /* renamed from: m */
    public final /* synthetic */ int f18731m;

    /* renamed from: n */
    final /* synthetic */ Object f18732n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5296y(AbstractC5168b abstractC5168b, int i7, Object obj, int i8) {
        super(abstractC5168b, i7, 1);
        this.f18731m = i8;
        this.f18732n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5296y(AbstractC5038B abstractC5038B, DoubleConsumer doubleConsumer) {
        super(abstractC5038B, 0, 1);
        this.f18731m = 1;
        this.f18732n = doubleConsumer;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: R */
    final InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2) {
        switch (this.f18731m) {
            case 0:
                return new C5291x(this, interfaceC5264r2);
            case 1:
                return new C5266s(this, interfaceC5264r2, 5);
            case 2:
                return new C5234m(this, interfaceC5264r2, 6);
            default:
                return new C5195f2(this, interfaceC5264r2);
        }
    }
}
