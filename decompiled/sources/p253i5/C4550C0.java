package p253i5;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p171Y2.C2937t;

/* renamed from: i5.C0 */
/* loaded from: classes2.dex */
public final class C4550C0 {

    /* renamed from: a */
    public final ScheduledExecutorService f16344a;

    /* renamed from: b */
    public final Executor f16345b;

    /* renamed from: c */
    public final Runnable f16346c;

    /* renamed from: d */
    public final C2937t f16347d;

    /* renamed from: e */
    public long f16348e;

    /* renamed from: f */
    public boolean f16349f;

    /* renamed from: g */
    public ScheduledFuture f16350g;

    /* renamed from: i5.C0$b */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C4550C0.this.f16349f) {
                C4550C0.this.f16350g = null;
                return;
            }
            long m19401j = C4550C0.this.m19401j();
            if (C4550C0.this.f16348e - m19401j > 0) {
                C4550C0 c4550c0 = C4550C0.this;
                c4550c0.f16350g = c4550c0.f16344a.schedule(new c(), C4550C0.this.f16348e - m19401j, TimeUnit.NANOSECONDS);
            } else {
                C4550C0.this.f16349f = false;
                C4550C0.this.f16350g = null;
                C4550C0.this.f16346c.run();
            }
        }
    }

    /* renamed from: i5.C0$c */
    public final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4550C0.this.f16345b.execute(new b());
        }
    }

    public C4550C0(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, C2937t c2937t) {
        this.f16346c = runnable;
        this.f16345b = executor;
        this.f16344a = scheduledExecutorService;
        this.f16347d = c2937t;
        c2937t.m10606g();
    }

    /* renamed from: i */
    public void m19400i(boolean z6) {
        ScheduledFuture scheduledFuture;
        this.f16349f = false;
        if (!z6 || (scheduledFuture = this.f16350g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f16350g = null;
    }

    /* renamed from: j */
    public final long m19401j() {
        return this.f16347d.m10603d(TimeUnit.NANOSECONDS);
    }

    /* renamed from: k */
    public void m19402k(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        long m19401j = m19401j() + nanos;
        this.f16349f = true;
        if (m19401j - this.f16348e < 0 || this.f16350g == null) {
            ScheduledFuture scheduledFuture = this.f16350g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f16350g = this.f16344a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f16348e = m19401j;
    }
}
