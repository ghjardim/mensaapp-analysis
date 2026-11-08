package p078L0;

import java.io.EOFException;
import p176Z0.C2966h;
import p232g0.C4334x;
import p259j0.C5357z;

/* renamed from: L0.G */
/* loaded from: classes.dex */
public final class C0849G {

    /* renamed from: a */
    public final C5357z f2916a = new C5357z(10);

    /* renamed from: a */
    public C4334x m3527a(InterfaceC0884s interfaceC0884s, C2966h.a aVar) {
        C4334x c4334x = null;
        int i7 = 0;
        while (true) {
            try {
                interfaceC0884s.mo3521t(this.f2916a.m21946e(), 0, 10);
                this.f2916a.m21939T(0);
                if (this.f2916a.m21929J() != 4801587) {
                    break;
                }
                this.f2916a.m21940U(3);
                int m21925F = this.f2916a.m21925F();
                int i8 = m21925F + 10;
                if (c4334x == null) {
                    byte[] bArr = new byte[i8];
                    System.arraycopy(this.f2916a.m21946e(), 0, bArr, 0, 10);
                    interfaceC0884s.mo3521t(bArr, 10, m21925F);
                    c4334x = new C2966h(aVar).m10703e(bArr, i8);
                } else {
                    interfaceC0884s.mo3515k(m21925F);
                }
                i7 += i8;
            } catch (EOFException unused) {
            }
        }
        interfaceC0884s.mo3518p();
        interfaceC0884s.mo3515k(i7);
        return c4334x;
    }
}
