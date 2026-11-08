package p256j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.h4 */
/* loaded from: classes3.dex */
final class C5209h4 extends AbstractC5174c {

    /* renamed from: j */
    private final AbstractC5168b f18618j;

    /* renamed from: k */
    private final IntFunction f18619k;

    /* renamed from: l */
    private final boolean f18620l;

    /* renamed from: m */
    private long f18621m;

    /* renamed from: n */
    private boolean f18622n;

    /* renamed from: o */
    private volatile boolean f18623o;

    @Override // p256j$.util.stream.AbstractC5174c
    /* renamed from: h */
    protected final void mo21449h() {
        this.f18550i = true;
        if (this.f18620l && this.f18623o) {
            mo21540f(AbstractC5034A0.m21379L(this.f18618j.mo21431I()));
        }
    }

    @Override // p256j$.util.stream.AbstractC5186e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object m21376I;
        AbstractC5186e abstractC5186e = this.f18566d;
        if (abstractC5186e != null) {
            this.f18622n = ((C5209h4) abstractC5186e).f18622n | ((C5209h4) this.f18567e).f18622n;
            if (this.f18620l && this.f18550i) {
                this.f18621m = 0L;
                m21376I = AbstractC5034A0.m21379L(this.f18618j.mo21431I());
            } else {
                if (this.f18620l) {
                    C5209h4 c5209h4 = (C5209h4) this.f18566d;
                    if (c5209h4.f18622n) {
                        this.f18621m = c5209h4.f18621m;
                        m21376I = (InterfaceC5094M0) c5209h4.mo21539c();
                    }
                }
                C5209h4 c5209h42 = (C5209h4) this.f18566d;
                long j7 = c5209h42.f18621m;
                C5209h4 c5209h43 = (C5209h4) this.f18567e;
                this.f18621m = j7 + c5209h43.f18621m;
                if (c5209h42.f18621m == 0) {
                    m21376I = (InterfaceC5094M0) c5209h43.mo21539c();
                } else if (c5209h43.f18621m == 0) {
                    m21376I = (InterfaceC5094M0) c5209h42.mo21539c();
                } else {
                    m21376I = AbstractC5034A0.m21376I(this.f18618j.mo21431I(), (InterfaceC5094M0) ((C5209h4) this.f18566d).mo21539c(), (InterfaceC5094M0) ((C5209h4) this.f18567e).mo21539c());
                }
            }
            mo21540f(m21376I);
        }
        this.f18623o = true;
        super.onCompletion(countedCompleter);
    }

    C5209h4(AbstractC5168b abstractC5168b, AbstractC5168b abstractC5168b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC5168b2, spliterator);
        this.f18618j = abstractC5168b;
        this.f18619k = intFunction;
        this.f18620l = EnumC5196f3.ORDERED.m21557o(abstractC5168b2.m21520K());
    }

    C5209h4(C5209h4 c5209h4, Spliterator spliterator) {
        super(c5209h4, spliterator);
        this.f18618j = c5209h4.f18618j;
        this.f18619k = c5209h4.f18619k;
        this.f18620l = c5209h4.f18620l;
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: e */
    protected final AbstractC5186e mo21448e(Spliterator spliterator) {
        return new C5209h4(this, spliterator);
    }

    @Override // p256j$.util.stream.AbstractC5174c
    /* renamed from: j */
    protected final Object mo21450j() {
        return AbstractC5034A0.m21379L(this.f18618j.mo21431I());
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: a */
    protected final Object mo21447a() {
        InterfaceC5054E0 mo21432N = this.f18563a.mo21432N(-1L, this.f18619k);
        InterfaceC5264r2 mo21472R = this.f18618j.mo21472R(this.f18563a.m21520K(), mo21432N);
        AbstractC5168b abstractC5168b = this.f18563a;
        boolean m21514B = abstractC5168b.m21514B(this.f18564b, abstractC5168b.m21525W(mo21472R));
        this.f18622n = m21514B;
        if (m21514B) {
            m21541i();
        }
        InterfaceC5094M0 mo21444a = mo21432N.mo21444a();
        this.f18621m = mo21444a.count();
        return mo21444a;
    }
}
