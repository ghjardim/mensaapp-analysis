package p256j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.G1 */
/* loaded from: classes3.dex */
final class C5065G1 extends AbstractC5034A0 {

    /* renamed from: h */
    public final /* synthetic */ int f18378h;

    /* renamed from: i */
    final /* synthetic */ Object f18379i;

    /* renamed from: j */
    final /* synthetic */ Object f18380j;

    /* renamed from: k */
    final /* synthetic */ Object f18381k;

    public /* synthetic */ C5065G1(EnumC5202g3 enumC5202g3, Object obj, Object obj2, Object obj3, int i7) {
        this.f18378h = i7;
        this.f18380j = obj;
        this.f18381k = obj2;
        this.f18379i = obj3;
    }

    @Override // p256j$.util.stream.AbstractC5034A0
    /* renamed from: e0 */
    public final InterfaceC5144W1 mo21425e0() {
        switch (this.f18378h) {
            case 0:
                return new C5050D1((Supplier) this.f18379i, (ObjLongConsumer) this.f18381k, (C5256q) this.f18380j);
            case 1:
                return new C5080J1((Supplier) this.f18379i, (ObjDoubleConsumer) this.f18381k, (C5256q) this.f18380j);
            case 2:
                return new C5090L1(this.f18379i, (BiFunction) this.f18381k, (BinaryOperator) this.f18380j);
            case 3:
                return new C5110P1((Supplier) this.f18379i, (BiConsumer) this.f18381k, (BiConsumer) this.f18380j);
            default:
                return new C5129T1((Supplier) this.f18379i, (ObjIntConsumer) this.f18381k, (C5256q) this.f18380j);
        }
    }
}
