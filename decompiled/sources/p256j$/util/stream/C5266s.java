package p256j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.s */
/* loaded from: classes3.dex */
final class C5266s extends AbstractC5225k2 {

    /* renamed from: b */
    public final /* synthetic */ int f18693b;

    /* renamed from: c */
    final /* synthetic */ AbstractC5168b f18694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5266s(AbstractC5168b abstractC5168b, InterfaceC5264r2 interfaceC5264r2, int i7) {
        super(interfaceC5264r2);
        this.f18693b = i7;
        this.f18694c = abstractC5168b;
    }

    @Override // p256j$.util.stream.AbstractC5225k2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public void mo21460l(long j7) {
        switch (this.f18693b) {
            case 4:
                this.f18641a.mo21460l(-1L);
                break;
            default:
                super.mo21460l(j7);
                break;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5249o2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        switch (this.f18693b) {
            case 0:
                this.f18641a.accept((InterfaceC5264r2) ((DoubleFunction) ((C5271t) this.f18694c).f18701n).apply(d7));
                return;
            case 1:
                ((C5276u) this.f18694c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d7);
                throw null;
            case 2:
                ((C5281v) this.f18694c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d7);
                throw null;
            case 3:
                ((C5286w) this.f18694c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d7);
                throw null;
            case 4:
                ((C5276u) this.f18694c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d7);
                throw null;
            default:
                ((DoubleConsumer) ((C5296y) this.f18694c).f18732n).accept(d7);
                this.f18641a.accept(d7);
                return;
        }
    }
}
