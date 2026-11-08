package p055H5;

import p371w5.AbstractC6918a;

/* renamed from: H5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC0590a {
    /* renamed from: a */
    public static final void m2388a(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                AbstractC6918a.m28362a(th, th2);
            }
        }
    }
}
