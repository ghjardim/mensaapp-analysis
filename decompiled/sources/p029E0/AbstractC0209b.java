package p029E0;

import java.util.NoSuchElementException;

/* renamed from: E0.b */
/* loaded from: classes.dex */
public abstract class AbstractC0209b implements InterfaceC0221n {

    /* renamed from: b */
    public final long f847b;

    /* renamed from: c */
    public final long f848c;

    /* renamed from: d */
    public long f849d;

    public AbstractC0209b(long j7, long j8) {
        this.f847b = j7;
        this.f848c = j8;
        m855f();
    }

    /* renamed from: c */
    public final void m852c() {
        long j7 = this.f849d;
        if (j7 < this.f847b || j7 > this.f848c) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d */
    public final long m853d() {
        return this.f849d;
    }

    /* renamed from: e */
    public boolean m854e() {
        return this.f849d > this.f848c;
    }

    /* renamed from: f */
    public void m855f() {
        this.f849d = this.f847b - 1;
    }

    @Override // p029E0.InterfaceC0221n
    public boolean next() {
        this.f849d++;
        return !m854e();
    }
}
