package p153V5;

import p146U5.EnumC2583a;
import p160W5.AbstractC2737m;
import p167X5.C2846G;
import p392z5.InterfaceC7161i;

/* renamed from: V5.t */
/* loaded from: classes2.dex */
public abstract class AbstractC2647t {

    /* renamed from: a */
    public static final C2846G f7851a = new C2846G("NONE");

    /* renamed from: b */
    public static final C2846G f7852b = new C2846G("PENDING");

    /* renamed from: a */
    public static final InterfaceC2641n m9094a(Object obj) {
        if (obj == null) {
            obj = AbstractC2737m.f8069a;
        }
        return new C2646s(obj);
    }

    /* renamed from: d */
    public static final InterfaceC2631d m9097d(InterfaceC2645r interfaceC2645r, InterfaceC7161i interfaceC7161i, int i7, EnumC2583a enumC2583a) {
        return (((i7 < 0 || i7 >= 2) && i7 != -2) || enumC2583a != EnumC2583a.f7563b) ? AbstractC2644q.m9086a(interfaceC2645r, interfaceC7161i, i7, enumC2583a) : interfaceC2645r;
    }
}
