package p132S5;

import p006A5.AbstractC0024c;
import p013B5.AbstractC0064h;
import p069J5.InterfaceC0804p;
import p174Y5.AbstractC2957b;
import p392z5.InterfaceC7157e;

/* renamed from: S5.V0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2358V0 {
    /* renamed from: a */
    public static final C2354T0 m8037a(long j7, InterfaceC2353T interfaceC2353T, InterfaceC2409u0 interfaceC2409u0) {
        return new C2354T0("Timed out waiting for " + j7 + " ms", interfaceC2409u0);
    }

    /* renamed from: b */
    public static final Object m8038b(RunnableC2356U0 runnableC2356U0, InterfaceC0804p interfaceC0804p) {
        AbstractC2417y0.m8198g(runnableC2356U0, AbstractC2355U.m8031b(runnableC2356U0.f8804d.getContext()).mo8015y(runnableC2356U0.f7086e, runnableC2356U0, runnableC2356U0.getContext()));
        return AbstractC2957b.m10661c(runnableC2356U0, runnableC2356U0, interfaceC0804p);
    }

    /* renamed from: c */
    public static final Object m8039c(long j7, InterfaceC0804p interfaceC0804p, InterfaceC7157e interfaceC7157e) {
        if (j7 <= 0) {
            throw new C2354T0("Timed out immediately");
        }
        Object m8038b = m8038b(new RunnableC2356U0(j7, interfaceC7157e), interfaceC0804p);
        if (m8038b == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m8038b;
    }
}
