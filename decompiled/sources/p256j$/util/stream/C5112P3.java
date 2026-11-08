package p256j$.util.stream;

import java.util.function.IntFunction;
import java.util.function.Predicate;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.P3 */
/* loaded from: classes3.dex */
final class C5112P3 extends AbstractC5213i2 {

    /* renamed from: m */
    final /* synthetic */ Predicate f18450m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5112P3(AbstractC5219j2 abstractC5219j2, int i7, Predicate predicate) {
        super(abstractC5219j2, i7, 0);
        this.f18450m = predicate;
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: P */
    final Spliterator mo21489P(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        return EnumC5196f3.ORDERED.m21557o(abstractC5168b.m21520K()) ? mo21471O(abstractC5168b, spliterator, new C5261r(29)).spliterator() : new C5233l4(abstractC5168b.m21526X(spliterator), this.f18450m, 1);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: O */
    final InterfaceC5094M0 mo21471O(AbstractC5168b abstractC5168b, Spliterator spliterator, IntFunction intFunction) {
        return (InterfaceC5094M0) new C5209h4(this, abstractC5168b, spliterator, intFunction).invoke();
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: R */
    final InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2) {
        return new C5228l(this, interfaceC5264r2);
    }
}
