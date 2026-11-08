package p160W5;

import kotlin.jvm.internal.AbstractC5457A;
import p006A5.AbstractC0023b;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0057a;
import p013B5.AbstractC0064h;
import p069J5.InterfaceC0804p;
import p153V5.InterfaceC2632e;
import p167X5.AbstractC2850K;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: W5.f */
/* loaded from: classes2.dex */
public abstract class AbstractC2730f {
    /* renamed from: b */
    public static final Object m9353b(InterfaceC7161i interfaceC7161i, Object obj, Object obj2, InterfaceC0804p interfaceC0804p, InterfaceC7157e interfaceC7157e) {
        Object m10280c = AbstractC2850K.m10280c(interfaceC7161i, obj2);
        try {
            C2742r c2742r = new C2742r(interfaceC7157e, interfaceC7161i);
            Object m75d = !(interfaceC0804p instanceof AbstractC0057a) ? AbstractC0023b.m75d(interfaceC0804p, obj, c2742r) : ((InterfaceC0804p) AbstractC5457A.m23004b(interfaceC0804p, 2)).invoke(obj, c2742r);
            AbstractC2850K.m10278a(interfaceC7161i, m10280c);
            if (m75d == AbstractC0024c.m76e()) {
                AbstractC0064h.m164c(interfaceC7157e);
            }
            return m75d;
        } catch (Throwable th) {
            AbstractC2850K.m10278a(interfaceC7161i, m10280c);
            throw th;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m9354c(InterfaceC7161i interfaceC7161i, Object obj, Object obj2, InterfaceC0804p interfaceC0804p, InterfaceC7157e interfaceC7157e, int i7, Object obj3) {
        if ((i7 & 4) != 0) {
            obj2 = AbstractC2850K.m10279b(interfaceC7161i);
        }
        return m9353b(interfaceC7161i, obj, obj2, interfaceC0804p, interfaceC7157e);
    }

    /* renamed from: d */
    public static final InterfaceC2632e m9355d(InterfaceC2632e interfaceC2632e, InterfaceC7161i interfaceC7161i) {
        return interfaceC2632e instanceof C2741q ? interfaceC2632e : new C2743s(interfaceC2632e, interfaceC7161i);
    }
}
