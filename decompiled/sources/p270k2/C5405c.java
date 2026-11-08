package p270k2;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: k2.c */
/* loaded from: classes.dex */
public final class C5405c extends Thread {

    /* renamed from: a */
    public final WeakReference f19360a;

    /* renamed from: b */
    public final long f19361b;

    /* renamed from: c */
    public final CountDownLatch f19362c = new CountDownLatch(1);

    /* renamed from: d */
    public boolean f19363d = false;

    public C5405c(C5403a c5403a, long j7) {
        this.f19360a = new WeakReference(c5403a);
        this.f19361b = j7;
        start();
    }

    /* renamed from: a */
    public final void m22374a() {
        C5403a c5403a = (C5403a) this.f19360a.get();
        if (c5403a != null) {
            c5403a.m22367c();
            this.f19363d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f19362c.await(this.f19361b, TimeUnit.MILLISECONDS)) {
                return;
            }
            m22374a();
        } catch (InterruptedException unused) {
            m22374a();
        }
    }
}
