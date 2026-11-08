package p350u;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: u.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6581b {
    /* renamed from: a */
    public static /* synthetic */ boolean m27343a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
