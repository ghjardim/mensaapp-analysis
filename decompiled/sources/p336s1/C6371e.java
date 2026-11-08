package p336s1;

import p078L0.C0856N;
import p078L0.InterfaceC0855M;
import p259j0.AbstractC5330M;

/* renamed from: s1.e */
/* loaded from: classes.dex */
public final class C6371e implements InterfaceC0855M {

    /* renamed from: a */
    public final C6369c f23059a;

    /* renamed from: b */
    public final int f23060b;

    /* renamed from: c */
    public final long f23061c;

    /* renamed from: d */
    public final long f23062d;

    /* renamed from: e */
    public final long f23063e;

    public C6371e(C6369c c6369c, int i7, long j7, long j8) {
        this.f23059a = c6369c;
        this.f23060b = i7;
        this.f23061c = j7;
        long j9 = (j8 - j7) / c6369c.f23054e;
        this.f23062d = j9;
        this.f23063e = m26680a(j9);
    }

    /* renamed from: a */
    public final long m26680a(long j7) {
        return AbstractC5330M.m21718X0(j7 * this.f23060b, 1000000L, this.f23059a.f23052c);
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: f */
    public boolean mo3499f() {
        return true;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: j */
    public InterfaceC0855M.a mo3500j(long j7) {
        long m21768q = AbstractC5330M.m21768q((this.f23059a.f23052c * j7) / (this.f23060b * 1000000), 0L, this.f23062d - 1);
        long j8 = this.f23061c + (this.f23059a.f23054e * m21768q);
        long m26680a = m26680a(m21768q);
        C0856N c0856n = new C0856N(m26680a, j8);
        if (m26680a >= j7 || m21768q == this.f23062d - 1) {
            return new InterfaceC0855M.a(c0856n);
        }
        long j9 = m21768q + 1;
        return new InterfaceC0855M.a(c0856n, new C0856N(m26680a(j9), this.f23061c + (this.f23059a.f23054e * j9)));
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: l */
    public long mo474l() {
        return this.f23063e;
    }
}
