package p038F2;

import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: F2.b */
/* loaded from: classes.dex */
public class ThreadFactoryC0331b implements ThreadFactory {

    /* renamed from: a */
    public final String f1280a;

    /* renamed from: b */
    public final ThreadFactory f1281b = Executors.defaultThreadFactory();

    public ThreadFactoryC0331b(String str) {
        AbstractC3802r.m15130l(str, "Name must not be null");
        this.f1280a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f1281b.newThread(new RunnableC0332c(runnable, 0));
        newThread.setName(this.f1280a);
        return newThread;
    }
}
