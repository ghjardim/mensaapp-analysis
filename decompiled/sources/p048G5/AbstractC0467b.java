package p048G5;

import java.io.Closeable;
import p371w5.AbstractC6918a;

/* renamed from: G5.b */
/* loaded from: classes2.dex */
public abstract class AbstractC0467b {
    /* renamed from: a */
    public static final void m1715a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC6918a.m28362a(th, th2);
            }
        }
    }
}
