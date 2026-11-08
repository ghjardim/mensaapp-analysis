package p256j$.util.stream;

import java.util.Arrays;
import java.util.function.IntFunction;
import p256j$.util.Objects;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.L2 */
/* loaded from: classes3.dex */
final class C5091L2 extends AbstractC5229l0 {
    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: R */
    public final InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2) {
        Objects.requireNonNull(interfaceC5264r2);
        return EnumC5196f3.SORTED.m21557o(i7) ? interfaceC5264r2 : EnumC5196f3.SIZED.m21557o(i7) ? new C5116Q2(interfaceC5264r2) : new C5076I2(interfaceC5264r2);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: O */
    public final InterfaceC5094M0 mo21471O(AbstractC5168b abstractC5168b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC5196f3.SORTED.m21557o(abstractC5168b.m21520K())) {
            return abstractC5168b.m21515C(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((InterfaceC5084K0) abstractC5168b.m21515C(spliterator, true, intFunction)).mo21480d();
        Arrays.sort(jArr);
        return new C5263r1(jArr);
    }
}
