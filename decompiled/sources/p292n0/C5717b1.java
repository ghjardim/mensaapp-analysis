package p292n0;

import p232g0.C4297C;
import p259j0.AbstractC5330M;
import p259j0.InterfaceC5334c;

/* renamed from: n0.b1 */
/* loaded from: classes.dex */
public final class C5717b1 implements InterfaceC5766x0 {

    /* renamed from: a */
    public final InterfaceC5334c f20663a;

    /* renamed from: b */
    public boolean f20664b;

    /* renamed from: c */
    public long f20665c;

    /* renamed from: d */
    public long f20666d;

    /* renamed from: e */
    public C4297C f20667e = C4297C.f14765d;

    public C5717b1(InterfaceC5334c interfaceC5334c) {
        this.f20663a = interfaceC5334c;
    }

    /* renamed from: a */
    public void m23942a(long j7) {
        this.f20665c = j7;
        if (this.f20664b) {
            this.f20666d = this.f20663a.mo21613b();
        }
    }

    /* renamed from: b */
    public void m23943b() {
        if (this.f20664b) {
            return;
        }
        this.f20666d = this.f20663a.mo21613b();
        this.f20664b = true;
    }

    /* renamed from: c */
    public void m23944c() {
        if (this.f20664b) {
            m23942a(mo23947u());
            this.f20664b = false;
        }
    }

    @Override // p292n0.InterfaceC5766x0
    /* renamed from: d */
    public void mo23945d(C4297C c4297c) {
        if (this.f20664b) {
            m23942a(mo23947u());
        }
        this.f20667e = c4297c;
    }

    @Override // p292n0.InterfaceC5766x0
    /* renamed from: i */
    public C4297C mo23946i() {
        return this.f20667e;
    }

    @Override // p292n0.InterfaceC5766x0
    /* renamed from: u */
    public long mo23947u() {
        long j7 = this.f20665c;
        if (!this.f20664b) {
            return j7;
        }
        long mo21613b = this.f20663a.mo21613b() - this.f20666d;
        C4297C c4297c = this.f20667e;
        return j7 + (c4297c.f14768a == 1.0f ? AbstractC5330M.m21692K0(mo21613b) : c4297c.m17948a(mo21613b));
    }

    @Override // p292n0.InterfaceC5766x0
    /* renamed from: y */
    public /* synthetic */ boolean mo23948y() {
        return AbstractC5764w0.m24385a(this);
    }
}
