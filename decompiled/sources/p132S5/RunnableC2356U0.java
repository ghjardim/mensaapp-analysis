package p132S5;

import p167X5.C2842C;
import p392z5.InterfaceC7157e;

/* renamed from: S5.U0 */
/* loaded from: classes2.dex */
public final class RunnableC2356U0 extends C2842C implements Runnable {

    /* renamed from: e */
    public final long f7086e;

    public RunnableC2356U0(long j7, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7157e.getContext(), interfaceC7157e);
        this.f7086e = j7;
    }

    @Override // p132S5.AbstractC2367a, p132S5.C2321C0
    /* renamed from: p0 */
    public String mo7926p0() {
        return super.mo7926p0() + "(timeMillis=" + this.f7086e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m7888H(AbstractC2358V0.m8037a(this.f7086e, AbstractC2355U.m8031b(getContext()), this));
    }
}
