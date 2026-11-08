package p237g5;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p171Y2.AbstractC2932o;
import p366w0.AbstractC6820f;

/* renamed from: g5.p0 */
/* loaded from: classes2.dex */
public final class ExecutorC4456p0 implements Executor {

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f15862a;

    /* renamed from: b */
    public final Queue f15863b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    public final AtomicReference f15864c = new AtomicReference();

    /* renamed from: g5.p0$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ c f15865a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f15866b;

        public a(c cVar, Runnable runnable) {
            this.f15865a = cVar;
            this.f15866b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorC4456p0.this.execute(this.f15865a);
        }

        public String toString() {
            return this.f15866b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* renamed from: g5.p0$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ c f15868a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f15869b;

        /* renamed from: c */
        public final /* synthetic */ long f15870c;

        public b(c cVar, Runnable runnable, long j7) {
            this.f15868a = cVar;
            this.f15869b = runnable;
            this.f15870c = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorC4456p0.this.execute(this.f15868a);
        }

        public String toString() {
            return this.f15869b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f15870c + ")";
        }
    }

    /* renamed from: g5.p0$c */
    public static class c implements Runnable {

        /* renamed from: a */
        public final Runnable f15872a;

        /* renamed from: b */
        public boolean f15873b;

        /* renamed from: c */
        public boolean f15874c;

        public c(Runnable runnable) {
            this.f15872a = (Runnable) AbstractC2932o.m10573p(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15873b) {
                return;
            }
            this.f15874c = true;
            this.f15872a.run();
        }
    }

    /* renamed from: g5.p0$d */
    public static final class d {

        /* renamed from: a */
        public final c f15875a;

        /* renamed from: b */
        public final ScheduledFuture f15876b;

        public /* synthetic */ d(c cVar, ScheduledFuture scheduledFuture, a aVar) {
            this(cVar, scheduledFuture);
        }

        /* renamed from: a */
        public void m18994a() {
            this.f15875a.f15873b = true;
            this.f15876b.cancel(false);
        }

        /* renamed from: b */
        public boolean m18995b() {
            c cVar = this.f15875a;
            return (cVar.f15874c || cVar.f15873b) ? false : true;
        }

        public d(c cVar, ScheduledFuture scheduledFuture) {
            this.f15875a = (c) AbstractC2932o.m10573p(cVar, "runnable");
            this.f15876b = (ScheduledFuture) AbstractC2932o.m10573p(scheduledFuture, "future");
        }
    }

    public ExecutorC4456p0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f15862a = (Thread.UncaughtExceptionHandler) AbstractC2932o.m10573p(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    /* renamed from: a */
    public final void m18989a() {
        while (AbstractC6820f.m28054a(this.f15864c, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f15863b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.f15862a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.f15864c.set(null);
                    throw th2;
                }
            }
            this.f15864c.set(null);
            if (this.f15863b.isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void m18990b(Runnable runnable) {
        this.f15863b.add((Runnable) AbstractC2932o.m10573p(runnable, "runnable is null"));
    }

    /* renamed from: c */
    public final d m18991c(Runnable runnable, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.schedule(new a(cVar, runnable), j7, timeUnit), null);
    }

    /* renamed from: d */
    public final d m18992d(Runnable runnable, long j7, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.scheduleWithFixedDelay(new b(cVar, runnable, j8), j7, j8, timeUnit), null);
    }

    /* renamed from: e */
    public void m18993e() {
        AbstractC2932o.m10579v(Thread.currentThread() == this.f15864c.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m18990b(runnable);
        m18989a();
    }
}
