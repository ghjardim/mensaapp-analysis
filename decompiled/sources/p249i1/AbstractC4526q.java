package p249i1;

import java.util.List;
import p259j0.AbstractC5332a;
import p284m0.AbstractC5562j;

/* renamed from: i1.q */
/* loaded from: classes.dex */
public abstract class AbstractC4526q extends AbstractC5562j implements InterfaceC4520k {

    /* renamed from: e */
    public InterfaceC4520k f16169e;

    /* renamed from: f */
    public long f16170f;

    @Override // p249i1.InterfaceC4520k
    /* renamed from: b */
    public int mo19221b(long j7) {
        return ((InterfaceC4520k) AbstractC5332a.m21800e(this.f16169e)).mo19221b(j7 - this.f16170f);
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: f */
    public long mo19223f(int i7) {
        return ((InterfaceC4520k) AbstractC5332a.m21800e(this.f16169e)).mo19223f(i7) + this.f16170f;
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: g */
    public List mo19224g(long j7) {
        return ((InterfaceC4520k) AbstractC5332a.m21800e(this.f16169e)).mo19224g(j7 - this.f16170f);
    }

    @Override // p249i1.InterfaceC4520k
    /* renamed from: h */
    public int mo19225h() {
        return ((InterfaceC4520k) AbstractC5332a.m21800e(this.f16169e)).mo19225h();
    }

    @Override // p284m0.AbstractC5562j, p284m0.AbstractC5553a
    /* renamed from: j */
    public void mo19253j() {
        super.mo19253j();
        this.f16169e = null;
    }

    /* renamed from: s */
    public void m19254s(long j7, InterfaceC4520k interfaceC4520k, long j8) {
        this.f20085b = j7;
        this.f16169e = interfaceC4520k;
        if (j8 != Long.MAX_VALUE) {
            j7 = j8;
        }
        this.f16170f = j7;
    }
}
