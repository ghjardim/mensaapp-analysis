package p366w0;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: w0.f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6820f {
    /* renamed from: a */
    public static /* synthetic */ boolean m28054a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
