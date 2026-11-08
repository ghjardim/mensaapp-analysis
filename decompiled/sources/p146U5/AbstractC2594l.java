package p146U5;

import java.util.concurrent.CancellationException;
import p132S5.AbstractC2387j0;

/* renamed from: U5.l */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2594l {
    /* renamed from: a */
    public static final void m8874a(InterfaceC2601s interfaceC2601s, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = AbstractC2387j0.m8124a("Channel was consumed, consumer had failed", th);
            }
        }
        interfaceC2601s.cancel(r0);
    }
}
