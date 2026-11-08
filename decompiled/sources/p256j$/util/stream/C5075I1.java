package p256j$.util.stream;

import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.I1 */
/* loaded from: classes3.dex */
final class C5075I1 extends AbstractC5034A0 {

    /* renamed from: h */
    public final /* synthetic */ int f18398h;

    public /* synthetic */ C5075I1(int i7) {
        this.f18398h = i7;
    }

    @Override // p256j$.util.stream.AbstractC5034A0
    /* renamed from: e0 */
    public final InterfaceC5144W1 mo21425e0() {
        switch (this.f18398h) {
            case 0:
                return new C5165a2();
            case 1:
                return new C5154Y1();
            case 2:
                return new C5171b2();
            default:
                return new C5159Z1();
        }
    }

    @Override // p256j$.util.stream.AbstractC5034A0, p256j$.util.stream.InterfaceC5092L3
    /* renamed from: b */
    public final Object mo21422b(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        switch (this.f18398h) {
            case 0:
                if (!EnumC5196f3.SIZED.m21557o(abstractC5168b.m21520K())) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!EnumC5196f3.SIZED.m21557o(abstractC5168b.m21520K())) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!EnumC5196f3.SIZED.m21557o(abstractC5168b.m21520K())) {
                    break;
                } else {
                    break;
                }
            default:
                if (!EnumC5196f3.SIZED.m21557o(abstractC5168b.m21520K())) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.mo21422b(abstractC5168b, spliterator);
    }

    @Override // p256j$.util.stream.AbstractC5034A0, p256j$.util.stream.InterfaceC5092L3
    /* renamed from: c */
    public final Object mo21423c(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        switch (this.f18398h) {
            case 0:
                if (!EnumC5196f3.SIZED.m21557o(abstractC5168b.m21520K())) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!EnumC5196f3.SIZED.m21557o(abstractC5168b.m21520K())) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!EnumC5196f3.SIZED.m21557o(abstractC5168b.m21520K())) {
                    break;
                } else {
                    break;
                }
            default:
                if (!EnumC5196f3.SIZED.m21557o(abstractC5168b.m21520K())) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.mo21423c(abstractC5168b, spliterator);
    }

    @Override // p256j$.util.stream.AbstractC5034A0, p256j$.util.stream.InterfaceC5092L3
    /* renamed from: d */
    public final int mo21424d() {
        switch (this.f18398h) {
        }
        return EnumC5196f3.f18590r;
    }
}
