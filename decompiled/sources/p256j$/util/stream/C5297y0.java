package p256j$.util.stream;

import java.util.function.Supplier;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.y0 */
/* loaded from: classes3.dex */
final class C5297y0 implements InterfaceC5092L3 {

    /* renamed from: a */
    final EnumC5292x0 f18733a;

    /* renamed from: b */
    final Supplier f18734b;

    C5297y0(EnumC5202g3 enumC5202g3, EnumC5292x0 enumC5292x0, Supplier supplier) {
        this.f18733a = enumC5292x0;
        this.f18734b = supplier;
    }

    @Override // p256j$.util.stream.InterfaceC5092L3
    /* renamed from: d */
    public final int mo21424d() {
        return EnumC5196f3.f18593u | EnumC5196f3.f18590r;
    }

    @Override // p256j$.util.stream.InterfaceC5092L3
    /* renamed from: b */
    public final Object mo21422b(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        AbstractC5287w0 abstractC5287w0 = (AbstractC5287w0) this.f18734b.get();
        abstractC5168b.m21524V(spliterator, abstractC5287w0);
        return Boolean.valueOf(abstractC5287w0.f18717b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p256j$.util.stream.InterfaceC5092L3
    /* renamed from: c */
    public final Object mo21423c(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        return (Boolean) new C5302z0(this, abstractC5168b, spliterator).invoke();
    }
}
