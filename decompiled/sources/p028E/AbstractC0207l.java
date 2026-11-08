package p028E;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p042G.AbstractC0343e;
import p042G.InterfaceC0339a;

/* renamed from: E.l */
/* loaded from: classes.dex */
public abstract class AbstractC0207l {

    /* renamed from: E.l$a */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        public String f833a;

        /* renamed from: b */
        public int f834b;

        /* renamed from: E.l$a$a, reason: collision with other inner class name */
        public static class C7164a extends Thread {

            /* renamed from: a */
            public final int f835a;

            public C7164a(Runnable runnable, String str, int i7) {
                super(runnable, str);
                this.f835a = i7;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f835a);
                super.run();
            }
        }

        public a(String str, int i7) {
            this.f833a = str;
            this.f834b = i7;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C7164a(runnable, this.f833a, this.f834b);
        }
    }

    /* renamed from: E.l$b */
    public static class b implements Executor {

        /* renamed from: a */
        public final Handler f836a;

        public b(Handler handler) {
            this.f836a = (Handler) AbstractC0343e.m1353c(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f836a.post((Runnable) AbstractC0343e.m1353c(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f836a + " is shutting down");
        }
    }

    /* renamed from: E.l$c */
    public static class c implements Runnable {

        /* renamed from: a */
        public Callable f837a;

        /* renamed from: b */
        public InterfaceC0339a f838b;

        /* renamed from: c */
        public Handler f839c;

        /* renamed from: E.l$c$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC0339a f840a;

            /* renamed from: b */
            public final /* synthetic */ Object f841b;

            public a(InterfaceC0339a interfaceC0339a, Object obj) {
                this.f840a = interfaceC0339a;
                this.f841b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f840a.accept(this.f841b);
            }
        }

        public c(Handler handler, Callable callable, InterfaceC0339a interfaceC0339a) {
            this.f837a = callable;
            this.f838b = interfaceC0339a;
            this.f839c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f837a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f839c.post(new a(this.f838b, obj));
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m845a(String str, int i7, int i8) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i8, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i7));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static Executor m846b(Handler handler) {
        return new b(handler);
    }

    /* renamed from: c */
    public static void m847c(Executor executor, Callable callable, InterfaceC0339a interfaceC0339a) {
        executor.execute(new c(AbstractC0197b.m799a(), callable, interfaceC0339a));
    }

    /* renamed from: d */
    public static Object m848d(ExecutorService executorService, Callable callable, int i7) {
        try {
            return executorService.submit(callable).get(i7, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw e7;
        } catch (ExecutionException e8) {
            throw new RuntimeException(e8);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
