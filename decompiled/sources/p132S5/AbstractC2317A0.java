package p132S5;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC5467j;
import p069J5.InterfaceC0800l;
import p118Q5.InterfaceC2210c;
import p371w5.C6934q;
import p392z5.InterfaceC7161i;

/* renamed from: S5.A0 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2317A0 {

    /* renamed from: S5.A0$a */
    public /* synthetic */ class a extends AbstractC5467j implements InterfaceC0800l {
        public a(Object obj) {
            super(1, obj, InterfaceC2403r0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        /* renamed from: f */
        public final void m7860f(Throwable th) {
            ((InterfaceC2403r0) this.receiver).mo7940a(th);
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m7860f((Throwable) obj);
            return C6934q.f24811a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC2418z m7849a(InterfaceC2409u0 interfaceC2409u0) {
        return new C2415x0(interfaceC2409u0);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC2418z m7850b(InterfaceC2409u0 interfaceC2409u0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC2409u0 = null;
        }
        return AbstractC2417y0.m8192a(interfaceC2409u0);
    }

    /* renamed from: c */
    public static final void m7851c(InterfaceC7161i interfaceC7161i, CancellationException cancellationException) {
        InterfaceC2409u0 interfaceC2409u0 = (InterfaceC2409u0) interfaceC7161i.get(InterfaceC2409u0.f7157j);
        if (interfaceC2409u0 != null) {
            interfaceC2409u0.cancel(cancellationException);
        }
    }

    /* renamed from: d */
    public static final void m7852d(InterfaceC7161i interfaceC7161i, CancellationException cancellationException) {
        InterfaceC2210c children;
        InterfaceC2409u0 interfaceC2409u0 = (InterfaceC2409u0) interfaceC7161i.get(InterfaceC2409u0.f7157j);
        if (interfaceC2409u0 == null || (children = interfaceC2409u0.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((InterfaceC2409u0) it.next()).cancel(cancellationException);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m7853e(InterfaceC7161i interfaceC7161i, CancellationException cancellationException, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC2417y0.m8195d(interfaceC7161i, cancellationException);
    }

    /* renamed from: f */
    public static final InterfaceC2368a0 m7854f(InterfaceC2409u0 interfaceC2409u0, InterfaceC2368a0 interfaceC2368a0) {
        return m7859k(interfaceC2409u0, false, false, new C2373c0(interfaceC2368a0), 3, null);
    }

    /* renamed from: g */
    public static final void m7855g(InterfaceC2409u0 interfaceC2409u0) {
        if (!interfaceC2409u0.isActive()) {
            throw interfaceC2409u0.getCancellationException();
        }
    }

    /* renamed from: h */
    public static final void m7856h(InterfaceC7161i interfaceC7161i) {
        InterfaceC2409u0 interfaceC2409u0 = (InterfaceC2409u0) interfaceC7161i.get(InterfaceC2409u0.f7157j);
        if (interfaceC2409u0 != null) {
            AbstractC2417y0.m8199h(interfaceC2409u0);
        }
    }

    /* renamed from: i */
    public static final InterfaceC2409u0 m7857i(InterfaceC7161i interfaceC7161i) {
        InterfaceC2409u0 interfaceC2409u0 = (InterfaceC2409u0) interfaceC7161i.get(InterfaceC2409u0.f7157j);
        if (interfaceC2409u0 != null) {
            return interfaceC2409u0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC7161i).toString());
    }

    /* renamed from: j */
    public static final InterfaceC2368a0 m7858j(InterfaceC2409u0 interfaceC2409u0, boolean z6, boolean z7, InterfaceC2403r0 interfaceC2403r0) {
        return interfaceC2409u0 instanceof C2321C0 ? ((C2321C0) interfaceC2409u0).m7918h0(z6, z7, interfaceC2403r0) : interfaceC2409u0.invokeOnCompletion(z6, z7, new a(interfaceC2403r0));
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC2368a0 m7859k(InterfaceC2409u0 interfaceC2409u0, boolean z6, boolean z7, InterfaceC2403r0 interfaceC2403r0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        return AbstractC2417y0.m8202k(interfaceC2409u0, z6, z7, interfaceC2403r0);
    }
}
