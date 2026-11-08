package p256j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.g4 */
/* loaded from: classes3.dex */
final class C5203g4 extends AbstractC5186e {

    /* renamed from: h */
    private final AbstractC5168b f18604h;

    /* renamed from: i */
    private final IntFunction f18605i;

    /* renamed from: j */
    private final boolean f18606j;

    /* renamed from: k */
    private long f18607k;

    /* renamed from: l */
    private long f18608l;

    @Override // p256j$.util.stream.AbstractC5186e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC5094M0 m21376I;
        AbstractC5186e abstractC5186e = this.f18566d;
        if (abstractC5186e != null) {
            if (this.f18606j) {
                C5203g4 c5203g4 = (C5203g4) abstractC5186e;
                long j7 = c5203g4.f18608l;
                this.f18608l = j7;
                if (j7 == c5203g4.f18607k) {
                    this.f18608l = j7 + ((C5203g4) this.f18567e).f18608l;
                }
            }
            C5203g4 c5203g42 = (C5203g4) abstractC5186e;
            long j8 = c5203g42.f18607k;
            C5203g4 c5203g43 = (C5203g4) this.f18567e;
            this.f18607k = j8 + c5203g43.f18607k;
            if (c5203g42.f18607k == 0) {
                m21376I = (InterfaceC5094M0) c5203g43.mo21539c();
            } else if (c5203g43.f18607k == 0) {
                m21376I = (InterfaceC5094M0) c5203g42.mo21539c();
            } else {
                m21376I = AbstractC5034A0.m21376I(this.f18604h.mo21431I(), (InterfaceC5094M0) ((C5203g4) this.f18566d).mo21539c(), (InterfaceC5094M0) ((C5203g4) this.f18567e).mo21539c());
            }
            InterfaceC5094M0 interfaceC5094M0 = m21376I;
            if (m21548d() && this.f18606j) {
                interfaceC5094M0 = interfaceC5094M0.mo21483h(this.f18608l, interfaceC5094M0.count(), this.f18605i);
            }
            mo21540f(interfaceC5094M0);
        }
        super.onCompletion(countedCompleter);
    }

    C5203g4(AbstractC5168b abstractC5168b, AbstractC5168b abstractC5168b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC5168b2, spliterator);
        this.f18604h = abstractC5168b;
        this.f18605i = intFunction;
        this.f18606j = EnumC5196f3.ORDERED.m21557o(abstractC5168b2.m21520K());
    }

    C5203g4(C5203g4 c5203g4, Spliterator spliterator) {
        super(c5203g4, spliterator);
        this.f18604h = c5203g4.f18604h;
        this.f18605i = c5203g4.f18605i;
        this.f18606j = c5203g4.f18606j;
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: e */
    protected final AbstractC5186e mo21448e(Spliterator spliterator) {
        return new C5203g4(this, spliterator);
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: a */
    protected final Object mo21447a() {
        boolean m21548d = m21548d();
        InterfaceC5054E0 mo21432N = this.f18563a.mo21432N((!m21548d && this.f18606j && EnumC5196f3.SIZED.m21558s(this.f18604h.f18538c)) ? this.f18604h.m21518G(this.f18564b) : -1L, this.f18605i);
        InterfaceC5197f4 mo21492k = ((InterfaceC5191e4) this.f18604h).mo21492k(mo21432N, this.f18606j && !m21548d);
        this.f18563a.m21524V(this.f18564b, mo21492k);
        InterfaceC5094M0 mo21444a = mo21432N.mo21444a();
        this.f18607k = mo21444a.count();
        this.f18608l = mo21492k.mo21491f();
        return mo21444a;
    }
}
