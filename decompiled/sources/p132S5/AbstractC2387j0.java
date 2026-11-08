package p132S5;

import java.util.concurrent.CancellationException;

/* renamed from: S5.j0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2387j0 {
    /* renamed from: a */
    public static final CancellationException m8124a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
