package p078L0;

import p078L0.C0844B;
import p078L0.InterfaceC0855M;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: L0.A */
/* loaded from: classes.dex */
public final class C0843A implements InterfaceC0855M {

    /* renamed from: a */
    public final C0844B f2883a;

    /* renamed from: b */
    public final long f2884b;

    public C0843A(C0844B c0844b, long j7) {
        this.f2883a = c0844b;
        this.f2884b = j7;
    }

    /* renamed from: a */
    public final C0856N m3498a(long j7, long j8) {
        return new C0856N((j7 * 1000000) / this.f2883a.f2889e, this.f2884b + j8);
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: f */
    public boolean mo3499f() {
        return true;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: j */
    public InterfaceC0855M.a mo3500j(long j7) {
        AbstractC5332a.m21804i(this.f2883a.f2895k);
        C0844B c0844b = this.f2883a;
        C0844B.a aVar = c0844b.f2895k;
        long[] jArr = aVar.f2897a;
        long[] jArr2 = aVar.f2898b;
        int m21744h = AbstractC5330M.m21744h(jArr, c0844b.m3510i(j7), true, false);
        C0856N m3498a = m3498a(m21744h == -1 ? 0L : jArr[m21744h], m21744h != -1 ? jArr2[m21744h] : 0L);
        if (m3498a.f2941a == j7 || m21744h == jArr.length - 1) {
            return new InterfaceC0855M.a(m3498a);
        }
        int i7 = m21744h + 1;
        return new InterfaceC0855M.a(m3498a, m3498a(jArr[i7], jArr2[i7]));
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: l */
    public long mo474l() {
        return this.f2883a.m3507f();
    }
}
