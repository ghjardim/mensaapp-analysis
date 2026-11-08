package p021D;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p042G.AbstractC0343e;

/* renamed from: D.h */
/* loaded from: classes.dex */
public abstract class AbstractC0100h {

    /* renamed from: D.h$a */
    public static class a implements Executor {

        /* renamed from: a */
        public final Handler f332a;

        public a(Handler handler) {
            this.f332a = (Handler) AbstractC0343e.m1353c(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f332a.post((Runnable) AbstractC0343e.m1353c(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f332a + " is shutting down");
        }
    }

    /* renamed from: a */
    public static Executor m261a(Handler handler) {
        return new a(handler);
    }
}
