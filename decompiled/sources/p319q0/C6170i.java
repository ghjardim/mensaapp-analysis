package p319q0;

import p078L0.C0873h;
import p327r0.C6242i;

/* renamed from: q0.i */
/* loaded from: classes.dex */
public final class C6170i implements InterfaceC6168g {

    /* renamed from: a */
    public final C0873h f22065a;

    /* renamed from: b */
    public final long f22066b;

    public C6170i(C0873h c0873h, long j7) {
        this.f22065a = c0873h;
        this.f22066b = j7;
    }

    @Override // p319q0.InterfaceC6168g
    /* renamed from: a */
    public long mo25734a(long j7, long j8) {
        return this.f22065a.f3046d[(int) j7];
    }

    @Override // p319q0.InterfaceC6168g
    /* renamed from: b */
    public long mo25735b(long j7, long j8) {
        return 0L;
    }

    @Override // p319q0.InterfaceC6168g
    /* renamed from: c */
    public long mo25736c(long j7) {
        return this.f22065a.f3047e[(int) j7] - this.f22066b;
    }

    @Override // p319q0.InterfaceC6168g
    /* renamed from: d */
    public long mo25737d(long j7, long j8) {
        return -9223372036854775807L;
    }

    @Override // p319q0.InterfaceC6168g
    /* renamed from: e */
    public C6242i mo25738e(long j7) {
        return new C6242i(null, this.f22065a.f3045c[(int) j7], r0.f3044b[r8]);
    }

    @Override // p319q0.InterfaceC6168g
    /* renamed from: f */
    public long mo25739f(long j7, long j8) {
        return this.f22065a.m3651a(j7 + this.f22066b);
    }

    @Override // p319q0.InterfaceC6168g
    /* renamed from: g */
    public boolean mo25740g() {
        return true;
    }

    @Override // p319q0.InterfaceC6168g
    /* renamed from: h */
    public long mo25741h() {
        return 0L;
    }

    @Override // p319q0.InterfaceC6168g
    /* renamed from: i */
    public long mo25742i(long j7) {
        return this.f22065a.f3043a;
    }

    @Override // p319q0.InterfaceC6168g
    /* renamed from: j */
    public long mo25743j(long j7, long j8) {
        return this.f22065a.f3043a;
    }
}
