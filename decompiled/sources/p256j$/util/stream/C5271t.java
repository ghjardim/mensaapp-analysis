package p256j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.t */
/* loaded from: classes3.dex */
final class C5271t extends AbstractC5213i2 {

    /* renamed from: m */
    public final /* synthetic */ int f18700m;

    /* renamed from: n */
    final /* synthetic */ Object f18701n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5271t(AbstractC5168b abstractC5168b, int i7, Object obj, int i8) {
        super(abstractC5168b, i7, 1);
        this.f18700m = i8;
        this.f18701n = obj;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: R */
    final InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2) {
        switch (this.f18700m) {
            case 0:
                return new C5266s(this, interfaceC5264r2, 0);
            case 1:
                return new C5137V(this, interfaceC5264r2, 0);
            case 2:
                return new C5199g0(this, interfaceC5264r2, 0);
            case 3:
                return new C5234m(this, interfaceC5264r2, 1);
            case 4:
                return new C5234m(this, interfaceC5264r2, 2);
            case 5:
                return new C5234m(this, interfaceC5264r2, 3);
            default:
                return new C5228l(this, interfaceC5264r2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5271t(AbstractC5219j2 abstractC5219j2, Consumer consumer) {
        super(abstractC5219j2, 0, 1);
        this.f18700m = 3;
        this.f18701n = consumer;
    }
}
