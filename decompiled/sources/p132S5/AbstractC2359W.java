package p132S5;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC5469l;
import p167X5.AbstractC2850K;
import p167X5.C2866k;
import p181Z5.AbstractRunnableC3087h;
import p181Z5.InterfaceC3088i;
import p371w5.AbstractC6918a;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: S5.W */
/* loaded from: classes2.dex */
public abstract class AbstractC2359W extends AbstractRunnableC3087h {

    /* renamed from: c */
    public int f7088c;

    public AbstractC2359W(int i7) {
        this.f7088c = i7;
    }

    /* renamed from: a */
    public abstract void mo8040a(Object obj, Throwable th);

    /* renamed from: c */
    public abstract InterfaceC7157e mo8041c();

    /* renamed from: d */
    public Throwable mo8042d(Object obj) {
        C2318B c2318b = obj instanceof C2318B ? (C2318B) obj : null;
        if (c2318b != null) {
            return c2318b.f7023a;
        }
        return null;
    }

    /* renamed from: g */
    public final void m8044g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC6918a.m28362a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC5469l.m23025b(th);
        AbstractC2332I.m7992a(mo8041c().getContext(), new C2340M("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: h */
    public abstract Object mo8045h();

    @Override // java.lang.Runnable
    public final void run() {
        Object m28373b;
        Object m28373b2;
        InterfaceC3088i interfaceC3088i = this.f9554b;
        try {
            InterfaceC7157e mo8041c = mo8041c();
            AbstractC5469l.m23026c(mo8041c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C2866k c2866k = (C2866k) mo8041c;
            InterfaceC7157e interfaceC7157e = c2866k.f8836e;
            Object obj = c2866k.f8838n;
            InterfaceC7161i context = interfaceC7157e.getContext();
            Object m10280c = AbstractC2850K.m10280c(context, obj);
            C2362X0 m7979g = m10280c != AbstractC2850K.f8812a ? AbstractC2326F.m7979g(interfaceC7157e, context, m10280c) : null;
            try {
                InterfaceC7161i context2 = interfaceC7157e.getContext();
                Object mo8045h = mo8045h();
                Throwable mo8042d = mo8042d(mo8045h);
                InterfaceC2409u0 interfaceC2409u0 = (mo8042d == null && AbstractC2361X.m8047b(this.f7088c)) ? (InterfaceC2409u0) context2.get(InterfaceC2409u0.f7157j) : null;
                if (interfaceC2409u0 != null && !interfaceC2409u0.isActive()) {
                    CancellationException cancellationException = interfaceC2409u0.getCancellationException();
                    mo8040a(mo8045h, cancellationException);
                    C6927j.a aVar = C6927j.f24803b;
                    interfaceC7157e.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(cancellationException)));
                } else if (mo8042d != null) {
                    C6927j.a aVar2 = C6927j.f24803b;
                    interfaceC7157e.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(mo8042d)));
                } else {
                    C6927j.a aVar3 = C6927j.f24803b;
                    interfaceC7157e.resumeWith(C6927j.m28373b(mo8043e(mo8045h)));
                }
                C6934q c6934q = C6934q.f24811a;
                if (m7979g == null || m7979g.m8051R0()) {
                    AbstractC2850K.m10278a(context, m10280c);
                }
                try {
                    interfaceC3088i.mo11288a();
                    m28373b2 = C6927j.m28373b(C6934q.f24811a);
                } catch (Throwable th) {
                    C6927j.a aVar4 = C6927j.f24803b;
                    m28373b2 = C6927j.m28373b(AbstractC6928k.m28381a(th));
                }
                m8044g(null, C6927j.m28375d(m28373b2));
            } catch (Throwable th2) {
                if (m7979g == null || m7979g.m8051R0()) {
                    AbstractC2850K.m10278a(context, m10280c);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                C6927j.a aVar5 = C6927j.f24803b;
                interfaceC3088i.mo11288a();
                m28373b = C6927j.m28373b(C6934q.f24811a);
            } catch (Throwable th4) {
                C6927j.a aVar6 = C6927j.f24803b;
                m28373b = C6927j.m28373b(AbstractC6928k.m28381a(th4));
            }
            m8044g(th3, C6927j.m28375d(m28373b));
        }
    }

    /* renamed from: e */
    public Object mo8043e(Object obj) {
        return obj;
    }
}
