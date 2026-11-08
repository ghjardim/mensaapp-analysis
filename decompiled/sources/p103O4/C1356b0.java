package p103O4;

import p103O4.AbstractC1359c0;
import p346t3.InterfaceC6493Z;

/* renamed from: O4.b0 */
/* loaded from: classes2.dex */
public class C1356b0 implements AbstractC1359c0.l {
    @Override // p103O4.AbstractC1359c0.l
    /* renamed from: a */
    public void mo5206a(String str, String str2, String str3, AbstractC1359c0.F f7) {
        InterfaceC6493Z interfaceC6493Z = (InterfaceC6493Z) C1353a0.f4220a.get(str);
        if (str2 == null || str3 == null) {
            f7.mo5059a(interfaceC6493Z.mo27056e());
        } else {
            f7.mo5059a(interfaceC6493Z.mo27055d(str2, str3));
        }
    }

    @Override // p103O4.AbstractC1359c0.l
    /* renamed from: b */
    public void mo5207b(String str, String str2, AbstractC1359c0.G g7) {
        ((InterfaceC6493Z) C1353a0.f4220a.get(str)).mo27059h(str2);
        g7.mo5065a();
    }
}
