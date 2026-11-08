package p256j$.util.stream;

import java.util.function.IntFunction;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.X3 */
/* loaded from: classes3.dex */
final class C5151X3 extends AbstractC5229l0 {
    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: P */
    final Spliterator mo21489P(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        return EnumC5196f3.ORDERED.m21557o(abstractC5168b.m21520K()) ? mo21471O(abstractC5168b, spliterator, new C5189e2(8)).spliterator() : new C5227k4((InterfaceC4966c0) abstractC5168b.m21526X(spliterator), 1);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: O */
    final InterfaceC5094M0 mo21471O(AbstractC5168b abstractC5168b, Spliterator spliterator, IntFunction intFunction) {
        return (InterfaceC5094M0) new C5209h4(this, abstractC5168b, spliterator, intFunction).invoke();
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: R */
    final InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2) {
        return new C5146W3(this, interfaceC5264r2);
    }
}
