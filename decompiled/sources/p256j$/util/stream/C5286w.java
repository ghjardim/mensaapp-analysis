package p256j$.util.stream;

/* renamed from: j$.util.stream.w */
/* loaded from: classes3.dex */
final class C5286w extends AbstractC5229l0 {

    /* renamed from: m */
    public final /* synthetic */ int f18715m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5286w(AbstractC5168b abstractC5168b, int i7, int i8) {
        super(abstractC5168b, i7, 1);
        this.f18715m = i8;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: R */
    final InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2) {
        switch (this.f18715m) {
            case 0:
                return new C5266s(this, interfaceC5264r2, 3);
            case 1:
                return new C5147X(0, interfaceC5264r2);
            case 2:
                return new C5137V(this, interfaceC5264r2, 3);
            case 3:
                return new C5199g0(this, interfaceC5264r2, 1);
            case 4:
                return interfaceC5264r2;
            default:
                return new C5199g0(this, interfaceC5264r2, 4);
        }
    }
}
