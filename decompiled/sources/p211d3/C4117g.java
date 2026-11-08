package p211d3;

import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p256j$.util.Objects;

/* renamed from: d3.g */
/* loaded from: classes.dex */
public final class C4117g {

    /* renamed from: a */
    public String f13816a = null;

    /* renamed from: b */
    public Boolean f13817b = null;

    /* renamed from: c */
    public Integer f13818c = null;

    /* renamed from: d */
    public Thread.UncaughtExceptionHandler f13819d = null;

    /* renamed from: e */
    public ThreadFactory f13820e = null;

    /* renamed from: d3.g$a */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ ThreadFactory f13821a;

        /* renamed from: b */
        public final /* synthetic */ String f13822b;

        /* renamed from: c */
        public final /* synthetic */ AtomicLong f13823c;

        /* renamed from: d */
        public final /* synthetic */ Boolean f13824d;

        /* renamed from: e */
        public final /* synthetic */ Integer f13825e;

        /* renamed from: f */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f13826f;

        public a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f13821a = threadFactory;
            this.f13822b = str;
            this.f13823c = atomicLong;
            this.f13824d = bool;
            this.f13825e = num;
            this.f13826f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f13821a.newThread(runnable);
            Objects.requireNonNull(newThread);
            String str = this.f13822b;
            if (str != null) {
                AtomicLong atomicLong = this.f13823c;
                Objects.requireNonNull(atomicLong);
                newThread.setName(C4117g.m17296d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f13824d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f13825e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13826f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    /* renamed from: c */
    public static ThreadFactory m17295c(C4117g c4117g) {
        String str = c4117g.f13816a;
        Boolean bool = c4117g.f13817b;
        Integer num = c4117g.f13818c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c4117g.f13819d;
        ThreadFactory threadFactory = c4117g.f13820e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* renamed from: d */
    public static String m17296d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* renamed from: b */
    public ThreadFactory m17297b() {
        return m17295c(this);
    }

    /* renamed from: e */
    public C4117g m17298e(boolean z6) {
        this.f13817b = Boolean.valueOf(z6);
        return this;
    }

    /* renamed from: f */
    public C4117g m17299f(String str) {
        m17296d(str, 0);
        this.f13816a = str;
        return this;
    }
}
