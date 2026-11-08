package p256j$.util.stream;

import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.a0 */
/* loaded from: classes3.dex */
abstract class AbstractC5163a0 extends AbstractC5169b0 {

    /* renamed from: l */
    public final /* synthetic */ int f18531l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC5163a0(AbstractC5168b abstractC5168b, int i7, int i8) {
        super(abstractC5168b, i7);
        this.f18531l = i8;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: Q */
    final boolean mo21367Q() {
        switch (this.f18531l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final InterfaceC5204h unordered() {
        switch (this.f18531l) {
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
        return new C5281v(this, EnumC5196f3.f18590r, 1);
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* bridge */ /* synthetic */ InterfaceC5187e0 parallel() {
        switch (this.f18531l) {
            case 0:
                parallel();
                break;
            default:
                parallel();
                break;
        }
        return this;
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* bridge */ /* synthetic */ InterfaceC5187e0 sequential() {
        switch (this.f18531l) {
            case 0:
                sequential();
                break;
            default:
                sequential();
                break;
        }
        return this;
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.f18531l) {
        }
        return spliterator();
    }
}
