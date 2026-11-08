package p132S5;

import kotlin.jvm.internal.AbstractC5469l;
import p167X5.AbstractC2850K;
import p167X5.C2866k;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: S5.X */
/* loaded from: classes2.dex */
public abstract class AbstractC2361X {
    /* renamed from: a */
    public static final void m8046a(AbstractC2359W abstractC2359W, int i7) {
        InterfaceC7157e mo8041c = abstractC2359W.mo8041c();
        boolean z6 = i7 == 4;
        if (z6 || !(mo8041c instanceof C2866k) || m8047b(i7) != m8047b(abstractC2359W.f7088c)) {
            m8049d(abstractC2359W, mo8041c, z6);
            return;
        }
        AbstractC2328G abstractC2328G = ((C2866k) mo8041c).f8835d;
        InterfaceC7161i context = mo8041c.getContext();
        if (abstractC2328G.mo7984F(context)) {
            abstractC2328G.mo7983D(context, abstractC2359W);
        } else {
            m8050e(abstractC2359W);
        }
    }

    /* renamed from: b */
    public static final boolean m8047b(int i7) {
        return i7 == 1 || i7 == 2;
    }

    /* renamed from: c */
    public static final boolean m8048c(int i7) {
        return i7 == 2;
    }

    /* renamed from: d */
    public static final void m8049d(AbstractC2359W abstractC2359W, InterfaceC7157e interfaceC7157e, boolean z6) {
        Object mo8043e;
        Object mo8045h = abstractC2359W.mo8045h();
        Throwable mo8042d = abstractC2359W.mo8042d(mo8045h);
        if (mo8042d != null) {
            C6927j.a aVar = C6927j.f24803b;
            mo8043e = AbstractC6928k.m28381a(mo8042d);
        } else {
            C6927j.a aVar2 = C6927j.f24803b;
            mo8043e = abstractC2359W.mo8043e(mo8045h);
        }
        Object m28373b = C6927j.m28373b(mo8043e);
        if (!z6) {
            interfaceC7157e.resumeWith(m28373b);
            return;
        }
        AbstractC5469l.m23026c(interfaceC7157e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C2866k c2866k = (C2866k) interfaceC7157e;
        InterfaceC7157e interfaceC7157e2 = c2866k.f8836e;
        Object obj = c2866k.f8838n;
        InterfaceC7161i context = interfaceC7157e2.getContext();
        Object m10280c = AbstractC2850K.m10280c(context, obj);
        C2362X0 m7979g = m10280c != AbstractC2850K.f8812a ? AbstractC2326F.m7979g(interfaceC7157e2, context, m10280c) : null;
        try {
            c2866k.f8836e.resumeWith(m28373b);
            C6934q c6934q = C6934q.f24811a;
        } finally {
            if (m7979g == null || m7979g.m8051R0()) {
                AbstractC2850K.m10278a(context, m10280c);
            }
        }
    }

    /* renamed from: e */
    public static final void m8050e(AbstractC2359W abstractC2359W) {
        AbstractC2377e0 m8025b = C2352S0.f7083a.m8025b();
        if (m8025b.m8079d0()) {
            m8025b.m8076R(abstractC2359W);
            return;
        }
        m8025b.m8078T(true);
        try {
            m8049d(abstractC2359W, abstractC2359W.mo8041c(), true);
            do {
            } while (m8025b.m8082l0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
