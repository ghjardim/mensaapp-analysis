package org.apache.tika.concurrent;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.tika.concurrent.SimpleThreadPoolExecutor;

/* loaded from: classes2.dex */
public class SimpleThreadPoolExecutor extends ThreadPoolExecutor implements ConfigurableThreadPoolExecutor {
    public SimpleThreadPoolExecutor() {
        super(1, 2, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: k6.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread lambda$new$0;
                lambda$new$0 = SimpleThreadPoolExecutor.lambda$new$0(runnable);
                return lambda$new$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$new$0(Runnable runnable) {
        return new Thread(runnable, "Tika Executor Thread");
    }
}
