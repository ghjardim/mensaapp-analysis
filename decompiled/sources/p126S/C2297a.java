package p126S;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: S.a */
/* loaded from: classes.dex */
public final class C2297a {

    /* renamed from: a */
    public final AtomicBoolean f6951a;

    public C2297a(boolean z6) {
        this.f6951a = new AtomicBoolean(z6);
    }

    /* renamed from: a */
    public final boolean m7796a() {
        return this.f6951a.get();
    }

    /* renamed from: b */
    public final void m7797b(boolean z6) {
        this.f6951a.set(z6);
    }
}
