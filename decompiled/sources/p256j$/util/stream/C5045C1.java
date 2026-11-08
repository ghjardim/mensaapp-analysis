package p256j$.util.stream;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.stream.C1 */
/* loaded from: classes3.dex */
final class C5045C1 extends AbstractC5034A0 {

    /* renamed from: h */
    final /* synthetic */ LongBinaryOperator f18352h;

    /* renamed from: i */
    final /* synthetic */ long f18353i;

    @Override // p256j$.util.stream.AbstractC5034A0
    /* renamed from: e0 */
    public final InterfaceC5144W1 mo21425e0() {
        return new C5134U1(this.f18353i, this.f18352h);
    }

    C5045C1(EnumC5202g3 enumC5202g3, LongBinaryOperator longBinaryOperator, long j7) {
        this.f18352h = longBinaryOperator;
        this.f18353i = j7;
    }
}
