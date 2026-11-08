package p213d5;

import p197b5.AbstractC3530a;
import p197b5.InterfaceC3550u;
import p232g0.C4310P;
import p232g0.C4327q;
import p256j$.util.Objects;
import p292n0.InterfaceC5763w;

/* renamed from: d5.a */
/* loaded from: classes2.dex */
public final class C4128a extends AbstractC3530a {

    /* renamed from: e */
    public boolean f13835e;

    public C4128a(InterfaceC5763w interfaceC5763w, InterfaceC3550u interfaceC3550u, boolean z6) {
        super(interfaceC5763w, interfaceC3550u);
        this.f13835e = z6;
    }

    @Override // p197b5.AbstractC3530a
    /* renamed from: D */
    public void mo14235D() {
        C4310P mo17976n = this.f11935c.mo17976n();
        AbstractC3530a.a aVar = AbstractC3530a.a.ROTATE_0;
        int i7 = mo17976n.f14972a;
        int i8 = mo17976n.f14973b;
        if (i7 != 0 && i8 != 0 && !this.f13835e) {
            try {
                aVar = AbstractC3530a.a.m14265f(m17317I(this.f11935c));
            } catch (IllegalArgumentException unused) {
                aVar = AbstractC3530a.a.ROTATE_0;
            }
        }
        this.f11936d.mo14326c(i7, i8, this.f11935c.mo17960K(), aVar.m14266g());
    }

    /* renamed from: I */
    public final int m17317I(InterfaceC5763w interfaceC5763w) {
        C4327q mo24036a = interfaceC5763w.mo24036a();
        Objects.requireNonNull(mo24036a);
        return mo24036a.f15147w;
    }
}
