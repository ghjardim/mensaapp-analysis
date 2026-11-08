package p256j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.stream.V */
/* loaded from: classes3.dex */
final class C5137V extends AbstractC5231l2 {

    /* renamed from: b */
    public final /* synthetic */ int f18504b;

    /* renamed from: c */
    final /* synthetic */ AbstractC5168b f18505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5137V(AbstractC5168b abstractC5168b, InterfaceC5264r2 interfaceC5264r2, int i7) {
        super(interfaceC5264r2);
        this.f18504b = i7;
        this.f18505c = abstractC5168b;
    }

    @Override // p256j$.util.stream.AbstractC5231l2, p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public void mo21460l(long j7) {
        switch (this.f18504b) {
            case 5:
                this.f18649a.mo21460l(-1L);
                break;
            default:
                super.mo21460l(j7);
                break;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5254p2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        switch (this.f18504b) {
            case 0:
                this.f18649a.accept((InterfaceC5264r2) ((IntFunction) ((C5271t) this.f18505c).f18701n).apply(i7));
                return;
            case 1:
                ((IntConsumer) ((C5142W) this.f18505c).f18511n).accept(i7);
                this.f18649a.accept(i7);
                return;
            case 2:
                this.f18649a.accept(((IntUnaryOperator) ((C5142W) this.f18505c).f18511n).applyAsInt(i7));
                return;
            case 3:
                ((C5286w) this.f18505c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i7);
                throw null;
            case 4:
                ((C5276u) this.f18505c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i7);
                throw null;
            default:
                ((C5281v) this.f18505c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i7);
                throw null;
        }
    }
}
