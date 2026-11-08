package p022D0;

import p022D0.InterfaceC0120F;
import p232g0.AbstractC4303I;
import p232g0.C4331u;
import p276l0.InterfaceC5511y;

/* renamed from: D0.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC0169o0 extends AbstractC0154h {

    /* renamed from: s */
    public static final Void f694s = null;

    /* renamed from: r */
    public final InterfaceC0120F f695r;

    public AbstractC0169o0(InterfaceC0120F interfaceC0120F) {
        this.f695r = interfaceC0120F;
    }

    @Override // p022D0.AbstractC0154h, p022D0.AbstractC0140a
    /* renamed from: C */
    public final void mo410C(InterfaceC5511y interfaceC5511y) {
        super.mo410C(interfaceC5511y);
        mo289V();
    }

    @Override // p022D0.AbstractC0154h
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0120F.b mo411G(Void r12, InterfaceC0120F.b bVar) {
        return mo287M(bVar);
    }

    @Override // p022D0.AbstractC0154h
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final long mo619H(Void r12, long j7, InterfaceC0120F.b bVar) {
        return m658O(j7, bVar);
    }

    @Override // p022D0.AbstractC0154h
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int mo620I(Void r12, int i7) {
        return m660Q(i7);
    }

    /* renamed from: S */
    public abstract void mo288S(AbstractC4303I abstractC4303I);

    @Override // p022D0.AbstractC0154h
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void m621J(Void r12, InterfaceC0120F interfaceC0120F, AbstractC4303I abstractC4303I) {
        mo288S(abstractC4303I);
    }

    /* renamed from: U */
    public final void m663U() {
        m622L(f694s, this.f695r);
    }

    /* renamed from: V */
    public void mo289V() {
        m663U();
    }

    @Override // p022D0.AbstractC0140a, p022D0.InterfaceC0120F
    /* renamed from: a */
    public void mo294a(C4331u c4331u) {
        this.f695r.mo294a(c4331u);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: i */
    public C4331u mo331i() {
        return this.f695r.mo331i();
    }

    @Override // p022D0.AbstractC0140a, p022D0.InterfaceC0120F
    /* renamed from: o */
    public boolean mo334o() {
        return this.f695r.mo334o();
    }

    @Override // p022D0.AbstractC0140a, p022D0.InterfaceC0120F
    /* renamed from: q */
    public AbstractC4303I mo336q() {
        return this.f695r.mo336q();
    }

    /* renamed from: M */
    public InterfaceC0120F.b mo287M(InterfaceC0120F.b bVar) {
        return bVar;
    }

    /* renamed from: Q */
    public int m660Q(int i7) {
        return i7;
    }

    /* renamed from: O */
    public long m658O(long j7, InterfaceC0120F.b bVar) {
        return j7;
    }
}
