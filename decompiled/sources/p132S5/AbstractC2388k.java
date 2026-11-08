package p132S5;

import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0064h;
import p069J5.InterfaceC0804p;
import p167X5.AbstractC2850K;
import p167X5.C2842C;
import p174Y5.AbstractC2956a;
import p174Y5.AbstractC2957b;
import p392z5.C7162j;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7158f;
import p392z5.InterfaceC7161i;

/* renamed from: S5.k */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2388k {
    /* renamed from: a */
    public static final InterfaceC2348Q m8125a(InterfaceC2334J interfaceC2334J, InterfaceC7161i interfaceC7161i, EnumC2338L enumC2338L, InterfaceC0804p interfaceC0804p) {
        InterfaceC7161i m7976d = AbstractC2326F.m7976d(interfaceC2334J, interfaceC7161i);
        C2351S c2325e0 = enumC2338L.m8003g() ? new C2325E0(m7976d, interfaceC0804p) : new C2351S(m7976d, true);
        c2325e0.m8059Q0(enumC2338L, c2325e0, interfaceC0804p);
        return c2325e0;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC2348Q m8126b(InterfaceC2334J interfaceC2334J, InterfaceC7161i interfaceC7161i, EnumC2338L enumC2338L, InterfaceC0804p interfaceC0804p, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC7161i = C7162j.f25439a;
        }
        if ((i7 & 2) != 0) {
            enumC2338L = EnumC2338L.f7068a;
        }
        return AbstractC2384i.m8112a(interfaceC2334J, interfaceC7161i, enumC2338L, interfaceC0804p);
    }

    /* renamed from: c */
    public static final InterfaceC2409u0 m8127c(InterfaceC2334J interfaceC2334J, InterfaceC7161i interfaceC7161i, EnumC2338L enumC2338L, InterfaceC0804p interfaceC0804p) {
        InterfaceC7161i m7976d = AbstractC2326F.m7976d(interfaceC2334J, interfaceC7161i);
        C2345O0 c2327f0 = enumC2338L.m8003g() ? new C2327F0(m7976d, interfaceC0804p) : new C2345O0(m7976d, true);
        c2327f0.m8059Q0(enumC2338L, c2327f0, interfaceC0804p);
        return c2327f0;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC2409u0 m8128d(InterfaceC2334J interfaceC2334J, InterfaceC7161i interfaceC7161i, EnumC2338L enumC2338L, InterfaceC0804p interfaceC0804p, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC7161i = C7162j.f25439a;
        }
        if ((i7 & 2) != 0) {
            enumC2338L = EnumC2338L.f7068a;
        }
        return AbstractC2384i.m8114c(interfaceC2334J, interfaceC7161i, enumC2338L, interfaceC0804p);
    }

    /* renamed from: e */
    public static final Object m8129e(InterfaceC7161i interfaceC7161i, InterfaceC0804p interfaceC0804p, InterfaceC7157e interfaceC7157e) {
        Object m8036R0;
        InterfaceC7161i context = interfaceC7157e.getContext();
        InterfaceC7161i m7977e = AbstractC2326F.m7977e(context, interfaceC7161i);
        AbstractC2417y0.m8200i(m7977e);
        if (m7977e == context) {
            C2842C c2842c = new C2842C(m7977e, interfaceC7157e);
            m8036R0 = AbstractC2957b.m10660b(c2842c, c2842c, interfaceC0804p);
        } else {
            InterfaceC7158f.b bVar = InterfaceC7158f.f25437m;
            if (AbstractC5469l.m23024a(m7977e.get(bVar), context.get(bVar))) {
                C2362X0 c2362x0 = new C2362X0(m7977e, interfaceC7157e);
                InterfaceC7161i context2 = c2362x0.getContext();
                Object m10280c = AbstractC2850K.m10280c(context2, null);
                try {
                    Object m10660b = AbstractC2957b.m10660b(c2362x0, c2362x0, interfaceC0804p);
                    AbstractC2850K.m10278a(context2, m10280c);
                    m8036R0 = m10660b;
                } catch (Throwable th) {
                    AbstractC2850K.m10278a(context2, m10280c);
                    throw th;
                }
            } else {
                C2357V c2357v = new C2357V(m7977e, interfaceC7157e);
                AbstractC2956a.m10658d(interfaceC0804p, c2357v, c2357v, null, 4, null);
                m8036R0 = c2357v.m8036R0();
            }
        }
        if (m8036R0 == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m8036R0;
    }
}
