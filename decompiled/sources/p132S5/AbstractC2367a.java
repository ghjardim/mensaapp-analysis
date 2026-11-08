package p132S5;

import p069J5.InterfaceC0804p;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: S5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2367a extends C2321C0 implements InterfaceC2409u0, InterfaceC7157e, InterfaceC2334J {

    /* renamed from: c */
    public final InterfaceC7161i f7097c;

    public AbstractC2367a(InterfaceC7161i interfaceC7161i, boolean z6, boolean z7) {
        super(z7);
        if (z6) {
            m7917g0((InterfaceC2409u0) interfaceC7161i.get(InterfaceC2409u0.f7157j));
        }
        this.f7097c = interfaceC7161i.plus(this);
    }

    @Override // p132S5.C2321C0
    /* renamed from: M */
    public String mo7898M() {
        return AbstractC2342N.m8004a(this) + " was cancelled";
    }

    /* renamed from: N0 */
    public void mo8035N0(Object obj) {
        mo7883E(obj);
    }

    /* renamed from: Q0 */
    public final void m8059Q0(EnumC2338L enumC2338L, Object obj, InterfaceC0804p interfaceC0804p) {
        enumC2338L.m8002f(interfaceC0804p, obj, this);
    }

    @Override // p132S5.C2321C0
    /* renamed from: f0 */
    public final void mo7916f0(Throwable th) {
        AbstractC2332I.m7992a(this.f7097c, th);
    }

    @Override // p392z5.InterfaceC7157e
    public final InterfaceC7161i getContext() {
        return this.f7097c;
    }

    @Override // p132S5.C2321C0, p132S5.InterfaceC2409u0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // p132S5.InterfaceC2334J
    /* renamed from: l */
    public InterfaceC7161i mo7995l() {
        return this.f7097c;
    }

    @Override // p132S5.C2321C0
    /* renamed from: p0 */
    public String mo7926p0() {
        String m7974b = AbstractC2326F.m7974b(this.f7097c);
        if (m7974b == null) {
            return super.mo7926p0();
        }
        return '\"' + m7974b + "\":" + super.mo7926p0();
    }

    @Override // p392z5.InterfaceC7157e
    public final void resumeWith(Object obj) {
        Object m7924n0 = m7924n0(AbstractC2324E.m7972d(obj, null, 1, null));
        if (m7924n0 == AbstractC2323D0.f7051b) {
            return;
        }
        mo8035N0(m7924n0);
    }

    @Override // p132S5.C2321C0
    /* renamed from: w0 */
    public final void mo7934w0(Object obj) {
        if (!(obj instanceof C2318B)) {
            mo8058P0(obj);
        } else {
            C2318B c2318b = (C2318B) obj;
            mo8057O0(c2318b.f7023a, c2318b.m7862a());
        }
    }

    /* renamed from: P0 */
    public void mo8058P0(Object obj) {
    }

    /* renamed from: O0 */
    public void mo8057O0(Throwable th, boolean z6) {
    }
}
