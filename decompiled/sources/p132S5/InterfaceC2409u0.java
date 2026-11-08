package p132S5;

import java.util.concurrent.CancellationException;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p118Q5.InterfaceC2210c;
import p189a6.InterfaceC3180a;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: S5.u0 */
/* loaded from: classes2.dex */
public interface InterfaceC2409u0 extends InterfaceC7161i.b {

    /* renamed from: j */
    public static final b f7157j = b.f7158a;

    /* renamed from: S5.u0$b */
    public static final class b implements InterfaceC7161i.c {

        /* renamed from: a */
        public static final /* synthetic */ b f7158a = new b();
    }

    InterfaceC2406t attachChild(InterfaceC2410v interfaceC2410v);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    InterfaceC2210c getChildren();

    InterfaceC3180a getOnJoin();

    InterfaceC2409u0 getParent();

    InterfaceC2368a0 invokeOnCompletion(InterfaceC0800l interfaceC0800l);

    InterfaceC2368a0 invokeOnCompletion(boolean z6, boolean z7, InterfaceC0800l interfaceC0800l);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(InterfaceC7157e interfaceC7157e);

    InterfaceC2409u0 plus(InterfaceC2409u0 interfaceC2409u0);

    boolean start();

    /* renamed from: S5.u0$a */
    public static final class a {
        /* renamed from: b */
        public static /* synthetic */ void m8180b(InterfaceC2409u0 interfaceC2409u0, CancellationException cancellationException, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i7 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC2409u0.cancel(cancellationException);
        }

        /* renamed from: c */
        public static Object m8181c(InterfaceC2409u0 interfaceC2409u0, Object obj, InterfaceC0804p interfaceC0804p) {
            return InterfaceC7161i.b.a.m29476a(interfaceC2409u0, obj, interfaceC0804p);
        }

        /* renamed from: d */
        public static InterfaceC7161i.b m8182d(InterfaceC2409u0 interfaceC2409u0, InterfaceC7161i.c cVar) {
            return InterfaceC7161i.b.a.m29477b(interfaceC2409u0, cVar);
        }

        /* renamed from: e */
        public static InterfaceC7161i m8183e(InterfaceC2409u0 interfaceC2409u0, InterfaceC7161i.c cVar) {
            return InterfaceC7161i.b.a.m29478c(interfaceC2409u0, cVar);
        }

        /* renamed from: g */
        public static InterfaceC7161i m8185g(InterfaceC2409u0 interfaceC2409u0, InterfaceC7161i interfaceC7161i) {
            return InterfaceC7161i.b.a.m29479d(interfaceC2409u0, interfaceC7161i);
        }

        /* renamed from: f */
        public static InterfaceC2409u0 m8184f(InterfaceC2409u0 interfaceC2409u0, InterfaceC2409u0 interfaceC2409u02) {
            return interfaceC2409u02;
        }
    }
}
