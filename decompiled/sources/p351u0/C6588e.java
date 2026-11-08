package p351u0;

import java.util.List;
import p050H0.C0547p;
import p380y0.C7049b;

/* renamed from: u0.e */
/* loaded from: classes.dex */
public final class C6588e implements InterfaceC6593j {

    /* renamed from: a */
    public final InterfaceC6593j f23652a;

    /* renamed from: b */
    public final List f23653b;

    public C6588e(InterfaceC6593j interfaceC6593j, List list) {
        this.f23652a = interfaceC6593j;
        this.f23653b = list;
    }

    @Override // p351u0.InterfaceC6593j
    /* renamed from: a */
    public C0547p.a mo27355a(C6590g c6590g, C6589f c6589f) {
        return new C7049b(this.f23652a.mo27355a(c6590g, c6589f), this.f23653b);
    }

    @Override // p351u0.InterfaceC6593j
    /* renamed from: b */
    public C0547p.a mo27356b() {
        return new C7049b(this.f23652a.mo27356b(), this.f23653b);
    }
}
