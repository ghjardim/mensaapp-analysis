package p187a4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p038F2.ThreadFactoryC0331b;
import p204c4.AbstractC3582b;
import p204c4.EnumC3583c;

/* renamed from: a4.n */
/* loaded from: classes.dex */
public abstract class AbstractC3157n {
    /* renamed from: a */
    public static Executor m11551a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0331b(str));
    }

    /* renamed from: b */
    public static Executor m11552b() {
        return m11551a("Firebase-Messaging-File-Io");
    }

    /* renamed from: c */
    public static ScheduledExecutorService m11553c() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0331b("Firebase-Messaging-Init"));
    }

    /* renamed from: d */
    public static ExecutorService m11554d() {
        return AbstractC3582b.m14445a().mo14444a(new ThreadFactoryC0331b("Firebase-Messaging-Intent-Handle"), EnumC3583c.HIGH_SPEED);
    }

    /* renamed from: e */
    public static ExecutorService m11555e() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC0331b("Firebase-Messaging-Network-Io"));
    }

    /* renamed from: f */
    public static ExecutorService m11556f() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC0331b("Firebase-Messaging-Task"));
    }

    /* renamed from: g */
    public static ScheduledExecutorService m11557g() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0331b("Firebase-Messaging-Topics-Io"));
    }
}
