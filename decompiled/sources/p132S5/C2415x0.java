package p132S5;

/* renamed from: S5.x0 */
/* loaded from: classes2.dex */
public class C2415x0 extends C2321C0 implements InterfaceC2418z {

    /* renamed from: c */
    public final boolean f7160c;

    public C2415x0(InterfaceC2409u0 interfaceC2409u0) {
        super(true);
        m7917g0(interfaceC2409u0);
        this.f7160c = m8188N0();
    }

    /* renamed from: N0 */
    public final boolean m8188N0() {
        C2321C0 m7866v;
        InterfaceC2406t m7913a0 = m7913a0();
        C2408u c2408u = m7913a0 instanceof C2408u ? (C2408u) m7913a0 : null;
        if (c2408u != null && (m7866v = c2408u.m7866v()) != null) {
            while (!m7866v.mo7909W()) {
                InterfaceC2406t m7913a02 = m7866v.m7913a0();
                C2408u c2408u2 = m7913a02 instanceof C2408u ? (C2408u) m7913a02 : null;
                if (c2408u2 != null && (m7866v = c2408u2.m7866v()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p132S5.C2321C0
    /* renamed from: W */
    public boolean mo7909W() {
        return this.f7160c;
    }

    @Override // p132S5.C2321C0
    /* renamed from: Y */
    public boolean mo7911Y() {
        return true;
    }
}
