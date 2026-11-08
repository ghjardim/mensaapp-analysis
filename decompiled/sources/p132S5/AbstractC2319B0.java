package p132S5;

import kotlin.jvm.internal.AbstractC5469l;
import p167X5.C2873r;

/* renamed from: S5.B0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2319B0 extends C2873r implements InterfaceC2403r0, InterfaceC2368a0, InterfaceC2399p0 {

    /* renamed from: d */
    public C2321C0 f7024d;

    @Override // p132S5.InterfaceC2368a0
    /* renamed from: b */
    public void mo7864b() {
        m7866v().m7878B0(this);
    }

    @Override // p132S5.InterfaceC2399p0
    /* renamed from: c */
    public C2331H0 mo7865c() {
        return null;
    }

    @Override // p132S5.InterfaceC2399p0
    public boolean isActive() {
        return true;
    }

    @Override // p167X5.C2873r
    public String toString() {
        return AbstractC2342N.m8004a(this) + '@' + AbstractC2342N.m8005b(this) + "[job@" + AbstractC2342N.m8005b(m7866v()) + ']';
    }

    /* renamed from: v */
    public final C2321C0 m7866v() {
        C2321C0 c2321c0 = this.f7024d;
        if (c2321c0 != null) {
            return c2321c0;
        }
        AbstractC5469l.m23037n("job");
        return null;
    }

    /* renamed from: w */
    public final void m7867w(C2321C0 c2321c0) {
        this.f7024d = c2321c0;
    }
}
