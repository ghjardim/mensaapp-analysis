package p204c4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: c4.b */
/* loaded from: classes.dex */
public abstract class AbstractC3582b {

    /* renamed from: a */
    public static final InterfaceC3581a f12038a;

    /* renamed from: b */
    public static volatile InterfaceC3581a f12039b;

    /* renamed from: c4.b$b */
    public static class b implements InterfaceC3581a {
        public b() {
        }

        @Override // p204c4.InterfaceC3581a
        /* renamed from: a */
        public ExecutorService mo14444a(ThreadFactory threadFactory, EnumC3583c enumC3583c) {
            return m14446b(1, threadFactory, enumC3583c);
        }

        /* renamed from: b */
        public ExecutorService m14446b(int i7, ThreadFactory threadFactory, EnumC3583c enumC3583c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i7, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        b bVar = new b();
        f12038a = bVar;
        f12039b = bVar;
    }

    /* renamed from: a */
    public static InterfaceC3581a m14445a() {
        return f12039b;
    }
}
