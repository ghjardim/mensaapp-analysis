package p140U;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: U.b */
/* loaded from: classes.dex */
public final class C2490b {

    /* renamed from: a */
    public final AtomicBoolean f7321a;

    public C2490b(boolean z6) {
        this.f7321a = new AtomicBoolean(z6);
    }

    /* renamed from: a */
    public final boolean m8421a() {
        return this.f7321a.get();
    }

    /* renamed from: b */
    public final void m8422b(boolean z6) {
        this.f7321a.set(z6);
    }
}
