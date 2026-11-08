package p256j$.util.stream;

import java.util.function.IntFunction;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.B2 */
/* loaded from: classes3.dex */
final class C5041B2 extends AbstractC5174c {

    /* renamed from: j */
    private final AbstractC5168b f18344j;

    /* renamed from: k */
    private final IntFunction f18345k;

    /* renamed from: l */
    private final long f18346l;

    /* renamed from: m */
    private final long f18347m;

    /* renamed from: n */
    private long f18348n;

    /* renamed from: o */
    private volatile boolean f18349o;

    @Override // p256j$.util.stream.AbstractC5174c
    /* renamed from: h */
    protected final void mo21449h() {
        this.f18550i = true;
        if (this.f18349o) {
            mo21540f(AbstractC5034A0.m21379L(this.f18344j.mo21431I()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if (r2 >= r0) goto L51;
     */
    @Override // p256j$.util.stream.AbstractC5186e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r14) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.stream.C5041B2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    C5041B2(AbstractC5168b abstractC5168b, AbstractC5168b abstractC5168b2, Spliterator spliterator, IntFunction intFunction, long j7, long j8) {
        super(abstractC5168b2, spliterator);
        this.f18344j = abstractC5168b;
        this.f18345k = intFunction;
        this.f18346l = j7;
        this.f18347m = j8;
    }

    C5041B2(C5041B2 c5041b2, Spliterator spliterator) {
        super(c5041b2, spliterator);
        this.f18344j = c5041b2.f18344j;
        this.f18345k = c5041b2.f18345k;
        this.f18346l = c5041b2.f18346l;
        this.f18347m = c5041b2.f18347m;
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: e */
    protected final AbstractC5186e mo21448e(Spliterator spliterator) {
        return new C5041B2(this, spliterator);
    }

    @Override // p256j$.util.stream.AbstractC5174c
    /* renamed from: j */
    protected final Object mo21450j() {
        return AbstractC5034A0.m21379L(this.f18344j.mo21431I());
    }

    @Override // p256j$.util.stream.AbstractC5186e
    /* renamed from: a */
    protected final Object mo21447a() {
        if (m21548d()) {
            InterfaceC5054E0 mo21432N = this.f18344j.mo21432N(EnumC5196f3.SIZED.m21558s(this.f18344j.f18538c) ? this.f18344j.m21518G(this.f18564b) : -1L, this.f18345k);
            InterfaceC5264r2 mo21472R = this.f18344j.mo21472R(this.f18563a.m21520K(), mo21432N);
            AbstractC5168b abstractC5168b = this.f18563a;
            abstractC5168b.m21514B(this.f18564b, abstractC5168b.m21525W(mo21472R));
            return mo21432N.mo21444a();
        }
        InterfaceC5054E0 mo21432N2 = this.f18344j.mo21432N(-1L, this.f18345k);
        if (this.f18346l == 0) {
            InterfaceC5264r2 mo21472R2 = this.f18344j.mo21472R(this.f18563a.m21520K(), mo21432N2);
            AbstractC5168b abstractC5168b2 = this.f18563a;
            abstractC5168b2.m21514B(this.f18564b, abstractC5168b2.m21525W(mo21472R2));
        } else {
            this.f18563a.m21524V(this.f18564b, mo21432N2);
        }
        InterfaceC5094M0 mo21444a = mo21432N2.mo21444a();
        this.f18348n = mo21444a.count();
        this.f18349o = true;
        this.f18564b = null;
        return mo21444a;
    }

    /* renamed from: k */
    private long m21446k(long j7) {
        if (this.f18349o) {
            return this.f18348n;
        }
        C5041B2 c5041b2 = (C5041B2) this.f18566d;
        C5041B2 c5041b22 = (C5041B2) this.f18567e;
        if (c5041b2 == null || c5041b22 == null) {
            return this.f18348n;
        }
        long m21446k = c5041b2.m21446k(j7);
        return m21446k >= j7 ? m21446k : m21446k + c5041b22.m21446k(j7);
    }
}
