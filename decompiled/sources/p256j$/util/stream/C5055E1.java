package p256j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.stream.E1 */
/* loaded from: classes3.dex */
final class C5055E1 extends AbstractC5034A0 {

    /* renamed from: h */
    public final /* synthetic */ int f18362h;

    /* renamed from: i */
    final /* synthetic */ Object f18363i;

    public /* synthetic */ C5055E1(EnumC5202g3 enumC5202g3, Object obj, int i7) {
        this.f18362h = i7;
        this.f18363i = obj;
    }

    @Override // p256j$.util.stream.AbstractC5034A0
    /* renamed from: e0 */
    public final InterfaceC5144W1 mo21425e0() {
        switch (this.f18362h) {
            case 0:
                return new C5139V1((LongBinaryOperator) this.f18363i);
            case 1:
                return new C5070H1((DoubleBinaryOperator) this.f18363i);
            case 2:
                return new C5095M1((BinaryOperator) this.f18363i);
            default:
                return new C5124S1((IntBinaryOperator) this.f18363i);
        }
    }
}
