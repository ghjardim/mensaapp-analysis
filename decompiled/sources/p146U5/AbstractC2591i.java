package p146U5;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: U5.i */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2591i {
    /* renamed from: a */
    public static /* synthetic */ boolean m8858a(AtomicReferenceArray atomicReferenceArray, int i7, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i7, obj, obj2)) {
            if (atomicReferenceArray.get(i7) != obj) {
                return false;
            }
        }
        return true;
    }
}
