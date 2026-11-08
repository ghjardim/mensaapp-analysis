package p369w3;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p369w3.ScheduledFutureC6905p;

/* renamed from: w3.o */
/* loaded from: classes.dex */
public class ScheduledExecutorServiceC6904o implements ScheduledExecutorService {

    /* renamed from: a */
    public final ExecutorService f24780a;

    /* renamed from: b */
    public final ScheduledExecutorService f24781b;

    public ScheduledExecutorServiceC6904o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f24780a = executorService;
        this.f24781b = scheduledExecutorService;
    }

    /* renamed from: n */
    public static /* synthetic */ void m28327n(Runnable runnable, ScheduledFutureC6905p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e7) {
            bVar.mo28342a(e7);
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m28328r(Callable callable, ScheduledFutureC6905p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e7) {
            bVar.mo28342a(e7);
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m28329u(Runnable runnable, ScheduledFutureC6905p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e7) {
            bVar.mo28342a(e7);
            throw e7;
        }
    }

    /* renamed from: z */
    public static /* synthetic */ void m28330z(Runnable runnable, ScheduledFutureC6905p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e7) {
            bVar.mo28342a(e7);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return this.f24780a.awaitTermination(j7, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f24780a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f24780a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f24780a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f24780a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f24780a.isTerminated();
    }

    /* renamed from: p */
    public final /* synthetic */ void m28331p(final Runnable runnable, final ScheduledFutureC6905p.b bVar) {
        this.f24780a.execute(new Runnable() { // from class: w3.m
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6904o.m28327n(runnable, bVar);
            }
        });
    }

    /* renamed from: q */
    public final /* synthetic */ ScheduledFuture m28332q(final Runnable runnable, long j7, TimeUnit timeUnit, final ScheduledFutureC6905p.b bVar) {
        return this.f24781b.schedule(new Runnable() { // from class: w3.j
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6904o.this.m28331p(runnable, bVar);
            }
        }, j7, timeUnit);
    }

    /* renamed from: s */
    public final /* synthetic */ Future m28333s(final Callable callable, final ScheduledFutureC6905p.b bVar) {
        return this.f24780a.submit(new Runnable() { // from class: w3.n
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6904o.m28328r(callable, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j7, final TimeUnit timeUnit) {
        return new ScheduledFutureC6905p(new ScheduledFutureC6905p.c() { // from class: w3.c
            @Override // p369w3.ScheduledFutureC6905p.c
            /* renamed from: a */
            public final ScheduledFuture mo28314a(ScheduledFutureC6905p.b bVar) {
                ScheduledFuture m28332q;
                m28332q = ScheduledExecutorServiceC6904o.this.m28332q(runnable, j7, timeUnit, bVar);
                return m28332q;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j7, final long j8, final TimeUnit timeUnit) {
        return new ScheduledFutureC6905p(new ScheduledFutureC6905p.c() { // from class: w3.f
            @Override // p369w3.ScheduledFutureC6905p.c
            /* renamed from: a */
            public final ScheduledFuture mo28314a(ScheduledFutureC6905p.b bVar) {
                ScheduledFuture m28336w;
                m28336w = ScheduledExecutorServiceC6904o.this.m28336w(runnable, j7, j8, timeUnit, bVar);
                return m28336w;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j7, final long j8, final TimeUnit timeUnit) {
        return new ScheduledFutureC6905p(new ScheduledFutureC6905p.c() { // from class: w3.g
            @Override // p369w3.ScheduledFutureC6905p.c
            /* renamed from: a */
            public final ScheduledFuture mo28314a(ScheduledFutureC6905p.b bVar) {
                ScheduledFuture m28338y;
                m28338y = ScheduledExecutorServiceC6904o.this.m28338y(runnable, j7, j8, timeUnit, bVar);
                return m28338y;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f24780a.submit(callable);
    }

    /* renamed from: t */
    public final /* synthetic */ ScheduledFuture m28334t(final Callable callable, long j7, TimeUnit timeUnit, final ScheduledFutureC6905p.b bVar) {
        return this.f24781b.schedule(new Callable() { // from class: w3.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future m28333s;
                m28333s = ScheduledExecutorServiceC6904o.this.m28333s(callable, bVar);
                return m28333s;
            }
        }, j7, timeUnit);
    }

    /* renamed from: v */
    public final /* synthetic */ void m28335v(final Runnable runnable, final ScheduledFutureC6905p.b bVar) {
        this.f24780a.execute(new Runnable() { // from class: w3.d
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6904o.m28329u(runnable, bVar);
            }
        });
    }

    /* renamed from: w */
    public final /* synthetic */ ScheduledFuture m28336w(final Runnable runnable, long j7, long j8, TimeUnit timeUnit, final ScheduledFutureC6905p.b bVar) {
        return this.f24781b.scheduleAtFixedRate(new Runnable() { // from class: w3.i
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6904o.this.m28335v(runnable, bVar);
            }
        }, j7, j8, timeUnit);
    }

    /* renamed from: x */
    public final /* synthetic */ void m28337x(final Runnable runnable, final ScheduledFutureC6905p.b bVar) {
        this.f24780a.execute(new Runnable() { // from class: w3.e
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6904o.m28330z(runnable, bVar);
            }
        });
    }

    /* renamed from: y */
    public final /* synthetic */ ScheduledFuture m28338y(final Runnable runnable, long j7, long j8, TimeUnit timeUnit, final ScheduledFutureC6905p.b bVar) {
        return this.f24781b.scheduleWithFixedDelay(new Runnable() { // from class: w3.l
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6904o.this.m28337x(runnable, bVar);
            }
        }, j7, j8, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f24780a.invokeAll(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f24780a.invokeAny(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j7, final TimeUnit timeUnit) {
        return new ScheduledFutureC6905p(new ScheduledFutureC6905p.c() { // from class: w3.h
            @Override // p369w3.ScheduledFutureC6905p.c
            /* renamed from: a */
            public final ScheduledFuture mo28314a(ScheduledFutureC6905p.b bVar) {
                ScheduledFuture m28334t;
                m28334t = ScheduledExecutorServiceC6904o.this.m28334t(callable, j7, timeUnit, bVar);
                return m28334t;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f24780a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f24780a.submit(runnable);
    }
}
