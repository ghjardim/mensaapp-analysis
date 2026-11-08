package p256j$.util.stream;

import java.util.function.Predicate;
import java.util.function.Supplier;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.F */
/* loaded from: classes3.dex */
final class C5058F implements InterfaceC5092L3 {

    /* renamed from: a */
    final int f18365a;

    /* renamed from: b */
    final Object f18366b;

    /* renamed from: c */
    final Predicate f18367c;

    /* renamed from: d */
    final Supplier f18368d;

    C5058F(boolean z6, EnumC5202g3 enumC5202g3, Object obj, Predicate predicate, Supplier supplier) {
        this.f18365a = (z6 ? 0 : EnumC5196f3.f18590r) | EnumC5196f3.f18593u;
        this.f18366b = obj;
        this.f18367c = predicate;
        this.f18368d = supplier;
    }

    @Override // p256j$.util.stream.InterfaceC5092L3
    /* renamed from: d */
    public final int mo21424d() {
        return this.f18365a;
    }

    @Override // p256j$.util.stream.InterfaceC5092L3
    /* renamed from: b */
    public final Object mo21422b(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        InterfaceC5097M3 interfaceC5097M3 = (InterfaceC5097M3) this.f18368d.get();
        abstractC5168b.m21524V(spliterator, interfaceC5097M3);
        Object obj = interfaceC5097M3.get();
        return obj != null ? obj : this.f18366b;
    }

    @Override // p256j$.util.stream.InterfaceC5092L3
    /* renamed from: c */
    public final Object mo21423c(AbstractC5168b abstractC5168b, Spliterator spliterator) {
        return new C5088L(this, EnumC5196f3.ORDERED.m21557o(abstractC5168b.m21520K()), abstractC5168b, spliterator).invoke();
    }
}
