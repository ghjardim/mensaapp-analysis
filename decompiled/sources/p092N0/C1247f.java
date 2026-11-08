package p092N0;

import p178Z2.AbstractC3010Y;
import p178Z2.AbstractC3033v;
import p259j0.C5357z;

/* renamed from: N0.f */
/* loaded from: classes.dex */
public final class C1247f implements InterfaceC1242a {

    /* renamed from: a */
    public final AbstractC3033v f3961a;

    /* renamed from: b */
    public final int f3962b;

    public C1247f(int i7, AbstractC3033v abstractC3033v) {
        this.f3962b = i7;
        this.f3961a = abstractC3033v;
    }

    /* renamed from: b */
    public static InterfaceC1242a m4788b(int i7, int i8, C5357z c5357z) {
        switch (i7) {
            case 1718776947:
                return C1248g.m4794e(i8, c5357z);
            case 1751742049:
                return C1244c.m4768c(c5357z);
            case 1752331379:
                return C1245d.m4770d(c5357z);
            case 1852994675:
                return C1249h.m4796b(c5357z);
            default:
                return null;
        }
    }

    /* renamed from: d */
    public static C1247f m4789d(int i7, C5357z c5357z) {
        AbstractC3033v.a aVar = new AbstractC3033v.a();
        int m21948g = c5357z.m21948g();
        int i8 = -2;
        while (c5357z.m21942a() > 8) {
            int m21961t = c5357z.m21961t();
            int m21947f = c5357z.m21947f() + c5357z.m21961t();
            c5357z.m21938S(m21947f);
            InterfaceC1242a m4789d = m21961t == 1414744396 ? m4789d(c5357z.m21961t(), c5357z) : m4788b(m21961t, i8, c5357z);
            if (m4789d != null) {
                if (m4789d.mo4756a() == 1752331379) {
                    i8 = ((C1245d) m4789d).m4772c();
                }
                aVar.mo11040a(m4789d);
            }
            c5357z.m21939T(m21947f);
            c5357z.m21938S(m21948g);
        }
        return new C1247f(i7, aVar.m11063k());
    }

    @Override // p092N0.InterfaceC1242a
    /* renamed from: a */
    public int mo4756a() {
        return this.f3962b;
    }

    /* renamed from: c */
    public InterfaceC1242a m4790c(Class cls) {
        AbstractC3010Y it = this.f3961a.iterator();
        while (it.hasNext()) {
            InterfaceC1242a interfaceC1242a = (InterfaceC1242a) it.next();
            if (interfaceC1242a.getClass() == cls) {
                return interfaceC1242a;
            }
        }
        return null;
    }
}
