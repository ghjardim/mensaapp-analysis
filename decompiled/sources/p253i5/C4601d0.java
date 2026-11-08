package p253i5;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p171Y2.AbstractC2932o;
import p171Y2.C2937t;
import p211d3.AbstractC4116f;
import p237g5.C4448l0;
import p253i5.InterfaceC4632t;

/* renamed from: i5.d0 */
/* loaded from: classes2.dex */
public class C4601d0 {

    /* renamed from: l */
    public static final long f16776l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: m */
    public static final long f16777m = TimeUnit.MILLISECONDS.toNanos(10);

    /* renamed from: a */
    public final ScheduledExecutorService f16778a;

    /* renamed from: b */
    public final C2937t f16779b;

    /* renamed from: c */
    public final d f16780c;

    /* renamed from: d */
    public final boolean f16781d;

    /* renamed from: e */
    public e f16782e;

    /* renamed from: f */
    public ScheduledFuture f16783f;

    /* renamed from: g */
    public ScheduledFuture f16784g;

    /* renamed from: h */
    public final Runnable f16785h;

    /* renamed from: i */
    public final Runnable f16786i;

    /* renamed from: j */
    public final long f16787j;

    /* renamed from: k */
    public final long f16788k;

    /* renamed from: i5.d0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            synchronized (C4601d0.this) {
                try {
                    e eVar = C4601d0.this.f16782e;
                    e eVar2 = e.DISCONNECTED;
                    if (eVar != eVar2) {
                        C4601d0.this.f16782e = eVar2;
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z6) {
                C4601d0.this.f16780c.mo19855a();
            }
        }
    }

    /* renamed from: i5.d0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z6;
            synchronized (C4601d0.this) {
                try {
                    C4601d0.this.f16784g = null;
                    e eVar = C4601d0.this.f16782e;
                    e eVar2 = e.PING_SCHEDULED;
                    if (eVar == eVar2) {
                        C4601d0.this.f16782e = e.PING_SENT;
                        C4601d0 c4601d0 = C4601d0.this;
                        c4601d0.f16783f = c4601d0.f16778a.schedule(C4601d0.this.f16785h, C4601d0.this.f16788k, TimeUnit.NANOSECONDS);
                        z6 = true;
                    } else {
                        if (C4601d0.this.f16782e == e.PING_DELAYED) {
                            C4601d0 c4601d02 = C4601d0.this;
                            ScheduledExecutorService scheduledExecutorService = c4601d02.f16778a;
                            Runnable runnable = C4601d0.this.f16786i;
                            long j7 = C4601d0.this.f16787j;
                            C2937t c2937t = C4601d0.this.f16779b;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            c4601d02.f16784g = scheduledExecutorService.schedule(runnable, j7 - c2937t.m10603d(timeUnit), timeUnit);
                            C4601d0.this.f16782e = eVar2;
                        }
                        z6 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z6) {
                C4601d0.this.f16780c.mo19856b();
            }
        }
    }

    /* renamed from: i5.d0$d */
    public interface d {
        /* renamed from: a */
        void mo19855a();

        /* renamed from: b */
        void mo19856b();
    }

    /* renamed from: i5.d0$e */
    public enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public C4601d0(d dVar, ScheduledExecutorService scheduledExecutorService, long j7, long j8, boolean z6) {
        this(dVar, scheduledExecutorService, C2937t.m10602c(), j7, j8, z6);
    }

    /* renamed from: l */
    public static long m19848l(long j7) {
        return Math.max(j7, f16776l);
    }

    /* renamed from: m */
    public synchronized void m19849m() {
        try {
            this.f16779b.m10605f().m10606g();
            e eVar = this.f16782e;
            e eVar2 = e.PING_SCHEDULED;
            if (eVar == eVar2) {
                this.f16782e = e.PING_DELAYED;
            } else if (eVar == e.PING_SENT || eVar == e.IDLE_AND_PING_SENT) {
                ScheduledFuture scheduledFuture = this.f16783f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f16782e == e.IDLE_AND_PING_SENT) {
                    this.f16782e = e.IDLE;
                } else {
                    this.f16782e = eVar2;
                    AbstractC2932o.m10579v(this.f16784g == null, "There should be no outstanding pingFuture");
                    this.f16784g = this.f16778a.schedule(this.f16786i, this.f16787j, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: n */
    public synchronized void m19850n() {
        try {
            e eVar = this.f16782e;
            if (eVar == e.IDLE) {
                this.f16782e = e.PING_SCHEDULED;
                if (this.f16784g == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f16778a;
                    Runnable runnable = this.f16786i;
                    long j7 = this.f16787j;
                    C2937t c2937t = this.f16779b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f16784g = scheduledExecutorService.schedule(runnable, j7 - c2937t.m10603d(timeUnit), timeUnit);
                }
            } else if (eVar == e.IDLE_AND_PING_SENT) {
                this.f16782e = e.PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x000d, B:13:0x0018, B:15:0x001e, B:19:0x0014), top: B:2:0x0001 }] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m19851o() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f16781d     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            i5.d0$e r0 = r2.f16782e     // Catch: java.lang.Throwable -> L12
            i5.d0$e r1 = p253i5.C4601d0.e.PING_SCHEDULED     // Catch: java.lang.Throwable -> L12
            if (r0 == r1) goto L14
            i5.d0$e r1 = p253i5.C4601d0.e.PING_DELAYED     // Catch: java.lang.Throwable -> L12
            if (r0 != r1) goto L18
            goto L14
        L12:
            r0 = move-exception
            goto L24
        L14:
            i5.d0$e r0 = p253i5.C4601d0.e.IDLE     // Catch: java.lang.Throwable -> L12
            r2.f16782e = r0     // Catch: java.lang.Throwable -> L12
        L18:
            i5.d0$e r0 = r2.f16782e     // Catch: java.lang.Throwable -> L12
            i5.d0$e r1 = p253i5.C4601d0.e.PING_SENT     // Catch: java.lang.Throwable -> L12
            if (r0 != r1) goto L22
            i5.d0$e r0 = p253i5.C4601d0.e.IDLE_AND_PING_SENT     // Catch: java.lang.Throwable -> L12
            r2.f16782e = r0     // Catch: java.lang.Throwable -> L12
        L22:
            monitor-exit(r2)
            return
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p253i5.C4601d0.m19851o():void");
    }

    /* renamed from: p */
    public synchronized void m19852p() {
        if (this.f16781d) {
            m19850n();
        }
    }

    /* renamed from: q */
    public synchronized void m19853q() {
        try {
            e eVar = this.f16782e;
            e eVar2 = e.DISCONNECTED;
            if (eVar != eVar2) {
                this.f16782e = eVar2;
                ScheduledFuture scheduledFuture = this.f16783f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture scheduledFuture2 = this.f16784g;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.f16784g = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C4601d0(d dVar, ScheduledExecutorService scheduledExecutorService, C2937t c2937t, long j7, long j8, boolean z6) {
        this.f16782e = e.IDLE;
        this.f16785h = new RunnableC4603e0(new a());
        this.f16786i = new RunnableC4603e0(new b());
        this.f16780c = (d) AbstractC2932o.m10573p(dVar, "keepAlivePinger");
        this.f16778a = (ScheduledExecutorService) AbstractC2932o.m10573p(scheduledExecutorService, "scheduler");
        this.f16779b = (C2937t) AbstractC2932o.m10573p(c2937t, "stopwatch");
        this.f16787j = j7;
        this.f16788k = j8;
        this.f16781d = z6;
        c2937t.m10605f().m10606g();
    }

    /* renamed from: i5.d0$c */
    public static final class c implements d {

        /* renamed from: a */
        public final InterfaceC4638w f16791a;

        public c(InterfaceC4638w interfaceC4638w) {
            this.f16791a = interfaceC4638w;
        }

        @Override // p253i5.C4601d0.d
        /* renamed from: a */
        public void mo19855a() {
            this.f16791a.mo19348b(C4448l0.f15810t.m18963q("Keepalive failed. The connection is likely gone"));
        }

        @Override // p253i5.C4601d0.d
        /* renamed from: b */
        public void mo19856b() {
            this.f16791a.mo19522e(new a(), AbstractC4116f.m17293a());
        }

        /* renamed from: i5.d0$c$a */
        public class a implements InterfaceC4632t.a {
            public a() {
            }

            @Override // p253i5.InterfaceC4632t.a
            /* renamed from: a */
            public void mo19857a(Throwable th) {
                c.this.f16791a.mo19348b(C4448l0.f15810t.m18963q("Keepalive failed. The connection is likely gone"));
            }

            @Override // p253i5.InterfaceC4632t.a
            /* renamed from: b */
            public void mo19858b(long j7) {
            }
        }
    }
}
