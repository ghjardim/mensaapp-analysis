package p256j$.util.stream;

/* renamed from: j$.util.stream.i2 */
/* loaded from: classes3.dex */
abstract class AbstractC5213i2 extends AbstractC5219j2 {

    /* renamed from: l */
    public final /* synthetic */ int f18630l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC5213i2(AbstractC5168b abstractC5168b, int i7, int i8) {
        super(abstractC5168b, i7);
        this.f18630l = i8;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: Q */
    final boolean mo21367Q() {
        switch (this.f18630l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final InterfaceC5204h unordered() {
        switch (this.f18630l) {
            case 0:
                if (!m21521L()) {
                    break;
                } else {
                    break;
                }
            default:
                if (!m21521L()) {
                    break;
                } else {
                    break;
                }
        }
        return new C5201g2(this, EnumC5196f3.f18590r, 1);
    }
}
