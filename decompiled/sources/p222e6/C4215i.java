package p222e6;

import java.io.IOException;
import java.io.Serializable;

/* renamed from: e6.i */
/* loaded from: classes2.dex */
public class C4215i extends AbstractC4207a {

    /* renamed from: a */
    public final Serializable f14074a;

    public C4215i(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.f14074a = serializable;
    }

    /* renamed from: b */
    public static boolean m17656b(Throwable th, Object obj) {
        return obj != null && (th instanceof C4215i) && obj.equals(((C4215i) th).f14074a);
    }

    /* renamed from: c */
    public static void m17657c(Throwable th, Object obj) {
        if (m17656b(th, obj)) {
            throw ((C4215i) th).getCause();
        }
    }

    @Override // java.lang.Throwable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized IOException getCause() {
        return (IOException) super.getCause();
    }
}
