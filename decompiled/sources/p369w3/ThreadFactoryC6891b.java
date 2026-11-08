package p369w3;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: w3.b */
/* loaded from: classes.dex */
public class ThreadFactoryC6891b implements ThreadFactory {

    /* renamed from: e */
    public static final ThreadFactory f24737e = Executors.defaultThreadFactory();

    /* renamed from: a */
    public final AtomicLong f24738a = new AtomicLong();

    /* renamed from: b */
    public final String f24739b;

    /* renamed from: c */
    public final int f24740c;

    /* renamed from: d */
    public final StrictMode.ThreadPolicy f24741d;

    public ThreadFactoryC6891b(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f24739b = str;
        this.f24740c = i7;
        this.f24741d = threadPolicy;
    }

    /* renamed from: b */
    public final /* synthetic */ void m28313b(Runnable runnable) {
        Process.setThreadPriority(this.f24740c);
        StrictMode.ThreadPolicy threadPolicy = this.f24741d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f24737e.newThread(new Runnable() { // from class: w3.a
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC6891b.this.m28313b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f24739b, Long.valueOf(this.f24738a.getAndIncrement())));
        return newThread;
    }
}
