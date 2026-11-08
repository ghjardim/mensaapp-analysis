package p112Q;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Q.a */
/* loaded from: classes.dex */
public final class C1980a {

    /* renamed from: a */
    public final AtomicInteger f5985a;

    public C1980a(int i7) {
        this.f5985a = new AtomicInteger(i7);
    }

    /* renamed from: a */
    public final int m7029a() {
        return this.f5985a.decrementAndGet();
    }

    /* renamed from: b */
    public final int m7030b() {
        return this.f5985a.get();
    }

    /* renamed from: c */
    public final int m7031c() {
        return this.f5985a.getAndIncrement();
    }

    /* renamed from: d */
    public final int m7032d() {
        return this.f5985a.incrementAndGet();
    }
}
