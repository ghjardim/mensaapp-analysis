package p256j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.stream.g0 */
/* loaded from: classes3.dex */
final class C5199g0 extends AbstractC5237m2 {

    /* renamed from: b */
    public final /* synthetic */ int f18601b;

    /* renamed from: c */
    final /* synthetic */ AbstractC5168b f18602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5199g0(AbstractC5168b abstractC5168b, InterfaceC5264r2 interfaceC5264r2, int i7) {
        super(interfaceC5264r2);
        this.f18601b = i7;
        this.f18602c = abstractC5168b;
    }

    @Override // p256j$.util.stream.AbstractC5237m2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public void mo21460l(long j7) {
        switch (this.f18601b) {
            case 4:
                this.f18656a.mo21460l(-1L);
                break;
            default:
                super.mo21460l(j7);
                break;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        switch (this.f18601b) {
            case 0:
                this.f18656a.accept((InterfaceC5264r2) ((LongFunction) ((C5271t) this.f18602c).f18701n).apply(j7));
                return;
            case 1:
                ((C5286w) this.f18602c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j7);
                throw null;
            case 2:
                ((C5281v) this.f18602c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j7);
                throw null;
            case 3:
                ((C5276u) this.f18602c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j7);
                throw null;
            case 4:
                ((C5286w) this.f18602c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j7);
                throw null;
            default:
                ((LongConsumer) ((C5217j0) this.f18602c).f18636n).accept(j7);
                this.f18656a.accept(j7);
                return;
        }
    }
}
