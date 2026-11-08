package p132S5;

import p167X5.AbstractC2864i;
import p371w5.AbstractC6918a;
import p392z5.InterfaceC7161i;

/* renamed from: S5.I */
/* loaded from: classes2.dex */
public abstract class AbstractC2332I {
    /* renamed from: a */
    public static final void m7992a(InterfaceC7161i interfaceC7161i, Throwable th) {
        try {
            InterfaceC2330H interfaceC2330H = (InterfaceC2330H) interfaceC7161i.get(InterfaceC2330H.f7065i);
            if (interfaceC2330H != null) {
                interfaceC2330H.mo7991a(interfaceC7161i, th);
            } else {
                AbstractC2864i.m10326a(interfaceC7161i, th);
            }
        } catch (Throwable th2) {
            AbstractC2864i.m10326a(interfaceC7161i, m7993b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m7993b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC6918a.m28362a(runtimeException, th);
        return runtimeException;
    }
}
