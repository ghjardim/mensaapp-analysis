package p167X5;

import p006A5.AbstractC0023b;
import p013B5.InterfaceC0061e;
import p132S5.AbstractC2324E;
import p132S5.AbstractC2367a;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: X5.C */
/* loaded from: classes2.dex */
public class C2842C extends AbstractC2367a implements InterfaceC0061e {

    /* renamed from: d */
    public final InterfaceC7157e f8804d;

    public C2842C(InterfaceC7161i interfaceC7161i, InterfaceC7157e interfaceC7157e) {
        super(interfaceC7161i, true, true);
        this.f8804d = interfaceC7157e;
    }

    @Override // p132S5.C2321C0
    /* renamed from: E */
    public void mo7883E(Object obj) {
        AbstractC2867l.m10337c(AbstractC0023b.m74c(this.f8804d), AbstractC2324E.m7969a(obj, this.f8804d), null, 2, null);
    }

    @Override // p132S5.AbstractC2367a
    /* renamed from: N0 */
    public void mo8035N0(Object obj) {
        InterfaceC7157e interfaceC7157e = this.f8804d;
        interfaceC7157e.resumeWith(AbstractC2324E.m7969a(obj, interfaceC7157e));
    }

    @Override // p013B5.InterfaceC0061e
    public final InterfaceC0061e getCallerFrame() {
        InterfaceC7157e interfaceC7157e = this.f8804d;
        if (interfaceC7157e instanceof InterfaceC0061e) {
            return (InterfaceC0061e) interfaceC7157e;
        }
        return null;
    }

    @Override // p132S5.C2321C0
    /* renamed from: i0 */
    public final boolean mo7919i0() {
        return true;
    }
}
