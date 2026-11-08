package p167X5;

import java.util.concurrent.CancellationException;
import p069J5.InterfaceC0800l;
import p132S5.AbstractC2324E;
import p132S5.AbstractC2326F;
import p132S5.AbstractC2377e0;
import p132S5.C2352S0;
import p132S5.C2362X0;
import p132S5.InterfaceC2409u0;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: X5.l */
/* loaded from: classes2.dex */
public abstract class AbstractC2867l {

    /* renamed from: a */
    public static final C2846G f8839a = new C2846G("UNDEFINED");

    /* renamed from: b */
    public static final C2846G f8840b = new C2846G("REUSABLE_CLAIMED");

    /* renamed from: b */
    public static final void m10336b(InterfaceC7157e interfaceC7157e, Object obj, InterfaceC0800l interfaceC0800l) {
        if (!(interfaceC7157e instanceof C2866k)) {
            interfaceC7157e.resumeWith(obj);
            return;
        }
        C2866k c2866k = (C2866k) interfaceC7157e;
        Object m7970b = AbstractC2324E.m7970b(obj, interfaceC0800l);
        if (c2866k.f8835d.mo7984F(c2866k.getContext())) {
            c2866k.f8837f = m7970b;
            c2866k.f7088c = 1;
            c2866k.f8835d.mo7983D(c2866k.getContext(), c2866k);
            return;
        }
        AbstractC2377e0 m8025b = C2352S0.f7083a.m8025b();
        if (m8025b.m8079d0()) {
            c2866k.f8837f = m7970b;
            c2866k.f7088c = 1;
            m8025b.m8076R(c2866k);
            return;
        }
        m8025b.m8078T(true);
        try {
            InterfaceC2409u0 interfaceC2409u0 = (InterfaceC2409u0) c2866k.getContext().get(InterfaceC2409u0.f7157j);
            if (interfaceC2409u0 == null || interfaceC2409u0.isActive()) {
                InterfaceC7157e interfaceC7157e2 = c2866k.f8836e;
                Object obj2 = c2866k.f8838n;
                InterfaceC7161i context = interfaceC7157e2.getContext();
                Object m10280c = AbstractC2850K.m10280c(context, obj2);
                C2362X0 m7979g = m10280c != AbstractC2850K.f8812a ? AbstractC2326F.m7979g(interfaceC7157e2, context, m10280c) : null;
                try {
                    c2866k.f8836e.resumeWith(obj);
                    C6934q c6934q = C6934q.f24811a;
                } finally {
                    if (m7979g == null || m7979g.m8051R0()) {
                        AbstractC2850K.m10278a(context, m10280c);
                    }
                }
            } else {
                CancellationException cancellationException = interfaceC2409u0.getCancellationException();
                c2866k.mo8040a(m7970b, cancellationException);
                C6927j.a aVar = C6927j.f24803b;
                c2866k.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(cancellationException)));
            }
            while (m8025b.m8082l0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m10337c(InterfaceC7157e interfaceC7157e, Object obj, InterfaceC0800l interfaceC0800l, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            interfaceC0800l = null;
        }
        m10336b(interfaceC7157e, obj, interfaceC0800l);
    }
}
