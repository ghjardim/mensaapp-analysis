package p132S5;

import p371w5.AbstractC6928k;
import p371w5.C6927j;

/* renamed from: S5.L0 */
/* loaded from: classes2.dex */
public final class C2339L0 extends AbstractC2319B0 {

    /* renamed from: e */
    public final C2396o f7075e;

    public C2339L0(C2396o c2396o) {
        this.f7075e = c2396o;
    }

    @Override // p132S5.InterfaceC2403r0
    /* renamed from: a */
    public void mo7940a(Throwable th) {
        Object m7914b0 = m7866v().m7914b0();
        if (m7914b0 instanceof C2318B) {
            C2396o c2396o = this.f7075e;
            C6927j.a aVar = C6927j.f24803b;
            c2396o.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(((C2318B) m7914b0).f7023a)));
        } else {
            C2396o c2396o2 = this.f7075e;
            C6927j.a aVar2 = C6927j.f24803b;
            c2396o2.resumeWith(C6927j.m28373b(AbstractC2323D0.m7968h(m7914b0)));
        }
    }
}
