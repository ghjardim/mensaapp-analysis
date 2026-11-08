package p256j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;
import p256j$.util.Comparator$CC;
import p256j$.util.Objects;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.M2 */
/* loaded from: classes3.dex */
final class C5096M2 extends AbstractC5213i2 {

    /* renamed from: m */
    private final boolean f18423m;

    /* renamed from: n */
    private final Comparator f18424n;

    C5096M2(AbstractC5219j2 abstractC5219j2) {
        super(abstractC5219j2, EnumC5196f3.f18589q | EnumC5196f3.f18587o, 0);
        this.f18423m = true;
        this.f18424n = Comparator$CC.m21262a();
    }

    C5096M2(AbstractC5219j2 abstractC5219j2, Comparator comparator) {
        super(abstractC5219j2, EnumC5196f3.f18589q | EnumC5196f3.f18588p, 0);
        this.f18423m = false;
        this.f18424n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: R */
    public final InterfaceC5264r2 mo21472R(int i7, InterfaceC5264r2 interfaceC5264r2) {
        Objects.requireNonNull(interfaceC5264r2);
        if (EnumC5196f3.SORTED.m21557o(i7) && this.f18423m) {
            return interfaceC5264r2;
        }
        boolean m21557o = EnumC5196f3.SIZED.m21557o(i7);
        Comparator comparator = this.f18424n;
        if (m21557o) {
            return new C5120R2(interfaceC5264r2, comparator);
        }
        return new C5101N2(interfaceC5264r2, comparator);
    }

    @Override // p256j$.util.stream.AbstractC5168b
    /* renamed from: O */
    public final InterfaceC5094M0 mo21471O(AbstractC5168b abstractC5168b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC5196f3.SORTED.m21557o(abstractC5168b.m21520K()) && this.f18423m) {
            return abstractC5168b.m21515C(spliterator, false, intFunction);
        }
        Object[] mo21485o = abstractC5168b.m21515C(spliterator, true, intFunction).mo21485o(intFunction);
        Arrays.sort(mo21485o, this.f18424n);
        return new C5109P0(mo21485o);
    }
}
