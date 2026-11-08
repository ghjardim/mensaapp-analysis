package p256j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.stream.K1 */
/* loaded from: classes3.dex */
final class C5085K1 extends AbstractC5034A0 {

    /* renamed from: h */
    final /* synthetic */ DoubleBinaryOperator f18410h;

    /* renamed from: i */
    final /* synthetic */ double f18411i;

    @Override // p256j$.util.stream.AbstractC5034A0
    /* renamed from: e0 */
    public final InterfaceC5144W1 mo21425e0() {
        return new C5060F1(this.f18411i, this.f18410h);
    }

    C5085K1(EnumC5202g3 enumC5202g3, DoubleBinaryOperator doubleBinaryOperator, double d7) {
        this.f18410h = doubleBinaryOperator;
        this.f18411i = d7;
    }
}
