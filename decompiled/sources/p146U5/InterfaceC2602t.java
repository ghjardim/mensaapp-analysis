package p146U5;

import p069J5.InterfaceC0800l;
import p392z5.InterfaceC7157e;

/* renamed from: U5.t */
/* loaded from: classes2.dex */
public interface InterfaceC2602t {

    /* renamed from: U5.t$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ boolean m8883a(InterfaceC2602t interfaceC2602t, Throwable th, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i7 & 1) != 0) {
                th = null;
            }
            return interfaceC2602t.mo8781k(th);
        }
    }

    /* renamed from: d */
    Object mo8771d(Object obj, InterfaceC7157e interfaceC7157e);

    /* renamed from: g */
    void mo8776g(InterfaceC0800l interfaceC0800l);

    /* renamed from: k */
    boolean mo8781k(Throwable th);

    /* renamed from: p */
    Object mo8787p(Object obj);

    /* renamed from: s */
    boolean mo8791s();
}
