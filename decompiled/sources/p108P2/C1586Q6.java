package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;
import p031E2.InterfaceC0268d;

/* renamed from: P2.Q6 */
/* loaded from: classes.dex */
public final class C1586Q6 {

    /* renamed from: a */
    public final InterfaceC0268d f4901a;

    /* renamed from: b */
    public long f4902b;

    public C1586Q6(InterfaceC0268d interfaceC0268d) {
        AbstractC3802r.m15129k(interfaceC0268d);
        this.f4901a = interfaceC0268d;
    }

    /* renamed from: a */
    public final void m5957a() {
        this.f4902b = 0L;
    }

    /* renamed from: b */
    public final void m5958b() {
        this.f4902b = this.f4901a.mo1111b();
    }

    /* renamed from: c */
    public final boolean m5959c(long j7) {
        return this.f4902b == 0 || this.f4901a.mo1111b() - this.f4902b >= 3600000;
    }
}
