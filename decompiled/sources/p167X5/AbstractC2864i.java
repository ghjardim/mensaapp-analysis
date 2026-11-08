package p167X5;

import java.util.Iterator;
import p132S5.AbstractC2332I;
import p132S5.InterfaceC2330H;
import p371w5.AbstractC6918a;
import p392z5.InterfaceC7161i;

/* renamed from: X5.i */
/* loaded from: classes2.dex */
public abstract class AbstractC2864i {
    /* renamed from: a */
    public static final void m10326a(InterfaceC7161i interfaceC7161i, Throwable th) {
        Iterator it = AbstractC2863h.m10324a().iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2330H) it.next()).mo7991a(interfaceC7161i, th);
            } catch (Throwable th2) {
                AbstractC2863h.m10325b(AbstractC2332I.m7993b(th, th2));
            }
        }
        try {
            AbstractC6918a.m28362a(th, new C2865j(interfaceC7161i));
        } catch (Throwable unused) {
        }
        AbstractC2863h.m10325b(th);
    }
}
