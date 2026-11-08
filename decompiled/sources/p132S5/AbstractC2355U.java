package p132S5;

import p006A5.AbstractC0023b;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0064h;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7158f;
import p392z5.InterfaceC7161i;

/* renamed from: S5.U */
/* loaded from: classes2.dex */
public abstract class AbstractC2355U {
    /* renamed from: a */
    public static final Object m8030a(long j7, InterfaceC7157e interfaceC7157e) {
        if (j7 <= 0) {
            return C6934q.f24811a;
        }
        C2396o c2396o = new C2396o(AbstractC0023b.m74c(interfaceC7157e), 1);
        c2396o.m8147E();
        if (j7 < Long.MAX_VALUE) {
            m8031b(c2396o.getContext()).mo8028d(j7, c2396o);
        }
        Object m8171y = c2396o.m8171y();
        if (m8171y == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m8171y == AbstractC0024c.m76e() ? m8171y : C6934q.f24811a;
    }

    /* renamed from: b */
    public static final InterfaceC2353T m8031b(InterfaceC7161i interfaceC7161i) {
        InterfaceC7161i.b bVar = interfaceC7161i.get(InterfaceC7158f.f25437m);
        InterfaceC2353T interfaceC2353T = bVar instanceof InterfaceC2353T ? (InterfaceC2353T) bVar : null;
        return interfaceC2353T == null ? AbstractC2346P.m8017a() : interfaceC2353T;
    }
}
