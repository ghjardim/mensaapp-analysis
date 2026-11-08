package p256j$.util.stream;

import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.l0 */
/* loaded from: classes3.dex */
abstract class AbstractC5229l0 extends AbstractC5235m0 {

    /* renamed from: l */
    public final /* synthetic */ int f18648l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC5229l0(AbstractC5168b abstractC5168b, int i7, int i8) {
        super(abstractC5168b, i7);
        this.f18648l = i8;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: Q */
    final boolean mo21367Q() {
        switch (this.f18648l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5204h
    public final InterfaceC5204h unordered() {
        switch (this.f18648l) {
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
        return new C5286w(this, EnumC5196f3.f18590r, 4);
    }

    @Override // p256j$.util.stream.AbstractC5168b, p256j$.util.stream.InterfaceC5204h, p256j$.util.stream.InterfaceC5053E
    public final /* bridge */ /* synthetic */ InterfaceC5252p0 parallel() {
        switch (this.f18648l) {
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
    public final /* bridge */ /* synthetic */ InterfaceC5252p0 sequential() {
        switch (this.f18648l) {
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
        switch (this.f18648l) {
        }
        return spliterator();
    }
}
