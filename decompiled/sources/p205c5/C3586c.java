package p205c5;

import p197b5.AbstractC3530a;
import p197b5.InterfaceC3550u;
import p232g0.C4327q;
import p256j$.util.Objects;
import p292n0.InterfaceC5763w;

/* renamed from: c5.c */
/* loaded from: classes2.dex */
public final class C3586c extends AbstractC3530a {
    public C3586c(InterfaceC5763w interfaceC5763w, InterfaceC3550u interfaceC3550u) {
        super(interfaceC5763w, interfaceC3550u);
    }

    @Override // p197b5.AbstractC3530a
    /* renamed from: D */
    public void mo14235D() {
        int i7;
        int i8;
        C4327q mo24036a = this.f11935c.mo24036a();
        Objects.requireNonNull(mo24036a);
        AbstractC3530a.a m14265f = AbstractC3530a.a.m14265f(mo24036a.f15147w);
        int i9 = mo24036a.f15144t;
        int i10 = mo24036a.f15145u;
        if (m14265f == AbstractC3530a.a.ROTATE_90 || m14265f == AbstractC3530a.a.ROTATE_270) {
            m14265f = AbstractC3530a.a.m14265f(0);
            i7 = i10;
            i8 = i9;
        } else {
            i8 = i10;
            i7 = i9;
        }
        this.f11936d.mo14326c(i7, i8, this.f11935c.mo17960K(), m14265f.m14266g());
    }
}
