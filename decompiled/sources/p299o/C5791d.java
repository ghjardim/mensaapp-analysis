package p299o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.d */
/* loaded from: classes.dex */
public class C5791d extends AbstractC5792e {

    /* renamed from: a */
    public final Object f21094a = new Object();

    /* renamed from: b */
    public final ExecutorService f21095b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c */
    public volatile Handler f21096c;

    /* renamed from: o.d$a */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f21097a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f21097a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: o.d$b */
    public static class b {
        /* renamed from: a */
        public static Handler m24460a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: d */
    public static Handler m24459d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m24460a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p299o.AbstractC5792e
    /* renamed from: a */
    public void mo24456a(Runnable runnable) {
        this.f21095b.execute(runnable);
    }

    @Override // p299o.AbstractC5792e
    /* renamed from: b */
    public boolean mo24457b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p299o.AbstractC5792e
    /* renamed from: c */
    public void mo24458c(Runnable runnable) {
        if (this.f21096c == null) {
            synchronized (this.f21094a) {
                try {
                    if (this.f21096c == null) {
                        this.f21096c = m24459d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f21096c.post(runnable);
    }
}
