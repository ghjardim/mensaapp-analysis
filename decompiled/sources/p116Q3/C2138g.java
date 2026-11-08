package p116Q3;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p116Q3.C2138g;

/* renamed from: Q3.g */
/* loaded from: classes.dex */
public class C2138g {

    /* renamed from: c */
    public final ArrayList f6456c = new ArrayList();

    /* renamed from: b */
    public final ArrayList f6455b = new ArrayList();

    /* renamed from: a */
    public final c f6454a = new c();

    /* renamed from: Q3.g$b */
    public class b {

        /* renamed from: a */
        public final d f6457a;

        /* renamed from: b */
        public final long f6458b;

        /* renamed from: c */
        public final Runnable f6459c;

        /* renamed from: d */
        public ScheduledFuture f6460d;

        /* renamed from: c */
        public void m7245c() {
            C2138g.this.m7242x();
            ScheduledFuture scheduledFuture = this.f6460d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                m7247e();
            }
        }

        /* renamed from: d */
        public final void m7246d() {
            C2138g.this.m7242x();
            if (this.f6460d != null) {
                m7247e();
                this.f6459c.run();
            }
        }

        /* renamed from: e */
        public final void m7247e() {
            AbstractC2133b.m7217d(this.f6460d != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.f6460d = null;
            C2138g.this.m7240v(this);
        }

        /* renamed from: f */
        public final void m7248f(long j7) {
            this.f6460d = C2138g.this.f6454a.schedule(new Runnable() { // from class: Q3.h
                @Override // java.lang.Runnable
                public final void run() {
                    C2138g.b.this.m7246d();
                }
            }, j7, TimeUnit.MILLISECONDS);
        }

        public b(d dVar, long j7, Runnable runnable) {
            this.f6457a = dVar;
            this.f6458b = j7;
            this.f6459c = runnable;
        }
    }

    /* renamed from: Q3.g$c */
    public class c implements Executor {

        /* renamed from: a */
        public final ScheduledThreadPoolExecutor f6462a;

        /* renamed from: b */
        public boolean f6463b;

        /* renamed from: c */
        public final Thread f6464c;

        /* renamed from: Q3.g$c$a */
        public class a extends ScheduledThreadPoolExecutor {

            /* renamed from: a */
            public final /* synthetic */ C2138g f6466a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i7, ThreadFactory threadFactory, C2138g c2138g) {
                super(i7, threadFactory);
                this.f6466a = c2138g;
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            public void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e7) {
                        th = e7.getCause();
                    }
                }
                if (th != null) {
                    C2138g.this.m7239u(th);
                }
            }
        }

        /* renamed from: Q3.g$c$b */
        public class b implements Runnable, ThreadFactory {

            /* renamed from: a */
            public final CountDownLatch f6468a;

            /* renamed from: b */
            public Runnable f6469b;

            public b() {
                this.f6468a = new CountDownLatch(1);
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                AbstractC2133b.m7217d(this.f6469b == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f6469b = runnable;
                this.f6468a.countDown();
                return c.this.f6464c;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f6468a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f6469b.run();
            }
        }

        public c() {
            b bVar = new b();
            Thread newThread = Executors.defaultThreadFactory().newThread(bVar);
            this.f6464c = newThread;
            newThread.setName("FirestoreWorker");
            newThread.setDaemon(true);
            newThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: Q3.i
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    C2138g.c.this.m7265s(thread, th);
                }
            });
            a aVar = new a(1, bVar, C2138g.this);
            this.f6462a = aVar;
            aVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
            this.f6463b = false;
        }

        /* renamed from: q */
        public static /* synthetic */ Void m7259q(Runnable runnable) {
            runnable.run();
            return null;
        }

        /* renamed from: r */
        public static /* synthetic */ void m7260r(TaskCompletionSource taskCompletionSource, Callable callable) {
            try {
                taskCompletionSource.setResult(callable.call());
            } catch (Exception e7) {
                taskCompletionSource.setException(e7);
                throw new RuntimeException(e7);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            if (!this.f6463b) {
                this.f6462a.execute(runnable);
            }
        }

        /* renamed from: l */
        public final synchronized Task m7261l(final Runnable runnable) {
            if (!m7264p()) {
                Task m7262m = m7262m(new Callable() { // from class: Q3.j
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Void m7259q;
                        m7259q = C2138g.c.m7259q(runnable);
                        return m7259q;
                    }
                });
                this.f6463b = true;
                return m7262m;
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }

        /* renamed from: m */
        public final Task m7262m(final Callable callable) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                execute(new Runnable() { // from class: Q3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2138g.c.m7260r(TaskCompletionSource.this, callable);
                    }
                });
            } catch (RejectedExecutionException unused) {
                AbstractC2155x.m7313e(C2138g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return taskCompletionSource.getTask();
        }

        /* renamed from: n */
        public void m7263n(Runnable runnable) {
            try {
                this.f6462a.execute(runnable);
            } catch (RejectedExecutionException unused) {
                AbstractC2155x.m7313e(C2138g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
        }

        /* renamed from: p */
        public final synchronized boolean m7264p() {
            return this.f6463b;
        }

        /* renamed from: s */
        public final /* synthetic */ void m7265s(Thread thread, Throwable th) {
            C2138g.this.m7239u(th);
        }

        public final synchronized ScheduledFuture schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
            if (this.f6463b) {
                return null;
            }
            return this.f6462a.schedule(runnable, j7, timeUnit);
        }

        public final void setCorePoolSize(int i7) {
            this.f6462a.setCorePoolSize(i7);
        }

        /* renamed from: t */
        public final void m7266t() {
            this.f6462a.shutdownNow();
        }
    }

    /* renamed from: Q3.g$d */
    public enum d {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    /* renamed from: g */
    public static Task m7225g(final Executor executor, final Callable callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: Q3.e
            @Override // java.lang.Runnable
            public final void run() {
                C2138g.m7227r(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: q */
    public static /* synthetic */ Void m7226q(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    /* renamed from: r */
    public static /* synthetic */ void m7227r(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: Q3.f
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Void m7226q;
                    m7226q = C2138g.m7226q(TaskCompletionSource.this, task);
                    return m7226q;
                }
            });
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        } catch (Throwable th) {
            taskCompletionSource.setException(new IllegalStateException("Unhandled throwable in callTask.", th));
        }
    }

    /* renamed from: s */
    public static /* synthetic */ Void m7228s(Runnable runnable) {
        runnable.run();
        return null;
    }

    /* renamed from: t */
    public static /* synthetic */ void m7229t(Throwable th) {
        if (!(th instanceof OutOfMemoryError)) {
            throw new RuntimeException("Internal error in Cloud Firestore (25.1.3).", th);
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (25.1.3) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
        outOfMemoryError.initCause(th);
        throw outOfMemoryError;
    }

    /* renamed from: h */
    public final b m7230h(d dVar, long j7, Runnable runnable) {
        b bVar = new b(dVar, System.currentTimeMillis() + j7, runnable);
        bVar.m7248f(j7);
        return bVar;
    }

    /* renamed from: i */
    public Task m7231i(final Runnable runnable) {
        return m7232j(new Callable() { // from class: Q3.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m7228s;
                m7228s = C2138g.m7228s(runnable);
                return m7228s;
            }
        });
    }

    /* renamed from: j */
    public Task m7232j(Callable callable) {
        return this.f6454a.m7262m(callable);
    }

    /* renamed from: k */
    public b m7233k(d dVar, long j7, Runnable runnable) {
        if (this.f6456c.contains(dVar)) {
            j7 = 0;
        }
        b m7230h = m7230h(dVar, j7, runnable);
        this.f6455b.add(m7230h);
        return m7230h;
    }

    /* renamed from: l */
    public void m7234l(Runnable runnable) {
        m7231i(runnable);
    }

    /* renamed from: m */
    public void m7235m(Runnable runnable) {
        this.f6454a.m7263n(runnable);
    }

    /* renamed from: n */
    public Task m7236n(Runnable runnable) {
        return this.f6454a.m7261l(runnable);
    }

    /* renamed from: o */
    public Executor m7237o() {
        return this.f6454a;
    }

    /* renamed from: p */
    public boolean m7238p() {
        return this.f6454a.m7264p();
    }

    /* renamed from: u */
    public void m7239u(final Throwable th) {
        this.f6454a.m7266t();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Q3.c
            @Override // java.lang.Runnable
            public final void run() {
                C2138g.m7229t(th);
            }
        });
    }

    /* renamed from: v */
    public final void m7240v(b bVar) {
        AbstractC2133b.m7217d(this.f6455b.remove(bVar), "Delayed task not found.", new Object[0]);
    }

    /* renamed from: w */
    public void m7241w() {
        this.f6454a.setCorePoolSize(0);
    }

    /* renamed from: x */
    public void m7242x() {
        Thread currentThread = Thread.currentThread();
        if (this.f6454a.f6464c != currentThread) {
            throw AbstractC2133b.m7214a("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.f6454a.f6464c.getName(), Long.valueOf(this.f6454a.f6464c.getId()), currentThread.getName(), Long.valueOf(currentThread.getId()));
        }
    }
}
