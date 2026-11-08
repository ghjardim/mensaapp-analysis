package p181Z5;

import p132S5.AbstractC2389k0;
import p392z5.InterfaceC7161i;

/* renamed from: Z5.f */
/* loaded from: classes2.dex */
public abstract class AbstractC3085f extends AbstractC2389k0 {

    /* renamed from: d */
    public final int f9548d;

    /* renamed from: e */
    public final int f9549e;

    /* renamed from: f */
    public final long f9550f;

    /* renamed from: n */
    public final String f9551n;

    /* renamed from: o */
    public ExecutorC3080a f9552o = m11286K();

    public AbstractC3085f(int i7, int i8, long j7, String str) {
        this.f9548d = i7;
        this.f9549e = i8;
        this.f9550f = j7;
        this.f9551n = str;
    }

    @Override // p132S5.AbstractC2328G
    /* renamed from: D */
    public void mo7983D(InterfaceC7161i interfaceC7161i, Runnable runnable) {
        ExecutorC3080a.m11241r(this.f9552o, runnable, null, false, 6, null);
    }

    /* renamed from: K */
    public final ExecutorC3080a m11286K() {
        return new ExecutorC3080a(this.f9548d, this.f9549e, this.f9550f, this.f9551n);
    }

    /* renamed from: M */
    public final void m11287M(Runnable runnable, InterfaceC3088i interfaceC3088i, boolean z6) {
        this.f9552o.m11260m(runnable, interfaceC3088i, z6);
    }
}
