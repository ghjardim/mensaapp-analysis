package p253i5;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: i5.X */
/* loaded from: classes2.dex */
public abstract class AbstractC4590X {

    /* renamed from: a */
    public final Set f16676a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: a */
    public final boolean m19697a(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f16676a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public abstract void mo19698b();

    /* renamed from: c */
    public abstract void mo19699c();

    /* renamed from: d */
    public final boolean m19700d() {
        return !this.f16676a.isEmpty();
    }

    /* renamed from: e */
    public final void m19701e(Object obj, boolean z6) {
        int size = this.f16676a.size();
        if (z6) {
            this.f16676a.add(obj);
            if (size == 0) {
                mo19698b();
                return;
            }
            return;
        }
        if (this.f16676a.remove(obj) && size == 1) {
            mo19699c();
        }
    }
}
