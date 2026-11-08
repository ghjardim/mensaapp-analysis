package p078L0;

import p078L0.InterfaceC0855M;

/* renamed from: L0.P */
/* loaded from: classes.dex */
public final class C0858P implements InterfaceC0855M {

    /* renamed from: a */
    public final long f2950a;

    /* renamed from: b */
    public final long f2951b;

    public C0858P(long j7) {
        this(j7, 0L);
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: f */
    public boolean mo3499f() {
        return true;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: j */
    public InterfaceC0855M.a mo3500j(long j7) {
        return new InterfaceC0855M.a(new C0856N(j7, this.f2951b));
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: l */
    public long mo474l() {
        return this.f2950a;
    }

    public C0858P(long j7, long j8) {
        this.f2950a = j7;
        this.f2951b = j8;
    }
}
