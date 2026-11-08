package p170Y1;

import java.util.Set;
import p149V1.C2610c;
import p149V1.InterfaceC2614g;
import p149V1.InterfaceC2615h;
import p149V1.InterfaceC2616i;

/* renamed from: Y1.p */
/* loaded from: classes.dex */
public final class C2909p implements InterfaceC2616i {

    /* renamed from: a */
    public final Set f8976a;

    /* renamed from: b */
    public final AbstractC2908o f8977b;

    /* renamed from: c */
    public final InterfaceC2912s f8978c;

    public C2909p(Set set, AbstractC2908o abstractC2908o, InterfaceC2912s interfaceC2912s) {
        this.f8976a = set;
        this.f8977b = abstractC2908o;
        this.f8978c = interfaceC2912s;
    }

    @Override // p149V1.InterfaceC2616i
    /* renamed from: a */
    public InterfaceC2615h mo8995a(String str, Class cls, C2610c c2610c, InterfaceC2614g interfaceC2614g) {
        if (this.f8976a.contains(c2610c)) {
            return new C2911r(this.f8977b, str, c2610c, interfaceC2614g, this.f8978c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c2610c, this.f8976a));
    }
}
