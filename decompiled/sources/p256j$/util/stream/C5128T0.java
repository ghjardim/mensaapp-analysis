package p256j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.T0 */
/* loaded from: classes3.dex */
class C5128T0 extends AbstractC5186e {

    /* renamed from: h */
    protected final AbstractC5168b f18492h;

    /* renamed from: i */
    protected final LongFunction f18493i;

    /* renamed from: j */
    protected final BinaryOperator f18494j;

    @Override // p256j$.util.stream.AbstractC5186e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC5186e abstractC5186e = this.f18566d;
        if (abstractC5186e != null) {
            mo21540f((InterfaceC5094M0) this.f18494j.apply((InterfaceC5094M0) ((C5128T0) abstractC5186e).mo21539c(), (InterfaceC5094M0) ((C5128T0) this.f18567e).mo21539c()));
        }
        super.onCompletion(countedCompleter);
    }

    C5128T0(AbstractC5168b abstractC5168b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC5168b, spliterator);
        this.f18492h = abstractC5168b;
        this.f18493i = longFunction;
        this.f18494j = binaryOperator;
    }

    C5128T0(C5128T0 c5128t0, Spliterator spliterator) {
        super(c5128t0, spliterator);
        this.f18492h = c5128t0.f18492h;
        this.f18493i = c5128t0.f18493i;
        this.f18494j = c5128t0.f18494j;
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: e */
    protected AbstractC5186e mo21448e(Spliterator spliterator) {
        return new C5128T0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final InterfaceC5094M0 mo21447a() {
        InterfaceC5054E0 interfaceC5054E0 = (InterfaceC5054E0) this.f18493i.apply(this.f18492h.m21518G(this.f18564b));
        this.f18492h.m21524V(this.f18564b, interfaceC5054E0);
        return interfaceC5054E0.mo21444a();
    }
}
