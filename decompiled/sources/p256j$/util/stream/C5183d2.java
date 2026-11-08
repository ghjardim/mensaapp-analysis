package p256j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.d2 */
/* loaded from: classes3.dex */
final class C5183d2 extends AbstractC5186e {

    /* renamed from: h */
    private final AbstractC5034A0 f18560h;

    @Override // p256j$.util.stream.AbstractC5186e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC5186e abstractC5186e = this.f18566d;
        if (abstractC5186e != null) {
            InterfaceC5144W1 interfaceC5144W1 = (InterfaceC5144W1) ((C5183d2) abstractC5186e).mo21539c();
            interfaceC5144W1.mo21457g((InterfaceC5144W1) ((C5183d2) this.f18567e).mo21539c());
            mo21540f(interfaceC5144W1);
        }
        super.onCompletion(countedCompleter);
    }

    C5183d2(AbstractC5034A0 abstractC5034A0, AbstractC5168b abstractC5168b, Spliterator spliterator) {
        super(abstractC5168b, spliterator);
        this.f18560h = abstractC5034A0;
    }

    C5183d2(C5183d2 c5183d2, Spliterator spliterator) {
        super(c5183d2, spliterator);
        this.f18560h = c5183d2.f18560h;
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: e */
    protected final AbstractC5186e mo21448e(Spliterator spliterator) {
        return new C5183d2(this, spliterator);
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: a */
    protected final Object mo21447a() {
        AbstractC5168b abstractC5168b = this.f18563a;
        InterfaceC5144W1 mo21425e0 = this.f18560h.mo21425e0();
        abstractC5168b.m21524V(this.f18564b, mo21425e0);
        return mo21425e0;
    }
}
