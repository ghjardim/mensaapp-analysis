package p132S5;

import p006A5.AbstractC0024c;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: S5.S */
/* loaded from: classes2.dex */
public class C2351S extends AbstractC2367a implements InterfaceC2348Q {
    public C2351S(InterfaceC7161i interfaceC7161i, boolean z6) {
        super(interfaceC7161i, true, z6);
    }

    /* renamed from: R0 */
    public static /* synthetic */ Object m8023R0(C2351S c2351s, InterfaceC7157e interfaceC7157e) {
        Object m7885F = c2351s.m7885F(interfaceC7157e);
        AbstractC0024c.m76e();
        return m7885F;
    }

    @Override // p132S5.InterfaceC2348Q
    public Object await(InterfaceC7157e interfaceC7157e) {
        return m8023R0(this, interfaceC7157e);
    }

    @Override // p132S5.InterfaceC2348Q
    public Object getCompleted() {
        return m7906T();
    }
}
