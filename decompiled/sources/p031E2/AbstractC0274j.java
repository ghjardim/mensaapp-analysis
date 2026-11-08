package p031E2;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: E2.j */
/* loaded from: classes.dex */
public abstract class AbstractC0274j {
    /* renamed from: a */
    public static void m1127a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
