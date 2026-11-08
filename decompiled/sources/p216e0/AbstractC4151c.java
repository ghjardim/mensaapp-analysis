package p216e0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: e0.c */
/* loaded from: classes.dex */
public abstract class AbstractC4151c {

    /* renamed from: e */
    public static Handler f13903e;

    /* renamed from: b */
    public volatile e f13905b = e.PENDING;

    /* renamed from: c */
    public final AtomicBoolean f13906c = new AtomicBoolean();

    /* renamed from: d */
    public final AtomicBoolean f13907d = new AtomicBoolean();

    /* renamed from: a */
    public final FutureTask f13904a = new b(new a());

    /* renamed from: e0.c$a */
    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractC4151c.this.f13907d.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = AbstractC4151c.this.mo17425b();
                Binder.flushPendingCommands();
                return obj;
            } finally {
            }
        }
    }

    /* renamed from: e0.c$b */
    public class b extends FutureTask {
        public b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                AbstractC4151c.this.m17454j(get());
            } catch (InterruptedException e7) {
                Log.w("AsyncTask", e7);
            } catch (CancellationException unused) {
                AbstractC4151c.this.m17454j(null);
            } catch (ExecutionException e8) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e8.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: e0.c$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f13910a;

        public c(Object obj) {
            this.f13910a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4151c.this.m17451d(this.f13910a);
        }
    }

    /* renamed from: e0.c$d */
    public static /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13912a;

        static {
            int[] iArr = new int[e.values().length];
            f13912a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13912a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: e0.c$e */
    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: e */
    public static Handler m17448e() {
        Handler handler;
        synchronized (AbstractC4151c.class) {
            try {
                if (f13903e == null) {
                    f13903e = new Handler(Looper.getMainLooper());
                }
                handler = f13903e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* renamed from: a */
    public final boolean m17449a(boolean z6) {
        this.f13906c.set(true);
        return this.f13904a.cancel(z6);
    }

    /* renamed from: b */
    public abstract Object mo17425b();

    /* renamed from: c */
    public final void m17450c(Executor executor) {
        if (this.f13905b == e.PENDING) {
            this.f13905b = e.RUNNING;
            executor.execute(this.f13904a);
            return;
        }
        int i7 = d.f13912a[this.f13905b.ordinal()];
        if (i7 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i7 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    /* renamed from: d */
    public void m17451d(Object obj) {
        if (m17452f()) {
            mo17426g(obj);
        } else {
            mo17427h(obj);
        }
        this.f13905b = e.FINISHED;
    }

    /* renamed from: f */
    public final boolean m17452f() {
        return this.f13906c.get();
    }

    /* renamed from: g */
    public abstract void mo17426g(Object obj);

    /* renamed from: h */
    public abstract void mo17427h(Object obj);

    /* renamed from: i */
    public void m17453i(Object obj) {
        m17448e().post(new c(obj));
    }

    /* renamed from: j */
    public void m17454j(Object obj) {
        if (this.f13907d.get()) {
            return;
        }
        m17453i(obj);
    }
}
