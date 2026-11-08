package p132S5;

import p167X5.AbstractC2851L;
import p167X5.C2846G;

/* renamed from: S5.S0 */
/* loaded from: classes2.dex */
public final class C2352S0 {

    /* renamed from: a */
    public static final C2352S0 f7083a = new C2352S0();

    /* renamed from: b */
    public static final ThreadLocal f7084b = AbstractC2851L.m10284a(new C2846G("ThreadLocalEventLoop"));

    /* renamed from: a */
    public final AbstractC2377e0 m8024a() {
        return (AbstractC2377e0) f7084b.get();
    }

    /* renamed from: b */
    public final AbstractC2377e0 m8025b() {
        ThreadLocal threadLocal = f7084b;
        AbstractC2377e0 abstractC2377e0 = (AbstractC2377e0) threadLocal.get();
        if (abstractC2377e0 != null) {
            return abstractC2377e0;
        }
        AbstractC2377e0 m8111a = AbstractC2383h0.m8111a();
        threadLocal.set(m8111a);
        return m8111a;
    }

    /* renamed from: c */
    public final void m8026c() {
        f7084b.set(null);
    }

    /* renamed from: d */
    public final void m8027d(AbstractC2377e0 abstractC2377e0) {
        f7084b.set(abstractC2377e0);
    }
}
