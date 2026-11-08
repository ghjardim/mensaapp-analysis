package p211d3;

import java.util.concurrent.Future;

/* renamed from: d3.h */
/* loaded from: classes.dex */
public abstract class AbstractC4118h {
    /* renamed from: a */
    public static Object m17300a(Future future) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
