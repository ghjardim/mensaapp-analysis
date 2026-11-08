package p253i5;

import java.util.concurrent.atomic.AtomicBoolean;
import p237g5.AbstractC4445k;
import p237g5.AbstractC4454o0;
import p237g5.C4424Z;
import p237g5.C4425a;
import p237g5.C4448l0;

/* renamed from: i5.P0 */
/* loaded from: classes2.dex */
public final class C4576P0 {

    /* renamed from: c */
    public static final C4576P0 f16564c = new C4576P0(new AbstractC4454o0[0]);

    /* renamed from: a */
    public final AbstractC4454o0[] f16565a;

    /* renamed from: b */
    public final AtomicBoolean f16566b = new AtomicBoolean(false);

    public C4576P0(AbstractC4454o0[] abstractC4454o0Arr) {
        this.f16565a = abstractC4454o0Arr;
    }

    /* renamed from: h */
    public static C4576P0 m19582h(AbstractC4445k[] abstractC4445kArr, C4425a c4425a, C4424Z c4424z) {
        C4576P0 c4576p0 = new C4576P0(abstractC4445kArr);
        for (AbstractC4445k abstractC4445k : abstractC4445kArr) {
            abstractC4445k.mo18932n(c4425a, c4424z);
        }
        return c4576p0;
    }

    /* renamed from: a */
    public void m19583a() {
        for (AbstractC4454o0 abstractC4454o0 : this.f16565a) {
            ((AbstractC4445k) abstractC4454o0).mo18929k();
        }
    }

    /* renamed from: b */
    public void m19584b(C4424Z c4424z) {
        for (AbstractC4454o0 abstractC4454o0 : this.f16565a) {
            ((AbstractC4445k) abstractC4454o0).mo18930l(c4424z);
        }
    }

    /* renamed from: c */
    public void m19585c() {
        for (AbstractC4454o0 abstractC4454o0 : this.f16565a) {
            ((AbstractC4445k) abstractC4454o0).mo18931m();
        }
    }

    /* renamed from: d */
    public void m19586d(int i7) {
        for (AbstractC4454o0 abstractC4454o0 : this.f16565a) {
            abstractC4454o0.mo18980a(i7);
        }
    }

    /* renamed from: e */
    public void m19587e(int i7, long j7, long j8) {
        for (AbstractC4454o0 abstractC4454o0 : this.f16565a) {
            abstractC4454o0.mo18981b(i7, j7, j8);
        }
    }

    /* renamed from: f */
    public void m19588f(long j7) {
        for (AbstractC4454o0 abstractC4454o0 : this.f16565a) {
            abstractC4454o0.mo18982c(j7);
        }
    }

    /* renamed from: g */
    public void m19589g(long j7) {
        for (AbstractC4454o0 abstractC4454o0 : this.f16565a) {
            abstractC4454o0.mo18983d(j7);
        }
    }

    /* renamed from: i */
    public void m19590i(int i7) {
        for (AbstractC4454o0 abstractC4454o0 : this.f16565a) {
            abstractC4454o0.mo18984e(i7);
        }
    }

    /* renamed from: j */
    public void m19591j(int i7, long j7, long j8) {
        for (AbstractC4454o0 abstractC4454o0 : this.f16565a) {
            abstractC4454o0.mo18985f(i7, j7, j8);
        }
    }

    /* renamed from: k */
    public void m19592k(long j7) {
        for (AbstractC4454o0 abstractC4454o0 : this.f16565a) {
            abstractC4454o0.mo18986g(j7);
        }
    }

    /* renamed from: l */
    public void m19593l(long j7) {
        for (AbstractC4454o0 abstractC4454o0 : this.f16565a) {
            abstractC4454o0.mo18987h(j7);
        }
    }

    /* renamed from: m */
    public void m19594m(C4448l0 c4448l0) {
        if (this.f16566b.compareAndSet(false, true)) {
            for (AbstractC4454o0 abstractC4454o0 : this.f16565a) {
                abstractC4454o0.mo18988i(c4448l0);
            }
        }
    }
}
